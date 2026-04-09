package com.bytedance.sdk.component.msw.emc;

import com.bytedance.sdk.component.msw.emc.xq;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public class dg<T extends xq> {
    private int emc;
    private BlockingQueue<T> ypw = new LinkedBlockingQueue();

    private dg(int i10) {
        this.emc = i10;
    }

    public static dg emc(int i10) {
        return new dg(i10);
    }

    public T emc() {
        return this.ypw.poll();
    }

    public boolean emc(T t10) {
        if (t10 == null) {
            return false;
        }
        t10.emc();
        if (this.ypw.size() >= this.emc) {
            return false;
        }
        return this.ypw.offer(t10);
    }
}
