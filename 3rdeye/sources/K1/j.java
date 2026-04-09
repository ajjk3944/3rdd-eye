package K1;

import L0.T;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import m0.C5308a;

/* compiled from: Transition.java */
/* loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3012a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3013b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3014c;

    public j(T t10, View view) {
        this.f3013b = t10;
        this.f3014c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f3012a) {
            case 1:
                ((T) this.f3013b).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3012a) {
            case 0:
                ((C5308a) this.f3013b).remove(animator);
                ((i) this.f3014c).f2991o.remove(animator);
                break;
            default:
                ((T) this.f3013b).e();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3012a) {
            case 0:
                ((i) this.f3014c).f2991o.add(animator);
                break;
            default:
                ((T) this.f3013b).d();
                break;
        }
    }

    public j(i iVar, C5308a c5308a) {
        this.f3014c = iVar;
        this.f3013b = c5308a;
    }
}
