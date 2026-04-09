package com.apm.insight.k;

import com.apm.insight.CustomRequestHeader;
import com.apm.insight.MonitorCrash;
import com.applovin.shadow.okio.Segment;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f3312a;

    /* renamed from: b, reason: collision with root package name */
    private HttpURLConnection f3313b;

    /* renamed from: c, reason: collision with root package name */
    private String f3314c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3315d;

    /* renamed from: e, reason: collision with root package name */
    private f f3316e;

    /* renamed from: f, reason: collision with root package name */
    private k f3317f;

    public i(String str, String str2, boolean z3) throws IOException {
        this.f3314c = str2;
        this.f3315d = z3;
        String str3 = "AAA" + System.currentTimeMillis() + "AAA";
        this.f3312a = str3;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f3313b = httpURLConnection;
        httpURLConnection.setUseCaches(false);
        this.f3313b.setDoOutput(true);
        this.f3313b.setDoInput(true);
        this.f3313b.setRequestMethod("POST");
        CustomRequestHeader customRequestHeader = MonitorCrash.mCustomRequestHeader;
        if (customRequestHeader != null) {
            customRequestHeader.addRequestHeader(this.f3313b);
        }
        this.f3313b.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + str3);
        if (!z3) {
            this.f3316e = new f(this.f3313b.getOutputStream());
        } else {
            this.f3313b.setRequestProperty("Content-Encoding", "gzip");
            this.f3317f = new k(this.f3313b.getOutputStream());
        }
    }

    public final void a(String str, String str2) throws IOException {
        b(str, str2);
    }

    public final void b(String str, String str2) throws IOException {
        StringBuilder sb2 = new StringBuilder("--");
        u.B(sb2, this.f3312a, "\r\nContent-Disposition: form-data; name=\"", str, "\"\r\nContent-Type: text/plain; charset=");
        sb2.append(this.f3314c);
        sb2.append("\r\n\r\n");
        try {
            if (this.f3315d) {
                this.f3317f.write(sb2.toString().getBytes());
            } else {
                this.f3316e.write(sb2.toString().getBytes());
            }
        } catch (IOException unused) {
        }
        byte[] bytes = str2.getBytes();
        try {
            if (this.f3315d) {
                this.f3317f.write(bytes);
                this.f3317f.write("\r\n".getBytes());
            } else {
                this.f3316e.write(bytes);
                this.f3316e.write("\r\n".getBytes());
            }
        } catch (IOException unused2) {
        }
    }

    public final void a(String str, File... fileArr) throws IOException {
        StringBuilder sb2 = new StringBuilder("--");
        u.B(sb2, this.f3312a, "\r\nContent-Disposition: form-data; name=\"", str, "\"; filename=\"");
        sb2.append(str);
        sb2.append("\"\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.f3315d) {
            this.f3317f.write(sb2.toString().getBytes());
        } else {
            this.f3316e.write(sb2.toString().getBytes());
        }
        if (this.f3315d) {
            com.apm.insight.l.f.a(this.f3317f, fileArr);
        } else {
            com.apm.insight.l.f.a(this.f3316e, fileArr);
        }
        if (this.f3315d) {
            this.f3317f.write("\r\n".getBytes());
        } else {
            this.f3316e.write("\r\n".getBytes());
            this.f3316e.flush();
        }
    }

    public final void a(String str, File file, Map<String, String> map) throws IOException {
        String name = file.getName();
        StringBuilder sb2 = new StringBuilder("--");
        u.B(sb2, this.f3312a, "\r\nContent-Disposition: form-data; name=\"", str, "\"; filename=\"");
        sb2.append(name);
        sb2.append("\"");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb2.append("; ");
            sb2.append(entry.getKey());
            sb2.append("=\"");
            sb2.append(entry.getValue());
            sb2.append("\"");
        }
        sb2.append("\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.f3315d) {
            this.f3317f.write(sb2.toString().getBytes());
        } else {
            this.f3316e.write(sb2.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[Segment.SIZE];
        while (true) {
            int i4 = fileInputStream.read(bArr);
            if (i4 == -1) {
                break;
            } else if (this.f3315d) {
                this.f3317f.write(bArr, 0, i4);
            } else {
                this.f3316e.write(bArr, 0, i4);
            }
        }
        fileInputStream.close();
        if (this.f3315d) {
            this.f3317f.write("\r\n".getBytes());
        } else {
            this.f3316e.write("\r\n".getBytes());
            this.f3316e.flush();
        }
    }

    public final String a() throws IOException {
        ArrayList arrayList = new ArrayList();
        byte[] bytes = ("\r\n--" + this.f3312a + "--\r\n").getBytes();
        if (this.f3315d) {
            this.f3317f.write(bytes);
            this.f3317f.b();
            this.f3317f.a();
        } else {
            this.f3316e.write(bytes);
            this.f3316e.flush();
            this.f3316e.a();
        }
        int responseCode = this.f3313b.getResponseCode();
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f3313b.getInputStream()));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                arrayList.add(line);
            }
            bufferedReader.close();
            this.f3313b.disconnect();
            StringBuilder sb2 = new StringBuilder();
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                sb2.append((String) obj);
            }
            return sb2.toString();
        }
        throw new IOException("Server returned non-OK status: ".concat(String.valueOf(responseCode)));
    }
}
