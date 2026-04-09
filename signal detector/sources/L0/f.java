package L0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.apm.insight.R;

/* loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter implements j {

    /* renamed from: a, reason: collision with root package name */
    public final View f2438a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2439b = false;

    public f(View view) {
        this.f2438a = view;
    }

    @Override // L0.j
    public final void b() {
        View view = this.f2438a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? v.f2491a.k(view) : 0.0f));
    }

    @Override // L0.j
    public final void c(l lVar) {
        throw null;
    }

    @Override // L0.j
    public final void e() {
        this.f2438a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // L0.j
    public final void f(l lVar) {
    }

    @Override // L0.j
    public final void g(l lVar) {
        throw null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        v.f2491a.r(this.f2438a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f2438a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f2439b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z6) {
        boolean z7 = this.f2439b;
        View view = this.f2438a;
        if (z7) {
            view.setLayerType(0, null);
        }
        if (z6) {
            return;
        }
        A a6 = v.f2491a;
        a6.r(view, 1.0f);
        a6.getClass();
    }

    @Override // L0.j
    public final void a(l lVar) {
    }

    @Override // L0.j
    public final void d(l lVar) {
    }
}
