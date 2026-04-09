package t6;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f34324a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f34325b;

    public c(boolean z3) {
        this.f34325b = z3;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        nk.k.e(runnable, "runnable");
        StringBuilder sbZ = d.h.z(this.f34325b ? "WM.task-" : "androidx.work-");
        sbZ.append(this.f34324a.incrementAndGet());
        return new Thread(runnable, sbZ.toString());
    }
}
