package echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class EchoServer {
	private static final String SERVER_IP = "127.0.0.1";
	private static final int PORT = 6666;

	public static void main(String[] args) {
		ServerSocket serverSocket = null;

		try {
			// 1. 서버소켓 생성
			serverSocket = new ServerSocket();

			// 2. 바인딩(binding)
			// Socket에 InetSocketAddress(IP Address + Port)를 바인딩한다.
			// IPAddress(0.0.0.0) : 특정 호스트 IP를 바인딩 하지 않는다.
			// backlog: 요청 queue(10)
			serverSocket.bind(new InetSocketAddress("0.0.0.0", PORT), 10);
			log("starts... [port:" + PORT + "]");

			// 3. accept
			// 클라이언트로 부터 요청을 기다린다.
			Socket socket = serverSocket.accept(); // blocking

			InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
			String remoteHostAddress = inetSocketAddress.getAddress().getHostAddress();
			int remoteHostPort = inetSocketAddress.getPort();
			log("conneted by client[" + remoteHostAddress + ":" + remoteHostPort + "]");

			try {
				// 4. IO Stream 받아오기
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
				PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);

				while (true) {
					String data = br.readLine();
					if (data == null) {
						log("closed by client");
						break;
					}

					log("received " + data);
					pw.println(data);
				}
			} catch (SocketException ex) {
				System.out.println("[server] suddenly closed by client");
			} catch (IOException ex) {
				System.out.println("[server] error:" + ex);
			} finally {
				try {
					if (socket != null && !socket.isClosed())
						socket.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		} catch (IOException e) {
			System.out.println("[server] error:" + e);
		} finally {
			try {
				if (serverSocket != null && !serverSocket.isClosed()) {
					serverSocket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void log(String log) {
		System.out.println("[EchoServer]" + log);
	}
}
