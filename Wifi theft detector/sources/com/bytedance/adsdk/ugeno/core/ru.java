package com.bytedance.adsdk.ugeno.core;

import android.animation.AnimatorSet;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class ru {
    private int bw;
    private View dg;
    Paint emc;
    private String uym;
    private AnimatorSet xq = new AnimatorSet();
    private int ycc;
    private emc ypw;

    public ru(View view, emc emcVar) {
        this.dg = view;
        this.ypw = emcVar;
        Paint paint = new Paint();
        this.emc = paint;
        paint.setAntiAlias(true);
    }

    public void ypw() {
        AnimatorSet animatorSet = this.xq;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void emc() {
        /*
            Method dump skipped, instructions count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.core.ru.emc():void");
    }

    public void emc(Canvas canvas, IAnimation iAnimation) {
        try {
            if (iAnimation.getRipple() == 0.0f || TextUtils.isEmpty(this.uym)) {
                return;
            }
            this.emc.setColor(com.bytedance.adsdk.ugeno.uym.emc.emc(this.uym));
            this.emc.setAlpha(90);
            ((ViewGroup) this.dg.getParent()).setClipChildren(true);
            canvas.drawCircle(this.bw, this.ycc, Math.min(r0, r2) * 2 * iAnimation.getRipple(), this.emc);
        } catch (Throwable th) {
            Log.d("UGenAnimation", "ripple animation error " + th.getMessage());
        }
    }

    public void emc(int i10, int i11) {
        this.bw = i10 / 2;
        this.ycc = i11 / 2;
    }
}
