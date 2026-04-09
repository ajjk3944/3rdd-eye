package hc;

import cf.k;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final String f10618a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadFactory f10619b = Executors.defaultThreadFactory();

    public a(String str) {
        this.f10618a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f10619b.newThread(new k(runnable, 1));
        threadNewThread.setName(this.f10618a);
        return threadNewThread;
    }
}
