package com.bytedance.adsdk.ouw.vt.lh.ouw;

import java.util.Deque;
import java.util.LinkedList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class bly extends le {
    @Override // com.bytedance.adsdk.ouw.vt.lh.ouw.le
    public final int ouw(String str, int i4, Deque<com.bytedance.adsdk.ouw.vt.vt.ouw> deque, com.bytedance.adsdk.ouw.vt.lh.ouw ouwVar) {
        com.bytedance.adsdk.ouw.vt.vt.ouw ouwVarPollFirst;
        if (')' != le.ouw(i4, str)) {
            return ouwVar.ouw(str, i4, deque);
        }
        LinkedList<com.bytedance.adsdk.ouw.vt.vt.ouw> linkedList = new LinkedList();
        while (true) {
            ouwVarPollFirst = deque.pollFirst();
            if (ouwVarPollFirst == null || ouwVarPollFirst.ouw() == com.bytedance.adsdk.ouw.vt.yu.yu.LEFT_PAREN || ((ouwVarPollFirst instanceof com.bytedance.adsdk.ouw.vt.vt.ouw.tlj) && ouwVarPollFirst.ouw() == com.bytedance.adsdk.ouw.vt.yu.vt.METHOD && !((com.bytedance.adsdk.ouw.vt.vt.ouw.tlj) ouwVarPollFirst).vt)) {
                break;
            }
            linkedList.addFirst(ouwVarPollFirst);
        }
        if (ouwVarPollFirst == null) {
            throw new IllegalArgumentException(str.substring(0, i4));
        }
        if (ouwVarPollFirst.ouw() != com.bytedance.adsdk.ouw.vt.yu.vt.METHOD) {
            deque.push(com.bytedance.adsdk.ouw.vt.fkw.vt.ouw(linkedList, str, i4));
            return i4 + 1;
        }
        com.bytedance.adsdk.ouw.vt.vt.ouw.tlj tljVar = (com.bytedance.adsdk.ouw.vt.vt.ouw.tlj) ouwVarPollFirst;
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        for (com.bytedance.adsdk.ouw.vt.vt.ouw ouwVar2 : linkedList) {
            if (ouwVar2.ouw() == com.bytedance.adsdk.ouw.vt.yu.yu.COMMA) {
                linkedList2.add(com.bytedance.adsdk.ouw.vt.fkw.vt.ouw(linkedList3, str, i4));
                linkedList3.clear();
            } else {
                linkedList3.addLast(ouwVar2);
            }
        }
        if (!linkedList3.isEmpty()) {
            linkedList2.add(com.bytedance.adsdk.ouw.vt.fkw.vt.ouw(linkedList3, str, i4));
        }
        tljVar.ouw = (com.bytedance.adsdk.ouw.vt.vt.ouw[]) linkedList2.toArray(new com.bytedance.adsdk.ouw.vt.vt.ouw[linkedList2.size()]);
        tljVar.vt = true;
        int i10 = i4 + 1;
        deque.push(tljVar);
        return i10;
    }
}
