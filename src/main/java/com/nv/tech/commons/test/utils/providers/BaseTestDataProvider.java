package com.nv.tech.commons.test.utils.providers;

import com.nv.tech.commons.test.utils.Buildable;
import com.nv.tech.commons.test.utils.TestDataBuilder;

import java.util.logging.Level;
import java.util.logging.Logger;

import static com.nv.tech.commons.test.utils.providers.CounterHolder.*;

public interface BaseTestDataProvider extends Buildable {

    default TestDataBuilder<String> $string() {
        return () -> "String-".concat(Long.valueOf(STRING_COUNTER.getAndIncrement()).toString());
    }

    default TestDataBuilder<Long> $long() {
        return LONG_COUNTER::getAndIncrement;
    }

    default TestDataBuilder<Integer> $integer() {
        return INTEGER_COUNTER::getAndIncrement;
    }

    default TestDataBuilder<Byte> $byte() {
        return () -> BYTE_COUNTER.getAndUpdate(currentByte -> {
            if (currentByte == 127) {
                Logger.getLogger(BaseTestDataProvider.class.getSimpleName()).log(Level.INFO, "Byte counter will restart");
                return Byte.MIN_VALUE;
            }
            return (byte) (currentByte + 1);
        });
    }

    default TestDataBuilder<Double> $double() {
        return () -> DOUBLE_COUNTER.getAndUpdate(currentDouble -> currentDouble++);
    }

    default TestDataBuilder<Float> $float() {
        return () -> FLOAT_COUNTER.getAndUpdate(currentFloat -> currentFloat++);
    }
}
