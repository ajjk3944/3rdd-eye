package com.bytedance.sdk.component.pno.lh;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu implements ThreadFactory {

    /* renamed from: lh, reason: collision with root package name */
    public static volatile boolean f7615lh;
    protected final ThreadGroup ouw;
    protected final String vt;
    private final AtomicInteger yu = new AtomicInteger(1);

    public yu(String str) {
        this.ouw = new ThreadGroup("pag_g_".concat(String.valueOf(str)));
        this.vt = ouw(str);
    }

    public static String ouw(String str) {
        return "pag_".concat(String.valueOf(str));
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        if (f7615lh) {
            return null;
        }
        Thread thread = new Thread(this.ouw, runnable, this.vt + "_" + this.yu.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
