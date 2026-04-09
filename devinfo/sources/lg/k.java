package lg;

import java.util.ArrayList;
import java.util.List;
import jg.l;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k extends c implements aj.f {

    /* renamed from: c, reason: collision with root package name */
    public final List f28813c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final aj.g f28814d = new aj.g();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f28815e = new ArrayList();

    @Override // aj.f
    public final void a(aj.b bVar) {
        for (e eVar : this.f28813c) {
            if (eVar.a(bVar)) {
                eVar.f28810a = Math.max(bVar.f406a, 0L) + eVar.f28810a;
                this.f28815e.add(eVar.b(bVar));
                c(eVar, bVar.f406a);
                return;
            }
        }
    }

    @Override // lg.c
    public final void c(Object obj, long j) {
        this.f28806a += j;
        l lVar = this.f28807b;
        if (lVar != null) {
            bi.d.a(new k1.b(4, lVar, (e) obj), 0L);
        }
    }

    @Override // lg.c
    public final List d() throws InterruptedException {
        l lVar = this.f28807b;
        if (lVar != null) {
            bi.d.a(new b(lVar, 0), 0L);
        }
        if (this.f28813c.isEmpty()) {
            this.f28813c.add(new h());
            this.f28813c.add(new i());
            this.f28813c.add(new g());
            this.f28813c.add(new d());
            this.f28813c.add(new j());
            this.f28813c.add(new f());
        }
        this.f28815e.clear();
        aj.g gVar = this.f28814d;
        aj.b bVarA = gVar.a(com.liuzh.deviceinfo.utilities.c.f21249b);
        if (bVarA != null && !gVar.f421b) {
            gVar.d(bVarA, this);
        }
        b();
        return this.f28815e;
    }
}
