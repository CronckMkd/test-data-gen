package com.nv.tech.commons.test.utils.providers;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

class CounterHolder {

    static final AtomicLong STRING_COUNTER = new AtomicLong(Long.MIN_VALUE);

    static final AtomicLong LONG_COUNTER = new AtomicLong(Long.MIN_VALUE);
    static final AtomicInteger INTEGER_COUNTER = new AtomicInteger(Integer.MIN_VALUE);
    static final AtomicReference<Byte> BYTE_COUNTER = new AtomicReference<>(Byte.MIN_VALUE);

    static final AtomicReference<Double> DOUBLE_COUNTER = new AtomicReference<>(Double.MIN_VALUE);
    static final AtomicReference<Float> FLOAT_COUNTER = new AtomicReference<>(Float.MIN_VALUE);

}
