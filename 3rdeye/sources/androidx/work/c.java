package androidx.work;

import N7.G8;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Configuration.kt */
/* loaded from: classes.dex */
public final class c implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f16880a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f16881b;

    public c(boolean z10) {
        this.f16881b = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        kotlin.jvm.internal.l.f(runnable, "runnable");
        StringBuilder sbU = G8.u(this.f16881b ? "WM.task-" : "androidx.work-");
        sbU.append(this.f16880a.incrementAndGet());
        return new Thread(runnable, sbU.toString());
    }
}
