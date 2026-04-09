package com.yandex.mobile.ads.impl;

import com.google.android.gms.ads.AdRequest;
import com.yandex.mobile.ads.impl.tw1;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class ho {

    /* renamed from: a, reason: collision with root package name */
    protected final n52 f28298a;

    /* renamed from: b, reason: collision with root package name */
    private final int f28299b;

    /* renamed from: c, reason: collision with root package name */
    private final int f28300c;

    /* renamed from: d, reason: collision with root package name */
    private final long f28301d;

    /* renamed from: e, reason: collision with root package name */
    private final int f28302e;

    /* renamed from: f, reason: collision with root package name */
    private int f28303f;

    /* renamed from: g, reason: collision with root package name */
    private int f28304g;

    /* renamed from: h, reason: collision with root package name */
    private int f28305h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f28306j;

    /* renamed from: k, reason: collision with root package name */
    private long[] f28307k;

    /* renamed from: l, reason: collision with root package name */
    private int[] f28308l;

    public ho(int i, int i10, long j4, int i11, n52 n52Var) {
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            z10 = false;
        }
        zf.a(z10);
        this.f28301d = j4;
        this.f28302e = i11;
        this.f28298a = n52Var;
        this.f28299b = a(i, i10 == 2 ? 1667497984 : 1651965952);
        this.f28300c = i10 == 2 ? a(i, 1650720768) : -1;
        this.f28307k = new long[AdRequest.MAX_CONTENT_URL_LENGTH];
        this.f28308l = new int[AdRequest.MAX_CONTENT_URL_LENGTH];
    }

    public final void a(long j4) {
        if (this.f28306j == this.f28308l.length) {
            long[] jArr = this.f28307k;
            this.f28307k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f28308l;
            this.f28308l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f28307k;
        int i = this.f28306j;
        jArr2[i] = j4;
        this.f28308l[i] = this.i;
        this.f28306j = i + 1;
    }

    public final tw1.a b(long j4) {
        long j10 = 1;
        int i = (int) (j4 / ((this.f28301d * j10) / this.f28302e));
        int iA = s82.a(this.f28308l, i, true, true);
        int i10 = this.f28308l[iA];
        if (i10 == i) {
            vw1 vw1Var = new vw1(((this.f28301d * j10) / this.f28302e) * i10, this.f28307k[iA]);
            return new tw1.a(vw1Var, vw1Var);
        }
        long j11 = i10;
        long j12 = (this.f28301d * j10) / this.f28302e;
        long[] jArr = this.f28307k;
        vw1 vw1Var2 = new vw1(j11 * j12, jArr[iA]);
        int i11 = iA + 1;
        return i11 < jArr.length ? new tw1.a(vw1Var2, new vw1(j12 * r0[i11], jArr[i11])) : new tw1.a(vw1Var2, vw1Var2);
    }

    public final void c(long j4) {
        if (this.f28306j == 0) {
            this.f28305h = 0;
        } else {
            this.f28305h = this.f28308l[s82.b(this.f28307k, j4, true)];
        }
    }

    public final void a() {
        this.f28307k = Arrays.copyOf(this.f28307k, this.f28306j);
        this.f28308l = Arrays.copyOf(this.f28308l, this.f28306j);
    }

    private static int a(int i, int i10) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i10;
    }

    public final boolean a(int i) {
        return this.f28299b == i || this.f28300c == i;
    }

    public final boolean a(rz rzVar) throws IOException {
        int i = this.f28304g;
        int iB = i - this.f28298a.b(rzVar, i, false);
        this.f28304g = iB;
        boolean z10 = iB == 0;
        if (z10) {
            if (this.f28303f > 0) {
                n52 n52Var = this.f28298a;
                int i10 = this.f28305h;
                n52Var.a((this.f28301d * i10) / this.f28302e, Arrays.binarySearch(this.f28308l, i10) >= 0 ? 1 : 0, this.f28303f, 0, null);
            }
            this.f28305h++;
        }
        return z10;
    }

    public final void b() {
        this.i++;
    }

    public final void b(int i) {
        this.f28303f = i;
        this.f28304g = i;
    }
}
