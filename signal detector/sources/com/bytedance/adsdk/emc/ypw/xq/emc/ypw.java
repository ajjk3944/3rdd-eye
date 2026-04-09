package com.bytedance.adsdk.emc.ypw.xq.emc;

import com.bytedance.adsdk.emc.ypw.ypw.emc.ul;
import java.util.Deque;

/* loaded from: classes.dex */
public class ypw extends ycc {
    @Override // com.bytedance.adsdk.emc.ypw.xq.emc.ycc
    public int emc(String str, int i, Deque<com.bytedance.adsdk.emc.ypw.ypw.emc> deque, com.bytedance.adsdk.emc.ypw.xq.emc emcVar) {
        if ('\'' != emc(i, str)) {
            return emcVar.emc(str, i, deque);
        }
        int i3 = i + 1;
        int length = str.length();
        int i6 = i3;
        while (i6 < length && emc(i6, str) != '\'') {
            i6++;
        }
        if (emc(i6, str) != '\'') {
            throw new com.bytedance.adsdk.emc.emc.emc("String expression not surrounded by '", str.substring(i));
        }
        deque.push(new ul(str.substring(i3, i6)));
        return i6 + 1;
    }
}
