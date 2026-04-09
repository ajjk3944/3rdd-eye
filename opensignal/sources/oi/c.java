package oi;

import ai.g;
import br.l;
import ch.n;
import hk.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import mq.b0;
import mq.o;
import mq.p;
import ni.b1;
import ni.c1;
import ni.d1;
import ni.f;
import ni.g0;
import ni.g1;
import ni.h0;
import ni.h1;
import ni.i1;
import ni.o0;
import ni.q;
import ni.s;
import ni.s0;
import ni.t;
import ni.t0;
import ni.u;
import ni.u0;
import ni.v;
import ni.w;
import ni.w0;
import ni.x;
import ni.z;
import ni.z0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vc.e;
import xj.h;

/* loaded from: classes.dex */
public final class c implements h {
    public final h B;
    public final h D;
    public final h E;
    public final h F;
    public final h G;
    public final k H;
    public final h I;
    public final h J;
    public final h K;
    public final h L;
    public final h M;
    public final h N;
    public final h O;
    public final h P;
    public final h Q;
    public final h R;
    public final h S;
    public final h T;
    public final h U;
    public final g V;

    /* renamed from: a, reason: collision with root package name */
    public final h f19522a;

    /* renamed from: d, reason: collision with root package name */
    public final h f19523d;

    /* renamed from: g, reason: collision with root package name */
    public final h f19524g;

    /* renamed from: r, reason: collision with root package name */
    public final h f19525r;

    /* renamed from: x, reason: collision with root package name */
    public final h f19526x;

    /* renamed from: y, reason: collision with root package name */
    public final h f19527y;

    public c(g gVar, g gVar2, g gVar3, g gVar4, g gVar5, a aVar, g gVar6, a aVar2, g gVar7, h hVar, g gVar8, a aVar3, k kVar, g gVar9, h hVar2, h hVar3, h hVar4, h hVar5, g gVar10, h hVar6, h hVar7, h hVar8, g gVar11, g gVar12, g gVar13, g gVar14, g gVar15) {
        l.e(gVar, "speedResultMapper");
        l.e(gVar2, "downloadSpeedResultMapper");
        l.e(gVar3, "uploadSpeedResultMapper");
        l.e(gVar4, "latencySpeedResultMapper");
        l.e(gVar5, "videoSpeedResultMapper");
        l.e(aVar, "coreResultItemMapper");
        l.e(gVar6, "endCoreResultItemMapper");
        l.e(aVar2, "dailyResultMapper");
        l.e(gVar7, "udpResultMapper");
        l.e(hVar, "udpVerificationResultMapper");
        l.e(gVar8, "publicIpResultUploadMapper");
        l.e(aVar3, "deviceInstallationInfoMapper");
        l.e(gVar9, "tracerouteResultUploadMapper");
        l.e(hVar2, "throughputDownloadJobResultUploadMapper");
        l.e(hVar3, "throughputUploadResultUploadJobMapper");
        l.e(hVar4, "throughputServerResponseResultUploadJobMapper");
        l.e(hVar5, "schedulerInfoResultUploadMapper");
        l.e(gVar10, "flushConnectionInfoJobResultItemUploadMapper");
        l.e(hVar6, "icmpResultUploadMapper");
        l.e(hVar7, "icmpPingResultUploadMapper");
        l.e(hVar8, "icmpTracerouteResultUploadMapper");
        l.e(gVar11, "wifiScanJobResultItemUploadMapper");
        l.e(gVar12, "assistantResultUploadMapper");
        l.e(gVar13, "wifiInformationElementsJobResultUploadMapper");
        l.e(gVar14, "httpHeadLatencyJobResultUploadMapper");
        this.f19522a = gVar2;
        this.f19523d = gVar3;
        this.f19524g = gVar4;
        this.f19525r = gVar5;
        this.f19526x = aVar;
        this.f19527y = gVar6;
        this.B = aVar2;
        this.D = gVar7;
        this.E = hVar;
        this.F = gVar8;
        this.G = aVar3;
        this.H = kVar;
        this.I = gVar9;
        this.J = hVar2;
        this.K = hVar3;
        this.L = hVar4;
        this.M = hVar5;
        this.N = gVar10;
        this.O = hVar6;
        this.P = hVar7;
        this.Q = hVar8;
        this.R = gVar11;
        this.S = gVar12;
        this.T = gVar13;
        this.U = gVar14;
        this.V = gVar15;
    }

