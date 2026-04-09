package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class q01 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f31964a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f31965b;

    public /* synthetic */ q01() {
        G3 g32 = new G3();
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2);
        kotlin.jvm.internal.l.e(executorServiceNewFixedThreadPool, "newFixedThreadPool(...)");
        this(g32, executorServiceNewFixedThreadPool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Runnable r9) {
        kotlin.jvm.internal.l.f(r9, "r");
        new Handler(Looper.getMainLooper()).post(r9);
    }

    public final Executor b() {
        return this.f31964a;
    }

    public final Executor a() {
        return this.f31965b;
    }

    public q01(Executor mainThreadExecutor, Executor backgroundExecutor) {
        kotlin.jvm.internal.l.f(mainThreadExecutor, "mainThreadExecutor");
        kotlin.jvm.internal.l.f(backgroundExecutor, "backgroundExecutor");
        this.f31964a = mainThreadExecutor;
        this.f31965b = backgroundExecutor;
    }
}
