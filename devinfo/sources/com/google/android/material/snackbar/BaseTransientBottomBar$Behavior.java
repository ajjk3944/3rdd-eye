package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import ec.y;
import jf.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h, reason: collision with root package name */
    public final y f20566h;

    public BaseTransientBottomBar$Behavior() {
        y yVar = new y(28);
        this.f20348e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f20349f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f20347d = 0;
        this.f20566h = yVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, p3.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f20566h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (c.f27640d == null) {
                    c.f27640d = new c(19);
                }
                synchronized (c.f27640d.f27642b) {
                }
            }
        } else if (coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (c.f27640d == null) {
                c.f27640d = new c(19);
            }
            c.f27640d.w();
        }
        return super.k(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean w(View view) {
        this.f20566h.getClass();
        return view instanceof hd.c;
    }
}