    @Override // xj.h
    public final Object a(Object obj) throws JSONException {
        List list = (List) obj;
        l.e(list, "input");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("installation", (JSONObject) this.G.a(this.H.i()));
            JSONArray jSONArray = new JSONArray();
            b(jSONArray, list);
            jSONObject.put("reports", jSONArray);
        } catch (Exception e4) {
            n.e("SendJobResultDataMapper", e4);
        }
        String string = jSONObject.toString();
        l.d(string, "toString(...)");
        return string;
    }

    public final void b(JSONArray jSONArray, List list) {
        int i10;
        StringBuilder sb2 = new StringBuilder("addReports() called with: input = ");
        ArrayList arrayList = new ArrayList(p.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((vj.c) it.next()).c());
        }
        sb2.append(arrayList);
        n.b("SendJobResultDataMapper", sb2.toString());
        StringBuilder sb3 = new StringBuilder("addReports() called with: input = ");
        ArrayList arrayList2 = new ArrayList(p.a0(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((vj.c) it2.next()).getClass());
        }
        sb3.append(arrayList2);
        n.b("SendJobResultDataMapper", sb3.toString());
        HashMap map = new HashMap();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            vj.c cVar = (vj.c) it3.next();
            ArrayList arrayList3 = (ArrayList) map.get(Long.valueOf(cVar.d()));
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
            }
            arrayList3.add(cVar);
            map.put(Long.valueOf(cVar.d()), arrayList3);
        }
        HashMap map2 = new HashMap();
        Set<Long> setKeySet = map.keySet();
        l.d(setKeySet, "<get-keys>(...)");
        for (Long l10 : setKeySet) {
            ArrayList<vj.c> arrayList4 = (ArrayList) map.get(l10);
            if (arrayList4 != null) {
                i10 = 0;
                for (vj.c cVar2 : arrayList4) {
                    int size = cVar2 instanceof f ? ((f) cVar2).f17811g.size() : cVar2 instanceof ni.p ? ((ni.p) cVar2).f18079g.size() : cVar2 instanceof s ? ((s) cVar2).f18127g.size() : cVar2 instanceof h1 ? ((h1) cVar2).f17897g.size() : 1;
                    if (size > i10) {
                        i10 = size;
                    }
                }
            } else {
                i10 = 0;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                HashMap map3 = new HashMap();
                ArrayList<vj.c> arrayList5 = (ArrayList) map.get(l10);
                if (arrayList5 != null) {
                    for (vj.c cVar3 : arrayList5) {
                        n.b("SendJobResultDataMapper", "Adding report for = " + cVar3.c());
                        n.b("SendJobResultDataMapper", "Adding report for = " + cVar3.getClass());
                        if (cVar3 instanceof f) {
                            cVar3 = (vj.c) ((f) cVar3).f17811g.get(i11);
                        } else if (cVar3 instanceof ni.p) {
                            cVar3 = (vj.c) ((ni.p) cVar3).f18079g.get(i11);
                        } else if (cVar3 instanceof s) {
                            cVar3 = (vj.c) ((s) cVar3).f18127g.get(i11);
                        } else if (cVar3 instanceof h1) {
                            cVar3 = (vj.c) ((h1) cVar3).f17897g.get(i11);
                        }
                        Map mapC = c(cVar3);
                        Objects.toString(mapC);
                        n.a();
                        map3.putAll(mapC);
                        map3.put("NAME", cVar3.e());
                        map3.put("TASK_ID", Long.valueOf(cVar3.d()));
                    }
                }
                if (map2.get(l10) == null) {
                    l.b(l10);
                    map2.put(l10, new ArrayList());
                }
                Set setKeySet2 = map3.keySet();
                l.d(setKeySet2, "<get-keys>(...)");
                List<String> listL0 = o.L0(o.Q0(setKeySet2));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (String str : listL0) {
                    e.F(linkedHashMap, str, map3.get(str));
                }
                b bVar = new b(linkedHashMap);
                ArrayList arrayList6 = (ArrayList) map2.get(l10);
                if (arrayList6 != null) {
                    arrayList6.add(bVar);
                }
            }
        }
        Iterator it4 = map2.keySet().iterator();
        while (it4.hasNext()) {
            ArrayList arrayList7 = (ArrayList) map2.get(Long.valueOf(((Number) it4.next()).longValue()));
            if (arrayList7 != null) {
                Iterator it5 = arrayList7.iterator();
                while (it5.hasNext()) {
                    jSONArray.put(new JSONObject(b0.W(((b) it5.next()).f19521a)));
                }
            }
        }
    }

    public final Map c(vj.c cVar) {
        l.e(cVar, "jobResult");
        if (cVar instanceof ni.g) {
            return (Map) this.f19526x.a(cVar);
        }
        if (cVar instanceof q) {
            return (Map) this.f19527y.a(cVar);
        }
        if (cVar instanceof ni.h) {
            return (Map) this.B.a(cVar);
        }
        if (cVar instanceof z0) {
            return (Map) this.D.a(cVar);
        }
        if (cVar instanceof b1) {
            return (Map) this.E.a(cVar);
        }
        if (cVar instanceof z) {
            return (Map) this.f19524g.a(cVar);
        }
        if (cVar instanceof ni.n) {
            return (Map) this.f19522a.a(cVar);
        }
        if (cVar instanceof c1) {
            return (Map) this.f19523d.a(cVar);
        }
        if (cVar instanceof d1) {
            return (Map) this.f19525r.a(cVar);
        }
        if (cVar instanceof g0) {
            return (Map) this.F.a(cVar);
        }
        if (cVar instanceof w0) {
            return (Map) this.I.a(cVar);
        }
        if (cVar instanceof s0) {
            return (Map) this.J.a(cVar);
        }
        if (cVar instanceof u0) {
            return (Map) this.K.a(cVar);
        }
        if (cVar instanceof t0) {
            return (Map) this.L.a(cVar);
        }
        if (cVar instanceof v) {
            return (Map) this.O.a(cVar);
        }
        if (cVar instanceof w) {
            return (Map) this.P.a(cVar);
        }
        if (cVar instanceof x) {
            return (Map) this.Q.a(cVar);
        }
        if (cVar instanceof h0) {
            return (Map) this.M.a(cVar);
        }
        if (cVar instanceof t) {
            return (Map) this.N.a(cVar);
        }
        if (cVar instanceof i1) {
            return (Map) this.R.a(cVar);
        }
        if (cVar instanceof ai.e) {
            return (Map) this.S.a(cVar);
        }
        if (cVar instanceof g1) {
            return (Map) this.T.a(cVar);
        }
        if (cVar instanceof u) {
            return (Map) this.U.a(cVar);
        }
        if (cVar instanceof o0) {
            return (Map) this.V.a(cVar);
        }
        n.g("SendJobResultDataMapper", "JobResult not mapped= " + cVar);
        return mq.x.f16946a;
    }
}
