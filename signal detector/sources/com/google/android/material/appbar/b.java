package com.google.android.material.appbar;

import R.C0175b;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes.dex */
public final class b extends C0175b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f18078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f18079e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f18080f;

    public b(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f18080f = baseBehavior;
        this.f18078d = appBarLayout;
        this.f18079e = coordinatorLayout;
    }

    @Override // R.C0175b
    public final void d(View view, S.d dVar) {
        this.f3302a.onInitializeAccessibilityNodeInfo(view, dVar.f3446a);
        dVar.i(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.f18078d;
        if (appBarLayout.getTotalScrollRange() == 0) {
            return;
        }
        CoordinatorLayout coordinatorLayout = this.f18079e;
        AppBarLayout.BaseBehavior baseBehavior = this.f18080f;
        View viewB = AppBarLayout.BaseBehavior.B(baseBehavior, coordinatorLayout);
        if (viewB == null) {
            return;
        }
        int childCount = appBarLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((f3.b) appBarLayout.getChildAt(i).getLayoutParams()).f20088a != 0) {
                if (baseBehavior.y() != (-appBarLayout.getTotalScrollRange())) {
                    dVar.b(S.c.f3434h);
                    dVar.k(true);
                }
                if (baseBehavior.y() != 0) {
                    if (!viewB.canScrollVertically(-1)) {
                        dVar.b(S.c.i);
                        dVar.k(true);
                        return;
                    } else {
                        if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                            dVar.b(S.c.i);
                            dVar.k(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // R.C0175b
    public final boolean g(View view, int i, Bundle bundle) {
        AppBarLayout appBarLayout = this.f18078d;
        if (i == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i != 8192) {
            return super.g(view, i, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.f18080f;
        if (baseBehavior.y() != 0) {
            CoordinatorLayout coordinatorLayout = this.f18079e;
            View viewB = AppBarLayout.BaseBehavior.B(baseBehavior, coordinatorLayout);
            if (!viewB.canScrollVertically(-1)) {
                appBarLayout.setExpanded(true);
                return true;
            }
            int i3 = -appBarLayout.getDownNestedPreScrollRange();
            if (i3 != 0) {
                baseBehavior.E(coordinatorLayout, this.f18078d, viewB, i3, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}
