package com.bytedance.adsdk.ypw.ycc;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public abstract class emc extends ValueAnimator {
    private final Set<ValueAnimator.AnimatorUpdateListener> emc = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorListener> ypw = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorPauseListener> xq = new CopyOnWriteArraySet();

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.ypw.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.xq.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.emc.add(animatorUpdateListener);
    }

    public void bw() {
        Iterator<Animator.AnimatorPauseListener> it = this.xq.iterator();
        while (it.hasNext()) {
            it.next().onAnimationResume(this);
        }
    }

    public void dg() {
        Iterator<Animator.AnimatorPauseListener> it = this.xq.iterator();
        while (it.hasNext()) {
            it.next().onAnimationPause(this);
        }
    }

    public void emc(boolean z6) {
        for (Animator.AnimatorListener animatorListener : this.ypw) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z6);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.ypw.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.emc.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.ypw.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.xq.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.emc.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j6) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    public void xq() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.emc.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    public void ypw(boolean z6) {
        for (Animator.AnimatorListener animatorListener : this.ypw) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z6);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j6) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    public void emc() {
        Iterator<Animator.AnimatorListener> it = this.ypw.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    public void ypw() {
        Iterator<Animator.AnimatorListener> it = this.ypw.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }
}
