package com.niit.backend;

import java.util.Scanner;

import com.niit.config.DBConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	DBConfig dbConfig=new DBConfig();
        dbConfig.sessionFactory();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice: 1.User  2.Job 3.BlogPost 4.BlogPostLikes 5.BlogPostComment 6.Notification 7.Friend");
        int choice=sc.nextInt();
        switch(choice)
        {
        case 1:
        {
        	UserMain userMain=new UserMain();
        userMain.userOut();
        break;
    }
        
        case 2:
        {
        	JobMain jobMain=new JobMain();
        jobMain.jobOut();
        break;
        }
    case 3:
    {
    	BlogMain blogMain=new BlogMain();
    blogMain.blogOut();
    break;
}
    default:
     	System.out.println("Please enter valid input");
    }
    
 
        }
        
    }

