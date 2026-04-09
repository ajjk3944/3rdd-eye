package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.e61;
import defpackage.i61;
import defpackage.kf3;
import defpackage.nz0;
import defpackage.v0;
import defpackage.vj;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends vj {
    public i61 a;
    public boolean b;
    public boolean c;
    public int d = 2;
    public float e = 0.0f;
    public float f = 0.5f;
    public final nz0 g = new nz0(this);

    @Override // defpackage.vj
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zP = this.b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zP = coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.b = zP;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.b = false;
        }
        if (zP) {
            if (this.a == null) {
                this.a = new i61(coordinatorLayout.getContext(), coordinatorLayout, this.g);
            }
            if (!this.c && this.a.p(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.vj
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            e61.i(view, 1048576);
            e61.g(view, 0);
            if (w(view)) {
                e61.j(view, v0.j, new kf3(8, this));
            }
        }
        return false;
    }

    @Override // defpackage.vj
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        if (this.c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.a.j(motionEvent);
        return true;
    }

    public boolean w(View view) {
        return true;
    }
}
