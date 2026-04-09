package x2;

import android.view.animation.Animation;

/* compiled from: TricksActivity.java */
/* loaded from: classes.dex */
public final class q implements Animation.AnimationListener {
    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) throws InterruptedException {
        try {
            Thread.sleep(500L);
        } catch (InterruptedException e4) {
            e4.printStackTrace();
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
