package com.bytedance.adsdk.ugeno.core;

import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import d.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ra {
    private JSONObject bly;
    private JSONObject fkw;

    /* renamed from: le, reason: collision with root package name */
    private JSONObject f6855le;

    /* renamed from: lh, reason: collision with root package name */
    float f6856lh;
    String ouw;
    private String pno;
    private JSONObject ra;
    boolean vt;
    float yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {
        boolean bly;
        LinkedList<ouw> fkw;

        /* renamed from: le, reason: collision with root package name */
        ouw f6857le;

        /* renamed from: lh, reason: collision with root package name */
        JSONObject f6858lh;
        String ouw;
        String pno;
        public String ra;
        boolean tlj;
        String vt;
        JSONObject yu;

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UGNode{id='");
            sb2.append(this.ouw);
            sb2.append("', name='");
            return h.w(sb2, this.vt, "'}");
        }
    }

    public ra(JSONObject jSONObject, JSONObject jSONObject2) {
        this(jSONObject, jSONObject2, null);
    }

    private ouw ouw(JSONObject jSONObject, ouw ouwVar) throws JSONException {
        ouw ouwVarOuw;
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.has("type") ? jSONObject.optString("type") : jSONObject.optString("name");
        String strOptString2 = jSONObject.optString(FacebookMediationAdapter.KEY_ID);
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.equals(next, "children")) {
                try {
                    jSONObject3.put(next, jSONObject.opt(next));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
        ouw ouwVar2 = new ouw();
        ouwVar2.ouw = strOptString2;
        if (this.vt && TextUtils.equals("Video", strOptString)) {
            ouwVar2.vt = h.s(strOptString, "V3");
        } else {
            ouwVar2.vt = strOptString;
        }
        ouwVar2.f6858lh = jSONObject3;
        ouwVar2.f6857le = ouwVar;
        ouwVar2.ra = this.ouw;
        ouwVar2.pno = this.pno;
        if (jSONObject3.has("i18n")) {
            ouwVar2.yu = jSONObject3.optJSONObject("i18n");
        }
        if (TextUtils.equals(strOptString, "CustomComponent")) {
            ouw(jSONObject, ouwVar2.f6858lh);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            int i4 = 0;
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                String strOptString3 = jSONObject.has("type") ? jSONObject.optString("type") : jSONObject.optString("name");
                String strOuw = com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObjectOptJSONObject.optString(FacebookMediationAdapter.KEY_ID), this.ra);
                if (TextUtils.equals(strOptString3, "Template")) {
                    JSONObject jSONObject4 = this.f6855le;
                    if (jSONObject4 != null) {
                        jSONObjectOptJSONObject = jSONObject4.optJSONObject(strOuw);
                        ouwVarOuw = ouw(jSONObjectOptJSONObject, ouwVar2);
                    } else {
                        ouwVarOuw = null;
                    }
                } else {
                    ouwVarOuw = ouw(jSONObjectOptJSONObject, ouwVar2);
                }
                if (ouwVarOuw != null) {
                    JSONObject jSONObject5 = ouwVarOuw.f6858lh;
                    ouwVarOuw.tlj = jSONObject5 == null ? false : TextUtils.equals(jSONObject5.optString("height"), "match_parent");
                    JSONObject jSONObject6 = ouwVarOuw.f6858lh;
                    ouwVarOuw.bly = jSONObject6 == null ? false : TextUtils.equals(jSONObject6.optString("width"), "match_parent");
                }
                if ((ouwVarOuw == null || (jSONObject2 = ouwVarOuw.f6858lh) == null) ? false : TextUtils.equals(jSONObject2.optString("position"), "absolute")) {
                    i4++;
                    if (ouwVar2.fkw == null) {
                        ouwVar2.fkw = new LinkedList<>();
                    }
                    ouwVar2.fkw.addLast(ouwVarOuw);
                } else if (ouwVarOuw != null) {
                    int i11 = i10 - i4;
                    if (ouwVar2.fkw == null) {
                        ouwVar2.fkw = new LinkedList<>();
                    }
                    ouwVar2.fkw.add(i11, ouwVarOuw);
                }
            }
        }
        return ouwVar2;
    }

    public final List<ouw> vt() throws JSONException {
        if (this.f6855le == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = this.f6855le.keys();
        while (itKeys.hasNext()) {
            ouw ouwVarOuw = ouw(this.f6855le.optJSONObject(itKeys.next()), (ouw) null);
            if (ouwVarOuw != null) {
                arrayList.add(ouwVarOuw);
            }
        }
        return arrayList;
    }

    public ra(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (jSONObject != null) {
            if (jSONObject.has("body")) {
                this.fkw = jSONObject.optJSONObject("body");
            } else {
                this.fkw = jSONObject.optJSONObject("main_template");
            }
            this.f6855le = jSONObject.optJSONObject("sub_templates");
            JSONObject jSONObjectOptJSONObject = jSONObject.has("meta") ? jSONObject.optJSONObject("meta") : jSONObject.optJSONObject("template_info");
            if (jSONObjectOptJSONObject != null) {
                if (jSONObject.has("body")) {
                    this.vt = true;
                    String strOptString = jSONObjectOptJSONObject.optString("version");
                    this.ouw = strOptString;
                    if (TextUtils.isEmpty(strOptString)) {
                        this.ouw = "3.0";
                    }
                } else {
                    this.ouw = jSONObjectOptJSONObject.optString("sdk_version");
                }
                if (jSONObjectOptJSONObject.has("adType")) {
                    this.pno = jSONObjectOptJSONObject.optString("adType");
                }
            } else if (jSONObject.has("body")) {
                this.ouw = "3.0";
                this.vt = true;
            }
            this.ra = jSONObject2;
            this.bly = jSONObject3;
        }
    }

    private void ouw(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (this.bly == null || jSONObject2 == null) {
            return;
        }
        try {
            String strOptString = this.bly.optString(jSONObject2.optString("targetId"));
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject(strOptString);
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("targetProps");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt = jSONObjectOptJSONObject.opt(next);
                    if (TextUtils.equals(next, "events") && jSONObject3.has("events")) {
                        if (objOpt instanceof JSONArray) {
                            com.bytedance.adsdk.ugeno.ra.vt.ouw(jSONObject3.optJSONArray("events"), (JSONArray) objOpt);
                        }
                    } else {
                        jSONObject3.put(next, objOpt);
                    }
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                jSONArrayOptJSONArray.put(jSONObject3);
                if (jSONObject.has("children")) {
                    return;
                }
                jSONObject.put("children", jSONArrayOptJSONArray);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public final ouw ouw() throws JSONException {
        if (!this.vt) {
            return ouw(this.fkw, (ouw) null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("flexDirection", "row");
            jSONObject.put("justifyContent", "flex_start");
            jSONObject.put("alignItems", "flex_start");
            jSONObject.put("clickable", false);
            jSONObject.put("width", "match_parent");
            jSONObject.put("height", "wrap_content");
            float f10 = this.f6856lh;
            if (f10 > 0.0f) {
                jSONObject.put("width", f10);
            }
            float f11 = this.yu;
            if (f11 > 0.0f) {
                jSONObject.put("height", f11);
            }
            JSONObject jSONObject2 = this.ra;
            if (jSONObject2 != null) {
                String strOptString = jSONObject2.optString("xSize");
                if (!TextUtils.isEmpty(strOptString)) {
                    JSONObject jSONObject3 = new JSONObject(strOptString);
                    if (jSONObject3.optInt("width") > 0) {
                        jSONObject.put("width", jSONObject3.optInt("width"));
                    }
                    if (jSONObject3.optInt("height") > 0) {
                        jSONObject.put("height", jSONObject3.optInt("height"));
                    }
                }
            }
        } catch (JSONException unused) {
        }
        ouw ouwVar = new ouw();
        ouwVar.vt = "View";
        ouwVar.ouw = "virtualNode";
        ouwVar.f6858lh = jSONObject;
        ouwVar.f6857le = null;
        ouwVar.ra = this.ouw;
        ouwVar.pno = this.pno;
        ouw ouwVarOuw = ouw(this.fkw, ouwVar);
        if (ouwVar.fkw == null) {
            ouwVar.fkw = new LinkedList<>();
        }
        ouwVar.fkw.add(ouwVarOuw);
        return ouwVar;
    }

    public static boolean ouw(ouw ouwVar) {
        return (ouwVar == null || ouwVar.f6858lh == null) ? false : true;
    }
}
