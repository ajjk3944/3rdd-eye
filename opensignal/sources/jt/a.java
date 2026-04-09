package jt;

import ht.b0;
import ht.d1;
import ht.l0;
import ht.x0;

/* loaded from: classes.dex */
public final class a extends ht.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f13838a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f13839b;

    public a(b bVar, x0 x0Var) {
        this.f13838a = bVar;
        this.f13839b = x0Var;
    }

    @Override // ht.c
    public final lt.e x(l0 l0Var, lt.d dVar) {
        br.l.e(l0Var, "state");
        br.l.e(dVar, "type");
        b bVar = this.f13838a;
        b0 b0VarX = bVar.x(this.f13839b.g(bVar.h0(dVar), d1.INVARIANT));
        br.l.b(b0VarX);
        return b0VarX;
    }
}
