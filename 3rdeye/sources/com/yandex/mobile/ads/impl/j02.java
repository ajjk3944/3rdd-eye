package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* loaded from: classes3.dex */
final class j02 {

    /* renamed from: a, reason: collision with root package name */
    private final uf1 f28913a = new uf1(8);

    /* renamed from: b, reason: collision with root package name */
    private int f28914b;

    private long a(rz rzVar) throws IOException {
        int i = 0;
        rzVar.b(this.f28913a.c(), 0, 1, false);
        int i10 = this.f28913a.c()[0] & 255;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int i11 = 128;
        int i12 = 0;
        while ((i10 & i11) == 0) {
            i11 >>= 1;
            i12++;
        }
        int i13 = i10 & (~i11);
        rzVar.b(this.f28913a.c(), 1, i12, false);
        while (i < i12) {
            i++;
            i13 = (this.f28913a.c()[i] & 255) + (i13 << 8);
        }
        this.f28914b = i12 + 1 + this.f28914b;
        return i13;
    }

    public final boolean b(rz rzVar) throws IOException {
        long jB = rzVar.b();
        long j4 = 1024;
        if (jB != -1 && jB <= 1024) {
            j4 = jB;
        }
        int i = (int) j4;
        rzVar.b(this.f28913a.c(), 0, 4, false);
        long jV = this.f28913a.v();
        this.f28914b = 4;
        while (jV != 440786851) {
            int i10 = this.f28914b + 1;
            this.f28914b = i10;
            if (i10 == i) {
                return false;
            }
            rzVar.b(this.f28913a.c(), 0, 1, false);
            jV = ((jV << 8) & (-256)) | (this.f28913a.c()[0] & 255);
        }
        long jA = a(rzVar);
        long j10 = this.f28914b;
        if (jA != Long.MIN_VALUE && (jB == -1 || j10 + jA < jB)) {
            while (true) {
                long j11 = this.f28914b;
                long j12 = j10 + jA;
                if (j11 < j12) {
                    if (a(rzVar) == Long.MIN_VALUE) {
                        return false;
                    }
                    long jA2 = a(rzVar);
                    if (jA2 < 0 || jA2 > 2147483647L) {
                        break;
                    }
                    if (jA2 != 0) {
                        int i11 = (int) jA2;
                        rzVar.a(false, i11);
                        this.f28914b += i11;
                    }
                } else if (j11 == j12) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
