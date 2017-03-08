package tn.enis.config;

import javax.swing.filechooser.FileView;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles2.TilesConfigurer;
@EnableWebMvc
@ComponentScan(basePackages= {"tn.enis"})
public class WebAppConfig  extends WebMvcConfigurerAdapter{

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	@Bean
	public UrlBasedViewResolver viewResolver()
	{
		UrlBasedViewResolver viewResolver=new UrlBasedViewResolver();
		viewResolver.setViewClass(FileView.class);
		return viewResolver;
	}
	@Bean
	public TilesConfigurer tilesConfigurer()
	{
		TilesConfigurer tilesConfigurer= new TilesConfigurer();
		tilesConfigurer.setDefinitions(new String[]{
				"/WEB-INF/layouts/layouts.xml",
				"/WEB-INF/views/**/views.xml"
		}
				);
		tilesConfigurer.setCheckRefresh(true);
		return tilesConfigurer;
		
	}
}
