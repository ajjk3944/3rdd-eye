package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class o60 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ p60 b;

    public /* synthetic */ o60(p60 p60Var, int i) {
        this.a = i;
        this.b = p60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                p60 p60Var = this.b;
                p60Var.c();
                fa faVar = p60Var.j;
                if (faVar != null) {
                    faVar.a((n20) p60Var.a);
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
        switch (this.a) {
            case 0:
                super.onAnimationRepeat(animator);
                p60 p60Var = this.b;
                p60Var.g = (p60Var.g + 1) % p60Var.f.e.length;
                p60Var.h = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
