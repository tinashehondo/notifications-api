package uk.co.tinashehondo.notifications.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import uk.co.tinashehondo.notifications.rest.api.NotificationApi;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class,
        scanBasePackages = { "uk.co.tinashehondo.notifications.rest"})
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new SpringApplicationBuilder(App.class)
                .registerShutdownHook(true).run(args);
        NotificationApi notificationApiController = context.getBean(NotificationApi.class);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>> {}"+notificationApiController); //forgive sys.out here
    }
}
