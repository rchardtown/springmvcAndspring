package cn.ekgc.historyMavenProject;

public class Demo {
	// maven 项目比原始的项目 controller --> service-->dao  优化了一点
	//	就是 maven  将jar 包的手动复制到lib 的操作，改成了pom.xml 中配置好
	//  使其自动加载
	
	
	//  maven 的核心文件：  pom.xml 用来管理jar包
	public static void main(String[] args) {
		System.out.println("  原始的controller-->serivce -->dao  项目");
	}
}
