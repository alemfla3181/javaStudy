package chat.gui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ChatClientApp {

	private static final String SERVER_IP = "127.0.0.1";
	private static final int SERVER_PORT = 9999;

	public static void main(String[] args) {
		String name = null;
		Scanner scanner = new Scanner(System.in);
		Socket socket = null;

		try {
			while (true) {

				System.out.println("대화명을 입력하세요.");
				System.out.print(">>> ");
				name = scanner.nextLine();

				if (name.isEmpty() == false) {
					break;
				}

				System.out.println("대화명은 한글자 이상 입력해야 합니다.\n");
			}

			scanner.close();

			// 1. create socket
			socket = new Socket();

			// 2. connet server
			socket.connect(new InetSocketAddress(SERVER_IP, SERVER_PORT));

			// 3. get iostream(pipline established)
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);

			// 4. join protocol 처리
			pw.println("join:" + name);
			String line = br.readLine();
			System.out.println(line);

			// ---> "join:둘리\n"
			// join:ok <---
			// String line = br.readLine();
			new ChatWindow(name, socket).show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
