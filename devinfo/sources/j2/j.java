package j2;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.xz;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j extends i1.m implements m2.a, i2.u1, a2.b, i2.u, i2.z1, i2.i {

    /* renamed from: o, reason: collision with root package name */
    public final c2.l0 f27187o = new c2.l0(8, this);

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r f27188p;

    public j(r rVar) {
        this.f27188p = rVar;
    }

    @Override // i2.u
    public final /* synthetic */ int L(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        return d.h.d(this, m0Var, i0Var, i4);
    }

    @Override // i2.u
    public final /* synthetic */ int S(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        return d.h.h(this, m0Var, i0Var, i4);
    }

    @Override // i2.u1
    public final /* synthetic */ boolean Y() {
        return false;
    }

    @Override // i2.u
    public final g2.k0 a0(g2.l0 l0Var, g2.i0 i0Var, long j) {
        g2.s0 s0VarV = i0Var.v(j);
        return l0Var.N(s0VarV.f24408a, s0VarV.f24409b, zj.t.f38318a, this.f27187o, new g2.v0(s0VarV, 1));
    }

    @Override // i2.u1
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // i2.z1
    public final Object e() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // i2.u
    public final /* synthetic */ int h(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        return d.h.f(this, m0Var, i0Var, i4);
    }

    @Override // m2.a
    public final Object n(i2.d1 d1Var, c2.c cVar, ek.j jVar) {
        long jE = d1Var.E(0L);
        o1.c cVar2 = (o1.c) cVar.invoke();
        o1.c cVarF = cVar2 != null ? cVar2.f(jE) : null;
        if (cVarF != null) {
            this.f27188p.requestRectangleOnScreen(new Rect((int) cVarF.f30366a, (int) cVarF.f30367b, (int) cVarF.f30368c, (int) cVarF.f30369d), false);
        }
        return yj.u.f37649a;
    }

    @Override // a2.b
    public final boolean r(KeyEvent keyEvent) {
        n1.c cVar;
        int[] iArr = n1.d.f29515a;
        long jA = ci.b.a(keyEvent.getKeyCode());
        boolean z3 = true;
        if (a2.a.a(jA, a2.a.f170b)) {
            cVar = new n1.c(2);
        } else if (a2.a.a(jA, a2.a.f171c)) {
            cVar = new n1.c(1);
        } else if (a2.a.a(jA, a2.a.f176i)) {
            cVar = new n1.c(keyEvent.isShiftPressed() ? 2 : 1);
        } else {
            cVar = a2.a.a(jA, a2.a.g) ? new n1.c(4) : a2.a.a(jA, a2.a.f174f) ? new n1.c(3) : (a2.a.a(jA, a2.a.f172d) || a2.a.a(jA, a2.a.f179m)) ? new n1.c(5) : (a2.a.a(jA, a2.a.f173e) || a2.a.a(jA, a2.a.f180n)) ? new n1.c(6) : (a2.a.a(jA, a2.a.f175h) || a2.a.a(jA, a2.a.f177k) || a2.a.a(jA, a2.a.f181o)) ? new n1.c(7) : (a2.a.a(jA, a2.a.f169a) || a2.a.a(jA, a2.a.f178l)) ? new n1.c(8) : null;
        }
        if (cVar != null) {
            int i4 = cVar.f29514a;
            if (a.a.p(keyEvent) == 2) {
                r rVar = this.f27188p;
                n1.s sVarH = ((xz) rVar.getFocusOwner()).h();
                if (sVarH == null || !sVarH.f29549o || !rVar.y(i4)) {
                    Boolean boolG = ((xz) rVar.getFocusOwner()).g(i4, rVar.getEmbeddedViewFocusRect(), new c2.l0(7, cVar));
                    if (!(boolG != null ? boolG.booleanValue() : true)) {
                        if (i4 != 1 && i4 != 2) {
                            z3 = false;
                        }
                        if (z3) {
                            Integer numC = n1.d.c(i4);
                            int iIntValue = numC != null ? numC.intValue() : 2;
                            FocusFinder focusFinder = FocusFinder.getInstance();
                            View rootView = rVar.getRootView();
                            nk.k.c(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                            View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, rVar.getView(), iIntValue);
                            if (viewFindNextFocus == null || viewFindNextFocus.equals(rVar)) {
                                return ((xz) rVar.getFocusOwner()).i(i4);
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // i2.u
    public final /* synthetic */ int t(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        return d.h.b(this, m0Var, i0Var, i4);
    }

    @Override // i2.u1
    public final /* synthetic */ boolean v() {
        return false;
    }

    @Override // i2.u1
    public final void l(p2.x xVar) {
    }
}
