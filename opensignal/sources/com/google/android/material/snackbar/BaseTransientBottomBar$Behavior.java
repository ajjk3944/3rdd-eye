package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b9.c;
import com.google.android.material.behavior.SwipeDismissBehavior;
import ge.e;
import ge.g;
import kg.r;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: i, reason: collision with root package name */
    public final c f5704i;

    public BaseTransientBottomBar$Behavior() {
        c cVar = new c(25, false);
        this.f5505f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f5506g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f5504e = 0;
        this.f5704i = cVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, e3.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        c cVar = this.f5704i;
        cVar.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                r.j().t((e) cVar.f2478d);
            }
        } else if (coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            r.j().s((e) cVar.f2478d);
        }
        return super.g(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean s(View view) {
        this.f5704i.getClass();
        return view instanceof g;
    }
}
