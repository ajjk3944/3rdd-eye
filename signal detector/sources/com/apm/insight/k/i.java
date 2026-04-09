package com.apm.insight.k;

import com.apm.insight.CustomRequestHeader;
import com.apm.insight.MonitorCrash;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f6270a;

    /* renamed from: b, reason: collision with root package name */
    private HttpURLConnection f6271b;

    /* renamed from: c, reason: collision with root package name */
    private String f6272c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6273d;

    /* renamed from: e, reason: collision with root package name */
    private f f6274e;

    /* renamed from: f, reason: collision with root package name */
    private k f6275f;

    public i(String str, String str2, boolean z6) throws ProtocolException {
        this.f6272c = str2;
        this.f6273d = z6;
        String str3 = "AAA" + System.currentTimeMillis() + "AAA";
        this.f6270a = str3;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f6271b = httpURLConnection;
        httpURLConnection.setUseCaches(false);
        this.f6271b.setDoOutput(true);
        this.f6271b.setDoInput(true);
        this.f6271b.setRequestMethod("POST");
        CustomRequestHeader customRequestHeader = MonitorCrash.mCustomRequestHeader;
        if (customRequestHeader != null) {
            customRequestHeader.addRequestHeader(this.f6271b);
        }
        this.f6271b.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + str3);
        if (!z6) {
            this.f6274e = new f(this.f6271b.getOutputStream());
        } else {
            this.f6271b.setRequestProperty("Content-Encoding", "gzip");
            this.f6275f = new k(this.f6271b.getOutputStream());
        }
    }

    public final void a(String str, String str2) throws IOException {
        b(str, str2);
    }

    public final void b(String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder("--");
        A.f.w(sb, this.f6270a, "\r\nContent-Disposition: form-data; name=\"", str, "\"\r\nContent-Type: text/plain; charset=");
        sb.append(this.f6272c);
        sb.append("\r\n\r\n");
        try {
            if (this.f6273d) {
                this.f6275f.write(sb.toString().getBytes());
            } else {
                this.f6274e.write(sb.toString().getBytes());
            }
        } catch (IOException unused) {
        }
        byte[] bytes = str2.getBytes();
        try {
            if (this.f6273d) {
                this.f6275f.write(bytes);
                this.f6275f.write("\r\n".getBytes());
            } else {
                this.f6274e.write(bytes);
                this.f6274e.write("\r\n".getBytes());
            }
        } catch (IOException unused2) {
        }
    }

    public final void a(String str, File... fileArr) throws Throwable {
        StringBuilder sb = new StringBuilder("--");
        A.f.w(sb, this.f6270a, "\r\nContent-Disposition: form-data; name=\"", str, "\"; filename=\"");
        sb.append(str);
        sb.append("\"\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.f6273d) {
            this.f6275f.write(sb.toString().getBytes());
        } else {
            this.f6274e.write(sb.toString().getBytes());
        }
        if (this.f6273d) {
            com.apm.insight.l.f.a(this.f6275f, fileArr);
        } else {
            com.apm.insight.l.f.a(this.f6274e, fileArr);
        }
        if (this.f6273d) {
            this.f6275f.write("\r\n".getBytes());
        } else {
            this.f6274e.write("\r\n".getBytes());
            this.f6274e.flush();
        }
    }

    public final void a(String str, File file, Map<String, String> map) throws IOException {
        String name = file.getName();
        StringBuilder sb = new StringBuilder("--");
        A.f.w(sb, this.f6270a, "\r\nContent-Disposition: form-data; name=\"", str, "\"; filename=\"");
        sb.append(name);
        sb.append("\"");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append("; ");
            sb.append(entry.getKey());
            sb.append("=\"");
            sb.append(entry.getValue());
            sb.append("\"");
        }
        sb.append("\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.f6273d) {
            this.f6275f.write(sb.toString().getBytes());
        } else {
            this.f6274e.write(sb.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[8192];
        while (true) {
            int i = fileInputStream.read(bArr);
            if (i == -1) {
                break;
            } else if (this.f6273d) {
                this.f6275f.write(bArr, 0, i);
            } else {
                this.f6274e.write(bArr, 0, i);
            }
        }
        fileInputStream.close();
        if (this.f6273d) {
            this.f6275f.write("\r\n".getBytes());
        } else {
            this.f6274e.write("\r\n".getBytes());
            this.f6274e.flush();
        }
    }

    public final String a() throws IOException {
        ArrayList arrayList = new ArrayList();
        byte[] bytes = ("\r\n--" + this.f6270a + "--\r\n").getBytes();
        if (this.f6273d) {
            this.f6275f.write(bytes);
            this.f6275f.b();
            this.f6275f.a();
        } else {
            this.f6274e.write(bytes);
            this.f6274e.flush();
            this.f6274e.a();
        }
        int responseCode = this.f6271b.getResponseCode();
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f6271b.getInputStream()));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                arrayList.add(line);
            }
            bufferedReader.close();
            this.f6271b.disconnect();
            StringBuilder sb = new StringBuilder();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                sb.append((String) obj);
            }
            return sb.toString();
        }
        throw new IOException("Server returned non-OK status: ".concat(String.valueOf(responseCode)));
    }
}
