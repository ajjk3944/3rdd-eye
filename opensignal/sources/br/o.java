package br;

import java.util.Objects;

/* loaded from: classes.dex */
public final class o extends s implements ir.j, ir.k {
    public o(ir.d dVar, String str, String str2) {
        super(c.f2901a, ((e) dVar).a(), str, str2, !Objects.nonNull(dVar) ? 1 : 0);
    }

    @Override // ar.k
    public final Object a(Object obj) {
        return get(obj);
    }

    @Override // ir.s
    public final Object get(Object obj) {
        return ((lr.r) b()).s(obj);
    }

    @Override // br.d
    public final ir.c j() {
        return x.f2918a.d(this);
    }

    @Override // ir.j
    public final void u(Object obj, Object obj2) {
        ((lr.r) d()).s(obj, obj2);
    }

    @Override // ir.v
    public final ir.r b() {
        return ((ir.j) A()).b();
    }

    @Override // ir.k
    public final ir.i d() {
        return ((ir.j) A()).d();
    }

    public o(Class cls, String str, String str2, int i10) {
        super(c.f2901a, cls, str, str2, i10);
    }
}
