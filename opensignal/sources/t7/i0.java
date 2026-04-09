package t7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class i0 extends AnimatorListenerAdapter implements o {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f22486a;

    /* renamed from: b, reason: collision with root package name */
    public final View f22487b;

    /* renamed from: c, reason: collision with root package name */
    public final View f22488c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22489d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f22490e;

    public i0(g gVar, ViewGroup viewGroup, View view, View view2) {
        this.f22490e = gVar;
        this.f22486a = viewGroup;
        this.f22487b = view;
        this.f22488c = view2;
    }

    @Override // t7.o
    public final void b(q qVar) {
        if (this.f22489d) {
            g();
        }
    }

    @Override // t7.o
    public final void c(q qVar) {
        qVar.A(this);
    }

    public final void g() {
        this.f22488c.setTag(i.save_overlay_view, null);
        this.f22486a.getOverlay().remove(this.f22487b);
        this.f22489d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f22486a.getOverlay().remove(this.f22487b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f22487b;
        if (view.getParent() == null) {
            this.f22486a.getOverlay().add(view);
        } else {
            this.f22490e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z10) {
        if (z10) {
            View view = this.f22488c;
            int i10 = i.save_overlay_view;
            View view2 = this.f22487b;
            view.setTag(i10, view2);
            this.f22486a.getOverlay().add(view2);
            this.f22489d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z10) {
        if (z10) {
            return;
        }
        g();
    }

    @Override // t7.o
    public final void a() {
    }

    @Override // t7.o
    public final void d() {
    }

    @Override // t7.o
    public final void e(q qVar) {
    }
}
