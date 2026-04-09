package ht;

import java.util.List;

/* loaded from: classes.dex */
public final class c0 extends b0 {

    /* renamed from: d, reason: collision with root package name */
    public final m0 f10886d;

    /* renamed from: g, reason: collision with root package name */
    public final List f10887g;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f10888r;

    /* renamed from: x, reason: collision with root package name */
    public final at.n f10889x;

    /* renamed from: y, reason: collision with root package name */
    public final ar.k f10890y;

    public c0(m0 m0Var, List list, boolean z10, at.n nVar, ar.k kVar) {
        br.l.e(m0Var, "constructor");
        br.l.e(list, "arguments");
        br.l.e(nVar, "memberScope");
        this.f10886d = m0Var;
        this.f10887g = list;
        this.f10888r = z10;
        this.f10889x = nVar;
        this.f10890y = kVar;
        if (!(nVar instanceof kt.f) || (nVar instanceof kt.l)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + nVar + '\n' + m0Var);
    }

    @Override // ht.x
    public final List L() {
        return this.f10887g;
    }

    @Override // ht.x
    public final at.n W() {
        return this.f10889x;
    }

    @Override // ht.x
    public final i0 X() {
        i0.f10910d.getClass();
        return i0.f10911g;
    }

    @Override // ht.x
    public final m0 Z() {
        return this.f10886d;
    }

    @Override // ht.x
    public final boolean c0() {
        return this.f10888r;
    }

    @Override // ht.x
    /* renamed from: h0 */
    public final x q0(jt.f fVar) {
        br.l.e(fVar, "kotlinTypeRefiner");
        b0 b0Var = (b0) this.f10890y.a(fVar);
        return b0Var == null ? this : b0Var;
    }

    @Override // ht.c1
    public final c1 q0(jt.f fVar) {
        br.l.e(fVar, "kotlinTypeRefiner");
        b0 b0Var = (b0) this.f10890y.a(fVar);
        return b0Var == null ? this : b0Var;
    }

    @Override // ht.b0
    /* renamed from: u0 */
    public final b0 p0(boolean z10) {
        return z10 == this.f10888r ? this : z10 ? new a0(this, 1) : new a0(this, 0);
    }

    @Override // ht.b0
    /* renamed from: v0 */
    public final b0 r0(i0 i0Var) {
        br.l.e(i0Var, "newAttributes");
        return i0Var.isEmpty() ? this : new d0(this, i0Var);
    }
}
