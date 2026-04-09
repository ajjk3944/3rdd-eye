package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes3.dex */
abstract class c extends CoordinatorLayout.b {

    /* renamed from: a, reason: collision with root package name */
    private d f36985a;

    /* renamed from: b, reason: collision with root package name */
    private int f36986b;

    /* renamed from: c, reason: collision with root package name */
    private int f36987c;

    public c() {
        this.f36986b = 0;
        this.f36987c = 0;
    }

    public int E() {
        d dVar = this.f36985a;
        if (dVar != null) {
            return dVar.b();
        }
        return 0;
    }

    protected void F(CoordinatorLayout coordinatorLayout, View view, int i10) {
        coordinatorLayout.G(view, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        F(coordinatorLayout, view, i10);
        if (this.f36985a == null) {
            this.f36985a = new d(view);
        }
        this.f36985a.c();
        this.f36985a.a();
        int i11 = this.f36986b;
        if (i11 != 0) {
            this.f36985a.e(i11);
            this.f36986b = 0;
        }
        int i12 = this.f36987c;
        if (i12 == 0) {
            return true;
        }
        this.f36985a.d(i12);
        this.f36987c = 0;
        return true;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36986b = 0;
        this.f36987c = 0;
    }
}
