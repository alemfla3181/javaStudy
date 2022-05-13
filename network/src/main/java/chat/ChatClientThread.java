package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.SocketException;

public class ChatClientThread extends Thread {
	private BufferedReader bufferedReader;

	public ChatClientThread(BufferedReader br) {
		bufferedReader = br;
	}

	@Override
	public void run() {
		while (true) {
			try {
				String data = bufferedReader.readLine();
				if (data == null) {
					break;
				}
				System.out.println(data);
			} catch (SocketException e) {
				System.out.println("error" + e);
			} catch (IOException e) {
				System.out.println("error" + e);
				break;
			}
		}
	}
}
