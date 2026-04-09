package Q3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f3183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f3184b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f3185c;

    public b(boolean z6, View view, View view2) {
        this.f3183a = z6;
        this.f3184b = view;
        this.f3185c = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f3183a) {
            return;
        }
        this.f3184b.setVisibility(4);
        View view = this.f3185c;
        view.setAlpha(1.0f);
        view.setVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.f3183a) {
            this.f3184b.setVisibility(0);
            View view = this.f3185c;
            view.setAlpha(0.0f);
            view.setVisibility(4);
        }
    }
}
