package com.google.android.gms.internal.ads;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class L4 extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9616a = 1;

    /* renamed from: b, reason: collision with root package name */
    public long f9617b;

    /* renamed from: c, reason: collision with root package name */
    public long f9618c;

    public L4(long j6, InputStream inputStream) {
        super(inputStream);
        this.f9618c = -1L;
        inputStream.getClass();
        AbstractC0582Jp.y("limit must be non-negative", j6 >= 0);
        this.f9617b = j6;
    }

    private final synchronized void a(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.f9618c = this.f9617b;
    }

    private final synchronized void b() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f9618c == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f9617b = this.f9618c;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        switch (this.f9616a) {
            case 1:
                return (int) Math.min(((FilterInputStream) this).in.available(), this.f9617b);
            default:
                return super.available();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        switch (this.f9616a) {
            case 1:
                a(i);
                break;
            default:
                super.mark(i);
                break;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        switch (this.f9616a) {
            case 0:
                int i = super.read();
                if (i != -1) {
                    this.f9618c++;
                }
                return i;
            default:
                if (this.f9617b == 0) {
                    return -1;
                }
                int i3 = ((FilterInputStream) this).in.read();
                if (i3 != -1) {
                    this.f9617b--;
                }
                return i3;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        switch (this.f9616a) {
            case 1:
                b();
                break;
            default:
                super.reset();
                break;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j6) throws IOException {
        switch (this.f9616a) {
            case 1:
                long jSkip = ((FilterInputStream) this).in.skip(Math.min(j6, this.f9617b));
                this.f9617b -= jSkip;
                return jSkip;
            default:
                return super.skip(j6);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i3) throws IOException {
        switch (this.f9616a) {
            case 0:
                int i6 = super.read(bArr, i, i3);
                if (i6 != -1) {
                    this.f9618c += i6;
                }
                return i6;
            default:
                long j6 = this.f9617b;
                if (j6 == 0) {
                    return -1;
                }
                int i7 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i3, j6));
                if (i7 != -1) {
                    this.f9617b -= i7;
                }
                return i7;
        }
    }

    public L4(BufferedInputStream bufferedInputStream, long j6) {
        super(bufferedInputStream);
        this.f9617b = j6;
    }
}
