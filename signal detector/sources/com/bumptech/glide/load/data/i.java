package com.bumptech.glide.load.data;

import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class i extends FilterInputStream {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f6546c = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final int f6547d = 31;

    /* renamed from: a, reason: collision with root package name */
    public final byte f6548a;

    /* renamed from: b, reason: collision with root package name */
    public int f6549b;

    public i(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException(AbstractC1135f5.l(i, "Cannot add invalid orientation: "));
        }
        this.f6548a = (byte) i;
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
    public final int read() {
        int i;
        int i3 = this.f6549b;
        int i6 = (i3 < 2 || i3 > (i = f6547d)) ? super.read() : i3 == i ? this.f6548a : f6546c[i3 - 2] & 255;
        if (i6 != -1) {
            this.f6549b++;
        }
        return i6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j6) throws IOException {
        long jSkip = super.skip(j6);
        if (jSkip > 0) {
            this.f6549b = (int) (this.f6549b + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i3) throws IOException {
        int i6;
        int i7 = this.f6549b;
        int i8 = f6547d;
        if (i7 > i8) {
            i6 = super.read(bArr, i, i3);
        } else if (i7 == i8) {
            bArr[i] = this.f6548a;
            i6 = 1;
        } else if (i7 < 2) {
            i6 = super.read(bArr, i, 2 - i7);
        } else {
            int iMin = Math.min(i8 - i7, i3);
            System.arraycopy(f6546c, this.f6549b - 2, bArr, i, iMin);
            i6 = iMin;
        }
        if (i6 > 0) {
            this.f6549b += i6;
        }
        return i6;
    }
}
