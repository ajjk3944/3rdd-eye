package com.bytedance.adsdk.ugeno.yu;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class le {
    public ouw ouw;
    public List<ouw> vt;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {
        public Map<String, String> fkw;

        /* renamed from: le, reason: collision with root package name */
        public Map<String, Object> f7009le;

        /* renamed from: lh, reason: collision with root package name */
        public String f7010lh = "global";
        public String ouw;
        public String vt;
        public String yu;

        public final String toString() {
            return "Action{scheme='" + this.f7010lh + "', name='" + this.yu + "', params=" + this.fkw + ", host='" + this.vt + "', origin='" + this.ouw + "', extra=" + this.f7009le + '}';
        }
    }

    public static le ouw(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        le leVar = new le();
        String strOptString = jSONObject.optString("on");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("handlers");
        leVar.ouw = ryl.ouw(strOptString, jSONObject2);
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
            ouw ouwVarOuw = ryl.ouw(jSONArrayOptJSONArray.optString(i4), jSONObject2);
            if (ouwVarOuw != null) {
                arrayList.add(ouwVarOuw);
            }
        }
        leVar.vt = arrayList;
        return leVar;
    }
}
