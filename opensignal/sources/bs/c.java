package bs;

import br.l;
import br.q;
import br.x;
import br.y;
import gt.o;
import ht.b0;
import ir.v;
import java.util.Map;
import rr.o0;

/* loaded from: classes.dex */
public class c implements sr.b, cs.i {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ v[] f2924e;

    /* renamed from: a, reason: collision with root package name */
    public final qs.c f2925a;

    /* renamed from: b, reason: collision with root package name */
    public final o0 f2926b;

    /* renamed from: c, reason: collision with root package name */
    public final gt.i f2927c;

    /* renamed from: d, reason: collision with root package name */
    public final hs.a f2928d;

    static {
        y yVar = x.f2918a;
        f2924e = new v[]{yVar.f(new q(yVar.b(c.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};
    }

    public c(cj.a aVar, xr.e eVar, qs.c cVar) {
        l.e(aVar, "c");
        ds.a aVar2 = (ds.a) aVar.f3974d;
        l.e(cVar, "fqName");
        this.f2925a = cVar;
        this.f2926b = eVar != null ? aVar2.j.a(eVar) : o0.f21696s;
        o oVar = aVar2.f7446a;
        ah.d dVar = new ah.d(aVar, 2, this);
        gt.l lVar = (gt.l) oVar;
        lVar.getClass();
        this.f2927c = new gt.i(lVar, dVar);
        this.f2928d = eVar != null ? (hs.a) mq.o.s0(eVar.b()) : null;
    }

    @Override // sr.b
    public final qs.c a() {
        return this.f2925a;
    }

    @Override // sr.b
    public Map b() {
        return mq.x.f16946a;
    }

    @Override // sr.b
    public final ht.x getType() {
        return (b0) io.sentry.config.a.Z(this.f2927c, f2924e[0]);
    }

    @Override // sr.b
    public final o0 h() {
        return this.f2926b;
    }
}
