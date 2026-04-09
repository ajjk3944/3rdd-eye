package com.bytedance.sdk.openadsdk.component.reward.emc;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;

/* loaded from: classes.dex */
public class qh {
    private final emc bw;
    private final int dg;
    com.bytedance.sdk.openadsdk.core.widget.msw emc;
    private AnimatorSet uym;
    private final Context xq;
    private com.bytedance.sdk.openadsdk.core.widget.uym ycc;
    private final rie ypw;

    public qh(emc emcVar) {
        this.xq = emcVar.vw;
        this.ypw = emcVar.ypw;
        this.dg = emcVar.rqm;
        this.bw = emcVar;
    }

    public View dg() {
        return this.ycc;
    }

    public void emc() {
        try {
            if (dr.xq(this.ypw)) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.widget.uym uymVar = new com.bytedance.sdk.openadsdk.core.widget.uym(this.xq);
            this.ycc = uymVar;
            this.emc = uymVar.getLoadingProgressBar();
            com.bytedance.sdk.openadsdk.core.ycc.msw downloadButton = this.ycc.getDownloadButton();
            if (downloadButton != null) {
                downloadButton.setOnClickListener(this.bw.db.bw());
            }
            this.ycc.emc(this.ypw, this.dg);
        } catch (Throwable unused) {
        }
    }

    public void xq() {
        AnimatorSet animatorSet = this.uym;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void ypw() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(1, 80);
        valueAnimatorOfInt.setDuration(2000L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.qh.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                com.bytedance.sdk.openadsdk.core.widget.msw mswVar = qh.this.emc;
                if (mswVar != null) {
                    mswVar.setProgress(iIntValue);
                }
            }
        });
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(81, 99);
        valueAnimatorOfInt2.setDuration(3000L);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.qh.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                com.bytedance.sdk.openadsdk.core.widget.msw mswVar = qh.this.emc;
                if (mswVar != null) {
                    mswVar.setProgress(iIntValue);
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.uym = animatorSet;
        animatorSet.play(valueAnimatorOfInt).before(valueAnimatorOfInt2);
        this.uym.start();
    }
}
