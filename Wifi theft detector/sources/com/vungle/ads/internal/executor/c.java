package com.vungle.ads.internal.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c implements ThreadFactory {

    @NotNull
    private final AtomicInteger atomicInteger;

    @NotNull
    private final String name;
    private final ThreadFactory threadFactory;

    public c(@NotNull String name) {
        p.e(name, "name");
        this.name = name;
        this.threadFactory = Executors.defaultThreadFactory();
        this.atomicInteger = new AtomicInteger(0);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Override // java.util.concurrent.ThreadFactory
    @NotNull
    public Thread newThread(@NotNull Runnable r10) {
        p.e(r10, "r");
        Thread t10 = this.threadFactory.newThread(r10);
        t10.setName(this.name + "-th-" + this.atomicInteger.incrementAndGet());
        p.d(t10, "t");
        return t10;
    }
}
