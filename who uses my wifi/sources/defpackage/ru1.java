package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ru1 extends Thread {
    public final WeakReference f;
    public final long g;
    public final CountDownLatch h = new CountDownLatch(1);
    public boolean i = false;

    public ru1(k3 k3Var, long j) {
        this.f = new WeakReference(k3Var);
        this.g = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        k3 k3Var;
        WeakReference weakReference = this.f;
        try {
            if (this.h.await(this.g, TimeUnit.MILLISECONDS) || (k3Var = (k3) weakReference.get()) == null) {
                return;
            }
            k3Var.c();
            this.i = true;
        } catch (InterruptedException unused) {
            k3 k3Var2 = (k3) weakReference.get();
            if (k3Var2 != null) {
                k3Var2.c();
                this.i = true;
            }
        }
    }
}
