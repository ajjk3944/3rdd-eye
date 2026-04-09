package com.google.android.material.appbar;

import L0.C0770a;
import M0.g;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: AppBarLayout.java */
/* loaded from: classes2.dex */
public final class b extends C0770a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f22487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f22488e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f22489f;

    public b(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f22489f = baseBehavior;
        this.f22487d = appBarLayout;
        this.f22488e = coordinatorLayout;
    }

    @Override // L0.C0770a
    public final void d(View view, g gVar) {
        AppBarLayout.BaseBehavior baseBehavior;
        View viewB;
        this.f3883a.onInitializeAccessibilityNodeInfo(view, gVar.f4122a);
        gVar.j(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.f22487d;
        if (appBarLayout.getTotalScrollRange() == 0 || (viewB = AppBarLayout.BaseBehavior.B((baseBehavior = this.f22489f), this.f22488e)) == null) {
            return;
        }
        int childCount = appBarLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((AppBarLayout.c) appBarLayout.getChildAt(i).getLayoutParams()).f22475a != 0) {
                if (baseBehavior.t() != (-appBarLayout.getTotalScrollRange())) {
                    gVar.b(g.a.f4126g);
                    gVar.m(true);
                }
                if (baseBehavior.t() != 0) {
                    if (!viewB.canScrollVertically(-1)) {
                        gVar.b(g.a.f4127h);
                        gVar.m(true);
                        return;
                    } else {
                        if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                            gVar.b(g.a.f4127h);
                            gVar.m(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // L0.C0770a
    public final boolean g(View view, int i, Bundle bundle) {
        AppBarLayout appBarLayout = this.f22487d;
        if (i == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i != 8192) {
            return super.g(view, i, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.f22489f;
        if (baseBehavior.t() != 0) {
            View viewB = AppBarLayout.BaseBehavior.B(baseBehavior, this.f22488e);
            if (!viewB.canScrollVertically(-1)) {
                appBarLayout.setExpanded(true);
                return true;
            }
            int i10 = -appBarLayout.getDownNestedPreScrollRange();
            if (i10 != 0) {
                CoordinatorLayout coordinatorLayout = this.f22488e;
                AppBarLayout appBarLayout2 = this.f22487d;
                this.f22489f.E(coordinatorLayout, appBarLayout2, viewB, i10, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}
