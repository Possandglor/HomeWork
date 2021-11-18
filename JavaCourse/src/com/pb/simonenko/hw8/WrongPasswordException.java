package com.pb.simonenko.hw8;

public class WrongPasswordException extends Exception {

    public WrongPasswordException()
    {
    }

    public WrongPasswordException(String ex)
    {
        super(ex);
    }
}
