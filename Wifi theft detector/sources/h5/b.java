package h5;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes2.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final SideSheetBehavior f21402a;

    public b(SideSheetBehavior sideSheetBehavior) {
        this.f21402a = sideSheetBehavior;
    }

    @Override // h5.c
    public int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // h5.c
    public float b(int i10) {
        float fE = e();
        return (fE - i10) / (fE - d());
    }

    @Override // h5.c
    public int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // h5.c
    public int d() {
        return Math.max(0, (e() - this.f21402a.d0()) - this.f21402a.k0());
    }

    @Override // h5.c
    public int e() {
        return this.f21402a.n0();
    }

    @Override // h5.c
    public int f() {
        return this.f21402a.n0();
    }

    @Override // h5.c
    public int g() {
        return d();
    }

    @Override // h5.c
    public int h(View view) {
        return view.getLeft() - this.f21402a.k0();
    }

    @Override // h5.c
    public int i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // h5.c
    public int j() {
        return 0;
    }

    @Override // h5.c
    public boolean k(float f10) {
        return f10 < 0.0f;
    }

    @Override // h5.c
    public boolean l(View view) {
        return view.getLeft() > (e() + d()) / 2;
    }

    @Override // h5.c
    public boolean m(float f10, float f11) {
        return d.a(f10, f11) && Math.abs(f10) > ((float) this.f21402a.o0());
    }

    @Override // h5.c
    public boolean n(View view, float f10) {
        return Math.abs(((float) view.getRight()) + (f10 * this.f21402a.i0())) > this.f21402a.j0();
    }

    @Override // h5.c
    public void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.rightMargin = i10;
    }

    @Override // h5.c
    public void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        int iN0 = this.f21402a.n0();
        if (i10 <= iN0) {
            marginLayoutParams.rightMargin = iN0 - i10;
        }
    }
}
