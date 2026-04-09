package com.bytedance.sdk.component.zz;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class xq implements View.OnTouchListener {
    private ViewConfiguration emc;
    private int ypw = -1;

    public abstract void emc(View.OnTouchListener onTouchListener);

    public boolean emc(float f10, float f11, float f12, float f13, Context context) {
        if (this.emc == null) {
            this.emc = ViewConfiguration.get(context);
        }
        if (this.ypw == -1) {
            this.ypw = this.emc.getScaledTouchSlop();
        }
        return Math.abs(f10 - f12) <= ((float) this.ypw) && Math.abs(f11 - f13) <= ((float) this.ypw);
    }
}
