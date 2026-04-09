package com.bytedance.sdk.component.msw.emc;

import com.bytedance.sdk.component.msw.emc.xq;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public class dg<T extends xq> {
    private int emc;
    private BlockingQueue<T> ypw = new LinkedBlockingQueue();

    private dg(int i) {
        this.emc = i;
    }

    public static dg emc(int i) {
        return new dg(i);
    }

    public T emc() {
        return this.ypw.poll();
    }

    public boolean emc(T t6) {
        if (t6 == null) {
            return false;
        }
        t6.emc();
        if (this.ypw.size() >= this.emc) {
            return false;
        }
        return this.ypw.offer(t6);
    }
}
