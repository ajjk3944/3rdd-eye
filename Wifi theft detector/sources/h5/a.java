package h5;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes2.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public final SideSheetBehavior f21401a;

    public a(SideSheetBehavior sideSheetBehavior) {
        this.f21401a = sideSheetBehavior;
    }

    @Override // h5.c
    public int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // h5.c
    public float b(int i10) {
        float fE = e();
        return (i10 - fE) / (d() - fE);
    }

    @Override // h5.c
    public int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // h5.c
    public int d() {
        return Math.max(0, this.f21401a.m0() + this.f21401a.k0());
    }

    @Override // h5.c
    public int e() {
        return (-this.f21401a.d0()) - this.f21401a.k0();
    }

    @Override // h5.c
    public int f() {
        return this.f21401a.k0();
    }

    @Override // h5.c
    public int g() {
        return -this.f21401a.d0();
    }

    @Override // h5.c
    public int h(View view) {
        return view.getRight() + this.f21401a.k0();
    }

    @Override // h5.c
    public int i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // h5.c
    public int j() {
        return 1;
    }

    @Override // h5.c
    public boolean k(float f10) {
        return f10 > 0.0f;
    }

    @Override // h5.c
    public boolean l(View view) {
        return view.getRight() < (d() - e()) / 2;
    }

    @Override // h5.c
    public boolean m(float f10, float f11) {
        return d.a(f10, f11) && Math.abs(f10) > ((float) this.f21401a.o0());
    }

    @Override // h5.c
    public boolean n(View view, float f10) {
        return Math.abs(((float) view.getLeft()) + (f10 * this.f21401a.i0())) > this.f21401a.j0();
    }

    @Override // h5.c
    public void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.leftMargin = i10;
    }

    @Override // h5.c
    public void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        if (i10 <= this.f21401a.n0()) {
            marginLayoutParams.leftMargin = i11;
        }
    }
}
