package com.bytedance.sdk.openadsdk.dg;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.ul;
import com.bytedance.sdk.openadsdk.core.widget.emc.ycc;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.vw;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class sz {
    private static final int[] xq = {10, 30, 50, 75, 100};
    private boolean aa;
    private volatile long but;
    private long bw;
    private final Context cf;
    private boolean cn;
    private boolean cuf;
    private String db;
    private int dg;
    private long dr;
    private final rie ee;
    public ycc.emc emc;
    private String ffd;
    private int gbl;
    private final AtomicBoolean hj;
    private int hxp;
    private WeakReference<WebView> iyl;
    private long lt;
    private final int[] mkp;
    private final AtomicBoolean msw;
    private boolean mxo;
    private long ndl;
    private volatile int pxa;
    private String qh;
    private sup ra;
    private long rie;
    private volatile long rqm;
    private final boolean rtt;
    private final AtomicBoolean ru;
    private long sb;
    private com.bytedance.sdk.openadsdk.ylm.msw sba;
    private long sf;
    private long sra;
    private boolean sup;
    private String sz;
    private com.bytedance.sdk.openadsdk.dg.dg.bw tp;
    private boolean ul;
    private final AtomicBoolean uym;
    private com.bytedance.sdk.openadsdk.core.widget.emc.ycc vk;
    private boolean vw;
    private int wa;
    private volatile long wad;
    private final AtomicBoolean wd;
    private volatile long wo;
    private final AtomicBoolean wpn;
    private String xhi;
    private long xmt;
    private final AtomicInteger xxg;
    private int ycc;
    private int ylm;
    AtomicBoolean ypw;
    private final AtomicInteger yz;
    private zz yzg;
    private final AtomicBoolean zz;

    public static class emc {
        private final int[] emc;

        public emc(int[] iArr) {
            this.emc = iArr;
        }

        @JavascriptInterface
        public String getUrl() {
            return "";
        }

        @JavascriptInterface
        public void readPercent(String str) {
            int iIntValue;
            try {
                iIntValue = Float.valueOf(str).intValue();
            } catch (Throwable unused) {
            }
            if (iIntValue > 100) {
                iIntValue = 100;
            } else if (iIntValue < 0) {
                iIntValue = 0;
            }
            int[] iArr = this.emc;
            if (iArr == null || iArr.length <= 0) {
                return;
            }
            iArr[0] = iIntValue;
        }
    }

    public sz(rie rieVar, WebView webView, sup supVar, int i) {
        this(rieVar, webView);
        this.ra = supVar;
        this.wa = i;
    }

    private int ru() {
        WeakReference<WebView> weakReference = this.iyl;
        WebView webView = weakReference != null ? weakReference.get() : null;
        if (webView != null) {
            try {
                WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
                if (webBackForwardListCopyBackForwardList != null) {
                    if (webBackForwardListCopyBackForwardList.getCurrentIndex() == 0) {
                        return 1;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    private boolean zz() {
        rie rieVar;
        return this.vw && (rieVar = this.ee) != null && rieVar.mkp();
    }

    public void msw() {
        if (("landingpage".equals(this.db) || "landingpage_endcard".equals(this.db) || "landingpage_split_screen".equals(this.db) || "landingpage_direct".equals(this.db) || "aggregate_page".equals(this.db) || "landingpage_split_ceiling".equals(this.db)) && this.ycc == 2) {
            if (this.sf > 0 || !xq()) {
                long jCurrentTimeMillis = System.currentTimeMillis() - Math.max(this.sb, this.sf);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("load_status", this.ycc);
                    jSONObject.put("max_scroll_percent", this.mkp[0]);
                    jSONObject.put("jump_times", this.xxg.getAndSet(0));
                    jSONObject.put("click_times", this.yz.getAndSet(0));
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                } catch (JSONException unused) {
                }
                this.ru.set(true);
                emc("stay_page", jSONObject, Math.min(jCurrentTimeMillis, TTAdConstant.AD_MAX_EVENT_TIME));
                com.bytedance.sdk.openadsdk.ycc.ypw.emc().emc("landingPause", this.ee, this.xhi);
            }
        }
    }

    public void uym() {
        if (this.lt == 0) {
            this.lt = System.currentTimeMillis();
        }
        this.sb = System.currentTimeMillis();
        if ("landingpage".equals(this.db) || "landingpage_endcard".equals(this.db) || "landingpage_split_screen".equals(this.db) || "landingpage_direct".equals(this.db) || "aggregate_page".equals(this.db)) {
            if (this.hj.compareAndSet(false, true)) {
                com.bytedance.sdk.openadsdk.ycc.ypw.emc().emc("landingStart", this.ee, this.xhi);
            } else {
                com.bytedance.sdk.openadsdk.ycc.ypw.emc().emc("landingContinue", this.ee, this.xhi);
            }
        }
        if (ul.msw(this.ee) || ul.ypw(this.ee)) {
            emc(true, SystemClock.elapsedRealtime());
        }
    }

    public void ycc() {
        if (zz() && this.wad > 0 && this.but > 0 && !this.wd.getAndSet(true)) {
            xq.ypw(this.but - this.wad, this.ee, this.ffd, (String) null);
        }
    }

    public void bw() {
        if (zz()) {
            this.wad = SystemClock.elapsedRealtime();
            ycc();
        }
    }

    public void dg() {
        if (zz()) {
            this.rqm = SystemClock.elapsedRealtime();
            xq.emc(this.ee, this.ffd);
        }
    }

    public boolean xq() {
        return this.vw;
    }

    public com.bytedance.sdk.openadsdk.dg.dg.bw ypw() {
        return this.tp;
    }

    public void xq(boolean z6) {
        this.vw = z6;
    }

    public sz ypw(boolean z6) {
        this.mxo = z6;
        return this;
    }

    public sz(rie rieVar, WebView webView) {
        this(rieVar, webView, false);
    }

    public rie emc() {
        return this.ee;
    }

    public void xq(String str) throws JSONException {
        if (!this.mxo || this.ee == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("render_type", "h5");
            jSONObject.putOpt("render_type_2", 0);
            int i = this.wa;
            if (i >= 0) {
                jSONObject.putOpt("preload_status", Integer.valueOf(i));
            }
            if (TextUtils.isEmpty(str)) {
                str = this.ee.xst();
            }
            jSONObject.put("url", str);
        } catch (Exception unused) {
        }
        emc("load_start", jSONObject);
    }

    public void ypw(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.ffd = str;
    }

    public sz(rie rieVar, WebView webView, boolean z6) {
        this.dg = 0;
        this.bw = -1L;
        this.ycc = 1;
        this.uym = new AtomicBoolean(false);
        this.msw = new AtomicBoolean(false);
        this.zz = new AtomicBoolean(false);
        this.ru = new AtomicBoolean(false);
        this.gbl = -1;
        this.ul = false;
        this.ylm = 0;
        this.ypw = new AtomicBoolean(false);
        this.db = "landingpage";
        this.sb = 0L;
        this.sf = 0L;
        this.dr = 0L;
        this.xmt = 0L;
        this.lt = 0L;
        this.cuf = false;
        this.rtt = false;
        int[] iArr = {0};
        this.mkp = iArr;
        this.mxo = false;
        this.vw = false;
        this.wo = 0L;
        this.xxg = new AtomicInteger(0);
        this.yz = new AtomicInteger(0);
        this.wpn = new AtomicBoolean(false);
        this.pxa = 0;
        this.wa = -1;
        this.wd = new AtomicBoolean(false);
        this.hj = new AtomicBoolean(false);
        this.cn = false;
        Context contextEmc = com.bytedance.sdk.openadsdk.core.aa.emc();
        this.cf = contextEmc;
        this.ee = rieVar;
        if (webView == null) {
            return;
        }
        this.ul = z6;
        WeakReference<WebView> weakReference = new WeakReference<>(webView);
        this.iyl = weakReference;
        WebView webView2 = weakReference.get();
        if (webView2 == null) {
            return;
        }
        if (rieVar != null && rieVar.oz()) {
            com.bytedance.sdk.openadsdk.core.widget.emc.ycc yccVar = new com.bytedance.sdk.openadsdk.core.widget.emc.ycc(webView2, rieVar, contextEmc, this.ul);
            this.vk = yccVar;
            this.emc = yccVar.xq();
        }
        if (rieVar != null && rieVar.oug() && com.bytedance.sdk.openadsdk.core.settings.gbl.xq().ee()) {
            this.yzg = new zz(rieVar, webView, this.ul);
        }
        if (webView instanceof com.bytedance.sdk.component.zz.bw) {
            this.ndl = ((com.bytedance.sdk.component.zz.bw) webView2).emc;
        } else {
            this.ndl = System.currentTimeMillis();
        }
        try {
            webView2.addJavascriptInterface(new emc(iArr), "JS_LANDING_PAGE_LOG_OBJ");
        } catch (Exception e6) {
            com.bytedance.sdk.component.utils.ul.emc("LandingPageLog", "addJavascriptInterface exception", e6);
        }
        if (rieVar != null && rieVar.ldy() != null) {
            this.bw = rieVar.ldy().optLong("page_id", -1L);
        }
        this.xhi = String.valueOf(SystemClock.elapsedRealtime());
    }

    private String bw(String str) {
        return "javascript:".concat(String.valueOf(str));
    }

    public void dg(boolean z6) {
        WeakReference<WebView> weakReference = this.iyl;
        WebView webView = weakReference != null ? weakReference.get() : null;
        if (webView != null) {
            try {
                webView.removeJavascriptInterface("JS_LANDING_PAGE_LOG_OBJ");
            } catch (Exception e6) {
                com.bytedance.sdk.component.utils.ul.emc("LandingPageLog", "removeJavascriptInterface exception", e6);
            }
        }
        if (this.msw.compareAndSet(false, true)) {
            emc(z6, "1");
            if (this.mxo) {
                xq.emc(this.ee, this.db, System.currentTimeMillis() - this.lt, this.wa, ru());
            }
        } else if (this.ycc == 2 && !this.ru.get()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("load_status", this.ycc);
                jSONObject.put("max_scroll_percent", this.mkp[0]);
                jSONObject.put("jump_times", this.xxg.getAndSet(0));
                jSONObject.put("click_times", this.yz.getAndSet(0));
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
            } catch (JSONException unused) {
            }
            emc("stay_page", jSONObject, 0L);
        }
        if ("landingpage".equals(this.db) || "landingpage_endcard".equals(this.db) || "landingpage_split_screen".equals(this.db) || "landingpage_direct".equals(this.db) || "aggregate_page".equals(this.db) || "landingpage_split_ceiling".equals(this.db)) {
            com.bytedance.sdk.openadsdk.ycc.ypw.emc().emc("landingFinish", this.ee, this.xhi);
        }
    }

    public void emc(boolean z6) {
        if (z6) {
            this.ylm = 1;
        }
    }

    public void bw(boolean z6) {
        this.cn = z6;
    }

    public void emc(sup supVar) {
        this.ra = supVar;
    }

    public void ypw(WebView webView, String str, boolean z6) {
        zz zzVar = this.yzg;
        if (zzVar == null || !z6) {
            return;
        }
        zzVar.emc(webView, str);
    }

    public void emc(long j6) {
        this.sf = j6;
    }

    public void emc(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.emc.ycc yccVar = this.vk;
        if (yccVar != null) {
            yccVar.emc(str);
        }
        zz zzVar = this.yzg;
        if (zzVar != null) {
            zzVar.xq(str);
        }
        this.db = str;
    }

    public void ypw(int i) {
        com.bytedance.sdk.openadsdk.core.widget.emc.ycc yccVar = this.vk;
        if (yccVar == null || !this.aa) {
            return;
        }
        yccVar.emc(i);
    }

    public void emc(int i) {
        this.wa = i;
    }

    public void emc(com.bytedance.sdk.openadsdk.dg.dg.bw bwVar) {
        this.tp = bwVar;
    }

    public void emc(com.bytedance.sdk.openadsdk.ylm.msw mswVar) {
        this.sba = mswVar;
    }

    public void emc(WebView webView, int i) throws JSONException {
        if (webView == null) {
            return;
        }
        if (this.wo == 0) {
            this.wo = SystemClock.elapsedRealtime();
        }
        if (this.dr == 0 && i > 0) {
            this.dr = System.currentTimeMillis();
        } else if (this.xmt == 0 && i == 100) {
            this.xmt = System.currentTimeMillis();
        }
        if (this.dg != xq.length && ("landingpage".equals(this.db) || "landingpage_endcard".equals(this.db) || "landingpage_split_screen".equals(this.db) || "landingpage_direct".equals(this.db) || "aggregate_page".equals(this.db))) {
            int i3 = this.dg;
            while (true) {
                int[] iArr = xq;
                if (i3 >= iArr.length || i < iArr[this.dg]) {
                    break;
                }
                int i6 = i3 + 1;
                this.dg = i6;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", webView.getUrl());
                    long j6 = this.bw;
                    if (j6 != -1) {
                        jSONObject.put("page_id", j6);
                    }
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put("pct", iArr[i3]);
                } catch (Exception unused) {
                }
                emc("progress_load_finish", jSONObject);
                i3 = i6;
            }
        }
        if (i == 100) {
            emc(false, SystemClock.elapsedRealtime());
            emc(webView.getUrl(), "progress", Math.min(this.xmt - this.dr, TTAdConstant.AD_MAX_EVENT_TIME));
        }
    }

    public void dg(String str) throws JSONException {
        if (!this.mxo || this.ee == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("render_type", "h5");
            jSONObject.putOpt("render_type_2", 0);
            int i = this.wa;
            if (i >= 0) {
                jSONObject.putOpt("preload_status", Integer.valueOf(i));
            }
            if (TextUtils.isEmpty(str)) {
                str = this.ee.xst();
            }
            jSONObject.put("url", str);
        } catch (Exception unused) {
        }
        emc("progress_load_finish", jSONObject);
    }

    private void emc(String str, String str2, long j6) {
        if (this.zz.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (str.length() > 200) {
                    int iIndexOf = str.indexOf(38, TTAdConstant.MATE_VALID);
                    int i = 300;
                    if (iIndexOf == -1 || iIndexOf > 300) {
                        iIndexOf = str.indexOf(63);
                    }
                    if (iIndexOf != -1 && iIndexOf <= 300) {
                        i = iIndexOf;
                    }
                    str = str.substring(0, i);
                }
                jSONObject.put("url", str);
                jSONObject.put("type", str2);
            } catch (Throwable unused) {
            }
            emc("load_finish_progress", jSONObject, j6);
        }
    }

    public void emc(WebView webView, String str, Bitmap bitmap, boolean z6, int i) throws JSONException {
        this.aa = z6;
        this.hxp++;
        com.bytedance.sdk.openadsdk.core.widget.emc.ycc yccVar = this.vk;
        if (yccVar != null && z6) {
            yccVar.ypw(str);
            this.vk.ypw();
        }
        zz zzVar = this.yzg;
        if (zzVar != null && z6) {
            zzVar.emc(str, i);
        }
        WeakReference<WebView> weakReference = this.iyl;
        WebView webView2 = weakReference != null ? weakReference.get() : null;
        if (webView2 != null) {
            try {
                WebBackForwardList webBackForwardListCopyBackForwardList = webView2.copyBackForwardList();
                if (webBackForwardListCopyBackForwardList != null && webBackForwardListCopyBackForwardList.getCurrentIndex() > this.pxa) {
                    this.xxg.incrementAndGet();
                }
                this.pxa = webBackForwardListCopyBackForwardList.getCurrentIndex();
            } catch (Exception e6) {
                com.bytedance.sdk.component.utils.ul.emc("LandingPageLog", "copyBackForwardList exception", e6);
            }
        }
        if (this.wo == 0) {
            this.wo = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.dg.dg.bw bwVar = this.tp;
        if (bwVar != null) {
            bwVar.bw();
        }
        if (this.uym.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
                int i3 = this.wa;
                if (i3 >= 0) {
                    jSONObject.putOpt("preload_status", Integer.valueOf(i3));
                }
            } catch (Exception unused) {
            }
            emc("load_start", jSONObject);
        }
    }

    public void emc(WebView webView, String str, boolean z6) throws JSONException {
        emc(false, SystemClock.elapsedRealtime());
        com.bytedance.sdk.openadsdk.core.widget.emc.ycc yccVar = this.vk;
        if (yccVar != null && z6) {
            yccVar.emc();
        }
        com.bytedance.sdk.openadsdk.dg.dg.bw bwVar = this.tp;
        if (bwVar != null) {
            bwVar.ycc();
        }
        zz zzVar = this.yzg;
        if (zzVar != null && z6) {
            zzVar.emc(str);
        }
        if (webView != null && !this.cuf && this.mxo) {
            this.cuf = true;
            com.bytedance.sdk.component.utils.qh.emc(webView, "javascript:\nfunction sendScroll(){\n   var totalH = document.body.scrollHeight || document.documentElement.scrollHeight;\n   var clientH = window.innerHeight || document.documentElement.clientHeight;\n   var scrollH = document.body.scrollTop || document.documentElement.scrollTop;\n   var validH = scrollH + clientH;\n   var result = (validH/totalH*100).toFixed(2);\n   console.log('LandingPageLogscroll status: (' + scrollH + '+' + clientH + ')/' + totalH + '=' + result);\n   window.JS_LANDING_PAGE_LOG_OBJ.readPercent(result);\n}\nsendScroll();\nwindow.addEventListener('scroll', function(e){\n    sendScroll();\n});");
        }
        if (this.msw.compareAndSet(false, true)) {
            if (this.ycc != 3) {
                this.ycc = 2;
            }
            this.sb = System.currentTimeMillis();
            boolean z7 = this.ycc == 2;
            int iRu = ru();
            if (z7) {
                long j6 = this.xmt - this.dr;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", this.gbl);
                    jSONObject.put("error_msg", this.sz);
                    jSONObject.put("error_url", this.qh);
                    int i = this.wa;
                    if (i >= 0) {
                        jSONObject.put("preload_status", i);
                    }
                    jSONObject.put("first_page", iRu);
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put("url", this.ee.xst());
                    jSONObject.put("preload_h5_type", this.ee.tp());
                } catch (Exception unused) {
                }
                emc(z6, "0");
                long jMin = Math.min(j6, TTAdConstant.AD_MAX_EVENT_TIME);
                emc("load_finish", jSONObject, jMin);
                if (zz()) {
                    this.but = SystemClock.elapsedRealtime();
                    ycc();
                    xq.emc(this.ee, this.ffd, this.but - this.rqm);
                }
                emc(str, "load_finish", jMin);
                sup supVar = this.ra;
                if (supVar != null) {
                    supVar.emc(iRu);
                    return;
                }
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("error_code", this.gbl);
                jSONObject2.put("error_msg", this.sz);
                jSONObject2.put("error_url", this.qh);
                jSONObject2.put("first_page", iRu);
                int i3 = this.wa;
                if (i3 >= 0) {
                    jSONObject2.put("preload_status", i3);
                }
                jSONObject2.putOpt("render_type", "h5");
                jSONObject2.putOpt("render_type_2", 0);
                jSONObject2.put("url", this.ee.xst());
                jSONObject2.put("preload_h5_type", this.ee.tp());
            } catch (Exception unused2) {
            }
            emc(z6, "2");
            emc("load_fail", jSONObject2);
            if (zz()) {
                xq.emc(this.ee, this.ffd, SystemClock.elapsedRealtime() - this.rqm, this.gbl, this.sz, this.qh);
            }
            if (this.sup) {
                jSONObject2.remove("render_type");
                jSONObject2.remove("render_type_2");
                emc("load_fail_main", jSONObject2);
            }
        }
    }

    public void emc(WebView webView, int i, String str, String str2, String str3, boolean z6) {
        com.bytedance.sdk.openadsdk.dg.dg.bw bwVar = this.tp;
        if (bwVar != null) {
            bwVar.emc((JSONObject) null);
        }
        if ((str3 == null || !str3.startsWith("image")) && this.ycc != 2) {
            this.ycc = 3;
        }
        this.gbl = i;
        this.sz = str;
        this.qh = str2;
        this.sup = z6;
    }

    public void emc(com.bytedance.sdk.component.zz.ycc yccVar) {
        int iLtx;
        Bitmap bitmapEmc;
        rie rieVar;
        if ((!"landingpage".equals(this.db) && !"landingpage_endcard".equals(this.db) && !"landingpage_split_screen".equals(this.db) && !"landingpage_direct".equals(this.db) && !"aggregate_page".equals(this.db)) || (iLtx = com.bytedance.sdk.openadsdk.core.aa.dg().ltx()) == 0 || new Random().nextInt(100) + 1 > iLtx || yccVar == null || yccVar.getWebView() == null || yccVar.getVisibility() != 0 || (bitmapEmc = vw.emc(yccVar)) == null || (rieVar = this.ee) == null) {
            return;
        }
        vw.emc(rieVar, this.db, "landing_page_blank", bitmapEmc, yccVar.getUrl(), this.bw);
    }

    private void emc(String str, JSONObject jSONObject) {
        emc(str, jSONObject, -1L);
    }

    private void emc(final String str, final JSONObject jSONObject, final long j6) {
        if (!this.mxo || this.ee == null || TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.ylm.msw mswVar = this.sba;
        final int iMxo = mswVar != null ? mswVar.mxo() : -1;
        xq.emc(System.currentTimeMillis(), this.ee, this.db, str, new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.sz.1
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject emc() {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    if ("load_start".equals(str) || "load_finish".equals(str) || "progress_load_finish".equals(str)) {
                        jSONObject2.put("is_reused", sz.this.cn ? 1 : 0);
                    }
                    if (com.bytedance.sdk.openadsdk.qh.emc.xq(sz.this.ee)) {
                        jSONObject2.put("is_lp_pre_render", sz.this.ylm);
                    }
                    return jSONObject2;
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() throws JSONException {
                if (jSONObject != null) {
                    try {
                        boolean zYpw = dr.ypw(sz.this.ee);
                        jSONObject.put("is_playable", zYpw ? 1 : 0);
                        jSONObject.put("usecache", com.bytedance.sdk.openadsdk.core.sz.xq.emc.emc().emc(sz.this.ee) ? 1 : 0);
                        if (zYpw && ("load_finish".equals(str) || "load_fail".equals(str))) {
                            jSONObject.put("playable_has_show", iMxo);
                        }
                        if ("stay_page".equals(str)) {
                            jSONObject.put("first_page", sz.this.hxp > 1 ? 0 : 1);
                        }
                    } catch (JSONException unused) {
                    }
                }
                String unused2 = sz.this.db;
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject ypw() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    long j7 = j6;
                    if (j7 > 0) {
                        jSONObject2.put("duration", j7);
                    }
                } catch (Throwable unused) {
                }
                return jSONObject2;
            }
        });
    }

    public void emc(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.widget.emc.ycc yccVar = this.vk;
        if (yccVar != null && this.aa) {
            yccVar.emc(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.wo != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.yz.incrementAndGet();
                this.yz.get();
                if (this.wpn.getAndSet(true)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", this.ee.xst());
                } catch (JSONException unused) {
                }
                emc("click_time", jSONObject, Math.max(SystemClock.elapsedRealtime() - this.wo, 0L));
            }
        }
    }

    public void emc(String str, boolean z6) {
        com.bytedance.sdk.openadsdk.core.widget.emc.ycc yccVar = this.vk;
        if (yccVar != null && z6) {
            yccVar.xq(str);
        }
        zz zzVar = this.yzg;
        if (zzVar == null || !z6) {
            return;
        }
        zzVar.ypw(str);
    }

    private void emc(boolean z6, final String str) {
        if (z6) {
            final int iRu = ru();
            xq.emc(new com.bytedance.sdk.component.msw.msw("sendPrefLog") { // from class: com.bytedance.sdk.openadsdk.dg.sz.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.bytedance.sdk.openadsdk.core.settings.ycc yccVarRtt = com.bytedance.sdk.openadsdk.core.aa.dg().rtt();
                        boolean zEmc = sz.this.emc(yccVarRtt, str);
                        if (zEmc) {
                            if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.ycc.ypw)) {
                                sz.this.emc(iRu, str);
                                return;
                            }
                            if (TextUtils.isEmpty(yccVarRtt.xq) || !zEmc) {
                                return;
                            }
                            String str2 = yccVarRtt.xq;
                            com.bytedance.sdk.component.uym.ypw.ypw ypwVarXq = com.bytedance.sdk.openadsdk.yzg.ypw.ypw().xq().xq();
                            ypwVarXq.ypw(str2);
                            HashMap map = new HashMap();
                            map.put("content-type", "application/json; charset=utf-8");
                            ypwVarXq.dg(map);
                            ypwVarXq.emc(9);
                            ypwVarXq.emc("sendPrefLog");
                            ypwVarXq.emc(new com.bytedance.sdk.component.uym.emc.emc() { // from class: com.bytedance.sdk.openadsdk.dg.sz.2.1
                                @Override // com.bytedance.sdk.component.uym.emc.emc
                                public void emc(com.bytedance.sdk.component.uym.ypw.xq xqVar, IOException iOException) {
                                }

                                @Override // com.bytedance.sdk.component.uym.emc.emc
                                public void emc(com.bytedance.sdk.component.uym.ypw.xq xqVar, com.bytedance.sdk.component.uym.ypw ypwVar) {
                                    try {
                                        com.bytedance.sdk.openadsdk.core.settings.ycc.ypw = ypwVar.dg();
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        sz.this.emc(iRu, str);
                                    } catch (Exception e6) {
                                        com.bytedance.sdk.component.utils.ul.emc("LandingPageLog", "TTWebViewClient : onPageFinished", e6);
                                    }
                                }
                            });
                        }
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.ul.xq(th.getMessage(), new Object[0]);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(int i, String str) {
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.ycc.ypw)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb = new StringBuilder(com.bytedance.sdk.openadsdk.core.settings.ycc.ypw);
            jSONObject.putOpt("cid", emc().ye());
            jSONObject.putOpt("ad_id", emc().ye());
            jSONObject.put("log_extra", emc().wdp());
            tp.emc(sb, "\"/** adInfo **/\"", jSONObject.toString());
            tp.emc(sb, "\"/** first_page **/\"", String.valueOf(i));
            tp.emc(sb, "\"/** ix_to_externalurl **/\"", this.bw != -1 ? "1" : "0");
            tp.emc(sb, "\"/** preload_status **/\"", this.wa == 2 ? "2" : "0");
            tp.emc(sb, "\"/** scene_state **/\"", str);
            tp.emc(sb, "\"/** web_init_time **/\"", String.valueOf(this.ndl));
            tp.emc(sb, "\"/** channel_name **/\"", "\"" + emc().qlw() + "\"");
            tp.emc(sb, "\"/** session_id **/\"", "\"" + UUID.randomUUID().toString() + "\"");
            tp.emc(sb, "\"/** web_url **/\"", "\"" + emc().xst() + "\"");
            String string = sb.toString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            final String strBw = bw(string);
            WeakReference<WebView> weakReference = this.iyl;
            final WebView webView = weakReference != null ? weakReference.get() : null;
            if (TextUtils.isEmpty(strBw) || webView == null) {
                return;
            }
            iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dg.sz.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.component.utils.qh.emc(webView, strBw);
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.xq(th.getMessage(), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean emc(com.bytedance.sdk.openadsdk.core.settings.ycc yccVar, String str) {
        str.getClass();
        switch (str) {
            case "0":
                return yccVar.dg;
            case "1":
                return yccVar.bw;
            case "2":
                return yccVar.ycc;
            default:
                return false;
        }
    }

    public void emc(boolean z6, long j6) {
        if (z6) {
            this.sra = j6;
        } else {
            this.rie = j6;
        }
        if (this.sra <= 0 || this.rie <= 0 || !this.aa || !this.ypw.compareAndSet(false, true)) {
            return;
        }
        emc(this.ee, this.db, this.rie - this.sra, this.ylm, this.cn);
    }

    public static void emc(final rie rieVar, final String str, final long j6, final int i, final boolean z6) {
        xq.emc(System.currentTimeMillis(), rieVar, str, "lp_feeling_duration", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.sz.4
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject emc() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_lp_pre_render", i);
                    jSONObject.put("meta_pre_render", rieVar.ckv() ? 1 : 0);
                    com.bytedance.sdk.openadsdk.core.model.yzg yzgVarDb = rieVar.db();
                    if (yzgVarDb == null) {
                        yzgVarDb = new com.bytedance.sdk.openadsdk.core.model.yzg();
                    }
                    jSONObject.put("pre_render_status", yzgVarDb.xq());
                    jSONObject.put("pre_render_use_gecko", yzgVarDb.ypw());
                    jSONObject.put("pre_render_add_type", yzgVarDb.emc());
                    jSONObject.put("is_reused", z6 ? 1 : 0);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject ypw() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j6);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public void emc(String str, long j6) throws JSONException {
        if (!this.mxo || this.ee == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_code", this.gbl);
            jSONObject.put("error_msg", this.sz);
            jSONObject.put("error_url", this.qh);
            int i = this.wa;
            if (i >= 0) {
                jSONObject.put("preload_status", i);
            }
            jSONObject.put("first_page", ru());
            jSONObject.putOpt("render_type", "h5");
            jSONObject.putOpt("render_type_2", 0);
            if (TextUtils.isEmpty(str)) {
                str = this.ee.xst();
            }
            jSONObject.put("url", str);
            jSONObject.put("preload_h5_type", this.ee.tp());
        } catch (Exception unused) {
        }
        emc("load_finish", jSONObject, Math.min(j6, TTAdConstant.AD_MAX_EVENT_TIME));
    }
}
