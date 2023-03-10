package com.pb.simonenko.hw8;

public class WrongLoginException extends Exception{
    public WrongLoginException()
    {
    }

    public WrongLoginException(String ex)
    {
        super(ex);
    }
}
