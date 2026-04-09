package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yt extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public yt(boolean z, View view, View view2) {
        this.b = z;
        this.c = view;
        this.d = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                View view = (View) this.d;
                if (!this.b) {
                    ((View) this.c).setVisibility(4);
                    view.setAlpha(1.0f);
                    view.setVisibility(0);
                    break;
                }
                break;
            default:
                wu wuVar = (wu) this.d;
                wuVar.r = 0;
                wuVar.m = null;
                vq2 vq2Var = (vq2) this.c;
                if (vq2Var != null) {
                    ((wl2) vq2Var.g).s();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                View view = (View) this.d;
                if (this.b) {
                    ((View) this.c).setVisibility(0);
                    view.setAlpha(0.0f);
                    view.setVisibility(4);
                    break;
                }
                break;
            default:
                wu wuVar = (wu) this.d;
                wuVar.v.a(0, this.b);
                wuVar.r = 2;
                wuVar.m = animator;
                break;
        }
    }

    public yt(wu wuVar, boolean z, vq2 vq2Var) {
        this.d = wuVar;
        this.b = z;
        this.c = vq2Var;
    }
}
