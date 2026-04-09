package com.bytedance.adsdk.emc.ypw.xq.emc;

import com.bytedance.adsdk.emc.ypw.ypw.emc.ul;
import java.util.Deque;

/* loaded from: classes.dex */
public class ypw extends ycc {
    @Override // com.bytedance.adsdk.emc.ypw.xq.emc.ycc
    public int emc(String str, int i10, Deque<com.bytedance.adsdk.emc.ypw.ypw.emc> deque, com.bytedance.adsdk.emc.ypw.xq.emc emcVar) {
        if ('\'' != emc(i10, str)) {
            return emcVar.emc(str, i10, deque);
        }
        int i11 = i10 + 1;
        int length = str.length();
        int i12 = i11;
        while (i12 < length && emc(i12, str) != '\'') {
            i12++;
        }
        if (emc(i12, str) != '\'') {
            throw new com.bytedance.adsdk.emc.emc.emc("String expression not surrounded by '", str.substring(i10));
        }
        deque.push(new ul(str.substring(i11, i12)));
        return i12 + 1;
    }
}
