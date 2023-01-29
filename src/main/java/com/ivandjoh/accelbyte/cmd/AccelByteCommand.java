package com.ivandjoh.accelbyte.cmd;

import com.ivandjoh.accelbyte.dir.FileAssert;
import picocli.CommandLine;

import java.io.File;

@CommandLine.Command(
        name = "",
        mixinStandardHelpOptions = true,
        version = "1.0.0",
        requiredOptionMarker = '*',
        description = "%nThis is AccelByte-cli tools",
        optionListHeading = "%nYou can choose several Options are :%n",
        footerHeading = "%nCopy(c)2023%n",
        footer = "Develop by ivandjoh"
)
public class AccelByteCommand implements Runnable {


    @CommandLine.Option(
            names = {"-u", "--user"},
            description = "Please Provide Username",
            paramLabel = "username"
    )
    String user;


    @Override
    public void run() {
        if (user == null || user.length() == 0) {
//            System.out.println("Hello, World!");
            FileAssert.printDirectoryTree(new File("app"));
        } else {
//            System.out.println("Hello " + user);
            FileAssert.printDirectoryTree(new File("target"));
        }
    }
}
