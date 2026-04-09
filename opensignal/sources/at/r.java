package at;

import br.x;
import br.y;
import ir.v;
import java.util.Collection;
import java.util.List;
import rr.m0;
import ur.k0;

/* loaded from: classes.dex */
public final class r extends o {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ v[] f2307e;

    /* renamed from: b, reason: collision with root package name */
    public final ft.i f2308b;

    /* renamed from: c, reason: collision with root package name */
    public final gt.i f2309c;

    /* renamed from: d, reason: collision with root package name */
    public final gt.i f2310d;

    static {
        y yVar = x.f2918a;
        f2307e = new v[]{yVar.f(new br.q(yVar.b(r.class), "functions", "getFunctions()Ljava/util/List;")), yVar.f(new br.q(yVar.b(r.class), "properties", "getProperties()Ljava/util/List;"))};
    }

    public r(gt.l lVar, ft.i iVar) {
        br.l.e(lVar, "storageManager");
        this.f2308b = iVar;
        rr.g gVar = rr.g.CLASS;
        this.f2309c = new gt.i(lVar, new q(this, 0));
        this.f2310d = new gt.i(lVar, new q(this, 1));
    }

    @Override // at.o, at.p
    public final Collection a(f fVar, ar.k kVar) {
        br.l.e(fVar, "kindFilter");
        v[] vVarArr = f2307e;
        return mq.o.E0((List) io.sentry.config.a.Z(this.f2309c, vVarArr[0]), (List) io.sentry.config.a.Z(this.f2310d, vVarArr[1]));
    }

    @Override // at.o, at.n
    public final Collection b(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        List list = (List) io.sentry.config.a.Z(this.f2310d, f2307e[1]);
        rt.f fVar = new rt.f();
        for (Object obj : list) {
            if (br.l.a(((m0) obj).getName(), gVar)) {
                fVar.add(obj);
            }
        }
        return fVar;
    }

    @Override // at.o, at.p
    public final rr.i c(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        return null;
    }

    @Override // at.o, at.n
    public final Collection f(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        List list = (List) io.sentry.config.a.Z(this.f2309c, f2307e[0]);
        rt.f fVar = new rt.f();
        for (Object obj : list) {
            if (br.l.a(((k0) obj).getName(), gVar)) {
                fVar.add(obj);
            }
        }
        return fVar;
    }
}
