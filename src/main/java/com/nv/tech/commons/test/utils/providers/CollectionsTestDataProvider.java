package com.nv.tech.commons.test.utils.providers;


import com.nv.tech.commons.test.utils.Buildable;
import com.nv.tech.commons.test.utils.TestDataBuilder;
import com.nv.tech.commons.test.utils.collections.*;

import static com.nv.tech.commons.test.utils.providers.Utils.checkCount;

public interface CollectionsTestDataProvider extends Buildable {

    default <Type> BuildableList<Type> $emptyList() {
        return new BuildableList<Type>();
    }

    default <Type> BuildableList<Type> $list(final int count, final TestDataBuilder<Type> builder) {
        checkCount(count);
        return new BuildableList<Type>(count, builder);
    }

    default <KeyType, ValueType> BuildableMap<KeyType, ValueType> $emptyMap() {
        return new BuildableMap<KeyType, ValueType>();
    }

    default <KeyType, ValueType> BuildableMap<KeyType, ValueType> $map(final int count, final TestDataBuilder<KeyType> keyBuilder, final TestDataBuilder<ValueType> valueBuilder) {
        checkCount(count);
        return new BuildableMap<KeyType, ValueType>(count, keyBuilder, valueBuilder);
    }

    default <Type> BuildableQueue<Type> $emptyQueue() {
        return new BuildableQueue<Type>();
    }

    default <Type> BuildableQueue<Type> $queue(final int count, final TestDataBuilder<Type> builder) {
        checkCount(count);
        return new BuildableQueue<Type>(count, builder);
    }

    default <Type> BuildableSet<Type> $emptySet() {
        return new BuildableSet<Type>();
    }

    default <Type> BuildableSet<Type> $set(final int count, final TestDataBuilder<Type> builder) {
        checkCount(count);
        return new BuildableSet<>(count, builder);
    }

    default <Type> BuildableStack<Type> $emptyStack() {
        return new BuildableStack<Type>();
    }

    default <Type> BuildableStack<Type> $stack(final int count, final TestDataBuilder<Type> builder) {
        checkCount(count);
        return new BuildableStack<Type>(count, builder);
    }
}
