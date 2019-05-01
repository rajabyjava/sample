package com.app;

public class Raja {
	Raja(){
		System.out.println("parent const");
	}
	static{ System.out.println("parent block");}
	
		
	}
class Prem extends Raja{
Prem(){
		System.out.println("child const");
	}
	static{ System.out.println("child block");}
	
		
	}
	class Test{
		public static void main(String[] args) {
			Raja p=new Raja();
		}
	}

