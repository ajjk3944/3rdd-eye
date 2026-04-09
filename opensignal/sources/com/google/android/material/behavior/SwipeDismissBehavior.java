package com.google.android.material.behavior;

import a2.g;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b4.f;
import e3.b;
import i.g0;
import id.d;
import u3.i0;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends b {

    /* renamed from: a, reason: collision with root package name */
    public f f5500a;

    /* renamed from: b, reason: collision with root package name */
    public g f5501b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5502c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5503d;

    /* renamed from: e, reason: collision with root package name */
    public int f5504e = 2;

    /* renamed from: f, reason: collision with root package name */
    public float f5505f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f5506g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    public final d f5507h = new d(this);

    @Override // e3.b
    public boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zP = this.f5502c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zP = coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f5502c = zP;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f5502c = false;
        }
        if (zP) {
            if (this.f5500a == null) {
                this.f5500a = new f(coordinatorLayout.getContext(), coordinatorLayout, this.f5507h);
            }
            if (!this.f5503d && this.f5500a.p(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // e3.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            i0.k(view, 1048576);
            i0.h(view, 0);
            if (s(view)) {
                i0.l(view, v3.b.f23830l, new g0(this));
            }
        }
        return false;
    }

    @Override // e3.b
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f5500a == null) {
            return false;
        }
        if (this.f5503d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f5500a.j(motionEvent);
        return true;
    }

    public boolean s(View view) {
        return true;
    }
}
