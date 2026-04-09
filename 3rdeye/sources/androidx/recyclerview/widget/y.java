package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper.java */
/* loaded from: classes.dex */
public final class y extends A {
    @Override // androidx.recyclerview.widget.A
    public final int b(View view) {
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        this.f16364a.getClass();
        return view.getRight() + ((RecyclerView.q) view.getLayoutParams()).f16519b.right + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.A
    public final int c(View view) {
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        this.f16364a.getClass();
        return RecyclerView.p.U(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.A
    public final int d(View view) {
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        this.f16364a.getClass();
        return RecyclerView.p.T(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.A
    public final int e(View view) {
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        this.f16364a.getClass();
        return (view.getLeft() - ((RecyclerView.q) view.getLayoutParams()).f16519b.left) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin;
    }

    @Override // androidx.recyclerview.widget.A
    public final int f() {
        return this.f16364a.f16510n;
    }

    @Override // androidx.recyclerview.widget.A
    public final int g() {
        RecyclerView.p pVar = this.f16364a;
        return pVar.f16510n - pVar.Z();
    }

    @Override // androidx.recyclerview.widget.A
    public final int h() {
        return this.f16364a.Z();
    }

    @Override // androidx.recyclerview.widget.A
    public final int i() {
        return this.f16364a.f16508l;
    }

    @Override // androidx.recyclerview.widget.A
    public final int j() {
        return this.f16364a.f16509m;
    }

    @Override // androidx.recyclerview.widget.A
    public final int k() {
        return this.f16364a.Y();
    }

    @Override // androidx.recyclerview.widget.A
    public final int l() {
        RecyclerView.p pVar = this.f16364a;
        return (pVar.f16510n - pVar.Y()) - pVar.Z();
    }

    @Override // androidx.recyclerview.widget.A
    public final int m(View view) {
        RecyclerView.p pVar = this.f16364a;
        Rect rect = this.f16366c;
        pVar.e0(view, rect);
        return rect.right;
    }

    @Override // androidx.recyclerview.widget.A
    public final int n(View view) {
        RecyclerView.p pVar = this.f16364a;
        Rect rect = this.f16366c;
        pVar.e0(view, rect);
        return rect.left;
    }

    @Override // androidx.recyclerview.widget.A
    public final void o(int i) {
        this.f16364a.j0(i);
    }
}
