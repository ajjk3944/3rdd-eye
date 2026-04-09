package com.google.android.material.snackbar;

import J3.f;
import J3.h;
import U0.j;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c1.g;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final j i;

    public BaseTransientBottomBar$Behavior() {
        j jVar = new j(5);
        this.f18111f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f18112g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f18110e = 0;
        this.i = jVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, E.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        j jVar = this.i;
        jVar.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                g.t().D((f) jVar.f3677b);
            }
        } else if (coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            g.t().B((f) jVar.f3677b);
        }
        return super.k(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean w(View view) {
        this.i.getClass();
        return view instanceof h;
    }
}
