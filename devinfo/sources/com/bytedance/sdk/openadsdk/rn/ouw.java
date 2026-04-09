package com.bytedance.sdk.openadsdk.rn;

import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.openadsdk.core.tc;
import com.bytedance.sdk.openadsdk.utils.bs;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    public static void ouw() {
        if (bs.le()) {
            bs.ouw(new pno("DailyTaskHelper") { // from class: com.bytedance.sdk.openadsdk.rn.ouw.1
                @Override // java.lang.Runnable
                public final void run() {
                    tc.ouw();
                }
            });
        } else {
            tc.ouw();
        }
    }
}
