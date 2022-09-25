package com.nv.tech.commons.test.utils.collections;

import com.nv.tech.commons.test.utils.TestDataBuilder;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

public class BuildableQueue<Type> extends ArrayDeque<Type> implements TestDataBuilder<Queue<Type>> {

    public BuildableQueue() {
    }

    public BuildableQueue(int numElements) {
        super(numElements);
    }

    public BuildableQueue(Collection<? extends Type> collection) {
        super(collection);
    }

    public BuildableQueue(int count, TestDataBuilder<Type> builder) {
        for (int i = 0; i < count; i++) {
            this.addFirst(builder.build());
        }
    }

    public BuildableQueue<Type> $withFirst(TestDataBuilder<Type> builder) {
        return this.$withFirst(builder.build());
    }

    public BuildableQueue<Type> $withFirst(Type data) {
        this.addFirst(data);
        return this;
    }

    public BuildableQueue<Type> $withLast(TestDataBuilder<Type> builder) {
        return this.$withLast(builder.build());
    }

    public BuildableQueue<Type> $withLast(Type data) {
        this.addLast(data);
        return this;
    }

    @Override
    public Queue<Type> build() {
        return this;
    }
}
