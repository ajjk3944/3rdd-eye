package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r40 implements oj0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f15525a;

    public r40(List list) {
        this.f15525a = list;
    }

    @Override // com.google.android.gms.internal.ads.oj0
    public final void F1() {
        for (vd.b bVar : this.f15525a) {
            bVar.a(new q81(0, bVar, new hl(27)), k81.f13081a);
        }
    }

    public r40(o40 o40Var) {
        this.f15525a = Collections.singletonList(yo0.e(o40Var));
    }
}
