package Command;
/*
 * Invoker
 */

public class RemoteController {

	private Command[] onCommands;
	
	private Command[] offCommands;
	
	private final int slotNum = 7;//7个按钮
	
	public RemoteController(){
		this.onCommands = new Command[slotNum];
		this.offCommands = new Command[slotNum];
	}
	
	public void setOnCommand(Command command,int slot){
		onCommands[slot] = command;
	}
	
	public void setOffCommand(Command command,int slot){
		offCommands[slot] = command;
	}
	
	public void onButtonWasPushed(int slot){
		onCommands[slot].execute();
	}
	
	public void offButtonWasPushed(int slot){
		offCommands[slot].execute();
	}
}
