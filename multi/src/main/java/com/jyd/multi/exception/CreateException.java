package com.jyd.multi.exception;

public class CreateException extends Exception
{
    public CreateException(final String msg) {
        super(msg);
    }
    
    public CreateException(final String msg, final Throwable e) {
        super(msg, e);
    }
}
