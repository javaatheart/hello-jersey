package com.hellojersery;

import com.sun.jersey.api.core.PackagesResourceConfig;


public class Application  extends PackagesResourceConfig {

	public Application() {

		super("com.hellojersery");
		System.out.println("This is called during the start up");
	}
}