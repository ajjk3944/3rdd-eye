package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.rie;

/* loaded from: classes.dex */
public class ru extends uym {
    private long emc;
    private long ypw;

    public ru(Context context) {
        super(context);
        setVisibility(8);
        setClickable(true);
    }

    public boolean dg() {
        return this.emc > 0 && this.ypw > 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.uym
    public boolean emc() {
        return false;
    }

    public long getDisplayDuration() {
        if (this.emc == 0) {
            return 0L;
        }
        if (this.ypw == 0) {
            this.ypw = SystemClock.elapsedRealtime();
        }
        return this.ypw - this.emc;
    }

    public void xq() {
        setVisibility(8);
        if (this.emc != 0) {
            this.ypw = SystemClock.elapsedRealtime();
        }
    }

    public void ypw(rie rieVar, int i) {
        if (isShown()) {
            return;
        }
        ypw();
        setVisibility(0);
        this.emc = SystemClock.elapsedRealtime();
        emc(rieVar, i);
    }
}
