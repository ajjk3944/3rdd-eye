package j6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class z extends AnimatorListenerAdapter implements m {

    /* renamed from: a, reason: collision with root package name */
    public final View f27465a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27466b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f27467c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f27469e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f27470f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f27468d = true;

    public z(int i4, View view) {
        this.f27465a = view;
        this.f27466b = i4;
        this.f27467c = (ViewGroup) view.getParent();
        h(true);
    }

    @Override // j6.m
    public final void a(o oVar) {
        throw null;
    }

    @Override // j6.m
    public final void b() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        h(false);
        if (this.f27470f) {
            return;
        }
        w.b(this.f27466b, this.f27465a);
    }

    @Override // j6.m
    public final void d(o oVar) {
        oVar.z(this);
    }

    @Override // j6.m
    public final void e(o oVar) {
        oVar.z(this);
    }

    @Override // j6.m
    public final void f() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        h(true);
        if (this.f27470f) {
            return;
        }
        w.b(0, this.f27465a);
    }

    public final void h(boolean z3) {
        ViewGroup viewGroup;
        if (!this.f27468d || this.f27469e == z3 || (viewGroup = this.f27467c) == null) {
            return;
        }
        this.f27469e = z3;
        u6.t.r(viewGroup, z3);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f27470f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!this.f27470f) {
            w.b(this.f27466b, this.f27465a);
            ViewGroup viewGroup = this.f27467c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        h(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z3) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (z3) {
            w.b(0, this.f27465a);
            ViewGroup viewGroup = this.f27467c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z3) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (z3) {
            return;
        }
        if (!this.f27470f) {
            w.b(this.f27466b, this.f27465a);
            ViewGroup viewGroup = this.f27467c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        h(false);
    }

    @Override // j6.m
    public final void c(o oVar) {
    }

    @Override // j6.m
    public final void g(o oVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
