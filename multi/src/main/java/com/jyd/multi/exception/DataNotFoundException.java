package com.jyd.multi.exception;

public class DataNotFoundException extends Exception
{
    public DataNotFoundException(final String msg) {
        super(msg);
    }
    
    public DataNotFoundException(final String msg, final Throwable e) {
        super(msg, e);
    }
}