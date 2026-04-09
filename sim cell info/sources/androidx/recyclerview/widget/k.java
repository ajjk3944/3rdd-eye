package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class k extends RecyclerView.l {

    /* renamed from: g, reason: collision with root package name */
    boolean f2213g = true;

    public final void A(RecyclerView.d0 d0Var) {
        I(d0Var);
        h(d0Var);
    }

    public final void B(RecyclerView.d0 d0Var) {
        J(d0Var);
    }

    public final void C(RecyclerView.d0 d0Var, boolean z2) {
        K(d0Var, z2);
        h(d0Var);
    }

    public final void D(RecyclerView.d0 d0Var, boolean z2) {
        L(d0Var, z2);
    }

    public final void E(RecyclerView.d0 d0Var) {
        M(d0Var);
        h(d0Var);
    }

    public final void F(RecyclerView.d0 d0Var) {
        N(d0Var);
    }

    public final void G(RecyclerView.d0 d0Var) {
        O(d0Var);
        h(d0Var);
    }

    public final void H(RecyclerView.d0 d0Var) {
        P(d0Var);
    }

    public void I(RecyclerView.d0 d0Var) {
    }

    public void J(RecyclerView.d0 d0Var) {
    }

    public void K(RecyclerView.d0 d0Var, boolean z2) {
    }

    public void L(RecyclerView.d0 d0Var, boolean z2) {
    }

    public void M(RecyclerView.d0 d0Var) {
    }

    public void N(RecyclerView.d0 d0Var) {
    }

    public void O(RecyclerView.d0 d0Var) {
    }

    public void P(RecyclerView.d0 d0Var) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean a(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i2;
        int i3;
        return (cVar == null || ((i2 = cVar.f1993a) == (i3 = cVar2.f1993a) && cVar.f1994b == cVar2.f1994b)) ? w(d0Var) : y(d0Var, i2, cVar.f1994b, i3, cVar2.f1994b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean b(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i2;
        int i3;
        int i4 = cVar.f1993a;
        int i5 = cVar.f1994b;
        if (d0Var2.J()) {
            int i6 = cVar.f1993a;
            i3 = cVar.f1994b;
            i2 = i6;
        } else {
            i2 = cVar2.f1993a;
            i3 = cVar2.f1994b;
        }
        return x(d0Var, d0Var2, i4, i5, i2, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean c(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i2 = cVar.f1993a;
        int i3 = cVar.f1994b;
        View view = d0Var.f1965a;
        int left = cVar2 == null ? view.getLeft() : cVar2.f1993a;
        int top = cVar2 == null ? view.getTop() : cVar2.f1994b;
        if (d0Var.v() || (i2 == left && i3 == top)) {
            return z(d0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return y(d0Var, i2, i3, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean d(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i2 = cVar.f1993a;
        int i3 = cVar2.f1993a;
        if (i2 != i3 || cVar.f1994b != cVar2.f1994b) {
            return y(d0Var, i2, cVar.f1994b, i3, cVar2.f1994b);
        }
        E(d0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean f(RecyclerView.d0 d0Var) {
        return !this.f2213g || d0Var.t();
    }

    public abstract boolean w(RecyclerView.d0 d0Var);

    public abstract boolean x(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i2, int i3, int i4, int i5);

    public abstract boolean y(RecyclerView.d0 d0Var, int i2, int i3, int i4, int i5);

    public abstract boolean z(RecyclerView.d0 d0Var);
}
