package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class u42<V> {

    /* renamed from: a, reason: collision with root package name */
    private long[] f33932a;

    /* renamed from: b, reason: collision with root package name */
    private V[] f33933b;

    /* renamed from: c, reason: collision with root package name */
    private int f33934c;

    /* renamed from: d, reason: collision with root package name */
    private int f33935d;

    public u42() {
        this(0);
    }

    private static Object[] b() {
        return new Object[10];
    }

    public final synchronized void a(Object obj, long j4) {
        try {
            if (this.f33935d > 0) {
                if (j4 <= this.f33932a[((this.f33934c + r0) - 1) % this.f33933b.length]) {
                    a();
                }
            }
            int length = this.f33933b.length;
            if (this.f33935d >= length) {
                int i = length * 2;
                long[] jArr = new long[i];
                V[] vArr = (V[]) new Object[i];
                int i10 = this.f33934c;
                int i11 = length - i10;
                System.arraycopy(this.f33932a, i10, jArr, 0, i11);
                System.arraycopy(this.f33933b, this.f33934c, vArr, 0, i11);
                int i12 = this.f33934c;
                if (i12 > 0) {
                    System.arraycopy(this.f33932a, 0, jArr, i11, i12);
                    System.arraycopy(this.f33933b, 0, vArr, i11, this.f33934c);
                }
                this.f33932a = jArr;
                this.f33933b = vArr;
                this.f33934c = 0;
            }
            int i13 = this.f33934c;
            int i14 = this.f33935d;
            Object[] objArr = (V[]) this.f33933b;
            int length2 = (i13 + i14) % objArr.length;
            this.f33932a[length2] = j4;
            objArr[length2] = obj;
            this.f33935d = i14 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized V c() {
        V v10;
        int i = this.f33935d;
        v10 = null;
        if (i != 0) {
            if (i <= 0) {
                throw new IllegalStateException();
            }
            V[] vArr = this.f33933b;
            int i10 = this.f33934c;
            V v11 = vArr[i10];
            vArr[i10] = null;
            this.f33934c = (i10 + 1) % vArr.length;
            this.f33935d = i - 1;
            v10 = v11;
        }
        return v10;
    }

    public final synchronized int d() {
        return this.f33935d;
    }

    public u42(int i) {
        this.f33932a = new long[10];
        this.f33933b = (V[]) b();
    }

    public final synchronized V b(long j4) {
        V v10;
        v10 = null;
        while (true) {
            try {
                int i = this.f33935d;
                if (i <= 0) {
                    break;
                }
                long[] jArr = this.f33932a;
                int i10 = this.f33934c;
                if (j4 - jArr[i10] >= 0) {
                    if (i <= 0) {
                        throw new IllegalStateException();
                    }
                    V[] vArr = this.f33933b;
                    V v11 = vArr[i10];
                    vArr[i10] = null;
                    this.f33934c = (i10 + 1) % vArr.length;
                    this.f33935d = i - 1;
                    v10 = v11;
                }
            } finally {
            }
        }
        return v10;
    }

    public final synchronized void a() {
        this.f33934c = 0;
        this.f33935d = 0;
        Arrays.fill(this.f33933b, (Object) null);
    }

    public final synchronized V a(long j4) {
        V v10;
        long j10 = Long.MAX_VALUE;
        v10 = null;
        while (true) {
            try {
                int i = this.f33935d;
                if (i <= 0) {
                    break;
                }
                long[] jArr = this.f33932a;
                int i10 = this.f33934c;
                long j11 = j4 - jArr[i10];
                if (j11 >= 0 || (-j11) < j10) {
                    if (i > 0) {
                        V[] vArr = this.f33933b;
                        v10 = vArr[i10];
                        vArr[i10] = null;
                        this.f33934c = (i10 + 1) % vArr.length;
                        this.f33935d = i - 1;
                        j10 = j11;
                    } else {
                        throw new IllegalStateException();
                    }
                }
            } finally {
            }
        }
        return v10;
    }
}
