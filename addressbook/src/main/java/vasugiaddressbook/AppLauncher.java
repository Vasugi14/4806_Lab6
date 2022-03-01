package vasugiaddressbook;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class AppLauncher {

    public static void main(String[] args) {
        String[] contextPaths = new String[]{"app.xml"};
        new ClassPathXmlApplicationContext(contextPaths);
    }
}
