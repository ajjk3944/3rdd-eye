package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.rie;

/* loaded from: classes.dex */
public class dg extends sup {
    public dg(Context context) {
        super(context);
        this.ypw = false;
    }

    @Override // com.bytedance.sdk.openadsdk.common.sup
    public void emc() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.dg.1
            @Override // java.lang.Runnable
            public void run() {
                dg dgVar = dg.this;
                if (dgVar.emc != null) {
                    dgVar.setVisibility(0);
                }
            }
        });
    }

    public void emc(rie rieVar, String str, int i, String str2, long j6, boolean z6, int i3, long j7) {
        if (getVisibility() != 8) {
            com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar, str, i, str2, SystemClock.elapsedRealtime() - j6, z6, i3, j7);
            super.ypw();
        }
    }
}
