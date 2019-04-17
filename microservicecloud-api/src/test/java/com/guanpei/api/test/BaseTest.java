//package com.guanpei.api.test;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
////由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
//@WebAppConfiguration
//@AutoConfigureMockMvc
//public class BaseTest {
//
//    @Autowired
//    public MockMvc mockMvc;
//
//    @Before
//    public void init() {
//        System.out.println("开始测试-----------------");
//    }
//
//    @After
//    public void after() {
//        System.out.println("测试结束-----------------");
//    }
//}
