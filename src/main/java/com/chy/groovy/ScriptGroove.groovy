package com.chy.groovy

import com.alibaba.fastjson.JSON
import com.alibaba.fastjson.TypeReference

void print() {
    System.out.println("没有参数!!!!");
}

List<String> printArgs(String str1, String str2, String str3) {
    String jsonString = "[\"" + str1 + "\",\"" + str2 + "\",\"" + str3 + "\"]";
    return JSON.parseObject(jsonString, new TypeReference<List<String>>() {});
}
