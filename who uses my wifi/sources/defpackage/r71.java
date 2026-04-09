package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class r71 extends AnimatorListenerAdapter implements u21 {
    public final View a;
    public final int b;
    public final ViewGroup c;
    public boolean e;
    public boolean f = false;
    public final boolean d = true;

    public r71(View view, int i) {
        this.a = view;
        this.b = i;
        this.c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // defpackage.u21
    public final void b() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        g(false);
        if (this.f) {
            return;
        }
        f71.b(this.a, this.b);
    }

    @Override // defpackage.u21
    public final void c() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        g(true);
        if (this.f) {
            return;
        }
        f71.b(this.a, 0);
    }

    @Override // defpackage.u21
    public final void d(v21 v21Var) {
        v21Var.x(this);
    }

    public final void g(boolean z) {
        ViewGroup viewGroup;
        if (!this.d || this.e == z || (viewGroup = this.c) == null) {
            return;
        }
        this.e = z;
        yc0.l(viewGroup, z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!this.f) {
            f71.b(this.a, this.b);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (z) {
            f71.b(this.a, 0);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (z) {
            return;
        }
        if (!this.f) {
            f71.b(this.a, this.b);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // defpackage.u21
    public final void a(v21 v21Var) {
    }

    @Override // defpackage.u21
    public final void f(v21 v21Var) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
