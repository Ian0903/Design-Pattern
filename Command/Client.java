package Command;

public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		RemoteController rc = new RemoteController();
		Light light = new Light();
		LightOnCommand loc = new LightOnCommand(light);
		LightOffCommand lfc = new LightOffCommand(light);
		
		rc.setOnCommand(loc, 0);
		rc.setOffCommand(lfc, 1);
		
		rc.onButtonWasPushed(0);
		rc.offButtonWasPushed(1);
	}

}
