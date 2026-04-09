package xl;

import hm.j;
import hm.p;
import hm.u;
import hm.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e implements u {

    /* renamed from: a, reason: collision with root package name */
    public final j f37274a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f37275b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f37276c;

    public e(g gVar) {
        this.f37276c = gVar;
        this.f37274a = new j(((p) gVar.f37281c.f25418d).f25200a.timeout());
    }

    @Override // hm.u
    public final void Q(hm.e eVar, long j) {
        if (this.f37275b) {
            throw new IllegalStateException("closed");
        }
        sl.f.a(eVar.f25174b, 0L, j);
        ((p) this.f37276c.f37281c.f25418d).Q(eVar, j);
    }

    @Override // hm.u, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f37275b) {
            return;
        }
        this.f37275b = true;
        j jVar = this.f37274a;
        y yVar = jVar.f25180e;
        jVar.f25180e = y.f25217d;
        yVar.a();
        yVar.b();
        this.f37276c.f37282d = 3;
    }

    @Override // hm.u, java.io.Flushable
    public final void flush() {
        if (this.f37275b) {
            return;
        }
        ((p) this.f37276c.f37281c.f25418d).flush();
    }

    @Override // hm.u
    public final y timeout() {
        return this.f37274a;
    }
}
