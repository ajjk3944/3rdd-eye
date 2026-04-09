package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i extends FilterInputStream {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f6524c = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final int f6525d = 31;

    /* renamed from: a, reason: collision with root package name */
    public final byte f6526a;

    /* renamed from: b, reason: collision with root package name */
    public int f6527b;

    public i(InputStream inputStream, int i4) {
        super(inputStream);
        if (i4 < -1 || i4 > 8) {
            throw new IllegalArgumentException(u.r(i4, "Cannot add invalid orientation: "));
        }
        this.f6526a = (byte) i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int i4;
        int i10 = this.f6527b;
        int i11 = (i10 < 2 || i10 > (i4 = f6525d)) ? super.read() : i10 == i4 ? this.f6526a : f6524c[i10 - 2] & 255;
        if (i11 != -1) {
            this.f6527b++;
        }
        return i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (jSkip > 0) {
            this.f6527b = (int) (this.f6527b + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i4, int i10) throws IOException {
        int i11;
        int i12 = this.f6527b;
        int i13 = f6525d;
        if (i12 > i13) {
            i11 = super.read(bArr, i4, i10);
        } else if (i12 == i13) {
            bArr[i4] = this.f6526a;
            i11 = 1;
        } else if (i12 < 2) {
            i11 = super.read(bArr, i4, 2 - i12);
        } else {
            int iMin = Math.min(i13 - i12, i10);
            System.arraycopy(f6524c, this.f6527b - 2, bArr, i4, iMin);
            i11 = iMin;
        }
        if (i11 > 0) {
            this.f6527b += i11;
        }
        return i11;
    }
}
