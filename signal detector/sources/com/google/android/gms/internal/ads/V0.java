package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class V0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f11858a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11859b;

    /* renamed from: c, reason: collision with root package name */
    public int f11860c;

    /* renamed from: d, reason: collision with root package name */
    public int f11861d;

    public V0(int i, int i3, byte[] bArr) {
        this.f11858a = bArr;
        this.f11860c = i;
        this.f11859b = i3;
        this.f11861d = 0;
        l();
    }

    public void a() {
        int i = this.f11861d + 1;
        this.f11861d = i;
        if (i == 8) {
            this.f11861d = 0;
            int i3 = this.f11860c;
            this.f11860c = i3 + (true == k(i3 + 1) ? 2 : 1);
        }
        l();
    }

    public boolean b() {
        int i = (this.f11858a[this.f11860c] & 255) >> this.f11861d;
        e(1);
        return 1 == (i & 1);
    }

    public int c(int i) {
        int i3 = this.f11860c;
        int i6 = i3 + 1;
        int iMin = Math.min(i, 8 - this.f11861d);
        byte[] bArr = this.f11858a;
        int i7 = ((bArr[i3] & 255) >> this.f11861d) & (255 >> (8 - iMin));
        while (iMin < i) {
            i7 |= (bArr[i6] & 255) << iMin;
            iMin += 8;
            i6++;
        }
        int i8 = i7 & ((-1) >>> (32 - i));
        e(i);
        return i8;
    }

    public void d(int i) {
        int i3 = this.f11860c;
        int i6 = i / 8;
        int i7 = i3 + i6;
        this.f11860c = i7;
        int i8 = (i - (i6 * 8)) + this.f11861d;
        this.f11861d = i8;
        if (i8 > 7) {
            this.f11860c = i7 + 1;
            this.f11861d = i8 - 8;
        }
        while (true) {
            i3++;
            if (i3 > this.f11860c) {
                l();
                return;
            } else if (k(i3)) {
                this.f11860c++;
                i3 += 2;
            }
        }
    }

    public void e(int i) {
        int i3;
        int i6 = i / 8;
        int i7 = this.f11860c + i6;
        this.f11860c = i7;
        int i8 = (i - (i6 * 8)) + this.f11861d;
        this.f11861d = i8;
        if (i8 > 7) {
            i7++;
            this.f11860c = i7;
            i8 -= 8;
            this.f11861d = i8;
        }
        boolean z6 = false;
        if (i7 >= 0 && (i7 < (i3 = this.f11859b) || (i7 == i3 && i8 == 0))) {
            z6 = true;
        }
        AbstractC0582Jp.h0(z6);
    }

    public boolean f(int i) {
        int i3;
        int i6 = this.f11860c;
        int i7 = i / 8;
        int i8 = i6 + i7;
        int i9 = (this.f11861d + i) - (i7 * 8);
        if (i9 > 7) {
            i8++;
            i9 -= 8;
        }
        while (true) {
            i6++;
            i3 = this.f11859b;
            if (i6 > i8 || i8 >= i3) {
                break;
            }
            if (k(i6)) {
                i8++;
                i6 += 2;
            }
        }
        if (i8 >= i3) {
            return i8 == i3 && i9 == 0;
        }
        return true;
    }

    public boolean g() {
        int i = this.f11858a[this.f11860c] & (128 >> this.f11861d);
        a();
        return i != 0;
    }

    public int h(int i) {
        int i3;
        byte[] bArr;
        this.f11861d += i;
        int i6 = 0;
        while (true) {
            i3 = this.f11861d;
            bArr = this.f11858a;
            if (i3 <= 8) {
                break;
            }
            int i7 = i3 - 8;
            this.f11861d = i7;
            int i8 = this.f11860c;
            i6 |= (bArr[i8] & 255) << i7;
            if (true != k(i8 + 1)) {
                i = 1;
            }
            this.f11860c = i8 + i;
        }
        int i9 = this.f11860c;
        int i10 = i6 | ((bArr[i9] & 255) >> (8 - i3));
        int i11 = 32 - i;
        if (i3 == 8) {
            this.f11861d = 0;
            this.f11860c = i9 + (true != k(i9 + 1) ? 1 : 2);
        }
        int i12 = ((-1) >>> i11) & i10;
        l();
        return i12;
    }

    public int i() {
        int iJ = j();
        int i = iJ % 2;
        return ((iJ + 1) / 2) * (i == 0 ? -1 : 1);
    }

    public int j() {
        int i = 0;
        while (!g()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? h(i) : 0);
    }

    public boolean k(int i) {
        if (i < 2 || i >= this.f11859b) {
            return false;
        }
        byte[] bArr = this.f11858a;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i + (-1)] == 0;
    }

    public void l() {
        int i;
        int i3 = this.f11860c;
        boolean z6 = false;
        if (i3 >= 0 && (i3 < (i = this.f11859b) || (i3 == i && this.f11861d == 0))) {
            z6 = true;
        }
        AbstractC0582Jp.h0(z6);
    }

    public V0(byte[] bArr) {
        this.f11858a = bArr;
        this.f11859b = bArr.length;
    }
}
