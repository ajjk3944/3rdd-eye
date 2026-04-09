package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc {
    private long bw;
    private long dg;
    private String emc;
    private List<C0007emc> xq;
    private String ycc;
    private float ypw;

    /* renamed from: com.bytedance.adsdk.ugeno.core.emc$emc, reason: collision with other inner class name */
    public static class C0007emc {
        private String bw;
        private long dg;
        private long emc;
        private float[] msw;
        private String ru;
        private float uym;
        private String xq;
        private float ycc;
        private float ypw;
        private String zz;

        public String bw() {
            return this.bw;
        }

        public long dg() {
            return this.dg;
        }

        public long emc() {
            return this.emc;
        }

        public float[] msw() {
            return this.msw;
        }

        public String ru() {
            return this.ru;
        }

        public float uym() {
            return this.uym;
        }

        public String xq() {
            return this.xq;
        }

        public float ycc() {
            return this.ycc;
        }

        public float ypw() {
            return this.ypw;
        }

        public String zz() {
            return this.zz;
        }

        public void dg(String str) {
            this.zz = str;
        }

        public void emc(long j6) {
            this.emc = j6;
        }

        public void xq(float f2) {
            this.uym = f2;
        }

        public void ypw(long j6) {
            this.dg = j6;
        }

        public void emc(float f2) {
            this.ypw = f2;
        }

        public void xq(String str) {
            this.ru = str;
        }

        public void ypw(String str) {
            this.bw = str;
        }

        public void emc(String str) {
            this.xq = str;
        }

        public void ypw(float f2) {
            this.ycc = f2;
        }

        public void emc(float[] fArr) {
            this.msw = fArr;
        }

        public static C0007emc emc(JSONObject jSONObject, com.bytedance.adsdk.ugeno.ypw.xq xqVar) {
            if (jSONObject == null) {
                return null;
            }
            C0007emc c0007emc = new C0007emc();
            c0007emc.emc(jSONObject.optLong("duration"));
            String strOptString = jSONObject.optString("loop");
            if (TextUtils.equals("infinite", strOptString)) {
                c0007emc.emc(-1.0f);
            } else {
                try {
                    c0007emc.emc(Float.parseFloat(strOptString));
                } catch (NumberFormatException unused) {
                    c0007emc.emc(0.0f);
                }
            }
            c0007emc.emc(jSONObject.optString("loopMode"));
            c0007emc.ypw(jSONObject.optString("type"));
            if (TextUtils.equals(c0007emc.bw(), "ripple")) {
                c0007emc.xq(jSONObject.optString("rippleColor"));
            }
            View viewGbl = xqVar.gbl();
            Context context = viewGbl != null ? viewGbl.getContext() : null;
            if (TextUtils.equals(c0007emc.bw(), "backgroundColor")) {
                String strEmc = com.bytedance.adsdk.ugeno.xq.ypw.emc(jSONObject.optString("valueTo"), xqVar.sup());
                int iEmc = com.bytedance.adsdk.ugeno.uym.emc.emc(jSONObject.optString("valueFrom"));
                int iEmc2 = com.bytedance.adsdk.ugeno.uym.emc.emc(strEmc);
                c0007emc.ypw(iEmc);
                c0007emc.xq(iEmc2);
            } else if ((TextUtils.equals(c0007emc.bw(), "translateX") || TextUtils.equals(c0007emc.bw(), "translateY")) && context != null) {
                try {
                    float fEmc = com.bytedance.adsdk.ugeno.uym.msw.emc(context, (float) jSONObject.optDouble("valueFrom"));
                    float fEmc2 = com.bytedance.adsdk.ugeno.uym.msw.emc(context, (float) jSONObject.optDouble("valueTo"));
                    c0007emc.ypw(fEmc);
                    c0007emc.xq(fEmc2);
                } catch (Exception unused2) {
                    Log.e("animation", "animation ");
                }
            } else {
                c0007emc.ypw((float) jSONObject.optDouble("valueFrom"));
                c0007emc.xq((float) jSONObject.optDouble("valueTo"));
            }
            c0007emc.dg(jSONObject.optString("interpolator"));
            String strEmc2 = com.bytedance.adsdk.ugeno.xq.ypw.emc(jSONObject.optString("startDelay"), xqVar.sup());
            Log.d("TAG", "createAnimationModel: ");
            c0007emc.ypw(com.bytedance.adsdk.ugeno.uym.xq.emc(strEmc2, 0L));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("values");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                float[] fArr = new float[jSONArrayOptJSONArray.length()];
                int i = 0;
                if ((TextUtils.equals(c0007emc.bw(), "translateX") || TextUtils.equals(c0007emc.bw(), "translateY")) && context != null) {
                    while (i < jSONArrayOptJSONArray.length()) {
                        fArr[i] = com.bytedance.adsdk.ugeno.uym.msw.emc(context, (float) emc.emc(jSONArrayOptJSONArray.optString(i), xqVar.sup()));
                        i++;
                    }
                } else {
                    while (i < jSONArrayOptJSONArray.length()) {
                        fArr[i] = (float) emc.emc(jSONArrayOptJSONArray.optString(i), xqVar.sup());
                        i++;
                    }
                }
                c0007emc.emc(fArr);
            }
            return c0007emc;
        }
    }

    public long bw() {
        return this.bw;
    }

    public long dg() {
        return this.dg;
    }

    public String emc() {
        return this.emc;
    }

    public List<C0007emc> xq() {
        return this.xq;
    }

    public String ycc() {
        return this.ycc;
    }

    public float ypw() {
        return this.ypw;
    }

    public void emc(String str) {
        this.emc = str;
    }

    public void ypw(long j6) {
        this.bw = j6;
    }

    public void emc(float f2) {
        this.ypw = f2;
    }

    public void ypw(String str) {
        this.ycc = str;
    }

    public void emc(List<C0007emc> list) {
        this.xq = list;
    }

    public void emc(long j6) {
        this.dg = j6;
    }

    public static emc emc(String str, com.bytedance.adsdk.ugeno.ypw.xq xqVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return emc(new JSONObject(str), xqVar);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static emc emc(JSONObject jSONObject, com.bytedance.adsdk.ugeno.ypw.xq xqVar) {
        return emc(jSONObject, null, xqVar);
    }

    public static emc emc(JSONObject jSONObject, JSONObject jSONObject2, com.bytedance.adsdk.ugeno.ypw.xq xqVar) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        emc emcVar = new emc();
        emcVar.emc(jSONObject.optString("ordering"));
        String strOptString = jSONObject.optString("loop");
        if (TextUtils.equals("infinite", strOptString)) {
            emcVar.emc(-1.0f);
        } else {
            try {
                emcVar.emc(Float.parseFloat(strOptString));
            } catch (NumberFormatException unused) {
                emcVar.emc(0.0f);
            }
        }
        emcVar.emc(jSONObject.optLong("duration", 0L));
        emcVar.ypw(com.bytedance.adsdk.ugeno.uym.xq.emc(com.bytedance.adsdk.ugeno.xq.ypw.emc(jSONObject.optString("startDelay"), xqVar.sup()), 0L));
        emcVar.ypw(jSONObject.optString("loopMode"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animators");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObject2 != null) {
                    com.bytedance.adsdk.ugeno.uym.ypw.emc(jSONObject2, jSONObjectOptJSONObject);
                }
                arrayList.add(C0007emc.emc(jSONObjectOptJSONObject, xqVar));
            }
            emcVar.emc(arrayList);
        }
        return emcVar;
    }

    public static double emc(Object obj, JSONObject jSONObject) {
        if (obj instanceof String) {
            return com.bytedance.adsdk.ugeno.uym.xq.emc(com.bytedance.adsdk.ugeno.xq.ypw.emc((String) obj, jSONObject), 0.0d);
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Long) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Integer) {
            return ((Double) obj).doubleValue();
        }
        return 0.0d;
    }
}
