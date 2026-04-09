package com.bytedance.adsdk.emc.ypw.xq.emc;

import com.bytedance.adsdk.emc.ypw.ypw.emc.sra;
import java.util.Deque;

/* loaded from: classes.dex */
public class xq extends ycc {
    @Override // com.bytedance.adsdk.emc.ypw.xq.emc.ycc
    public int emc(String str, int i10, Deque<com.bytedance.adsdk.emc.ypw.ypw.emc> deque, com.bytedance.adsdk.emc.ypw.xq.emc emcVar) {
        char cEmc = emc(i10, str);
        return (com.bytedance.adsdk.emc.ypw.bw.emc.ypw(cEmc) || cEmc == '$') ? emc(str, i10, deque) : emcVar.emc(str, i10, deque);
    }

    private int emc(String str, int i10, Deque<com.bytedance.adsdk.emc.ypw.ypw.emc> deque) {
        int i11;
        int i12 = 0;
        while (true) {
            i11 = i12 + i10;
            char cEmc = emc(i11, str);
            if (!com.bytedance.adsdk.emc.ypw.bw.emc.ypw(cEmc) && !com.bytedance.adsdk.emc.ypw.bw.emc.xq(cEmc) && '.' != cEmc && '[' != cEmc && ']' != cEmc && '_' != cEmc && '$' != cEmc) {
                break;
            }
            i12++;
        }
        String strSubstring = str.substring(i10, i11);
        if (com.bytedance.adsdk.emc.ypw.dg.emc.emc(strSubstring) != null) {
            deque.push(new com.bytedance.adsdk.emc.ypw.ypw.emc.uym(strSubstring));
            return i11;
        }
        deque.push(new sra(strSubstring));
        return i11;
    }
}
