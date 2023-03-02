package com.apun.Project;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.apun.Project.Coder.PetrolStation;
import com.apun.Project.Coder.DieselStation;

public class Car 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Car!" );
        System.out.println("  ");
        // Create spring container
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/apun/Project/Coder/ApplicationConfi.xml");
    
    // get bean and use it
    
        PetrolStation p=(PetrolStation)context.getBean("Petrol_Statiion");
        System.out.println(p.giveMeFuel());
        System.out.println("State-> "+p.getState());
        System.out.println("City-> "+p.getCity());
        System.out.println("Price-> "+p.getPrice()+" Rs.");
          System.out.println("------------------------");
       DieselStation d=context.getBean(DieselStation.class, "Diesel_Station");
        System.out.println(d.giveMeFuel());
        System.out.println("State-> "+d.getState());
        System.out.println("City-> "+d.getCity());
        System.out.println("Price-> "+d.getPrice()+" Rs.");
        System.out.println();
       
     
   
    }
}