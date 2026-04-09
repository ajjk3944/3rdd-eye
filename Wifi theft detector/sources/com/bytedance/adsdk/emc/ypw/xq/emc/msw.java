package com.bytedance.adsdk.emc.ypw.xq.emc;

import com.bytedance.adsdk.emc.ypw.ypw.emc.vk;
import java.util.Deque;

/* loaded from: classes.dex */
public class msw extends ycc {
    @Override // com.bytedance.adsdk.emc.ypw.xq.emc.ycc
    public int emc(String str, int i10, Deque<com.bytedance.adsdk.emc.ypw.ypw.emc> deque, com.bytedance.adsdk.emc.ypw.xq.emc emcVar) {
        if (!com.bytedance.adsdk.emc.ypw.bw.emc.dg(emc(i10, str))) {
            return emcVar.emc(str, i10, deque);
        }
        int i11 = i10 + 1;
        String str2 = new String(new char[]{emc(i10, str), emc(i11, str)});
        if (com.bytedance.adsdk.emc.ypw.dg.xq.emc(str2) != null) {
            deque.push(new vk(com.bytedance.adsdk.emc.ypw.dg.xq.emc(str2)));
            return i10 + 2;
        }
        String strValueOf = String.valueOf(emc(i10, str));
        if (com.bytedance.adsdk.emc.ypw.dg.xq.emc(strValueOf) != null) {
            deque.push(new vk(com.bytedance.adsdk.emc.ypw.dg.xq.emc(strValueOf)));
            return i11;
        }
        throw new IllegalArgumentException("Unrecognized:" + strValueOf + "examine:" + str.substring(0, i10));
    }
}
