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
public final class j extends c {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ v[] f2942g;

    /* renamed from: f, reason: collision with root package name */
    public final gt.i f2943f;

    static {
        y yVar = x.f2918a;
        f2942g = new v[]{yVar.f(new q(yVar.b(j.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(xr.e eVar, cj.a aVar) {
        super(aVar, eVar, n.f19709w);
        l.e(eVar, "annotation");
        l.e(aVar, "c");
        o oVar = ((ds.a) aVar.f3974d).f7446a;
        as.x xVar = new as.x(6, this);
        gt.l lVar = (gt.l) oVar;
        lVar.getClass();
        this.f2943f = new gt.i(lVar, xVar);
    }

    @Override // bs.c, sr.b
    public final Map b() {
        return (Map) io.sentry.config.a.Z(this.f2943f, f2942g[0]);
    }
}
