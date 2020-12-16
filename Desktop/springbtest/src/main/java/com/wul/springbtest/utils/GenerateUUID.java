package com.wul.springbtest.utils;

import java.util.UUID;

public class GenerateUUID {
    private String uuid;

    public String getUuid(){
        uuid = UUID.randomUUID().toString().replace("-","").toUpperCase();
        return uuid;
    }


}
