package ft;

import br.x;
import br.y;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ls.g0;
import ls.s0;
import mq.b0;

/* loaded from: classes.dex */
public final class o {
    public static final /* synthetic */ ir.v[] j;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f9093a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f9094b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f9095c;

    /* renamed from: d, reason: collision with root package name */
    public final gt.e f9096d;

    /* renamed from: e, reason: collision with root package name */
    public final gt.e f9097e;

    /* renamed from: f, reason: collision with root package name */
    public final gt.j f9098f;

    /* renamed from: g, reason: collision with root package name */
    public final gt.i f9099g;

    /* renamed from: h, reason: collision with root package name */
    public final gt.i f9100h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q f9101i;

    static {
        y yVar = x.f2918a;
        j = new ir.v[]{yVar.f(new br.q(yVar.b(o.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), yVar.f(new br.q(yVar.b(o.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};
    }

    public o(q qVar, List list, List list2, List list3) {
        br.l.e(list, "functionList");
        br.l.e(list2, "propertyList");
        br.l.e(list3, "typeAliasList");
        this.f9101i = qVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            qs.g gVarY = io.sentry.config.a.Y((ns.f) qVar.f9105b.f811c, ((ls.y) ((rs.b) obj)).f15919y);
            Object arrayList = linkedHashMap.get(gVarY);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(gVarY, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f9093a = c(linkedHashMap);
        q qVar2 = this.f9101i;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : list2) {
            qs.g gVarY2 = io.sentry.config.a.Y((ns.f) qVar2.f9105b.f811c, ((g0) ((rs.b) obj2)).f15785y);
            Object arrayList2 = linkedHashMap2.get(gVarY2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap2.put(gVarY2, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        this.f9094b = c(linkedHashMap2);
        ((dt.k) this.f9101i.f9105b.f810b).f7495c.getClass();
        q qVar3 = this.f9101i;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj3 : list3) {
            qs.g gVarY3 = io.sentry.config.a.Y((ns.f) qVar3.f9105b.f811c, ((s0) ((rs.b) obj3)).f15877x);
            Object arrayList3 = linkedHashMap3.get(gVarY3);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap3.put(gVarY3, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        this.f9095c = c(linkedHashMap3);
        this.f9096d = ((dt.k) this.f9101i.f9105b.f810b).f7493a.b(new n(this, 0));
        this.f9097e = ((dt.k) this.f9101i.f9105b.f810b).f7493a.b(new n(this, 1));
        this.f9098f = ((dt.k) this.f9101i.f9105b.f810b).f7493a.c(new n(this, 2));
        q qVar4 = this.f9101i;
        gt.l lVar = ((dt.k) qVar4.f9105b.f810b).f7493a;
        m mVar = new m(this, qVar4, 0);
        lVar.getClass();
        this.f9099g = new gt.i(lVar, mVar);
        q qVar5 = this.f9101i;
        gt.l lVar2 = ((dt.k) qVar5.f9105b.f810b).f7493a;
        m mVar2 = new m(this, qVar5, 1);
        lVar2.getClass();
        this.f9100h = new gt.i(lVar2, mVar2);
    }

    public static LinkedHashMap c(LinkedHashMap linkedHashMap) throws IOException {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(b0.P(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable<rs.b> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(mq.p.a0(iterable, 10));
            for (rs.b bVar : iterable) {
                int iC = bVar.c();
                int iP = b5.m.p(iC) + iC;
                if (iP > 4096) {
                    iP = 4096;
                }
                b5.m mVarZ = b5.m.z(byteArrayOutputStream, iP);
                mVarZ.V(iC);
                bVar.f(mVarZ);
                mVarZ.x();
                arrayList.add(lq.b0.f15562a);
            }
            linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap2;
    }

    public final Collection a(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        return !((Set) io.sentry.config.a.Z(this.f9099g, j[0])).contains(gVar) ? mq.w.f16945a : (Collection) this.f9096d.a(gVar);
    }

    public final Collection b(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        return !((Set) io.sentry.config.a.Z(this.f9100h, j[1])).contains(gVar) ? mq.w.f16945a : (Collection) this.f9097e.a(gVar);
    }
}
