package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ox1 {

    /* renamed from: a, reason: collision with root package name */
    private int f31520a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f31521b = new int[10];

    public final int a(int i) {
        return this.f31521b[i];
    }

    public final int b() {
        if ((this.f31520a & 128) != 0) {
            return this.f31521b[7];
        }
        return 65535;
    }

    public final int c() {
        if ((this.f31520a & 16) != 0) {
            return this.f31521b[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int d() {
        return Integer.bitCount(this.f31520a);
    }

    public final int a() {
        if ((this.f31520a & 2) != 0) {
            return this.f31521b[1];
        }
        return -1;
    }

    public final int b(int i) {
        return (this.f31520a & 32) != 0 ? this.f31521b[5] : i;
    }

    public final boolean c(int i) {
        return ((1 << i) & this.f31520a) != 0;
    }

    public final void a(ox1 other) {
        kotlin.jvm.internal.l.f(other, "other");
        for (int i = 0; i < 10; i++) {
            if (other.c(i)) {
                a(i, other.f31521b[i]);
            }
        }
    }

    public final void a(int i, int i10) {
        if (i >= 0) {
            int[] iArr = this.f31521b;
            if (i >= iArr.length) {
                return;
            }
            this.f31520a = (1 << i) | this.f31520a;
            iArr[i] = i10;
        }
    }
}
