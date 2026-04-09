package com.yandex.mobile.ads.impl;

import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class pi2 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f31769a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31770b;

    /* renamed from: c, reason: collision with root package name */
    private int f31771c;

    /* renamed from: d, reason: collision with root package name */
    private int f31772d;

    public pi2(byte[] bArr) {
        this.f31769a = bArr;
        this.f31770b = bArr.length;
    }

    public final int a() {
        return (this.f31771c * 8) + this.f31772d;
    }

    public final boolean b() {
        boolean z10 = (((this.f31769a[this.f31771c] & 255) >> this.f31772d) & 1) == 1;
        b(1);
        return z10;
    }

    public final int a(int i) {
        int i10 = this.f31771c;
        int iMin = Math.min(i, 8 - this.f31772d);
        int i11 = i10 + 1;
        int i12 = ((this.f31769a[i10] & 255) >> this.f31772d) & (KotlinVersion.MAX_COMPONENT_VALUE >> (8 - iMin));
        while (iMin < i) {
            i12 |= (this.f31769a[i11] & 255) << iMin;
            iMin += 8;
            i11++;
        }
        int i13 = i12 & ((-1) >>> (32 - i));
        b(i);
        return i13;
    }

    public final void b(int i) {
        int i10 = i / 8;
        int i11 = this.f31771c + i10;
        this.f31771c = i11;
        int i12 = (i - (i10 * 8)) + this.f31772d;
        this.f31772d = i12;
        if (i12 > 7) {
            this.f31771c = i11 + 1;
            this.f31772d = i12 - 8;
        }
        int i13 = this.f31771c;
        if (i13 >= 0) {
            int i14 = this.f31770b;
            if (i13 < i14) {
                return;
            }
            if (i13 == i14 && this.f31772d == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }
}
