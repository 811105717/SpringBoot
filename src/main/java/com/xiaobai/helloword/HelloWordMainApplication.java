package com.xiaobai.helloword;

/**
 * @author xiaobai
 * @Date: 2019/5/3 22:39
 * @email:
 * @address:
 * @Version 1.0
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBootApplication 来标注一个主程序类  说明这是一个springboot程序
 * @author xiaobai
 */
@SpringBootApplication
@SuppressWarnings("ALL")
public class HelloWordMainApplication {

    public static void main(String[] args) {
        //启动springboot应用
        SpringApplication.run(HelloWordMainApplication.class,args);

    }
}
