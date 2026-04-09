package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1776r0 implements InterfaceC2046w0 {

    /* renamed from: b, reason: collision with root package name */
    public final IN f16443b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16444c;

    /* renamed from: d, reason: collision with root package name */
    public long f16445d;

    /* renamed from: f, reason: collision with root package name */
    public int f16447f;

    /* renamed from: g, reason: collision with root package name */
    public int f16448g;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f16446e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f16442a = new byte[4096];

    static {
        AbstractC2102x2.a("media3.extractor");
    }

    public C1776r0(IN in, long j6, long j7) {
        this.f16443b = in;
        this.f16445d = j6;
        this.f16444c = j7;
    }

    public final boolean b(int i, boolean z6) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f16448g, i);
        j(iMin);
        int iK = iMin;
        while (iK < i && iK != -1) {
            iK = k(this.f16442a, -iK, Math.min(i, iK + 4096), iK, z6);
        }
        if (iK != -1) {
            this.f16445d += iK;
        }
        return iK != -1;
    }

    @Override // com.google.android.gms.internal.ads.IN
    public final int d(int i, int i3, byte[] bArr) throws EOFException, InterruptedIOException {
        C1776r0 c1776r0;
        int i6 = this.f16448g;
        int iK = 0;
        if (i6 != 0) {
            int iMin = Math.min(i6, i3);
            System.arraycopy(this.f16446e, 0, bArr, i, iMin);
            j(iMin);
            iK = iMin;
        }
        if (iK == 0) {
            c1776r0 = this;
            iK = c1776r0.k(bArr, i, i3, 0, true);
        } else {
            c1776r0 = this;
        }
        if (iK != -1) {
            c1776r0.f16445d += iK;
        }
        return iK;
    }

    public final boolean e(int i, boolean z6) throws EOFException, InterruptedIOException {
        g(i);
        int iK = this.f16448g - this.f16447f;
        while (iK < i) {
            int i3 = i;
            boolean z7 = z6;
            iK = k(this.f16446e, this.f16447f, i3, iK, z7);
            if (iK == -1) {
                return false;
            }
            this.f16448g = this.f16447f + iK;
            i = i3;
            z6 = z7;
        }
        this.f16447f += i;
        return true;
    }

    public final void g(int i) {
        int i3 = this.f16447f + i;
        int length = this.f16446e.length;
        if (i3 > length) {
            String str = Vt.f12096a;
            this.f16446e = Arrays.copyOf(this.f16446e, Math.max(65536 + i3, Math.min(length + length, i3 + 524288)));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2046w0
    public final void i() {
        this.f16447f = 0;
    }

    public final void j(int i) {
        int i3 = this.f16448g - i;
        this.f16448g = i3;
        this.f16447f = 0;
        byte[] bArr = this.f16446e;
        byte[] bArr2 = i3 < bArr.length + (-524288) ? new byte[65536 + i3] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i3);
        this.f16446e = bArr2;
    }

    public final int k(byte[] bArr, int i, int i3, int i6, boolean z6) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iD = this.f16443b.d(i + i6, i3 - i6, bArr);
        if (iD != -1) {
            return i6 + iD;
        }
        if (i6 == 0 && z6) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2046w0
    public final int m() throws EOFException, InterruptedIOException {
        C1776r0 c1776r0;
        int iMin = Math.min(this.f16448g, 1);
        j(iMin);
        if (iMin == 0) {
            c1776r0 = this;
            iMin = c1776r0.k(this.f16442a, 0, Math.min(1, 4096), 0, true);
        } else {
            c1776r0 = this;
        }
        if (iMin != -1) {
            c1776r0.f16445d += iMin;
        }
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2046w0
    public final long n() {
        return this.f16445d + this.f16447f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2046w0
    public final long o() {
        return this.f16445d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2046w0
    public final long p() {
        return this.f16444c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2046w0
    public final void r(int i) throws EOFException, InterruptedIOException {
        e(i, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2046w0
    public final void s(int i, int i3, byte[] bArr) throws EOFException, InterruptedIOException {
        w(bArr, i, i3, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2046w0
    public final void t(int i) throws EOFException, InterruptedIOException {
        b(i, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2046w0
    public final void v(int i, int i3, byte[] bArr) {
        y(bArr, i, i3, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2046w0
    public final boolean w(byte[] bArr, int i, int i3, boolean z6) throws EOFException, InterruptedIOException {
        int iMin;
        int i6 = this.f16448g;
        if (i6 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i6, i3);
            System.arraycopy(this.f16446e, 0, bArr, i, iMin);
            j(iMin);
        }
        int iK = iMin;
        while (iK < i3 && iK != -1) {
            iK = k(bArr, i, i3, iK, z6);
        }
        if (iK != -1) {
            this.f16445d += iK;
        }
        return iK != -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2046w0
    public final boolean y(byte[] bArr, int i, int i3, boolean z6) {
        if (!e(i3, z6)) {
            return false;
        }
        System.arraycopy(this.f16446e, this.f16447f - i3, bArr, i, i3);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2046w0
    public final int z(int i, int i3, byte[] bArr) throws EOFException, InterruptedIOException {
        C1776r0 c1776r0;
        int iMin;
        g(i3);
        int i6 = this.f16448g;
        int i7 = this.f16447f;
        int i8 = i6 - i7;
        if (i8 == 0) {
            c1776r0 = this;
            iMin = c1776r0.k(this.f16446e, i7, i3, 0, true);
            if (iMin == -1) {
                return -1;
            }
            c1776r0.f16448g += iMin;
        } else {
            c1776r0 = this;
            iMin = Math.min(i3, i8);
        }
        System.arraycopy(c1776r0.f16446e, c1776r0.f16447f, bArr, i, iMin);
        c1776r0.f16447f += iMin;
        return iMin;
    }
}
