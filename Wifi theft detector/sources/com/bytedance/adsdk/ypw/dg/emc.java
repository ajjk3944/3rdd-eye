package com.bytedance.adsdk.ypw.dg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public class emc implements dg {
    private final HttpURLConnection emc;

    public emc(HttpURLConnection httpURLConnection) {
        this.emc = httpURLConnection;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.emc.disconnect();
    }

    @Override // com.bytedance.adsdk.ypw.dg.dg
    public String dg() {
        try {
            if (emc()) {
                return null;
            }
            return "Unable to fetch " + this.emc.getURL() + ". Failed with " + this.emc.getResponseCode() + "\n" + emc(this.emc);
        } catch (IOException e10) {
            return e10.getMessage();
        }
    }

    @Override // com.bytedance.adsdk.ypw.dg.dg
    public boolean emc() {
        try {
            return this.emc.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.bytedance.adsdk.ypw.dg.dg
    public String xq() {
        return this.emc.getContentType();
    }

    @Override // com.bytedance.adsdk.ypw.dg.dg
    public InputStream ypw() throws IOException {
        return this.emc.getInputStream();
    }

    private String emc(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                    sb.append('\n');
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
        return sb.toString();
    }
}
