package com.chy;

import groovy.lang.Binding;
import groovy.util.GroovyScriptEngine;
import groovy.util.ResourceException;
import groovy.util.ScriptException;

import java.io.IOException;

public class GroovyScriptEngineApp {

    public static void main(String[] args) {
        try {
            // GroovyScriptEngine的根路径，如果参数是字符串数组，说明有多个根路径
            GroovyScriptEngine engine = new GroovyScriptEngine("D:\\workspace\\groovy\\TestGroovy\\src\\main\\java\\com\\chy\\groovy");

            Binding binding1 = new Binding();
            Object result1 = engine.run("FunGroove.groovy", binding1);
            if (null != result1) {
                System.out.println(result1);
            }

            System.out.println("===================================");

            Binding binding2 = new Binding();
            // arg 和 参数同名
            binding2.setVariable("arg", "测试参数");
            Object result2 = engine.run("FunArgGroove.groovy", binding2);
            System.out.println(result2);

        } catch (ResourceException | IOException | ScriptException e) {
            e.printStackTrace();
        }
    }

}
