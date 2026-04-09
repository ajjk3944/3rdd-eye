package com.google.android.material.behavior;

import A0.e;
import E.b;
import R.O;
import S.c;
import X.f;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import h0.C2352b;
import h3.C2364c;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends b {

    /* renamed from: a, reason: collision with root package name */
    public f f18106a;

    /* renamed from: b, reason: collision with root package name */
    public e f18107b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18108c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18109d;

    /* renamed from: e, reason: collision with root package name */
    public int f18110e = 2;

    /* renamed from: f, reason: collision with root package name */
    public float f18111f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f18112g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    public final C2364c f18113h = new C2364c(this);

    @Override // E.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zP = this.f18108c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zP = coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f18108c = zP;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f18108c = false;
        }
        if (zP) {
            if (this.f18106a == null) {
                this.f18106a = new f(coordinatorLayout.getContext(), coordinatorLayout, this.f18113h);
            }
            if (!this.f18109d && this.f18106a.r(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // E.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            O.j(1048576, view);
            O.h(0, view);
            if (w(view)) {
                O.k(view, c.f3437l, new C2352b(1, this));
            }
        }
        return false;
    }

    @Override // E.b
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f18106a == null) {
            return false;
        }
        if (this.f18109d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f18106a.k(motionEvent);
        return true;
    }

    public boolean w(View view) {
        return true;
    }
}
