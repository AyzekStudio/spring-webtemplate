package com.ayzekstudio.template.webtemplate.config.core;

import com.ayzekstudio.template.webtemplate.WebtemplateApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(WebtemplateApplication.class);
	}

}
