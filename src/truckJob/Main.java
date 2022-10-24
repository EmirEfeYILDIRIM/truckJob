package truckJob;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Driver> drivers=new ArrayList<>();
		drivers.add(new Driver("Talha ","YILDIRIM ","05549873212"));
		drivers.add(new Driver("Burak ","KURAL ","05638527414"));
		drivers.add(new Driver("Ecrin ","DEMİRKOL ","05549873212"));
		
		ArrayList<Truck> trucks=new ArrayList<>();
		trucks.add(new Truck("14 BJK 666 ","Ford ","2011 ",drivers.get(0)));
		trucks.add(new Truck("34 GS 22 ","Dodge ","1960 ",drivers.get(1)));
		trucks.add(new Truck("26 BJK 22 ","Volvo ","2017 ",drivers.get(2)));
		
		ArrayList<Company> companys=new ArrayList<>();
		companys.add(new Company("Uğur Sanayi ", "05826936644 ","Ankara"));
		companys.add(new Company("Burak Terminali ", "05856736644 ","Eskişehir"));
		companys.add(new Company("Talha Altyapı ", "05747829441 ","Bolu"));
		
		ArrayList<Dispacher> dispachers = new ArrayList<>();
		dispachers.add(new Dispacher("Emir Şahin ","HUSAN" ,"05848889569 ","husan@gmail.com"));
		dispachers.add(new Dispacher("Emirhan ","AYKUŞ ","05415866335 ","aykus@gmail.com"));
		dispachers.add(new Dispacher("Erdem ","BAĞCI ","05744822214 ","bagci@gmail.com"));
		
		ArrayList<Job> jobs = new ArrayList<>();
		jobs.add(new Job("France","Türkiye",9000000,700,7000,companys.get(0),trucks.get(0),dispachers.get(0)));
		jobs.add(new Job("Germany","Türkiye",8000000,600,6000,companys.get(1),trucks.get(1),dispachers.get(1)));
		jobs.add(new Job("Italy","Türkiye",7000000,500,5000,companys.get(2),trucks.get(2),dispachers.get(2)));
		
		for (Job job : jobs) {
			System.out.println("<---"+job.getJobFrom()+"-"+job.getJobDestination()+"--->");
			System.out.println("İş Bilgileri");
			System.out.println("Nereden: "+job.getJobFrom());
			System.out.println("Nereye: "+job.getJobDestination());
			System.out.println("Tutar: "+job.getCost()+" TL");
			System.out.println("Ağırlık: "+job.getWeight()+" KG");
			System.out.println("Mesafe: "+job.getDestinationRange()+" KM");
			System.out.println("Müşteri Bilgiler");
			System.out.println("Şirket Adı: "+job.getCompany().getName());
			System.out.println("Telefon Numarası: "+job.getCompany().getPhone());
			System.out.println("Adresi: "+job.getCompany().getAddress());
			System.out.println("Tır Bilgileri");
			System.out.print("Plakası: "+job.getTruck().getNumberPlate());
			System.out.println("Marka: "+job.getTruck().getBrand());
			System.out.println("Modeli: "+job.getTruck().getModel());
			System.out.println("Sürücü Bilgileri");
			System.out.println("İsmi: "+job.getTruck().getDriver().getName());
			System.out.println("Soyismi: "+job.getTruck().getDriver().getSurname());
			System.out.println("Telefon Numarası: "+job.getTruck().getDriver().getPhone());
			System.out.println("Aracı Bilgileri");
			System.out.println("İsmi: "+job.getDispacher().getName());
			System.out.println("Soyismi: "+job.getDispacher().getSurname());
			System.out.println("Telefon Numarası: "+job.getDispacher().getPhone());
			System.out.println("E-Posta: "+job.getDispacher().getMail());
		}
	}

}
