package com.bumptech.glide.load.data;

import g0.C4356c;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ExifOrientationStream.java */
/* loaded from: classes.dex */
public final class g extends FilterInputStream {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f22305d = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final int f22306e = 31;

    /* renamed from: b, reason: collision with root package name */
    public final byte f22307b;

    /* renamed from: c, reason: collision with root package name */
    public int f22308c;

    public g(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException(C4356c.h(i, "Cannot add invalid orientation: "));
        }
        this.f22307b = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i;
        int i10 = this.f22308c;
        int i11 = (i10 < 2 || i10 > (i = f22306e)) ? super.read() : i10 == i ? this.f22307b : f22305d[i10 - 2] & 255;
        if (i11 != -1) {
            this.f22308c++;
        }
        return i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j4) throws IOException {
        long jSkip = super.skip(j4);
        if (jSkip > 0) {
            this.f22308c = (int) (this.f22308c + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        int i11;
        int i12 = this.f22308c;
        int i13 = f22306e;
        if (i12 > i13) {
            i11 = super.read(bArr, i, i10);
        } else if (i12 == i13) {
            bArr[i] = this.f22307b;
            i11 = 1;
        } else if (i12 < 2) {
            i11 = super.read(bArr, i, 2 - i12);
        } else {
            int iMin = Math.min(i13 - i12, i10);
            System.arraycopy(f22305d, this.f22308c - 2, bArr, i, iMin);
            i11 = iMin;
        }
        if (i11 > 0) {
            this.f22308c += i11;
        }
        return i11;
    }
}
