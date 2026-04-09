package b8;

import android.content.Context;
import android.database.SQLException;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.Command;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes3.dex */
public abstract class a {
    public static e a(Context context) {
        e eVar;
        e eVar2 = null;
        try {
            eVar = new e(context);
        } catch (Exception e10) {
            e = e10;
        }
        try {
            if (eVar.f4635b != null) {
                return eVar;
            }
            eVar.h();
            return eVar;
        } catch (Exception e11) {
            e = e11;
            eVar2 = eVar;
            c.a("HardwareUtils getVendorDatabase exception", e);
            return eVar2;
        }
    }

    public static String b(Context context, e eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return "Unknow";
        }
        String upperCase = str.replaceAll("[:]", "").substring(0, 6).toUpperCase();
        if (eVar == null) {
            eVar = a(context);
        }
        if (eVar == null) {
            return "Unknow";
        }
        String strJ = eVar.j(upperCase);
        eVar.close();
        return strJ;
    }

    public static String c(Context context, e eVar, String str) {
        String strD = "Unknow";
        if (eVar == null) {
            eVar = a(context);
        }
        try {
            strD = d(str, "https://api.macvendors.com/");
            e(eVar, str, strD);
        } catch (Exception e10) {
            c.a("HardwareUtils requestMacAndSave exception", e10);
            try {
                strD = d(str, "http://23.239.14.55/");
                e(eVar, str, strD);
            } catch (Exception unused) {
                c.a("HardwareUtils requestMacAndSave ip exception", e10);
            }
        }
        eVar.close();
        return strD;
    }

    public static String d(String str, String str2) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2 + str.replaceAll("[:]", "-")).openConnection();
        httpURLConnection.setConnectTimeout(2000);
        httpURLConnection.setReadTimeout(2000);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, "test");
        httpURLConnection.setRequestProperty("Connection", "close");
        httpURLConnection.connect();
        httpURLConnection.getResponseCode();
        InputStream inputStream = httpURLConnection.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line = bufferedReader.readLine();
        try {
            if ("Vendor not found".equals(line)) {
                line = "Unknow";
            }
            return line;
        } finally {
            inputStream.close();
            bufferedReader.close();
        }
    }

    public static void e(e eVar, String str, String str2) throws SQLException {
        if (eVar != null) {
            eVar.k(str.replaceAll("[:]", "").substring(0, 6).toUpperCase(), str2);
        }
    }
}
