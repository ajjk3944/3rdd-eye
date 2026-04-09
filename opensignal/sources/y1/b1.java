package y1;

import android.content.Context;

/* loaded from: classes.dex */
public final class b1 extends a {
    public final n0.x0 E;
    public boolean F;

    public b1(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        g1.e eVar = new g1.e(9, this);
        addOnAttachStateChangeListener(eVar);
        u1 u1Var = new u1(this);
        z3.a.b(this).f26624a.add(u1Var);
        this.f25624x = new es.b0(this, eVar, u1Var, 6);
        this.E = androidx.compose.runtime.c.f(null);
    }

    @Override // y1.a
    public final void a(int i10, n0.p pVar) {
        pVar.T(420213850);
        int i11 = (pVar.g(this) ? 4 : 2) | i10;
        if (pVar.K(i11 & 1, (i11 & 3) != 2)) {
            ar.n nVar = (ar.n) ((n0.b2) this.E).getValue();
            if (nVar == null) {
                pVar.S(-1238798753);
            } else {
                pVar.S(98586082);
                nVar.w(pVar, 0);
            }
            pVar.o(false);
        } else {
            pVar.N();
        }
        n0.k1 k1VarQ = pVar.q();
        if (k1VarQ != null) {
            k1VarQ.f17207d = new gv.a(this, i10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return b1.class.getName();
    }

    @Override // y1.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.F;
    }

    public final void setContent(ar.n nVar) {
        this.F = true;
        ((n0.b2) this.E).setValue(nVar);
        if (isAttachedToWindow()) {
            if (this.f25623r == null && !isAttachedToWindow()) {
                throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
            c();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
