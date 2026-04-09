package com.bytedance.adsdk.ouw.vt.lh.ouw;

import com.bytedance.adsdk.ouw.vt.vt.ouw.rn;
import d.h;
import java.util.Deque;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class pno extends le {
    @Override // com.bytedance.adsdk.ouw.vt.lh.ouw.le
    public final int ouw(String str, int i4, Deque<com.bytedance.adsdk.ouw.vt.vt.ouw> deque, com.bytedance.adsdk.ouw.vt.lh.ouw ouwVar) {
        char cOuw = le.ouw(i4, str);
        if ('+' != cOuw && '-' != cOuw && '*' != cOuw && '/' != cOuw && '%' != cOuw && '=' != cOuw && '>' != cOuw && '<' != cOuw && '!' != cOuw && '&' != cOuw && '|' != cOuw && '?' != cOuw && ':' != cOuw) {
            return ouwVar.ouw(str, i4, deque);
        }
        int i10 = i4 + 1;
        String str2 = new String(new char[]{le.ouw(i4, str), le.ouw(i10, str)});
        if (com.bytedance.adsdk.ouw.vt.yu.lh.ouw(str2) != null) {
            deque.push(new rn(com.bytedance.adsdk.ouw.vt.yu.lh.ouw(str2)));
            return i4 + 2;
        }
        String strValueOf = String.valueOf(le.ouw(i4, str));
        if (com.bytedance.adsdk.ouw.vt.yu.lh.ouw(strValueOf) != null) {
            deque.push(new rn(com.bytedance.adsdk.ouw.vt.yu.lh.ouw(strValueOf)));
            return i10;
        }
        StringBuilder sbA = h.A("Unrecognized:", strValueOf, "examine:");
        sbA.append(str.substring(0, i4));
        throw new IllegalArgumentException(sbA.toString());
    }
}
