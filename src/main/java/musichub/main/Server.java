package musichub.main;

import musichub.business.*;

public class Server {
	/**
	 * 
	 * @param args
	 * @see AbstractServer
	 * 
	 */
    public static void main(String[] args) {
        AbstractServer as = new FirstServer();
        as.connect("localhost");
    }
}