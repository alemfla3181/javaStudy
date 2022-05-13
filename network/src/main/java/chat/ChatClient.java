package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
	// private static final String SERVER_IP = "172.0.0.1";
	private static final String SERVER_IP = "192.168.10.21";
	private static final int SERVER_PORT = ChatServer.PORT;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Socket socket = null;
		Scanner scanner = null;

		try {
			// 1. Scanner 생성
			scanner = new Scanner(System.in);

			// 2. Socket 생성
			socket = new Socket();

			// 연결
			socket.connect(new InetSocketAddress(SERVER_IP, SERVER_PORT));
			log("conneted");

			// 이게 render/writer고
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);

			System.out.print("닉네임>>");
			String nickname = scanner.nextLine();

			while ("".equals(nickname))
				nickname = scanner.nextLine();
			pw.println("join:" + nickname);

			// ChatClientThread();
			new ChatClientThread(br).start();

			while (true) {
				System.out.print(">>");
				String input = scanner.nextLine();

				if ("".equals(input)) {
					System.out.println();
				} else if ("quit".equals(input)) {
					pw.println("quit");
					break;
				} else {
					// 메시지 처리
					pw.println("message:" + input);
				}
			}
		} catch (IOException e) {
			System.out.println("Error:" + e);
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	public static void log(String log) {
		System.out.println(log);
	}
}
