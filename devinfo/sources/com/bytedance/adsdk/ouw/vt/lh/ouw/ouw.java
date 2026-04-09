package com.bytedance.adsdk.ouw.vt.lh.ouw;

import com.bytedance.adsdk.ouw.vt.vt.ouw.zin;
import java.util.Deque;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw extends le {
    @Override // com.bytedance.adsdk.ouw.vt.lh.ouw.le
    public final int ouw(String str, int i4, Deque<com.bytedance.adsdk.ouw.vt.vt.ouw> deque, com.bytedance.adsdk.ouw.vt.lh.ouw ouwVar) {
        if (',' != le.ouw(i4, str)) {
            return ouwVar.ouw(str, i4, deque);
        }
        deque.push(new zin(com.bytedance.adsdk.ouw.vt.yu.yu.COMMA));
        return i4 + 1;
    }
}
