package x1;

import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class c extends z0.l implements v, m, t1, q1, w1.c, o1, u, n, m1, i {

    /* renamed from: p, reason: collision with root package name */
    public z0.k f24776p;

    /* renamed from: q, reason: collision with root package name */
    public HashSet f24777q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // w1.c
    public final Object B(oh.p pVar) {
        al.c cVar;
        this.f24777q.add(pVar);
        if (!this.f26495b.f26506o) {
            u1.a.b("visitAncestors called on an unattached node");
        }
        z0.l lVar = this.f26495b.f26499f;
        f0 f0VarR = k.r(this);
        while (f0VarR != null) {
            if ((((z0.l) f0VarR.D.f825g).f26498e & 32) != 0) {
                while (lVar != null) {
                    if ((lVar.f26497d & 32) != 0) {
                        j jVarE = lVar;
                        ?? eVar = 0;
                        while (jVarE != 0) {
                            if (jVarE instanceof w1.c) {
                                w1.c cVar2 = (w1.c) jVarE;
                                if (cVar2.w().a()) {
                                    cVar2.w().b();
                                    throw null;
                                }
                            } else if ((jVarE.f26497d & 32) != 0 && (jVarE instanceof j)) {
                                z0.l lVar2 = jVarE.f24863q;
                                int i10 = 0;
                                jVarE = jVarE;
                                eVar = eVar;
                                while (lVar2 != null) {
                                    if ((lVar2.f26497d & 32) != 0) {
                                        i10++;
                                        eVar = eVar;
                                        if (i10 == 1) {
                                            jVarE = lVar2;
                                        } else {
                                            if (eVar == 0) {
                                                eVar = new p0.e(new z0.l[16]);
                                            }
                                            if (jVarE != 0) {
                                                eVar.b(jVarE);
                                                jVarE = 0;
                                            }
                                            eVar.b(lVar2);
                                        }
                                    }
                                    lVar2 = lVar2.f26500g;
                                    jVarE = jVarE;
                                    eVar = eVar;
                                }
                                if (i10 == 1) {
                                }
                            }
                            jVarE = k.e(eVar);
                        }
                    }
                    lVar = lVar.f26499f;
                }
            }
            f0VarR = f0VarR.C();
            lVar = (f0VarR == null || (cVar = f0VarR.D) == null) ? null : (v1) cVar.f824f;
        }
        return ((ar.a) pVar.f19481d).c();
    }

    @Override // x1.q1
    public final boolean I() {
        br.l.c(this.f24776p, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw new ClassCastException();
    }

    @Override // x1.v
    public final l0 K(m0 m0Var, v1.q qVar, long j) {
        br.l.c(this.f24776p, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        throw new ClassCastException();
    }

    @Override // x1.o1
    public final Object N(Object obj) {
        br.l.c(this.f24776p, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        throw new ClassCastException();
    }

    @Override // x1.t1
    public final void O(SemanticsConfiguration semanticsConfiguration) {
        z0.k kVar = this.f24776p;
        br.l.c(kVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        SemanticsConfiguration semanticsConfiguration2 = new SemanticsConfiguration();
        ((AppendedSemanticsElement) kVar).getClass();
        semanticsConfiguration2.f1193g = false;
        throw null;
    }

    @Override // z0.l
    public final void U() {
        c0(true);
    }

    @Override // z0.l
    public final void V() {
        e0();
    }

    @Override // x1.n
    public final void b(f1 f1Var) {
        br.l.c(this.f24776p, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        throw new ClassCastException();
    }

    public final void c0(boolean z10) {
        if (!this.f26506o) {
            u1.a.b("initializeModifier called on unattached node");
        }
        z0.k kVar = this.f24776p;
        if ((this.f26497d & 32) != 0 && (kVar instanceof c0.m)) {
            b bVar = new b(this, 0);
            u.z zVar = ((AndroidComposeView) k.s(this)).P0;
            if (zVar.f(bVar) < 0) {
                zVar.a(bVar);
            }
        }
        if ((this.f26497d & 4) != 0 && !z10) {
            k.q(this, 2).C0();
        }
        if ((this.f26497d & 2) != 0) {
            v1 v1Var = (v1) k.r(this).D.f824f;
            br.l.c(v1Var, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
            if (v1Var.f24951p) {
                f1 f1Var = this.f26502i;
                br.l.b(f1Var);
                ((x) f1Var).V0(this);
                l1 l1Var = f1Var.I;
                if (l1Var != null) {
                    ((y1.k1) l1Var).invalidate();
                }
            }
            if (!z10) {
                k.q(this, 2).C0();
                k.r(this).N();
            }
        }
        if ((this.f26497d & 8) != 0) {
            ((AndroidComposeView) k.s(this)).x();
        }
    }

    @Override // x1.m
    public final void d(h0 h0Var) {
        z0.k kVar = this.f24776p;
        br.l.c(kVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        w.g.p(kVar);
        throw null;
    }

    public final void d0() {
        z0.k kVar = this.f24776p;
        u1.a.b("onFocusEvent called on wrong node");
        kVar.getClass();
        throw new ClassCastException();
    }

    public final void e0() {
        if (!this.f26506o) {
            u1.a.b("unInitializeModifier called on unattached node");
        }
        z0.k kVar = this.f24776p;
        if ((this.f26497d & 32) != 0 && (kVar instanceof c0.m)) {
            c0.m mVar = (c0.m) kVar;
            c0.q qVar = (c0.q) ((ar.a) c0.b0.f3064a.f19481d).c();
            if (!br.l.a(qVar, mVar.f3094a)) {
                mVar.f3094a = qVar;
                throw null;
            }
        }
        if ((this.f26497d & 8) != 0) {
            ((AndroidComposeView) k.s(this)).x();
        }
    }

    public final void f0() {
        if (this.f26506o) {
            this.f24777q.clear();
            k.s(this).getSnapshotObserver().a(this, d.f24778g, new b(this, 1));
        }
    }

    @Override // x1.m1
    public final boolean j() {
        return this.f26506o;
    }

    @Override // x1.q1
    public final void n(ag.b bVar, r1.f fVar, long j) {
        br.l.c(this.f24776p, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw new ClassCastException();
    }

    @Override // x1.q1
    public final void q() {
        br.l.c(this.f24776p, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw new ClassCastException();
    }

    @Override // x1.m
    public final void s() {
        k.j(this);
    }

    @Override // x1.q1
    public final boolean t() {
        br.l.c(this.f24776p, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw new ClassCastException();
    }

    public final String toString() {
        return this.f24776p.toString();
    }

    @Override // w1.c
    public final w1.a w() {
        return w1.a.f24162a;
    }

    @Override // x1.i, x1.q1
    public final void a() {
    }

    @Override // x1.u
    public final void h(long j) {
    }

    @Override // x1.u
    public final void x(v1.m mVar) {
    }
}
