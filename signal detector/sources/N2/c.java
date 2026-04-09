package n2;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f22319a;

    /* renamed from: b, reason: collision with root package name */
    public final long f22320b;

    /* renamed from: c, reason: collision with root package name */
    public final CountDownLatch f22321c = new CountDownLatch(1);

    /* renamed from: d, reason: collision with root package name */
    public boolean f22322d = false;

    public c(C2687b c2687b, long j6) {
        this.f22319a = new WeakReference(c2687b);
        this.f22320b = j6;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C2687b c2687b;
        WeakReference weakReference = this.f22319a;
        try {
            if (this.f22321c.await(this.f22320b, TimeUnit.MILLISECONDS) || (c2687b = (C2687b) weakReference.get()) == null) {
                return;
            }
            c2687b.c();
            this.f22322d = true;
        } catch (InterruptedException unused) {
            C2687b c2687b2 = (C2687b) weakReference.get();
            if (c2687b2 != null) {
                c2687b2.c();
                this.f22322d = true;
            }
        }
    }
}
