package com.bytedance.sdk.component.vt.ouw.ouw.ouw;

import com.applovin.shadow.okio.Segment;
import com.bytedance.sdk.component.vt.ouw.ko;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class bly extends ko {
    HttpURLConnection ouw;
    InputStream vt;

    public bly(HttpURLConnection httpURLConnection) throws IOException {
        this.ouw = httpURLConnection;
        this.vt = new ra(httpURLConnection.getInputStream(), httpURLConnection);
    }

    @Override // com.bytedance.sdk.component.vt.ouw.ko, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            this.vt.close();
            this.ouw.disconnect();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.vt.ouw.ko
    public final com.bytedance.sdk.component.vt.ouw.bly fkw() {
        if (this.ouw.getContentType() != null) {
            return com.bytedance.sdk.component.vt.ouw.bly.ouw(this.ouw.getContentType());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.ko
    public final InputStream lh() {
        return this.vt;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.ko
    public final long ouw() {
        try {
            return this.ouw.getContentLength();
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // com.bytedance.sdk.component.vt.ouw.ko
    public final String vt() throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.vt));
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

    @Override // com.bytedance.sdk.component.vt.ouw.ko
    public final byte[] yu() throws IOException {
        try {
            byte[] bArr = new byte[Segment.SHARE_MINIMUM];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i4 = this.vt.read(bArr);
                if (i4 == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i4);
            }
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    public bly(HttpURLConnection httpURLConnection, InputStream inputStream) {
        this.ouw = httpURLConnection;
        this.vt = new ra(inputStream, httpURLConnection);
    }
}
