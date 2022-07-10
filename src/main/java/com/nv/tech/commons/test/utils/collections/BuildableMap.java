package com.nv.tech.commons.test.utils.collections;

import com.nv.tech.commons.test.utils.TestDataBuilder;

import java.util.HashMap;
import java.util.Map;

public class BuildableMap<KeyType, ValueType> extends HashMap<KeyType, ValueType> implements TestDataBuilder<Map<KeyType, ValueType>> {

    public BuildableMap() {
    }

    public BuildableMap(int initialCapacity) {
        super(initialCapacity);
    }

    public BuildableMap(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    public BuildableMap(Map<? extends KeyType, ? extends ValueType> m) {
        super(m);
    }

    public BuildableMap(int count, TestDataBuilder<KeyType> keyBuilder, TestDataBuilder<ValueType> valueBuilder) {
        for (int i = 0; i < count; i++) {
            this.put(keyBuilder.build(), valueBuilder.build());
        }
    }

    public BuildableMap<KeyType, ValueType> $with(final KeyType key, final ValueType value) {
        this.put(key, value);
        return this;
    }

    public BuildableMap<KeyType, ValueType> $with(final TestDataBuilder<KeyType> key, final ValueType value) {
        return this.$with(key.build(), value);
    }

    public BuildableMap<KeyType, ValueType> $with(final KeyType key, final TestDataBuilder<ValueType> value) {
        return this.$with(key, value.build());
    }

    public BuildableMap<KeyType, ValueType> $with(final TestDataBuilder<KeyType> key, final TestDataBuilder<ValueType> value) {
        return this.$with(key.build(), value.build());
    }

    @Override
    public Map<KeyType, ValueType> build() {
        return this;
    }
}
