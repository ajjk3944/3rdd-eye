package L0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.apm.insight.R;

/* loaded from: classes.dex */
public final class D extends AnimatorListenerAdapter implements j {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f2407a;

    /* renamed from: b, reason: collision with root package name */
    public final View f2408b;

    /* renamed from: c, reason: collision with root package name */
    public final View f2409c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2410d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f2411e;

    public D(g gVar, ViewGroup viewGroup, View view, View view2) {
        this.f2411e = gVar;
        this.f2407a = viewGroup;
        this.f2408b = view;
        this.f2409c = view2;
    }

    @Override // L0.j
    public final void a(l lVar) {
        if (this.f2410d) {
            h();
        }
    }

    @Override // L0.j
    public final void c(l lVar) {
        lVar.y(this);
    }

    @Override // L0.j
    public final void d(l lVar) {
    }

    @Override // L0.j
    public final void f(l lVar) {
        lVar.y(this);
    }

    @Override // L0.j
    public final void g(l lVar) {
        throw null;
    }

    public final void h() {
        this.f2409c.setTag(R.id.save_overlay_view, null);
        this.f2407a.getOverlay().remove(this.f2408b);
        this.f2410d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f2407a.getOverlay().remove(this.f2408b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f2408b;
        if (view.getParent() == null) {
            this.f2407a.getOverlay().add(view);
        } else {
            this.f2411e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z6) {
        if (z6) {
            View view = this.f2409c;
            View view2 = this.f2408b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f2407a.getOverlay().add(view2);
            this.f2410d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z6) {
        if (z6) {
            return;
        }
        h();
    }

    @Override // L0.j
    public final void b() {
    }

    @Override // L0.j
    public final void e() {
    }
}
