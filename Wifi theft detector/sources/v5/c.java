package v5;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v5.b;

/* loaded from: classes3.dex */
public class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    public final BlockingQueue f24737a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadPoolExecutor f24738b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f24739c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public b f24740d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f24737a = linkedBlockingQueue;
        this.f24738b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    @Override // v5.b.a
    public void a(b bVar) {
        this.f24740d = null;
        b();
    }

    public final void b() {
        b bVar = (b) this.f24739c.poll();
        this.f24740d = bVar;
        if (bVar != null) {
            bVar.b(this.f24738b);
        }
    }

    public void c(b bVar) {
        bVar.c(this);
        this.f24739c.add(bVar);
        if (this.f24740d == null) {
            b();
        }
    }
}
