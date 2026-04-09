package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class su extends AnimatorListenerAdapter {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ vq2 c;
    public final /* synthetic */ wu d;

    public su(wu wuVar, boolean z, vq2 vq2Var) {
        this.d = wuVar;
        this.b = z;
        this.c = vq2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        wu wuVar = this.d;
        wuVar.r = 0;
        wuVar.m = null;
        if (this.a) {
            return;
        }
        FloatingActionButton floatingActionButton = wuVar.v;
        boolean z = this.b;
        floatingActionButton.a(z ? 8 : 4, z);
        vq2 vq2Var = this.c;
        if (vq2Var != null) {
            ((wl2) vq2Var.g).r((FloatingActionButton) vq2Var.h);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        wu wuVar = this.d;
        wuVar.v.a(0, this.b);
        wuVar.r = 1;
        wuVar.m = animator;
        this.a = false;
    }
}
