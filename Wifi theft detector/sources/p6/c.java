package p6;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p6.b;

/* loaded from: classes3.dex */
public class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    public final BlockingQueue f23898a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadPoolExecutor f23899b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f23900c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public b f23901d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f23898a = linkedBlockingQueue;
        this.f23899b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    @Override // p6.b.a
    public void a(b bVar) {
        this.f23901d = null;
        b();
    }

    public final void b() {
        b bVar = (b) this.f23900c.poll();
        this.f23901d = bVar;
        if (bVar != null) {
            bVar.b(this.f23899b);
        }
    }

    public void c(b bVar) {
        bVar.c(this);
        this.f23900c.add(bVar);
        if (this.f23901d == null) {
            b();
        }
    }
}
