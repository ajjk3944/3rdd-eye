package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class vf1 {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f34525a;

    /* renamed from: b, reason: collision with root package name */
    private int f34526b;

    /* renamed from: c, reason: collision with root package name */
    private int f34527c;

    /* renamed from: d, reason: collision with root package name */
    private int f34528d;

    public vf1(byte[] bArr, int i, int i10) {
        a(bArr, i, i10);
    }

    private void a() {
        int i = this.f34527c;
        if (i >= 0) {
            int i10 = this.f34526b;
            if (i < i10) {
                return;
            }
            if (i == i10 && this.f34528d == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final boolean b() {
        int i = this.f34527c;
        int i10 = this.f34528d;
        int i11 = 0;
        while (this.f34527c < this.f34526b && !c()) {
            i11++;
        }
        boolean z10 = this.f34527c == this.f34526b;
        this.f34527c = i;
        this.f34528d = i10;
        return !z10 && a((i11 * 2) + 1);
    }

    public final boolean c() {
        boolean z10 = (this.f34525a[this.f34527c] & (128 >> this.f34528d)) != 0;
        f();
        return z10;
    }

    public final int d() {
        int i = 0;
        while (!c()) {
            i++;
        }
        int iB = ((1 << i) - 1) + (i > 0 ? b(i) : 0);
        return ((iB + 1) / 2) * (iB % 2 == 0 ? -1 : 1);
    }

    public final int e() {
        int i = 0;
        while (!c()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? b(i) : 0);
    }

    public final void f() {
        int i = this.f34528d + 1;
        this.f34528d = i;
        if (i == 8) {
            this.f34528d = 0;
            int i10 = this.f34527c;
            this.f34527c = i10 + (c(i10 + 1) ? 2 : 1);
        }
        a();
    }

    private boolean c(int i) {
        if (2 > i || i >= this.f34526b) {
            return false;
        }
        byte[] bArr = this.f34525a;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
    }

    public final boolean a(int i) {
        int i10 = this.f34527c;
        int i11 = i / 8;
        int i12 = i10 + i11;
        int i13 = (this.f34528d + i) - (i11 * 8);
        if (i13 > 7) {
            i12++;
            i13 -= 8;
        }
        while (true) {
            int i14 = i10 + 1;
            if (i14 > i12 || i12 >= this.f34526b) {
                break;
            }
            if (c(i14)) {
                i12++;
                i10 += 3;
            } else {
                i10 = i14;
            }
        }
        int i15 = this.f34526b;
        if (i12 >= i15) {
            return i12 == i15 && i13 == 0;
        }
        return true;
    }

    public final void d(int i) {
        int i10 = this.f34527c;
        int i11 = i / 8;
        int i12 = i10 + i11;
        this.f34527c = i12;
        int i13 = (i - (i11 * 8)) + this.f34528d;
        this.f34528d = i13;
        if (i13 > 7) {
            this.f34527c = i12 + 1;
            this.f34528d = i13 - 8;
        }
        while (true) {
            int i14 = i10 + 1;
            if (i14 <= this.f34527c) {
                if (c(i14)) {
                    this.f34527c++;
                    i10 += 3;
                } else {
                    i10 = i14;
                }
            } else {
                a();
                return;
            }
        }
    }

    public final int b(int i) {
        int i10;
        this.f34528d += i;
        int i11 = 0;
        while (true) {
            i10 = this.f34528d;
            if (i10 <= 8) {
                break;
            }
            int i12 = i10 - 8;
            this.f34528d = i12;
            byte[] bArr = this.f34525a;
            int i13 = this.f34527c;
            i11 |= (bArr[i13] & 255) << i12;
            if (!c(i13 + 1)) {
                i = 1;
            }
            this.f34527c = i13 + i;
        }
        byte[] bArr2 = this.f34525a;
        int i14 = this.f34527c;
        int i15 = ((-1) >>> (32 - i)) & (i11 | ((bArr2[i14] & 255) >> (8 - i10)));
        if (i10 == 8) {
            this.f34528d = 0;
            this.f34527c = i14 + (c(i14 + 1) ? 2 : 1);
        }
        a();
        return i15;
    }

    public final void a(byte[] bArr, int i, int i10) {
        this.f34525a = bArr;
        this.f34527c = i;
        this.f34526b = i10;
        this.f34528d = 0;
        a();
    }
}
