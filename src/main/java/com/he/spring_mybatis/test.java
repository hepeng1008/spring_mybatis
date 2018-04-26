package com.he.spring_mybatis;

public class test {
    public static void main(String[] args) {
        StackTraceElement[] stackTrace = new RuntimeException().getStackTrace();
        for(StackTraceElement element:stackTrace){
            if("main".equals(element.getMethodName())){
                System.out.println(element.getClassName());
            }
        }
    }
}
