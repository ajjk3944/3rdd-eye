package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.sdk.component.ouw.lh;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.ko;
import com.bytedance.sdk.openadsdk.core.vpp;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class bs implements com.bytedance.sdk.component.adexpress.fkw.vt, jae.ouw, com.bytedance.sdk.openadsdk.cf.vt {
    private static final Map<String, Boolean> uoy;
    public com.bytedance.sdk.openadsdk.core.model.vpp bly;
    private WeakReference<com.bytedance.sdk.component.bly.le> bs;

    /* renamed from: cd, reason: collision with root package name */
    public boolean f8103cd;

    /* renamed from: cf, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.bly.ko f8104cf;

    /* renamed from: cj, reason: collision with root package name */
    private Context f8105cj;
    public String ex;
    public String fkw;
    private JSONObject fqk;
    public ouw fvf;
    private com.bytedance.sdk.openadsdk.core.lh.yu hun;
    public com.bytedance.sdk.openadsdk.mwh.ra jae;

    /* renamed from: jg, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.mwh.fkw f8106jg;
    public com.bytedance.sdk.openadsdk.mwh.vt jqy;
    private com.bytedance.sdk.openadsdk.cf.yu jvy;
    public com.bytedance.sdk.openadsdk.mwh.lh ko;
    public com.bytedance.sdk.openadsdk.core.widget.ouw.ouw ksc;

    /* renamed from: le, reason: collision with root package name */
    public int f8107le;

    /* renamed from: lh, reason: collision with root package name */
    public String f8108lh;
    private HashMap<String, tlj> lso;
    public com.bytedance.sdk.openadsdk.mwh.ouw mwh;

    /* renamed from: od, reason: collision with root package name */
    public boolean f8109od;
    private com.bytedance.sdk.openadsdk.cf.lh osn;
    public String ouw;

    /* renamed from: pd, reason: collision with root package name */
    public ksc f8110pd;
    public int pno;
    private lh pv;
    public String ra;
    public com.bytedance.sdk.openadsdk.mwh.tlj rn;
    private JSONObject rrs;
    public JSONObject ryl;
    public com.bytedance.sdk.component.adexpress.vt.cf tlj;
    public com.bytedance.sdk.openadsdk.core.mwh.yu.vt uq;
    public com.bytedance.sdk.component.ouw.ko vpp;
    public com.bytedance.sdk.openadsdk.core.widget.fkw vt;
    public WeakReference<View> yu;
    protected Map<String, Object> zih;
    public com.bytedance.sdk.openadsdk.yu.yu.fkw zin;
    private boolean ey = true;
    private boolean ux = true;

    /* renamed from: ub, reason: collision with root package name */
    private boolean f8112ub = false;
    public boolean vm = false;

    /* renamed from: th, reason: collision with root package name */
    public boolean f8111th = false;
    boolean qbp = false;
    public boolean tc = false;
    private final com.bytedance.sdk.component.utils.jae fak = new com.bytedance.sdk.component.utils.jae(Looper.getMainLooper(), this);

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class lh implements Runnable {
        private final com.bytedance.sdk.openadsdk.core.bly.ko ouw;
        private final JSONObject vt;

        public lh(com.bytedance.sdk.openadsdk.core.bly.ko koVar, JSONObject jSONObject) {
            this.ouw = koVar;
            this.vt = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            bs.vt(this.ouw, this.vt);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        void ouw();
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class vt {
        public int fkw;

        /* renamed from: lh, reason: collision with root package name */
        public String f8115lh;
        public String ouw;
        public String vt;
        public JSONObject yu;
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        uoy = concurrentHashMap;
        Boolean bool = Boolean.TRUE;
        concurrentHashMap.put("log_event", bool);
        concurrentHashMap.put("private", bool);
        concurrentHashMap.put("dispatch_message", bool);
        concurrentHashMap.put("custom_event", bool);
        concurrentHashMap.put("log_event_v3", bool);
    }

    public bs(Context context) {
        this.f8105cj = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bly() {
        com.bytedance.sdk.openadsdk.core.bly.ko koVar = this.f8104cf;
        if (koVar != null) {
            koVar.ouw();
        }
    }

    private void cf(JSONObject jSONObject) {
        WebView webViewRa = ra();
        if (webViewRa != null) {
            String str = "javascript:ToutiaoJSBridge._handleMessageFromToutiao(" + jSONObject + ")";
            com.bytedance.sdk.component.utils.jg.ouw(webViewRa, str);
            if (com.bytedance.sdk.component.utils.ko.ouw()) {
                com.bytedance.sdk.component.utils.ko.ouw("TTAD.AndroidObject", "js_msg ".concat(String.valueOf(str)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void le(JSONObject jSONObject) {
        if (this.f8104cf == null || jSONObject == null) {
            return;
        }
        try {
            this.f8104cf.ouw(jSONObject.optInt("stateType", -1));
        } catch (Exception unused) {
        }
    }

    private JSONObject pno() {
        try {
            View view = this.yu.get();
            com.bytedance.sdk.component.bly.le leVar = this.bs.get();
            if (view != null && leVar != null) {
                int[] iArrVt = com.bytedance.sdk.openadsdk.utils.osn.vt(view);
                int[] iArrVt2 = com.bytedance.sdk.openadsdk.utils.osn.vt((View) leVar);
                if (iArrVt != null && iArrVt2 != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("x", com.bytedance.sdk.openadsdk.utils.osn.vt(zih.ouw(), iArrVt[0] - iArrVt2[0]));
                    jSONObject.put("y", com.bytedance.sdk.openadsdk.utils.osn.vt(zih.ouw(), iArrVt[1] - iArrVt2[1]));
                    jSONObject.put("w", com.bytedance.sdk.openadsdk.utils.osn.vt(zih.ouw(), view.getWidth()));
                    jSONObject.put("h", com.bytedance.sdk.openadsdk.utils.osn.vt(zih.ouw(), view.getHeight()));
                    jSONObject.put("isExist", true);
                    return jSONObject;
                }
                com.bytedance.sdk.component.utils.ko.fkw("TTAD.AndroidObject", "setCloseButtonInfo error position or webViewPosition is null");
                return null;
            }
            com.bytedance.sdk.component.utils.ko.fkw("TTAD.AndroidObject", "setCloseButtonInfo error closeButton is null");
            return null;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.ouw("TTAD.AndroidObject", "setCloseButtonInfo error", th2);
            return null;
        }
    }

    private WebView ra() {
        com.bytedance.sdk.component.bly.le leVar;
        WeakReference<com.bytedance.sdk.component.bly.le> weakReference = this.bs;
        if (weakReference == null || (leVar = weakReference.get()) == null) {
            return null;
        }
        return leVar.getWebView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject ryl(JSONObject jSONObject) throws JSONException {
        if (this.zih != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                String strOptString = jSONObject.optString("ad_extra_data", null);
                if (strOptString != null) {
                    jSONObject2 = new JSONObject(strOptString);
                }
                for (Map.Entry<String, Object> entry : this.zih.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (Exception e2) {
                com.bytedance.sdk.component.utils.qbp.yu(e2.toString(), new Object[0]);
            }
        }
        return jSONObject;
    }

    private void tlj(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        com.bytedance.sdk.component.utils.ko.vt("TTAD.AndroidObject", "TTAndroidObject handlerDynamicTrack");
        try {
            Uri uri = Uri.parse(jSONObject.optString("trackData"));
            if ("bytedance".equals(uri.getScheme().toLowerCase())) {
                com.bytedance.sdk.openadsdk.utils.th.ouw(uri, this);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.vt
    @JavascriptInterface
    public String adInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            fkw(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.vt
    @JavascriptInterface
    public String appInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            ouw(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.vt
    @JavascriptInterface
    public void changeVideoState(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bs.4
                @Override // java.lang.Runnable
                public final void run() {
                    bs.this.le(jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.vt
    @JavascriptInterface
    public void clickEvent(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bs.5
                @Override // java.lang.Runnable
                public final void run() {
                    bs.this.vt(jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.vt
    @JavascriptInterface
    public void dynamicTrack(String str) {
        try {
            tlj(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.vt
    @JavascriptInterface
    public String getCurrentVideoState() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ra(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.vt
    @JavascriptInterface
    public String getData(String str) {
        if (TextUtils.isEmpty(str)) {
            return this.ryl.toString();
        }
        try {
            JSONObject jSONObjectOuw = com.bytedance.sdk.openadsdk.core.bly.ouw.ouw.ouw(this.ryl, new JSONObject(str));
            return jSONObjectOuw == null ? this.ryl.toString() : jSONObjectOuw.toString();
        } catch (Exception unused) {
            return this.ryl.toString();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.vt
    @JavascriptInterface
    public String getTemplateInfo() throws JSONException {
        JSONObject jSONObject;
        ouw("getTemplateInfo", true);
        try {
            JSONObject jSONObject2 = this.ryl;
            if (jSONObject2 != null) {
                jSONObject2.put("setting", vt(this.bly));
                com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.bly;
                if (vppVar != null && (jSONObject = vppVar.smu) != null) {
                    this.ryl.put("dynamic_configs", jSONObject);
                }
                com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 = this.bly;
                if (vppVar2 != null) {
                    this.ryl.put("extension", vppVar2.hsa);
                }
            }
            ouw("getTemplateInfo", false);
            return this.ryl.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.vt
    @JavascriptInterface
    public void initRenderFinish() {
        com.bytedance.sdk.component.utils.ko.vt("TTAD.AndroidObject", "initRenderFinish");
        com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bs.7
            @Override // java.lang.Runnable
            public final void run() {
                if (bs.this.ksc != null) {
                    bs.this.ksc.ouw();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.vt
    @JavascriptInterface
    public void muteVideo(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            lh lhVar = this.pv;
            if (lhVar != null) {
                com.bytedance.sdk.openadsdk.utils.bs.vt(lhVar);
            }
            lh lhVar2 = new lh(this.f8104cf, jSONObject);
            this.pv = lhVar2;
            com.bytedance.sdk.openadsdk.utils.bs.ouw(lhVar2);
        } catch (Exception unused) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.AndroidObject", "");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.vt
    @JavascriptInterface
    public void renderDidFinish(String str) {
        try {
            pno(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.vt
    @JavascriptInterface
    public void skipVideo() {
        com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bs.6
            @Override // java.lang.Runnable
            public final void run() {
                bs.this.bly();
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.vt
    @JavascriptInterface
    public void videoFrameChanged(String str) {
        if (this.jae == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.component.adexpress.vt.jg jgVar = new com.bytedance.sdk.component.adexpress.vt.jg();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("videoInfo");
            if (jSONObjectOptJSONObject != null) {
                double dOptDouble = jSONObjectOptJSONObject.optDouble("x");
                double dOptDouble2 = jSONObjectOptJSONObject.optDouble("y");
                double dOptDouble3 = jSONObjectOptJSONObject.optDouble("width");
                double dOptDouble4 = jSONObjectOptJSONObject.optDouble("height");
                if (bly(jSONObjectOptJSONObject)) {
                    jgVar.ra = (float) jSONObjectOptJSONObject.optDouble("borderRadiusTopLeft");
                    jgVar.pno = (float) jSONObjectOptJSONObject.optDouble("borderRadiusTopRight");
                    jgVar.bly = (float) jSONObjectOptJSONObject.optDouble("borderRadiusBottomLeft");
                    jgVar.tlj = (float) jSONObjectOptJSONObject.optDouble("borderRadiusBottomRight");
                }
                jgVar.fkw = dOptDouble;
                jgVar.f7392le = dOptDouble2;
                jgVar.f7390cf = dOptDouble3;
                jgVar.ryl = dOptDouble4;
            }
            com.bytedance.sdk.openadsdk.mwh.ra raVar = this.jae;
            if (raVar != null) {
                raVar.ouw(jgVar);
            }
        } catch (Throwable unused) {
        }
    }

    private void fkw(JSONObject jSONObject) throws Exception {
        ouw(jSONObject, this.bly);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lh(String str, JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "callback");
            jSONObject2.put("__callback_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            cf(jSONObject2);
        } catch (Exception unused) {
        }
    }

    public final JSONObject yu() {
        JSONObject jSONObject = new JSONObject();
        com.bytedance.sdk.openadsdk.core.bly.ko koVar = this.f8104cf;
        if (koVar != null) {
            try {
                jSONObject.put("state", koVar.l_() ? 1 : 0);
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }

    private static boolean bly(JSONObject jSONObject) {
        return jSONObject.has("borderRadiusTopLeft") && jSONObject.has("borderRadiusBottomLeft") && jSONObject.has("borderRadiusTopRight") && jSONObject.has("borderRadiusBottomRight");
    }

    public final JSONObject fkw() throws JSONException {
        List<com.bytedance.sdk.openadsdk.core.model.vpp> listPv;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar = this.uq;
            if (vtVar != null && (listPv = vtVar.pv()) != null) {
                for (int i4 = 0; i4 < listPv.size(); i4++) {
                    com.bytedance.sdk.openadsdk.core.model.vpp vppVar = listPv.get(i4);
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("is_ad_event", "1");
                    jSONObject3.put("cid", vppVar.tlj());
                    jSONObject3.put("req_id", vppVar.ux());
                    jSONObject3.put("ad_id", vppVar.pv);
                    jSONObject3.put("log_extra", vppVar.yhj);
                    jSONObject3.put("isRTL", com.bytedance.sdk.openadsdk.core.settings.cf.vt().osn());
                    jSONObject2.put("ad_info", jSONObject3);
                    jSONObject2.put("endcard_creative", vppVar.znd);
                    jSONObject2.put("dynamic_creative", vppVar.jvj);
                    jSONObject2.put("title", vppVar.fqk);
                    com.bytedance.sdk.openadsdk.core.model.vpp.ouw(vppVar, jSONObject2);
                    com.bytedance.sdk.openadsdk.core.model.vpp.vt(vppVar, jSONObject2);
                    jSONObject2.put("source", vppVar.f8315vh);
                    jSONObject2.put("button_text", vppVar.ux);
                    com.bytedance.sdk.openadsdk.core.model.ryl rylVar = vppVar.kn;
                    if (rylVar != null) {
                        jSONObject2.put("deeplink_url", rylVar.ouw);
                    }
                    jSONObject2.put("app_name", vppVar.f8312ub);
                    jSONObject2.put("has_show", vppVar.bu ? 1 : 0);
                    jSONObject2.put("has_click", vppVar.cj() ? 1 : 0);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("creatives", jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final bs vt(com.bytedance.sdk.component.bly.le leVar) {
        this.bs = new WeakReference<>(leVar);
        return this;
    }

    private boolean ra(JSONObject jSONObject) throws JSONException {
        com.bytedance.sdk.openadsdk.core.bly.ko koVar = this.f8104cf;
        if (koVar == null) {
            return false;
        }
        double dYu = koVar.yu();
        double dFkw = this.f8104cf.fkw();
        int iLe = this.f8104cf.le();
        com.bytedance.sdk.component.utils.qbp.ouw("TTAD.TopLayoutHelper", "current:", Double.valueOf(dYu), "state", Integer.valueOf(iLe), "countdownTime", Double.valueOf(dFkw));
        try {
            jSONObject.put("currentTime", dYu / 1000.0d);
            if (dFkw > 0.0d) {
                jSONObject.put("countDownTime", dFkw / 1000.0d);
            }
            jSONObject.put("state", iLe);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void vt(com.bytedance.sdk.openadsdk.core.bly.ko koVar, JSONObject jSONObject) {
        if (koVar == null || jSONObject == null) {
            return;
        }
        try {
            koVar.ouw(jSONObject.optBoolean("mute", false), !jSONObject.has("mute") ? "jsb_def" : "jsb_web");
        } catch (Exception unused) {
        }
    }

    public final JSONObject le() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            ksc kscVar = this.f8110pd;
            if (kscVar != null) {
                jSONObject.put("leftTime", kscVar.q_());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final void yu(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.ouw ouwVar;
        if (jSONObject == null) {
            return;
        }
        int iOptInt = jSONObject.optInt("index");
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.bly;
        if (vppVar == null || (ouwVar = vppVar.vm) == null) {
            return;
        }
        List<com.bytedance.sdk.openadsdk.core.model.vpp> list = ouwVar.yu;
        if (iOptInt < 0 || iOptInt >= list.size()) {
            return;
        }
        ouw(list.get(iOptInt), this.ex, false);
        com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar = this.uq;
        if (vtVar != null) {
            vtVar.kn();
        }
    }

    public final void lh() {
        com.bytedance.sdk.openadsdk.cf.lh lhVar = this.osn;
        if (lhVar != null) {
            lhVar.ouw();
        }
        lh lhVar2 = this.pv;
        if (lhVar2 != null) {
            com.bytedance.sdk.openadsdk.utils.bs.vt(lhVar2);
            this.pv = null;
        }
        this.f8105cj = null;
        this.uq = null;
    }

    public final bs ouw(com.bytedance.sdk.component.bly.le leVar) {
        WebView webView;
        if (leVar != null && (webView = leVar.getWebView()) != null) {
            try {
                com.bytedance.sdk.component.ouw.bly blyVar = new com.bytedance.sdk.component.ouw.bly(webView);
                blyVar.vt = new com.bytedance.sdk.openadsdk.ryl.ouw();
                blyVar.f7592lh = "ToutiaoJSBridge";
                blyVar.yu = new com.bytedance.sdk.component.ouw.ra(new com.bytedance.sdk.component.ouw.tlj() { // from class: com.bytedance.sdk.openadsdk.core.bs.1
                    @Override // com.bytedance.sdk.component.ouw.tlj
                    public final <T> T ouw() {
                        return null;
                    }

                    @Override // com.bytedance.sdk.component.ouw.tlj
                    public final <T> String vt() {
                        return null;
                    }
                });
                blyVar.f7591le = bly.ouw().jg();
                blyVar.ra = true;
                if ((blyVar.ouw != null || blyVar.mwh || blyVar.vt != null) && ((!TextUtils.isEmpty(blyVar.f7592lh) || blyVar.ouw == null) && blyVar.yu != null)) {
                    this.vpp = new com.bytedance.sdk.component.ouw.ko(blyVar);
                    if (com.bytedance.sdk.openadsdk.vpp.ouw.le()) {
                        com.bytedance.sdk.openadsdk.ryl.ouw.pno.ouw(this.vpp, this);
                        com.bytedance.sdk.openadsdk.ryl.ouw.tlj.ouw(this.vpp, this);
                        com.bytedance.sdk.openadsdk.ryl.ouw.qbp.ouw(this.vpp, leVar, this, this.bly);
                    } else {
                        com.bytedance.sdk.component.ouw.ko koVar = this.vpp;
                        koVar.ouw("appInfo", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("appInfo", this));
                        koVar.ouw("adInfo", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("adInfo", this));
                        koVar.ouw("sendLog", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("sendLog", this));
                        koVar.ouw("playable_style", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("playable_style", this));
                        koVar.ouw("getTemplateInfo", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("getTemplateInfo", this));
                        koVar.ouw("getTeMaiAds", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("getTeMaiAds", this));
                        koVar.ouw("isViewable", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("isViewable", this));
                        koVar.ouw("getScreenSize", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("getScreenSize", this));
                        koVar.ouw("getCloseButtonInfo", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("getCloseButtonInfo", this));
                        koVar.ouw("getVolume", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("getVolume", this));
                        koVar.ouw("removeLoading", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("removeLoading", this));
                        koVar.ouw("sendReward", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("sendReward", this));
                        koVar.ouw("subscribe_app_ad", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("subscribe_app_ad", this));
                        koVar.ouw("download_app_ad", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("download_app_ad", this));
                        koVar.ouw("cancel_download_app_ad", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("cancel_download_app_ad", this));
                        koVar.ouw("unsubscribe_app_ad", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("unsubscribe_app_ad", this));
                        koVar.ouw("landscape_click", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("landscape_click", this));
                        koVar.ouw("clickEvent", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("clickEvent", this));
                        koVar.ouw("renderDidFinish", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("renderDidFinish", this));
                        koVar.ouw("dynamicTrack", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("dynamicTrack", this));
                        koVar.ouw("skipVideo", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("skipVideo", this));
                        koVar.ouw("muteVideo", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("muteVideo", this));
                        koVar.ouw("changeVideoState", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("changeVideoState", this));
                        koVar.ouw("getCurrentVideoState", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("getCurrentVideoState", this));
                        koVar.ouw("send_temai_product_ids", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("send_temai_product_ids", this));
                        koVar.ouw("getMaterialMeta", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("getMaterialMeta", this));
                        koVar.ouw("endcard_load", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("endcard_load", this));
                        koVar.ouw("pauseWebView", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("pauseWebView", this));
                        koVar.ouw("pauseWebViewTimers", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("pauseWebViewTimers", this));
                        koVar.ouw("webview_time_track", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("webview_time_track", this));
                        koVar.ouw("openPrivacy", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("openPrivacy", this));
                        koVar.ouw("openAdLandPageLinks", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("openAdLandPageLinks", this));
                        koVar.ouw("getNativeSiteCustomData", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("getNativeSiteCustomData", this));
                        koVar.ouw("close", new com.bytedance.sdk.openadsdk.ryl.ouw.ra("close", this));
                        com.bytedance.sdk.component.ouw.ko koVar2 = this.vpp;
                        koVar2.ouw("endcardDynamicCreatives", new com.bytedance.sdk.openadsdk.ryl.ouw.bly(this, "endcardDynamicCreatives"));
                        koVar2.ouw("multiOpenCovert", new com.bytedance.sdk.openadsdk.ryl.ouw.bly(this, "multiOpenCovert"));
                        koVar2.ouw("skipToNextAd", new com.bytedance.sdk.openadsdk.ryl.ouw.bly(this, "skipToNextAd"));
                        koVar2.ouw("speedVideoOrTimer", new com.bytedance.sdk.openadsdk.ryl.ouw.bly(this, "speedVideoOrTimer"));
                        koVar2.ouw("openPlayable", new com.bytedance.sdk.openadsdk.ryl.ouw.bly(this, "openPlayable"));
                        com.bytedance.sdk.component.ouw.ko koVar3 = this.vpp;
                        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.bly;
                        koVar3.ouw("closeWebview", new com.bytedance.sdk.openadsdk.ryl.ouw.th(leVar, "closeWebview", this, vppVar));
                        koVar3.ouw("makeVisible", new com.bytedance.sdk.openadsdk.ryl.ouw.th(leVar, "makeVisible", this, vppVar));
                        koVar3.ouw("getCurrentVisibleState", new com.bytedance.sdk.openadsdk.ryl.ouw.th(leVar, "getCurrentVisibleState", this, vppVar));
                    }
                    this.vpp.ouw("getNetworkData", new lh.vt() { // from class: com.bytedance.sdk.openadsdk.ryl.ouw.ouw.1
                        @Override // com.bytedance.sdk.component.ouw.lh.vt
                        public final com.bytedance.sdk.component.ouw.lh ouw() {
                            return new ouw(this.ouw);
                        }
                    });
                    this.vpp.ouw("interstitial_webview_close", new lh.vt() { // from class: com.bytedance.sdk.openadsdk.ryl.ouw.vt.1
                        @Override // com.bytedance.sdk.component.ouw.lh.vt
                        public final com.bytedance.sdk.component.ouw.lh ouw() {
                            return new vt(this.ouw);
                        }
                    });
                    this.vpp.ouw("newClickEvent", new lh.vt() { // from class: com.bytedance.sdk.openadsdk.ryl.ouw.lh.1
                        @Override // com.bytedance.sdk.component.ouw.lh.vt
                        public final com.bytedance.sdk.component.ouw.lh ouw() {
                            return new lh(this.ouw);
                        }
                    });
                    this.vpp.ouw("interactiveFinish", new com.bytedance.sdk.openadsdk.ryl.ouw.le(this));
                    this.vpp.ouw("overlayRenderFinish", new com.bytedance.sdk.openadsdk.ryl.ouw.cf(this));
                    this.vpp.ouw("commonConvert", new com.bytedance.sdk.openadsdk.ryl.ouw.ko(this));
                    this.vpp.ouw("preventTouchEvent", new com.bytedance.sdk.openadsdk.ryl.ouw.mwh(leVar));
                    this.vpp.ouw("getData", new com.bytedance.sdk.openadsdk.ryl.ouw.fkw(this.ryl));
                    this.vpp.ouw("expressAdViewStartZoom", new com.bytedance.sdk.openadsdk.ryl.ouw.yu(this));
                    com.bytedance.sdk.component.ouw.ko koVar4 = this.vpp;
                    final com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 = this.bly;
                    koVar4.ouw("requestDelayCallback", new lh.vt() { // from class: com.bytedance.sdk.openadsdk.ryl.ouw.jg.1
                        @Override // com.bytedance.sdk.component.ouw.lh.vt
                        public final com.bytedance.sdk.component.ouw.lh ouw() {
                            return new jg(this.ouw, vppVar2);
                        }
                    });
                    this.vpp.ouw("sendLogV3", new com.bytedance.sdk.openadsdk.ryl.ouw.rn(this));
                    this.vpp.ouw("stayDynamic", new com.bytedance.sdk.openadsdk.ryl.ouw.zih(this));
                    com.bytedance.sdk.openadsdk.ryl.ouw.ryl.ouw(this.vpp, this);
                    com.bytedance.sdk.openadsdk.ryl.ouw.vm.ouw(this.vpp, this.bly);
                    return this;
                }
                throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
            } catch (Exception unused) {
            }
        }
        return this;
    }

    public static JSONObject vt(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) throws JSONException {
        int iFqk;
        boolean zRyl;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (zih.yu() != null) {
            if (vppVar != null) {
                try {
                    iFqk = vppVar.fqk();
                } catch (Exception unused) {
                }
            } else {
                iFqk = 0;
            }
            int iUoy = vppVar != null ? vppVar.uoy() : 0;
            int iNg = vppVar != null ? vppVar.ng() : 0;
            int iMyk = vppVar != null ? vppVar.myk() : 0;
            zih.yu();
            boolean zFkw = com.bytedance.sdk.openadsdk.core.settings.cf.fkw(String.valueOf(iFqk));
            zih.yu();
            boolean z3 = com.bytedance.sdk.openadsdk.core.settings.cf.bly(String.valueOf(iFqk)) == 1;
            if (iUoy != 7 && iUoy != 8) {
                zih.yu();
                zRyl = com.bytedance.sdk.openadsdk.core.settings.cf.vt(String.valueOf(iFqk));
            } else {
                zih.yu();
                zRyl = com.bytedance.sdk.openadsdk.core.settings.cf.ryl(String.valueOf(iFqk));
            }
            jSONObject2.put("voice_control", zRyl);
            jSONObject2.put("rv_skip_time", iNg);
            jSONObject2.put("fv_skip_show", zFkw);
            jSONObject2.put("iv_skip_time", iMyk);
            jSONObject2.put("show_dislike", vppVar != null && vppVar.ksc());
            jSONObject2.put("video_adaptation", vppVar != null ? vppVar.wbf : 0);
            if (vppVar != null && (jSONObject = vppVar.smu) != null) {
                jSONObject2.put("dynamic_configs", jSONObject);
            }
            if (com.bytedance.sdk.openadsdk.core.model.th.lh(vppVar)) {
                jSONObject2.put("skip_change_to_close", true);
            } else {
                jSONObject2.put("skip_change_to_close", z3);
            }
            jSONObject2.put("bar_render_platform", vppVar.tpk ? 1 : 0);
        }
        return jSONObject2;
    }

    private void pno(JSONObject jSONObject) {
        int i4;
        double dOptDouble;
        double dOptDouble2;
        double dOptDouble3;
        double dOptDouble4;
        boolean z3;
        int i10;
        double d10;
        bs bsVar = this;
        if (bsVar.tlj == null || jSONObject == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar = bsVar.zin;
        if (fkwVar != null) {
            fkwVar.zih();
        }
        com.bytedance.sdk.component.adexpress.vt.jg jgVar = new com.bytedance.sdk.component.adexpress.vt.jg();
        jgVar.ouw = 1;
        try {
            boolean zOptBoolean = jSONObject.optBoolean("isRenderSuc");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("AdSize");
            if (jSONObjectOptJSONObject != null) {
                dOptDouble = jSONObjectOptJSONObject.optDouble("width");
                dOptDouble2 = jSONObjectOptJSONObject.optDouble("height");
            } else {
                dOptDouble = 0.0d;
                dOptDouble2 = 0.0d;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("videoInfo");
            if (jSONObjectOptJSONObject2 != null) {
                try {
                    dOptDouble3 = jSONObjectOptJSONObject2.optDouble("x");
                    dOptDouble4 = jSONObjectOptJSONObject2.optDouble("y");
                    z3 = zOptBoolean;
                    i10 = 101;
                } catch (Exception unused) {
                    i4 = 101;
                    bsVar = this;
                    jgVar.f7391jg = i4;
                    jgVar.mwh = pno.ouw(i4);
                    bsVar.tlj.ouw(jgVar);
                }
                try {
                    double dOptDouble5 = jSONObjectOptJSONObject2.optDouble("width");
                    double dOptDouble6 = jSONObjectOptJSONObject2.optDouble("height");
                    if (bly(jSONObjectOptJSONObject2)) {
                        d10 = dOptDouble2;
                        jgVar.ra = (float) jSONObjectOptJSONObject2.optDouble("borderRadiusTopLeft");
                        jgVar.pno = (float) jSONObjectOptJSONObject2.optDouble("borderRadiusTopRight");
                        jgVar.bly = (float) jSONObjectOptJSONObject2.optDouble("borderRadiusBottomLeft");
                        jgVar.tlj = (float) jSONObjectOptJSONObject2.optDouble("borderRadiusBottomRight");
                    } else {
                        d10 = dOptDouble2;
                    }
                    jgVar.fkw = dOptDouble3;
                    jgVar.f7392le = dOptDouble4;
                    jgVar.f7390cf = dOptDouble5;
                    jgVar.ryl = dOptDouble6;
                } catch (Exception unused2) {
                    bsVar = this;
                    i4 = 101;
                    jgVar.f7391jg = i4;
                    jgVar.mwh = pno.ouw(i4);
                    bsVar.tlj.ouw(jgVar);
                }
            } else {
                z3 = zOptBoolean;
                d10 = dOptDouble2;
                i10 = 101;
            }
        } catch (Exception unused3) {
        }
        try {
            String strOptString = jSONObject.optString("msg", pno.ouw(i10));
            i4 = i10;
            try {
                int iOptInt = jSONObject.optInt("code", i4);
                jgVar.vt = z3;
                jgVar.f7393lh = dOptDouble;
                jgVar.yu = d10;
                jgVar.mwh = strOptString;
                jgVar.f7391jg = iOptInt;
                bsVar = this;
                bsVar.tlj.ouw(jgVar);
            } catch (Exception unused4) {
                bsVar = this;
                jgVar.f7391jg = i4;
                jgVar.mwh = pno.ouw(i4);
                bsVar.tlj.ouw(jgVar);
            }
        } catch (Exception unused5) {
            bsVar = this;
            i4 = 101;
            jgVar.f7391jg = i4;
            jgVar.mwh = pno.ouw(i4);
            bsVar.tlj.ouw(jgVar);
        }
    }

    public final JSONObject lh(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        com.bytedance.sdk.openadsdk.core.bly.ko koVar = this.f8104cf;
        if (koVar != null) {
            try {
                jSONObject2.put("state", koVar.ouw(jSONObject) ? 1 : 0);
            } catch (Throwable unused) {
            }
        }
        return jSONObject2;
    }

    public final void vt(JSONObject jSONObject) {
        String str;
        double d10;
        double d11;
        double dOptDouble;
        double d12;
        double d13;
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            return;
        }
        com.bytedance.sdk.component.utils.qbp.ouw("TTAD.AndroidObject", "trigger Class1 method1");
        com.bytedance.sdk.component.utils.ko.vt("TTAD.AndroidObject", "TTAndroidObject handleClickEvent");
        try {
            String strOptString = jSONObject.optString("adId");
            int iOptInt = jSONObject.optInt("areaType", 1);
            String strOptString2 = jSONObject.optString("clickAreaType");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("clickInfo");
            double d14 = 0.0d;
            if (jSONObjectOptJSONObject2 != null) {
                double dOptDouble2 = jSONObjectOptJSONObject2.optDouble("down_x", 0.0d);
                dOptDouble = jSONObjectOptJSONObject2.optDouble("down_y", 0.0d);
                double dOptDouble3 = jSONObjectOptJSONObject2.optDouble("up_x", 0.0d);
                double dOptDouble4 = jSONObjectOptJSONObject2.optDouble("up_y", 0.0d);
                double dOptDouble5 = jSONObjectOptJSONObject2.optDouble("down_time", 0.0d);
                double dOptDouble6 = jSONObjectOptJSONObject2.optDouble("up_time", 0.0d);
                jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("rectInfo");
                d13 = dOptDouble6;
                d14 = dOptDouble2;
                d11 = dOptDouble3;
                d12 = dOptDouble5;
                str = strOptString;
                d10 = dOptDouble4;
            } else {
                str = strOptString;
                d10 = 0.0d;
                d11 = 0.0d;
                dOptDouble = 0.0d;
                d12 = 0.0d;
                d13 = 0.0d;
                jSONObjectOptJSONObject = null;
            }
            int iOptInt2 = jSONObject.optInt("clickAreaCategory", -1);
            ko.ouw ouwVar = new ko.ouw();
            ouwVar.f8238le = (float) d14;
            ouwVar.fkw = (float) dOptDouble;
            ouwVar.yu = (float) d11;
            ouwVar.f8239lh = (float) d10;
            ouwVar.vt = (long) d12;
            ouwVar.ouw = (long) d13;
            ouwVar.pno = strOptString2;
            ko.ouw ouwVarOuw = ouwVar.ouw(null);
            ouwVarOuw.ko = true;
            ouwVarOuw.bly = iOptInt;
            ouwVarOuw.tlj = jSONObjectOptJSONObject;
            ouwVarOuw.f8236cf = iOptInt2;
            ouwVarOuw.ryl = jSONObjectOptJSONObject2;
            com.bytedance.sdk.openadsdk.core.model.ko koVarOuw = ouwVarOuw.ouw();
            com.bytedance.sdk.component.adexpress.vt.cf cfVar = this.tlj;
            if (cfVar != null) {
                cfVar.ouw(null, iOptInt, koVarOuw);
            }
            vt(str);
        } catch (Exception unused) {
            com.bytedance.sdk.component.adexpress.vt.cf cfVar2 = this.tlj;
            if (cfVar2 != null) {
                cfVar2.ouw(null, -1, null);
            }
        }
    }

    private boolean vt(String str) {
        HashMap<String, tlj> map;
        if (TextUtils.isEmpty(str) || (map = this.lso) == null || map.get(str) == null) {
            return false;
        }
        throw null;
    }

    public final boolean vt() {
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.bly;
        if (vppVar == null || vppVar.qni == null || com.bytedance.sdk.openadsdk.core.model.od.vt(vppVar) || this.f8112ub || this.bly.qni.optInt("parent_type") != 2) {
            return false;
        }
        int iUoy = this.bly.uoy();
        if (iUoy != 8 && iUoy != 7) {
            return false;
        }
        this.f8112ub = true;
        return true;
    }

    public final void vt(final Uri uri) {
        int iIndexOf;
        try {
            String host = uri.getHost();
            if (!"log_event".equals(host) && !"custom_event".equals(host) && !"log_event_v3".equals(host)) {
                if (!"private".equals(host) && !"dispatch_message".equals(host)) {
                    com.bytedance.sdk.component.utils.ko.yu("TTAD.AndroidObject", "handlrUir: not match schema host");
                    return;
                }
                String string = uri.toString();
                if (string == null || !string.startsWith("bytedance://")) {
                    return;
                }
                try {
                    if (string.equals("bytedance://dispatch_message/")) {
                        WebView webViewRa = ra();
                        if (webViewRa != null) {
                            com.bytedance.sdk.component.utils.jg.ouw(webViewRa, "javascript:ToutiaoJSBridge._fetchQueue()");
                            return;
                        }
                        return;
                    }
                    if (string.startsWith("bytedance://private/setresult/") && (iIndexOf = string.indexOf(38, 30)) > 0) {
                        String strSubstring = string.substring(30, iIndexOf);
                        String strSubstring2 = string.substring(iIndexOf + 1);
                        if (!strSubstring.equals("SCENE_FETCHQUEUE") || strSubstring2.length() <= 0) {
                            return;
                        }
                        try {
                            String str = new String(Base64.decode(strSubstring2, 2));
                            com.bytedance.sdk.component.utils.ko.vt("TTAD.AndroidObject", str);
                            JSONArray jSONArray = new JSONArray(str);
                            int length = jSONArray.length();
                            for (int i4 = 0; i4 < length; i4++) {
                                vt vtVar = new vt();
                                try {
                                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i4);
                                    if (jSONObjectOptJSONObject != null) {
                                        vtVar.ouw = jSONObjectOptJSONObject.optString("__msg_type", null);
                                        vtVar.vt = jSONObjectOptJSONObject.optString("__callback_id", null);
                                        vtVar.f8115lh = jSONObjectOptJSONObject.optString("func");
                                        vtVar.yu = jSONObjectOptJSONObject.optJSONObject("params");
                                        vtVar.fkw = jSONObjectOptJSONObject.optInt("JSSDK");
                                    }
                                } catch (Throwable unused) {
                                }
                                if (!TextUtils.isEmpty(vtVar.ouw) && !TextUtils.isEmpty(vtVar.f8115lh)) {
                                    Message messageObtainMessage = this.fak.obtainMessage(11);
                                    messageObtainMessage.obj = vtVar;
                                    this.fak.sendMessage(messageObtainMessage);
                                }
                            }
                            return;
                        } catch (Exception unused2) {
                            if (com.bytedance.sdk.component.utils.ko.ouw()) {
                                com.bytedance.sdk.component.utils.ko.yu("TTAD.AndroidObject", "failed to parse jsbridge msg queue ".concat(strSubstring2));
                                return;
                            } else {
                                com.bytedance.sdk.component.utils.ko.yu("TTAD.AndroidObject", "failed to parse jsbridge msg queue");
                                return;
                            }
                        }
                    }
                    return;
                } catch (Exception unused3) {
                    return;
                }
            }
            com.bytedance.sdk.openadsdk.yu.lh.ouw(new com.bytedance.sdk.component.pno.pno("log_event_handleUri") { // from class: com.bytedance.sdk.openadsdk.core.bs.2
                @Override // java.lang.Runnable
                public final void run() throws JSONException, NumberFormatException {
                    long j;
                    String strOuw;
                    String queryParameter = uri.getQueryParameter("category");
                    String queryParameter2 = uri.getQueryParameter("tag");
                    bs.this.ex = queryParameter2;
                    String queryParameter3 = uri.getQueryParameter("label");
                    if (bs.vt(bs.this, queryParameter3)) {
                        long j8 = 0;
                        try {
                            j = Long.parseLong(uri.getQueryParameter("value"));
                        } catch (Exception unused4) {
                            j = 0;
                        }
                        try {
                            j8 = Long.parseLong(uri.getQueryParameter("ext_value"));
                        } catch (Exception unused5) {
                        }
                        long j9 = j8;
                        JSONObject jSONObject = null;
                        try {
                            String queryParameter4 = uri.getQueryParameter("extra");
                            if (!TextUtils.isEmpty(queryParameter4)) {
                                JSONObject jSONObject2 = new JSONObject(queryParameter4);
                                try {
                                    jSONObject2.putOpt("ua_policy", Integer.valueOf(bs.this.pno));
                                } catch (Throwable unused6) {
                                }
                                jSONObject = jSONObject2;
                            }
                        } catch (Throwable unused7) {
                        }
                        if ("click".equals(queryParameter3)) {
                            jSONObject = bs.this.ryl(jSONObject);
                        }
                        if ("landing_perf_error".equals(queryParameter3) || "landing_perf_stats".equals(queryParameter3)) {
                            try {
                                jSONObject = new JSONObject();
                                for (String str2 : uri.getQueryParameterNames()) {
                                    try {
                                        if ("extra".equals(str2)) {
                                            jSONObject.put("ad_extra_data", new JSONObject(uri.getQueryParameter(str2)).optString("ad_extra_data"));
                                        } else {
                                            jSONObject.put(str2, uri.getQueryParameter(str2));
                                        }
                                    } catch (Exception unused8) {
                                    }
                                }
                                strOuw = bs.this.ouw;
                            } catch (Exception unused9) {
                                return;
                            }
                        } else {
                            strOuw = bs.this.ouw(queryParameter2, queryParameter3);
                        }
                        com.bytedance.sdk.openadsdk.yu.lh.ouw(bs.this.bly, queryParameter, strOuw, queryParameter3, j, j9, jSONObject, com.bytedance.sdk.openadsdk.core.model.th.ra(bs.this.bly));
                    }
                }
            });
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.ko.vt("TTAD.AndroidObject", "handleUri exception: ", e2);
        }
    }

    public final void ouw() {
        com.bytedance.sdk.component.ouw.ko koVar = this.vpp;
        if (koVar == null) {
            return;
        }
        koVar.ouw();
        this.vpp = null;
    }

    public final bs ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        this.bly = vppVar;
        if (vppVar != null) {
            this.rrs = vppVar.qni;
        }
        return this;
    }

    public final bs ouw(Map<String, Object> map) {
        this.zih = map;
        return this;
    }

    public static void ouw(JSONObject jSONObject) throws Exception {
        JSONArray jSONArray = new JSONArray();
        Iterator it = Arrays.asList("appInfo", "adInfo", "getTemplateInfo", "getTeMaiAds").iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        jSONObject.put("appName", "open_news");
        jSONObject.put("innerAppName", bly.ouw().pno());
        jSONObject.put("aid", "1371");
        jSONObject.put("sdkEdition", BuildConfig.VERSION_NAME);
        jSONObject.put("appVersion", com.bytedance.sdk.openadsdk.utils.uoy.bly());
        jSONObject.put("netType", com.bytedance.sdk.openadsdk.common.lh.ouw());
        jSONObject.put("supportList", jSONArray);
        jSONObject.put("deviceId", ryl.ouw(zih.ouw()));
        if (DeviceUtils.vt(zih.ouw())) {
            jSONObject.put("device_platform", "Android_Pad");
        } else {
            jSONObject.put("device_platform", "Android");
        }
        jSONObject.put("device_type", Build.VERSION.RELEASE);
    }

    @Override // com.bytedance.sdk.openadsdk.cf.vt
    public final void vt(String str, JSONObject jSONObject) {
        ouw(str, jSONObject);
    }

    public static /* synthetic */ boolean vt(bs bsVar, String str) {
        if (TextUtils.isEmpty(str) || !"click_other".equals(str)) {
            return true;
        }
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = bsVar.bly;
        return vppVar != null && vppVar.qbp() == 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03bb A[PHI: r0
  0x03bb: PHI (r0v120 org.json.JSONObject) = (r0v105 org.json.JSONObject), (r0v121 org.json.JSONObject) binds: [B:257:0x0428, B:230:0x03b9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.json.JSONObject ouw(final com.bytedance.sdk.openadsdk.core.bs.vt r25, int r26) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.bs.ouw(com.bytedance.sdk.openadsdk.core.bs$vt, int):org.json.JSONObject");
    }

    private static boolean ouw(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        String strOptString;
        int iOptInt;
        String strOptString2;
        if (jSONObject != null) {
            iOptInt = jSONObject.optInt("landingStyle");
            strOptString = jSONObject.optString("url");
            strOptString2 = jSONObject.optString("fallback_url");
        } else {
            strOptString = null;
            iOptInt = -1;
            strOptString2 = null;
        }
        if (iOptInt == 1) {
            if (!com.bytedance.sdk.component.utils.vm.ouw(strOptString)) {
                try {
                    jSONObject2.put("invalid_url", 1);
                } catch (JSONException e2) {
                    com.bytedance.sdk.component.utils.qbp.ouw("TTAD.AndroidObject", "handleUrl, EX1->: ", e2);
                }
                return false;
            }
            return true;
        }
        if (iOptInt == 2) {
            try {
                if (TextUtils.isEmpty(strOptString) && TextUtils.isEmpty(strOptString2)) {
                    jSONObject2.put("empty_url", 1);
                    return false;
                }
                if (!com.bytedance.sdk.component.utils.vm.ouw(strOptString2)) {
                    jSONObject2.put("invalid_url", 1);
                    return false;
                }
            } catch (JSONException e10) {
                com.bytedance.sdk.component.utils.qbp.ouw("TTAD.AndroidObject", "handleUrl, EX2->: ", e10);
            }
        }
        return true;
    }

    private void ouw(String str, boolean z3) {
        if (this.zin == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (z3) {
            this.zin.ouw(str);
        } else {
            this.zin.vt(str);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.vt
    public final void ouw(String str) {
        com.bytedance.sdk.component.utils.ko.vt("TTAD.AndroidObject", "requestPauseVideo: ".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("time");
            String strOptString = jSONObject.optString("flag");
            com.bytedance.sdk.openadsdk.core.bly.ko koVar = this.f8104cf;
            if (koVar != null) {
                koVar.ouw(iOptInt, strOptString);
            }
        } catch (JSONException unused) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.AndroidObject", "requestPauseVideo json exception");
        }
    }

    public final void ouw(JSONObject jSONObject, final com.bytedance.sdk.openadsdk.mwh.yu yuVar) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        try {
            final com.bytedance.sdk.openadsdk.mwh.yu yuVar2 = new com.bytedance.sdk.openadsdk.mwh.yu() { // from class: com.bytedance.sdk.openadsdk.core.bs.9
                @Override // com.bytedance.sdk.openadsdk.mwh.yu
                public final void ouw(final boolean z3, final com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
                    com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bs.9.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            yuVar.ouw(z3, ouwVar);
                        }
                    });
                }
            };
            if (this.bly != null && !TextUtils.isEmpty(this.fkw)) {
                int iUoy = this.bly.uoy();
                AdSlot adSlot = this.bly.yiz;
                com.bytedance.sdk.openadsdk.core.model.ksc kscVar = new com.bytedance.sdk.openadsdk.core.model.ksc();
                kscVar.f8241le = true;
                com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.bly;
                if (vppVar.xn != null || vppVar.lht != null) {
                    kscVar.bly = 2;
                }
                JSONObject jSONObject2 = this.rrs;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                if (jSONObject != null && jSONObject.has("session_params") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("session_params")) != null) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject2.put(next, jSONObjectOptJSONObject.opt(next));
                    }
                }
                kscVar.ra = jSONObject2;
                if (jSONObject != null && jSONObject.has("common_params")) {
                    if (kscVar.pno == null) {
                        kscVar.pno = new JSONObject();
                    }
                    JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("common_params");
                    if (jSONObjectOptJSONObject2 != null) {
                        Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            kscVar.pno.put(next2, jSONObjectOptJSONObject2.opt(next2));
                        }
                    }
                }
                if (com.bytedance.sdk.openadsdk.utils.vt.ouw()) {
                    zih.lh().ouw(adSlot, kscVar, iUoy, (qbp) new zin() { // from class: com.bytedance.sdk.openadsdk.core.bs.10
                        @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
                        public final void ouw(int i4, String str) {
                            yuVar2.ouw(false, null);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
                        public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
                            bs.ouw(bs.this, ouwVar, lhVar, yuVar2);
                        }
                    });
                    return;
                } else {
                    zih.lh().ouw(adSlot, kscVar, iUoy, new vpp.ouw() { // from class: com.bytedance.sdk.openadsdk.core.bs.11
                        @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
                        public final void ouw(int i4, String str) {
                            yuVar2.ouw(false, null);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
                        public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
                            bs.ouw(bs.this, ouwVar, lhVar, yuVar2);
                        }
                    });
                    return;
                }
            }
            yuVar2.ouw(false, null);
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.qbp.ouw("TTAD.AndroidObject", "get ads error", e2);
        }
    }

    public static JSONArray ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
        com.bytedance.sdk.openadsdk.core.model.vpp vppVarLh;
        if (ouwVar == null || !ouwVar.vt() || (vppVarLh = ouwVar.lh()) == null || TextUtils.isEmpty(vppVarLh.bo)) {
            return null;
        }
        try {
            return new JSONObject(vppVarLh.bo).optJSONArray("creatives");
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void ouw(String str, JSONObject jSONObject) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "event");
            jSONObject2.put("__event_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            cf(jSONObject2);
        } catch (Exception unused) {
        }
    }

    public static boolean ouw(Uri uri) {
        if (uri == null) {
            return false;
        }
        if ("bytedance".equals(uri.getScheme())) {
            return uoy.containsKey(uri.getHost());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String ouw(String str, String str2) {
        if (com.bytedance.sdk.openadsdk.core.model.th.ra(this.bly)) {
            if ("show".equals(str2)) {
                return com.bytedance.sdk.openadsdk.utils.uoy.ouw(this.f8107le);
            }
            return "aggregate_page";
        }
        if (com.bytedance.sdk.openadsdk.core.model.od.fkw(this.bly)) {
            return this.ouw;
        }
        if (this.ko != null) {
            return com.bytedance.sdk.openadsdk.utils.uoy.ouw(this.f8107le);
        }
        return this.tlj == null ? com.bytedance.sdk.openadsdk.utils.uoy.vt(this.f8107le) : str;
    }

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public final void ouw(Message message) {
        if (message != null && message.what == 11) {
            Object obj = message.obj;
            if (obj instanceof vt) {
                try {
                    ouw((vt) obj, 1);
                } catch (Exception unused) {
                }
            }
        }
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar, String str, boolean z3) {
        com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar = new com.bytedance.sdk.openadsdk.core.lh.ouw(zih.ouw(), vppVar, str, this.f8107le);
        ouwVar.ouw(com.bytedance.sdk.openadsdk.qbp.ouw.ouw.yu.ouw(zih.ouw(), str));
        if (!z3) {
            ouwVar.yu = false;
        }
        ouwVar.onClick(null);
    }

    public final void ouw(JSONObject jSONObject, String str) {
        com.bytedance.sdk.openadsdk.core.bly.ko koVar = this.f8104cf;
        if (koVar != null) {
            koVar.ouw(str, jSONObject);
            return;
        }
        com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar = this.uq;
        if (vtVar != null) {
            vtVar.ouw(str, jSONObject);
        }
    }

    public static void ouw(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.vpp vppVar) throws Exception {
        String str = vppVar.pv;
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("cid", str);
        }
        String str2 = vppVar.yhj;
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("log_extra", str2);
        }
        String strHun = vppVar.hun();
        if (!TextUtils.isEmpty(strHun)) {
            jSONObject.put("download_url", strHun);
        }
        jSONObject.put("dc", TextUtils.isEmpty(zih.yu().zin()) ? zih.yu().zin() : "TX");
        jSONObject.put("language", ryl.vt());
        jSONObject.put("isRTL", com.bytedance.sdk.openadsdk.core.settings.cf.vt().osn());
    }

    public static /* synthetic */ void ouw(bs bsVar, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar, com.bytedance.sdk.openadsdk.mwh.yu yuVar) {
        List<com.bytedance.sdk.openadsdk.core.model.vpp> list = ouwVar.yu;
        if (list != null && !list.isEmpty()) {
            com.bytedance.sdk.openadsdk.core.model.vpp vppVar = ouwVar.yu.get(0);
            if (vppVar != null) {
                bsVar.rrs = vppVar.qni;
            }
            yuVar.ouw(true, ouwVar);
            return;
        }
        yuVar.ouw(false, null);
        lhVar.vt = -3;
        lhVar.ra = 7;
        com.bytedance.sdk.openadsdk.core.model.lh.ouw(lhVar);
    }
}
