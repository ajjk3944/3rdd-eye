package com.bytedance.sdk.openadsdk.ylm.ypw;

import android.text.TextUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc {
    private String emc;
    private List<C0189emc> xq;
    private List<C0189emc> ypw;

    /* renamed from: com.bytedance.sdk.openadsdk.ylm.ypw.emc$emc, reason: collision with other inner class name */
    public static class C0189emc {
        private String emc;
        private int xq;
        private String ypw;

        public boolean equals(Object obj) {
            String str;
            if (!(obj instanceof C0189emc)) {
                return super.equals(obj);
            }
            String str2 = this.emc;
            if (str2 != null) {
                C0189emc c0189emc = (C0189emc) obj;
                if (str2.equals(c0189emc.emc) && (str = this.ypw) != null && str.equals(c0189emc.ypw)) {
                    return true;
                }
            }
            return false;
        }

        public static C0189emc emc(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            C0189emc c0189emc = new C0189emc();
            c0189emc.emc = jSONObject.optString("url");
            c0189emc.ypw = jSONObject.optString("md5");
            c0189emc.xq = jSONObject.optInt(HandleInvocationsFromAdViewer.KEY_AD_TYPE);
            return c0189emc;
        }

        public String emc() {
            return this.emc;
        }
    }

    public void emc(String str) {
        this.emc = str;
    }

    public List<C0189emc> xq() {
        return this.xq;
    }

    public void ypw(List<C0189emc> list) {
        this.xq = list;
    }

    public void emc(List<C0189emc> list) {
        this.ypw = list;
    }

    public List<C0189emc> ypw() {
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
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    C0189emc c0189emcEmc = C0189emc.emc(jSONArrayOptJSONArray.optJSONObject(i10));
                    if (c0189emcEmc != null) {
                        if (c0189emcEmc.xq != 1) {
                            if (c0189emcEmc.xq == 2 && arrayList2.size() < 10) {
                                arrayList2.add(c0189emcEmc);
                            }
                        } else {
                            arrayList.add(c0189emcEmc);
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
