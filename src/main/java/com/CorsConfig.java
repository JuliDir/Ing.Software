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
        registry.addMapping("/api/**")  // Mapea la ruta para la cual se habilita CORS
                .allowedOrigins("*")  // Permite solicitudes desde todos los orígenes
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Métodos permitidos
                .allowedHeaders("Content-Type", "Authorization")  // Encabezados permitidos
                .exposedHeaders("Custom-Header") // Encabezados expuestos
                .allowCredentials(true);  // Permite el envío de cookies
    }
}
