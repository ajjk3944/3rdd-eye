package com.vungle.ads.internal.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.l;

/* compiled from: NamedThreadFactory.kt */
/* loaded from: classes2.dex */
public final class c implements ThreadFactory {
    private final AtomicInteger atomicInteger;
    private final String name;
    private final ThreadFactory threadFactory;

    public c(String name) {
        l.f(name, "name");
        this.name = name;
        this.threadFactory = Executors.defaultThreadFactory();
        this.atomicInteger = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable r9) {
        l.f(r9, "r");
        Thread threadNewThread = this.threadFactory.newThread(r9);
        threadNewThread.setName(this.name + "-th-" + this.atomicInteger.incrementAndGet());
        return threadNewThread;
    }
}
