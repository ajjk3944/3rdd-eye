package xl;

import hm.j;
import hm.q;
import hm.w;
import hm.y;
import java.io.IOException;
import nk.k;
import rl.m;
import rl.n;
import rl.t;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a implements w {

    /* renamed from: a, reason: collision with root package name */
    public final n f37263a;

    /* renamed from: b, reason: collision with root package name */
    public final j f37264b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f37265c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f37266d;

    public a(g gVar, n nVar) {
        k.e(nVar, "url");
        this.f37266d = gVar;
        this.f37263a = nVar;
        this.f37264b = new j(((q) gVar.f37281c.f25417c).f25203a.timeout());
    }

    public final void c(m mVar) throws NumberFormatException {
        t tVar;
        rl.b bVar;
        k.e(mVar, "trailers");
        g gVar = this.f37266d;
        int i4 = gVar.f37282d;
        if (i4 == 6) {
            return;
        }
        if (i4 != 5) {
            throw new IllegalStateException("state: " + gVar.f37282d);
        }
        j jVar = this.f37264b;
        y yVar = jVar.f25180e;
        jVar.f25180e = y.f25217d;
        yVar.a();
        yVar.b();
        gVar.f37282d = 6;
        if (mVar.size() <= 0 || (tVar = gVar.f37279a) == null || (bVar = tVar.j) == null) {
            return;
        }
        wl.g.b(bVar, this.f37263a, mVar);
    }

    @Override // hm.w
    public long n(hm.e eVar, long j) throws NumberFormatException, IOException {
        g gVar = this.f37266d;
        k.e(eVar, "sink");
        try {
            return ((q) gVar.f37281c.f25417c).n(eVar, j);
        } catch (IOException e2) {
            gVar.f37280b.e();
            c(g.f37278f);
            throw e2;
        }
    }

    @Override // hm.w, hm.u
    public final y timeout() {
        return this.f37264b;
    }
}
