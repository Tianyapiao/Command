//最小化命令类：具体命令类
public class MinimizeCommand extends Command{
	private WindowHandler whObj;//维持对请求接收者的引用


	public MinimizeCommand() {
		whObj=new WindowHandler();
	}

	//执行命令方法，将调用请求接收者的业务方法
	@Override
	public void execute() {
		whObj.minimize();
	}
}
