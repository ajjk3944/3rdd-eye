package zh;

import androidx.lifecycle.o;
import java.util.concurrent.ThreadFactory;
import pb.l0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final q3.a f27402a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f27403b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public o f27404c;

    /* renamed from: d, reason: collision with root package name */
    public Thread f27405d;

    /* renamed from: e, reason: collision with root package name */
    public final ThreadFactory f27406e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f27407f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f27408g;

    public a(q3.a aVar, ThreadFactory threadFactory) {
        this.f27402a = aVar;
        this.f27406e = threadFactory;
    }

    public final void a() {
        Thread thread = this.f27405d;
        if (thread == null || !thread.isAlive()) {
            return;
        }
        this.f27405d.interrupt();
    }

    public final void b(o oVar) {
        synchronized (this.f27403b) {
            this.f27404c = oVar;
        }
    }

    public final void c() {
        Thread thread = this.f27405d;
        if (thread == null || !thread.isAlive() || this.f27405d.isInterrupted()) {
            Thread threadNewThread = this.f27406e.newThread(new l0(19, this));
            this.f27405d = threadNewThread;
            threadNewThread.setName("CONTINUOUS_NETWORK_DETECTOR_THREAD");
            this.f27405d.start();
        }
    }
}
