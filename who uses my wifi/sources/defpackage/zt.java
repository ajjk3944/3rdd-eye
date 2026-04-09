package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zt extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public zt(View view, boolean z) {
        this.a = 0;
        this.b = z;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.b = true;
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
                if (!this.b) {
                    ((View) this.c).setVisibility(4);
                    break;
                }
                break;
            default:
                iu iuVar = (iu) this.c;
                if (!this.b) {
                    if (((Float) iuVar.z.getAnimatedValue()).floatValue() != 0.0f) {
                        iuVar.A = 2;
                        iuVar.s.invalidate();
                        break;
                    } else {
                        iuVar.A = 0;
                        iuVar.g(0);
                        break;
                    }
                } else {
                    this.b = false;
                    break;
                }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    ((View) this.c).setVisibility(0);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public zt(iu iuVar) {
        this.a = 1;
        this.c = iuVar;
        this.b = false;
    }
}
