package com.bytedance.sdk.component.zz;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class xq implements View.OnTouchListener {
    private ViewConfiguration emc;
    private int ypw = -1;

    public abstract void emc(View.OnTouchListener onTouchListener);

    public boolean emc(float f2, float f5, float f6, float f7, Context context) {
        if (this.emc == null) {
            this.emc = ViewConfiguration.get(context);
        }
        if (this.ypw == -1) {
            this.ypw = this.emc.getScaledTouchSlop();
        }
        return Math.abs(f2 - f6) <= ((float) this.ypw) && Math.abs(f5 - f7) <= ((float) this.ypw);
    }
}
