package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.sf;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.vk;
import com.bytedance.sdk.openadsdk.core.sra;
import com.bytedance.sdk.openadsdk.core.xq.xq;
import com.bytedance.sdk.openadsdk.dg.emc;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.vw;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class rtt implements com.bytedance.sdk.component.adexpress.bw.ypw, sf.emc, com.bytedance.sdk.openadsdk.gbl.ypw {
    private static final Map<String, Boolean> msw;

    /* renamed from: aa, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.model.rie f9296aa;
    private int cf;
    private com.bytedance.sdk.openadsdk.core.xq.dg db;
    private WeakReference<com.bytedance.sdk.component.zz.ycc> dg;
    private JSONObject ee;
    protected Map<String, Object> emc;
    private WeakReference<View> gbl;
    private com.bytedance.sdk.openadsdk.sz.bw hxp;
    private com.bytedance.sdk.openadsdk.sz.ypw iyl;
    private com.bytedance.sdk.component.emc.cf mkp;
    private String mxo;
    private db pxa;
    private String qh;
    private com.bytedance.sdk.openadsdk.sz.uym ra;
    private com.bytedance.sdk.openadsdk.sz.emc rie;
    private xq rqm;
    private com.bytedance.sdk.openadsdk.dg.dg.bw rtt;
    private String ru;
    private com.bytedance.sdk.openadsdk.sz.xq sb;
    private JSONObject sba;
    private com.bytedance.sdk.openadsdk.sz.ru sf;
    private com.bytedance.sdk.openadsdk.gbl.dg sra;
    private String sup;
    private int sz;
    private com.bytedance.sdk.openadsdk.core.zz.cf ul;
    private com.bytedance.sdk.openadsdk.core.widget.bw uym;
    private com.bytedance.sdk.openadsdk.core.widget.emc.emc vw;
    private emc wa;
    private boolean wo;
    private com.bytedance.sdk.openadsdk.core.sz.dg.ypw wpn;
    private HashMap<String, ru> xmt;
    private boolean xxg;
    private String ycc;
    private JSONObject ylm;
    private Context yz;
    private com.bytedance.sdk.component.adexpress.ypw.gbl yzg;
    private com.bytedance.sdk.openadsdk.gbl.xq zz;
    private boolean vk = true;
    private boolean dr = true;
    private boolean lt = false;
    private boolean cuf = false;
    boolean ypw = false;
    boolean xq = false;
    private boolean tp = false;
    private final com.bytedance.sdk.component.utils.sf bw = new com.bytedance.sdk.component.utils.sf(Looper.getMainLooper(), this);

    public interface emc {
        void emc();
    }

    public static class xq implements Runnable {
        private final com.bytedance.sdk.openadsdk.core.zz.cf emc;
        private final JSONObject ypw;

        public xq(com.bytedance.sdk.openadsdk.core.zz.cf cfVar, JSONObject jSONObject) {
            this.emc = cfVar;
            this.ypw = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            rtt.ypw(this.emc, this.ypw);
        }
    }

    public static class ypw {
        public int bw;
        public JSONObject dg;
        public String emc;
        public String xq;
        public String ypw;
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        msw = concurrentHashMap;
        Boolean bool = Boolean.TRUE;
        concurrentHashMap.put("log_event", bool);
        concurrentHashMap.put("private", bool);
        concurrentHashMap.put("dispatch_message", bool);
        concurrentHashMap.put("custom_event", bool);
        concurrentHashMap.put("log_event_v3", bool);
    }

    public rtt(Context context) {
        this.yz = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aa(JSONObject jSONObject) {
        if (this.ul == null || jSONObject == null) {
            return;
        }
        try {
            this.ul.emc(jSONObject.optInt("stateType", -1));
        } catch (Exception unused) {
        }
    }

    private void cf(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.dg.dg.bw bwVar;
        if (jSONObject == null || (bwVar = this.rtt) == null) {
            return;
        }
        bwVar.ypw(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void db() {
        com.bytedance.sdk.openadsdk.core.zz.cf cfVar = this.ul;
        if (cfVar != null) {
            cfVar.emc();
        }
    }

    private boolean dr() {
        com.bytedance.sdk.openadsdk.core.model.rie rieVar = this.f9296aa;
        if (rieVar == null || rieVar.orp() == null || com.bytedance.sdk.openadsdk.core.model.dr.ypw(this.f9296aa) || this.lt || this.f9296aa.orp().optInt("parent_type") != 2) {
            return false;
        }
        int iMfx = this.f9296aa.mfx();
        if (iMfx != 8 && iMfx != 7) {
            return false;
        }
        this.lt = true;
        return true;
    }

    private void ee() {
        com.bytedance.sdk.openadsdk.sz.ru ruVar = this.sf;
        if (ruVar == null) {
            return;
        }
        ruVar.ypw();
    }

    private void hxp() {
        com.bytedance.sdk.openadsdk.sz.ru ruVar = this.sf;
        if (ruVar == null) {
            return;
        }
        ruVar.emc();
    }

    private void qh(JSONObject jSONObject) throws Exception {
        if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.model.dr.ru(this.f9296aa))) {
            return;
        }
        jSONObject.put("playable_style", com.bytedance.sdk.openadsdk.core.model.dr.ru(this.f9296aa));
    }

    private Context rie() {
        WeakReference<com.bytedance.sdk.component.zz.ycc> weakReference = this.dg;
        Activity activityEmc = (weakReference == null || weakReference.get() == null) ? null : com.bytedance.sdk.component.utils.ypw.emc(this.dg.get());
        return activityEmc == null ? this.yz : activityEmc;
    }

    private void sb() {
        if (this.yz == null || TextUtils.isEmpty(aa.dg().xxg())) {
            return;
        }
        TTWebsiteActivity.emc(this.yz, this.f9296aa, this.mxo);
    }

    private boolean sba(JSONObject jSONObject) throws JSONException {
        com.bytedance.sdk.openadsdk.core.zz.cf cfVar = this.ul;
        if (cfVar != null && jSONObject != null) {
            double dXq = cfVar.xq();
            double dDg = this.ul.dg();
            int iBw = this.ul.bw();
            com.bytedance.sdk.component.utils.ul.emc("TTAD.TopLayoutHelper", "current:", Double.valueOf(dXq), "state", Integer.valueOf(iBw), "countdownTime", Double.valueOf(dDg));
            try {
                jSONObject.put("currentTime", dXq / 1000.0d);
                if (dDg > 0.0d) {
                    jSONObject.put("countDownTime", dDg / 1000.0d);
                }
                jSONObject.put("state", iBw);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private JSONObject sf() {
        return ypw(this.f9296aa);
    }

    private static List<String> sra() {
        return Arrays.asList("appInfo", "adInfo", "getTemplateInfo", "getTeMaiAds");
    }

    private void sz(JSONObject jSONObject) throws Exception {
        emc(jSONObject, this.f9296aa);
    }

    private WebView ul() {
        com.bytedance.sdk.component.zz.ycc yccVar;
        WeakReference<com.bytedance.sdk.component.zz.ycc> weakReference = this.dg;
        if (weakReference == null || (yccVar = weakReference.get()) == null) {
            return null;
        }
        return yccVar.getWebView();
    }

    private void vk(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.sz.xq xqVar = this.sb;
        if (xqVar == null || jSONObject == null) {
            return;
        }
        xqVar.emc(jSONObject.optBoolean("isRenderSuc", false), jSONObject.optInt("code", -1), jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE, ""));
    }

    private void xmt() {
        if (this.zz == null) {
            this.zz = com.bytedance.sdk.openadsdk.gbl.emc.emc(this, this.f9296aa);
        }
    }

    private JSONObject ylm() {
        try {
            View view = this.gbl.get();
            com.bytedance.sdk.component.zz.ycc yccVar = this.dg.get();
            if (view != null && yccVar != null) {
                int[] iArrYpw = vw.ypw(view);
                int[] iArrYpw2 = vw.ypw((View) yccVar);
                if (iArrYpw != null && iArrYpw2 != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("x", vw.xq(aa.emc(), iArrYpw[0] - iArrYpw2[0]));
                    jSONObject.put("y", vw.xq(aa.emc(), iArrYpw[1] - iArrYpw2[1]));
                    jSONObject.put("w", vw.xq(aa.emc(), view.getWidth()));
                    jSONObject.put("h", vw.xq(aa.emc(), view.getHeight()));
                    jSONObject.put("isExist", true);
                    return jSONObject;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private void yzg(JSONObject jSONObject) {
        int i10;
        double dOptDouble;
        double dOptDouble2;
        double dOptDouble3;
        double dOptDouble4;
        boolean z10;
        int i11;
        double d10;
        rtt rttVar = this;
        if (rttVar.yzg == null || jSONObject == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.dg.dg.bw bwVar = rttVar.rtt;
        if (bwVar != null) {
            bwVar.vk();
        }
        com.bytedance.sdk.component.adexpress.ypw.qh qhVar = new com.bytedance.sdk.component.adexpress.ypw.qh();
        qhVar.emc(1);
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
                    z10 = zOptBoolean;
                    i11 = 101;
                } catch (Exception unused) {
                    i10 = 101;
                    rttVar = this;
                    qhVar.ypw(i10);
                    qhVar.emc(msw.emc(i10));
                    rttVar.yzg.emc(qhVar);
                }
                try {
                    double dOptDouble5 = jSONObjectOptJSONObject2.optDouble("width");
                    double dOptDouble6 = jSONObjectOptJSONObject2.optDouble("height");
                    if (rttVar.ul(jSONObjectOptJSONObject2)) {
                        d10 = dOptDouble2;
                        qhVar.emc((float) jSONObjectOptJSONObject2.optDouble("borderRadiusTopLeft"));
                        qhVar.ypw((float) jSONObjectOptJSONObject2.optDouble("borderRadiusTopRight"));
                        qhVar.xq((float) jSONObjectOptJSONObject2.optDouble("borderRadiusBottomLeft"));
                        qhVar.dg((float) jSONObjectOptJSONObject2.optDouble("borderRadiusBottomRight"));
                    } else {
                        d10 = dOptDouble2;
                    }
                    qhVar.xq(dOptDouble3);
                    qhVar.dg(dOptDouble4);
                    qhVar.bw(dOptDouble5);
                    qhVar.ycc(dOptDouble6);
                } catch (Exception unused2) {
                    rttVar = this;
                    i10 = 101;
                    qhVar.ypw(i10);
                    qhVar.emc(msw.emc(i10));
                    rttVar.yzg.emc(qhVar);
                }
            } else {
                z10 = zOptBoolean;
                d10 = dOptDouble2;
                i11 = 101;
            }
        } catch (Exception unused3) {
        }
        try {
            String strOptString = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE, msw.emc(i11));
            i10 = i11;
            try {
                int iOptInt = jSONObject.optInt("code", i10);
                qhVar.emc(z10);
                qhVar.emc(dOptDouble);
                qhVar.ypw(d10);
                qhVar.emc(strOptString);
                qhVar.ypw(iOptInt);
                rttVar = this;
                rttVar.yzg.emc(qhVar);
            } catch (Exception unused4) {
                rttVar = this;
                qhVar.ypw(i10);
                qhVar.emc(msw.emc(i10));
                rttVar.yzg.emc(qhVar);
            }
        } catch (Exception unused5) {
            rttVar = this;
            i10 = 101;
            qhVar.ypw(i10);
            qhVar.emc(msw.emc(i10));
            rttVar.yzg.emc(qhVar);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.bw.ypw
    @JavascriptInterface
    public String adInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            sz(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.bw.ypw
    @JavascriptInterface
    public String appInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            ypw(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.bw.ypw
    @JavascriptInterface
    public void changeVideoState(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.openadsdk.utils.iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.rtt.4
                @Override // java.lang.Runnable
                public void run() {
                    rtt.this.aa(jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.bw.ypw
    @JavascriptInterface
    public void clickEvent(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.openadsdk.utils.iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.rtt.5
                @Override // java.lang.Runnable
                public void run() {
                    rtt.this.bw(jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.bw.ypw
    @JavascriptInterface
    public void dynamicTrack(String str) {
        try {
            ylm(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    public void gbl() {
        dr();
    }

    @Override // com.bytedance.sdk.component.adexpress.bw.ypw
    @JavascriptInterface
    public String getCurrentVideoState() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        sba(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.bw.ypw
    @JavascriptInterface
    public String getData(String str) {
        if (TextUtils.isEmpty(str)) {
            return this.ylm.toString();
        }
        try {
            JSONObject jSONObjectEmc = com.bytedance.sdk.openadsdk.core.zz.emc.ypw.emc(this.ylm, new JSONObject(str));
            return jSONObjectEmc == null ? this.ylm.toString() : jSONObjectEmc.toString();
        } catch (Exception unused) {
            return this.ylm.toString();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.bw.ypw
    @JavascriptInterface
    public String getTemplateInfo() throws JSONException {
        emc("getTemplateInfo", true);
        try {
            JSONObject jSONObject = this.ylm;
            if (jSONObject != null) {
                jSONObject.put("setting", sf());
                com.bytedance.sdk.openadsdk.core.model.rie rieVar = this.f9296aa;
                if (rieVar != null && rieVar.ix() != null) {
                    this.ylm.put("dynamic_configs", this.f9296aa.ix());
                }
                com.bytedance.sdk.openadsdk.core.model.rie rieVar2 = this.f9296aa;
                if (rieVar2 != null) {
                    this.ylm.put("extension", rieVar2.lpq());
                }
            }
            emc("getTemplateInfo", false);
            return this.ylm.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.bw.ypw
    @JavascriptInterface
    public void initRenderFinish() {
        com.bytedance.sdk.openadsdk.utils.iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.rtt.7
            @Override // java.lang.Runnable
            public void run() {
                if (rtt.this.vw != null) {
                    rtt.this.vw.emc();
                }
            }
        });
    }

    public void msw() {
        com.bytedance.sdk.openadsdk.core.zz.cf cfVar = this.ul;
        if (cfVar != null) {
            cfVar.ypw();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.bw.ypw
    @JavascriptInterface
    public void muteVideo(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            xq xqVar = this.rqm;
            if (xqVar != null) {
                com.bytedance.sdk.openadsdk.utils.iyl.ypw(xqVar);
            }
            xq xqVar2 = new xq(this.ul, jSONObject);
            this.rqm = xqVar2;
            com.bytedance.sdk.openadsdk.utils.iyl.emc(xqVar2);
        } catch (Exception unused) {
            com.bytedance.sdk.component.utils.ul.xq("TTAD.AndroidObject", "");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.bw.ypw
    @JavascriptInterface
    public void renderDidFinish(String str) {
        try {
            yzg(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    public boolean ru() {
        com.bytedance.sdk.openadsdk.core.model.rie rieVar = this.f9296aa;
        return rieVar != null && rieVar.qp() == 1;
    }

    @Override // com.bytedance.sdk.component.adexpress.bw.ypw
    @JavascriptInterface
    public void skipVideo() {
        com.bytedance.sdk.openadsdk.utils.iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.rtt.6
            @Override // java.lang.Runnable
            public void run() {
                rtt.this.db();
            }
        });
    }

    public void sup() {
        com.bytedance.sdk.openadsdk.gbl.xq xqVar = this.zz;
        if (xqVar != null) {
            xqVar.emc();
        }
        xq xqVar2 = this.rqm;
        if (xqVar2 != null) {
            com.bytedance.sdk.openadsdk.utils.iyl.ypw(xqVar2);
            this.rqm = null;
        }
        this.yz = null;
        this.wpn = null;
    }

    public void uym() {
        com.bytedance.sdk.openadsdk.sz.xq xqVar;
        if (this.xxg && (xqVar = this.sb) != null) {
            xqVar.emc();
            return;
        }
        Context context = this.yz;
        if ((context instanceof Activity) && com.bytedance.sdk.openadsdk.utils.rie.emc((Activity) context)) {
            ((Activity) this.yz).finish();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.bw.ypw
    @JavascriptInterface
    public void videoFrameChanged(String str) {
        if (this.ra == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.component.adexpress.ypw.qh qhVar = new com.bytedance.sdk.component.adexpress.ypw.qh();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("videoInfo");
            if (jSONObjectOptJSONObject != null) {
                double dOptDouble = jSONObjectOptJSONObject.optDouble("x");
                double dOptDouble2 = jSONObjectOptJSONObject.optDouble("y");
                double dOptDouble3 = jSONObjectOptJSONObject.optDouble("width");
                double dOptDouble4 = jSONObjectOptJSONObject.optDouble("height");
                if (ul(jSONObjectOptJSONObject)) {
                    qhVar.emc((float) jSONObjectOptJSONObject.optDouble("borderRadiusTopLeft"));
                    qhVar.ypw((float) jSONObjectOptJSONObject.optDouble("borderRadiusTopRight"));
                    qhVar.xq((float) jSONObjectOptJSONObject.optDouble("borderRadiusBottomLeft"));
                    qhVar.dg((float) jSONObjectOptJSONObject.optDouble("borderRadiusBottomRight"));
                }
                qhVar.xq(dOptDouble);
                qhVar.dg(dOptDouble2);
                qhVar.bw(dOptDouble3);
                qhVar.ycc(dOptDouble4);
            }
            com.bytedance.sdk.openadsdk.sz.uym uymVar = this.ra;
            if (uymVar != null) {
                uymVar.emc(qhVar);
            }
        } catch (Throwable unused) {
        }
    }

    public boolean ycc() {
        return this.ypw;
    }

    public boolean zz() {
        return this.tp;
    }

    private void sra(JSONObject jSONObject) {
        if (jSONObject == null || this.sra == null) {
            return;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("temaiProductIds");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                this.sra.emc(false, null);
            } else {
                this.sra.emc(true, jSONArrayOptJSONArray);
            }
        } catch (Exception unused) {
            this.sra.emc(false, null);
        }
    }

    private void zz(String str) {
        int iIndexOf;
        if (str != null && str.startsWith("bytedance://")) {
            try {
                if (str.equals("bytedance://dispatch_message/")) {
                    WebView webViewUl = ul();
                    if (webViewUl != null) {
                        com.bytedance.sdk.component.utils.qh.emc(webViewUl, "javascript:ToutiaoJSBridge._fetchQueue()");
                        return;
                    }
                    return;
                }
                if (str.startsWith("bytedance://private/setresult/") && (iIndexOf = str.indexOf(38, 30)) > 0) {
                    String strSubstring = str.substring(30, iIndexOf);
                    String strSubstring2 = str.substring(iIndexOf + 1);
                    if (!strSubstring.equals("SCENE_FETCHQUEUE") || strSubstring2.length() <= 0) {
                        return;
                    }
                    uym(strSubstring2);
                }
            } catch (Exception unused) {
            }
        }
    }

    public boolean bw() {
        com.bytedance.sdk.openadsdk.core.model.rie rieVar = this.f9296aa;
        return rieVar != null && rieVar.rgy();
    }

    public com.bytedance.sdk.openadsdk.core.model.rie dg() {
        return this.f9296aa;
    }

    public void gbl(JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS);
        db dbVar = this.pxa;
        if (dbVar != null) {
            if (iOptInt == 1) {
                dbVar.p_();
            } else if (iOptInt == 2) {
                dbVar.q_();
            }
        }
    }

    public void sz() {
        emc emcVar = this.wa;
        if (emcVar != null) {
            emcVar.emc();
        }
    }

    public rtt xq(String str) {
        this.ru = str;
        return this;
    }

    public void ycc(String str) {
        this.mxo = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject hxp(JSONObject jSONObject) throws JSONException {
        if (this.emc != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                String strOptString = jSONObject.optString("ad_extra_data", null);
                if (strOptString != null) {
                    jSONObject2 = new JSONObject(strOptString);
                }
                for (Map.Entry<String, Object> entry : this.emc.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.ul.xq(e10.toString(), new Object[0]);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean msw(String str) {
        if (!TextUtils.isEmpty(str) && "click_other".equals(str)) {
            return ru();
        }
        return true;
    }

    public rtt bw(String str) {
        this.qh = str;
        return this;
    }

    public void cf() {
        db dbVar = this.pxa;
        if (dbVar != null) {
            dbVar.m_();
        }
    }

    public rtt dg(String str) {
        this.sup = str;
        return this;
    }

    public com.bytedance.sdk.openadsdk.core.sz.dg.ypw qh() {
        return this.wpn;
    }

    public void ru(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.emc emcVarDg;
        if (jSONObject == null) {
            return;
        }
        int iOptInt = jSONObject.optInt("index");
        com.bytedance.sdk.openadsdk.core.model.rie rieVar = this.f9296aa;
        if (rieVar == null || (emcVarDg = rieVar.dg()) == null) {
            return;
        }
        List<com.bytedance.sdk.openadsdk.core.model.rie> listDg = emcVarDg.dg();
        if (iOptInt < 0 || iOptInt >= listDg.size()) {
            return;
        }
        emc(listDg.get(iOptInt), this.mxo, false);
        com.bytedance.sdk.openadsdk.core.sz.dg.ypw ypwVar = this.wpn;
        if (ypwVar != null) {
            ypwVar.hj();
        }
    }

    public void vk() {
        db dbVar = this.pxa;
        if (dbVar != null) {
            dbVar.n_();
        }
    }

    public void xq() {
        com.bytedance.sdk.component.emc.cf cfVar = this.mkp;
        if (cfVar == null) {
            return;
        }
        cfVar.emc();
        this.mkp = null;
    }

    public void ycc(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.rie rieVarEmc = com.bytedance.sdk.openadsdk.core.ypw.emc(jSONObject);
        if (rieVarEmc != null) {
            boolean zUym = com.bytedance.sdk.openadsdk.core.model.ul.uym(this.f9296aa);
            emc(rieVarEmc, zUym ? com.bytedance.sdk.openadsdk.utils.tp.ypw(this.sz) : this.mxo, !zUym);
        }
    }

    private void rie(JSONObject jSONObject) {
        WebView webViewUl;
        if (jSONObject == null || (webViewUl = ul()) == null) {
            return;
        }
        com.bytedance.sdk.component.utils.qh.emc(webViewUl, "javascript:ToutiaoJSBridge._handleMessageFromToutiao(" + jSONObject + ")");
    }

    private boolean ul(@NonNull JSONObject jSONObject) {
        return jSONObject.has("borderRadiusTopLeft") && jSONObject.has("borderRadiusBottomLeft") && jSONObject.has("borderRadiusTopRight") && jSONObject.has("borderRadiusBottomRight");
    }

    public JSONObject aa() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            db dbVar = this.pxa;
            if (dbVar != null) {
                jSONObject.put("leftTime", dbVar.o_());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public void bw(JSONObject jSONObject) {
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
        com.bytedance.sdk.component.utils.ul.emc("TTAD.AndroidObject", "trigger Class1 method1");
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
            com.bytedance.sdk.openadsdk.core.model.vk vkVarEmc = new vk.emc().dg((float) d14).xq((float) dOptDouble).ypw((float) d11).emc((float) d10).ypw((long) d12).emc((long) d13).emc(strOptString2).emc((SparseArray<xq.emc>) null).emc(true).ypw(iOptInt).emc(jSONObjectOptJSONObject).emc(jSONObject.optInt("clickAreaCategory", -1)).ypw(jSONObjectOptJSONObject2).emc();
            com.bytedance.sdk.component.adexpress.ypw.gbl gblVar = this.yzg;
            if (gblVar != null) {
                gblVar.emc(null, iOptInt, vkVarEmc);
            }
            emc(str, iOptInt, vkVarEmc);
        } catch (Exception unused) {
            com.bytedance.sdk.component.adexpress.ypw.gbl gblVar2 = this.yzg;
            if (gblVar2 != null) {
                gblVar2.emc(null, -1, null);
            }
        }
    }

    public void dg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        int iOptInt = jSONObject.optInt("zoom_type", 1);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("videoInfo");
        com.bytedance.sdk.component.adexpress.ypw.qh qhVar = new com.bytedance.sdk.component.adexpress.ypw.qh();
        if (jSONObjectOptJSONObject != null) {
            double dOptDouble = jSONObjectOptJSONObject.optDouble("x");
            double dOptDouble2 = jSONObjectOptJSONObject.optDouble("y");
            double dOptDouble3 = jSONObjectOptJSONObject.optDouble("width");
            double dOptDouble4 = jSONObjectOptJSONObject.optDouble("height");
            qhVar.xq(dOptDouble);
            qhVar.dg(dOptDouble2);
            qhVar.bw(dOptDouble3);
            qhVar.ycc(dOptDouble4);
        }
        com.bytedance.sdk.openadsdk.core.zz.cf cfVar = this.ul;
        if (cfVar != null) {
            cfVar.emc(iOptInt, qhVar);
        }
    }

    public rtt ypw(String str) {
        this.ycc = str;
        return this;
    }

    private void uym(String str) {
        try {
            JSONArray jSONArray = new JSONArray(new String(Base64.decode(str, 2)));
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                ypw ypwVar = new ypw();
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        ypwVar.emc = jSONObjectOptJSONObject.optString("__msg_type", null);
                        ypwVar.ypw = jSONObjectOptJSONObject.optString("__callback_id", null);
                        ypwVar.xq = jSONObjectOptJSONObject.optString("func");
                        ypwVar.dg = jSONObjectOptJSONObject.optJSONObject("params");
                        ypwVar.bw = jSONObjectOptJSONObject.optInt("JSSDK");
                    }
                } catch (Throwable unused) {
                }
                if (!TextUtils.isEmpty(ypwVar.emc) && !TextUtils.isEmpty(ypwVar.xq)) {
                    Message messageObtainMessage = this.bw.obtainMessage(11);
                    messageObtainMessage.obj = ypwVar;
                    this.bw.sendMessage(messageObtainMessage);
                }
            }
        } catch (Exception unused2) {
        }
    }

    public com.bytedance.sdk.component.emc.cf ypw() {
        return this.mkp;
    }

    public JSONObject msw(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        com.bytedance.sdk.openadsdk.core.zz.cf cfVar = this.ul;
        if (cfVar != null) {
            try {
                jSONObject2.put("state", cfVar.emc(jSONObject) ? 1 : 0);
            } catch (Throwable unused) {
            }
        }
        return jSONObject2;
    }

    public void xq(JSONObject jSONObject) {
        sba.emc(rie(), this.yz instanceof Activity, jSONObject, this.f9296aa, this.mxo, this.sz, ul(), this.uym);
    }

    public rtt ypw(com.bytedance.sdk.component.zz.ycc yccVar) {
        this.dg = new WeakReference<>(yccVar);
        return this;
    }

    public rtt ypw(int i10) {
        this.sz = i10;
        return this;
    }

    public static void ypw(JSONObject jSONObject) throws Exception {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = sra().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        jSONObject.put("appName", com.bytedance.sdk.openadsdk.common.xq.emc());
        jSONObject.put("innerAppName", com.bytedance.sdk.openadsdk.common.xq.bw());
        jSONObject.put("aid", com.bytedance.sdk.openadsdk.common.xq.ypw());
        jSONObject.put("sdkEdition", com.bytedance.sdk.openadsdk.common.xq.xq());
        jSONObject.put("appVersion", com.bytedance.sdk.openadsdk.common.xq.dg());
        jSONObject.put("netType", com.bytedance.sdk.openadsdk.common.xq.ycc());
        jSONObject.put("supportList", jSONArray);
        jSONObject.put("deviceId", com.bytedance.sdk.openadsdk.common.xq.emc(aa.emc()));
        if (DeviceUtils.ypw(aa.emc())) {
            jSONObject.put("device_platform", "Android_Pad");
        } else {
            jSONObject.put("device_platform", "Android");
        }
        jSONObject.put("device_type", Build.VERSION.RELEASE);
    }

    public rtt emc(com.bytedance.sdk.openadsdk.core.widget.emc.emc emcVar) {
        this.vw = emcVar;
        return this;
    }

    public void sup(final JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.dg.xq.emc(new com.bytedance.sdk.component.msw.msw("sendLogV3") { // from class: com.bytedance.sdk.openadsdk.core.rtt.3
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extJson");
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("category") && jSONObjectOptJSONObject.has("tag") && jSONObjectOptJSONObject.has("label")) {
                    String strOptString = jSONObjectOptJSONObject.optString("category");
                    String strOptString2 = jSONObjectOptJSONObject.optString("tag");
                    String strOptString3 = jSONObjectOptJSONObject.optString("label");
                    long jOptLong = jSONObject.optLong(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                    long jOptLong2 = jSONObject.optLong("extValue");
                    try {
                        jSONObjectOptJSONObject.put("ua_policy", rtt.this.cf);
                    } catch (Exception unused) {
                    }
                    new emc.C0170emc(System.currentTimeMillis(), rtt.this.f9296aa).dg(strOptString).ypw(strOptString2).xq(strOptString3).bw(String.valueOf(jOptLong)).ycc(String.valueOf(jOptLong2)).emc(jSONObjectOptJSONObject).emc((com.bytedance.sdk.openadsdk.dg.ypw.emc) null);
                }
            }
        });
    }

    public rtt emc(com.bytedance.sdk.openadsdk.core.widget.bw bwVar) {
        this.uym = bwVar;
        return this;
    }

    public void sba() {
        db dbVar = this.pxa;
        if (dbVar != null) {
            dbVar.r_();
        }
    }

    public com.bytedance.sdk.openadsdk.sz.ypw emc() {
        return this.iyl;
    }

    private void xq(String str, JSONObject jSONObject) throws JSONException {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", NotificationCompat.CATEGORY_EVENT);
            jSONObject2.put("__event_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            rie(jSONObject2);
        } catch (Exception unused) {
        }
    }

    private void ylm(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Uri uri = Uri.parse(jSONObject.optString("trackData"));
            if ("bytedance".equals(uri.getScheme().toLowerCase())) {
                com.bytedance.sdk.openadsdk.utils.yzg.emc(uri, this);
            }
        } catch (Exception unused) {
        }
    }

    public void emc(com.bytedance.sdk.openadsdk.sz.ypw ypwVar) {
        this.iyl = ypwVar;
    }

    public rtt emc(com.bytedance.sdk.component.zz.ycc yccVar) {
        WebView webView;
        if (yccVar != null && (webView = yccVar.getWebView()) != null) {
            try {
                this.mkp = com.bytedance.sdk.component.emc.cf.emc(webView).emc(new com.bytedance.sdk.openadsdk.sup.emc()).emc("ToutiaoJSBridge").emc(new com.bytedance.sdk.component.emc.ru() { // from class: com.bytedance.sdk.openadsdk.core.rtt.1
                    @Override // com.bytedance.sdk.component.emc.ru
                    @NonNull
                    public <T> T emc(@NonNull String str, @NonNull Type type) {
                        return null;
                    }

                    @Override // com.bytedance.sdk.component.emc.ru
                    @NonNull
                    public <T> String emc(@NonNull T t10) {
                        return null;
                    }
                }).emc(zz.ypw().aa()).ypw(true).emc();
                if (com.bytedance.sdk.openadsdk.sra.emc.uym()) {
                    com.bytedance.sdk.openadsdk.sup.emc.msw.emc(this.mkp, this);
                    com.bytedance.sdk.openadsdk.sup.emc.ru.emc(this.mkp, this);
                    com.bytedance.sdk.openadsdk.sup.emc.ul.emc(this.mkp, yccVar, this, this.f9296aa);
                } else {
                    com.bytedance.sdk.openadsdk.sup.emc.uym.emc(this.mkp, this);
                    com.bytedance.sdk.openadsdk.sup.emc.zz.emc(this.mkp, this);
                    com.bytedance.sdk.openadsdk.sup.emc.yzg.emc(this.mkp, yccVar, this, this.f9296aa);
                }
                com.bytedance.sdk.openadsdk.sup.emc.emc.emc(this.mkp, this);
                com.bytedance.sdk.openadsdk.sup.emc.ypw.emc(this.mkp, this);
                com.bytedance.sdk.openadsdk.sup.emc.xq.emc(this.mkp, this);
                com.bytedance.sdk.openadsdk.sup.emc.ycc.emc(this.mkp, this);
                com.bytedance.sdk.openadsdk.sup.emc.gbl.emc(this.mkp, this);
                com.bytedance.sdk.openadsdk.sup.emc.cf.emc(this.mkp, this);
                com.bytedance.sdk.openadsdk.sup.emc.sz.emc(this.mkp, yccVar);
                com.bytedance.sdk.openadsdk.sup.emc.bw.emc(this.mkp, this.ylm);
                com.bytedance.sdk.openadsdk.sup.emc.dg.emc(this.mkp, this);
                com.bytedance.sdk.openadsdk.sup.emc.qh.emc(this.mkp, this, this.f9296aa);
                com.bytedance.sdk.openadsdk.sup.emc.vk.emc(this.mkp, this);
                com.bytedance.sdk.openadsdk.sup.emc.aa.emc(this.mkp, this);
                com.bytedance.sdk.openadsdk.sup.emc.sup.emc(this.mkp, this);
                com.bytedance.sdk.openadsdk.sup.emc.sba.emc(this.mkp, this.f9296aa);
            } catch (Exception unused) {
            }
        }
        return this;
    }

    public JSONObject zz(JSONObject jSONObject) throws JSONException {
        List<com.bytedance.sdk.openadsdk.core.model.rie> listFfd;
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            com.bytedance.sdk.openadsdk.core.sz.dg.ypw ypwVar = this.wpn;
            if (ypwVar != null && (listFfd = ypwVar.ffd()) != null) {
                for (int i10 = 0; i10 < listFfd.size(); i10++) {
                    jSONArray.put(xq(listFfd.get(i10)));
                }
            }
            jSONObject2.put("creatives", jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public void dg(boolean z10) {
        this.xxg = z10;
    }

    public void xq(int i10) {
        com.bytedance.sdk.openadsdk.core.zz.cf cfVar = this.ul;
        if (cfVar != null) {
            cfVar.ypw(i10);
        }
    }

    public JSONObject uym(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        com.bytedance.sdk.openadsdk.core.zz.cf cfVar = this.ul;
        if (cfVar != null) {
            try {
                jSONObject2.put("state", cfVar.ypw(jSONObject) ? 1 : 0);
            } catch (Throwable unused) {
            }
        }
        return jSONObject2;
    }

    public void xq(boolean z10) {
        this.wo = z10;
    }

    private JSONObject xq(com.bytedance.sdk.openadsdk.core.model.rie rieVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("is_ad_event", "1");
        jSONObject2.put(BidResponsedEx.KEY_CID, rieVar.wa());
        jSONObject2.put("req_id", rieVar.lvs());
        jSONObject2.put("ad_id", rieVar.ye());
        jSONObject2.put("log_extra", rieVar.wdp());
        jSONObject2.put("isRTL", com.bytedance.sdk.openadsdk.core.settings.gbl.xq().pm());
        jSONObject.put("ad_info", jSONObject2);
        jSONObject.put("endcard_creative", rieVar.rqm());
        jSONObject.put("dynamic_creative", rieVar.etw());
        jSONObject.put(CampaignEx.JSON_KEY_TITLE, rieVar.xou());
        com.bytedance.sdk.openadsdk.core.model.rie.emc(rieVar, jSONObject);
        com.bytedance.sdk.openadsdk.core.model.rie.ypw(rieVar, jSONObject);
        jSONObject.put("source", rieVar.hs());
        jSONObject.put("button_text", rieVar.ng());
        com.bytedance.sdk.openadsdk.core.model.sz szVarKda = rieVar.kda();
        if (szVarKda != null) {
            jSONObject.put("deeplink_url", szVarKda.emc());
        }
        jSONObject.put("app_name", rieVar.igv());
        jSONObject.put("has_show", rieVar.yz() ? 1 : 0);
        jSONObject.put("has_click", rieVar.pdv() ? 1 : 0);
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ypw(com.bytedance.sdk.openadsdk.core.zz.cf cfVar, JSONObject jSONObject) {
        if (cfVar == null || jSONObject == null) {
            return;
        }
        try {
            cfVar.emc(jSONObject.optBoolean(CampaignEx.JSON_NATIVE_VIDEO_MUTE, false), !jSONObject.has(CampaignEx.JSON_NATIVE_VIDEO_MUTE) ? "jsb_def" : "jsb_web");
        } catch (Exception unused) {
        }
    }

    public static JSONObject ypw(com.bytedance.sdk.openadsdk.core.model.rie rieVar) throws JSONException {
        int iTx;
        boolean zAa;
        JSONObject jSONObject = new JSONObject();
        if (aa.dg() != null) {
            if (rieVar != null) {
                try {
                    iTx = rieVar.tx();
                } catch (Exception unused) {
                }
            } else {
                iTx = 0;
            }
            int iMfx = rieVar != null ? rieVar.mfx() : 0;
            int iIw = rieVar != null ? rieVar.iw() : 0;
            int iBhr = rieVar != null ? rieVar.bhr() : 0;
            boolean zYcc = aa.dg().ycc(String.valueOf(iTx));
            boolean z10 = aa.dg().sz(String.valueOf(iTx)) == 1;
            if (iMfx != 7 && iMfx != 8) {
                zAa = aa.dg().xq(String.valueOf(iTx));
            } else {
                zAa = aa.dg().aa(String.valueOf(iTx));
            }
            jSONObject.put("voice_control", zAa);
            jSONObject.put("rv_skip_time", iIw);
            jSONObject.put("fv_skip_show", zYcc);
            jSONObject.put("iv_skip_time", iBhr);
            jSONObject.put("show_dislike", rieVar != null && rieVar.lr());
            jSONObject.put("video_adaptation", rieVar != null ? rieVar.se() : 0);
            jSONObject.put("splash_image_count_down_time", aa.dg().rie(String.valueOf(iTx)));
            if (rieVar != null && rieVar.ix() != null) {
                jSONObject.put("dynamic_configs", rieVar.ix());
            }
            if (com.bytedance.sdk.openadsdk.core.model.ul.xq(rieVar)) {
                jSONObject.put("skip_change_to_close", true);
            } else {
                jSONObject.put("skip_change_to_close", z10);
            }
            jSONObject.put("bar_render_platform", rieVar.wpn() ? 1 : 0);
        }
        return jSONObject;
    }

    public void yzg() {
        com.bytedance.sdk.openadsdk.core.sz.dg.ypw ypwVar = this.wpn;
        if (ypwVar != null) {
            ypwVar.lt();
        }
    }

    public rtt emc(com.bytedance.sdk.openadsdk.dg.dg.bw bwVar) {
        this.rtt = bwVar;
        return this;
    }

    public rtt emc(boolean z10) {
        this.cuf = z10;
        return this;
    }

    public rtt emc(View view) {
        this.gbl = new WeakReference<>(view);
        return this;
    }

    public rtt emc(int i10) {
        this.cf = i10;
        return this;
    }

    public rtt emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        this.f9296aa = rieVar;
        if (rieVar != null) {
            this.sba = rieVar.orp();
        }
        return this;
    }

    public rtt emc(com.bytedance.sdk.openadsdk.sz.xq xqVar) {
        this.sb = xqVar;
        return this;
    }

    public rtt emc(com.bytedance.sdk.openadsdk.sz.ru ruVar) {
        this.sf = ruVar;
        return this;
    }

    public rtt emc(Map<String, Object> map) {
        this.emc = map;
        return this;
    }

    public rtt emc(com.bytedance.sdk.component.adexpress.ypw.gbl gblVar) {
        this.yzg = gblVar;
        return this;
    }

    public rtt emc(com.bytedance.sdk.openadsdk.core.zz.cf cfVar) {
        this.ul = cfVar;
        return this;
    }

    public void ypw(boolean z10) {
        this.ypw = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(String str, JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "callback");
            jSONObject2.put("__callback_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            rie(jSONObject2);
        } catch (Exception unused) {
        }
    }

    public rtt emc(JSONObject jSONObject) {
        this.ylm = jSONObject;
        return this;
    }

    public rtt emc(com.bytedance.sdk.openadsdk.sz.emc emcVar) {
        this.rie = emcVar;
        return this;
    }

    public rtt emc(com.bytedance.sdk.openadsdk.sz.bw bwVar) {
        this.hxp = bwVar;
        return this;
    }

    public rtt emc(com.bytedance.sdk.openadsdk.sz.uym uymVar) {
        this.ra = uymVar;
        return this;
    }

    public static void emc(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.rie rieVar) throws Exception {
        String strYe = rieVar.ye();
        if (!TextUtils.isEmpty(strYe)) {
            jSONObject.put(BidResponsedEx.KEY_CID, strYe);
        }
        String strWdp = rieVar.wdp();
        if (!TextUtils.isEmpty(strWdp)) {
            jSONObject.put("log_extra", strWdp);
        }
        String strDrx = rieVar.drx();
        if (!TextUtils.isEmpty(strDrx)) {
            jSONObject.put(DownloadModel.DOWNLOAD_URL, strDrx);
        }
        jSONObject.put("dc", TextUtils.isEmpty(aa.dg().pxa()) ? aa.dg().pxa() : "TX");
        jSONObject.put("language", sup.ypw());
        jSONObject.put("isRTL", com.bytedance.sdk.openadsdk.core.settings.gbl.xq().pm());
    }

    public void ypw(@NonNull final Uri uri) {
        try {
            String host = uri.getHost();
            if (!"log_event".equals(host) && !"custom_event".equals(host) && !"log_event_v3".equals(host)) {
                if ("private".equals(host) || "dispatch_message".equals(host)) {
                    zz(uri.toString());
                    return;
                }
                return;
            }
            com.bytedance.sdk.openadsdk.dg.xq.emc(new com.bytedance.sdk.component.msw.msw("log_event_handleUri") { // from class: com.bytedance.sdk.openadsdk.core.rtt.2
                @Override // java.lang.Runnable
                public void run() throws JSONException, NumberFormatException {
                    long j10;
                    String strEmc;
                    String queryParameter = uri.getQueryParameter("category");
                    String queryParameter2 = uri.getQueryParameter("tag");
                    rtt.this.mxo = queryParameter2;
                    String queryParameter3 = uri.getQueryParameter("label");
                    if (rtt.this.msw(queryParameter3)) {
                        long j11 = 0;
                        try {
                            j10 = Long.parseLong(uri.getQueryParameter(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                        } catch (Exception unused) {
                            j10 = 0;
                        }
                        try {
                            j11 = Long.parseLong(uri.getQueryParameter("ext_value"));
                        } catch (Exception unused2) {
                        }
                        long j12 = j11;
                        JSONObject jSONObject = null;
                        try {
                            String queryParameter4 = uri.getQueryParameter("extra");
                            if (!TextUtils.isEmpty(queryParameter4)) {
                                JSONObject jSONObject2 = new JSONObject(queryParameter4);
                                try {
                                    jSONObject2.putOpt("ua_policy", Integer.valueOf(rtt.this.cf));
                                } catch (Throwable unused3) {
                                }
                                jSONObject = jSONObject2;
                            }
                        } catch (Throwable unused4) {
                        }
                        if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(queryParameter3)) {
                            jSONObject = rtt.this.hxp(jSONObject);
                        }
                        if ("landing_perf_error".equals(queryParameter3) || "landing_perf_stats".equals(queryParameter3)) {
                            try {
                                jSONObject = new JSONObject();
                                for (String str : uri.getQueryParameterNames()) {
                                    try {
                                        if ("extra".equals(str)) {
                                            jSONObject.put("ad_extra_data", new JSONObject(uri.getQueryParameter(str)).optString("ad_extra_data"));
                                        } else {
                                            jSONObject.put(str, uri.getQueryParameter(str));
                                        }
                                    } catch (Exception unused5) {
                                    }
                                }
                                strEmc = rtt.this.ycc;
                            } catch (Exception unused6) {
                                return;
                            }
                        } else {
                            strEmc = rtt.this.emc(queryParameter2, queryParameter3);
                        }
                        com.bytedance.sdk.openadsdk.dg.xq.emc(rtt.this.f9296aa, queryParameter, strEmc, queryParameter3, j10, j12, jSONObject, com.bytedance.sdk.openadsdk.core.model.ul.uym(rtt.this.f9296aa));
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03be A[PHI: r4
  0x03be: PHI (r4v19 org.json.JSONObject) = (r4v14 org.json.JSONObject), (r4v20 org.json.JSONObject) binds: [B:239:0x0409, B:221:0x03bc] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.json.JSONObject emc(com.bytedance.sdk.openadsdk.core.rtt.ypw r27, int r28) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.rtt.emc(com.bytedance.sdk.openadsdk.core.rtt$ypw, int):org.json.JSONObject");
    }

    private void emc(JSONObject jSONObject, boolean z10, String str) {
        com.bytedance.sdk.openadsdk.core.widget.bw bwVar;
        if (z10) {
            try {
                String strOptString = jSONObject.optString("ad_extra_data");
                if (TextUtils.isEmpty(strOptString) || new JSONObject(strOptString).optInt("agg_request_type", -1) != 1 || !CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str) || (bwVar = this.uym) == null) {
                    return;
                }
                bwVar.emc();
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.ul.emc("TTAD.AndroidObject", "callAggClickListener faile", th);
            }
        }
    }

    private boolean emc(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
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
            if (!com.bytedance.sdk.component.utils.sba.emc(strOptString)) {
                try {
                    jSONObject2.put("invalid_url", 1);
                } catch (JSONException e10) {
                    com.bytedance.sdk.component.utils.ul.emc("TTAD.AndroidObject", "handleUrl, EX1->: ", e10);
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
                if (!com.bytedance.sdk.component.utils.sba.emc(strOptString2)) {
                    jSONObject2.put("invalid_url", 1);
                    return false;
                }
            } catch (JSONException e11) {
                com.bytedance.sdk.component.utils.ul.emc("TTAD.AndroidObject", "handleUrl, EX2->: ", e11);
            }
        }
        return true;
    }

    private void emc(String str, boolean z10) {
        if (this.rtt == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (z10) {
            this.rtt.emc(str);
        } else {
            this.rtt.ypw(str);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.bw.ypw
    public void emc(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("time");
            String strOptString = jSONObject.optString("flag");
            com.bytedance.sdk.openadsdk.core.zz.cf cfVar = this.ul;
            if (cfVar != null) {
                cfVar.emc(iOptInt, strOptString);
            }
        } catch (JSONException unused) {
            com.bytedance.sdk.component.utils.ul.xq("TTAD.AndroidObject", "requestPauseVideo json exception");
        }
    }

    public void emc(final ypw ypwVar, final JSONObject jSONObject) {
        if (ypwVar == null) {
            return;
        }
        try {
            emc(ypwVar.dg, new com.bytedance.sdk.openadsdk.sz.dg() { // from class: com.bytedance.sdk.openadsdk.core.rtt.8
                @Override // com.bytedance.sdk.openadsdk.sz.dg
                public void emc(boolean z10, com.bytedance.sdk.openadsdk.core.model.emc emcVar) throws JSONException {
                    if (!z10) {
                        rtt.this.ypw(ypwVar.ypw, jSONObject);
                        return;
                    }
                    try {
                        jSONObject.put("creatives", rtt.emc(emcVar));
                        rtt.this.ypw(ypwVar.ypw, jSONObject);
                    } catch (Exception unused) {
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    private boolean emc(String str, int i10, com.bytedance.sdk.openadsdk.core.model.vk vkVar) {
        HashMap<String, ru> map;
        if (TextUtils.isEmpty(str) || (map = this.xmt) == null || map.get(str) == null) {
            return false;
        }
        throw null;
    }

    public void emc(JSONObject jSONObject, final com.bytedance.sdk.openadsdk.sz.dg dgVar) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        if (dgVar == null) {
            return;
        }
        try {
            final com.bytedance.sdk.openadsdk.sz.dg dgVar2 = new com.bytedance.sdk.openadsdk.sz.dg() { // from class: com.bytedance.sdk.openadsdk.core.rtt.9
                @Override // com.bytedance.sdk.openadsdk.sz.dg
                public void emc(final boolean z10, final com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
                    com.bytedance.sdk.openadsdk.utils.iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.rtt.9.1
                        @Override // java.lang.Runnable
                        public void run() {
                            dgVar.emc(z10, emcVar);
                        }
                    });
                }
            };
            if (this.f9296aa != null && !TextUtils.isEmpty(this.sup)) {
                int iMfx = this.f9296aa.mfx();
                AdSlot adSlotVaf = this.f9296aa.vaf();
                com.bytedance.sdk.openadsdk.core.model.sb sbVar = new com.bytedance.sdk.openadsdk.core.model.sb();
                sbVar.ycc = true;
                if (this.f9296aa.zhk() != null || this.f9296aa.kv() != null) {
                    sbVar.zz = 2;
                }
                JSONObject jSONObject2 = this.sba;
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
                sbVar.uym = jSONObject2;
                if (jSONObject != null && jSONObject.has("common_params")) {
                    if (sbVar.msw == null) {
                        sbVar.msw = new JSONObject();
                    }
                    JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("common_params");
                    if (jSONObjectOptJSONObject2 != null) {
                        Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            sbVar.msw.put(next2, jSONObjectOptJSONObject2.opt(next2));
                        }
                    }
                }
                if (com.bytedance.sdk.openadsdk.utils.ypw.emc()) {
                    aa.xq().emc(adSlotVaf, sbVar, iMfx, (ul) new ylm() { // from class: com.bytedance.sdk.openadsdk.core.rtt.10
                        @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.sra.emc
                        public void emc(int i10, String str) {
                            dgVar2.emc(false, null);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.sra.emc
                        public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, com.bytedance.sdk.openadsdk.core.model.xq xqVar) {
                            rtt.this.emc(emcVar, xqVar, dgVar2);
                        }
                    });
                    return;
                } else {
                    aa.xq().emc(adSlotVaf, sbVar, iMfx, new sra.emc() { // from class: com.bytedance.sdk.openadsdk.core.rtt.11
                        @Override // com.bytedance.sdk.openadsdk.core.sra.emc
                        public void emc(int i10, String str) {
                            dgVar2.emc(false, null);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.sra.emc
                        public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, com.bytedance.sdk.openadsdk.core.model.xq xqVar) {
                            rtt.this.emc(emcVar, xqVar, dgVar2);
                        }
                    });
                    return;
                }
            }
            dgVar2.emc(false, null);
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.ul.emc("TTAD.AndroidObject", "get ads error", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, com.bytedance.sdk.openadsdk.core.model.xq xqVar, com.bytedance.sdk.openadsdk.sz.dg dgVar) {
        if (emcVar.dg() != null && !emcVar.dg().isEmpty()) {
            com.bytedance.sdk.openadsdk.core.model.rie rieVar = emcVar.dg().get(0);
            if (rieVar != null) {
                this.sba = rieVar.orp();
            }
            dgVar.emc(true, emcVar);
            return;
        }
        dgVar.emc(false, null);
        xqVar.emc(-3);
        xqVar.xq(7);
        com.bytedance.sdk.openadsdk.core.model.xq.emc(xqVar);
    }

    public static JSONArray emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
        com.bytedance.sdk.openadsdk.core.model.rie rieVarYcc;
        if (emcVar == null || !emcVar.bw() || (rieVarYcc = emcVar.ycc()) == null || TextUtils.isEmpty(rieVarYcc.uz())) {
            return null;
        }
        try {
            return new JSONObject(rieVarYcc.uz()).optJSONArray("creatives");
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean emc(Uri uri) {
        if (uri == null) {
            return false;
        }
        if ("bytedance".equals(uri.getScheme())) {
            return msw.containsKey(uri.getHost());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String emc(String str, String str2) {
        if (com.bytedance.sdk.openadsdk.core.model.ul.uym(this.f9296aa)) {
            if ("show".equals(str2)) {
                return com.bytedance.sdk.openadsdk.utils.tp.emc(this.sz);
            }
            return "aggregate_page";
        }
        if (com.bytedance.sdk.openadsdk.core.model.dr.bw(this.f9296aa)) {
            return this.ycc;
        }
        if (this.sb != null) {
            return com.bytedance.sdk.openadsdk.utils.tp.emc(this.sz);
        }
        return this.yzg == null ? com.bytedance.sdk.openadsdk.utils.tp.ypw(this.sz) : str;
    }

    @Override // com.bytedance.sdk.component.utils.sf.emc
    public void emc(Message message) {
        if (message != null && message.what == 11) {
            Object obj = message.obj;
            if (obj instanceof ypw) {
                try {
                    emc((ypw) obj, 1);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.gbl.ypw
    public void emc(String str, JSONObject jSONObject) {
        xq(str, jSONObject);
    }

    private void emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar, String str, boolean z10) {
        com.bytedance.sdk.openadsdk.core.xq.emc emcVar = new com.bytedance.sdk.openadsdk.core.xq.emc(aa.emc(), rieVar, str, this.sz);
        emcVar.emc(com.bytedance.sdk.openadsdk.ul.emc.emc.dg.emc(aa.emc(), str));
        if (!z10) {
            emcVar.emc(false);
        }
        emcVar.onClick(null);
    }

    public void emc(JSONObject jSONObject, String str) {
        com.bytedance.sdk.openadsdk.core.zz.cf cfVar = this.ul;
        if (cfVar != null) {
            cfVar.emc(str, jSONObject);
            return;
        }
        com.bytedance.sdk.openadsdk.core.sz.dg.ypw ypwVar = this.wpn;
        if (ypwVar != null) {
            ypwVar.emc(str, jSONObject);
        }
    }

    public void emc(com.bytedance.sdk.openadsdk.core.sz.dg.ypw ypwVar) {
        this.wpn = ypwVar;
    }

    public void emc(db dbVar) {
        this.pxa = dbVar;
    }

    public void emc(emc emcVar) {
        this.wa = emcVar;
    }
}
