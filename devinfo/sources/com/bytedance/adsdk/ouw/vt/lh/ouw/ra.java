package com.bytedance.adsdk.ouw.vt.lh.ouw;

import com.bytedance.adsdk.ouw.vt.vt.ouw.ko;
import java.util.Deque;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ra extends le {
    @Override // com.bytedance.adsdk.ouw.vt.lh.ouw.le
    public final int ouw(String str, int i4, Deque<com.bytedance.adsdk.ouw.vt.vt.ouw> deque, com.bytedance.adsdk.ouw.vt.lh.ouw ouwVar) {
        boolean zVt;
        char cOuw;
        boolean z3 = false;
        if ('-' != le.ouw(i4, str)) {
            zVt = com.bytedance.adsdk.ouw.vt.fkw.ouw.vt(le.ouw(i4, str));
        } else if (deque.peek() != null && !com.bytedance.adsdk.ouw.vt.yu.lh.ouw(deque.peek().ouw())) {
            zVt = false;
        } else {
            if (!com.bytedance.adsdk.ouw.vt.fkw.ouw.vt(le.ouw(i4 + 1, str))) {
                throw new IllegalArgumentException("Unrecognized - symbol, not a negative number or operator, problem range:" + str.substring(0, i4));
            }
            zVt = true;
        }
        if (!zVt) {
            return ouwVar.ouw(str, i4, deque);
        }
        int i10 = le.ouw(i4, str) == '-' ? i4 + 1 : i4;
        while (true) {
            cOuw = le.ouw(i10, str);
            if (!com.bytedance.adsdk.ouw.vt.fkw.ouw.vt(cOuw) && (z3 || cOuw != '.')) {
                break;
            }
            i10++;
            if (cOuw == '.') {
                z3 = true;
            }
        }
        if (cOuw != '.') {
            deque.push(new ko(str.substring(i4, i10)));
            return i10;
        }
        throw new IllegalArgumentException("Illegal negative number format, problem interval:" + str.substring(i4, i10));
    }
}
