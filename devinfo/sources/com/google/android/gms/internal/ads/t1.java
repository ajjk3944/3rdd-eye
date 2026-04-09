package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.internal.Buffer;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t1 implements y1 {

    /* renamed from: b, reason: collision with root package name */
    public final vs1 f16634b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16635c;

    /* renamed from: d, reason: collision with root package name */
    public long f16636d;

    /* renamed from: f, reason: collision with root package name */
    public int f16638f;
    public int g;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f16637e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f16633a = new byte[Buffer.SEGMENTING_THRESHOLD];

    static {
        y5.a("media3.extractor");
    }

    public t1(vs1 vs1Var, long j, long j8) {
        this.f16634b = vs1Var;
        this.f16636d = j;
        this.f16635c = j8;
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void B1() {
        this.f16638f = 0;
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final long F1() {
        return this.f16636d + this.f16638f;
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final long G1() {
        return this.f16636d;
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final long H1() {
        return this.f16635c;
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void J1(int i4) throws EOFException, InterruptedIOException {
        e(i4, false);
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void K1(int i4) throws EOFException, InterruptedIOException {
        c(i4, false);
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void L1(int i4, int i10, byte[] bArr) throws EOFException, InterruptedIOException {
        N1(bArr, i4, i10, false);
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final void M1(int i4, int i10, byte[] bArr) {
        O1(bArr, i4, i10, false);
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final boolean N1(byte[] bArr, int i4, int i10, boolean z3) throws EOFException, InterruptedIOException {
        int iMin;
        int i11 = this.g;
        if (i11 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i11, i10);
            System.arraycopy(this.f16637e, 0, bArr, i4, iMin);
            h(iMin);
        }
        int i12 = iMin;
        while (i12 < i10 && i12 != -1) {
            i12 = i(bArr, i4, i10, i12, z3);
        }
        if (i12 != -1) {
            this.f16636d += i12;
        }
        return i12 != -1;
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final boolean O1(byte[] bArr, int i4, int i10, boolean z3) {
        if (!e(i10, z3)) {
            return false;
        }
        System.arraycopy(this.f16637e, this.f16638f - i10, bArr, i4, i10);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final int P1(int i4, int i10, byte[] bArr) throws EOFException, InterruptedIOException {
        t1 t1Var;
        int iMin;
        g(i10);
        int i11 = this.g;
        int i12 = this.f16638f;
        int i13 = i11 - i12;
        if (i13 == 0) {
            t1Var = this;
            iMin = t1Var.i(this.f16637e, i12, i10, 0, true);
            if (iMin == -1) {
                return -1;
            }
            t1Var.g += iMin;
        } else {
            t1Var = this;
            iMin = Math.min(i10, i13);
        }
        System.arraycopy(t1Var.f16637e, t1Var.f16638f, bArr, i4, iMin);
        t1Var.f16638f += iMin;
        return iMin;
    }

    public final boolean c(int i4, boolean z3) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.g, i4);
        h(iMin);
        int i10 = iMin;
        while (i10 < i4 && i10 != -1) {
            i10 = i(this.f16633a, -i10, Math.min(i4, i10 + Buffer.SEGMENTING_THRESHOLD), i10, z3);
        }
        if (i10 != -1) {
            this.f16636d += i10;
        }
        return i10 != -1;
    }

    @Override // com.google.android.gms.internal.ads.vs1
    public final int d(int i4, int i10, byte[] bArr) throws EOFException, InterruptedIOException {
        t1 t1Var;
        int i11 = this.g;
        int i12 = 0;
        if (i11 != 0) {
            int iMin = Math.min(i11, i10);
            System.arraycopy(this.f16637e, 0, bArr, i4, iMin);
            h(iMin);
            i12 = iMin;
        }
        if (i12 == 0) {
            t1Var = this;
            i12 = t1Var.i(bArr, i4, i10, 0, true);
        } else {
            t1Var = this;
        }
        if (i12 != -1) {
            t1Var.f16636d += i12;
        }
        return i12;
    }

    public final boolean e(int i4, boolean z3) throws EOFException, InterruptedIOException {
        g(i4);
        int i10 = this.g - this.f16638f;
        while (i10 < i4) {
            int i11 = i4;
            boolean z10 = z3;
            i10 = i(this.f16637e, this.f16638f, i11, i10, z10);
            if (i10 == -1) {
                return false;
            }
            this.g = this.f16638f + i10;
            i4 = i11;
            z3 = z10;
        }
        this.f16638f += i4;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.y1
    public final int f() throws EOFException, InterruptedIOException {
        t1 t1Var;
        int iMin = Math.min(this.g, 1);
        h(iMin);
        if (iMin == 0) {
            t1Var = this;
            iMin = t1Var.i(this.f16633a, 0, Math.min(1, Buffer.SEGMENTING_THRESHOLD), 0, true);
        } else {
            t1Var = this;
        }
        if (iMin != -1) {
            t1Var.f16636d += iMin;
        }
        return iMin;
    }

    public final void g(int i4) {
        int i10 = this.f16638f + i4;
        int length = this.f16637e.length;
        if (i10 > length) {
            String str = bq0.f9768a;
            this.f16637e = Arrays.copyOf(this.f16637e, Math.max(65536 + i10, Math.min(length + length, i10 + 524288)));
        }
    }

    public final void h(int i4) {
        int i10 = this.g - i4;
        this.g = i10;
        this.f16638f = 0;
        byte[] bArr = this.f16637e;
        byte[] bArr2 = i10 < bArr.length + (-524288) ? new byte[65536 + i10] : bArr;
        System.arraycopy(bArr, i4, bArr2, 0, i10);
        this.f16637e = bArr2;
    }

    public final int i(byte[] bArr, int i4, int i10, int i11, boolean z3) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iD = this.f16634b.d(i4 + i11, i10 - i11, bArr);
        if (iD != -1) {
            return i11 + iD;
        }
        if (i11 == 0 && z3) {
            return -1;
        }
        throw new EOFException();
    }
}
