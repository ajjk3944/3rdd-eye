package o3;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: o3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C7064c extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f55263a;

    /* renamed from: b, reason: collision with root package name */
    private final long f55264b;

    /* renamed from: c, reason: collision with root package name */
    final CountDownLatch f55265c = new CountDownLatch(1);

    /* renamed from: d, reason: collision with root package name */
    boolean f55266d = false;

    public C7064c(C7062a c7062a, long j10) {
        this.f55263a = new WeakReference(c7062a);
        this.f55264b = j10;
        start();
    }

    private final void a() {
        C7062a c7062a = (C7062a) this.f55263a.get();
        if (c7062a != null) {
            c7062a.c();
            this.f55266d = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f55265c.await(this.f55264b, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
