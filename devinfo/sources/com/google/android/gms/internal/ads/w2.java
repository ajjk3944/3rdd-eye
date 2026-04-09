package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w2 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f17844a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17845b;

    /* renamed from: c, reason: collision with root package name */
    public int f17846c;

    /* renamed from: d, reason: collision with root package name */
    public int f17847d;

    public w2(byte[] bArr) {
        this.f17844a = bArr;
        this.f17845b = bArr.length;
    }

    public void a() {
        int i4 = this.f17847d + 1;
        this.f17847d = i4;
        if (i4 == 8) {
            this.f17847d = 0;
            int i10 = this.f17846c;
            this.f17846c = i10 + (true == k(i10 + 1) ? 2 : 1);
        }
        l();
    }

    public boolean b() {
        int i4 = (this.f17844a[this.f17846c] & 255) >> this.f17847d;
        e(1);
        return 1 == (i4 & 1);
    }

    public int c(int i4) {
        int i10 = this.f17846c;
        int i11 = i10 + 1;
        int iMin = Math.min(i4, 8 - this.f17847d);
        byte[] bArr = this.f17844a;
        int i12 = ((bArr[i10] & 255) >> this.f17847d) & (255 >> (8 - iMin));
        while (iMin < i4) {
            i12 |= (bArr[i11] & 255) << iMin;
            iMin += 8;
            i11++;
        }
        int i13 = i12 & ((-1) >>> (32 - i4));
        e(i4);
        return i13;
    }

    public void d(int i4) {
        int i10 = this.f17846c;
        int i11 = i4 / 8;
        int i12 = i10 + i11;
        this.f17846c = i12;
        int i13 = (i4 - (i11 * 8)) + this.f17847d;
        this.f17847d = i13;
        if (i13 > 7) {
            this.f17846c = i12 + 1;
            this.f17847d = i13 - 8;
        }
        while (true) {
            i10++;
            if (i10 > this.f17846c) {
                l();
                return;
            } else if (k(i10)) {
                this.f17846c++;
                i10 += 2;
            }
        }
    }

    public void e(int i4) {
        int i10;
        int i11 = i4 / 8;
        int i12 = this.f17846c + i11;
        this.f17846c = i12;
        int i13 = (i4 - (i11 * 8)) + this.f17847d;
        this.f17847d = i13;
        if (i13 > 7) {
            i12++;
            this.f17846c = i12;
            i13 -= 8;
            this.f17847d = i13;
        }
        boolean z3 = false;
        if (i12 >= 0 && (i12 < (i10 = this.f17845b) || (i12 == i10 && i13 == 0))) {
            z3 = true;
        }
        mq0.c0(z3);
    }

    public boolean f(int i4) {
        int i10;
        int i11 = this.f17846c;
        int i12 = i4 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f17847d + i4) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            i10 = this.f17845b;
            if (i11 > i13 || i13 >= i10) {
                break;
            }
            if (k(i11)) {
                i13++;
                i11 += 2;
            }
        }
        if (i13 >= i10) {
            return i13 == i10 && i14 == 0;
        }
        return true;
    }

    public boolean g() {
        int i4 = this.f17844a[this.f17846c] & (128 >> this.f17847d);
        a();
        return i4 != 0;
    }

    public int h(int i4) {
        int i10;
        byte[] bArr;
        this.f17847d += i4;
        int i11 = 0;
        while (true) {
            i10 = this.f17847d;
            bArr = this.f17844a;
            if (i10 <= 8) {
                break;
            }
            int i12 = i10 - 8;
            this.f17847d = i12;
            int i13 = this.f17846c;
            i11 |= (bArr[i13] & 255) << i12;
            if (true != k(i13 + 1)) {
                i = 1;
            }
            this.f17846c = i13 + i;
        }
        int i14 = this.f17846c;
        int i15 = i11 | ((bArr[i14] & 255) >> (8 - i10));
        int i16 = 32 - i4;
        if (i10 == 8) {
            this.f17847d = 0;
            this.f17846c = i14 + (true != k(i14 + 1) ? 1 : 2);
        }
        int i17 = ((-1) >>> i16) & i15;
        l();
        return i17;
    }

    public int i() {
        int iJ = j();
        int i4 = iJ % 2;
        return ((iJ + 1) / 2) * (i4 == 0 ? -1 : 1);
    }

    public int j() {
        int i4 = 0;
        while (!g()) {
            i4++;
        }
        return ((1 << i4) - 1) + (i4 > 0 ? h(i4) : 0);
    }

    public boolean k(int i4) {
        if (i4 < 2 || i4 >= this.f17845b) {
            return false;
        }
        byte[] bArr = this.f17844a;
        return bArr[i4] == 3 && bArr[i4 + (-2)] == 0 && bArr[i4 + (-1)] == 0;
    }

    public void l() {
        int i4;
        int i10 = this.f17846c;
        boolean z3 = false;
        if (i10 >= 0 && (i10 < (i4 = this.f17845b) || (i10 == i4 && this.f17847d == 0))) {
            z3 = true;
        }
        mq0.c0(z3);
    }

    public w2(byte[] bArr, int i4, int i10) {
        this.f17844a = bArr;
        this.f17846c = i4;
        this.f17845b = i10;
        this.f17847d = 0;
        l();
    }
}
