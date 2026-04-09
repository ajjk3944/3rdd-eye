package com.bytedance.sdk.component.adexpress.dynamic.animation.ouw;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fak;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class yu implements fak {

    /* renamed from: lh, reason: collision with root package name */
    Set<ScheduledFuture<?>> f7222lh = new HashSet();
    public List<ObjectAnimator> ouw = ouw();
    public com.bytedance.sdk.component.adexpress.dynamic.yu.ouw vt;
    public View yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class ouw implements Runnable {
        ObjectAnimator ouw;
        ScheduledFuture<?> vt;

        public ouw(ObjectAnimator objectAnimator) {
            this.ouw = objectAnimator;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f7383lh != null) {
                com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f7383lh.lh().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.yu.ouw.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ouw.this.ouw.resume();
                    }
                });
                ScheduledFuture<?> scheduledFuture = this.vt;
                if (scheduledFuture != null) {
                    yu.this.f7222lh.remove(scheduledFuture);
                }
            }
        }
    }

    public yu(View view, com.bytedance.sdk.component.adexpress.dynamic.yu.ouw ouwVar) {
        this.yu = view;
        this.vt = ouwVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fak
    public final void a_() {
        List<ObjectAnimator> list = this.ouw;
        if (list == null) {
            return;
        }
        for (ObjectAnimator objectAnimator : list) {
            objectAnimator.cancel();
            objectAnimator.removeAllUpdateListeners();
        }
        Iterator<ScheduledFuture<?>> it = this.f7222lh.iterator();
        while (it.hasNext()) {
            it.next().cancel(true);
        }
    }

    public final ObjectAnimator ouw(final ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay((long) (this.vt.f7300le * 1000.0d));
        int i4 = this.vt.ra;
        if (i4 > 0) {
            objectAnimator.setRepeatCount(i4 - 1);
        } else {
            objectAnimator.setRepeatCount(-1);
        }
        if (!"normal".equals(this.vt.pno)) {
            if ("alternate".equals(this.vt.pno) || "alternate-reverse".equals(this.vt.pno)) {
                objectAnimator.setRepeatMode(2);
            } else {
                objectAnimator.setRepeatMode(1);
            }
        }
        if ("ease-in-out".equals(this.vt.fkw)) {
            objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        } else if ("ease-in".equals(this.vt.pno)) {
            objectAnimator.setInterpolator(new AccelerateInterpolator());
        } else if ("ease-out".equals(this.vt.pno)) {
            objectAnimator.setInterpolator(new DecelerateInterpolator());
        } else {
            objectAnimator.setInterpolator(new LinearInterpolator());
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.yu.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator.getCurrentPlayTime() > 0) {
                    yu.this.yu.setVisibility(0);
                    if (yu.this.yu.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le) {
                        ((View) yu.this.yu.getParent()).setVisibility(0);
                    }
                    objectAnimator.removeAllUpdateListeners();
                }
            }
        });
        return objectAnimator;
    }

    public abstract List<ObjectAnimator> ouw();
}
