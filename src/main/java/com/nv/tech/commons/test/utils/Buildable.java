package com.nv.tech.commons.test.utils;

public interface Buildable {
    default <T> T some(TestDataBuilder<T> builder) {
        return builder.build();
    }
}
