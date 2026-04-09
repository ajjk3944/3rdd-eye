package t7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class h0 extends AnimatorListenerAdapter implements o {

    /* renamed from: a, reason: collision with root package name */
    public final View f22480a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22481b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f22482c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22484e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22485f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f22483d = true;

    public h0(View view, int i10) {
        this.f22480a = view;
        this.f22481b = i10;
        this.f22482c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // t7.o
    public final void a() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        g(false);
        if (this.f22485f) {
            return;
        }
        a0.b(this.f22480a, this.f22481b);
    }

    @Override // t7.o
    public final void c(q qVar) {
        qVar.A(this);
    }

    @Override // t7.o
    public final void d() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        g(true);
        if (this.f22485f) {
            return;
        }
        a0.b(this.f22480a, 0);
    }

    public final void g(boolean z10) {
        ViewGroup viewGroup;
        if (!this.f22483d || this.f22484e == z10 || (viewGroup = this.f22482c) == null) {
            return;
        }
        this.f22484e = z10;
        xu.l.Y(viewGroup, z10);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f22485f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!this.f22485f) {
            a0.b(this.f22480a, this.f22481b);
            ViewGroup viewGroup = this.f22482c;
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
    public final void onAnimationStart(Animator animator, boolean z10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (z10) {
            a0.b(this.f22480a, 0);
            ViewGroup viewGroup = this.f22482c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (z10) {
            return;
        }
        if (!this.f22485f) {
            a0.b(this.f22480a, this.f22481b);
            ViewGroup viewGroup = this.f22482c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // t7.o
    public final void b(q qVar) {
    }

    @Override // t7.o
    public final void e(q qVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
