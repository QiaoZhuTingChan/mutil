package com.jyd.multi.exception;

public class CommitException extends Exception
{
    public CommitException(final String msg) {
        super(msg);
    }
    
    public CommitException(final String msg, final Throwable e) {
        super(msg, e);
    }
}
