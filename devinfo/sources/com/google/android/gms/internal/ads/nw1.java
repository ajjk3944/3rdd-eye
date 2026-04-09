package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class nw1 extends z10 {

    /* renamed from: i, reason: collision with root package name */
    public int f14452i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public int f14453k;

    /* renamed from: l, reason: collision with root package name */
    public long f14454l;

    /* renamed from: m, reason: collision with root package name */
    public int f14455m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f14456n;

    /* renamed from: o, reason: collision with root package name */
    public int f14457o;

    /* renamed from: p, reason: collision with root package name */
    public int f14458p;

    /* renamed from: q, reason: collision with root package name */
    public byte[] f14459q;

    @Override // com.google.android.gms.internal.ads.q10
    public final void a(ByteBuffer byteBuffer) {
        int iLimit;
        int i4;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.g.hasRemaining()) {
            if (this.f14453k != 0) {
                mq0.c0(this.f14457o < this.f14456n.length);
                int iLimit2 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > 1024) {
                        int i10 = this.f14452i;
                        iLimit = (iPosition2 / i10) * i10;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int i11 = this.f14457o;
                int i12 = this.f14458p;
                int i13 = i11 + i12;
                int length = this.f14456n.length;
                if (i13 < length) {
                    i4 = length - i13;
                } else {
                    i13 = i12 - (length - i11);
                    i4 = i11 - i13;
                }
                int iMin = Math.min(iPosition3, i4);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f14456n, i13, iMin);
                int i14 = this.f14458p + iMin;
                this.f14458p = i14;
                mq0.c0(i14 <= this.f14456n.length);
                boolean z3 = iLimit < iLimit2 && iPosition3 < i4;
                l(z3);
                if (z3) {
                    this.f14453k = 0;
                    this.f14455m = 0;
                }
                byteBuffer.limit(iLimit2);
            } else {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit3, byteBuffer.position() + this.f14456n.length));
                int iLimit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit4 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit4) << 8) | (byteBuffer.get(iLimit4 - 1) & 255)) > 1024) {
                        int i15 = this.f14452i;
                        iPosition = ((iLimit4 / i15) * i15) + i15;
                        break;
                    }
                    iLimit4 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.f14453k = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    f(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.z10
    public final j00 h(j00 j00Var) throws f10 {
        if (j00Var.f12560c == 2) {
            return j00Var.f12558a == -1 ? j00.f12557e : j00Var;
        }
        throw new f10("Unhandled input format:", j00Var);
    }

    @Override // com.google.android.gms.internal.ads.z10
    public final void i() {
        if (this.f14458p > 0) {
            l(true);
            this.f14455m = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.z10
    public final void j() {
        if (zzc()) {
            int i4 = this.f18954b.f12559b;
            int i10 = i4 + i4;
            this.f14452i = i10;
            int i11 = ((((int) ((100000 * r0.f12558a) / 1000000)) / 2) / i10) * i10;
            int i12 = i11 + i11;
            if (this.f14456n.length != i12) {
                this.f14456n = new byte[i12];
                this.f14459q = new byte[i12];
            }
        }
        this.f14453k = 0;
        this.f14454l = 0L;
        this.f14455m = 0;
        this.f14457o = 0;
        this.f14458p = 0;
    }

    @Override // com.google.android.gms.internal.ads.z10
    public final void k() {
        this.j = false;
        byte[] bArr = bq0.f9769b;
        this.f14456n = bArr;
        this.f14459q = bArr;
    }

    public final void l(boolean z3) {
        int i4;
        int length;
        int i10 = this.f14458p;
        int length2 = this.f14456n.length;
        if (i10 != length2) {
            if (!z3) {
                return;
            } else {
                z3 = true;
            }
        }
        if (this.f14455m == 0) {
            if (z3) {
                n(i10, 3);
                length = i10;
            } else {
                mq0.c0(i10 >= (length2 >> 1));
                length = this.f14456n.length >> 1;
                n(length, 0);
            }
            i4 = length;
        } else {
            int i11 = length2 >> 1;
            int i12 = i10 - i11;
            if (z3) {
                int iM = m(i12) + (this.f14456n.length >> 1);
                n(iM, 2);
                int i13 = i11 + i12;
                i4 = iM;
                length = i13;
            } else {
                int iM2 = m(i12);
                n(iM2, 1);
                i4 = iM2;
                length = i12;
            }
        }
        if (length % this.f14452i != 0) {
            throw new IllegalStateException(al0.H("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
        }
        mq0.c0(i10 >= i4);
        this.f14458p -= length;
        int i14 = this.f14457o + length;
        this.f14457o = i14;
        this.f14457o = i14 % this.f14456n.length;
        this.f14455m = (i4 / this.f14452i) + this.f14455m;
        this.f14454l += (length - i4) / r2;
    }

    public final int m(int i4) {
        int length = ((((int) ((2000000 * this.f18954b.f12558a) / 1000000)) - this.f14455m) * this.f14452i) - (this.f14456n.length >> 1);
        mq0.c0(length >= 0);
        int iMin = (int) Math.min((i4 * 0.2f) + 0.5f, length);
        int i10 = this.f14452i;
        return (iMin / i10) * i10;
    }

    public final void n(int i4, int i10) {
        int i11;
        if (i4 == 0) {
            return;
        }
        mq0.m(this.f14458p >= i4);
        if (i10 == 2) {
            int i12 = this.f14457o;
            int i13 = this.f14458p;
            int i14 = i12 + i13;
            byte[] bArr = this.f14456n;
            int length = bArr.length;
            if (i14 <= length) {
                System.arraycopy(bArr, i14 - i4, this.f14459q, 0, i4);
            } else {
                int i15 = i13 - (length - i12);
                if (i15 >= i4) {
                    System.arraycopy(bArr, i15 - i4, this.f14459q, 0, i4);
                } else {
                    int i16 = i4 - i15;
                    System.arraycopy(bArr, length - i16, this.f14459q, 0, i16);
                    System.arraycopy(this.f14456n, 0, this.f14459q, i16, i15);
                }
            }
        } else {
            int i17 = this.f14457o;
            int i18 = i17 + i4;
            byte[] bArr2 = this.f14456n;
            int length2 = bArr2.length;
            if (i18 <= length2) {
                System.arraycopy(bArr2, i17, this.f14459q, 0, i4);
            } else {
                int i19 = length2 - i17;
                System.arraycopy(bArr2, i17, this.f14459q, 0, i19);
                System.arraycopy(this.f14456n, 0, this.f14459q, i19, i4 - i19);
            }
        }
        mq0.O(i4 % this.f14452i == 0, i4, "sizeToOutput is not aligned to frame size: %s");
        mq0.c0(this.f14457o < this.f14456n.length);
        byte[] bArr3 = this.f14459q;
        mq0.O(i4 % this.f14452i == 0, i4, "byteOutput size is not aligned to frame size %s");
        if (i10 != 3) {
            for (int i20 = 0; i20 < i4; i20 += 2) {
                int i21 = i20 + 1;
                int i22 = (bArr3[i21] << 8) | (bArr3[i20] & 255);
                if (i10 == 0) {
                    i11 = ((((i20 * 1000) / (i4 - 1)) * (-90)) / 1000) + 100;
                } else {
                    i11 = 10;
                    if (i10 == 2) {
                        i11 = 10 + (((90000 * i20) / (i4 - 1)) / 1000);
                    }
                }
                int i23 = (i22 * i11) / 100;
                if (i23 >= 32767) {
                    bArr3[i20] = -1;
                    bArr3[i21] = 127;
                } else if (i23 <= -32768) {
                    bArr3[i20] = 0;
                    bArr3[i21] = -128;
                } else {
                    bArr3[i20] = (byte) (i23 & 255);
                    bArr3[i21] = (byte) (i23 >> 8);
                }
            }
        }
        f(i4).put(bArr3, 0, i4).flip();
    }

    @Override // com.google.android.gms.internal.ads.z10, com.google.android.gms.internal.ads.q10
    public final boolean zzc() {
        return super.zzc() && this.j;
    }
}
