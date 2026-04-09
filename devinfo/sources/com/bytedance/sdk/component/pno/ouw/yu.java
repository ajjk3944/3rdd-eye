package com.bytedance.sdk.component.pno.ouw;

import com.bytedance.sdk.component.pno.ouw.lh;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu<T extends lh> {
    public BlockingQueue<T> vt = new LinkedBlockingQueue();
    public int ouw = 2;

    public final T ouw() {
        return this.vt.poll();
    }
}
