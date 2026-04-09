package com.bytedance.sdk.component.ypw.emc.emc.emc;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public class uym extends InputStream {
    InputStream emc;
    HttpURLConnection ypw;

    public uym(InputStream inputStream, HttpURLConnection httpURLConnection) {
        this.emc = inputStream;
        this.ypw = httpURLConnection;
    }

    @Override // java.io.InputStream
    public int available() {
        InputStream inputStream = this.emc;
        if (inputStream != null) {
            return inputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.emc;
        if (inputStream != null) {
            inputStream.close();
            this.emc = null;
        }
        HttpURLConnection httpURLConnection = this.ypw;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.ypw = null;
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        InputStream inputStream = this.emc;
        if (inputStream != null) {
            inputStream.mark(i);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        InputStream inputStream = this.emc;
        if (inputStream != null) {
            return inputStream.markSupported();
        }
        return false;
    }

    @Override // java.io.InputStream
    public int read() {
        InputStream inputStream = this.emc;
        if (inputStream != null) {
            return inputStream.read();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        InputStream inputStream = this.emc;
        if (inputStream != null) {
            inputStream.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j6) {
        InputStream inputStream = this.emc;
        if (inputStream != null) {
            return inputStream.skip(j6);
        }
        return 0L;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        InputStream inputStream = this.emc;
        if (inputStream != null) {
            return inputStream.read(bArr);
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i3) {
        InputStream inputStream = this.emc;
        if (inputStream != null) {
            return inputStream.read(bArr, i, i3);
        }
        return 0;
    }
}
