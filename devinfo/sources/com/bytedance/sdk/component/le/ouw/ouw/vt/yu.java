package com.bytedance.sdk.component.le.ouw.ouw.vt;

import com.bytedance.sdk.component.le.ouw.yu.ouw;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class yu<T extends com.bytedance.sdk.component.le.ouw.yu.ouw> {

    /* renamed from: lh, reason: collision with root package name */
    private Queue<String> f7551lh;
    private com.bytedance.sdk.component.le.ouw.yu.vt.ouw ouw;
    private Queue<T> vt = new ConcurrentLinkedQueue();
    private String yu;

    public yu(com.bytedance.sdk.component.le.ouw.yu.vt.ouw ouwVar, Queue<String> queue, String str) {
        this.ouw = ouwVar;
        this.f7551lh = queue;
        this.yu = str;
    }

    public final void ouw(T t10) {
        Queue<T> queue = this.vt;
        if (queue == null || t10 == null) {
            return;
        }
        queue.offer(t10);
    }

    public final synchronized boolean vt(int i4) {
        int size = this.vt.size();
        int i10 = this.ouw.ouw;
        com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
        if (i4 != 2 && i4 != 1) {
            return size >= i10;
        }
        com.bytedance.sdk.component.le.ouw.lh.ouw.yu();
        return size >= i10;
    }

    public final synchronized List<com.bytedance.sdk.component.le.ouw.yu.ouw> ouw(int i4) {
        if (!vt(i4)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.ouw.ouw);
        do {
            T tPoll = this.vt.poll();
            if (tPoll == null) {
                break;
            }
            arrayList.add(tPoll);
        } while (arrayList.size() != this.ouw.vt);
        return arrayList;
    }

    public final synchronized void ouw(int i4, List<T> list) {
        if (i4 != -1 && i4 != 200 && i4 != 509) {
            this.vt.addAll(list);
        } else {
            this.vt.size();
            com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
        }
    }
}
