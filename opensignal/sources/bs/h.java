package bs;

import br.l;
import br.q;
import br.x;
import br.y;
import ir.v;
import java.util.Map;
import or.n;

/* loaded from: classes.dex */
public final class h extends c {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ v[] f2937g;

    /* renamed from: f, reason: collision with root package name */
    public final gt.i f2938f;

    static {
        y yVar = x.f2918a;
        f2937g = new v[]{yVar.f(new q(yVar.b(h.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(xr.e eVar, cj.a aVar) {
        super(aVar, eVar, n.f19699m);
        l.e(aVar, "c");
        gt.l lVar = (gt.l) ((ds.a) aVar.f3974d).f7446a;
        lVar.getClass();
        this.f2938f = new gt.i(lVar, g.f2936d);
    }

    @Override // bs.c, sr.b
    public final Map b() {
        return (Map) io.sentry.config.a.Z(this.f2938f, f2937g[0]);
    }
}
