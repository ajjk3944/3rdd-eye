package com.bytedance.adsdk.emc.ypw.xq.emc;

import com.bytedance.adsdk.emc.ypw.ypw.emc.cf;
import java.util.Deque;

/* loaded from: classes.dex */
public class uym extends ycc {
    private boolean emc(String str, int i, Deque<com.bytedance.adsdk.emc.ypw.ypw.emc> deque) {
        if ('-' != emc(i, str)) {
            return com.bytedance.adsdk.emc.ypw.bw.emc.xq(emc(i, str));
        }
        if (deque.peek() != null && !com.bytedance.adsdk.emc.ypw.dg.xq.emc(deque.peek().emc())) {
            return false;
        }
        if (com.bytedance.adsdk.emc.ypw.bw.emc.xq(emc(i + 1, str))) {
            return true;
        }
        throw new IllegalArgumentException("Unrecognized - symbol, not a negative number or operator, problem range:" + str.substring(0, i));
    }

    @Override // com.bytedance.adsdk.emc.ypw.xq.emc.ycc
    public int emc(String str, int i, Deque<com.bytedance.adsdk.emc.ypw.ypw.emc> deque, com.bytedance.adsdk.emc.ypw.xq.emc emcVar) {
        char cEmc;
        if (!emc(str, i, deque)) {
            return emcVar.emc(str, i, deque);
        }
        int i3 = emc(i, str) == '-' ? i + 1 : i;
        boolean z6 = false;
        while (true) {
            cEmc = emc(i3, str);
            if (!com.bytedance.adsdk.emc.ypw.bw.emc.xq(cEmc) && (z6 || cEmc != '.')) {
                break;
            }
            i3++;
            if (cEmc == '.') {
                z6 = true;
            }
        }
        if (cEmc != '.') {
            deque.push(new cf(str.substring(i, i3)));
            return i3;
        }
        throw new IllegalArgumentException("Illegal negative number format, problem interval:" + str.substring(i, i3));
    }
}
