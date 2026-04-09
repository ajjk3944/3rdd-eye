package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.mf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC1539mf implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15631a;

    /* renamed from: b, reason: collision with root package name */
    public final Serializable f15632b;

    public /* synthetic */ ThreadFactoryC1539mf(String str) {
        this.f15631a = 2;
        this.f15632b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.f15631a;
        Serializable serializable = this.f15632b;
        switch (i) {
            case 0:
                int andIncrement = ((AtomicInteger) serializable).getAndIncrement();
                return new Thread(runnable, A.f.i(andIncrement, "AdWorker(SCION_TASK_EXECUTOR) #", new StringBuilder(String.valueOf(andIncrement).length() + 31)));
            case 1:
                int andIncrement2 = ((AtomicInteger) serializable).getAndIncrement();
                return new Thread(runnable, A.f.i(andIncrement2, "AdWorker(NG) #", new StringBuilder(String.valueOf(andIncrement2).length() + 14)));
            default:
                String str = Vt.f12096a;
                return new Thread(runnable, (String) serializable);
        }
    }

    public ThreadFactoryC1539mf() {
        this.f15631a = 1;
        this.f15632b = new AtomicInteger(1);
    }

    public ThreadFactoryC1539mf(C1593nf c1593nf) {
        this.f15631a = 0;
        this.f15632b = new AtomicInteger(1);
    }
}
