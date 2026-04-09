package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.c72;
import com.yandex.mobile.ads.impl.dc0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class s40 implements w40 {

    /* renamed from: a, reason: collision with root package name */
    private final List<c72.a> f32863a;

    /* renamed from: b, reason: collision with root package name */
    private final n52[] f32864b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f32865c;

    /* renamed from: d, reason: collision with root package name */
    private int f32866d;

    /* renamed from: e, reason: collision with root package name */
    private int f32867e;

    /* renamed from: f, reason: collision with root package name */
    private long f32868f = -9223372036854775807L;

    public s40(List<c72.a> list) {
        this.f32863a = list;
        this.f32864b = new n52[list.size()];
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a(uf1 uf1Var) {
        if (this.f32865c) {
            if (this.f32866d == 2) {
                if (uf1Var.a() == 0) {
                    return;
                }
                if (uf1Var.t() != 32) {
                    this.f32865c = false;
                }
                this.f32866d--;
                if (!this.f32865c) {
                    return;
                }
            }
            if (this.f32866d == 1) {
                if (uf1Var.a() == 0) {
                    return;
                }
                if (uf1Var.t() != 0) {
                    this.f32865c = false;
                }
                this.f32866d--;
                if (!this.f32865c) {
                    return;
                }
            }
            int iD = uf1Var.d();
            int iA = uf1Var.a();
            for (n52 n52Var : this.f32864b) {
                uf1Var.e(iD);
                n52Var.a(iA, uf1Var);
            }
            this.f32867e += iA;
        }
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void b() {
        if (this.f32865c) {
            if (this.f32868f != -9223372036854775807L) {
                for (n52 n52Var : this.f32864b) {
                    n52Var.a(this.f32868f, 1, this.f32867e, 0, null);
                }
            }
            this.f32865c = false;
        }
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a(w70 w70Var, c72.d dVar) {
        for (int i = 0; i < this.f32864b.length; i++) {
            c72.a aVar = this.f32863a.get(i);
            dVar.a();
            n52 n52VarA = w70Var.a(dVar.c(), 3);
            n52VarA.a(new dc0.a().b(dVar.b()).e("application/dvbsubs").a(Collections.singletonList(aVar.f25557b)).d(aVar.f25556a).a());
            this.f32864b[i] = n52VarA;
        }
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a(int i, long j4) {
        if ((i & 4) == 0) {
            return;
        }
        this.f32865c = true;
        if (j4 != -9223372036854775807L) {
            this.f32868f = j4;
        }
        this.f32867e = 0;
        this.f32866d = 2;
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a() {
        this.f32865c = false;
        this.f32868f = -9223372036854775807L;
    }
}
