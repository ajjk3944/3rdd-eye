package com.bytedance.sdk.openadsdk.zin.ouw;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.c;
import com.bytedance.sdk.component.bly.le;
import com.bytedance.sdk.component.ouw.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.ryl;
import com.bytedance.sdk.openadsdk.core.widget.bly;
import com.bytedance.sdk.openadsdk.core.widget.tlj;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.yu.th;
import com.bytedance.sdk.openadsdk.zin.fkw;
import com.bytedance.sdk.openadsdk.zin.pno;
import com.bytedance.sdk.openadsdk.zin.ra;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ouw {
    boolean bly;

    /* renamed from: cf, reason: collision with root package name */
    AtomicBoolean f8869cf;
    private boolean ex;
    String fkw;

    /* renamed from: jg, reason: collision with root package name */
    long f8870jg;
    private com.bytedance.sdk.openadsdk.core.lh.ouw jqy;
    StringBuilder ko;
    private int ksc;

    /* renamed from: le, reason: collision with root package name */
    final String f8871le;

    /* renamed from: lh, reason: collision with root package name */
    protected le f8872lh;
    vt mwh;
    final vpp ouw;
    com.bytedance.sdk.openadsdk.mwh.le pno;
    private volatile boolean qbp;
    pno ra;
    public InterfaceC0124ouw rn;
    bly ryl;
    private int tc;

    /* renamed from: th, reason: collision with root package name */
    private final FrameLayout f8873th;
    public volatile boolean tlj;
    private final int vm;
    private AtomicBoolean vpp;
    tlj vt;
    public bs yu;
    private final Context zih;
    private int zin;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.openadsdk.zin.ouw.ouw$ouw, reason: collision with other inner class name */
    public interface InterfaceC0124ouw {
        void ouw(int i4);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface vt {
        void ouw();
    }

    public ouw(Context context, vpp vppVar, int i4, boolean z3, FrameLayout frameLayout) {
        this(context, vppVar, i4, z3, frameLayout, false);
    }

    private void vt(boolean z3) throws JSONException {
        ko koVar;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cid", this.ouw.pv);
            jSONObject.put("log_extra", this.ouw.yhj);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        if (com.bytedance.sdk.openadsdk.core.bly.ouw().jg()) {
            ra.ouw = new ra.ouw() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.ouw.1
                @Override // com.bytedance.sdk.openadsdk.zin.ra.ouw
                public final void ouw(String str, String str2) {
                    com.bytedance.sdk.component.utils.ko.vt(str, str2);
                }

                @Override // com.bytedance.sdk.openadsdk.zin.ra.ouw
                public final void ouw(String str, String str2, Throwable th3) {
                    com.bytedance.sdk.component.utils.ko.lh(str, str2, th3);
                }
            };
        }
        Context contextOuw = zih.ouw();
        WebView webView = this.f8872lh.getWebView();
        com.bytedance.sdk.openadsdk.zin.lh lhVar = new com.bytedance.sdk.openadsdk.zin.lh() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.ouw.2
            @Override // com.bytedance.sdk.openadsdk.zin.lh
            public final void ouw(String str, JSONObject jSONObject2) {
                bs bsVar = ouw.this.yu;
                if (bsVar != null) {
                    bsVar.ouw(str, jSONObject2);
                }
            }
        };
        com.bytedance.sdk.openadsdk.zin.ouw ouwVar = new com.bytedance.sdk.openadsdk.zin.ouw() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.ouw.3
            @Override // com.bytedance.sdk.openadsdk.zin.ouw
            public final void lh() {
                com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar = ouw.this.yu.uq;
                if (vtVar != null) {
                    vtVar.ra();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.zin.ouw
            public final com.bytedance.sdk.openadsdk.zin.yu ouw() {
                String strOuw = com.bytedance.sdk.openadsdk.common.lh.ouw();
                strOuw.getClass();
                switch (strOuw) {
                    case "2g":
                        return com.bytedance.sdk.openadsdk.zin.yu.TYPE_2G;
                    case "3g":
                        return com.bytedance.sdk.openadsdk.zin.yu.TYPE_3G;
                    case "4g":
                        return com.bytedance.sdk.openadsdk.zin.yu.TYPE_4G;
                    case "5g":
                        return com.bytedance.sdk.openadsdk.zin.yu.TYPE_5G;
                    case "wifi":
                        return com.bytedance.sdk.openadsdk.zin.yu.TYPE_WIFI;
                    default:
                        return com.bytedance.sdk.openadsdk.zin.yu.TYPE_UNKNOWN;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.zin.ouw
            public final void vt() {
                ouw ouwVar2 = ouw.this;
                ouwVar2.yu.f8111th = true;
                com.bytedance.sdk.openadsdk.mwh.le leVar = ouwVar2.pno;
                if (leVar != null) {
                    leVar.ouw();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.zin.ouw
            public final void ouw(final JSONObject jSONObject2) {
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                ouw ouwVar2 = ouw.this;
                com.bytedance.sdk.openadsdk.yu.lh.ouw(jCurrentTimeMillis, ouwVar2.ouw, ouwVar2.fkw, "playable_track", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.ouw.3.1
                    @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                    public final JSONObject lh() {
                        return jSONObject2;
                    }

                    @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                    public final JSONObject ouw() throws JSONException {
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("is_new_playable", 1);
                            if (!ouw.this.ouw.wp()) {
                                return jSONObject3;
                            }
                            jSONObject3.put("is_pre_render", 1);
                            return jSONObject3;
                        } catch (JSONException e2) {
                            qbp.lh("PlayableManager", e2.getMessage());
                            return null;
                        }
                    }
                });
            }

            @Override // com.bytedance.sdk.openadsdk.zin.ouw
            public final void ouw(int i4) throws JSONException {
                ouw ouwVar2 = ouw.this;
                ouwVar2.bly = false;
                if (i4 == 2 || i4 == 3 || i4 == 4) {
                    ouwVar2.ouw(2, i4);
                } else if (i4 == 5) {
                    ouwVar2.ouw(3, i4);
                } else {
                    ouwVar2.ouw(1, 0);
                }
            }
        };
        pno pnoVar = webView == null ? new pno(contextOuw, lhVar, ouwVar) : new pno(contextOuw, webView, lhVar, ouwVar, pno.ouw.LAND_PAGE);
        this.ra = pnoVar;
        pno pnoVarLh = pnoVar.lh(this.f8871le);
        pnoVarLh.mt = ryl.ouw(zih.ouw());
        pnoVarLh.f8883cj = com.bytedance.sdk.openadsdk.core.bly.ouw().pno();
        pnoVarLh.f8895ub = "open_news";
        pnoVarLh.pv = uoy.bly();
        pnoVarLh.kn = jSONObject;
        pno pnoVarVt = pnoVarLh.vt(od.bly(this.ouw)).ouw().ouw(z3).vt(false);
        long jRyl = od.ryl(this.ouw);
        if (jRyl <= 0) {
            pnoVarVt.zih = 10L;
        } else {
            pnoVarVt.zih = jRyl;
        }
        long jRyl2 = od.ryl(this.ouw);
        if (jRyl2 <= 0) {
            pnoVarVt.vm = 10L;
        } else {
            pnoVarVt.vm = jRyl2;
        }
        pnoVarVt.wp.put("sdkEdition", BuildConfig.VERSION_NAME);
        pnoVarVt.coz = od.le(this.ouw);
        pnoVarVt.f8885jg = this.fkw;
        this.ra.yhj = fkw.vt(this.zih);
        Set<String> setOuw = this.ra.hun.ouw();
        final WeakReference weakReference = new WeakReference(this.ra);
        for (String str : setOuw) {
            if (!"subscribe_app_ad".equals(str) && !"adInfo".equals(str) && !"webview_time_track".equals(str) && !"download_app_ad".equals(str) && (koVar = this.yu.vpp) != null) {
                koVar.ouw(str, new com.bytedance.sdk.component.ouw.yu<JSONObject, JSONObject>() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.ouw.4
                    @Override // com.bytedance.sdk.component.ouw.yu
                    public final /* bridge */ /* synthetic */ JSONObject ouw(String str2, JSONObject jSONObject2) throws Exception {
                        return ouw(jSONObject2);
                    }

                    private JSONObject ouw(JSONObject jSONObject2) {
                        try {
                            pno pnoVar2 = (pno) weakReference.get();
                            if (pnoVar2 == null) {
                                return null;
                            }
                            String strOuw = ouw();
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (ra.ouw()) {
                                StringBuilder sb2 = new StringBuilder("PlayablePlugin JSB-REQ [");
                                sb2.append(strOuw);
                                sb2.append("] ");
                                sb2.append(jSONObject2 != null ? jSONObject2.toString() : "");
                                ra.ouw("PlayablePlugin", sb2.toString());
                            }
                            JSONObject jSONObjectOuw = pnoVar2.hun.ouw(strOuw, jSONObject2);
                            if (ra.ouw()) {
                                StringBuilder sb3 = new StringBuilder("PlayablePlugin JSB-RSP [");
                                sb3.append(strOuw);
                                sb3.append("] time:");
                                sb3.append(System.currentTimeMillis() - jCurrentTimeMillis);
                                sb3.append(" ");
                                sb3.append(jSONObjectOuw != null ? jSONObjectOuw.toString() : "");
                                ra.ouw("PlayablePlugin", sb3.toString());
                            }
                            return jSONObjectOuw;
                        } catch (Throwable unused) {
                            return null;
                        }
                    }
                });
            }
        }
    }

    public final boolean fkw() {
        bs bsVar = this.yu;
        if (bsVar != null) {
            return bsVar.f8111th;
        }
        return false;
    }

    public final void lh() {
        if (!this.f8869cf.get() || this.ra == null) {
            return;
        }
        qbp.ouw("PlayableManager", "onPause() called");
        this.ra.vt(false);
    }

    public final void ouw(boolean z3, com.bytedance.sdk.openadsdk.mwh.le leVar) {
        c cVar;
        this.pno = leVar;
        this.ra.myk = z3;
        com.bytedance.sdk.openadsdk.core.mwh.lh.ouw ouwVarOuw = com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw();
        vpp vppVar = this.ouw;
        if (vppVar != null && (cVar = vppVar.f8309sd) != null && !TextUtils.isEmpty(cVar.f6580i) && com.bytedance.sdk.openadsdk.vpp.ouw.ouw("can_cancel_playable", false)) {
            com.bytedance.sdk.component.ra.vt.ouw ouwVar = ouwVarOuw.ouw.get(vppVar.f8309sd.f6580i);
            if (ouwVar != null) {
                ouwVar.lh();
            }
        }
        this.f8872lh.a_(this.f8871le);
        pno pnoVar = this.ra;
        if (pnoVar != null) {
            pnoVar.njr = com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw().ouw(this.ouw);
            pno pnoVar2 = this.ra;
            pnoVar2.osn = 1;
            JSONObject jSONObject = new JSONObject();
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                pnoVar2.zin = jCurrentTimeMillis;
                long j = pnoVar2.qbp;
                jSONObject.put("playable_page_show_duration", j != -1 ? jCurrentTimeMillis - j : 0L);
            } catch (Throwable th2) {
                ra.ouw("PlayablePlugin", "reportUrlLoadStart error", th2);
            }
            pnoVar2.vt("PL_sdk_html_load_start", jSONObject);
            pnoVar2.lvd = true;
            pnoVar2.f8893sd = true;
            if (pnoVar2.coz) {
                pnoVar2.bly();
                pnoVar2.lvd = false;
                pnoVar2.f8893sd = false;
            }
            if (pnoVar2.pno) {
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    StringBuffer stringBuffer2 = new StringBuffer();
                    StringBuffer stringBuffer3 = new StringBuffer();
                    if (fkw.ouw(pnoVar2.rrs, fkw.ryl)) {
                        stringBuffer.append("Microphone_");
                        stringBuffer2.append("1");
                        if (fkw.ouw(pnoVar2.rrs, "android.permission.RECORD_AUDIO")) {
                            stringBuffer3.append("1");
                        } else {
                            stringBuffer3.append("0");
                        }
                    } else {
                        stringBuffer2.append("0");
                        stringBuffer3.append("0");
                    }
                    if (fkw.ouw(pnoVar2.rrs, fkw.f8861cf)) {
                        stringBuffer.append("Magetometer_");
                        stringBuffer2.append("1");
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer2.append("0");
                        stringBuffer3.append("0");
                    }
                    if (fkw.ouw(pnoVar2.rrs, fkw.tlj)) {
                        stringBuffer.append("Accelerometer_");
                        stringBuffer2.append("1");
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer2.append("0");
                        stringBuffer3.append("0");
                    }
                    if (fkw.ouw(pnoVar2.rrs, fkw.bly)) {
                        stringBuffer.append("Gyro_");
                        stringBuffer2.append("1");
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer2.append("0");
                        stringBuffer3.append("0");
                    }
                    if (fkw.ouw(pnoVar2.rrs, fkw.pno)) {
                        stringBuffer.append("Camera_");
                        stringBuffer2.append("1");
                        if (fkw.ouw(pnoVar2.rrs, "android.permission.CAMERA")) {
                            stringBuffer3.append("1");
                        } else {
                            stringBuffer3.append("0");
                        }
                    } else {
                        stringBuffer2.append("0");
                        stringBuffer3.append("0");
                    }
                    if (fkw.ouw(pnoVar2.rrs, fkw.ra)) {
                        stringBuffer.append("Photo");
                        stringBuffer2.append("1");
                        if (fkw.ouw(pnoVar2.rrs)) {
                            stringBuffer3.append("1");
                        } else {
                            stringBuffer3.append("0");
                        }
                    } else {
                        stringBuffer2.append("0");
                        stringBuffer3.append("0");
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("playable_available_hardware_name", stringBuffer.toString());
                    jSONObject2.put("playable_available_hardware_code", stringBuffer2.toString());
                    jSONObject2.put("playable_available_hardware_auth_code", stringBuffer3.toString());
                    pnoVar2.vt("PL_sdk_hardware_detect", jSONObject2);
                    pnoVar2.pno = false;
                } catch (Throwable th3) {
                    ra.ouw("PlayablePlugin", "Hardware detect error", th3);
                }
            }
        }
    }

    public final void yu() {
        pno pnoVar = this.ra;
        if (pnoVar != null) {
            pnoVar.jg();
        }
        le leVar = this.f8872lh;
        if (leVar != null) {
            leVar.bly();
        }
        bs bsVar = this.yu;
        if (bsVar != null) {
            bsVar.lh();
        }
        this.f8870jg = System.currentTimeMillis();
        this.ko = new StringBuilder();
        try {
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                StringBuilder sb2 = this.ko;
                sb2.append(stackTraceElement);
                sb2.append("\n");
            }
        } catch (Throwable th2) {
            qbp.ouw("PlayableManager", "onDestroy() error", th2);
        }
        this.f8872lh = null;
    }

    public ouw(Context context, vpp vppVar, int i4, boolean z3, FrameLayout frameLayout, boolean z10) {
        this(context, vppVar, i4, z3, frameLayout, z10, 0);
    }

    public ouw(Context context, vpp vppVar, int i4, boolean z3, FrameLayout frameLayout, boolean z10, int i10) throws JSONException {
        com.bytedance.sdk.openadsdk.core.model.ouw ouwVar;
        List<vpp> list;
        this.bly = true;
        this.f8869cf = new AtomicBoolean(false);
        this.vpp = new AtomicBoolean(false);
        this.ksc = 0;
        this.f8870jg = 0L;
        this.zih = context;
        this.ouw = vppVar;
        this.tc = i10;
        if (vppVar != null && (ouwVar = vppVar.vm) != null && (list = ouwVar.yu) != null) {
            this.ksc = list.size();
        }
        this.vm = i4;
        String strLh = uoy.lh(vppVar.yiz.getDurationSlotType());
        this.fkw = strLh;
        int iOuw = uoy.ouw(strLh);
        this.ex = z10;
        if (z10) {
            this.fkw = uoy.vt(iOuw);
        }
        this.f8871le = od.cf(vppVar);
        this.f8873th = frameLayout;
        le leVar = new le(context, true, le.lh.PLAYABLE);
        this.f8872lh = leVar;
        leVar.o_();
        this.f8872lh.setLayerType(2, null);
        this.f8872lh.setVisibility(4);
        this.f8872lh.setBackgroundColor(-16777216);
        this.f8872lh.setEnabled(true);
        this.f8872lh.setTag(this.fkw);
        this.f8872lh.setMaterialMeta(vppVar.bs());
        this.f8872lh.setLandingPage(true);
        frameLayout.addView(this.f8872lh, new FrameLayout.LayoutParams(-1, -1));
        bly blyVar = new bly(context);
        this.ryl = blyVar;
        String str = this.fkw;
        com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar2 = this.jqy;
        boolean z11 = this.ex;
        blyVar.ouw = vppVar;
        blyVar.vt = str;
        blyVar.f8475lh = z11;
        blyVar.yu = ouwVar2;
        frameLayout.addView(blyVar, new FrameLayout.LayoutParams(-1, -1));
        c cVar = vppVar.f8309sd;
        if (cVar == null || cVar.f6583m != 1) {
            tlj tljVar = new tlj(context);
            this.vt = tljVar;
            tljVar.vt();
            frameLayout.addView(this.vt, new FrameLayout.LayoutParams(-1, -1));
        }
        HashMap map = new HashMap();
        map.put("click_scence", 3);
        this.yu = new bs(context);
        String strHun = vppVar.hun();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isMultiAd", vppVar.tpk);
            jSONObject.put("currentIndex", this.tc);
            jSONObject.put("totalAdCount", this.ksc);
        } catch (JSONException e2) {
            com.bytedance.sdk.component.utils.ko.yu("PlayableManager", e2);
        }
        bs bsVarOuw = this.yu.vt(this.f8872lh).ouw(this.ouw);
        bsVarOuw.ryl = com.bytedance.sdk.openadsdk.core.bly.ouw.ouw.ouw(this.ouw, true, jSONObject);
        vpp vppVar2 = this.ouw;
        bsVarOuw.f8108lh = vppVar2.pv;
        bsVarOuw.fkw = vppVar2.yhj;
        bsVarOuw.f8107le = iOuw;
        bsVarOuw.ra = strHun;
        bs bsVarOuw2 = bsVarOuw.ouw(this.f8872lh);
        bsVarOuw2.ouw = this.fkw;
        bsVarOuw2.ouw(map).zin = new th(3, this.fkw, this.ouw);
        vt(z3);
        this.f8872lh.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.ouw.fkw(zih.ouw(), this.yu, this.ouw.pv, null) { // from class: com.bytedance.sdk.openadsdk.zin.ouw.ouw.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str2) throws JSONException {
                WebView webView2;
                super.onPageFinished(webView, str2);
                pno pnoVar = ouw.this.ra;
                if (pnoVar != null) {
                    boolean z12 = pnoVar.osn == -1;
                    pnoVar.osn = 2;
                    if (!z12) {
                        pnoVar.f8898vh = str2;
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            pnoVar.vpp = jCurrentTimeMillis;
                            long j = pnoVar.zin;
                            jSONObject2.put("playable_html_load_start_duration", j != -1 ? jCurrentTimeMillis - j : 0L);
                            jSONObject2.put("playable_has_show", pnoVar.ko());
                        } catch (Throwable th2) {
                            ra.ouw("PlayablePlugin", "reportUrlLoadFinish error", th2);
                        }
                        pnoVar.vt("PL_sdk_html_load_finish", jSONObject2);
                    }
                    pnoVar.lvd = false;
                    pnoVar.ouw.removeCallbacks(pnoVar.vt);
                    try {
                        if (pnoVar.uoy == 0) {
                            if (pnoVar.ra && (webView2 = pnoVar.jvy) != null) {
                                pnoVar.ra = false;
                                webView2.evaluateJavascript("function playable_callJS(){return \"Android call the JS method is callJS\";}", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.zin.pno.11
                                    public AnonymousClass11() {
                                    }

                                    @Override // android.webkit.ValueCallback
                                    public final /* synthetic */ void onReceiveValue(String str3) {
                                        ra.ouw("Playable_CrashMonitor", "load inject js=".concat(String.valueOf(str3)));
                                    }
                                });
                            }
                            pnoVar.ryl();
                        }
                    } catch (Throwable th3) {
                        ra.ouw("PlayablePlugin", "crashMonitor error", th3);
                    }
                }
                ouw ouwVar3 = ouw.this;
                if (ouwVar3.bly) {
                    ouwVar3.ouw(0, 0);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    ouw ouwVar4 = ouw.this;
                    com.bytedance.sdk.openadsdk.yu.lh.ouw(jCurrentTimeMillis2, ouwVar4.ouw, ouwVar4.fkw, "py_loading_success");
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
            public final void onReceivedError(WebView webView, int i11, String str2, String str3) {
                super.onReceivedError(webView, i11, str2, str3);
                ouw ouwVar3 = ouw.this;
                ouwVar3.bly = false;
                pno pnoVar = ouwVar3.ra;
                if (pnoVar != null) {
                    pnoVar.njr = com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw().ouw(ouw.this.ouw);
                    ouw.this.ra.ouw(i11, str2, str3);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
            public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (webResourceRequest.isForMainFrame()) {
                    ouw ouwVar3 = ouw.this;
                    ouwVar3.bly = false;
                    pno pnoVar = ouwVar3.ra;
                    if (pnoVar != null) {
                        pnoVar.njr = com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw().ouw(ouw.this.ouw);
                        ouw.this.ra.ouw(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
            public final WebResourceResponse shouldInterceptRequest(WebView webView, String str2) {
                try {
                    c cVar2 = ouw.this.ouw.f8309sd;
                    if (cVar2 != null && !TextUtils.isEmpty(cVar2.f6580i)) {
                        pno pnoVar = ouw.this.ra;
                        if (pnoVar != null) {
                            pnoVar.ouw.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.zin.pno.2
                                public AnonymousClass2() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    pno.this.ksc++;
                                }
                            });
                        }
                        WebResourceResponse webResourceResponseOuw = com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw().ouw(ouw.this.ouw.f8309sd.f6580i, od.cf(ouw.this.ouw), str2);
                        if (webResourceResponseOuw == null) {
                            com.bytedance.sdk.component.utils.ko.ouw("PlayableManager", "Plb res: hit no ", str2);
                            return super.shouldInterceptRequest(webView, str2);
                        }
                        com.bytedance.sdk.component.utils.ko.ouw("PlayableManager", "Plb res: hit++ ", str2);
                        pno pnoVar2 = ouw.this.ra;
                        if (pnoVar2 != null) {
                            pnoVar2.ouw.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.zin.pno.3
                                public AnonymousClass3() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    pno.this.jae++;
                                }
                            });
                        }
                        return webResourceResponseOuw;
                    }
                    return super.shouldInterceptRequest(webView, str2);
                } catch (Throwable unused) {
                    return super.shouldInterceptRequest(webView, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
            public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceRequest.isForMainFrame()) {
                    ouw ouwVar3 = ouw.this;
                    ouwVar3.bly = false;
                    pno pnoVar = ouwVar3.ra;
                    if (pnoVar == null || webResourceError == null) {
                        return;
                    }
                    pnoVar.njr = com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw().ouw(ouw.this.ouw);
                    ouw.this.ra.ouw(webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), String.valueOf(webResourceRequest.getUrl()));
                }
            }
        });
        this.f8872lh.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.ouw.yu(this.yu) { // from class: com.bytedance.sdk.openadsdk.zin.ouw.ouw.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.yu, android.webkit.WebChromeClient
            public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return super.onConsoleMessage(consoleMessage);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.yu, android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView, int i11) {
                super.onProgressChanged(webView, i11);
                tlj tljVar2 = ouw.this.vt;
                if (tljVar2 == null || tljVar2.getVisibility() != 0) {
                    return;
                }
                ouw.this.vt.setProgress(i11);
            }
        });
        com.bytedance.sdk.openadsdk.core.widget.ouw.lh lhVarOuw = com.bytedance.sdk.openadsdk.core.widget.ouw.lh.ouw(this.zih);
        lhVarOuw.vt = false;
        lhVarOuw.ouw = false;
        lhVarOuw.ouw(this.f8872lh.getWebView());
        le leVar2 = this.f8872lh;
        leVar2.setUserAgentString(com.bytedance.sdk.openadsdk.utils.th.ouw(leVar2.getWebView()));
        this.f8872lh.setMixedContentMode(0);
    }

    public final void vt() {
        if (!this.f8869cf.get() || this.ra == null) {
            return;
        }
        qbp.ouw("PlayableManager", "onResume() called");
        this.ra.vt(true);
    }

    public void ouw() throws JSONException {
        com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar;
        tlj tljVar;
        final boolean z3 = true;
        if (this.f8869cf.getAndSet(true)) {
            return;
        }
        FrameLayout frameLayout = this.f8873th;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        qbp.ouw("PlayableManager", "showPlayable() called with: hasLoading = [false], loadingViewIsHide = [" + this.qbp + "]");
        if (!this.qbp && (tljVar = this.vt) != null) {
            vpp vppVar = this.ouw;
            if (!tljVar.isShown()) {
                tljVar.vt();
                tljVar.setVisibility(0);
                tljVar.ouw = SystemClock.elapsedRealtime();
                tljVar.ouw(vppVar);
            }
            pno pnoVar = this.ra;
            if (pnoVar != null) {
                pnoVar.bly();
            }
        } else {
            this.ra.vt(true);
            bs bsVar = this.yu;
            if (bsVar != null && (vtVar = bsVar.uq) != null) {
                vtVar.le();
            }
            InterfaceC0124ouw interfaceC0124ouw = this.rn;
            if (interfaceC0124ouw != null) {
                interfaceC0124ouw.ouw(this.zin);
            }
            z3 = false;
        }
        if (this.ra != null) {
            com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), this.ouw, this.fkw, "playable_track", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.ouw.7
                @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                public final JSONObject lh() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("playable_event", "start_show_plb");
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }

                @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                public final JSONObject ouw() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("webview_state", ouw.this.ra.euf);
                        jSONObject.put("has_loading", z3);
                        jSONObject.put("is_new_playable", 1);
                        return jSONObject;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            });
            this.ra.njr = com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw().ouw(this.ouw);
        }
        le leVar = this.f8872lh;
        if (leVar != null) {
            leVar.setVisibility(0);
        } else {
            com.bytedance.sdk.openadsdk.rn.lh.ouw("plb_npe_crash", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.ouw.8
                @Override // com.bytedance.sdk.openadsdk.rn.vt
                public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("crash_ts", System.currentTimeMillis());
                    StringBuilder sb2 = ouw.this.ko;
                    if (sb2 != null) {
                        jSONObject.put("destroy_stack_trace", sb2.toString());
                    }
                    jSONObject.put("destroy_ts", ouw.this.f8870jg);
                    com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
                    yuVar.ouw = "plb_npe_crash";
                    yuVar.bly = jSONObject.toString();
                    return yuVar;
                }
            });
        }
    }

    public final void ouw(final int i4, final int i10) throws JSONException {
        InterfaceC0124ouw interfaceC0124ouw;
        com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar;
        pno pnoVar;
        vt vtVar2;
        if (this.qbp) {
            return;
        }
        this.qbp = true;
        this.zin = i4;
        qbp.ouw("PlayableManager", r5.c.i(i4, "onHidePlayableLoading() called with: hideReason = [", "], errorDetail = [", i10, "]"));
        if (i4 == 2) {
            this.tlj = true;
            this.ra.euf = 3;
        } else if (i4 == 1) {
            this.tlj = true;
            this.ra.euf = 2;
        } else if (i4 == 3) {
            this.tlj = true;
            this.ra.euf = 4;
        } else if (i4 == 0) {
            this.ra.euf = 1;
        }
        if (this.tlj && (vtVar2 = this.mwh) != null) {
            vtVar2.ouw();
        }
        if (this.f8869cf.get() && (pnoVar = this.ra) != null) {
            pnoVar.vt(true);
        }
        bs bsVar = this.yu;
        if (bsVar != null && (vtVar = bsVar.uq) != null) {
            vtVar.le();
        }
        if (!this.tlj && (interfaceC0124ouw = this.rn) != null) {
            interfaceC0124ouw.ouw(i4);
        }
        tlj tljVar = this.vt;
        if (tljVar != null) {
            tljVar.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.ouw.9
                @Override // java.lang.Runnable
                public final void run() {
                    if (ouw.this.tlj) {
                        ouw.this.ryl.setVisibility(0);
                        InterfaceC0124ouw interfaceC0124ouw2 = ouw.this.rn;
                        if (interfaceC0124ouw2 != null) {
                            interfaceC0124ouw2.ouw(i4);
                        }
                        ouw.this.ouw(true);
                    }
                    ouw ouwVar = ouw.this;
                    ouwVar.ra.mq = ouwVar.tlj;
                    ouw.this.vt.lh();
                    if (ouw.this.f8869cf.get()) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        ouw ouwVar2 = ouw.this;
                        com.bytedance.sdk.openadsdk.yu.lh.ouw(jCurrentTimeMillis, ouwVar2.ouw, ouwVar2.fkw, "playable_track", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.ouw.9.1
                            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                            public final JSONObject lh() {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("playable_event", "remove_loading_page");
                                } catch (Throwable unused) {
                                }
                                return jSONObject;
                            }

                            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                            public final JSONObject ouw() {
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("remove_loading_page_type", i4);
                                    jSONObject.put("remove_loading_page_reason", i10);
                                    jSONObject.put("playable_url", ouw.this.f8871le);
                                    jSONObject.put("duration", ouw.this.vt.getDisplayDuration());
                                    jSONObject.put("is_new_playable", 1);
                                    return jSONObject;
                                } catch (Throwable unused) {
                                    return null;
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public final void ouw(boolean z3) {
        pno pnoVar = this.ra;
        if (pnoVar != null) {
            pnoVar.ouw(z3);
        }
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar) {
        this.jqy = ouwVar;
        tlj tljVar = this.vt;
        if (tljVar != null && tljVar.getDownloadButton() != null) {
            com.bytedance.sdk.openadsdk.core.le.pno downloadButton = this.vt.getDownloadButton();
            downloadButton.setOnClickListener(ouwVar);
            downloadButton.setOnTouchListener(ouwVar);
        }
        bly blyVar = this.ryl;
        if (blyVar != null) {
            blyVar.setClickListener(ouwVar);
        }
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar) {
        bs bsVar = this.yu;
        if (bsVar != null) {
            bsVar.uq = vtVar;
        }
    }
}
