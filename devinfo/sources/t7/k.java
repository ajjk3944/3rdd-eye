package t7;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34465a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f34466b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f34467c;

    public k(String str) {
        this.f34465a = 1;
        this.f34467c = str;
        this.f34466b = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f34465a) {
            case 0:
                Thread threadNewThread = ((ThreadFactory) this.f34467c).newThread(runnable);
                threadNewThread.setName("PlayBillingLibrary-" + this.f34466b.getAndIncrement());
                return threadNewThread;
            default:
                int andIncrement = this.f34466b.getAndIncrement();
                int length = String.valueOf(andIncrement).length();
                String str = (String) this.f34467c;
                StringBuilder sb2 = new StringBuilder(r5.c.f(12, length, str));
                sb2.append("AdWorker(");
                sb2.append(str);
                sb2.append(") #");
                sb2.append(andIncrement);
                return new Thread(runnable, sb2.toString());
        }
    }

    public k(a aVar) {
        this.f34465a = 0;
        this.f34467c = Executors.defaultThreadFactory();
        this.f34466b = new AtomicInteger(1);
    }
}
