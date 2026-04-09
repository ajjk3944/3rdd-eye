package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class f implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private static volatile f f6809a;

    public static f a() {
        if (f6809a == null) {
            synchronized (f.class) {
                try {
                    if (f6809a == null) {
                        f6809a = new f();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f6809a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.t().execute(runnable);
    }
}
