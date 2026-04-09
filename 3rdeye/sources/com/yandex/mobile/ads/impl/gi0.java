package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.c72;
import com.yandex.mobile.ads.impl.dc0;

/* loaded from: classes3.dex */
public final class gi0 implements w40 {

    /* renamed from: b, reason: collision with root package name */
    private n52 f27757b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f27758c;

    /* renamed from: e, reason: collision with root package name */
    private int f27760e;

    /* renamed from: f, reason: collision with root package name */
    private int f27761f;

    /* renamed from: a, reason: collision with root package name */
    private final uf1 f27756a = new uf1(10);

    /* renamed from: d, reason: collision with root package name */
    private long f27759d = -9223372036854775807L;

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a(uf1 uf1Var) {
        if (this.f27757b == null) {
            throw new IllegalStateException();
        }
        if (this.f27758c) {
            int iA = uf1Var.a();
            int i = this.f27761f;
            if (i < 10) {
                int iMin = Math.min(iA, 10 - i);
                System.arraycopy(uf1Var.c(), uf1Var.d(), this.f27756a.c(), this.f27761f, iMin);
                if (this.f27761f + iMin == 10) {
                    this.f27756a.e(0);
                    if (73 != this.f27756a.t() || 68 != this.f27756a.t() || 51 != this.f27756a.t()) {
                        rs0.d("Id3Reader", "Discarding invalid ID3 tag");
                        this.f27758c = false;
                        return;
                    } else {
                        this.f27756a.f(3);
                        this.f27760e = this.f27756a.s() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.f27760e - this.f27761f);
            this.f27757b.a(iMin2, uf1Var);
            this.f27761f += iMin2;
        }
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void b() {
        int i;
        n52 n52Var = this.f27757b;
        if (n52Var == null) {
            throw new IllegalStateException();
        }
        if (this.f27758c && (i = this.f27760e) != 0 && this.f27761f == i) {
            long j4 = this.f27759d;
            if (j4 != -9223372036854775807L) {
                n52Var.a(j4, 1, i, 0, null);
            }
            this.f27758c = false;
        }
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a(w70 w70Var, c72.d dVar) {
        dVar.a();
        n52 n52VarA = w70Var.a(dVar.c(), 5);
        this.f27757b = n52VarA;
        n52VarA.a(new dc0.a().b(dVar.b()).e("application/id3").a());
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a(int i, long j4) {
        if ((i & 4) == 0) {
            return;
        }
        this.f27758c = true;
        if (j4 != -9223372036854775807L) {
            this.f27759d = j4;
        }
        this.f27760e = 0;
        this.f27761f = 0;
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a() {
        this.f27758c = false;
        this.f27759d = -9223372036854775807L;
    }
}
