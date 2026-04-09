package com.bytedance.sdk.component.adexpress.ycc;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.CycleInterpolator;
import android.widget.TextView;

/* loaded from: classes.dex */
public class uym extends sra {
    private TextView emc;
    private AnimatorSet xq;
    private View ypw;

    public uym(Context context) {
        super(context);
        this.xq = new AnimatorSet();
        ypw(context);
    }

    private void dg() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.ypw, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.dg.uym.emc(getContext(), -3.0f));
        objectAnimatorOfFloat.setInterpolator(new CycleInterpolator(1.0f));
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.ypw, "alpha", 1.0f, 0.8f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setInterpolator(new CycleInterpolator(1.0f));
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.xq.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.xq.setDuration(1000L);
        this.xq.start();
    }

    private void ypw(Context context) {
        View viewEmc = com.bytedance.sdk.component.adexpress.xq.emc.emc(context);
        this.ypw = viewEmc;
        addView(viewEmc);
        setClipChildren(false);
        this.emc = (TextView) findViewById(2097610748);
    }

    @Override // com.bytedance.sdk.component.adexpress.ycc.sra
    public void emc(Context context) {
    }

    public void setButtonText(String str) {
        if (this.emc == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.emc.setText(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.ycc.sra
    public void emc() {
        dg();
    }

    @Override // com.bytedance.sdk.component.adexpress.ycc.sra
    public void ypw() {
        this.xq.cancel();
    }
}
