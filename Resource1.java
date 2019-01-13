public class Resource1 implements Runnable{
	Sync obj1;
	Sync obj2;
	String[] arr;
  Resource1(Sync obj1,Sync obj2,String[] arr){
  	this.obj1=obj1;
  	this.obj2=obj2;
  	this.arr=arr;

  }
	public void run(){
      obj1.printArray(obj2,arr);
       
	}
}