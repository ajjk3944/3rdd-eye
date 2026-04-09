package xj;

import java.util.ArrayList;
import java.util.Iterator;
import ni.h1;
import ni.i1;
import ni.p;
import ni.q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25382a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final b f25383d;

    public c(ai.f fVar) {
        br.l.e(fVar, "coreResultItemMapper");
        this.f25383d = fVar;
    }

    @Override // xj.b, xj.h
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        switch (this.f25382a) {
            case 0:
                return h((ni.f) obj);
            case 1:
                return i((p) obj);
            default:
                return j((h1) obj);
        }
    }

    @Override // xj.b
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ JSONObject a(vj.c cVar) {
        switch (this.f25382a) {
            case 0:
                return h((ni.f) cVar);
            case 1:
                return i((p) cVar);
            default:
                return j((h1) cVar);
        }
    }

    public ni.f d(JSONObject jSONObject) {
        br.l.e(jSONObject, "input");
        a aVarB = b.b(jSONObject);
        String strK = xu.d.K("CORE_RESULT_ITEMS", jSONObject);
        ArrayList arrayList = new ArrayList();
        b bVar = this.f25383d;
        if (strK != null) {
            JSONArray jSONArray = new JSONArray(strK);
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add((ni.g) bVar.g(new JSONObject(jSONArray.getString(i10))));
            }
        } else {
            arrayList.add((ni.g) bVar.g(jSONObject));
        }
        return new ni.f(aVarB.f25376a, aVarB.f25377b, aVarB.f25378c, aVarB.f25379d, aVarB.f25380e, aVarB.f25381f, arrayList);
    }

    public p e(JSONObject jSONObject) {
        br.l.e(jSONObject, "input");
        a aVarB = b.b(jSONObject);
        String strK = xu.d.K("END_CORE_RESULT_ITEMS", jSONObject);
        ArrayList arrayList = new ArrayList();
        b bVar = this.f25383d;
        if (strK != null) {
            JSONArray jSONArray = new JSONArray(strK);
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add((q) bVar.g(new JSONObject(jSONArray.getString(i10))));
            }
        } else {
            arrayList.add((q) bVar.g(jSONObject));
        }
        return new p(aVarB.f25376a, aVarB.f25377b, aVarB.f25378c, aVarB.f25379d, aVarB.f25380e, aVarB.f25381f, arrayList);
    }

    public h1 f(JSONObject jSONObject) {
        br.l.e(jSONObject, "input");
        a aVarB = b.b(jSONObject);
        String strK = xu.d.K("WIFI_RESULT_ITEMS", jSONObject);
        ArrayList arrayList = new ArrayList();
        if (strK != null) {
            JSONArray jSONArray = new JSONArray(strK);
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add((i1) this.f25383d.g(new JSONObject(jSONArray.getString(i10))));
            }
        }
        return new h1(aVarB.f25376a, aVarB.f25377b, aVarB.f25378c, aVarB.f25379d, aVarB.f25380e, aVarB.f25381f, arrayList);
    }

    @Override // xj.g
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        switch (this.f25382a) {
            case 0:
                return d((JSONObject) obj);
            case 1:
                return e((JSONObject) obj);
            default:
                return f((JSONObject) obj);
        }
    }

    public JSONObject h(ni.f fVar) throws JSONException {
        br.l.e(fVar, "input");
        JSONObject jSONObjectA = super.a(fVar);
        JSONArray jSONArray = new JSONArray();
        Iterator it = fVar.f17811g.iterator();
        while (it.hasNext()) {
            jSONArray.put(((ni.g) it.next()).h());
        }
        jSONObjectA.put("CORE_RESULT_ITEMS", jSONArray);
        return jSONObjectA;
    }

    public JSONObject i(p pVar) throws JSONException {
        br.l.e(pVar, "input");
        JSONObject jSONObjectA = super.a(pVar);
        JSONArray jSONArray = new JSONArray();
        Iterator it = pVar.f18079g.iterator();
        while (it.hasNext()) {
            jSONArray.put(((q) it.next()).h());
        }
        jSONObjectA.put("END_CORE_RESULT_ITEMS", jSONArray);
        return jSONObjectA;
    }

    public JSONObject j(h1 h1Var) throws JSONException {
        br.l.e(h1Var, "input");
        JSONObject jSONObjectA = super.a(h1Var);
        JSONArray jSONArray = new JSONArray();
        Iterator it = h1Var.f17897g.iterator();
        while (it.hasNext()) {
            jSONArray.put(((i1) it.next()).h());
        }
        jSONObjectA.put("WIFI_RESULT_ITEMS", jSONArray);
        return jSONObjectA;
    }

    public c(ai.f fVar, byte b2) {
        br.l.e(fVar, "endCoreResultItemMapper");
        this.f25383d = fVar;
    }

    public c(ai.f fVar, char c4) {
        br.l.e(fVar, "wifiScanResultItemMapper");
        this.f25383d = fVar;
    }
}
