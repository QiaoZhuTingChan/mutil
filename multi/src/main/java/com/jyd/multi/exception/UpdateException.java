package com.jyd.multi.exception;

public class UpdateException extends Exception
{
    public UpdateException(final String msg) {
        super(msg);
    }
    
    public UpdateException(final String msg, final Throwable e) {
        super(msg, e);
    }
}
