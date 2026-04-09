package com.google.android.gms.internal.ads;

import android.view.ViewParent;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b40 implements p60 {

    /* renamed from: a, reason: collision with root package name */
    public final qz f9589a;

    /* renamed from: b, reason: collision with root package name */
    public final qd0 f9590b;

    /* renamed from: c, reason: collision with root package name */
    public final wp0 f9591c;

    public b40(qz qzVar, qd0 qd0Var, wp0 wp0Var) {
        this.f9589a = qzVar;
        this.f9590b = qd0Var;
        this.f9591c = wp0Var;
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void n() {
        qz qzVar;
        String str;
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16174ie)).booleanValue() || (qzVar = this.f9589a) == null) {
            return;
        }
        ViewParent parent = qzVar.N().getParent();
        while (true) {
            if (parent == null) {
                str = "0";
                break;
            } else {
                if (parent.getClass().getName().startsWith("androidx.compose.ui")) {
                    str = "1";
                    break;
                }
                parent = parent.getParent();
            }
        }
        rt rtVarA = this.f9590b.a();
        rtVarA.u("action", "hcp");
        rtVarA.u("hcp", str);
        rtVarA.q(this.f9591c);
        rtVarA.v();
    }
}
