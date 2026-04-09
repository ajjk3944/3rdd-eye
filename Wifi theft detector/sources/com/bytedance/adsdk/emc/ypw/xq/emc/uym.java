package com.bytedance.adsdk.emc.ypw.xq.emc;

import com.bytedance.adsdk.emc.ypw.ypw.emc.cf;
import java.util.Deque;

/* loaded from: classes.dex */
public class uym extends ycc {
    private boolean emc(String str, int i10, Deque<com.bytedance.adsdk.emc.ypw.ypw.emc> deque) {
        if ('-' != emc(i10, str)) {
            return com.bytedance.adsdk.emc.ypw.bw.emc.xq(emc(i10, str));
        }
        if (deque.peek() != null && !com.bytedance.adsdk.emc.ypw.dg.xq.emc(deque.peek().emc())) {
            return false;
        }
        if (com.bytedance.adsdk.emc.ypw.bw.emc.xq(emc(i10 + 1, str))) {
            return true;
        }
        throw new IllegalArgumentException("Unrecognized - symbol, not a negative number or operator, problem range:" + str.substring(0, i10));
    }

    @Override // com.bytedance.adsdk.emc.ypw.xq.emc.ycc
    public int emc(String str, int i10, Deque<com.bytedance.adsdk.emc.ypw.ypw.emc> deque, com.bytedance.adsdk.emc.ypw.xq.emc emcVar) {
        char cEmc;
        if (!emc(str, i10, deque)) {
            return emcVar.emc(str, i10, deque);
        }
        int i11 = emc(i10, str) == '-' ? i10 + 1 : i10;
        boolean z10 = false;
        while (true) {
            cEmc = emc(i11, str);
            if (!com.bytedance.adsdk.emc.ypw.bw.emc.xq(cEmc) && (z10 || cEmc != '.')) {
                break;
            }
            i11++;
            if (cEmc == '.') {
                z10 = true;
            }
        }
        if (cEmc != '.') {
            deque.push(new cf(str.substring(i10, i11)));
            return i11;
        }
        throw new IllegalArgumentException("Illegal negative number format, problem interval:" + str.substring(i10, i11));
    }
}
