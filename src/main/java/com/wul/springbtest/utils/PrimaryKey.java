package com.wul.springbtest.utils;

import java.util.UUID;

public class PrimaryKey {

    public String random() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
