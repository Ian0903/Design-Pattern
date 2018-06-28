package Command;

public class LightOffCommand implements Command {

	Light light;
	
	public LightOffCommand(Light light){
		this.light = light;
	}
	
	@Override
	public void execute() {
		// TODO 自动生成的方法存根
		light.lightOff();
	}

	@Override
	public void undo() {
		// TODO 自动生成的方法存根
		light.lightOn();
	}

}
