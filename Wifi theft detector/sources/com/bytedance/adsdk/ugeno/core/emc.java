package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
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
    private List<C0092emc> xq;
    private String ycc;
    private float ypw;

    /* renamed from: com.bytedance.adsdk.ugeno.core.emc$emc, reason: collision with other inner class name */
    public static class C0092emc {
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

        public void emc(long j10) {
            this.emc = j10;
        }

        public void xq(float f10) {
            this.uym = f10;
        }

        public void ypw(long j10) {
            this.dg = j10;
        }

        public void emc(float f10) {
            this.ypw = f10;
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

        public void ypw(float f10) {
            this.ycc = f10;
        }

        public void emc(float[] fArr) {
            this.msw = fArr;
        }

        public static C0092emc emc(JSONObject jSONObject, com.bytedance.adsdk.ugeno.ypw.xq xqVar) {
            if (jSONObject == null) {
                return null;
            }
            C0092emc c0092emc = new C0092emc();
            c0092emc.emc(jSONObject.optLong("duration"));
            String strOptString = jSONObject.optString("loop");
            if (TextUtils.equals("infinite", strOptString)) {
                c0092emc.emc(-1.0f);
            } else {
                try {
                    c0092emc.emc(Float.parseFloat(strOptString));
                } catch (NumberFormatException unused) {
                    c0092emc.emc(0.0f);
                }
            }
            c0092emc.emc(jSONObject.optString("loopMode"));
            c0092emc.ypw(jSONObject.optString(HandleInvocationsFromAdViewer.KEY_AD_TYPE));
            if (TextUtils.equals(c0092emc.bw(), "ripple")) {
                c0092emc.xq(jSONObject.optString("rippleColor"));
            }
            View viewGbl = xqVar.gbl();
            Context context = viewGbl != null ? viewGbl.getContext() : null;
            if (TextUtils.equals(c0092emc.bw(), TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                String strEmc = com.bytedance.adsdk.ugeno.xq.ypw.emc(jSONObject.optString("valueTo"), xqVar.sup());
                int iEmc = com.bytedance.adsdk.ugeno.uym.emc.emc(jSONObject.optString("valueFrom"));
                int iEmc2 = com.bytedance.adsdk.ugeno.uym.emc.emc(strEmc);
                c0092emc.ypw(iEmc);
                c0092emc.xq(iEmc2);
            } else if ((TextUtils.equals(c0092emc.bw(), "translateX") || TextUtils.equals(c0092emc.bw(), "translateY")) && context != null) {
                try {
                    float fEmc = com.bytedance.adsdk.ugeno.uym.msw.emc(context, (float) jSONObject.optDouble("valueFrom"));
                    float fEmc2 = com.bytedance.adsdk.ugeno.uym.msw.emc(context, (float) jSONObject.optDouble("valueTo"));
                    c0092emc.ypw(fEmc);
                    c0092emc.xq(fEmc2);
                } catch (Exception unused2) {
                    Log.e("animation", "animation ");
                }
            } else {
                c0092emc.ypw((float) jSONObject.optDouble("valueFrom"));
                c0092emc.xq((float) jSONObject.optDouble("valueTo"));
            }
            c0092emc.dg(jSONObject.optString("interpolator"));
            String strEmc2 = com.bytedance.adsdk.ugeno.xq.ypw.emc(jSONObject.optString("startDelay"), xqVar.sup());
            Log.d("TAG", "createAnimationModel: ");
            c0092emc.ypw(com.bytedance.adsdk.ugeno.uym.xq.emc(strEmc2, 0L));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("values");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                float[] fArr = new float[jSONArrayOptJSONArray.length()];
                int i10 = 0;
                if ((TextUtils.equals(c0092emc.bw(), "translateX") || TextUtils.equals(c0092emc.bw(), "translateY")) && context != null) {
                    while (i10 < jSONArrayOptJSONArray.length()) {
                        fArr[i10] = com.bytedance.adsdk.ugeno.uym.msw.emc(context, (float) emc.emc(jSONArrayOptJSONArray.optString(i10), xqVar.sup()));
                        i10++;
                    }
                } else {
                    while (i10 < jSONArrayOptJSONArray.length()) {
                        fArr[i10] = (float) emc.emc(jSONArrayOptJSONArray.optString(i10), xqVar.sup());
                        i10++;
                    }
                }
                c0092emc.emc(fArr);
            }
            return c0092emc;
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

    public List<C0092emc> xq() {
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

    public void ypw(long j10) {
        this.bw = j10;
    }

    public void emc(float f10) {
        this.ypw = f10;
    }

    public void ypw(String str) {
        this.ycc = str;
    }

    public void emc(List<C0092emc> list) {
        this.xq = list;
    }

    public void emc(long j10) {
        this.dg = j10;
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
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObject2 != null) {
                    com.bytedance.adsdk.ugeno.uym.ypw.emc(jSONObject2, jSONObjectOptJSONObject);
                }
                arrayList.add(C0092emc.emc(jSONObjectOptJSONObject, xqVar));
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
