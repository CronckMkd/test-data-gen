package com.nv.tech.commons.test.utils.providers;

class Utils {
    static void checkCount(final int count) {
        if (count < 1) {
            throw new IllegalArgumentException("Count can not be less then 1.");
        }
    }
}
