package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class c implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f6820a;

    public static c a() {
        if (f6820a == null) {
            synchronized (c.class) {
                try {
                    if (f6820a == null) {
                        f6820a = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f6820a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.t().execute(runnable);
    }
}
