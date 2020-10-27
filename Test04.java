
public class FindUnpaired{
	
	
	static int[] list = {1, 2, 4, 2, 1};
	
	public static void main(String[] args) throws Throwable 
	{
		System.out.println("UnpairedNumber: " + findUnpaired(list));
	}
	
	
	public static int findUnpaired(int[] list) throws Throwable {
		
		if(list.length % 2 == 0) {
			throw new Exception("Array not an odd size");
		}
		
		int[] pairedList = new int[list.length];
		int foundUnpaired = -1;
		int currentNum = 0;
		String finalMessage = "";
		String unpairedMessage = "";
		for(int i = 0; i < list.length; i++) {
			if(pairedList[i] != 1) {
				currentNum = list[i];
				int search = i+1;
				while(currentNum != -1 && search < list.length) 
				{
					
					if(list[search] == currentNum) 
					{
						finalMessage += "the elements at indexes " + i + " and " + search + " have value " +  currentNum + "\n";
						currentNum = -1;
						pairedList[i] = 1;
						pairedList[search] = 1;
					}
					
					else 
					{
						search++;
					}
					
				}
				
				if(pairedList[i] == 0) {
					unpairedMessage += "the element at index " + i + " has value " + currentNum + " and is unpaired.";
					foundUnpaired = list[i];
					currentNum = -1;
				}
				
			}
				
		}
						
		System.out.println(finalMessage + unpairedMessage);
		
		return foundUnpaired;
		
	}
}
