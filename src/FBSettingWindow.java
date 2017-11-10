import java.util.ArrayList;

//功能键设置窗口类
public class FBSettingWindow {
	private String title;
	//定义一个ArrayList集合来存储所有的功能键
	private ArrayList<FunctionButton> fbs=new ArrayList<>();
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public ArrayList<FunctionButton> getFb() {
		return fbs;
	}
	public void setFb(ArrayList<FunctionButton> fbs) {
		this.fbs = fbs;
	}
	public FBSettingWindow(String title) {
		super();
		this.title = title;
	}
	public void addFunctionButton(FunctionButton fb){
		fbs.add(fb);
	}
	public void removeFunctionButton(FunctionButton fb){
		fbs.remove(fb);
	}
	//显示窗口及功能键
	public void display(){
		System.out.println("显示窗口："+title);
		System.out.println("显示功能键：");
		for(Object obj: fbs){
			System.out.println(((FunctionButton) obj).getName());
		}
		System.out.println("----------------------------");
	}

}
