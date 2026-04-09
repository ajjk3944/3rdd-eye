package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    public int bly;

    /* renamed from: cf, reason: collision with root package name */
    public String f8251cf;
    public vpp fkw;

    /* renamed from: le, reason: collision with root package name */
    public ex f8252le;

    /* renamed from: lh, reason: collision with root package name */
    public String f8253lh;
    public String ouw;
    public vpp ryl;
    public zin tlj;
    public int vt;
    public List<vpp> yu = new ArrayList();
    public JSONObject ra = new JSONObject();
    public volatile boolean pno = false;

    public final JSONObject fkw() {
        try {
            JSONObject jSONObject = new JSONObject();
            zin zinVar = this.tlj;
            if (zinVar != null) {
                jSONObject.put("loop_config", zinVar.ouw());
            }
            ex exVar = this.f8252le;
            if (exVar != null) {
                jSONObject.put("multi_ad_config", exVar.vt());
            }
            List<vpp> list = this.yu;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i4 = 0; i4 < this.yu.size(); i4++) {
                    jSONArray.put(this.yu.get(i4).ouw(true));
                }
                jSONObject.put("creatives", jSONArray);
            }
            jSONObject.put("multi_ad_style", this.bly);
            jSONObject.put("request_id", this.ouw);
            return jSONObject;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.ouw("AdInfo", "toJsonObj: ", th2);
            return null;
        }
    }

    public final vpp lh() {
        if (this.yu.size() > 0) {
            return this.yu.get(0);
        }
        return null;
    }

    public final String ouw() {
        vpp vppVarLh = lh();
        return vppVarLh != null ? vppVarLh.ux() : "";
    }

    public final boolean vt() {
        List<vpp> list = this.yu;
        return list != null && list.size() > 0;
    }

    public final boolean yu() {
        return this.bly == 1;
    }

    public final void ouw(vpp vppVar) {
        this.yu.add(vppVar);
        if (this.ryl == null) {
            this.ryl = vppVar;
        }
    }

    public static Map<String, vpp> ouw(ouw ouwVar) {
        if (ouwVar == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (vpp vppVar : ouwVar.yu) {
            if (!TextUtils.isEmpty(vppVar.f8298ki)) {
                map.put(vppVar.f8298ki, vppVar);
            }
        }
        if (map.size() != 0) {
            return map;
        }
        return null;
    }

    public static ouw ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            ouw ouwVar = new ouw();
            ouwVar.tlj = zin.ouw(jSONObject.optJSONObject("loop_config"));
            ouwVar.bly = jSONObject.optInt("multi_ad_style", 0);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("creatives");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
                    vpp vppVarOuw = com.bytedance.sdk.openadsdk.core.vt.ouw(jSONArrayOptJSONArray.optJSONObject(i4), null, null, ouwVar, i4);
                    if (vppVarOuw != null) {
                        arrayList.add(vppVarOuw);
                    }
                }
                ouwVar.yu = arrayList;
                if (!arrayList.isEmpty()) {
                    ouwVar.ryl = (vpp) arrayList.get(0);
                }
            }
            ouwVar.ouw = jSONObject.optString("request_id", "");
            String strOptString = jSONObject.optString("multi_ad_config");
            if (!TextUtils.isEmpty(strOptString)) {
                ouwVar.f8252le = ex.ouw(strOptString);
            }
            return ouwVar;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.ouw("AdInfo", "fromJson: ", th2);
            return null;
        }
    }
}
