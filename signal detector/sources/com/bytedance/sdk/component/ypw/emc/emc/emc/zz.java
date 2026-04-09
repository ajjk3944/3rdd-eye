package com.bytedance.sdk.component.ypw.emc.emc.emc;

import com.bytedance.sdk.component.ypw.emc.cf;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public class zz extends cf {
    HttpURLConnection emc;
    InputStream ypw;

    public zz(HttpURLConnection httpURLConnection) {
        this.emc = httpURLConnection;
        this.ypw = new uym(httpURLConnection.getInputStream(), httpURLConnection);
    }

    @Override // com.bytedance.sdk.component.ypw.emc.cf
    public com.bytedance.sdk.component.ypw.emc.zz bw() {
        if (this.emc.getContentType() != null) {
            return com.bytedance.sdk.component.ypw.emc.zz.emc(this.emc.getContentType());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.ypw.emc.cf, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.ypw.close();
            this.emc.disconnect();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.ypw.emc.cf
    public byte[] dg() throws IOException {
        try {
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i = this.ypw.read(bArr);
                if (i == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    @Override // com.bytedance.sdk.component.ypw.emc.cf
    public long emc() {
        try {
            return this.emc.getContentLength();
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // com.bytedance.sdk.component.ypw.emc.cf
    public InputStream xq() {
        return this.ypw;
    }

    @Override // com.bytedance.sdk.component.ypw.emc.cf
    public String ypw() throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.ypw));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    String string = stringBuffer.toString();
                    close();
                    return string;
                }
                stringBuffer.append(line + "\n");
            }
        } catch (Exception unused) {
            return "";
        }
    }

    public zz(HttpURLConnection httpURLConnection, InputStream inputStream) {
        this.emc = httpURLConnection;
        this.ypw = new uym(inputStream, httpURLConnection);
    }
}
