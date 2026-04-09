package com.google.android.gms.internal.ads;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class qa extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15268a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f15269b;

    /* renamed from: c, reason: collision with root package name */
    public long f15270c;

    public qa(BufferedInputStream bufferedInputStream, long j) {
        super(bufferedInputStream);
        this.f15269b = j;
    }

    private final synchronized void c(int i4) {
        ((FilterInputStream) this).in.mark(i4);
        this.f15270c = this.f15269b;
    }

    private final synchronized void e() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f15270c == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f15269b = this.f15270c;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        switch (this.f15268a) {
            case 1:
                return (int) Math.min(((FilterInputStream) this).in.available(), this.f15269b);
            default:
                return super.available();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i4) {
        switch (this.f15268a) {
            case 1:
                c(i4);
                break;
            default:
                super.mark(i4);
                break;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        switch (this.f15268a) {
            case 0:
                int i4 = super.read();
                if (i4 != -1) {
                    this.f15270c++;
                }
                return i4;
            default:
                if (this.f15269b == 0) {
                    return -1;
                }
                int i10 = ((FilterInputStream) this).in.read();
                if (i10 != -1) {
                    this.f15269b--;
                }
                return i10;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        switch (this.f15268a) {
            case 1:
                e();
                break;
            default:
                super.reset();
                break;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        switch (this.f15268a) {
            case 1:
                long jSkip = ((FilterInputStream) this).in.skip(Math.min(j, this.f15269b));
                this.f15269b -= jSkip;
                return jSkip;
            default:
                return super.skip(j);
        }
    }

    public qa(InputStream inputStream, long j) {
        super(inputStream);
        this.f15270c = -1L;
        inputStream.getClass();
        mq0.y("limit must be non-negative", j >= 0);
        this.f15269b = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i4, int i10) throws IOException {
        switch (this.f15268a) {
            case 0:
                int i11 = super.read(bArr, i4, i10);
                if (i11 != -1) {
                    this.f15270c += i11;
                }
                return i11;
            default:
                long j = this.f15269b;
                if (j == 0) {
                    return -1;
                }
                int i12 = ((FilterInputStream) this).in.read(bArr, i4, (int) Math.min(i10, j));
                if (i12 != -1) {
                    this.f15269b -= i12;
                }
                return i12;
        }
    }
}
