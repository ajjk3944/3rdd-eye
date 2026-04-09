package com.bytedance.adsdk.ouw.vt.lh.ouw;

import com.bytedance.adsdk.ouw.vt.vt.ouw.vpp;
import java.util.Deque;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh extends le {
    @Override // com.bytedance.adsdk.ouw.vt.lh.ouw.le
    public final int ouw(String str, int i4, Deque<com.bytedance.adsdk.ouw.vt.vt.ouw> deque, com.bytedance.adsdk.ouw.vt.lh.ouw ouwVar) {
        int i10;
        char cOuw = le.ouw(i4, str);
        if (!com.bytedance.adsdk.ouw.vt.fkw.ouw.ouw(cOuw) && cOuw != '$') {
            return ouwVar.ouw(str, i4, deque);
        }
        int i11 = 0;
        while (true) {
            i10 = i11 + i4;
            char cOuw2 = le.ouw(i10, str);
            if (!com.bytedance.adsdk.ouw.vt.fkw.ouw.ouw(cOuw2) && !com.bytedance.adsdk.ouw.vt.fkw.ouw.vt(cOuw2) && '.' != cOuw2 && '[' != cOuw2 && ']' != cOuw2 && '_' != cOuw2 && '$' != cOuw2) {
                break;
            }
            i11++;
        }
        String strSubstring = str.substring(i4, i10);
        if (com.bytedance.adsdk.ouw.vt.yu.ouw.ouw(strSubstring) != null) {
            deque.push(new com.bytedance.adsdk.ouw.vt.vt.ouw.ra(strSubstring));
            return i10;
        }
        deque.push(new vpp(strSubstring));
        return i10;
    }
}
