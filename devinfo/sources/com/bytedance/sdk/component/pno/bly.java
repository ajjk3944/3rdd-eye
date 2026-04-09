package com.bytedance.sdk.component.pno;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class bly implements ThreadFactory {
    public static volatile boolean yu;
    private final AtomicInteger fkw = new AtomicInteger(1);

    /* renamed from: lh, reason: collision with root package name */
    protected int f7606lh;
    protected final ThreadGroup ouw;
    protected final String vt;

    public bly(int i4, String str) {
        this.f7606lh = i4;
        this.ouw = new ThreadGroup("csj_g_".concat(String.valueOf(str)));
        this.vt = "csj_".concat(String.valueOf(str));
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        if (yu) {
            return null;
        }
        Thread thread = new Thread(this.ouw, runnable, this.vt + this.fkw.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        int i4 = this.f7606lh;
        if (i4 > 10 || i4 <= 0) {
            this.f7606lh = 5;
        }
        thread.setPriority(this.f7606lh);
        return thread;
    }
}
