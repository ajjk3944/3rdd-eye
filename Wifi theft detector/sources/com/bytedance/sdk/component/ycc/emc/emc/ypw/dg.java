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

    public void emc(T t10) {
        Queue<T> queue = this.ypw;
        if (queue == null || t10 == null) {
            return;
        }
        queue.offer(t10);
    }

    public synchronized boolean ypw(int i10, int i11) {
        int size = this.ypw.size();
        int iEmc = this.emc.emc();
        return (i10 == 2 || i10 == 1) ? com.bytedance.sdk.component.ycc.emc.xq.emc.xq() ? size > 0 : size >= iEmc : size >= iEmc;
    }

    public synchronized List<com.bytedance.sdk.component.ycc.emc.dg.emc> emc(int i10, int i11) {
        if (!ypw(i10, i11)) {
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

    public synchronized void emc(int i10, List<T> list) {
        if (i10 != -1 && i10 != 200 && i10 != 509) {
            this.ypw.addAll(list);
        } else {
            this.ypw.size();
        }
    }
}
