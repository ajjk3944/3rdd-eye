package f6;

import f6.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    public final BlockingQueue f21148a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadPoolExecutor f21149b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f21150c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public b f21151d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f21148a = linkedBlockingQueue;
        this.f21149b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    @Override // f6.b.a
    public void a(b bVar) {
        this.f21151d = null;
        b();
    }

    public final void b() {
        b bVar = (b) this.f21150c.poll();
        this.f21151d = bVar;
        if (bVar != null) {
            bVar.c(this.f21149b);
        }
    }

    public void c(b bVar) {
        bVar.a(this);
        this.f21150c.add(bVar);
        if (this.f21151d == null) {
            b();
        }
    }
}
