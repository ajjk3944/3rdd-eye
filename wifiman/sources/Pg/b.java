package Pg;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes4.dex */
public class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadFactory f18674a = Executors.defaultThreadFactory();

    /* renamed from: b, reason: collision with root package name */
    private final String f18675b;

    public b(String str) {
        this.f18675b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f18674a.newThread(runnable);
        threadNewThread.setName(this.f18675b + ' ' + threadNewThread.getName());
        return threadNewThread;
    }
}
