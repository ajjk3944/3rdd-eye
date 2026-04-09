package y;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import br.w;
import c8.x;
import e2.r;
import e2.s;
import ir.v;
import wt.t0;
import x1.f0;
import x1.f1;
import x1.h1;
import x1.t1;
import x1.v1;
import x1.y1;

/* loaded from: classes.dex */
public final class l extends x1.j implements t1, x1.n, x1.h, h1, y1 {

    /* renamed from: w, reason: collision with root package name */
    public static final b f25598w = new b();

    /* renamed from: r, reason: collision with root package name */
    public a0.i f25599r;

    /* renamed from: s, reason: collision with root package name */
    public final bq.g f25600s;

    /* renamed from: t, reason: collision with root package name */
    public a0.d f25601t;

    /* renamed from: u, reason: collision with root package name */
    public f1 f25602u;

    /* renamed from: v, reason: collision with root package name */
    public final e1.p f25603v;

    public l(a0.i iVar, bq.g gVar) {
        this.f25599r = iVar;
        this.f25600s = gVar;
        e1.p pVar = new e1.p(0, new mu.i(2, this, l.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 1), 4);
        c0(pVar);
        this.f25603v = pVar;
    }

    @Override // x1.h1
    public final void E() {
        w wVar = new w();
        x1.k.p(this, new x(wVar, 6, this));
        if (wVar.f2917a != null) {
            throw new ClassCastException();
        }
        this.f25603v.e0().isFocused();
    }

    @Override // x1.t1
    public final void O(SemanticsConfiguration semanticsConfiguration) {
        boolean zIsFocused = this.f25603v.e0().isFocused();
        v[] vVarArr = r.f7759a;
        s sVar = e2.p.k;
        v vVar = r.f7759a[4];
        sVar.a(semanticsConfiguration, Boolean.valueOf(zIsFocused));
        semanticsConfiguration.d(e2.g.f7703t, new e2.a(null, new xp.c(0, this, l.class, "requestFocus", "requestFocus()Z", 0, 3)));
    }

    @Override // z0.l
    public final boolean R() {
        return false;
    }

    @Override // x1.n
    public final void b(f1 f1Var) {
        this.f25602u = f1Var;
        if (this.f25603v.e0().isFocused()) {
            if (!f1Var.v0().f26506o) {
                g0();
                return;
            }
            f1 f1Var2 = this.f25602u;
            if (f1Var2 == null || !f1Var2.v0().f26506o) {
                return;
            }
            g0();
        }
    }

    @Override // x1.y1
    public final Object f() {
        return f25598w;
    }

    public final void f0(a0.i iVar, a0.h hVar) {
        if (!this.f26506o) {
            iVar.b(hVar);
            return;
        }
        t0 t0Var = (t0) Q().getCoroutineContext().Y(wt.r.f24653d);
        wt.w.s(Q(), null, null, new au.e(iVar, hVar, t0Var != null ? t0Var.R(new c0.s(iVar, 7, hVar)) : null, null, 12), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void g0() {
        al.c cVar;
        if (this.f26506o) {
            if (!this.f26495b.f26506o) {
                u1.a.b("visitAncestors called on an unattached node");
            }
            z0.l lVar = this.f26495b.f26499f;
            f0 f0VarR = x1.k.r(this);
            while (f0VarR != null) {
                if ((((z0.l) f0VarR.D.f825g).f26498e & 262144) != 0) {
                    while (lVar != null) {
                        if ((lVar.f26497d & 262144) != 0) {
                            x1.j jVarE = lVar;
                            ?? eVar = 0;
                            while (jVarE != 0) {
                                if (jVarE instanceof y1) {
                                    if (m.f25604p.equals(((y1) jVarE).f())) {
                                        return;
                                    }
                                } else if ((jVarE.f26497d & 262144) != 0 && (jVarE instanceof x1.j)) {
                                    z0.l lVar2 = jVarE.f24863q;
                                    int i10 = 0;
                                    jVarE = jVarE;
                                    eVar = eVar;
                                    while (lVar2 != null) {
                                        if ((lVar2.f26497d & 262144) != 0) {
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
                                jVarE = x1.k.e(eVar);
                            }
                        }
                        lVar = lVar.f26499f;
                    }
                }
                f0VarR = f0VarR.C();
                lVar = (f0VarR == null || (cVar = f0VarR.D) == null) ? null : (v1) cVar.f824f;
            }
        }
    }

    public final void h0(a0.i iVar) {
        a0.d dVar;
        if (br.l.a(this.f25599r, iVar)) {
            return;
        }
        a0.i iVar2 = this.f25599r;
        if (iVar2 != null && (dVar = this.f25601t) != null) {
            iVar2.b(new a0.e(dVar));
        }
        this.f25601t = null;
        this.f25599r = iVar;
    }

    @Override // z0.l
    public final void W() {
    }
}
