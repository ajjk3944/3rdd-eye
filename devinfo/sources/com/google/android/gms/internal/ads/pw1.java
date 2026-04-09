package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class pw1 extends z10 {

    /* renamed from: i, reason: collision with root package name */
    public int f15126i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f15127k;

    /* renamed from: l, reason: collision with root package name */
    public int f15128l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f15129m;

    /* renamed from: n, reason: collision with root package name */
    public int f15130n;

    /* renamed from: o, reason: collision with root package name */
    public long f15131o;

    @Override // com.google.android.gms.internal.ads.q10
    public final void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i4 = iLimit - iPosition;
        if (i4 == 0) {
            return;
        }
        int iMin = Math.min(i4, this.f15128l);
        this.f15131o += iMin / this.f18954b.f12561d;
        this.f15128l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f15128l <= 0) {
            int i10 = i4 - iMin;
            int length = (this.f15130n + i10) - this.f15129m.length;
            ByteBuffer byteBufferF = f(length);
            int i11 = this.f15130n;
            String str = bq0.f9768a;
            int iMax = Math.max(0, Math.min(length, i11));
            byteBufferF.put(this.f15129m, 0, iMax);
            int iMax2 = Math.max(0, Math.min(length - iMax, i10));
            byteBuffer.limit(byteBuffer.position() + iMax2);
            byteBufferF.put(byteBuffer);
            byteBuffer.limit(iLimit);
            int i12 = i10 - iMax2;
            int i13 = this.f15130n - iMax;
            this.f15130n = i13;
            byte[] bArr = this.f15129m;
            System.arraycopy(bArr, iMax, bArr, 0, i13);
            byteBuffer.get(this.f15129m, this.f15130n, i12);
            this.f15130n += i12;
            byteBufferF.flip();
        }
    }

    @Override // com.google.android.gms.internal.ads.z10, com.google.android.gms.internal.ads.q10
    public final ByteBuffer d() {
        int i4;
        if (super.e() && (i4 = this.f15130n) > 0) {
            f(i4).put(this.f15129m, 0, this.f15130n).flip();
            this.f15130n = 0;
        }
        return super.d();
    }

    @Override // com.google.android.gms.internal.ads.z10, com.google.android.gms.internal.ads.q10
    public final boolean e() {
        return super.e() && this.f15130n == 0;
    }

    @Override // com.google.android.gms.internal.ads.z10, com.google.android.gms.internal.ads.q10
    public final long g(long j) {
        return Math.max(0L, j - bq0.t(this.f18954b.f12558a, this.j + this.f15126i));
    }

    @Override // com.google.android.gms.internal.ads.z10
    public final j00 h(j00 j00Var) throws f10 {
        if (!bq0.a(j00Var.f12560c)) {
            throw new f10("Unhandled input format:", j00Var);
        }
        this.f15127k = true;
        return (this.f15126i == 0 && this.j == 0) ? j00.f12557e : j00Var;
    }

    @Override // com.google.android.gms.internal.ads.z10
    public final void i() {
        if (this.f15127k) {
            if (this.f15130n > 0) {
                this.f15131o += r0 / this.f18954b.f12561d;
            }
            this.f15130n = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.z10
    public final void j() {
        if (this.f15127k) {
            this.f15127k = false;
            int i4 = this.j;
            int i10 = this.f18954b.f12561d;
            this.f15129m = new byte[i4 * i10];
            this.f15128l = this.f15126i * i10;
        }
        this.f15130n = 0;
    }

    @Override // com.google.android.gms.internal.ads.z10
    public final void k() {
        this.f15129m = bq0.f9769b;
    }
}
