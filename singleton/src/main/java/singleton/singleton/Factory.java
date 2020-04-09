package singleton.singleton;

public class Factory {
	public static void main(String[] args) {
		 
		
		SmartWorker sw = new SmartWorker();
		Factory mn = new Factory(sw);
		mn.ManageWork();
		
		LazyWorker lw = new LazyWorker();
		Factory mn2 = new Factory(lw);
		mn2.ManageWork();
		
		ExtraordinaryWorker ew = new ExtraordinaryWorker();
		Factory mn3 = new Factory(ew);
		mn3.ManageWork();

	}



	Worker worker;           
	public Factory(Worker worker)   // contructor passing object as reference
	{

		this.worker=worker;
		
	}

	public void ManageWork() 
	{	
		
		this.worker.work();  //using single object as reference and call child classes 
	}

}

interface Worker      //Loose Coupling
{
	void work();
	
}
class SmartWorker implements Worker{
	public void work() {
		System.out.println("smart worker working");
	}

}

class LazyWorker implements Worker {
	public void work() {
		System.out.println("Lazy worker working");
	}

}

class ExtraordinaryWorker implements Worker
{
	public void work()
	{
		System.out.println("ExtraOrdinary worker working");
	}

}
