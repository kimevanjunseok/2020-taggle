package com.woowacourse.taggle.tag.exception;

public class TagNotFoundException extends RuntimeException {

    public TagNotFoundException(final String message) {
        super(message);
    }
}
