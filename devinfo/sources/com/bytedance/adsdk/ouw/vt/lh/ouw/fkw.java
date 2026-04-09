package com.bytedance.adsdk.ouw.vt.lh.ouw;

import java.util.Deque;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw extends le {
    @Override // com.bytedance.adsdk.ouw.vt.lh.ouw.le
    public final int ouw(String str, int i4, Deque<com.bytedance.adsdk.ouw.vt.vt.ouw> deque, com.bytedance.adsdk.ouw.vt.lh.ouw ouwVar) {
        char cOuw;
        int i10 = i4;
        while (true) {
            cOuw = le.ouw(i10, str);
            if (!com.bytedance.adsdk.ouw.vt.fkw.ouw.ouw(cOuw) && !com.bytedance.adsdk.ouw.vt.fkw.ouw.vt(cOuw)) {
                break;
            }
            i10++;
        }
        if (cOuw != '(') {
            return ouwVar.ouw(str, i4, deque);
        }
        deque.push(new com.bytedance.adsdk.ouw.vt.vt.ouw.tlj(str.substring(i4, i10)));
        return i10 + 1;
    }
}
