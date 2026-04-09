package e4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b1 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22309a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22310b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22311c;

    public /* synthetic */ b1(Object obj, View view, int i4) {
        this.f22309a = i4;
        this.f22311c = obj;
        this.f22310b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f22309a) {
            case 0:
                ((d1) this.f22311c).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22309a) {
            case 0:
                ((d1) this.f22311c).d();
                break;
            case 1:
                l1 l1Var = (l1) this.f22311c;
                l1Var.f22371a.e(1.0f);
                g1.f((View) this.f22310b, l1Var);
                break;
            default:
                ((x.e) this.f22311c).remove(animator);
                ((j6.o) this.f22310b).f27436n.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f22309a) {
            case 0:
                ((d1) this.f22311c).c();
                break;
            case 1:
            default:
                super.onAnimationStart(animator);
                break;
            case 2:
                ((j6.o) this.f22310b).f27436n.add(animator);
                break;
        }
    }

    public b1(j6.o oVar, x.e eVar) {
        this.f22309a = 2;
        this.f22310b = oVar;
        this.f22311c = eVar;
    }
}
