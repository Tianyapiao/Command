import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

//import org.dom4j.Attribute;
//Xml读取类    使用dom4j解析xml
public class XMLUtil {
	public static Object getBean(int i){
		try {
			// 创建saxReader对象
			SAXReader reader=new SAXReader();
			// 通过read方法读取一个文件 转换成Document对象
			Document doc=reader.read(new File("src/config.xml"));
			//获取根节点元素对象
			Element rootNode=doc.getRootElement();//得到了config
			String type = null;
			//获取根元素节点下 所有元素的子节点
			List<Element> elements = rootNode.elements();
			if(0==i){
				type= elements.get(0).getText();
			}else{
				type= elements.get(1).getText();
			}
			Class c=Class.forName(type);
			Object obj=c.newInstance();
			return obj;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}

