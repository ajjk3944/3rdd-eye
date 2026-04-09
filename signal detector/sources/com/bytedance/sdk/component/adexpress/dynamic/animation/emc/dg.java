package com.bytedance.sdk.component.adexpress.dynamic.animation.emc;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mkp;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class dg implements mkp {
    private Set<ScheduledFuture<?>> dg = new HashSet();
    public List<ObjectAnimator> emc = emc();
    public View xq;
    com.bytedance.sdk.component.adexpress.dynamic.dg.emc ypw;

    public class emc implements Runnable {
        ObjectAnimator emc;
        ScheduledFuture<?> ypw;

        public emc(ObjectAnimator objectAnimator) {
            this.emc = objectAnimator;
        }

        public void emc(ScheduledFuture<?> scheduledFuture) {
            this.ypw = scheduledFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().xq() != null) {
                com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().xq().xq().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.emc.dg.emc.1
                    @Override // java.lang.Runnable
                    public void run() {
                        emc.this.emc.resume();
                    }
                });
                if (this.ypw != null) {
                    dg.this.dg.remove(this.ypw);
                }
            }
        }
    }

    public dg(View view, com.bytedance.sdk.component.adexpress.dynamic.dg.emc emcVar) {
        this.xq = view;
        this.ypw = emcVar;
    }

    public abstract List<ObjectAnimator> emc();

    public void xq() {
        List<ObjectAnimator> list = this.emc;
        if (list == null) {
            return;
        }
        for (final ObjectAnimator objectAnimator : list) {
            objectAnimator.start();
            if (this.ypw.aa() > 0.0d) {
                objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.emc.dg.1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                        objectAnimator.pause();
                        emc emcVar = dg.this.new emc(objectAnimator);
                        ScheduledFuture<?> scheduledFutureEmc = com.bytedance.sdk.component.adexpress.dg.dg.emc(emcVar, (long) (dg.this.ypw.aa() * 1000.0d), TimeUnit.MILLISECONDS);
                        emcVar.emc(scheduledFutureEmc);
                        dg.this.dg.add(scheduledFutureEmc);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }
                });
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mkp
    public void ypw() {
        List<ObjectAnimator> list = this.emc;
        if (list == null) {
            return;
        }
        for (ObjectAnimator objectAnimator : list) {
            objectAnimator.cancel();
            objectAnimator.removeAllUpdateListeners();
        }
        Iterator<ScheduledFuture<?>> it = this.dg.iterator();
        while (it.hasNext()) {
            it.next().cancel(true);
        }
    }

    public ObjectAnimator emc(final ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay((long) (this.ypw.qh() * 1000.0d));
        if (this.ypw.cf() > 0) {
            objectAnimator.setRepeatCount(this.ypw.cf() - 1);
        } else {
            objectAnimator.setRepeatCount(-1);
        }
        if (!"normal".equals(this.ypw.vk())) {
            if ("alternate".equals(this.ypw.vk()) || "alternate-reverse".equals(this.ypw.vk())) {
                objectAnimator.setRepeatMode(2);
            } else {
                objectAnimator.setRepeatMode(1);
            }
        }
        if ("ease-in-out".equals(this.ypw.sz())) {
            objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        } else if ("ease-in".equals(this.ypw.vk())) {
            objectAnimator.setInterpolator(new AccelerateInterpolator());
        } else if ("ease-out".equals(this.ypw.vk())) {
            objectAnimator.setInterpolator(new DecelerateInterpolator());
        } else {
            objectAnimator.setInterpolator(new LinearInterpolator());
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.emc.dg.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator.getCurrentPlayTime() > 0) {
                    dg.this.xq.setVisibility(0);
                    if (dg.this.xq.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc) {
                        ((View) dg.this.xq.getParent()).setVisibility(0);
                    }
                    objectAnimator.removeAllUpdateListeners();
                }
            }
        });
        return objectAnimator;
    }
}
