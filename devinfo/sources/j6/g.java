package j6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter implements m {

    /* renamed from: a, reason: collision with root package name */
    public final View f27412a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f27413b = false;

    public g(View view) {
        this.f27412a = view;
    }

    @Override // j6.m
    public final void a(o oVar) {
        throw null;
    }

    @Override // j6.m
    public final void b() {
        View view = this.f27412a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? w.f27460a.B(view) : 0.0f));
    }

    @Override // j6.m
    public final void d(o oVar) {
        throw null;
    }

    @Override // j6.m
    public final void f() {
        this.f27412a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        w.f27460a.J(this.f27412a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f27412a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f27413b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z3) {
        boolean z10 = this.f27413b;
        View view = this.f27412a;
        if (z10) {
            view.setLayerType(0, null);
        }
        if (z3) {
            return;
        }
        x xVar = w.f27460a;
        xVar.J(view, 1.0f);
        xVar.getClass();
    }

    @Override // j6.m
    public final void c(o oVar) {
    }

    @Override // j6.m
    public final void e(o oVar) {
    }

    @Override // j6.m
    public final void g(o oVar) {
    }
}
