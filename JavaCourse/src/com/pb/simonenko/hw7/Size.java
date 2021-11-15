package com.pb.simonenko.hw7;

public enum Size {
    XXS, XS, S, M, L;
    static String getDescription(Size code)
    {
        if(code==XXS)
            return "Детский размер";
        else return "Взрослый размер";
    }
}
