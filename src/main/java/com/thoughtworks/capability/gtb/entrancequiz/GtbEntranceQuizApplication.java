package com.thoughtworks.capability.gtb.entrancequiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// TODO GTB-工程实践: * 分包合理
// TODO GTB-工程实践: * 提交不够小步
// TODO GTB-知识点: * 了解下Restful实践
// TODO GTB-知识点: * 使用了三层架构
// TODO GTB-知识点: * 了解下lombok的使用
// TODO GTB-知识点: * 需要了解Spring IoC和依赖注入
// TODO GTB-完成度: * 缺少分组逻辑的实现
// TODO GTB-工程实践: * 注意单一职责，group和Student应该有单独的Controller和Service
// TODO GTB-测试: * 无测试
@SpringBootApplication
public class GtbEntranceQuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(GtbEntranceQuizApplication.class, args);
	}

}
