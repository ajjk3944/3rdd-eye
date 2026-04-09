package jt;

import ht.b0;
import ht.c1;
import ht.i0;
import ht.m0;
import ht.p0;
import java.util.List;
import mq.w;

/* loaded from: classes.dex */
public final class h extends b0 implements lt.c {
    public final boolean B;

    /* renamed from: d, reason: collision with root package name */
    public final lt.b f13845d;

    /* renamed from: g, reason: collision with root package name */
    public final i f13846g;

    /* renamed from: r, reason: collision with root package name */
    public final c1 f13847r;

    /* renamed from: x, reason: collision with root package name */
    public final i0 f13848x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f13849y;

    public h(lt.b bVar, i iVar, c1 c1Var, i0 i0Var, boolean z10, boolean z11) {
        br.l.e(bVar, "captureStatus");
        br.l.e(iVar, "constructor");
        br.l.e(i0Var, "attributes");
        this.f13845d = bVar;
        this.f13846g = iVar;
        this.f13847r = c1Var;
        this.f13848x = i0Var;
        this.f13849y = z10;
        this.B = z11;
    }

    @Override // ht.c1
    /* renamed from: C0, reason: merged with bridge method [inline-methods] */
    public final h q0(f fVar) {
        br.l.e(fVar, "kotlinTypeRefiner");
        i iVar = this.f13846g;
        iVar.getClass();
        p0 p0VarD = iVar.f13850a.d(fVar);
        ah.d dVar = iVar.f13851b != null ? new ah.d(iVar, 25, fVar) : null;
        i iVar2 = iVar.f13852c;
        if (iVar2 == null) {
            iVar2 = iVar;
        }
        i iVar3 = new i(p0VarD, dVar, iVar2, iVar.f13853d);
        c1 c1Var = this.f13847r;
        return new h(this.f13845d, iVar3, c1Var != null ? c1Var : null, this.f13848x, this.f13849y, 32);
    }

    @Override // ht.x
    public final List L() {
        return w.f16945a;
    }

    @Override // ht.x
    public final at.n W() {
        return kt.k.a(kt.g.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // ht.x
    public final i0 X() {
        return this.f13848x;
    }

    @Override // ht.x
    public final m0 Z() {
        return this.f13846g;
    }

    @Override // ht.x
    public final boolean c0() {
        return this.f13849y;
    }

    @Override // ht.b0, ht.c1
    public final c1 p0(boolean z10) {
        return new h(this.f13845d, this.f13846g, this.f13847r, this.f13848x, z10, 32);
    }

    @Override // ht.b0
    /* renamed from: u0 */
    public final b0 p0(boolean z10) {
        return new h(this.f13845d, this.f13846g, this.f13847r, this.f13848x, z10, 32);
    }

    @Override // ht.b0
    /* renamed from: v0 */
    public final b0 r0(i0 i0Var) {
        br.l.e(i0Var, "newAttributes");
        return new h(this.f13845d, this.f13846g, this.f13847r, i0Var, this.f13849y, this.B);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(lt.b bVar, i iVar, c1 c1Var, i0 i0Var, boolean z10, int i10) {
        if ((i10 & 8) != 0) {
            i0.f10910d.getClass();
            i0Var = i0.f10911g;
        }
        this(bVar, iVar, c1Var, i0Var, (i10 & 16) != 0 ? false : z10, false);
    }
}
