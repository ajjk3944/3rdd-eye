package com.bytedance.sdk.component.vt.ouw.ouw.ouw;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class le extends com.bytedance.sdk.component.vt.ouw.yu {
    ExecutorService ouw;
    List<com.bytedance.sdk.component.vt.ouw.vt> vt = new CopyOnWriteArrayList();

    /* renamed from: lh, reason: collision with root package name */
    private List<com.bytedance.sdk.component.vt.ouw.vt> f7653lh = new CopyOnWriteArrayList();
    private AtomicInteger yu = new AtomicInteger(64);

    public le() {
        if (this.ouw == null) {
            this.ouw = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 20L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.bytedance.sdk.component.vt.ouw.ouw.ouw.le.1
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable, "systemHttp Dispatcher");
                    thread.setDaemon(false);
                    thread.setPriority(10);
                    return thread;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.vt.ouw.yu
    public final List<com.bytedance.sdk.component.vt.ouw.vt> fkw() {
        return this.f7653lh;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.yu
    public final ExecutorService lh() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.yu
    public final void ouw() {
        this.yu.set(32);
    }

    @Override // com.bytedance.sdk.component.vt.ouw.yu
    public final int vt() {
        return this.yu.get();
    }

    @Override // com.bytedance.sdk.component.vt.ouw.yu
    public final List<com.bytedance.sdk.component.vt.ouw.vt> yu() {
        return this.vt;
    }
}
