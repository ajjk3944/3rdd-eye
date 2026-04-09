package com.google.android.gms.measurement.internal;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.measurement.internal.w3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4984w3 extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private final Object f36841a;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue f36842b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f36843c = false;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ C4952s3 f36844d;

    public C4984w3(C4952s3 c4952s3, String str, BlockingQueue blockingQueue) {
        this.f36844d = c4952s3;
        AbstractC7901p.l(str);
        AbstractC7901p.l(blockingQueue);
        this.f36841a = new Object();
        this.f36842b = blockingQueue;
        setName(str);
    }

    private final void b(InterruptedException interruptedException) {
        this.f36844d.zzj().H().b(getName() + " was interrupted", interruptedException);
    }

    private final void c() {
        synchronized (this.f36844d.f36729i) {
            try {
                if (!this.f36843c) {
                    this.f36844d.f36730j.release();
                    this.f36844d.f36729i.notifyAll();
                    if (this == this.f36844d.f36723c) {
                        this.f36844d.f36723c = null;
                    } else if (this == this.f36844d.f36724d) {
                        this.f36844d.f36724d = null;
                    } else {
                        this.f36844d.zzj().C().a("Current scheduler thread is neither worker nor network");
                    }
                    this.f36843c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a() {
        synchronized (this.f36841a) {
            this.f36841a.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        boolean z10 = false;
        while (!z10) {
            try {
                this.f36844d.f36730j.acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                b(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C4960t3 c4960t3 = (C4960t3) this.f36842b.poll();
                if (c4960t3 != null) {
                    Process.setThreadPriority(c4960t3.f36738b ? threadPriority : 10);
                    c4960t3.run();
                } else {
                    synchronized (this.f36841a) {
                        if (this.f36842b.peek() == null && !this.f36844d.f36731k) {
                            try {
                                this.f36841a.wait(30000L);
                            } catch (InterruptedException e11) {
                                b(e11);
                            }
                        }
                    }
                    synchronized (this.f36844d.f36729i) {
                        if (this.f36842b.peek() == null) {
                            c();
                            c();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }
}
