package com.bytedance.sdk.component.vt.ouw.ouw.ouw;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ra extends InputStream {
    InputStream ouw;
    HttpURLConnection vt;

    public ra(InputStream inputStream, HttpURLConnection httpURLConnection) {
        this.ouw = inputStream;
        this.vt = httpURLConnection;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        InputStream inputStream = this.ouw;
        if (inputStream != null) {
            return inputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.ouw;
        if (inputStream != null) {
            inputStream.close();
            this.ouw = null;
        }
        HttpURLConnection httpURLConnection = this.vt;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.vt = null;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i4) {
        InputStream inputStream = this.ouw;
        if (inputStream != null) {
            inputStream.mark(i4);
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        InputStream inputStream = this.ouw;
        if (inputStream != null) {
            return inputStream.markSupported();
        }
        return false;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        InputStream inputStream = this.ouw;
        if (inputStream != null) {
            return inputStream.read();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        InputStream inputStream = this.ouw;
        if (inputStream != null) {
            inputStream.reset();
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        InputStream inputStream = this.ouw;
        if (inputStream != null) {
            return inputStream.skip(j);
        }
        return 0L;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        InputStream inputStream = this.ouw;
        if (inputStream != null) {
            return inputStream.read(bArr);
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i4, int i10) throws IOException {
        InputStream inputStream = this.ouw;
        if (inputStream != null) {
            return inputStream.read(bArr, i4, i10);
        }
        return 0;
    }
}
