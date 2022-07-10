package com.nv.tech.commons.test.utils.collections;

import com.nv.tech.commons.test.utils.TestDataBuilder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BuildableList<Type> extends ArrayList<Type> implements TestDataBuilder<List<Type>> {

    public BuildableList() {
        super();
    }

    public BuildableList(int initialCapacity) {
        super(initialCapacity);
    }

    public BuildableList(Collection<? extends Type> collection) {
        super(collection);
    }

    public BuildableList(final int count, TestDataBuilder<Type> builder) {
        super();
        for (int i = 0; i < count; i++) {
            this.add(builder.build());
        }
    }

    public BuildableList<Type> $with(TestDataBuilder<Type> data) {
        return this.$with(data.build());
    }

    public BuildableList<Type> $with(Type data){
        this.add(data);
        return this;
    }

    @Override
    public List<Type> build() {
        return this;
    }
}
