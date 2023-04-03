package com.sii.sup.selenium7_1.moderntester.utils;

import java.nio.file.Paths;
import java.util.concurrent.ThreadLocalRandom;

public class Helper {

    public static String getDownloadDirPath() {
        return Paths.get("target").toAbsolutePath().toString();
    }

    public static String getRandomString(int length) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            stringBuilder.append(
                    (char) ThreadLocalRandom.current().nextInt(97, 122));

        }
        return stringBuilder.toString();
    }
}
