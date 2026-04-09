package m4;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: RightSheetDelegate.java */
/* renamed from: m4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5325b extends d {

    /* renamed from: a, reason: collision with root package name */
    public final SideSheetBehavior<? extends View> f44078a;

    public C5325b(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f44078a = sideSheetBehavior;
    }

    @Override // m4.d
    public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // m4.d
    public final float b(int i) {
        float f10 = this.f44078a.f23015m;
        return (f10 - i) / (f10 - c());
    }

    @Override // m4.d
    public final int c() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f44078a;
        return Math.max(0, (sideSheetBehavior.f23015m - sideSheetBehavior.f23014l) - sideSheetBehavior.f23017o);
    }

    @Override // m4.d
    public final int d() {
        return this.f44078a.f23015m;
    }

    @Override // m4.d
    public final int e() {
        return this.f44078a.f23015m;
    }

    @Override // m4.d
    public final int f() {
        return c();
    }

    @Override // m4.d
    public final <V extends View> int g(V v10) {
        return v10.getLeft() - this.f44078a.f23017o;
    }

    @Override // m4.d
    public final int h(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // m4.d
    public final int i() {
        return 0;
    }

    @Override // m4.d
    public final boolean j(float f10) {
        return f10 < 0.0f;
    }

    @Override // m4.d
    public final boolean k(View view) {
        return view.getLeft() > (c() + this.f44078a.f23015m) / 2;
    }

    @Override // m4.d
    public final boolean l(float f10, float f11) {
        if (Math.abs(f10) <= Math.abs(f11)) {
            return false;
        }
        float fAbs = Math.abs(f10);
        this.f44078a.getClass();
        return fAbs > ((float) 500);
    }

    @Override // m4.d
    public final boolean m(View view, float f10) {
        float right = view.getRight();
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f44078a;
        float fAbs = Math.abs((f10 * sideSheetBehavior.f23013k) + right);
        sideSheetBehavior.getClass();
        return fAbs > 0.5f;
    }

    @Override // m4.d
    public final void n(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i10) {
        int i11 = this.f44078a.f23015m;
        if (i <= i11) {
            marginLayoutParams.rightMargin = i11 - i;
        }
    }
}
