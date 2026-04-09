package ft;

import com.google.android.gms.internal.measurement.e5;
import h7.h0;
import ht.b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import ls.q0;
import p.v2;
import rr.f0;
import rr.o0;
import rr.s0;
import rr.z;

/* loaded from: classes.dex */
public final class h extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9084d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i f9085g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, int i10) {
        super(0);
        this.f9084d = i10;
        this.f9085g = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Iterable, java.lang.Object] */
    @Override // ar.a
    public final Object c() {
        Object next;
        as.p pVar;
        s0 vVar;
        b0 b0VarX;
        ?? arrayList;
        int i10 = this.f9084d;
        int i11 = 1;
        i iVar = this.f9085g;
        switch (i10) {
            case 0:
                return rr.w.c(iVar);
            case 1:
                return mq.o.Q0(((dt.k) iVar.H.f810b).f7497e.n(iVar.R));
            case 2:
                ls.j jVar = iVar.f9086x;
                if ((jVar.f15801g & 4) != 4) {
                    return null;
                }
                rr.i iVarC = iVar.L().c(io.sentry.config.a.Y((ns.f) iVar.H.f811c, jVar.f15804y), zr.d.FROM_DESERIALIZATION);
                if (iVarC instanceof rr.f) {
                    return (rr.f) iVarC;
                }
                return null;
            case 3:
                al.b bVar = iVar.H;
                List list = iVar.f9086x.L;
                br.l.d(list, "classProto.constructorList");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (ns.e.f18538m.e(((ls.l) obj).f15822r).booleanValue()) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(mq.p.a0(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ls.l lVar = (ls.l) it.next();
                    dt.t tVar = (dt.t) bVar.f817i;
                    br.l.d(lVar, "it");
                    arrayList3.add(tVar.d(lVar, false));
                }
                return mq.o.E0(mq.o.E0(arrayList3, e5.J(iVar.R())), ((dt.k) bVar.f810b).f7504n.c(iVar));
            case 4:
                i iVar2 = this.f9085g;
                rr.g gVar = iVar2.G;
                if (!gVar.isSingleton()) {
                    List list2 = iVar2.f9086x.L;
                    br.l.d(list2, "classProto.constructorList");
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (!ns.e.f18538m.e(((ls.l) next).f15822r).booleanValue()) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    ls.l lVar2 = (ls.l) next;
                    if (lVar2 != null) {
                        return ((dt.t) iVar2.H.f817i).d(lVar2, true);
                    }
                    return null;
                }
                ts.c cVar = new ts.c(iVar2, null, sr.g.f22217a, true, rr.c.DECLARATION, o0.f21696s);
                List list3 = Collections.EMPTY_LIST;
                int i12 = ts.d.f22961a;
                if (gVar == rr.g.ENUM_CLASS || gVar.isSingleton()) {
                    pVar = rr.p.f21697a;
                    if (pVar == null) {
                        ts.d.a(49);
                        throw null;
                    }
                } else if (ts.d.q(iVar2)) {
                    pVar = rr.p.f21697a;
                    if (pVar == null) {
                        ts.d.a(51);
                        throw null;
                    }
                } else if (ts.d.k(iVar2)) {
                    pVar = rr.p.j;
                    if (pVar == null) {
                        ts.d.a(52);
                        throw null;
                    }
                } else {
                    pVar = rr.p.f21701e;
                    if (pVar == null) {
                        ts.d.a(53);
                        throw null;
                    }
                }
                cVar.J1(list3, pVar);
                cVar.D = iVar2.q();
                return cVar;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                z zVar = iVar.E;
                z zVar2 = z.SEALED;
                if (zVar == zVar2) {
                    List<Integer> list4 = iVar.f9086x.Q;
                    br.l.d(list4, "fqNames");
                    if (!list4.isEmpty()) {
                        ArrayList arrayList4 = new ArrayList();
                        for (Integer num : list4) {
                            al.b bVar2 = iVar.H;
                            dt.k kVar = (dt.k) bVar2.f810b;
                            ns.f fVar = (ns.f) bVar2.f811c;
                            br.l.d(num, "index");
                            rr.f fVarB = kVar.b(io.sentry.config.a.T(fVar, num.intValue()));
                            if (fVarB != null) {
                                arrayList4.add(fVarB);
                            }
                        }
                        return arrayList4;
                    }
                    if (zVar == zVar2) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        rr.l lVar3 = iVar.M;
                        if (lVar3 instanceof f0) {
                            ts.o.c(iVar, linkedHashSet, ((f0) lVar3).W(), false);
                        }
                        ts.o.c(iVar, linkedHashSet, iVar.z0(), true);
                        return mq.o.M0(linkedHashSet, new ts.i(i11));
                    }
                }
                return mq.w.f16945a;
            default:
                al.b bVar3 = iVar.H;
                if (!iVar.g() && !iVar.k()) {
                    return null;
                }
                ls.j jVar2 = iVar.f9086x;
                ns.f fVar2 = (ns.f) bVar3.f811c;
                h0 h0Var = (h0) bVar3.f813e;
                v2 v2Var = (v2) bVar3.f809a;
                br.l.e(jVar2, "<this>");
                br.l.e(fVar2, "nameResolver");
                if (jVar2.V.size() > 0) {
                    List<Integer> list5 = jVar2.V;
                    br.l.d(list5, "multiFieldValueClassUnderlyingNameList");
                    ArrayList arrayList5 = new ArrayList(mq.p.a0(list5, 10));
                    for (Integer num2 : list5) {
                        br.l.d(num2, "it");
                        arrayList5.add(io.sentry.config.a.Y(fVar2, num2.intValue()));
                    }
                    lq.l lVar4 = new lq.l(Integer.valueOf(jVar2.Y.size()), Integer.valueOf(jVar2.X.size()));
                    if (lVar4.equals(new lq.l(Integer.valueOf(arrayList5.size()), 0))) {
                        List<Integer> list6 = jVar2.Y;
                        br.l.d(list6, "multiFieldValueClassUnderlyingTypeIdList");
                        arrayList = new ArrayList(mq.p.a0(list6, 10));
                        for (Integer num3 : list6) {
                            br.l.d(num3, "it");
                            arrayList.add(h0Var.x(num3.intValue()));
                        }
                    } else {
                        if (!lVar4.equals(new lq.l(0, Integer.valueOf(arrayList5.size())))) {
                            throw new IllegalStateException(("class " + io.sentry.config.a.Y(fVar2, jVar2.f15803x) + " has illegal multi-field value class representation").toString());
                        }
                        arrayList = jVar2.X;
                    }
                    br.l.d(arrayList, "when (typeIdCount to typ…epresentation\")\n        }");
                    ArrayList arrayList6 = new ArrayList(mq.p.a0(arrayList, 10));
                    for (q0 q0Var : arrayList) {
                        br.l.e(q0Var, "p0");
                        arrayList6.add(v2Var.j(q0Var, true));
                    }
                    vVar = new rr.b0(mq.o.W0(arrayList5, arrayList6));
                } else if ((jVar2.f15801g & 8) == 8) {
                    qs.g gVarY = io.sentry.config.a.Y(fVar2, jVar2.S);
                    int i13 = jVar2.f15801g;
                    q0 q0VarX = (i13 & 16) == 16 ? jVar2.T : (i13 & 32) == 32 ? h0Var.x(jVar2.U) : null;
                    if ((q0VarX == null || (b0VarX = v2Var.j(q0VarX, true)) == null) && (b0VarX = iVar.X(gVarY)) == null) {
                        throw new IllegalStateException(("cannot determine underlying type for value class " + io.sentry.config.a.Y(fVar2, jVar2.f15803x) + " with property " + gVarY).toString());
                    }
                    vVar = new rr.v(gVarY, b0VarX);
                } else {
                    vVar = null;
                }
                if (vVar != null) {
                    return vVar;
                }
                if (iVar.f9087y.a(1, 5, 1)) {
                    return null;
                }
                ur.j jVarR = iVar.R();
                if (jVarR == null) {
                    throw new IllegalStateException(("Inline class has no primary constructor: " + iVar).toString());
                }
                List listY = jVarR.Y();
                br.l.d(listY, "constructor.valueParameters");
                qs.g name = ((ur.q0) mq.o.r0(listY)).getName();
                br.l.d(name, "constructor.valueParameters.first().name");
                b0 b0VarX2 = iVar.X(name);
                if (b0VarX2 != null) {
                    return new rr.v(name, b0VarX2);
                }
                throw new IllegalStateException(("Value class has no underlying property: " + iVar).toString());
        }
    }
}
