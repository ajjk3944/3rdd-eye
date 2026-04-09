package m4;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: LeftSheetDelegate.java */
/* renamed from: m4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5324a extends d {

    /* renamed from: a, reason: collision with root package name */
    public final SideSheetBehavior<? extends View> f44077a;

    public C5324a(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f44077a = sideSheetBehavior;
    }

    @Override // m4.d
    public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // m4.d
    public final float b(int i) {
        float fD = d();
        return (i - fD) / (c() - fD);
    }

    @Override // m4.d
    public final int c() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f44077a;
        return Math.max(0, sideSheetBehavior.f23016n + sideSheetBehavior.f23017o);
    }

    @Override // m4.d
    public final int d() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f44077a;
        return (-sideSheetBehavior.f23014l) - sideSheetBehavior.f23017o;
    }

    @Override // m4.d
    public final int e() {
        return this.f44077a.f23017o;
    }

    @Override // m4.d
    public final int f() {
        return -this.f44077a.f23014l;
    }

    @Override // m4.d
    public final <V extends View> int g(V v10) {
        return v10.getRight() + this.f44077a.f23017o;
    }

    @Override // m4.d
    public final int h(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // m4.d
    public final int i() {
        return 1;
    }

    @Override // m4.d
    public final boolean j(float f10) {
        return f10 > 0.0f;
    }

    @Override // m4.d
    public final boolean k(View view) {
        return view.getRight() < (c() - d()) / 2;
    }

    @Override // m4.d
    public final boolean l(float f10, float f11) {
        if (Math.abs(f10) <= Math.abs(f11)) {
            return false;
        }
        float fAbs = Math.abs(f10);
        this.f44077a.getClass();
        return fAbs > ((float) 500);
    }

    @Override // m4.d
    public final boolean m(View view, float f10) {
        float left = view.getLeft();
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f44077a;
        float fAbs = Math.abs((f10 * sideSheetBehavior.f23013k) + left);
        sideSheetBehavior.getClass();
        return fAbs > 0.5f;
    }

    @Override // m4.d
    public final void n(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i10) {
        if (i <= this.f44077a.f23015m) {
            marginLayoutParams.leftMargin = i10;
        }
    }
}
