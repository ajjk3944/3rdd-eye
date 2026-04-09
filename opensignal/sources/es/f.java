package es;

import com.google.android.gms.internal.measurement.b4;
import ht.d1;
import ht.p0;
import ht.y0;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import rr.o0;
import rr.r0;
import ur.q0;

/* loaded from: classes.dex */
public final class f implements sr.b, cs.i {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ir.v[] f8290h;

    /* renamed from: a, reason: collision with root package name */
    public final cj.a f8291a;

    /* renamed from: b, reason: collision with root package name */
    public final xr.e f8292b;

    /* renamed from: c, reason: collision with root package name */
    public final gt.h f8293c;

    /* renamed from: d, reason: collision with root package name */
    public final gt.i f8294d;

    /* renamed from: e, reason: collision with root package name */
    public final wr.f f8295e;

    /* renamed from: f, reason: collision with root package name */
    public final gt.i f8296f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8297g;

    static {
        br.y yVar = br.x.f2918a;
        f8290h = new ir.v[]{yVar.f(new br.q(yVar.b(f.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), yVar.f(new br.q(yVar.b(f.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), yVar.f(new br.q(yVar.b(f.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    public f(cj.a aVar, xr.e eVar, boolean z10) {
        br.l.e(aVar, "c");
        br.l.e(eVar, "javaAnnotation");
        this.f8291a = aVar;
        this.f8292b = eVar;
        ds.a aVar2 = (ds.a) aVar.f3974d;
        gt.o oVar = aVar2.f7446a;
        e eVar2 = new e(this, 1);
        gt.l lVar = (gt.l) oVar;
        lVar.getClass();
        this.f8293c = new gt.h(lVar, eVar2);
        e eVar3 = new e(this, 2);
        gt.l lVar2 = (gt.l) oVar;
        lVar2.getClass();
        this.f8294d = new gt.i(lVar2, eVar3);
        this.f8295e = aVar2.j.a(eVar);
        e eVar4 = new e(this, 0);
        gt.l lVar3 = (gt.l) oVar;
        lVar3.getClass();
        this.f8296f = new gt.i(lVar3, eVar4);
        this.f8297g = z10;
    }

    @Override // sr.b
    public final qs.c a() {
        ir.v vVar = f8290h[0];
        gt.h hVar = this.f8293c;
        br.l.e(hVar, "<this>");
        br.l.e(vVar, "p");
        return (qs.c) hVar.c();
    }

    @Override // sr.b
    public final Map b() {
        return (Map) io.sentry.config.a.Z(this.f8296f, f8290h[2]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final vs.g c(hs.a aVar) {
        ht.x xVarH;
        if (aVar instanceof xr.v) {
            return vs.h.b(((xr.v) aVar).f25516b, null);
        }
        if (aVar instanceof xr.t) {
            Enum r72 = ((xr.t) aVar).f25514b;
            Class<?> enclosingClass = r72.getClass();
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            br.l.d(enclosingClass, "enumClass");
            return new vs.i(xr.d.a(enclosingClass), qs.g.e(r72.name()));
        }
        boolean z10 = aVar instanceof xr.h;
        cj.a aVar2 = this.f8291a;
        if (z10) {
            xr.h hVar = (xr.h) aVar;
            qs.g gVar = hVar.f25503a;
            if (gVar == null) {
                gVar = as.a0.f2167b;
            }
            br.l.d(gVar, "argument.name ?: DEFAULT_ANNOTATION_MEMBER_NAME");
            ArrayList arrayListA = hVar.a();
            ht.b0 b0Var = (ht.b0) io.sentry.config.a.Z(this.f8294d, f8290h[1]);
            br.l.d(b0Var, "type");
            if (!ht.c.i(b0Var)) {
                rr.f fVarD = xs.d.d(this);
                br.l.b(fVarD);
                q0 q0VarW = kc.f.w(gVar, fVarD);
                if (q0VarW == null || (xVarH = q0VarW.getType()) == null) {
                    xVarH = ((ds.a) aVar2.f3974d).f7458o.n().h(d1.INVARIANT, kt.k.c(kt.j.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
                }
                ArrayList arrayList = new ArrayList(mq.p.a0(arrayListA, 10));
                Iterator it = arrayListA.iterator();
                while (it.hasNext()) {
                    vs.g gVarC = c((hs.a) it.next());
                    if (gVarC == null) {
                        gVarC = new vs.w(null);
                    }
                    arrayList.add(gVarC);
                }
                return new vs.z(arrayList, xVarH);
            }
        } else {
            if (aVar instanceof xr.g) {
                return new vs.a((Object) new f(aVar2, new xr.e(((xr.g) aVar).f25504b), false));
            }
            if (aVar instanceof xr.p) {
                Class cls = ((xr.p) aVar).f25510b;
                ht.x xVarU = ((bm.d) aVar2.f3978y).U(cls.isPrimitive() ? new xr.z(cls) : ((cls instanceof GenericArrayType) || cls.isArray()) ? new xr.i(cls) : cls instanceof WildcardType ? new xr.e0((WildcardType) cls) : new xr.q(cls), b4.f0(y0.COMMON, false, null, 7));
                if (!ht.c.i(xVarU)) {
                    ht.x xVarB = xVarU;
                    int i10 = 0;
                    while (or.h.y(xVarB)) {
                        xVarB = ((p0) mq.o.I0(xVarB.L())).b();
                        br.l.d(xVarB, "type.arguments.single().type");
                        i10++;
                    }
                    rr.i iVarP = xVarB.Z().p();
                    if (iVarP instanceof rr.f) {
                        qs.b bVarF = xs.d.f(iVarP);
                        return bVarF == null ? new vs.u(new vs.r(xVarU)) : new vs.u(bVarF, i10);
                    }
                    if (iVarP instanceof r0) {
                        return new vs.u(qs.b.j(or.n.f19686a.g()), 0);
                    }
                }
            }
        }
        return null;
    }

    @Override // sr.b
    public final ht.x getType() {
        return (ht.b0) io.sentry.config.a.Z(this.f8294d, f8290h[1]);
    }

    @Override // sr.b
    public final o0 h() {
        return this.f8295e;
    }

    public final String toString() {
        return ss.j.f22243c.x(this, null);
    }
}
