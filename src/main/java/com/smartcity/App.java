package com.smartcity;

import com.smartcity.entity.Request;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RequestBuilder builder = new RequestBuilder();

        while(true){
            builder.newRequest();
        }
    }
}
