package com.nv.tech.commons.test.utils.collections;

import com.nv.tech.commons.test.utils.TestDataBuilder;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class BuildableSet<Type> extends HashSet<Type> implements TestDataBuilder<Set<Type>> {

    public BuildableSet() {
    }

    public BuildableSet(Collection<? extends Type> collection) {
        super(collection);
    }

    public BuildableSet(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    public BuildableSet(int initialCapacity) {
        super(initialCapacity);
    }

    public BuildableSet(final int count, final TestDataBuilder<Type> builder) {
        for (int i = 0; i < count; i++) {
            this.add(builder.build());
        }
    }

    public BuildableSet<Type> $with(TestDataBuilder<Type> builder) {
        return this.$with(builder.build());
    }

    public BuildableSet<Type> $with(Type data) {
        this.add(data);
        return this;
    }

    @Override
    public Set<Type> build() {
        return this;
    }
}
