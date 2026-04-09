package B3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f598a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f599b;

    public /* synthetic */ j(k kVar, int i) {
        this.f598a = i;
        this.f599b = kVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f598a) {
            case 1:
                super.onAnimationEnd(animator);
                k kVar = this.f599b;
                kVar.c();
                c cVar = kVar.f611j;
                if (cVar != null) {
                    cVar.a((v) kVar.f662a);
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
        switch (this.f598a) {
            case 0:
                super.onAnimationRepeat(animator);
                k kVar = this.f599b;
                kVar.f609g = (kVar.f609g + k.f602l.length) % kVar.f608f.f563e.length;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
