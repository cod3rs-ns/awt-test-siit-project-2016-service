package rs.acs.uns.sw.sct.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * Configuration class for adding new property file
 */
@Configuration
@PropertySources({
        @PropertySource("classpath:upload.properties")
})
public class AppConfiguration {
}
