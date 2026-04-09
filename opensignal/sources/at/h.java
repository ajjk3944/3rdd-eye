package at;

import br.x;
import br.y;
import ir.v;
import java.util.Collection;
import java.util.List;
import mq.w;
import rr.m0;
import ur.k0;

/* loaded from: classes.dex */
public abstract class h extends o {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ v[] f2291d;

    /* renamed from: b, reason: collision with root package name */
    public final ur.b f2292b;

    /* renamed from: c, reason: collision with root package name */
    public final gt.i f2293c;

    static {
        y yVar = x.f2918a;
        f2291d = new v[]{yVar.f(new br.q(yVar.b(h.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};
    }

    public h(gt.l lVar, ur.b bVar) {
        this.f2292b = bVar;
        this.f2293c = new gt.i(lVar, new as.x(1, this));
    }

    @Override // at.o, at.p
    public final Collection a(f fVar, ar.k kVar) {
        br.l.e(fVar, "kindFilter");
        if (!fVar.a(f.f2281n.f2288b)) {
            return w.f16945a;
        }
        return (List) io.sentry.config.a.Z(this.f2293c, f2291d[0]);
    }

    @Override // at.o, at.n
    public final Collection b(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        List list = (List) io.sentry.config.a.Z(this.f2293c, f2291d[0]);
        rt.f fVar = new rt.f();
        for (Object obj : list) {
            if ((obj instanceof m0) && br.l.a(((m0) obj).getName(), gVar)) {
                fVar.add(obj);
            }
        }
        return fVar;
    }

    @Override // at.o, at.n
    public final Collection f(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        List list = (List) io.sentry.config.a.Z(this.f2293c, f2291d[0]);
        rt.f fVar = new rt.f();
        for (Object obj : list) {
            if ((obj instanceof k0) && br.l.a(((k0) obj).getName(), gVar)) {
                fVar.add(obj);
            }
        }
        return fVar;
    }

    public abstract List h();
}
