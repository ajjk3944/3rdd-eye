package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class c implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f9199a;

    public static c a() {
        if (f9199a == null) {
            synchronized (c.class) {
                try {
                    if (f9199a == null) {
                        f9199a = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f9199a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.t().execute(runnable);
    }
}
