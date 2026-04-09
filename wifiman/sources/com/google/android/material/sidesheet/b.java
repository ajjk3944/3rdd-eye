package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes3.dex */
final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    final SideSheetBehavior f37648a;

    b(SideSheetBehavior sideSheetBehavior) {
        this.f37648a = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.c
    int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.sidesheet.c
    float b(int i10) {
        float fD = d();
        return (fD - i10) / (fD - c());
    }

    @Override // com.google.android.material.sidesheet.c
    int c() {
        return Math.max(0, (d() - this.f37648a.Y()) - this.f37648a.d0());
    }

    @Override // com.google.android.material.sidesheet.c
    int d() {
        return this.f37648a.g0();
    }

    @Override // com.google.android.material.sidesheet.c
    int e() {
        return this.f37648a.g0();
    }

    @Override // com.google.android.material.sidesheet.c
    int f() {
        return c();
    }

    @Override // com.google.android.material.sidesheet.c
    int g(View view) {
        return view.getLeft() - this.f37648a.d0();
    }

    @Override // com.google.android.material.sidesheet.c
    public int h(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // com.google.android.material.sidesheet.c
    int i() {
        return 0;
    }

    @Override // com.google.android.material.sidesheet.c
    boolean j(float f10) {
        return f10 < 0.0f;
    }

    @Override // com.google.android.material.sidesheet.c
    boolean k(View view) {
        return view.getLeft() > (d() + c()) / 2;
    }

    @Override // com.google.android.material.sidesheet.c
    boolean l(float f10, float f11) {
        return d.a(f10, f11) && Math.abs(f10) > ((float) this.f37648a.h0());
    }

    @Override // com.google.android.material.sidesheet.c
    boolean m(View view, float f10) {
        return Math.abs(((float) view.getRight()) + (f10 * this.f37648a.b0())) > this.f37648a.c0();
    }

    @Override // com.google.android.material.sidesheet.c
    void n(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        int iG0 = this.f37648a.g0();
        if (i10 <= iG0) {
            marginLayoutParams.rightMargin = iG0 - i10;
        }
    }
}
