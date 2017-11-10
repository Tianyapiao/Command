//功能键类：请求 的发送者
public class FunctionButton {
	private String name;
	private Command command;

	public FunctionButton(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	//为功能键注入命令
	public void setCommand(Command command) {
		this.command = command;
	}
	//发送请求的方法
	public void onClick(){
		System.out.print("点击功能键：");
		command.execute();
	}

}
