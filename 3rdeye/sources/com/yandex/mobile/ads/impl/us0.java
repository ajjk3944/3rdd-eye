package com.yandex.mobile.ads.impl;

import g0.C4356c;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class us0 {

    /* renamed from: a, reason: collision with root package name */
    private int f34207a;

    /* renamed from: b, reason: collision with root package name */
    private long[] f34208b;

    public us0() {
        this(0);
    }

    public final void a(long j4) {
        int i = this.f34207a;
        long[] jArr = this.f34208b;
        if (i == jArr.length) {
            this.f34208b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f34208b;
        int i10 = this.f34207a;
        this.f34207a = i10 + 1;
        jArr2[i10] = j4;
    }

    public final long[] b() {
        return Arrays.copyOf(this.f34208b, this.f34207a);
    }

    public us0(int i) {
        this.f34208b = new long[32];
    }

    public final long a(int i) {
        if (i >= 0 && i < this.f34207a) {
            return this.f34208b[i];
        }
        StringBuilder sbJ = C4356c.j(i, "Invalid index ", ", size is ");
        sbJ.append(this.f34207a);
        throw new IndexOutOfBoundsException(sbJ.toString());
    }

    public final int a() {
        return this.f34207a;
    }
}
