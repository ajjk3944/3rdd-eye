package b8;

import java.util.ArrayDeque;
import t8.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f2072a;

    public c(int i4) {
        switch (i4) {
            case 1:
                char[] cArr = m.f34520a;
                this.f2072a = new ArrayDeque(0);
                break;
            default:
                this.f2072a = new ArrayDeque();
                break;
        }
    }

    public b a() {
        b bVar;
        synchronized (this.f2072a) {
            bVar = (b) this.f2072a.poll();
        }
        return bVar == null ? new b() : bVar;
    }

    public void b(b bVar) {
        synchronized (this.f2072a) {
            try {
                if (this.f2072a.size() < 10) {
                    this.f2072a.offer(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void c(w7.c cVar) {
        cVar.f36517b = null;
        cVar.f36518c = null;
        this.f2072a.offer(cVar);
    }
}
