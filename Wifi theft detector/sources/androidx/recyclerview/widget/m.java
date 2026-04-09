package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class m extends RecyclerView.ItemAnimator {

    /* renamed from: g, reason: collision with root package name */
    public boolean f4002g = true;

    public final void A(RecyclerView.c0 c0Var) {
        I(c0Var);
        h(c0Var);
    }

    public final void B(RecyclerView.c0 c0Var) {
        J(c0Var);
    }

    public final void C(RecyclerView.c0 c0Var, boolean z10) {
        K(c0Var, z10);
        h(c0Var);
    }

    public final void D(RecyclerView.c0 c0Var, boolean z10) {
        L(c0Var, z10);
    }

    public final void E(RecyclerView.c0 c0Var) {
        M(c0Var);
        h(c0Var);
    }

    public final void F(RecyclerView.c0 c0Var) {
        N(c0Var);
    }

    public final void G(RecyclerView.c0 c0Var) {
        O(c0Var);
        h(c0Var);
    }

    public final void H(RecyclerView.c0 c0Var) {
        P(c0Var);
    }

    public void I(RecyclerView.c0 c0Var) {
    }

    public void J(RecyclerView.c0 c0Var) {
    }

    public void K(RecyclerView.c0 c0Var, boolean z10) {
    }

    public void L(RecyclerView.c0 c0Var, boolean z10) {
    }

    public void M(RecyclerView.c0 c0Var) {
    }

    public void N(RecyclerView.c0 c0Var) {
    }

    public void O(RecyclerView.c0 c0Var) {
    }

    public void P(RecyclerView.c0 c0Var) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean a(RecyclerView.c0 c0Var, RecyclerView.ItemAnimator.b bVar, RecyclerView.ItemAnimator.b bVar2) {
        int i10;
        int i11;
        return (bVar == null || ((i10 = bVar.f3733a) == (i11 = bVar2.f3733a) && bVar.f3734b == bVar2.f3734b)) ? w(c0Var) : y(c0Var, i10, bVar.f3734b, i11, bVar2.f3734b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean b(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2, RecyclerView.ItemAnimator.b bVar, RecyclerView.ItemAnimator.b bVar2) {
        int i10;
        int i11;
        int i12 = bVar.f3733a;
        int i13 = bVar.f3734b;
        if (c0Var2.shouldIgnore()) {
            int i14 = bVar.f3733a;
            i11 = bVar.f3734b;
            i10 = i14;
        } else {
            i10 = bVar2.f3733a;
            i11 = bVar2.f3734b;
        }
        return x(c0Var, c0Var2, i12, i13, i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean c(RecyclerView.c0 c0Var, RecyclerView.ItemAnimator.b bVar, RecyclerView.ItemAnimator.b bVar2) {
        int i10 = bVar.f3733a;
        int i11 = bVar.f3734b;
        View view = c0Var.itemView;
        int left = bVar2 == null ? view.getLeft() : bVar2.f3733a;
        int top = bVar2 == null ? view.getTop() : bVar2.f3734b;
        if (c0Var.isRemoved() || (i10 == left && i11 == top)) {
            return z(c0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return y(c0Var, i10, i11, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean d(RecyclerView.c0 c0Var, RecyclerView.ItemAnimator.b bVar, RecyclerView.ItemAnimator.b bVar2) {
        int i10 = bVar.f3733a;
        int i11 = bVar2.f3733a;
        if (i10 != i11 || bVar.f3734b != bVar2.f3734b) {
            return y(c0Var, i10, bVar.f3734b, i11, bVar2.f3734b);
        }
        E(c0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean f(RecyclerView.c0 c0Var) {
        return !this.f4002g || c0Var.isInvalid();
    }

    public abstract boolean w(RecyclerView.c0 c0Var);

    public abstract boolean x(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2, int i10, int i11, int i12, int i13);

    public abstract boolean y(RecyclerView.c0 c0Var, int i10, int i11, int i12, int i13);

    public abstract boolean z(RecyclerView.c0 c0Var);
}
