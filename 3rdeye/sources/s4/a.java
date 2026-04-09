package S4;

import B4.g;
import N7.G8;
import com.singular.sdk.internal.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: HttpGetRequest.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f11908a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f11909b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f11910c = new HashMap();

    public a(String str, HashMap map) {
        this.f11908a = str;
        this.f11909b = map;
    }

    public static String a(String str, HashMap map) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
        sb.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), Constants.ENCODING) : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append("=");
            sb.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), Constants.ENCODING) : "");
        }
        String string = sb.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return g.o(str, "?", string);
        }
        if (!str.endsWith("&")) {
            string = "&".concat(string);
        }
        return G8.s(str, string);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final S4.b b() throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = "FirebaseCrashlytics"
            java.lang.String r1 = "GET Request URL: "
            r2 = 0
            java.lang.String r3 = r8.f11908a     // Catch: java.lang.Throwable -> Lab
            java.util.HashMap r4 = r8.f11909b     // Catch: java.lang.Throwable -> Lab
            java.lang.String r3 = a(r3, r4)     // Catch: java.lang.Throwable -> Lab
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lab
            r4.<init>(r1)     // Catch: java.lang.Throwable -> Lab
            r4.append(r3)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> Lab
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L24
            if (r4 == 0) goto L27
            android.util.Log.v(r0, r1, r2)     // Catch: java.lang.Throwable -> L24
            goto L27
        L24:
            r0 = move-exception
            goto Lae
        L27:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> Lab
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Lab
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> Lab
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch: java.lang.Throwable -> Lab
            r1 = 10000(0x2710, float:1.4013E-41)
            r0.setReadTimeout(r1)     // Catch: java.lang.Throwable -> L65
            r0.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L65
            java.lang.String r1 = "GET"
            r0.setRequestMethod(r1)     // Catch: java.lang.Throwable -> L65
            java.util.HashMap r1 = r8.f11910c     // Catch: java.lang.Throwable -> L65
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L65
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L65
        L49:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto L67
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L65
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L65
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L65
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L65
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L65
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L65
            r0.addRequestProperty(r4, r3)     // Catch: java.lang.Throwable -> L65
            goto L49
        L65:
            r1 = move-exception
            goto Lb0
        L67:
            r0.connect()     // Catch: java.lang.Throwable -> L65
            int r1 = r0.getResponseCode()     // Catch: java.lang.Throwable -> L65
            java.io.InputStream r3 = r0.getInputStream()     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto L9d
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L9a
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L9a
            java.lang.String r5 = "UTF-8"
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L9a
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L9a
            r4 = 8192(0x2000, float:1.148E-41)
            char[] r4 = new char[r4]     // Catch: java.lang.Throwable -> L9a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9a
            r5.<init>()     // Catch: java.lang.Throwable -> L9a
        L89:
            int r6 = r2.read(r4)     // Catch: java.lang.Throwable -> L9a
            r7 = -1
            if (r6 == r7) goto L95
            r7 = 0
            r5.append(r4, r7, r6)     // Catch: java.lang.Throwable -> L9a
            goto L89
        L95:
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L9a
            goto L9d
        L9a:
            r1 = move-exception
            r2 = r3
            goto Lb0
        L9d:
            if (r3 == 0) goto La2
            r3.close()
        La2:
            r0.disconnect()
            S4.b r0 = new S4.b
            r0.<init>(r1, r2)
            return r0
        Lab:
            r1 = move-exception
        Lac:
            r0 = r2
            goto Lb0
        Lae:
            r1 = r0
            goto Lac
        Lb0:
            if (r2 == 0) goto Lb5
            r2.close()
        Lb5:
            if (r0 == 0) goto Lba
            r0.disconnect()
        Lba:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: S4.a.b():S4.b");
    }

    public final void c(String str, String str2) {
        this.f11910c.put(str, str2);
    }
}
