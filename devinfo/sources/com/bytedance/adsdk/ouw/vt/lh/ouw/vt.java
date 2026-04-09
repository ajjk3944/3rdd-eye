package com.bytedance.adsdk.ouw.vt.lh.ouw;

import com.bytedance.adsdk.ouw.vt.vt.ouw.qbp;
import java.util.Deque;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt extends le {
    @Override // com.bytedance.adsdk.ouw.vt.lh.ouw.le
    public final int ouw(String str, int i4, Deque<com.bytedance.adsdk.ouw.vt.vt.ouw> deque, com.bytedance.adsdk.ouw.vt.lh.ouw ouwVar) {
        if ('\'' != le.ouw(i4, str)) {
            return ouwVar.ouw(str, i4, deque);
        }
        int i10 = i4 + 1;
        int length = str.length();
        int i11 = i10;
        while (i11 < length && le.ouw(i11, str) != '\'') {
            i11++;
        }
        if (le.ouw(i11, str) != '\'') {
            throw new com.bytedance.adsdk.ouw.ouw.ouw("String expression not surrounded by '", str.substring(i4));
        }
        deque.push(new qbp(str.substring(i10, i11)));
        return i11 + 1;
    }
}
