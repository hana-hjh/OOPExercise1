public class BicycleRegistration
{
	public static void main(String[] arg){
		Bicycle bike1, bike2, bike3;
		String owner1, owner2, tag;
		
		bike1 = new Bicycle();
		bike1.setownerName("Adam Smith");
		
		bike2 = new Bicycle();
		bike2.setownerName("Ben Jones");
		
		bike3 = new Bicycle();
		bike3.settagNo("2004-134R");
		
		owner1 = bike1.getownerName();
		owner2 = bike2.getownerName();
		tag = bike3.gettagNo();
		
		System.out.println(owner1 + " owns a bicycle");
		System.out.println(owner2 + " also owns a bicycle");
		System.out.println("Tag number: " + tag);
		
		Bicycle bike = new Bicycle("Unassigned", "XXXX-XXXX");
		System.out.println("Name: " + bike.ownerName);
		System.out.println("Tag: " + bike.tagNo);
	}
}
