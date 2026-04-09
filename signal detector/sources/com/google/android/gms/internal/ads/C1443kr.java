package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1443kr {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f15294a;

    /* renamed from: b, reason: collision with root package name */
    public int f15295b;

    /* renamed from: c, reason: collision with root package name */
    public int f15296c;

    /* renamed from: d, reason: collision with root package name */
    public int f15297d;

    public C1443kr(byte[] bArr, int i) {
        this.f15294a = bArr;
        this.f15297d = i;
    }

    public final void a(C2036vr c2036vr) {
        byte[] bArr = c2036vr.f17354a;
        int i = c2036vr.f17356c;
        this.f15294a = bArr;
        this.f15295b = 0;
        this.f15296c = 0;
        this.f15297d = i;
        d(c2036vr.f17355b * 8);
    }

    public final int b() {
        return ((this.f15297d - this.f15295b) * 8) - this.f15296c;
    }

    public final int c() {
        AbstractC0582Jp.h0(this.f15296c == 0);
        return this.f15295b;
    }

    public final void d(int i) {
        int i3 = i / 8;
        this.f15295b = i3;
        this.f15296c = i - (i3 * 8);
        m();
    }

    public final void e() {
        int i = this.f15296c + 1;
        this.f15296c = i;
        if (i == 8) {
            this.f15296c = 0;
            this.f15295b++;
        }
        m();
    }

    public final void f(int i) {
        int i3 = i / 8;
        int i6 = this.f15295b + i3;
        this.f15295b = i6;
        int i7 = (i - (i3 * 8)) + this.f15296c;
        this.f15296c = i7;
        if (i7 > 7) {
            this.f15295b = i6 + 1;
            this.f15296c = i7 - 8;
        }
        m();
    }

    public final boolean g() {
        int i = this.f15294a[this.f15295b] & (128 >> this.f15296c);
        e();
        return i != 0;
    }

    public final int h(int i) {
        int i3;
        if (i == 0) {
            return 0;
        }
        this.f15296c += i;
        int i6 = 0;
        while (true) {
            i3 = this.f15296c;
            if (i3 <= 8) {
                break;
            }
            int i7 = i3 - 8;
            this.f15296c = i7;
            byte[] bArr = this.f15294a;
            int i8 = this.f15295b;
            this.f15295b = i8 + 1;
            i6 |= (bArr[i8] & 255) << i7;
        }
        byte[] bArr2 = this.f15294a;
        int i9 = this.f15295b;
        int i10 = i6 | ((bArr2[i9] & 255) >> (8 - i3));
        int i11 = 32 - i;
        if (i3 == 8) {
            this.f15296c = 0;
            this.f15295b = i9 + 1;
        }
        int i12 = ((-1) >>> i11) & i10;
        m();
        return i12;
    }

    public final long i(int i) {
        if (i <= 32) {
            int iH = h(i);
            String str = Vt.f12096a;
            return 4294967295L & iH;
        }
        int iH2 = h(i - 32);
        int iH3 = h(32);
        String str2 = Vt.f12096a;
        return (4294967295L & iH3) | ((iH2 & 4294967295L) << 32);
    }

    public final void j(int i, byte[] bArr) {
        int i3;
        int i6 = 0;
        while (true) {
            i3 = i >> 3;
            if (i6 >= i3) {
                break;
            }
            byte[] bArr2 = this.f15294a;
            int i7 = this.f15295b;
            int i8 = i7 + 1;
            this.f15295b = i8;
            byte b5 = bArr2[i7];
            int i9 = this.f15296c;
            byte b6 = (byte) (b5 << i9);
            bArr[i6] = b6;
            bArr[i6] = (byte) (((bArr2[i8] & 255) >> (8 - i9)) | b6);
            i6++;
        }
        int i10 = i & 7;
        if (i10 == 0) {
            return;
        }
        byte b7 = (byte) (bArr[i3] & (255 >> i10));
        bArr[i3] = b7;
        int i11 = this.f15296c;
        if (i11 + i10 > 8) {
            byte[] bArr3 = this.f15294a;
            int i12 = this.f15295b;
            this.f15295b = i12 + 1;
            b7 = (byte) (b7 | ((bArr3[i12] & 255) << i11));
            bArr[i3] = b7;
            i11 -= 8;
        }
        int i13 = i11 + i10;
        this.f15296c = i13;
        byte[] bArr4 = this.f15294a;
        int i14 = this.f15295b;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i14]) >> (8 - i13)) << (8 - i10))) | b7);
        if (i13 == 8) {
            this.f15296c = 0;
            this.f15295b = i14 + 1;
        }
        m();
    }

    public final void k() {
        if (this.f15296c == 0) {
            return;
        }
        this.f15296c = 0;
        this.f15295b++;
        m();
    }

    public final void l(int i) {
        AbstractC0582Jp.h0(this.f15296c == 0);
        this.f15295b += i;
        m();
    }

    public final void m() {
        int i;
        int i3 = this.f15295b;
        boolean z6 = false;
        if (i3 >= 0 && (i3 < (i = this.f15297d) || (i3 == i && this.f15296c == 0))) {
            z6 = true;
        }
        AbstractC0582Jp.h0(z6);
    }

    public C1443kr() {
        this.f15294a = Vt.f12097b;
    }
}
