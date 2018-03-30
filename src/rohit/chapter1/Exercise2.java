package rohit.chapter1;

import java.io.File;

public class Exercise2 {
	public File[] listSubDirs(String path) {
		File dir = new File(path);
		if(!dir.isDirectory())
			return null;
		
		//return dir.listFiles(file -> file.isDirectory());
		return dir.listFiles(File::isDirectory);
	}
	
	public static void main(String[] args) {
		Exercise2 e2 = new Exercise2();
		File[] list = e2.listSubDirs("/Users/rohit.gupta/EclipseProject");
		for(File l: list) {
			System.out.println(l.getPath() + " - " + l.isDirectory()); 
		}
	}
}
