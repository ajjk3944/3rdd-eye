package B3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f583a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f584b;

    public /* synthetic */ g(i iVar, int i) {
        this.f583a = i;
        this.f584b = iVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f583a) {
            case 1:
                super.onAnimationEnd(animator);
                i iVar = this.f584b;
                iVar.c();
                c cVar = iVar.f597j;
                if (cVar != null) {
                    cVar.a((v) iVar.f662a);
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
        switch (this.f583a) {
            case 0:
                super.onAnimationRepeat(animator);
                i iVar = this.f584b;
                iVar.f595g = (iVar.f595g + 4) % iVar.f594f.f563e.length;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
