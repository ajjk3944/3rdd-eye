package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import defpackage.ax0;
import defpackage.fr;
import defpackage.oa;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final fr h;

    public BaseTransientBottomBar$Behavior() {
        fr frVar = new fr(14);
        this.e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.d = 0;
        this.h = frVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.vj
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (ax0.g == null) {
                    ax0.g = new ax0();
                }
                synchronized (ax0.g.f) {
                }
            }
        } else if (coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (ax0.g == null) {
                ax0.g = new ax0();
            }
            synchronized (ax0.g.f) {
            }
        }
        return super.k(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean w(View view) {
        this.h.getClass();
        return view instanceof oa;
    }
}
