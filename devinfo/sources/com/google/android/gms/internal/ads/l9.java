package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l9 implements k9 {

    /* renamed from: a, reason: collision with root package name */
    public final z1 f13418a;

    /* renamed from: b, reason: collision with root package name */
    public final u2 f13419b;

    /* renamed from: c, reason: collision with root package name */
    public final l5 f13420c;

    /* renamed from: d, reason: collision with root package name */
    public final mx1 f13421d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13422e;

    /* renamed from: f, reason: collision with root package name */
    public long f13423f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public long f13424h;

    public l9(z1 z1Var, u2 u2Var, l5 l5Var, String str, int i4) throws ua {
        this.f13418a = z1Var;
        this.f13419b = u2Var;
        this.f13420c = l5Var;
        int i10 = l5Var.f13372a;
        int i11 = l5Var.f13373b;
        int i12 = l5Var.f13375d * i10;
        int i13 = l5Var.f13374c;
        int i14 = i12 / 8;
        if (i13 != i14) {
            throw ua.a(null, je.u.q(i14, i13, "Expected block size: ", "; got: ", new StringBuilder(String.valueOf(i14).length() + 28 + String.valueOf(i13).length())));
        }
        int i15 = i11 * i14;
        int i16 = i15 * 8;
        int iMax = Math.max(i14, i15 / 10);
        this.f13422e = iMax;
        lw1 lw1Var = new lw1();
        lw1Var.d("audio/wav");
        lw1Var.e(str);
        lw1Var.g = i16;
        lw1Var.f13658h = i16;
        lw1Var.f13662m = iMax;
        lw1Var.D = i10;
        lw1Var.E = i11;
        lw1Var.F = i4;
        this.f13421d = new mx1(lw1Var);
    }

    @Override // com.google.android.gms.internal.ads.k9
    public final void a(int i4, long j) {
        this.f13418a.o(new n9(this.f13420c, 1, i4, j));
        this.f13419b.f(this.f13421d);
    }

    @Override // com.google.android.gms.internal.ads.k9
    public final boolean b(y1 y1Var, long j) {
        int i4;
        int i10;
        long j8 = j;
        while (j8 > 0 && (i4 = this.g) < (i10 = this.f13422e)) {
            int iG = this.f13419b.g(y1Var, (int) Math.min(i10 - i4, j8), true);
            if (iG == -1) {
                j8 = 0;
            } else {
                this.g += iG;
                j8 -= iG;
            }
        }
        int i11 = this.g;
        int i12 = this.f13420c.f13374c;
        int i13 = i11 / i12;
        if (i13 > 0) {
            long jU = this.f13423f + bq0.u(this.f13424h, 1000000L, r2.f13373b, RoundingMode.DOWN);
            int i14 = i13 * i12;
            int i15 = this.g - i14;
            this.f13419b.d(jU, 1, i14, i15, null);
            this.f13424h += i13;
            this.g = i15;
        }
        return j8 <= 0;
    }

    @Override // com.google.android.gms.internal.ads.k9
    public final void g(long j) {
        this.f13423f = j;
        this.g = 0;
        this.f13424h = 0L;
    }
}
