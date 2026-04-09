package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class s21 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s21(Object obj, View view, int i) {
        this.a = i;
        this.b = obj;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ((y61) this.b).c();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((s8) this.b).remove(animator);
                ((v21) this.c).s.remove(animator);
                break;
            case 1:
                ((y61) this.b).b();
                break;
            default:
                ((a91) this.b).a.d(1.0f);
                w81.e((View) this.c);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((v21) this.c).s.add(animator);
                break;
            case 1:
                ((y61) this.b).e();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public s21(v21 v21Var, s8 s8Var) {
        this.a = 0;
        this.c = v21Var;
        this.b = s8Var;
    }
}
