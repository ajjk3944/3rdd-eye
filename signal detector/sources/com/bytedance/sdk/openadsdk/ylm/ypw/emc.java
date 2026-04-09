package com.bytedance.sdk.openadsdk.ylm.ypw;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc {
    private String emc;
    private List<C0104emc> xq;
    private List<C0104emc> ypw;

    /* renamed from: com.bytedance.sdk.openadsdk.ylm.ypw.emc$emc, reason: collision with other inner class name */
    public static class C0104emc {
        private String emc;
        private int xq;
        private String ypw;

        public boolean equals(Object obj) {
            String str;
            if (!(obj instanceof C0104emc)) {
                return super.equals(obj);
            }
            String str2 = this.emc;
            if (str2 != null) {
                C0104emc c0104emc = (C0104emc) obj;
                if (str2.equals(c0104emc.emc) && (str = this.ypw) != null && str.equals(c0104emc.ypw)) {
                    return true;
                }
            }
            return false;
        }

        public static C0104emc emc(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            C0104emc c0104emc = new C0104emc();
            c0104emc.emc = jSONObject.optString("url");
            c0104emc.ypw = jSONObject.optString("md5");
            c0104emc.xq = jSONObject.optInt("type");
            return c0104emc;
        }

        public String emc() {
            return this.emc;
        }
    }

    public void emc(String str) {
        this.emc = str;
    }

    public List<C0104emc> xq() {
        return this.xq;
    }

    public void ypw(List<C0104emc> list) {
        this.xq = list;
    }

    public void emc(List<C0104emc> list) {
        this.ypw = list;
    }

    public List<C0104emc> ypw() {
        return this.ypw;
    }

    public static emc ypw(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            emc emcVar = new emc();
            emcVar.emc(jSONObject.optString("version"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    C0104emc c0104emcEmc = C0104emc.emc(jSONArrayOptJSONArray.optJSONObject(i));
                    if (c0104emcEmc != null) {
                        if (c0104emcEmc.xq != 1) {
                            if (c0104emcEmc.xq == 2 && arrayList2.size() < 10) {
                                arrayList2.add(c0104emcEmc);
                            }
                        } else {
                            arrayList.add(c0104emcEmc);
                        }
                    }
                }
            }
            emcVar.emc(arrayList);
            emcVar.ypw(arrayList2);
            return emcVar;
        } catch (JSONException unused) {
            return null;
        }
    }

    public String emc() {
        return this.emc;
    }
}
