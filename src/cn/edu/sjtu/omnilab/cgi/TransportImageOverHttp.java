/**
 * 
 */
package cn.edu.sjtu.omnilab.cgi;

/**
 * @author jianwen
 *
 */
public class TransportImageOverHttp {

	/**
	 * 
	 */
	public TransportImageOverHttp() {
		// TODO Auto-generated constructor stub
	}

	public void printHttpHead(String contType) {
		System.out.println("Content-type: " + contType);
	}
	
	public void printHttpBody() {
		System.out.print("<html>");
		System.out.print("<a href=\"www.github.com\">");
		System.out.print("Click here to github");
		System.out.print("</a>");
		System.out.print("</html>");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TransportImageOverHttp transDemo = new TransportImageOverHttp();
		
		transDemo.printHttpHead("text/html");
		System.out.println("");
		transDemo.printHttpBody();
	}

}
