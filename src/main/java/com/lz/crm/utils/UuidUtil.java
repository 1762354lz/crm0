package com.lz.crm.utils;

import java.util.UUID;

public class UuidUtil {
    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-","");
    }
}
