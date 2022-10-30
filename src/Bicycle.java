public class Bicycle
{
	public String ownerName;
	public String tagNo;
	
	public Bicycle() {
		ownerName = "unknown";
		tagNo = "unknown";
	}
	
	public Bicycle(String name1, String name2) {
		ownerName = name1;
		tagNo = name2;
	}
	
	public String getownerName() {
		return ownerName;
	}
	
	public void setownerName(String name) {
		ownerName = name;
	}
	
	public void settagNo(String name) {
		tagNo = name;
	}
	
	public String gettagNo() {
		return tagNo;
	}
}
