package com.nv.tech.commons.test.utils.collections;

import com.nv.tech.commons.test.utils.TestDataBuilder;

import java.util.Stack;

public class BuildableStack<Type> extends Stack<Type> implements TestDataBuilder<Stack<Type>> {

    public BuildableStack() {
        super();
    }

    public BuildableStack(final int count, final TestDataBuilder<Type> builder) {
        super();
        for (int i = 0; i < count; i++) {
            this.push(builder.build());
        }
    }

    public BuildableStack<Type> $with(final TestDataBuilder<Type> builder) {
        return this.$with(builder.build());
    }

    private BuildableStack<Type> $with(final Type data) {
        this.add(data);
        return this;
    }

    @Override
    public Stack<Type> build() {
        return this;
    }
}
