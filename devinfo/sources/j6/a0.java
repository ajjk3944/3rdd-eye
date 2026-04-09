package j6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.liuzh.deviceinfo.R;
import e4.v0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a0 extends AnimatorListenerAdapter implements m {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f27398a;

    /* renamed from: b, reason: collision with root package name */
    public final View f27399b;

    /* renamed from: c, reason: collision with root package name */
    public final View f27400c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27401d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f27402e;

    public a0(h hVar, ViewGroup viewGroup, View view, View view2) {
        this.f27402e = hVar;
        this.f27398a = viewGroup;
        this.f27399b = view;
        this.f27400c = view2;
    }

    @Override // j6.m
    public final void a(o oVar) {
        throw null;
    }

    @Override // j6.m
    public final void c(o oVar) {
        if (this.f27401d) {
            h();
        }
    }

    @Override // j6.m
    public final void d(o oVar) {
        oVar.z(this);
    }

    @Override // j6.m
    public final void e(o oVar) {
        oVar.z(this);
    }

    public final void h() {
        this.f27400c.setTag(R.id.save_overlay_view, null);
        this.f27398a.getOverlay().remove(this.f27399b);
        this.f27401d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f27398a.getOverlay().remove(this.f27399b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f27399b;
        if (view.getParent() == null) {
            v0.a(this.f27398a, view);
        } else {
            this.f27402e.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z3) {
        if (z3) {
            View view = this.f27400c;
            View view2 = this.f27399b;
            view.setTag(R.id.save_overlay_view, view2);
            v0.a(this.f27398a, view2);
            this.f27401d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z3) {
        if (z3) {
            return;
        }
        h();
    }

    @Override // j6.m
    public final void b() {
    }

    @Override // j6.m
    public final void f() {
    }

    @Override // j6.m
    public final void g(o oVar) {
    }
}
