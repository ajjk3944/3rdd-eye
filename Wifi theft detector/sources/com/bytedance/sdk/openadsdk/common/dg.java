package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.rie;

/* loaded from: classes.dex */
public class dg extends sup {
    public dg(@NonNull Context context) {
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

    public void emc(rie rieVar, String str, int i10, String str2, long j10, boolean z10, int i11, long j11) {
        if (getVisibility() != 8) {
            com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar, str, i10, str2, SystemClock.elapsedRealtime() - j10, z10, i11, j11);
            super.ypw();
        }
    }
}
