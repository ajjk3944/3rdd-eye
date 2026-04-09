package com.bytedance.adsdk.emc.ypw.xq.emc;

import com.bytedance.adsdk.emc.ypw.ypw.emc.ylm;
import java.util.Deque;

/* loaded from: classes.dex */
public class emc extends ycc {
    @Override // com.bytedance.adsdk.emc.ypw.xq.emc.ycc
    public int emc(String str, int i, Deque<com.bytedance.adsdk.emc.ypw.ypw.emc> deque, com.bytedance.adsdk.emc.ypw.xq.emc emcVar) {
        if (',' != emc(i, str)) {
            return emcVar.emc(str, i, deque);
        }
        deque.push(new ylm(com.bytedance.adsdk.emc.ypw.dg.dg.COMMA));
        return i + 1;
    }
}
