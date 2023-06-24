package javaApp.dev;

import java.util.Scanner;

public class Exercise11 {
	public enum Category {
		PLATINUM,
		GOLD,
		SILVER,
		NORMAL
		}

	public static class customer {

		public static float TotalInvoice(float invoice, Category  cust_typ) {
    		switch (cust_typ) {
    		case PLATINUM :
    		{
    			invoice = invoice - ((invoice * 0.25f));
    			return invoice;
    		}
    		case GOLD :
    		{
    			invoice = invoice - ((invoice * 0.15f));
    			return invoice;
    		}
    		case SILVER :
    		{
    			invoice = invoice - ((invoice * 0.5f));
    			return invoice;
    		}
    		case NORMAL :
    			return invoice;
    		default  :
    			return 0f;
    		}
    		
    	}
	}

	public static void main(String[] args) {
		String cust_typ;
		float amt, total_pay;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter customer category  : ");
		cust_typ = in.nextLine().toString().toUpperCase();
		System.out.print("Enter amount  : ");
		amt = in.nextFloat();
		in.nextLine();
		
		Category  cust_plat = Category.PLATINUM,
				  cust_gold = Category.GOLD,
				  cust_sil  = Category.SILVER,
				  cust_nor  = Category.NORMAL;
		
		System.out.println("=========== If condition============");
		String cust_type = cust_typ.toUpperCase();
//	    System.out.println("cust_typ = "+ cust_typ.toString());
//	    System.out.println("Catagory = " + cust_plat.PLATINUM);
		if (cust_typ.contentEquals(cust_plat.toString())) {
			total_pay =	customer.TotalInvoice(amt,cust_plat);
			System.out.print("Customer type " + cust_plat);
			System.out.printf(" amount =  % ,.3f ", amt);
			System.out.printf("Total pay = % ,.3f", total_pay);
			
		} 
		else
			if (cust_typ.contentEquals(cust_gold.toString())) {
				total_pay =	customer.TotalInvoice(amt,cust_gold);
				System.out.print("Customer type " + cust_gold);
				System.out.printf(" amount =  % ,.3f ", amt);
				System.out.printf("Total pay = % ,.3f", total_pay);
			}
			else
				if (cust_typ.contentEquals(cust_sil.toString())) {
					total_pay =	customer.TotalInvoice(amt,cust_sil);
					System.out.print("Customer type " + cust_sil);
					System.out.printf(" amount =  % ,.3f ", amt);
					System.out.printf("Total pay = % ,.3f", total_pay);
				}
				else
					if (cust_typ.contentEquals(cust_nor.toString())) {
						total_pay =	customer.TotalInvoice(amt,cust_nor);
						System.out.print("Customer type " + cust_nor);
						System.out.printf(" amount =  % ,.3f ", amt);
						System.out.printf("Total pay = % ,.3f", total_pay);
					}
					else
						System.out.println("Invalid customer type !");
		System.out.println();
		System.out.println("======== Switch Condition==================");
		Category cust = Category.valueOf(cust_typ.toString());
		switch (cust) {
		case PLATINUM :
		{
			total_pay =	customer.TotalInvoice(amt,cust_plat);
			System.out.print("Customer type " + cust_plat);
			System.out.printf(" amount =  % ,.3f ", amt);
			System.out.printf("Total pay = % ,.3f", total_pay);
			break;
		}
		case GOLD :
		{
			total_pay =	customer.TotalInvoice(amt,cust_gold);
			System.out.print("Customer type " + cust_gold);
			System.out.printf(" amount =  % ,.3f ", amt);
			System.out.printf("Total pay = % ,.3f", total_pay);
			break;
		}
		case SILVER :
		{
			total_pay =	customer.TotalInvoice(amt,cust_sil);
			System.out.print("Customer type " + cust_sil);
			System.out.printf(" amount =  % ,.3f ", amt);
			System.out.printf("Total pay = % ,.3f", total_pay);
			break;
		}
		case NORMAL : 
		{
			total_pay =	customer.TotalInvoice(amt,cust_nor);
			System.out.print("Customer type " + cust_nor);
			System.out.printf(" amount =  % ,.3f ", amt);
			System.out.printf("Total pay = % ,.3f", total_pay);
			break;
		}
		default  : System.out.println("Invalid Customer Type");	
		}
		System.out.println();
	}
}
	