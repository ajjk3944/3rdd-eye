package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.c72;
import com.yandex.mobile.ads.impl.dc0;
import com.yandex.mobile.ads.impl.v11;

/* loaded from: classes3.dex */
public final class u11 implements w40 {

    /* renamed from: a, reason: collision with root package name */
    private final uf1 f33850a;

    /* renamed from: b, reason: collision with root package name */
    private final v11.a f33851b;

    /* renamed from: c, reason: collision with root package name */
    private final String f33852c;

    /* renamed from: d, reason: collision with root package name */
    private n52 f33853d;

    /* renamed from: e, reason: collision with root package name */
    private String f33854e;

    /* renamed from: f, reason: collision with root package name */
    private int f33855f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f33856g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f33857h;
    private boolean i;

    /* renamed from: j, reason: collision with root package name */
    private long f33858j;

    /* renamed from: k, reason: collision with root package name */
    private int f33859k;

    /* renamed from: l, reason: collision with root package name */
    private long f33860l;

    public u11(String str) {
        uf1 uf1Var = new uf1(4);
        this.f33850a = uf1Var;
        uf1Var.c()[0] = -1;
        this.f33851b = new v11.a();
        this.f33860l = -9223372036854775807L;
        this.f33852c = str;
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a(uf1 uf1Var) {
        if (this.f33853d == null) {
            throw new IllegalStateException();
        }
        while (uf1Var.a() > 0) {
            int i = this.f33855f;
            if (i == 0) {
                byte[] bArrC = uf1Var.c();
                int iD = uf1Var.d();
                int iE = uf1Var.e();
                while (true) {
                    if (iD >= iE) {
                        uf1Var.e(iE);
                        break;
                    }
                    byte b10 = bArrC[iD];
                    boolean z10 = (b10 & 255) == 255;
                    boolean z11 = this.i && (b10 & 224) == 224;
                    this.i = z10;
                    if (z11) {
                        uf1Var.e(iD + 1);
                        this.i = false;
                        this.f33850a.c()[1] = bArrC[iD];
                        this.f33856g = 2;
                        this.f33855f = 1;
                        break;
                    }
                    iD++;
                }
            } else if (i == 1) {
                int iMin = Math.min(uf1Var.a(), 4 - this.f33856g);
                uf1Var.a(this.f33850a.c(), this.f33856g, iMin);
                int i10 = this.f33856g + iMin;
                this.f33856g = i10;
                if (i10 >= 4) {
                    this.f33850a.e(0);
                    if (this.f33851b.a(this.f33850a.h())) {
                        this.f33859k = this.f33851b.f34279c;
                        if (!this.f33857h) {
                            this.f33858j = (r0.f34283g * 1000000) / r0.f34280d;
                            this.f33853d.a(new dc0.a().b(this.f33854e).e(this.f33851b.f34278b).h(4096).c(this.f33851b.f34281e).l(this.f33851b.f34280d).d(this.f33852c).a());
                            this.f33857h = true;
                        }
                        this.f33850a.e(0);
                        this.f33853d.a(4, this.f33850a);
                        this.f33855f = 2;
                    } else {
                        this.f33856g = 0;
                        this.f33855f = 1;
                    }
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(uf1Var.a(), this.f33859k - this.f33856g);
                this.f33853d.a(iMin2, uf1Var);
                int i11 = this.f33856g + iMin2;
                this.f33856g = i11;
                int i12 = this.f33859k;
                if (i11 >= i12) {
                    long j4 = this.f33860l;
                    if (j4 != -9223372036854775807L) {
                        this.f33853d.a(j4, 1, i12, 0, null);
                        this.f33860l += this.f33858j;
                    }
                    this.f33856g = 0;
                    this.f33855f = 0;
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a(w70 w70Var, c72.d dVar) {
        dVar.a();
        this.f33854e = dVar.b();
        this.f33853d = w70Var.a(dVar.c(), 1);
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a(int i, long j4) {
        if (j4 != -9223372036854775807L) {
            this.f33860l = j4;
        }
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a() {
        this.f33855f = 0;
        this.f33856g = 0;
        this.i = false;
        this.f33860l = -9223372036854775807L;
    }
}
