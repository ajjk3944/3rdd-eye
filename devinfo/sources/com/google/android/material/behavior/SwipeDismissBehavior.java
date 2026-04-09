package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import e4.v0;
import n4.c;
import p3.b;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class SwipeDismissBehavior<V extends View> extends b {

    /* renamed from: a, reason: collision with root package name */
    public c f20344a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f20345b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20346c;

    /* renamed from: d, reason: collision with root package name */
    public int f20347d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f20348e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f20349f = 0.5f;
    public final mc.c g = new mc.c(this);

    @Override // p3.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zP = this.f20345b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zP = coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f20345b = zP;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f20345b = false;
        }
        if (zP) {
            if (this.f20344a == null) {
                this.f20344a = new c(coordinatorLayout.getContext(), coordinatorLayout, this.g);
            }
            if (!this.f20346c && this.f20344a.p(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // p3.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            v0.l(1048576, view);
            v0.i(0, view);
            if (w(view)) {
                v0.m(view, f4.c.f23637l, new jf.c(29, this));
            }
        }
        return false;
    }

    @Override // p3.b
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f20344a == null) {
            return false;
        }
        if (this.f20346c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f20344a.j(motionEvent);
        return true;
    }

    public boolean w(View view) {
        return true;
    }
}
