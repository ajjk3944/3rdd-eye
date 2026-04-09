package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public final class V6 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11951a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f11952b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11953c;

    public V6() {
        this.f11951a = 0;
        this.f11953c = Executors.defaultThreadFactory();
        this.f11952b = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f11951a) {
            case 0:
                Thread threadNewThread = ((ThreadFactory) this.f11953c).newThread(runnable);
                int andIncrement = this.f11952b.getAndIncrement();
                StringBuilder sb = new StringBuilder(String.valueOf(andIncrement).length() + 5);
                sb.append("gads-");
                sb.append(andIncrement);
                threadNewThread.setName(sb.toString());
                return threadNewThread;
            default:
                int andIncrement2 = this.f11952b.getAndIncrement();
                int length = String.valueOf(andIncrement2).length();
                String str = (String) this.f11953c;
                StringBuilder sb2 = new StringBuilder(AbstractC2763b.b(12, length, str));
                sb2.append("AdWorker(");
                sb2.append(str);
                sb2.append(") #");
                sb2.append(andIncrement2);
                return new Thread(runnable, sb2.toString());
        }
    }

    public V6(String str) {
        this.f11951a = 1;
        this.f11953c = str;
        this.f11952b = new AtomicInteger(1);
    }
}
