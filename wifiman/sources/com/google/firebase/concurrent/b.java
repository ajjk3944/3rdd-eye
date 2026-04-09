package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
class b implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadFactory f38636e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicLong f38637a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    private final String f38638b;

    /* renamed from: c, reason: collision with root package name */
    private final int f38639c;

    /* renamed from: d, reason: collision with root package name */
    private final StrictMode.ThreadPolicy f38640d;

    b(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f38638b = str;
        this.f38639c = i10;
        this.f38640d = threadPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Runnable runnable) throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.f38639c);
        StrictMode.ThreadPolicy threadPolicy = this.f38640d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread threadNewThread = f38636e.newThread(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() throws SecurityException, IllegalArgumentException {
                this.f38634a.b(runnable);
            }
        });
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f38638b, Long.valueOf(this.f38637a.getAndIncrement())));
        return threadNewThread;
    }
}
