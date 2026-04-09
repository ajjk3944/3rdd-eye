package L0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class C extends AnimatorListenerAdapter implements j {

    /* renamed from: a, reason: collision with root package name */
    public final View f2401a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2402b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f2403c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2405e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2406f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2404d = true;

    public C(int i, View view) {
        this.f2401a = view;
        this.f2402b = i;
        this.f2403c = (ViewGroup) view.getParent();
        h(true);
    }

    @Override // L0.j
    public final void b() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        h(false);
        if (this.f2406f) {
            return;
        }
        v.b(this.f2401a, this.f2402b);
    }

    @Override // L0.j
    public final void c(l lVar) {
        lVar.y(this);
    }

    @Override // L0.j
    public final void d(l lVar) {
    }

    @Override // L0.j
    public final void e() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        h(true);
        if (this.f2406f) {
            return;
        }
        v.b(this.f2401a, 0);
    }

    @Override // L0.j
    public final void f(l lVar) {
        lVar.y(this);
    }

    @Override // L0.j
    public final void g(l lVar) {
        throw null;
    }

    public final void h(boolean z6) {
        ViewGroup viewGroup;
        if (!this.f2404d || this.f2405e == z6 || (viewGroup = this.f2403c) == null) {
            return;
        }
        this.f2405e = z6;
        a4.p.t(viewGroup, z6);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2406f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!this.f2406f) {
            v.b(this.f2401a, this.f2402b);
            ViewGroup viewGroup = this.f2403c;
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
    public final void onAnimationStart(Animator animator, boolean z6) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (z6) {
            v.b(this.f2401a, 0);
            ViewGroup viewGroup = this.f2403c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z6) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (z6) {
            return;
        }
        if (!this.f2406f) {
            v.b(this.f2401a, this.f2402b);
            ViewGroup viewGroup = this.f2403c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        h(false);
    }

    @Override // L0.j
    public final void a(l lVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
