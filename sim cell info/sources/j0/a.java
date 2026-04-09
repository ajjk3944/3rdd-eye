package j0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* loaded from: classes.dex */
public class a {
    public static String a(String str) throws InterruptedException, IOException {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            Process processExec = Runtime.getRuntime().exec(str);
            processExec.waitFor();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            int i2 = 0;
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return stringBuffer.toString();
                }
                if (i2 != 0) {
                    stringBuffer.append("\n");
                }
                stringBuffer.append(line);
                i2++;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
