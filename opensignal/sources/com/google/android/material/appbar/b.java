package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes.dex */
public final class b extends u3.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f5466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f5467e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f5468f;

    public b(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f5468f = baseBehavior;
        this.f5466d = appBarLayout;
        this.f5467e = coordinatorLayout;
    }

    @Override // u3.b
    public final void d(View view, v3.c cVar) {
        this.f23147a.onInitializeAccessibilityNodeInfo(view, cVar.f23838a);
        cVar.i(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.f5466d;
        if (appBarLayout.getTotalScrollRange() == 0) {
            return;
        }
        CoordinatorLayout coordinatorLayout = this.f5467e;
        AppBarLayout.BaseBehavior baseBehavior = this.f5468f;
        View viewX = AppBarLayout.BaseBehavior.x(baseBehavior, coordinatorLayout);
        if (viewX == null) {
            return;
        }
        int childCount = appBarLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((gd.c) appBarLayout.getChildAt(i10).getLayoutParams()).f9502a != 0) {
                if (baseBehavior.u() != (-appBarLayout.getTotalScrollRange())) {
                    cVar.b(v3.b.f23828h);
                    cVar.l(true);
                }
                if (baseBehavior.u() != 0) {
                    if (!viewX.canScrollVertically(-1)) {
                        cVar.b(v3.b.f23829i);
                        cVar.l(true);
                        return;
                    } else {
                        if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                            cVar.b(v3.b.f23829i);
                            cVar.l(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // u3.b
    public final boolean g(View view, int i10, Bundle bundle) {
        AppBarLayout appBarLayout = this.f5466d;
        if (i10 == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i10 != 8192) {
            return super.g(view, i10, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.f5468f;
        if (baseBehavior.u() != 0) {
            CoordinatorLayout coordinatorLayout = this.f5467e;
            View viewX = AppBarLayout.BaseBehavior.x(baseBehavior, coordinatorLayout);
            if (!viewX.canScrollVertically(-1)) {
                appBarLayout.setExpanded(true);
                return true;
            }
            int i11 = -appBarLayout.getDownNestedPreScrollRange();
            if (i11 != 0) {
                baseBehavior.A(coordinatorLayout, this.f5466d, viewX, i11, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}
