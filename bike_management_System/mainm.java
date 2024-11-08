package bike_management_System;
import java.sql.*;
import java.util.Scanner;
public class mainm
{
public static void main(String []args) throws SQLException, InterruptedException
{
	System.out.println("꧁💙💙×..•÷°'¨´•.🎀🏵~~~~~~~~~~~~~~~~~~💝💝~~~~~~~~~~~~~~~~~~🏵🎀×..•÷°'¨´•.💙💙꧂");
	System.out.println("\t\t\t      🛵𝕨𝕖𝕝𝕔𝕠𝕞𝕖 𝕥𝕠 𝔾ℙ 𝕓𝕚𝕜𝕖 𝕤𝕙𝕠𝕨𝕣𝕠𝕠𝕞🏍️");
	System.out.println("꧁💙💙×..•÷°'¨´•.🎀🏵~~~~~~~~~~~~~~~~~~💝💝~~~~~~~~~~~~~~~~~~🏵🎀×..•÷°'¨´•.💙💙꧂");
	System.out.println("\t\t\t\t𝚙𝚛𝚘𝚙𝚛𝚒𝚎𝚝𝚘𝚛 𝙶𝚗𝚊𝚗𝚊𝚙𝚛𝚊𝚔𝚊𝚜𝚊𝚖.𝙽");
	System.out.println("\t\t\t   (𝙰𝚞𝚝𝚑𝚘𝚛𝚒𝚜𝚎𝚍 𝚍𝚎𝚊𝚕𝚎𝚛 𝚏𝚘𝚛 𝚋𝚊𝚓𝚊𝚓,𝚝𝚟𝚜,𝚑𝚘𝚗𝚍𝚊)");
	for(int i=0;i<=28;i++)
	{
		System.out.print("🏍️");
		Thread.sleep(100);
		System.out.print("_");
	}
	System.out.println();
	Scanner sc=new Scanner(System.in);
	customer_m mc=new customer_m();
	salem_m ms=new salem_m();
	badmin ad=new badmin();
	String arr[]= {"𝔀","𝓮","𝓵","𝓬","𝓸","𝓶","𝓮"," ","😊"};
	String arr2[]= {"e","n","t","e","r"," ","t","h","e"," ","t","y","p","e"," ","o","f"," ","u","s","e","r"};
	System.out.print("\t\t\t\t      ");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]);
		Thread.sleep(150);
	}
	System.out.println();
	try
	{
	while(true)
	{		
	System.out.print("\t\t\t\t ");
	System.out.println("   𝓽𝔂𝓹𝓮 𝓸𝓯 𝓵𝓸𝓰𝓲𝓷?");
	System.out.println("\t\t𝓹𝓻𝓮𝓼𝓼:1 𝓬𝓾𝓼𝓽𝓸𝓶𝓮𝓻  𝓹𝓻𝓮𝓼𝓼:2 𝓯𝓸𝓻 𝓼𝓪𝓵𝓮 𝓼𝓽𝓪𝓯𝓯  𝓹𝓻𝓮𝓼𝓼:3 𝓯𝓸𝓻 𝓪𝓭𝓶𝓲𝓷");
	int check=sc.nextInt();
	/////////////////////////////////enter the switch////////////////////////////////
	if(check==1)
	{
	////////////////////////////////enter case 1////////////////////////////////////
	
		System.out.println("please enter the customer password");
	    int password=sc.nextInt();
		if(password==123)
		{
			System.out.print("Login Successfully👌 ");
			for(int i=0;i<=3;i++)
			
			{
				System.out.print("Welcome...");
				Thread.sleep(500);
			}
			System.out.println();
			System.out.println("press:1 for insert data");
			System.out.println("press:2 Get bike name & price via category(fb or sb)");
			System.out.println("press:3 get bike name & category via prices");
			int check1=sc.nextInt();
			///////////////////////////////////condition 1//////////////////////////////
		if(check1==1)
		{
			System.out.println("enter the customer id");
			int id=sc.nextInt();
			System.out.println("enter the customer name");
			String c_name=sc.next();
			System.out.println("enter the bike name");
			String bikename=sc.next();
			System.out.println("enter the category name");
			String category=sc.next();
			System.out.println("enter the prices");
			int prices=sc.nextInt();
			int c=mc.insert(id, c_name, bikename, category, prices);
			System.out.println((c>0)?"data inserted":"data not inserted");	
			System.out.println("꧁💙💙×..•÷°'¨´•.🎀🏵~~~~~~~~~~~~~𝓽𝓱𝓪𝓷𝓴 𝔂𝓸𝓾, 𝓿𝓲𝓼𝓲𝓽 𝓪𝓰𝓪𝓲𝓷...~~~~~~~~~~~~~🏵🎀×..•÷°'¨´•.💙💙꧂");
		}
		////////////////////////////condition 2///////////////////////////////////////
		else if(check1==2)
		{
			System.out.println("are you searching (family bike(fb)) or (sport bike(sb))");
			String ss=sc.next();
			mc.specific(ss);
			System.out.println("꧁💙💙×..•÷°'¨´•.🎀🏵~~~~~~~~~~~~~𝓽𝓱𝓪𝓷𝓴 𝔂𝓸𝓾, 𝓿𝓲𝓼𝓲𝓽 𝓪𝓰𝓪𝓲𝓷...~~~~~~~~~~~~~🏵🎀×..•÷°'¨´•.💙💙꧂");
		}
		////////////////////////////condition 3///////////////////////////////////////
		else if(check1==3)
		{
			System.out.println("search your prices based vehicle");
			int prices=sc.nextInt();
			mc.pricesval(prices);
			System.out.println("꧁💙💙×..•÷°'¨´•.🎀🏵~~~~~~~~~~~~~𝓽𝓱𝓪𝓷𝓴 𝔂𝓸𝓾, 𝓿𝓲𝓼𝓲𝓽 𝓪𝓰𝓪𝓲𝓷...~~~~~~~~~~~~~🏵🎀×..•÷°'¨´•.💙💙꧂");
		}
		else
		{
			System.out.println("invalid content");
		}
		}
		
		else
		{
			System.out.println("sorry incorrect Password");
			System.out.println("꧁💙💙×..•÷°'¨´•.🎀🏵~~~~~~~~~~~~~𝓽𝓱𝓪𝓷𝓴 𝔂𝓸𝓾, 𝓿𝓲𝓼𝓲𝓽 𝓪𝓰𝓪𝓲𝓷...~~~~~~~~~~~~~🏵🎀×..•÷°'¨´•.💙💙꧂");
		}
	}
	////////////////////////////////////staff login///////////////////////////////////
	else if(check==2)
	{
		System.out.println("enter the staff department password");
		int password1=sc.nextInt();
		if(password1==456)
		{
			System.out.print("login successfully👌 ");
			for(int i=0;i<=3;i++)
			{
				System.out.print("Welcome...");
				Thread.sleep(500);
			}
	System.out.println();
	System.out.println("press:1 for insert data");
	System.out.println("press:2 know the staff name via experience");
	int check2=sc.nextInt();
	if(check2==1)
	{
		System.out.println("enter the staff id");
		int id=sc.nextInt();
		System.out.println("enter the staff name");
		String s_name=sc.next();
		System.out.println("enter the staff work experience");
		int work_e=sc.nextInt();
		System.out.println("enter the selling efficiency");
		int selling_e=sc.nextInt();
		System.out.println("enter the age");
		int s_age=sc.nextInt();
		System.out.println("enter the customer id");
		int c_id=sc.nextInt();
		int c=ms.insert(id, s_name, work_e, selling_e, s_age, c_id);
		System.out.println((c>0)?"data inserted":"data not inserted");
		System.out.println("꧁💙💙×..•÷°'¨´•.🎀🏵~~~~~~~~~~~~~𝓽𝓱𝓪𝓷𝓴 𝔂𝓸𝓾, 𝓿𝓲𝓼𝓲𝓽 𝓪𝓰𝓪𝓲𝓷...~~~~~~~~~~~~~🏵🎀×..•÷°'¨´•.💙💙꧂");
	}
	else if(check2==2)
	{
		System.out.println("know the staff work experience via age");
		int hs=sc.nextInt();
		ms.work_exp(hs);
		System.out.println("꧁💙💙×..•÷°'¨´•.🎀🏵~~~~~~~~~~~~~𝓽𝓱𝓪𝓷𝓴 𝔂𝓸𝓾, 𝓿𝓲𝓼𝓲𝓽 𝓪𝓰𝓪𝓲𝓷...~~~~~~~~~~~~~🏵🎀×..•÷°'¨´•.💙💙꧂");
	}
	else
	{
		System.out.println("invalid input");
	}
	}
		else
		{
			System.out.println("sorry incorrect password");
			System.out.println("꧁💙💙×..•÷°'¨´•.🎀🏵~~~~~~~~~~~~~𝓽𝓱𝓪𝓷𝓴 𝔂𝓸𝓾, 𝓿𝓲𝓼𝓲𝓽 𝓪𝓰𝓪𝓲𝓷...~~~~~~~~~~~~~🏵🎀×..•÷°'¨´•.💙💙꧂");
		}
	}

	//////////////////////////////////switch 3////////////////////////////////////////////////
	else if(check==3)
	{
		System.out.println("enter the admin department password");
	int password2=sc.nextInt();
	if(password2==789)
	{
		System.out.print("Login Successfully👌 ");
		for(int i=0;i<=3;i++)
		{
			System.out.print("Welcome...");
			Thread.sleep(500);
		}
		System.out.println();
		System.out.println("press:1 show the customer database");
		System.out.println("press:2 show the staff datatbase");
		System.out.println("press:3 show the maximum value of staff database");
		System.out.println("press:4 show the maximum value of customer database");
		System.out.println("press:5 update customer database");
		System.out.println("press:6 update staff database");
		System.out.println("press:7 delete customer database row");
		System.out.println("press:8 delete staff database row");
		System.out.println("press:9 left join showing values");
		System.out.println("press:10 right join showing values");
		int check3=sc.nextInt();
		if(check3==1)
		{
			ad.see_customer();
			System.out.println("꧁💙💙×..•÷°'¨´•.🎀🏵~~~~~~~~~~~~~𝓽𝓱𝓪𝓷𝓴 𝔂𝓸𝓾, 𝓿𝓲𝓼𝓲𝓽 𝓪𝓰𝓪𝓲𝓷...~~~~~~~~~~~~~🏵🎀×..•÷°'¨´•.💙💙꧂");
		}
		else if(check3==2)
		{
			ad.see_staff();
			System.out.println("꧁💙💙×..•÷°'¨´•.🎀🏵~~~~~~~~~~~~~𝓽𝓱𝓪𝓷𝓴 𝔂𝓸𝓾, 𝓿𝓲𝓼𝓲𝓽 𝓪𝓰𝓪𝓲𝓷...~~~~~~~~~~~~~🏵🎀×..•÷°'¨´•.💙💙꧂");
		}
		else if(check3==3)
		{
			ad.see_sale_per();
			System.out.println("꧁💙💙×..•÷°'¨´•.🎀🏵~~~~~~~~~~~~~𝓽𝓱𝓪𝓷𝓴 𝔂𝓸𝓾, 𝓿𝓲𝓼𝓲𝓽 𝓪𝓰𝓪𝓲𝓷...~~~~~~~~~~~~~🏵🎀×..•÷°'¨´•.💙💙꧂");
		}
		else if(check3==4)
		{
			ad.see_category_max();
			System.out.println("꧁💙💙×..•÷°'¨´•.🎀🏵~~~~~~~~~~~~~𝓽𝓱𝓪𝓷𝓴 𝔂𝓸𝓾, 𝓿𝓲𝓼𝓲𝓽 𝓪𝓰𝓪𝓲𝓷...~~~~~~~~~~~~~🏵🎀×..•÷°'¨´•.💙💙꧂");
		}
		else if(check3==5)
		{

			System.out.println("change the bike name");
			String new_val=sc.next();
			System.out.println("enter the specific id");
			int cid=sc.nextInt();
			int check5=ad.update_bike(new_val, cid);
			System.out.println((check5>0)?"updated value":"not updated value");
			System.out.println("꧁💙💙×..•÷°'¨´•.🎀🏵~~~~~~~~~~~~~𝓽𝓱𝓪𝓷𝓴 𝔂𝓸𝓾, 𝓿𝓲𝓼𝓲𝓽 𝓪𝓰𝓪𝓲𝓷...~~~~~~~~~~~~~🏵🎀×..•÷°'¨´•.💙💙꧂");
		}
		else if(check3==6)
		{
			System.out.println("enter your new value of selling efficiency under 10 points");
			String new_val=sc.next();
			System.out.println("enter the specific customer id");
			int cid=sc.nextInt();
			int check5=ad.update_bikesalem( new_val, cid);
			System.out.println((check5>0)?"updated value":"not updated value");
			System.out.println("꧁💙💙×..•÷°'¨´•.🎀🏵~~~~~~~~~~~~~𝓽𝓱𝓪𝓷𝓴 𝔂𝓸𝓾, 𝓿𝓲𝓼𝓲𝓽 𝓪𝓰𝓪𝓲𝓷...~~~~~~~~~~~~~🏵🎀×..•÷°'¨´•.💙💙꧂");
		}
		else if(check3==7)
		{
			System.out.println("enter the delete row from customer table for id");
			int id=sc.nextInt();
			int c=ad.delete_bike(id);
			System.out.println((c>0)?"deleted custome row":"not deleted custome row");
			System.out.println("꧁💙💙×..•÷°'¨´•.🎀🏵~~~~~~~~~~~~~𝓽𝓱𝓪𝓷𝓴 𝔂𝓸𝓾, 𝓿𝓲𝓼𝓲𝓽 𝓪𝓰𝓪𝓲𝓷...~~~~~~~~~~~~~🏵🎀×..•÷°'¨´•.💙💙꧂");
		}
		else if(check3==8)
		{
			System.out.println("enter the delete row from staff table for id");
			int id=sc.nextInt();
			int c=ad.delete_bikesalem(id);
			System.out.println((c>0)?"deleted staff row":"not deleted staff row");
			System.out.println("꧁💙💙×..•÷°'¨´•.🎀🏵~~~~~~~~~~~~~𝓽𝓱𝓪𝓷𝓴 𝔂𝓸𝓾, 𝓿𝓲𝓼𝓲𝓽 𝓪𝓰𝓪𝓲𝓷...~~~~~~~~~~~~~🏵🎀×..•÷°'¨´•.💙💙꧂");
		}
		else if(check3==9)
		{
			ad.leftjoin();
			System.out.println("꧁💙💙×..•÷°'¨´•.🎀🏵~~~~~~~~~~~~~𝓽𝓱𝓪𝓷𝓴 𝔂𝓸𝓾, 𝓿𝓲𝓼𝓲𝓽 𝓪𝓰𝓪𝓲𝓷...~~~~~~~~~~~~~🏵🎀×..•÷°'¨´•.💙💙꧂");
		}
		else if(check3==10)
		{
			ad.rightjoin();
			System.out.println("꧁💙💙×..•÷°'¨´•.🎀🏵~~~~~~~~~~~~~𝓽𝓱𝓪𝓷𝓴 𝔂𝓸𝓾, 𝓿𝓲𝓼𝓲𝓽 𝓪𝓰𝓪𝓲𝓷...~~~~~~~~~~~~~🏵🎀×..•÷°'¨´•.💙💙꧂");
		}
		else
		{
			System.out.println("invalid input");
		}
	}
	else
	{
		System.out.println("sorry incorrect password");
		System.out.println("꧁💙💙×..•÷°'¨´•.🎀🏵~~~~~~~~~~~~~𝓽𝓱𝓪𝓷𝓴 𝔂𝓸𝓾, 𝓿𝓲𝓼𝓲𝓽 𝓪𝓰𝓪𝓲𝓷...~~~~~~~~~~~~~🏵🎀×..•÷°'¨´•.💙💙꧂");
	}
	
}
	else 
	{
		System.out.println("INVALID INPUT");
		break;
	}
}	
	}
	catch(Exception e)
	{
		System.out.println("invalid mismatch input");
		
	}

	}///////////while end/////////////////////////////////////
}

