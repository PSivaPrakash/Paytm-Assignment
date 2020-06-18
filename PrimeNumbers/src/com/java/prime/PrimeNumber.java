package com.java.prime;

public class PrimeNumber {
	public static void main(String[] args) {
		 boolean isPrime = true;
		        int[] intArray =new int[100];
		 //p
		        int j=1;
		        intArray[0]=2;
		        for (int i = 3; j < 100; i++) {
		            isPrime = prime(i);
		            if (isPrime) {
		            	intArray[j]=i;
		               j++;
		            			}
		        		}
		        for(int i=0;i<intArray.length;i++)
		        	System.out.println(intArray[i]);
		        
		    }
		    public static boolean prime(int no) {
		        int rem;
		        for (int i = 2; i <= no / 2; i++) {
		            rem = no % i;
		            if (rem == 0) {
		                return false;
		            }
		        	}
		        	return true;
		 
		    }
		 
		}


