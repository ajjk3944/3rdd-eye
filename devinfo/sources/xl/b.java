package xl;

import hm.j;
import hm.p;
import hm.u;
import hm.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b implements u {

    /* renamed from: a, reason: collision with root package name */
    public final j f37267a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f37268b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f37269c;

    public b(g gVar) {
        this.f37269c = gVar;
        this.f37267a = new j(((p) gVar.f37281c.f25418d).f25200a.timeout());
    }

    @Override // hm.u
    public final void Q(hm.e eVar, long j) {
        if (this.f37268b) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return;
        }
        p pVar = (p) this.f37269c.f37281c.f25418d;
        if (pVar.f25202c) {
            throw new IllegalStateException("closed");
        }
        pVar.f25201b.G(j);
        pVar.c();
        pVar.writeUtf8("\r\n");
        pVar.Q(eVar, j);
        pVar.writeUtf8("\r\n");
    }

    @Override // hm.u, java.lang.AutoCloseable, java.nio.channels.Channel
    public final synchronized void close() {
        if (this.f37268b) {
            return;
        }
        this.f37268b = true;
        ((p) this.f37269c.f37281c.f25418d).writeUtf8("0\r\n\r\n");
        j jVar = this.f37267a;
        y yVar = jVar.f25180e;
        jVar.f25180e = y.f25217d;
        yVar.a();
        yVar.b();
        this.f37269c.f37282d = 3;
    }

    @Override // hm.u, java.io.Flushable
    public final synchronized void flush() {
        if (this.f37268b) {
            return;
        }
        ((p) this.f37269c.f37281c.f25418d).flush();
    }

    @Override // hm.u
    public final y timeout() {
        return this.f37267a;
    }
}
