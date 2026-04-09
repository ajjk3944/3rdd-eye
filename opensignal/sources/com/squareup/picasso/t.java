package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class t extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f5981a;

    /* renamed from: d, reason: collision with root package name */
    public long f5982d;

    /* renamed from: g, reason: collision with root package name */
    public long f5983g;

    /* renamed from: r, reason: collision with root package name */
    public long f5984r;

    /* renamed from: x, reason: collision with root package name */
    public long f5985x = -1;

    public t(InputStream inputStream) {
        this.f5981a = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, 4096);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f5981a.available();
    }

    public final void b(long j) throws IOException {
        if (this.f5982d > this.f5984r || j < this.f5983g) {
            throw new IOException("Cannot reset");
        }
        this.f5981a.reset();
        h(this.f5983g, j);
        this.f5982d = j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f5981a.close();
    }

    public final long f(int i10) throws IOException {
        long j = this.f5982d;
        long j7 = i10 + j;
        long j10 = this.f5984r;
        if (j10 < j7) {
            try {
                long j11 = this.f5983g;
                InputStream inputStream = this.f5981a;
                if (j11 >= j || j > j10) {
                    this.f5983g = j;
                    inputStream.mark((int) (j7 - j));
                } else {
                    inputStream.reset();
                    inputStream.mark((int) (j7 - this.f5983g));
                    h(this.f5983g, this.f5982d);
                }
                this.f5984r = j7;
            } catch (IOException e4) {
                throw new IllegalStateException("Unable to mark: " + e4);
            }
        }
        return this.f5982d;
    }

    public final void h(long j, long j7) throws IOException {
        while (j < j7) {
            long jSkip = this.f5981a.skip(j7 - j);
            if (jSkip == 0) {
                if (read() == -1) {
                    return;
                } else {
                    jSkip = 1;
                }
            }
            j += jSkip;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        this.f5985x = f(i10);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f5981a.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i10 = this.f5981a.read();
        if (i10 != -1) {
            this.f5982d++;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        b(this.f5985x);
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = this.f5981a.skip(j);
        this.f5982d += jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i10 = this.f5981a.read(bArr);
        if (i10 != -1) {
            this.f5982d += i10;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f5981a.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f5982d += i12;
        }
        return i12;
    }
}
