package com.ivandjoh.accelbyte;

import com.ivandjoh.accelbyte.cmd.AccelByteCommand;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		new AccelByteCommand().run();
	}

}
