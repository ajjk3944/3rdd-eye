package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import f4.f;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends e4.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f20319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f20320e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f20321f;

    public b(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f20321f = baseBehavior;
        this.f20319d = appBarLayout;
        this.f20320e = coordinatorLayout;
    }

    @Override // e4.b
    public final void d(View view, f fVar) {
        this.f22306a.onInitializeAccessibilityNodeInfo(view, fVar.f23651a);
        fVar.k(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.f20319d;
        if (appBarLayout.getTotalScrollRange() == 0) {
            return;
        }
        CoordinatorLayout coordinatorLayout = this.f20320e;
        AppBarLayout.BaseBehavior baseBehavior = this.f20321f;
        View viewB = AppBarLayout.BaseBehavior.B(baseBehavior, coordinatorLayout);
        if (viewB == null) {
            return;
        }
        int childCount = appBarLayout.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            if (((kc.b) appBarLayout.getChildAt(i4).getLayoutParams()).f28125a != 0) {
                if (baseBehavior.y() != (-appBarLayout.getTotalScrollRange())) {
                    fVar.b(f4.c.f23634h);
                    fVar.t(true);
                }
                if (baseBehavior.y() != 0) {
                    if (!viewB.canScrollVertically(-1)) {
                        fVar.b(f4.c.f23635i);
                        fVar.t(true);
                        return;
                    } else {
                        if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                            fVar.b(f4.c.f23635i);
                            fVar.t(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // e4.b
    public final boolean g(View view, int i4, Bundle bundle) {
        AppBarLayout appBarLayout = this.f20319d;
        if (i4 == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i4 != 8192) {
            return super.g(view, i4, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.f20321f;
        if (baseBehavior.y() != 0) {
            CoordinatorLayout coordinatorLayout = this.f20320e;
            View viewB = AppBarLayout.BaseBehavior.B(baseBehavior, coordinatorLayout);
            if (!viewB.canScrollVertically(-1)) {
                appBarLayout.setExpanded(true);
                return true;
            }
            int i10 = -appBarLayout.getDownNestedPreScrollRange();
            if (i10 != 0) {
                baseBehavior.E(coordinatorLayout, this.f20319d, viewB, i10, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}
