package com.google.android.material.behavior;

import ad.g;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b5.a1;
import com.liuzh.deviceinfo.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import je.u;
import mc.a;
import p3.b;
import p3.e;
import r5.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class HideViewOnScrollBehavior<V extends View> extends b {

    /* renamed from: a, reason: collision with root package name */
    public wd.b f20335a;

    /* renamed from: b, reason: collision with root package name */
    public AccessibilityManager f20336b;

    /* renamed from: c, reason: collision with root package name */
    public a f20337c;

    /* renamed from: e, reason: collision with root package name */
    public int f20339e;

    /* renamed from: f, reason: collision with root package name */
    public int f20340f;
    public TimeInterpolator g;

    /* renamed from: h, reason: collision with root package name */
    public TimeInterpolator f20341h;

    /* renamed from: k, reason: collision with root package name */
    public ViewPropertyAnimator f20343k;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f20338d = new LinkedHashSet();

    /* renamed from: i, reason: collision with root package name */
    public int f20342i = 0;
    public int j = 2;

    public HideViewOnScrollBehavior() {
    }

    @Override // p3.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
        if (this.f20336b == null) {
            this.f20336b = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f20336b;
        if (accessibilityManager != null && this.f20337c == null) {
            a aVar = new a(this, view, 1);
            this.f20337c = aVar;
            accessibilityManager.addTouchExplorationStateChangeListener(aVar);
            view.addOnAttachStateChangeListener(new a1(5, this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i10 = ((e) view.getLayoutParams()).f31149c;
        if (i10 == 80 || i10 == 81) {
            w(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i10, i4);
            w((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        this.f20342i = this.f20335a.u(view, marginLayoutParams);
        this.f20339e = nh.a.v(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f20340f = nh.a.v(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.g = nh.a.w(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, jc.a.f27485d);
        this.f20341h = nh.a.w(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, jc.a.f27484c);
        return false;
    }

    @Override // p3.b
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i4, int i10, int i11, int[] iArr) {
        if (i4 <= 0) {
            if (i4 < 0) {
                x(view);
                return;
            }
            return;
        }
        if (this.j == 1) {
            return;
        }
        AccessibilityManager accessibilityManager = this.f20336b;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f20343k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.j = 1;
            Iterator it = this.f20338d.iterator();
            if (it.hasNext()) {
                throw u.o(it);
            }
            this.f20343k = this.f20335a.x(this.f20342i, view).setInterpolator(this.f20341h).setDuration(this.f20340f).setListener(new g(9, this));
        }
    }

    @Override // p3.b
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i10) {
        return i4 == 2;
    }

    public final void w(int i4) {
        wd.b bVar = this.f20335a;
        if (bVar == null || bVar.w() != i4) {
            if (i4 == 0) {
                this.f20335a = new mc.b(2);
            } else if (i4 == 1) {
                this.f20335a = new mc.b(0);
            } else {
                if (i4 != 2) {
                    throw new IllegalArgumentException(c.h(i4, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
                }
                this.f20335a = new mc.b(1);
            }
        }
    }

    public final void x(View view) {
        if (this.j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f20343k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.j = 2;
        Iterator it = this.f20338d.iterator();
        if (it.hasNext()) {
            throw u.o(it);
        }
        this.f20335a.getClass();
        this.f20343k = this.f20335a.x(0, view).setInterpolator(this.g).setDuration(this.f20339e).setListener(new g(9, this));
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
