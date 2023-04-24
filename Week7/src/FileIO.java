import java.io.*;

public class FileIO {
	public static void main(String[] args) {
		try {
		InputStream fis = new FileInputStream("input.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		String data;
		
		FileOutputStream fos =
		new FileOutputStream("output.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		int cnt = 0;
		String[] ll = new String[100000000];
		while(((data = br.readLine()) != null)) {
			ll[cnt] = data;
			cnt++;
		}

		for(int i = cnt - 1; i >= 0; i--) {
			bw.write(ll[i]);
			bw.newLine();
		}
		
		bw.flush();
		bw.close(); fos.close(); osw.close();
		} catch (IOException e) {
		e.printStackTrace();
		}
		}
}
