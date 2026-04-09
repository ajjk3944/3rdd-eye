package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class cw implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10230a;

    /* renamed from: b, reason: collision with root package name */
    public final Serializable f10231b;

    public /* synthetic */ cw(String str) {
        this.f10230a = 2;
        this.f10231b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i4 = this.f10230a;
        Serializable serializable = this.f10231b;
        switch (i4) {
            case 0:
                int andIncrement = ((AtomicInteger) serializable).getAndIncrement();
                return new Thread(runnable, d.h.q(andIncrement, "AdWorker(SCION_TASK_EXECUTOR) #", new StringBuilder(String.valueOf(andIncrement).length() + 31)));
            case 1:
                int andIncrement2 = ((AtomicInteger) serializable).getAndIncrement();
                return new Thread(runnable, d.h.q(andIncrement2, "AdWorker(NG) #", new StringBuilder(String.valueOf(andIncrement2).length() + 14)));
            default:
                String str = bq0.f9768a;
                return new Thread(runnable, (String) serializable);
        }
    }

    public cw() {
        this.f10230a = 1;
        this.f10231b = new AtomicInteger(1);
    }

    public cw(dw dwVar) {
        this.f10230a = 0;
        this.f10231b = new AtomicInteger(1);
    }
}
