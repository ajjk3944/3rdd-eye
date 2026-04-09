package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class h41 implements l91 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11701a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f11702b = new ArrayList(1);

    /* renamed from: c, reason: collision with root package name */
    public int f11703c;

    /* renamed from: d, reason: collision with root package name */
    public gb1 f11704d;

    public h41(boolean z3) {
        this.f11701a = z3;
    }

    @Override // com.google.android.gms.internal.ads.l91
    public Map A1() {
        return Collections.EMPTY_MAP;
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void b(hm1 hm1Var) {
        hm1Var.getClass();
        ArrayList arrayList = this.f11702b;
        if (arrayList.contains(hm1Var)) {
            return;
        }
        arrayList.add(hm1Var);
        this.f11703c++;
    }

    public final void c(gb1 gb1Var) {
        for (int i4 = 0; i4 < this.f11703c; i4++) {
            ((hm1) this.f11702b.get(i4)).getClass();
        }
    }

    public final void e(gb1 gb1Var) {
        this.f11704d = gb1Var;
        for (int i4 = 0; i4 < this.f11703c; i4++) {
            ((hm1) this.f11702b.get(i4)).d(this, gb1Var, this.f11701a);
        }
    }

    public final void g(int i4) {
        gb1 gb1Var = this.f11704d;
        String str = bq0.f9768a;
        for (int i10 = 0; i10 < this.f11703c; i10++) {
            ((hm1) this.f11702b.get(i10)).g(gb1Var, this.f11701a, i4);
        }
    }

    public final void h() {
        gb1 gb1Var = this.f11704d;
        String str = bq0.f9768a;
        for (int i4 = 0; i4 < this.f11703c; i4++) {
            ((hm1) this.f11702b.get(i4)).n(gb1Var, this.f11701a);
        }
        this.f11704d = null;
    }
}
