package com.scd.modules.system.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.core.enums.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;


public enum SexEnum{
    MAN("男"),
    WOMAN( "女");

    @EnumValue
    @JsonValue
    private String value;

    SexEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
