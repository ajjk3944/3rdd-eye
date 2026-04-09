package com.bytedance.adsdk.emc.ypw.xq.emc;

import java.util.Deque;

/* loaded from: classes.dex */
public class bw extends ycc {
    @Override // com.bytedance.adsdk.emc.ypw.xq.emc.ycc
    public int emc(String str, int i, Deque<com.bytedance.adsdk.emc.ypw.ypw.emc> deque, com.bytedance.adsdk.emc.ypw.xq.emc emcVar) {
        char cEmc;
        int i3 = i;
        while (true) {
            cEmc = emc(i3, str);
            if (!com.bytedance.adsdk.emc.ypw.bw.emc.ypw(cEmc) && !com.bytedance.adsdk.emc.ypw.bw.emc.xq(cEmc)) {
                break;
            }
            i3++;
        }
        if (cEmc != '(') {
            return emcVar.emc(str, i, deque);
        }
        deque.push(new com.bytedance.adsdk.emc.ypw.ypw.emc.ru(str.substring(i, i3)));
        return i3 + 1;
    }
}
