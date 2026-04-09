package sl;

import hm.w;
import hm.y;
import nk.k;
import rl.c0;
import rl.p;
import u6.t;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends c0 implements w {

    /* renamed from: c, reason: collision with root package name */
    public final p f33829c;

    /* renamed from: d, reason: collision with root package name */
    public final long f33830d;

    public d(p pVar, long j) {
        this.f33829c = pVar;
        this.f33830d = j;
    }

    @Override // rl.c0
    public final long e() {
        return this.f33830d;
    }

    @Override // rl.c0
    public final p g() {
        return this.f33829c;
    }

    @Override // rl.c0
    public final hm.g m() {
        return t.d(this);
    }

    @Override // hm.w
    public final long n(hm.e eVar, long j) {
        k.e(eVar, "sink");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // hm.w, hm.u
    public final y timeout() {
        return y.f25217d;
    }

    @Override // rl.c0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
