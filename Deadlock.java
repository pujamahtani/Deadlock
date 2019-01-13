


public class Deadlock{
	public static void main(String args[]){
		String[] array = new String[]{"hi","hello","bye"};
        Sync synchronize1 = new Sync();
        Sync synchronize2 = new Sync();
		Resource1 re = new Resource1(synchronize1,synchronize2,array);
		Resource2 re2 = new Resource2(synchronize1,synchronize2,array);
		Thread t1 = new Thread(re);
		t1.start();
		Thread t2 = new Thread(re2);
		t2.start();
		

	}
}