
class UnresponsiveUI {
	private volatile double d = 1;
	public UnresponsiveUI() throws Exception {
		while(d > 0)
			d = d + (Math.PI + Math.E) / d;
		System.in.read();
	}
}

public class ResponsiveUI extends Thread {
	private static volatile double d = 1;
	public ResponsiveUI(){
		setDaemon(true);
		start();
	}
	public void run(){
		while(true){
			d = d + (Math.PI + Math.E) / d;
		}
	}
	public static void main(String[] args) {
		try {
			new UnresponsiveUI();
		} catch (Exception e){
			System.out.println(e);
		}
		new ResponsiveUI();
		try{
			System.in.read();
		} catch(Exception e){
			System.out.println(e);
		}
		System.out.println(d);
	}
}

