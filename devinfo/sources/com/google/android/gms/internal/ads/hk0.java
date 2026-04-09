package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class hk0 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f11893a;

    /* renamed from: b, reason: collision with root package name */
    public int f11894b;

    /* renamed from: c, reason: collision with root package name */
    public int f11895c;

    /* renamed from: d, reason: collision with root package name */
    public int f11896d;

    public hk0(byte[] bArr, int i4) {
        this.f11893a = bArr;
        this.f11896d = i4;
    }

    public final void a(sk0 sk0Var) {
        byte[] bArr = sk0Var.f16446a;
        int i4 = sk0Var.f16448c;
        this.f11893a = bArr;
        this.f11894b = 0;
        this.f11895c = 0;
        this.f11896d = i4;
        d(sk0Var.f16447b * 8);
    }

    public final int b() {
        return ((this.f11896d - this.f11894b) * 8) - this.f11895c;
    }

    public final int c() {
        mq0.c0(this.f11895c == 0);
        return this.f11894b;
    }

    public final void d(int i4) {
        int i10 = i4 / 8;
        this.f11894b = i10;
        this.f11895c = i4 - (i10 * 8);
        m();
    }

    public final void e() {
        int i4 = this.f11895c + 1;
        this.f11895c = i4;
        if (i4 == 8) {
            this.f11895c = 0;
            this.f11894b++;
        }
        m();
    }

    public final void f(int i4) {
        int i10 = i4 / 8;
        int i11 = this.f11894b + i10;
        this.f11894b = i11;
        int i12 = (i4 - (i10 * 8)) + this.f11895c;
        this.f11895c = i12;
        if (i12 > 7) {
            this.f11894b = i11 + 1;
            this.f11895c = i12 - 8;
        }
        m();
    }

    public final boolean g() {
        int i4 = this.f11893a[this.f11894b] & (128 >> this.f11895c);
        e();
        return i4 != 0;
    }

    public final int h(int i4) {
        int i10;
        if (i4 == 0) {
            return 0;
        }
        this.f11895c += i4;
        int i11 = 0;
        while (true) {
            i10 = this.f11895c;
            if (i10 <= 8) {
                break;
            }
            int i12 = i10 - 8;
            this.f11895c = i12;
            byte[] bArr = this.f11893a;
            int i13 = this.f11894b;
            this.f11894b = i13 + 1;
            i11 |= (bArr[i13] & 255) << i12;
        }
        byte[] bArr2 = this.f11893a;
        int i14 = this.f11894b;
        int i15 = i11 | ((bArr2[i14] & 255) >> (8 - i10));
        int i16 = 32 - i4;
        if (i10 == 8) {
            this.f11895c = 0;
            this.f11894b = i14 + 1;
        }
        int i17 = ((-1) >>> i16) & i15;
        m();
        return i17;
    }

    public final long i(int i4) {
        if (i4 <= 32) {
            int iH = h(i4);
            String str = bq0.f9768a;
            return 4294967295L & iH;
        }
        int iH2 = h(i4 - 32);
        int iH3 = h(32);
        String str2 = bq0.f9768a;
        return (4294967295L & iH3) | ((iH2 & 4294967295L) << 32);
    }

    public final void j(int i4, byte[] bArr) {
        int i10;
        int i11 = 0;
        while (true) {
            i10 = i4 >> 3;
            if (i11 >= i10) {
                break;
            }
            byte[] bArr2 = this.f11893a;
            int i12 = this.f11894b;
            int i13 = i12 + 1;
            this.f11894b = i13;
            byte b10 = bArr2[i12];
            int i14 = this.f11895c;
            byte b11 = (byte) (b10 << i14);
            bArr[i11] = b11;
            bArr[i11] = (byte) (((bArr2[i13] & 255) >> (8 - i14)) | b11);
            i11++;
        }
        int i15 = i4 & 7;
        if (i15 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i10] & (255 >> i15));
        bArr[i10] = b12;
        int i16 = this.f11895c;
        if (i16 + i15 > 8) {
            byte[] bArr3 = this.f11893a;
            int i17 = this.f11894b;
            this.f11894b = i17 + 1;
            b12 = (byte) (b12 | ((bArr3[i17] & 255) << i16));
            bArr[i10] = b12;
            i16 -= 8;
        }
        int i18 = i16 + i15;
        this.f11895c = i18;
        byte[] bArr4 = this.f11893a;
        int i19 = this.f11894b;
        bArr[i10] = (byte) (((byte) (((255 & bArr4[i19]) >> (8 - i18)) << (8 - i15))) | b12);
        if (i18 == 8) {
            this.f11895c = 0;
            this.f11894b = i19 + 1;
        }
        m();
    }

    public final void k() {
        if (this.f11895c == 0) {
            return;
        }
        this.f11895c = 0;
        this.f11894b++;
        m();
    }

    public final void l(int i4) {
        mq0.c0(this.f11895c == 0);
        this.f11894b += i4;
        m();
    }

    public final void m() {
        int i4;
        int i10 = this.f11894b;
        boolean z3 = false;
        if (i10 >= 0 && (i10 < (i4 = this.f11896d) || (i10 == i4 && this.f11895c == 0))) {
            z3 = true;
        }
        mq0.c0(z3);
    }

    public hk0() {
        this.f11893a = bq0.f9769b;
    }
}
