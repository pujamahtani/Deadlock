public class Resource2 implements Runnable{
	Sync obj1;
	Sync obj2;
	String[] arr;
  Resource2(Sync obj1,Sync obj2,String[] arr){
  	this.obj1=obj1;
  	this.obj2=obj2;
  	this.arr=arr;

  }
	public void run(){
      obj2.display(obj1,arr);
       

	}
}