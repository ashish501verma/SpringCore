package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.ContextResource;

import java.applet.AppletContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

        /* it is Eager Loading concept it will load automatically without any request */
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("Beans.xml");
//            Car bean = applicationContext.getBean(Car.class);
//           bean.drive();
        /* BeanFactory Follow Lazy Loading Concept that means when we request then only it will create Bean Object*/
       // BeanFactory beanFactory= new XmlBeanFactory(new ClassPathResource("Beans.xml"));
        /*without below line of code Bean Factory will not do anything since it is lazy Loading so we have to request
        as below*/
      //  Car bean = beanFactory.getBean(Car.class);


    }
}
