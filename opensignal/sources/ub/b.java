package ub;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class b extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f23515a;

    /* renamed from: d, reason: collision with root package name */
    public final long f23516d;

    /* renamed from: g, reason: collision with root package name */
    public final CountDownLatch f23517g = new CountDownLatch(1);

    /* renamed from: r, reason: collision with root package name */
    public boolean f23518r = false;

    public b(a aVar, long j) {
        this.f23515a = new WeakReference(aVar);
        this.f23516d = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        a aVar;
        WeakReference weakReference = this.f23515a;
        try {
            if (this.f23517g.await(this.f23516d, TimeUnit.MILLISECONDS) || (aVar = (a) weakReference.get()) == null) {
                return;
            }
            aVar.b();
            this.f23518r = true;
        } catch (InterruptedException unused) {
            a aVar2 = (a) weakReference.get();
            if (aVar2 != null) {
                aVar2.b();
                this.f23518r = true;
            }
        }
    }
}
