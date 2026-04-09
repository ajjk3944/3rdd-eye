package com.mbridge.msdk.thrid.okhttp.internal.http2;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private int f17942a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f17943b = new int[10];

    public void a() {
        this.f17942a = 0;
        Arrays.fill(this.f17943b, 0);
    }

    public int b() {
        if ((this.f17942a & 2) != 0) {
            return this.f17943b[1];
        }
        return -1;
    }

    public int c(int i10) {
        return (this.f17942a & 32) != 0 ? this.f17943b[5] : i10;
    }

    public boolean d(int i10) {
        return ((1 << i10) & this.f17942a) != 0;
    }

    public int b(int i10) {
        return (this.f17942a & 16) != 0 ? this.f17943b[4] : i10;
    }

    public int c() {
        if ((this.f17942a & 128) != 0) {
            return this.f17943b[7];
        }
        return 65535;
    }

    public int d() {
        return Integer.bitCount(this.f17942a);
    }

    public m a(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f17943b;
            if (i10 < iArr.length) {
                this.f17942a = (1 << i10) | this.f17942a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    public int a(int i10) {
        return this.f17943b[i10];
    }

    public void a(m mVar) {
        for (int i10 = 0; i10 < 10; i10++) {
            if (mVar.d(i10)) {
                a(i10, mVar.a(i10));
            }
        }
    }
}
