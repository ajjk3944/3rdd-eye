package V0;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f3798a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3799b;

    public a(boolean z6) {
        this.f3799b = z6;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder sbA = AbstractC2984e.a(this.f3799b ? "WM.task-" : "androidx.work-");
        sbA.append(this.f3798a.incrementAndGet());
        return new Thread(runnable, sbA.toString());
    }
}
