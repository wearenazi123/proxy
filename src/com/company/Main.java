package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SimpleProxyDemo.consumer(new RealObject());
        SimpleProxyDemo.consumer(new SimpleProxy(new RealObject()));
    }
}
