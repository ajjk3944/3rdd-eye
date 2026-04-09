package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class c implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f6807a;

    public static c a() {
        if (f6807a == null) {
            synchronized (c.class) {
                try {
                    if (f6807a == null) {
                        f6807a = new c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f6807a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.t().execute(runnable);
    }
}
