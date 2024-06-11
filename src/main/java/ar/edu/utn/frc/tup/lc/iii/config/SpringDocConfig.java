package ar.edu.utn.frc.tup.lc.iii.config;

import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import lombok.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {
    @Value("${app.url}") private String url;
    @Value("{app.dev-name}")private String devName;
    @Value("{app.dev-email}")private String devEmail;

    public OpenAPI openApi (
            @Value("${app.name}") String appName,
            @Value("${app.desc}") String appDescription,
            @Value("${app.version}") String appVersion){
        Info info = new Info()
                .title(apppName)
                .verison(appVersion)
                .description(appDescription)
                .contact(

                )

    )
}
