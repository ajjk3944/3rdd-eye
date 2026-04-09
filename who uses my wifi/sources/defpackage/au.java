package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.phuongpn.whousemywifi.networkscanner.R;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class au extends AnimatorListenerAdapter implements u21 {
    public final View a;
    public boolean b = false;

    public au(View view) {
        this.a = view;
    }

    @Override // defpackage.u21
    public final void b() {
        View view = this.a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? f71.a.l(view) : 0.0f));
    }

    @Override // defpackage.u21
    public final void c() {
        this.a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        f71.a.y(this.a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.b;
        View view = this.a;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        m71 m71Var = f71.a;
        m71Var.y(view, 1.0f);
        m71Var.getClass();
    }

    @Override // defpackage.u21
    public final void a(v21 v21Var) {
    }

    @Override // defpackage.u21
    public final void d(v21 v21Var) {
    }

    @Override // defpackage.u21
    public final void e(v21 v21Var) {
    }

    @Override // defpackage.u21
    public final void f(v21 v21Var) {
    }
}
