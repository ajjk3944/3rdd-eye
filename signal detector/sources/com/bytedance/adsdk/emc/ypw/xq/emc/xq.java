package com.bytedance.adsdk.emc.ypw.xq.emc;

import com.bytedance.adsdk.emc.ypw.ypw.emc.sra;
import java.util.Deque;

/* loaded from: classes.dex */
public class xq extends ycc {
    @Override // com.bytedance.adsdk.emc.ypw.xq.emc.ycc
    public int emc(String str, int i, Deque<com.bytedance.adsdk.emc.ypw.ypw.emc> deque, com.bytedance.adsdk.emc.ypw.xq.emc emcVar) {
        char cEmc = emc(i, str);
        return (com.bytedance.adsdk.emc.ypw.bw.emc.ypw(cEmc) || cEmc == '$') ? emc(str, i, deque) : emcVar.emc(str, i, deque);
    }

    private int emc(String str, int i, Deque<com.bytedance.adsdk.emc.ypw.ypw.emc> deque) {
        int i3;
        int i6 = 0;
        while (true) {
            i3 = i6 + i;
            char cEmc = emc(i3, str);
            if (!com.bytedance.adsdk.emc.ypw.bw.emc.ypw(cEmc) && !com.bytedance.adsdk.emc.ypw.bw.emc.xq(cEmc) && '.' != cEmc && '[' != cEmc && ']' != cEmc && '_' != cEmc && '$' != cEmc) {
                break;
            }
            i6++;
        }
        String strSubstring = str.substring(i, i3);
        if (com.bytedance.adsdk.emc.ypw.dg.emc.emc(strSubstring) != null) {
            deque.push(new com.bytedance.adsdk.emc.ypw.ypw.emc.uym(strSubstring));
            return i3;
        }
        deque.push(new sra(strSubstring));
        return i3;
    }
}
