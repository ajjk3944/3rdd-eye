package com.bytedance.adsdk.emc.ypw.xq.emc;

import java.util.Deque;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class zz extends ycc {
    @Override // com.bytedance.adsdk.emc.ypw.xq.emc.ycc
    public int emc(String str, int i, Deque<com.bytedance.adsdk.emc.ypw.ypw.emc> deque, com.bytedance.adsdk.emc.ypw.xq.emc emcVar) {
        com.bytedance.adsdk.emc.ypw.ypw.emc emcVarPollFirst;
        if (')' != emc(i, str)) {
            return emcVar.emc(str, i, deque);
        }
        LinkedList<com.bytedance.adsdk.emc.ypw.ypw.emc> linkedList = new LinkedList();
        while (true) {
            emcVarPollFirst = deque.pollFirst();
            if (emcVarPollFirst == null || emcVarPollFirst.emc() == com.bytedance.adsdk.emc.ypw.dg.dg.LEFT_PAREN || ((emcVarPollFirst instanceof com.bytedance.adsdk.emc.ypw.ypw.emc.ru) && emcVarPollFirst.emc() == com.bytedance.adsdk.emc.ypw.dg.ypw.METHOD && !((com.bytedance.adsdk.emc.ypw.ypw.emc.ru) emcVarPollFirst).xq())) {
                break;
            }
            linkedList.addFirst(emcVarPollFirst);
        }
        if (emcVarPollFirst == null) {
            throw new IllegalArgumentException(str.substring(0, i));
        }
        if (emcVarPollFirst.emc() != com.bytedance.adsdk.emc.ypw.dg.ypw.METHOD) {
            deque.push(com.bytedance.adsdk.emc.ypw.bw.ypw.emc(linkedList, str, i));
            return i + 1;
        }
        com.bytedance.adsdk.emc.ypw.ypw.emc.ru ruVar = (com.bytedance.adsdk.emc.ypw.ypw.emc.ru) emcVarPollFirst;
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        for (com.bytedance.adsdk.emc.ypw.ypw.emc emcVar2 : linkedList) {
            if (emcVar2.emc() == com.bytedance.adsdk.emc.ypw.dg.dg.COMMA) {
                linkedList2.add(com.bytedance.adsdk.emc.ypw.bw.ypw.emc(linkedList3, str, i));
                linkedList3.clear();
            } else {
                linkedList3.addLast(emcVar2);
            }
        }
        if (!linkedList3.isEmpty()) {
            linkedList2.add(com.bytedance.adsdk.emc.ypw.bw.ypw.emc(linkedList3, str, i));
        }
        ruVar.emc((com.bytedance.adsdk.emc.ypw.ypw.emc[]) linkedList2.toArray(new com.bytedance.adsdk.emc.ypw.ypw.emc[linkedList2.size()]));
        ruVar.emc(true);
        int i3 = i + 1;
        deque.push(ruVar);
        return i3;
    }
}
