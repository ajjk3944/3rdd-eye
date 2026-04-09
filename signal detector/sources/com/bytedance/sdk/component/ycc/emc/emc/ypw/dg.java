package com.bytedance.sdk.component.ycc.emc.emc.ypw;

import com.bytedance.sdk.component.ycc.emc.dg.emc;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public abstract class dg<T extends com.bytedance.sdk.component.ycc.emc.dg.emc> {
    private String dg;
    private com.bytedance.sdk.component.ycc.emc.dg.ypw.emc emc;
    private Queue<String> xq;
    private Queue<T> ypw = new ConcurrentLinkedQueue();

    public dg(com.bytedance.sdk.component.ycc.emc.dg.ypw.emc emcVar, Queue<String> queue, String str) {
        this.emc = emcVar;
        this.xq = queue;
        this.dg = str;
    }

    public void emc(T t6) {
        Queue<T> queue = this.ypw;
        if (queue == null || t6 == null) {
            return;
        }
        queue.offer(t6);
    }

    public synchronized boolean ypw(int i, int i3) {
        int size = this.ypw.size();
        int iEmc = this.emc.emc();
        return (i == 2 || i == 1) ? com.bytedance.sdk.component.ycc.emc.xq.emc.xq() ? size > 0 : size >= iEmc : size >= iEmc;
    }

    public synchronized List<com.bytedance.sdk.component.ycc.emc.dg.emc> emc(int i, int i3) {
        if (!ypw(i, i3)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.emc.emc());
        do {
            T tPoll = this.ypw.poll();
            if (tPoll == null) {
                break;
            }
            arrayList.add(tPoll);
        } while (arrayList.size() != this.emc.ypw());
        return arrayList;
    }

    public synchronized void emc(int i, List<T> list) {
        if (i != -1 && i != 200 && i != 509) {
            this.ypw.addAll(list);
        } else {
            this.ypw.size();
        }
    }
}
