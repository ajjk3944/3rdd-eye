package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class df implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10443a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f10444b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10445c;

    public df() {
        this.f10443a = 0;
        this.f10445c = Executors.defaultThreadFactory();
        this.f10444b = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f10443a) {
            case 0:
                Thread threadNewThread = ((ThreadFactory) this.f10445c).newThread(runnable);
                int andIncrement = this.f10444b.getAndIncrement();
                StringBuilder sb2 = new StringBuilder(String.valueOf(andIncrement).length() + 5);
                sb2.append("gads-");
                sb2.append(andIncrement);
                threadNewThread.setName(sb2.toString());
                return threadNewThread;
            default:
                int andIncrement2 = this.f10444b.getAndIncrement();
                int length = String.valueOf(andIncrement2).length();
                String str = (String) this.f10445c;
                StringBuilder sb3 = new StringBuilder(r5.c.f(12, length, str));
                sb3.append("AdWorker(");
                sb3.append(str);
                sb3.append(") #");
                sb3.append(andIncrement2);
                return new Thread(runnable, sb3.toString());
        }
    }

    public df(String str) {
        this.f10443a = 1;
        this.f10445c = str;
        this.f10444b = new AtomicInteger(1);
    }
}
