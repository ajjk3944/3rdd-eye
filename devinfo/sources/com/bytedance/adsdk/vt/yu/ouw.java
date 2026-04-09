package com.bytedance.adsdk.vt.yu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw implements yu {
    private final HttpURLConnection ouw;

    public ouw(HttpURLConnection httpURLConnection) {
        this.ouw = httpURLConnection;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.ouw.disconnect();
    }

    @Override // com.bytedance.adsdk.vt.yu.yu
    public final String lh() {
        return this.ouw.getContentType();
    }

    @Override // com.bytedance.adsdk.vt.yu.yu
    public final boolean ouw() {
        try {
            return this.ouw.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.bytedance.adsdk.vt.yu.yu
    public final InputStream vt() throws IOException {
        return this.ouw.getInputStream();
    }

    @Override // com.bytedance.adsdk.vt.yu.yu
    public final String yu() {
        try {
            if (ouw()) {
                return null;
            }
            return "Unable to fetch " + this.ouw.getURL() + ". Failed with " + this.ouw.getResponseCode() + "\n" + ouw(this.ouw);
        } catch (IOException e2) {
            com.bytedance.adsdk.vt.le.yu.ouw("get error failed ", e2);
            return e2.getMessage();
        }
    }

    private static String ouw(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb2.append(line);
                    sb2.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb2.toString();
    }
}
