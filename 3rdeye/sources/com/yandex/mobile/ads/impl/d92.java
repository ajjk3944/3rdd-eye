package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* loaded from: classes3.dex */
final class d92 {

    /* renamed from: d, reason: collision with root package name */
    private static final long[] f26025d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f26026a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private int f26027b;

    /* renamed from: c, reason: collision with root package name */
    private int f26028c;

    public static long a(byte[] bArr, int i, boolean z10) {
        long j4 = bArr[0] & 255;
        if (z10) {
            j4 &= ~f26025d[i - 1];
        }
        for (int i10 = 1; i10 < i; i10++) {
            j4 = (j4 << 8) | (bArr[i10] & 255);
        }
        return j4;
    }

    public final void b() {
        this.f26027b = 0;
        this.f26028c = 0;
    }

    public final int a() {
        return this.f26028c;
    }

    public static int a(int i) {
        long j4;
        int i10 = 0;
        do {
            long[] jArr = f26025d;
            if (i10 >= 8) {
                return -1;
            }
            j4 = jArr[i10] & i;
            i10++;
        } while (j4 == 0);
        return i10;
    }

    public final long a(rz rzVar, boolean z10, boolean z11, int i) throws IOException {
        if (this.f26027b == 0) {
            if (!rzVar.a(this.f26026a, 0, 1, z10)) {
                return -1L;
            }
            int iA = a(this.f26026a[0] & 255);
            this.f26028c = iA;
            if (iA != -1) {
                this.f26027b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i10 = this.f26028c;
        if (i10 > i) {
            this.f26027b = 0;
            return -2L;
        }
        if (i10 != 1) {
            rzVar.a(this.f26026a, 1, i10 - 1, false);
        }
        this.f26027b = 0;
        return a(this.f26026a, this.f26028c, z11);
    }
}
