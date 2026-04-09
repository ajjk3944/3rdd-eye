package t7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import u3.m0;
import u3.p0;
import u3.u0;

/* loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22491a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22492b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22493c;

    public /* synthetic */ j(int i10, View view, Object obj) {
        this.f22491a = i10;
        this.f22492b = obj;
        this.f22493c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f22491a) {
            case 1:
                ((m0) this.f22492b).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22491a) {
            case 0:
                ((u.e) this.f22492b).remove(animator);
                ((q) this.f22493c).K.remove(animator);
                break;
            case 1:
                ((m0) this.f22492b).c();
                break;
            default:
                u0 u0Var = (u0) this.f22492b;
                u0Var.f23222a.d(1.0f);
                p0.e((View) this.f22493c, u0Var);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f22491a) {
            case 0:
                ((q) this.f22493c).K.add(animator);
                break;
            case 1:
                ((m0) this.f22492b).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public j(q qVar, u.e eVar) {
        this.f22491a = 0;
        this.f22493c = qVar;
        this.f22492b = eVar;
    }
}
