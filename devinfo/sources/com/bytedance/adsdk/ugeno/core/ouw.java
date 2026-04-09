package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    long fkw;

    /* renamed from: le, reason: collision with root package name */
    String f6851le;

    /* renamed from: lh, reason: collision with root package name */
    List<C0030ouw> f6852lh;
    String ouw;
    float vt;
    long yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.adsdk.ugeno.core.ouw$ouw, reason: collision with other inner class name */
    public static class C0030ouw {
        String bly;
        String fkw;

        /* renamed from: le, reason: collision with root package name */
        float f6853le;

        /* renamed from: lh, reason: collision with root package name */
        String f6854lh;
        long ouw;
        float[] pno;
        float ra;
        String tlj;
        float vt;
        long yu;

        public static C0030ouw ouw(JSONObject jSONObject, com.bytedance.adsdk.ugeno.vt.lh lhVar) throws NumberFormatException {
            if (jSONObject == null) {
                return null;
            }
            C0030ouw c0030ouw = new C0030ouw();
            c0030ouw.ouw = jSONObject.optLong("duration");
            String strOptString = jSONObject.optString("loop");
            if (TextUtils.equals("infinite", strOptString)) {
                c0030ouw.vt = -1.0f;
            } else {
                try {
                    c0030ouw.vt = Float.parseFloat(strOptString);
                } catch (NumberFormatException unused) {
                    c0030ouw.vt = 0.0f;
                }
            }
            c0030ouw.f6854lh = jSONObject.optString("loopMode");
            String strOptString2 = jSONObject.optString("type");
            c0030ouw.fkw = strOptString2;
            if (TextUtils.equals(strOptString2, "ripple")) {
                c0030ouw.tlj = jSONObject.optString("rippleColor");
            }
            T t10 = lhVar.fkw;
            Context context = t10 != 0 ? t10.getContext() : null;
            if (TextUtils.equals(c0030ouw.fkw, "backgroundColor")) {
                String strOuw = com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObject.optString("valueTo"), lhVar.yu);
                int iOuw = com.bytedance.adsdk.ugeno.ra.ouw.ouw(jSONObject.optString("valueFrom"), -16777216);
                int iOuw2 = com.bytedance.adsdk.ugeno.ra.ouw.ouw(strOuw, -16777216);
                c0030ouw.f6853le = iOuw;
                c0030ouw.ra = iOuw2;
            } else if ((TextUtils.equals(c0030ouw.fkw, "translateX") || TextUtils.equals(c0030ouw.fkw, "translateY")) && context != null) {
                try {
                    float fOuw = com.bytedance.adsdk.ugeno.ra.ra.ouw(context, (float) jSONObject.optDouble("valueFrom"));
                    float fOuw2 = com.bytedance.adsdk.ugeno.ra.ra.ouw(context, (float) jSONObject.optDouble("valueTo"));
                    c0030ouw.f6853le = fOuw;
                    c0030ouw.ra = fOuw2;
                } catch (Exception unused2) {
                    Log.e("animation", "animation ");
                }
            } else {
                c0030ouw.f6853le = (float) jSONObject.optDouble("valueFrom");
                c0030ouw.ra = (float) jSONObject.optDouble("valueTo");
            }
            c0030ouw.bly = jSONObject.optString("interpolator");
            String strOuw2 = com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObject.optString("startDelay"), lhVar.yu);
            Log.d("TAG", "createAnimationModel: ");
            c0030ouw.yu = com.bytedance.adsdk.ugeno.ra.lh.ouw(strOuw2);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("values");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                float[] fArr = new float[jSONArrayOptJSONArray.length()];
                int i4 = 0;
                if ((TextUtils.equals(c0030ouw.fkw, "translateX") || TextUtils.equals(c0030ouw.fkw, "translateY")) && context != null) {
                    while (i4 < jSONArrayOptJSONArray.length()) {
                        fArr[i4] = com.bytedance.adsdk.ugeno.ra.ra.ouw(context, (float) ouw.ouw(jSONArrayOptJSONArray.optString(i4), lhVar.yu));
                        i4++;
                    }
                } else {
                    while (i4 < jSONArrayOptJSONArray.length()) {
                        fArr[i4] = (float) ouw.ouw(jSONArrayOptJSONArray.optString(i4), lhVar.yu);
                        i4++;
                    }
                }
                c0030ouw.pno = fArr;
            }
            return c0030ouw;
        }
    }

    public static ouw ouw(String str, com.bytedance.adsdk.ugeno.vt.lh lhVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return ouw(new JSONObject(str), null, lhVar);
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static ouw ouw(JSONObject jSONObject, JSONObject jSONObject2, com.bytedance.adsdk.ugeno.vt.lh lhVar) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        ouw ouwVar = new ouw();
        ouwVar.ouw = jSONObject.optString("ordering");
        String strOptString = jSONObject.optString("loop");
        if (TextUtils.equals("infinite", strOptString)) {
            ouwVar.vt = -1.0f;
        } else {
            try {
                ouwVar.vt = Float.parseFloat(strOptString);
            } catch (NumberFormatException unused) {
                ouwVar.vt = 0.0f;
            }
        }
        ouwVar.yu = jSONObject.optLong("duration", 0L);
        ouwVar.fkw = com.bytedance.adsdk.ugeno.ra.lh.ouw(com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObject.optString("startDelay"), lhVar.yu));
        ouwVar.f6851le = jSONObject.optString("loopMode");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animators");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i4);
                if (jSONObject2 != null) {
                    com.bytedance.adsdk.ugeno.ra.vt.ouw(jSONObject2, jSONObjectOptJSONObject);
                }
                arrayList.add(C0030ouw.ouw(jSONObjectOptJSONObject, lhVar));
            }
            ouwVar.f6852lh = arrayList;
        }
        return ouwVar;
    }

    public static double ouw(Object obj, JSONObject jSONObject) {
        if (obj instanceof String) {
            return com.bytedance.adsdk.ugeno.ra.lh.vt(com.bytedance.adsdk.ugeno.lh.vt.ouw((String) obj, jSONObject));
        }
        return 0.0d;
    }
}
