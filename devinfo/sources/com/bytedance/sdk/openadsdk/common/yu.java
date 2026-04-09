package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.vpp;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu extends mwh {
    public yu(Context context) {
        super(context);
        this.vt = false;
    }

    @Override // com.bytedance.sdk.openadsdk.common.mwh
    public final void ouw() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.yu.1
            @Override // java.lang.Runnable
            public final void run() {
                yu yuVar = yu.this;
                if (yuVar.ouw != null) {
                    yuVar.setVisibility(0);
                }
            }
        });
    }

    public final void ouw(vpp vppVar, String str, int i4, String str2, long j, boolean z3, int i10, long j8) {
        if (getVisibility() != 8) {
            com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, str, i4, str2, SystemClock.elapsedRealtime() - j, z3, i10, j8);
            vt();
        }
    }
}
