package com.bytedance.adsdk.emc.ypw.xq.emc;

import com.bytedance.adsdk.emc.ypw.ypw.emc.ylm;
import java.util.Deque;

/* loaded from: classes.dex */
public class dg extends ycc {
    @Override // com.bytedance.adsdk.emc.ypw.xq.emc.ycc
    public int emc(String str, int i10, Deque<com.bytedance.adsdk.emc.ypw.ypw.emc> deque, com.bytedance.adsdk.emc.ypw.xq.emc emcVar) {
        if ('(' != emc(i10, str)) {
            return emcVar.emc(str, i10, deque);
        }
        deque.push(new ylm(com.bytedance.adsdk.emc.ypw.dg.dg.LEFT_PAREN));
        return i10 + 1;
    }
}
