package b8;

import com.wifi.netdiscovery.consts.OS_TYPE;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public int f4631a = 0;

    /* renamed from: b, reason: collision with root package name */
    public StringBuffer f4632b = new StringBuffer();

    public OS_TYPE a() {
        try {
        } catch (Exception e10) {
            c.a("PingTester getOsType exception", e10);
        }
        if (this.f4632b.length() < 4) {
            return OS_TYPE.UNKNOWN;
        }
        String strSubstring = this.f4632b.toString().substring(this.f4632b.toString().indexOf("ttl=") + 4);
        String strSubstring2 = strSubstring.substring(0, strSubstring.indexOf(" "));
        if ("64".equals(strSubstring2)) {
            return OS_TYPE.UNKNOWN;
        }
        if (!"128".equals(strSubstring2) && !"32".equals(strSubstring2)) {
            if ("256".equals(strSubstring2)) {
                return OS_TYPE.UNKNOWN;
            }
            return OS_TYPE.UNKNOWN;
        }
        return OS_TYPE.WINDOWS;
    }

    public int b() {
        return this.f4631a;
    }

    public void c(String str) throws IOException {
        Process processExec = Runtime.getRuntime().exec("ping -c 1 " + str);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
        StringBuffer stringBuffer = this.f4632b;
        stringBuffer.delete(0, stringBuffer.length());
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                this.f4631a = processExec.waitFor();
                return;
            } else {
                StringBuffer stringBuffer2 = this.f4632b;
                stringBuffer2.append(line);
                stringBuffer2.append("\n");
            }
        }
    }
}
