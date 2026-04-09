package com.bytedance.adsdk.emc.ypw.xq.emc;

import com.bytedance.adsdk.emc.ypw.ypw.emc.vk;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.util.Deque;

/* loaded from: classes.dex */
public class msw extends ycc {
    @Override // com.bytedance.adsdk.emc.ypw.xq.emc.ycc
    public int emc(String str, int i, Deque<com.bytedance.adsdk.emc.ypw.ypw.emc> deque, com.bytedance.adsdk.emc.ypw.xq.emc emcVar) {
        if (!com.bytedance.adsdk.emc.ypw.bw.emc.dg(emc(i, str))) {
            return emcVar.emc(str, i, deque);
        }
        int i3 = i + 1;
        String str2 = new String(new char[]{emc(i, str), emc(i3, str)});
        if (com.bytedance.adsdk.emc.ypw.dg.xq.emc(str2) != null) {
            deque.push(new vk(com.bytedance.adsdk.emc.ypw.dg.xq.emc(str2)));
            return i + 2;
        }
        String strValueOf = String.valueOf(emc(i, str));
        if (com.bytedance.adsdk.emc.ypw.dg.xq.emc(strValueOf) != null) {
            deque.push(new vk(com.bytedance.adsdk.emc.ypw.dg.xq.emc(strValueOf)));
            return i3;
        }
        StringBuilder sbQ = AbstractC1135f5.q("Unrecognized:", strValueOf, "examine:");
        sbQ.append(str.substring(0, i));
        throw new IllegalArgumentException(sbQ.toString());
    }
}
