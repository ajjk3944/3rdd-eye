package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class lg0 {

    /* renamed from: a, reason: collision with root package name */
    public int f13487a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f13488b;

    public lg0(int i4) {
        this.f13488b = new long[i4];
    }

    public void a(long j) {
        if (b(j)) {
            return;
        }
        int i4 = this.f13487a;
        long[] jArrCopyOf = this.f13488b;
        if (i4 >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i4 + 1, jArrCopyOf.length * 2));
            nk.k.d(jArrCopyOf, "copyOf(...)");
            this.f13488b = jArrCopyOf;
        }
        jArrCopyOf[i4] = j;
        if (i4 >= this.f13487a) {
            this.f13487a = i4 + 1;
        }
    }

    public boolean b(long j) {
        int i4 = this.f13487a;
        for (int i10 = 0; i10 < i4; i10++) {
            if (this.f13488b[i10] == j) {
                return true;
            }
        }
        return false;
    }

    public void c(long j) {
        int i4 = this.f13487a;
        int i10 = 0;
        while (i10 < i4) {
            if (j == this.f13488b[i10]) {
                int i11 = this.f13487a - 1;
                while (i10 < i11) {
                    long[] jArr = this.f13488b;
                    int i12 = i10 + 1;
                    jArr[i10] = jArr[i12];
                    i10 = i12;
                }
                this.f13487a--;
                return;
            }
            i10++;
        }
    }

    public void d() {
        int i4 = this.f13487a;
        long[] jArr = this.f13488b;
        if (i4 == jArr.length) {
            this.f13488b = Arrays.copyOf(jArr, i4 + i4);
        }
        long[] jArr2 = this.f13488b;
        int i10 = this.f13487a;
        this.f13487a = i10 + 1;
        jArr2[i10] = 0;
    }

    public void e(long[] jArr) {
        int i4 = this.f13487a;
        int length = jArr.length;
        int i10 = i4 + length;
        long[] jArr2 = this.f13488b;
        int length2 = jArr2.length;
        if (i10 > length2) {
            this.f13488b = Arrays.copyOf(jArr2, Math.max(length2 + length2, i10));
        }
        System.arraycopy(jArr, 0, this.f13488b, this.f13487a, length);
        this.f13487a = i10;
    }

    public long f(int i4) {
        if (i4 >= 0 && i4 < this.f13487a) {
            return this.f13488b[i4];
        }
        int i10 = this.f13487a;
        throw new IndexOutOfBoundsException(je.u.q(i4, i10, "Invalid index ", ", size is ", new StringBuilder(String.valueOf(i4).length() + 24 + String.valueOf(i10).length())));
    }
}
