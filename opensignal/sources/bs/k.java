package bs;

import br.l;
import br.q;
import br.x;
import br.y;
import gt.o;
import ir.v;
import java.util.Map;
import or.n;

/* loaded from: classes.dex */
public final class k extends c {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ v[] f2944g;

    /* renamed from: f, reason: collision with root package name */
    public final gt.i f2945f;

    static {
        y yVar = x.f2918a;
        f2944g = new v[]{yVar.f(new q(yVar.b(k.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(xr.e eVar, cj.a aVar) {
        super(aVar, eVar, n.f19706t);
        l.e(eVar, "annotation");
        l.e(aVar, "c");
        o oVar = ((ds.a) aVar.f3974d).f7446a;
        as.x xVar = new as.x(7, this);
        gt.l lVar = (gt.l) oVar;
        lVar.getClass();
        this.f2945f = new gt.i(lVar, xVar);
    }

    @Override // bs.c, sr.b
    public final Map b() {
        return (Map) io.sentry.config.a.Z(this.f2945f, f2944g[0]);
    }
}
