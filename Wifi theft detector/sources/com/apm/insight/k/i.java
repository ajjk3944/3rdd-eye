package com.apm.insight.k;

import com.apm.insight.CustomRequestHeader;
import com.apm.insight.MonitorCrash;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f5093a;

    /* renamed from: b, reason: collision with root package name */
    private HttpURLConnection f5094b;

    /* renamed from: c, reason: collision with root package name */
    private String f5095c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5096d;

    /* renamed from: e, reason: collision with root package name */
    private f f5097e;

    /* renamed from: f, reason: collision with root package name */
    private k f5098f;

    public i(String str, String str2, boolean z10) throws IOException {
        this.f5095c = str2;
        this.f5096d = z10;
        String str3 = "AAA" + System.currentTimeMillis() + "AAA";
        this.f5093a = str3;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f5094b = httpURLConnection;
        httpURLConnection.setUseCaches(false);
        this.f5094b.setDoOutput(true);
        this.f5094b.setDoInput(true);
        this.f5094b.setRequestMethod("POST");
        CustomRequestHeader customRequestHeader = MonitorCrash.mCustomRequestHeader;
        if (customRequestHeader != null) {
            customRequestHeader.addRequestHeader(this.f5094b);
        }
        this.f5094b.setRequestProperty(CommonGatewayClient.HEADER_CONTENT_TYPE, "multipart/form-data; boundary=" + str3);
        if (!z10) {
            this.f5097e = new f(this.f5094b.getOutputStream());
        } else {
            this.f5094b.setRequestProperty("Content-Encoding", "gzip");
            this.f5098f = new k(this.f5094b.getOutputStream());
        }
    }

    public final void a(String str, String str2) throws IOException {
        b(str, str2);
    }

    public final void b(String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(this.f5093a);
        sb.append("\r\nContent-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"\r\nContent-Type: text/plain; charset=");
        sb.append(this.f5095c);
        sb.append("\r\n\r\n");
        try {
            if (this.f5096d) {
                this.f5098f.write(sb.toString().getBytes());
            } else {
                this.f5097e.write(sb.toString().getBytes());
            }
        } catch (IOException unused) {
        }
        byte[] bytes = str2.getBytes();
        try {
            if (this.f5096d) {
                this.f5098f.write(bytes);
                this.f5098f.write("\r\n".getBytes());
            } else {
                this.f5097e.write(bytes);
                this.f5097e.write("\r\n".getBytes());
            }
        } catch (IOException unused2) {
        }
    }

    public final void a(String str, File... fileArr) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(this.f5093a);
        sb.append("\r\nContent-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"; filename=\"");
        sb.append(str);
        sb.append("\"\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.f5096d) {
            this.f5098f.write(sb.toString().getBytes());
        } else {
            this.f5097e.write(sb.toString().getBytes());
        }
        if (this.f5096d) {
            com.apm.insight.l.f.a(this.f5098f, fileArr);
        } else {
            com.apm.insight.l.f.a(this.f5097e, fileArr);
        }
        if (this.f5096d) {
            this.f5098f.write("\r\n".getBytes());
        } else {
            this.f5097e.write("\r\n".getBytes());
            this.f5097e.flush();
        }
    }

    public final void a(String str, File file, Map<String, String> map) throws IOException {
        String name = file.getName();
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(this.f5093a);
        sb.append("\r\nContent-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"; filename=\"");
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
        if (this.f5096d) {
            this.f5098f.write(sb.toString().getBytes());
        } else {
            this.f5097e.write(sb.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[8192];
        while (true) {
            int i10 = fileInputStream.read(bArr);
            if (i10 == -1) {
                break;
            } else if (this.f5096d) {
                this.f5098f.write(bArr, 0, i10);
            } else {
                this.f5097e.write(bArr, 0, i10);
            }
        }
        fileInputStream.close();
        if (this.f5096d) {
            this.f5098f.write("\r\n".getBytes());
        } else {
            this.f5097e.write("\r\n".getBytes());
            this.f5097e.flush();
        }
    }

    public final String a() throws IOException {
        ArrayList arrayList = new ArrayList();
        byte[] bytes = ("\r\n--" + this.f5093a + "--\r\n").getBytes();
        if (this.f5096d) {
            this.f5098f.write(bytes);
            this.f5098f.b();
            this.f5098f.a();
        } else {
            this.f5097e.write(bytes);
            this.f5097e.flush();
            this.f5097e.a();
        }
        int responseCode = this.f5094b.getResponseCode();
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f5094b.getInputStream()));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                arrayList.add(line);
            }
            bufferedReader.close();
            this.f5094b.disconnect();
            StringBuilder sb = new StringBuilder();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                sb.append((String) obj);
            }
            return sb.toString();
        }
        throw new IOException("Server returned non-OK status: ".concat(String.valueOf(responseCode)));
    }
}
