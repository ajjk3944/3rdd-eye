package com.bytedance.sdk.component.adexpress.ycc;

import android.content.Context;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public class gbl extends FrameLayout {
    private final RotateAnimation dg;
    private final TextView emc;
    private final sup xq;
    private final ImageView ypw;

    public gbl(Context context) {
        super(context);
        addView(com.bytedance.sdk.component.adexpress.xq.emc.dg(context));
        this.emc = (TextView) findViewById(2097610742);
        this.ypw = (ImageView) findViewById(2097610745);
        this.xq = (sup) findViewById(2097610744);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 30.0f, 1, 0.65f, 1, 0.9f);
        this.dg = rotateAnimation;
        rotateAnimation.setDuration(300L);
        rotateAnimation.setRepeatMode(2);
        rotateAnimation.setRepeatCount(1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable getHaloAnimation() {
        return new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ycc.gbl.1
            @Override // java.lang.Runnable
            public void run() {
                gbl.this.ypw.startAnimation(gbl.this.dg);
                gbl.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ycc.gbl.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        gbl.this.xq.emc(4);
                    }
                }, 100L);
                gbl.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ycc.gbl.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        gbl.this.xq.emc(4);
                    }
                }, 300L);
                gbl gblVar = gbl.this;
                gblVar.postDelayed(gblVar.getHaloAnimation(), 1200L);
            }
        };
    }

    public void setText(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "Slide or click to jump to the details page or third-party application";
        }
        TextView textView = this.emc;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void emc() {
        postDelayed(getHaloAnimation(), 300L);
    }

    public void ypw() {
        this.dg.cancel();
    }
}
