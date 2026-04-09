package com.bytedance.adsdk.emc.ypw.xq.emc;

import java.util.Deque;

/* loaded from: classes.dex */
public class bw extends ycc {
    @Override // com.bytedance.adsdk.emc.ypw.xq.emc.ycc
    public int emc(String str, int i10, Deque<com.bytedance.adsdk.emc.ypw.ypw.emc> deque, com.bytedance.adsdk.emc.ypw.xq.emc emcVar) {
        char cEmc;
        int i11 = i10;
        while (true) {
            cEmc = emc(i11, str);
            if (!com.bytedance.adsdk.emc.ypw.bw.emc.ypw(cEmc) && !com.bytedance.adsdk.emc.ypw.bw.emc.xq(cEmc)) {
                break;
            }
            i11++;
        }
        if (cEmc != '(') {
            return emcVar.emc(str, i10, deque);
        }
        deque.push(new com.bytedance.adsdk.emc.ypw.ypw.emc.ru(str.substring(i10, i11)));
        return i11 + 1;
    }
}
