package springinnerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springinnerbean.HelloWorld;

public class main {
public static void main(String[] args)
{
	ApplicationContext context = new ClassPathXmlApplicationContext("springinnerbean/applicationContext.xml");
	HelloWorld helloWorld =(HelloWorld)context.getBean("helloWorldBean");
	System.out.println(helloWorld);
}
}
