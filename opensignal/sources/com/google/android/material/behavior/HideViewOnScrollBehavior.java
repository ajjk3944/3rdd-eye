package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.measurement.e5;
import e3.b;
import g1.e;
import id.a;
import id.c;
import ir.f0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import w.g;

/* loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends b {

    /* renamed from: l, reason: collision with root package name */
    public static final int f5488l = ed.b.motionDurationLong2;

    /* renamed from: m, reason: collision with root package name */
    public static final int f5489m = ed.b.motionDurationMedium4;

    /* renamed from: n, reason: collision with root package name */
    public static final int f5490n = ed.b.motionEasingEmphasizedInterpolator;

    /* renamed from: a, reason: collision with root package name */
    public e5 f5491a;

    /* renamed from: b, reason: collision with root package name */
    public AccessibilityManager f5492b;

    /* renamed from: c, reason: collision with root package name */
    public a f5493c;

    /* renamed from: e, reason: collision with root package name */
    public int f5495e;

    /* renamed from: f, reason: collision with root package name */
    public int f5496f;

    /* renamed from: g, reason: collision with root package name */
    public TimeInterpolator f5497g;

    /* renamed from: h, reason: collision with root package name */
    public TimeInterpolator f5498h;
    public ViewPropertyAnimator k;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f5494d = new LinkedHashSet();

    /* renamed from: i, reason: collision with root package name */
    public int f5499i = 0;
    public int j = 2;

    public HideViewOnScrollBehavior() {
    }

    @Override // e3.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (this.f5492b == null) {
            this.f5492b = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f5492b;
        if (accessibilityManager != null && this.f5493c == null) {
            a aVar = new a(this, view, 1);
            this.f5493c = aVar;
            accessibilityManager.addTouchExplorationStateChangeListener(aVar);
            view.addOnAttachStateChangeListener(new e(2, this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i11 = ((e3.e) view.getLayoutParams()).f7773c;
        if (i11 == 80 || i11 == 81) {
            s(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i11, i10);
            s((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        this.f5499i = this.f5491a.D(view, marginLayoutParams);
        this.f5495e = f0.U(view.getContext(), f5488l, 225);
        this.f5496f = f0.U(view.getContext(), f5489m, 175);
        Context context = view.getContext();
        q4.a aVar2 = fd.a.f8825d;
        int i12 = f5490n;
        this.f5497g = f0.V(context, i12, aVar2);
        this.f5498h = f0.V(view.getContext(), i12, fd.a.f8824c);
        return false;
    }

    @Override // e3.b
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
        if (i10 <= 0) {
            if (i10 < 0) {
                t(view);
                return;
            }
            return;
        }
        if (this.j == 1) {
            return;
        }
        AccessibilityManager accessibilityManager = this.f5492b;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            ViewPropertyAnimator viewPropertyAnimator = this.k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.j = 1;
            Iterator it = this.f5494d.iterator();
            if (it.hasNext()) {
                throw g.d(it);
            }
            this.k = this.f5491a.F(view, this.f5499i).setInterpolator(this.f5498h).setDuration(this.f5496f).setListener(new id.b(1, this));
        }
    }

    @Override // e3.b
    public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    public final void s(int i10) {
        e5 e5Var = this.f5491a;
        if (e5Var == null || e5Var.E() != i10) {
            if (i10 == 0) {
                this.f5491a = new c(2);
            } else if (i10 == 1) {
                this.f5491a = new c(0);
            } else {
                if (i10 != 2) {
                    throw new IllegalArgumentException(h0.b.m("Invalid view edge position value: ", i10, ". Must be 0, 1 or 2."));
                }
                this.f5491a = new c(1);
            }
        }
    }

    public final void t(View view) {
        if (this.j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.j = 2;
        Iterator it = this.f5494d.iterator();
        if (it.hasNext()) {
            throw g.d(it);
        }
        this.f5491a.getClass();
        this.k = this.f5491a.F(view, 0).setInterpolator(this.f5497g).setDuration(this.f5495e).setListener(new id.b(1, this));
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
