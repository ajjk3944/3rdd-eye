package com.bytedance.sdk.component.ycc.emc.xq;

import com.bytedance.sdk.component.ycc.emc.bw;
import com.bytedance.sdk.component.ycc.emc.msw;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class ypw {
    public static void emc(AtomicLong atomicLong, int i10) {
        bw bwVarVk = msw.uym().vk();
        if (bwVarVk == null || !bwVarVk.uym() || atomicLong == null) {
            return;
        }
        atomicLong.getAndAdd(i10);
    }
}
