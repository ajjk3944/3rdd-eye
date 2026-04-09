package B3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class z extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f685a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f686b;

    public /* synthetic */ z(A a6, int i) {
        this.f685a = i;
        this.f686b = a6;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f685a) {
            case 1:
                super.onAnimationEnd(animator);
                A a6 = this.f686b;
                a6.c();
                c cVar = a6.f531j;
                if (cVar != null) {
                    cVar.a((v) a6.f662a);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f685a) {
            case 0:
                super.onAnimationRepeat(animator);
                A a6 = this.f686b;
                a6.f529g = (a6.f529g + 1) % a6.f528f.f563e.length;
                a6.f530h = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
