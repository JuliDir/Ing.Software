package com;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Configures CORS (Cross-Origin Resource Sharing) mappings for the application.
 * This method allows you to specify which origins, methods, and headers are allowed
 * for cross-origin requests.
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/*")  // Map the path you want to enable CORS for
                .allowedOrigins("")  // Allow requests from all origins
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Allowed methods
                .allowedHeaders("Content-Type", "Authorization");  // Allowed headers
    }
}
