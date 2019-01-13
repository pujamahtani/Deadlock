public class Sync{
	synchronized public void printArray(Sync obj2,String[] arr){
      for(int i=0;i<arr.length;i++){
      	System.out.println("Array Elements are :" +arr[i]);

      }
      obj2.display(obj2,arr);
	}
	synchronized public void display(Sync obj1,String[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.println("the array indexes are:" +i);
		} 
      obj1.printArray(obj1,arr);
	}
}