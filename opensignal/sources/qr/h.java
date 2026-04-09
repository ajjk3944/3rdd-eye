package qr;

import br.x;
import br.y;
import ir.v;
import java.util.Collection;
import ur.a0;

/* loaded from: classes.dex */
public final class h implements tr.c {

    /* renamed from: d, reason: collision with root package name */
    public static final e f20983d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ v[] f20984e;

    /* renamed from: f, reason: collision with root package name */
    public static final qs.c f20985f;

    /* renamed from: g, reason: collision with root package name */
    public static final qs.g f20986g;

    /* renamed from: h, reason: collision with root package name */
    public static final qs.b f20987h;

    /* renamed from: a, reason: collision with root package name */
    public final a0 f20988a;

    /* renamed from: b, reason: collision with root package name */
    public final ar.k f20989b = f.f20978g;

    /* renamed from: c, reason: collision with root package name */
    public final gt.i f20990c;

    static {
        y yVar = x.f2918a;
        f20984e = new v[]{yVar.f(new br.q(yVar.b(h.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
        f20983d = new e();
        f20985f = or.o.j;
        qs.e eVar = or.n.f19690c;
        qs.g gVarF = eVar.f();
        br.l.d(gVarF, "cloneable.shortName()");
        f20986g = gVarF;
        f20987h = qs.b.j(eVar.g());
    }

    public h(gt.l lVar, a0 a0Var) {
        this.f20988a = a0Var;
        this.f20990c = new gt.i(lVar, new g(this, 0, lVar));
    }

    @Override // tr.c
    public final boolean a(qs.c cVar, qs.g gVar) {
        br.l.e(cVar, "packageFqName");
        br.l.e(gVar, "name");
        return gVar.equals(f20986g) && cVar.equals(f20985f);
    }

    @Override // tr.c
    public final rr.f b(qs.b bVar) {
        br.l.e(bVar, "classId");
        if (!bVar.equals(f20987h)) {
            return null;
        }
        return (ur.l) io.sentry.config.a.Z(this.f20990c, f20984e[0]);
    }

    @Override // tr.c
    public final Collection c(qs.c cVar) {
        br.l.e(cVar, "packageFqName");
        if (!cVar.equals(f20985f)) {
            return mq.y.f16947a;
        }
        return i3.g.H((ur.l) io.sentry.config.a.Z(this.f20990c, f20984e[0]));
    }
}
