package com.catface996.mysql.http.config.swagger;

import com.catface996.common.enums.common.EnvironmentConst;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author catface
 * @date 2018/3/6
 */
@Configuration
@EnableSwagger2
@Profile({EnvironmentConst.LOCAL, EnvironmentConst.DEV})
public class Swagger2Config {

	@Bean
	public Docket createRestWebApi() {
		return new Docket(DocumentationType.SWAGGER_2)
						.groupName("web.catface996.mysql")
						.apiInfo(apiInfo())
						.select()
						// 扫描的包所在位置
						.apis(RequestHandlerSelectors.basePackage("com.catface996.mysql.http.web"))
						// 扫描的 URL 规则
						.paths(PathSelectors.any())
						.build();
	}

	@Bean
	public Docket createRestRpcApi() {
		return new Docket(DocumentationType.SWAGGER_2)
						.groupName("rpc.catface996.mysql")
						.apiInfo(apiInfo())
						.select()
						// 扫描的包所在位置
						.apis(RequestHandlerSelectors.basePackage("com.catface996.mysql.http.rpc"))
						// 扫描的 URL 规则
						.paths(PathSelectors.any())
						.build();
	}

	private ApiInfo apiInfo() {
		// 联系信息
		return new ApiInfoBuilder()
						// 大标题
						.title("catface996")
						// 描述
						.description("catface996")
						// 版本
						.version("0.0.1-SNAPSHOT")
						.build();
	}
}
