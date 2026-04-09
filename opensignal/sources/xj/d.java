package xj;

import java.util.ArrayList;
import java.util.Iterator;
import ni.a0;
import ni.s;
import ni.t;
import ni.u;
import ni.z;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25384a;

    /* renamed from: d, reason: collision with root package name */
    public final i f25385d;

    public d(i iVar, int i10) {
        this.f25384a = i10;
        switch (i10) {
            case 1:
                br.l.e(iVar, "httpHeadLatencyTestResultMapper");
                this.f25385d = iVar;
                break;
            case 2:
                this.f25385d = iVar;
                break;
            default:
                br.l.e(iVar, "flushConnectionInfoJobResultItemMapper");
                this.f25385d = iVar;
                break;
        }
    }

    @Override // xj.b, xj.h
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        switch (this.f25384a) {
            case 0:
                return h((s) obj);
            case 1:
                return i((u) obj);
            default:
                return j((z) obj);
        }
    }

    @Override // xj.b
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ JSONObject a(vj.c cVar) {
        switch (this.f25384a) {
            case 0:
                return h((s) cVar);
            case 1:
                return i((u) cVar);
            default:
                return j((z) cVar);
        }
    }

    public s d(JSONObject jSONObject) {
        br.l.e(jSONObject, "input");
        a aVarB = b.b(jSONObject);
        String strK = xu.d.K("CONNECTION_INFO_ITEMS", jSONObject);
        ArrayList arrayList = new ArrayList();
        if (strK != null) {
            JSONArray jSONArray = new JSONArray(strK);
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add((t) this.f25385d.g(new JSONObject(jSONArray.getString(i10))));
            }
        }
        return new s(aVarB.f25376a, aVarB.f25377b, aVarB.f25378c, aVarB.f25379d, aVarB.f25380e, aVarB.f25381f, arrayList);
    }

    public u e(JSONObject jSONObject) {
        ArrayList arrayList;
        br.l.e(jSONObject, "input");
        a aVarB = b.b(jSONObject);
        String strOptString = jSONObject.optString("http_head_latencies");
        if (strOptString == null || tt.l.D0(strOptString)) {
            arrayList = new ArrayList();
        } else {
            JSONArray jSONArray = new JSONArray(strOptString);
            arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                br.l.b(jSONObject2);
                arrayList.add((fh.g) this.f25385d.g(jSONObject2));
            }
        }
        ArrayList arrayList2 = arrayList;
        return new u(aVarB.f25376a, aVarB.f25377b, aVarB.f25378c, aVarB.f25379d, aVarB.f25380e, aVarB.f25381f, arrayList2);
    }

    public z f(JSONObject jSONObject) {
        br.l.e(jSONObject, "input");
        a aVarB = b.b(jSONObject);
        Integer numY = xu.d.y("JOB_RESULT_UNRELIABLE_LATENCY", jSONObject);
        Integer numY2 = xu.d.y("JOB_RESULT_MIN_MEDIAN_LATENCY", jSONObject);
        String strK = xu.d.K("JOB_RESULT_LATENCY_EVENTS", jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("JOB_RESULT_ITEMS");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
            br.l.b(jSONObject2);
            arrayList.add((a0) this.f25385d.g(jSONObject2));
        }
        return new z(aVarB.f25376a, aVarB.f25377b, aVarB.f25378c, aVarB.f25379d, aVarB.f25380e, aVarB.f25381f, numY, numY2, arrayList, strK);
    }

    @Override // xj.g
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        switch (this.f25384a) {
            case 0:
                return d((JSONObject) obj);
            case 1:
                return e((JSONObject) obj);
            default:
                return f((JSONObject) obj);
        }
    }

    public JSONObject h(s sVar) throws JSONException {
        br.l.e(sVar, "input");
        JSONObject jSONObjectA = super.a(sVar);
        JSONArray jSONArray = new JSONArray();
        Iterator it = sVar.f18127g.iterator();
        while (it.hasNext()) {
            jSONArray.put(((t) it.next()).h());
        }
        jSONObjectA.put("CONNECTION_INFO_ITEMS", jSONArray);
        return jSONObjectA;
    }

    public JSONObject i(u uVar) throws JSONException {
        br.l.e(uVar, "input");
        JSONObject jSONObjectA = super.a(uVar);
        JSONArray jSONArray = new JSONArray();
        Iterator it = uVar.f18200g.iterator();
        while (it.hasNext()) {
            jSONArray.put(this.f25385d.a((fh.g) it.next()));
        }
        jSONObjectA.put("http_head_latencies", jSONArray.toString());
        return jSONObjectA;
    }

    public JSONObject j(z zVar) throws JSONException {
        br.l.e(zVar, "input");
        JSONObject jSONObjectA = super.a(zVar);
        xu.d.Y(jSONObjectA, "JOB_RESULT_UNRELIABLE_LATENCY", zVar.f18321g);
        xu.d.Y(jSONObjectA, "JOB_RESULT_MIN_MEDIAN_LATENCY", zVar.f18322h);
        xu.d.Y(jSONObjectA, "JOB_RESULT_LATENCY_EVENTS", zVar.j);
        jSONObjectA.put("JOB_RESULT_ITEMS", z.j(zVar.f18323i));
        return jSONObjectA;
    }
}
