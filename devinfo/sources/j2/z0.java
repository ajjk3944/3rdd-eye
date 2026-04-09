package j2;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class z0 extends a {

    /* renamed from: i, reason: collision with root package name */
    public final u0.d1 f27361i;
    public boolean j;

    public z0(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        b5.a1 a1Var = new b5.a1(1, this);
        addOnAttachStateChangeListener(a1Var);
        v1 v1Var = new v1(this);
        pd.b.k(this).f28588a.add(v1Var);
        this.f27064e = new w1(this, a1Var, v1Var);
        this.f27361i = u0.q.r(null);
    }

    @Override // j2.a
    public final void a(int i4, u0.p pVar) {
        pVar.X(420213850);
        int i10 = (pVar.h(this) ? 4 : 2) | i4;
        if (pVar.O(i10 & 1, (i10 & 3) != 2)) {
            mk.e eVar = (mk.e) this.f27361i.getValue();
            if (eVar == null) {
                pVar.W(-1238823553);
            } else {
                pVar.W(98585282);
                eVar.invoke(pVar, 0);
            }
            pVar.p(false);
        } else {
            pVar.R();
        }
        u0.m1 m1VarR = pVar.r();
        if (m1VarR != null) {
            m1VarR.f34870d = new i1.j(this, i4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return z0.class.getName();
    }

    @Override // j2.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.j;
    }

    public final void setContent(mk.e eVar) {
        this.j = true;
        this.f27361i.setValue(eVar);
        if (isAttachedToWindow()) {
            if (this.f27063d == null && !isAttachedToWindow()) {
                throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
            c();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
