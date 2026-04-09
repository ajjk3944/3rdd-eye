package com.bytedance.sdk.openadsdk.component.reward.emc;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.emc.emc.emc.xq.b;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.ul;
import com.bytedance.sdk.openadsdk.core.rtt;
import com.bytedance.sdk.openadsdk.core.widget.emc.ycc;
import com.bytedance.sdk.openadsdk.core.xq.xq;
import com.bytedance.sdk.openadsdk.core.xq.ypw;
import com.bytedance.sdk.openadsdk.dg.xq;
import com.bytedance.sdk.openadsdk.dg.yzg;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.sra;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.vw;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class vk implements com.bytedance.sdk.openadsdk.sz.msw {
    private ycc.emc but;
    private com.bytedance.sdk.component.zz.ycc cf;
    com.bytedance.sdk.openadsdk.dg.sz dg;
    private final com.bytedance.sdk.openadsdk.component.reward.emc.emc dr;
    rtt emc;
    private boolean ffd;
    private int gbl;
    private long hxp;
    private boolean iyl;
    private com.bytedance.sdk.openadsdk.core.widget.emc.bw lt;
    private boolean mkp;
    private boolean mxo;
    private boolean ndl;
    private int qh;
    private float rie;
    private boolean rtt;
    private final String ru;
    private boolean sba;
    private float sra;
    private final boolean sup;
    private int sz;
    private View ul;
    protected com.bytedance.sdk.openadsdk.dg.dg.bw uym;
    private long vw;
    private boolean wad;
    private com.bytedance.sdk.openadsdk.common.bw wd;
    private int wo;
    private ILoader wpn;
    protected String xq;
    private View ylm;
    private String yz;
    private boolean yzg;
    protected boolean ypw = true;
    private boolean vk = false;

    /* renamed from: aa, reason: collision with root package name */
    private final AtomicBoolean f9275aa = new AtomicBoolean(true);
    int bw = 0;
    String ycc = "";
    boolean msw = false;
    private SparseArray<xq.emc> ee = new SparseArray<>();
    private boolean db = true;
    private float sb = -1.0f;
    private float sf = -1.0f;
    private boolean xmt = false;
    private long cuf = 0;
    private long tp = -1;
    private volatile int ra = 0;
    private int xxg = -1;
    private volatile int pxa = 0;
    private volatile int wa = 0;
    private long rqm = 0;
    public boolean zz = false;
    private int hj = -1;

    public interface dg {
        void emc(WebView webView, String str);
    }

    public static class xq implements com.bytedance.sdk.openadsdk.sz.ru {
        private final com.bytedance.sdk.component.zz.ycc emc;

        @Override // com.bytedance.sdk.openadsdk.sz.ru
        public void emc() {
            com.bytedance.sdk.component.zz.ycc yccVar = this.emc;
            if (yccVar == null) {
                return;
            }
            yccVar.cf();
        }

        @Override // com.bytedance.sdk.openadsdk.sz.ru
        public void ypw() {
            com.bytedance.sdk.component.zz.ycc yccVar = this.emc;
            if (yccVar == null) {
                return;
            }
            yccVar.sba();
        }

        private xq(com.bytedance.sdk.component.zz.ycc yccVar) {
            this.emc = yccVar;
        }
    }

    public static class ypw implements com.bytedance.sdk.openadsdk.sz.emc {
        private final View emc;

        public ypw(View view) {
            this.emc = view;
        }

        @Override // com.bytedance.sdk.openadsdk.sz.emc
        public int emc() {
            View view = this.emc;
            int measuredHeight = view != null ? view.getMeasuredHeight() : -1;
            return measuredHeight <= 0 ? vw.bw(com.bytedance.sdk.openadsdk.core.aa.emc()) : measuredHeight;
        }

        @Override // com.bytedance.sdk.openadsdk.sz.emc
        public int ypw() {
            View view = this.emc;
            int measuredWidth = view != null ? view.getMeasuredWidth() : -1;
            return measuredWidth <= 0 ? vw.xq(com.bytedance.sdk.openadsdk.core.aa.emc()) : measuredWidth;
        }
    }

    public vk(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
        this.dr = emcVar;
        this.ru = emcVar.bw;
        this.sup = emcVar.dg;
    }

    public static /* synthetic */ int gbl(vk vkVar) {
        int i10 = vkVar.pxa;
        vkVar.pxa = i10 + 1;
        return i10;
    }

    private com.bytedance.sdk.openadsdk.dg.dg.bw iyl() {
        return new yzg(2, this.sup ? "rewarded_video" : "fullscreen_interstitial_ad", this.dr.ypw);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mkp() {
        this.rtt = true;
        this.ndl = false;
        this.dr.ra.removeMessages(Sdk$SDKError.Reason.NATIVE_ASSET_ERROR_VALUE);
        this.dr.ra.removeMessages(700);
        this.dr.ra.removeMessages(900);
        this.dr.cuf.dg(false);
        this.dr.vk.set(true);
        this.dr.cn.sz();
        rie rieVar = this.dr.ypw;
        rieVar.pdv();
        if (rieVar.pdv() || !tp.msw(dr.emc(rieVar))) {
            return;
        }
        View viewRu = this.dr.mkp.ru();
        View.OnClickListener onClickListener = (View.OnClickListener) viewRu.getTag(viewRu.getId());
        if (onClickListener != null) {
            emc emcVar = new emc(this.dr, viewRu, onClickListener);
            viewRu.setOnClickListener(emcVar);
            viewRu.setOnTouchListener(emcVar);
        }
    }

    public static /* synthetic */ int qh(vk vkVar) {
        int i10 = vkVar.ra;
        vkVar.ra = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int sz(vk vkVar) {
        int i10 = vkVar.wa;
        vkVar.wa = i10 + 1;
        return i10;
    }

    public boolean cuf() {
        return this.rtt;
    }

    public boolean dr() {
        return this.ndl;
    }

    public void lt() {
        com.bytedance.sdk.openadsdk.dg.sz szVar = this.dg;
        if (szVar != null) {
            szVar.bw();
        }
    }

    public boolean rtt() {
        return this.zz;
    }

    public boolean sf() {
        return this.sba && this.f9275aa.get();
    }

    public boolean xmt() {
        com.bytedance.sdk.component.zz.ycc yccVar = this.cf;
        return yccVar == null || yccVar.getWebView() == null;
    }

    public void aa() {
        com.bytedance.sdk.component.zz.ycc yccVar = this.cf;
        if (yccVar != null) {
            yccVar.sz();
        }
        if (this.tp == 0) {
            this.tp = SystemClock.elapsedRealtime();
        }
        rie rieVar = this.dr.ypw;
        rtt rttVar = this.emc;
        if (rttVar != null) {
            rttVar.gbl();
            com.bytedance.sdk.component.zz.ycc yccVar2 = this.cf;
            if (yccVar2 != null) {
                if (yccVar2.getVisibility() == 0) {
                    this.emc.emc(true);
                    ypw(this.emc, true);
                    emc(this.emc, false, true);
                    if (dr.msw(rieVar) && !this.rtt && this.dr.ypw.pdv()) {
                        uym();
                    }
                } else {
                    this.emc.emc(false);
                    ypw(this.emc, false);
                    emc(this.emc, true, false);
                }
            }
        }
        com.bytedance.sdk.openadsdk.dg.sz szVar = this.dg;
        if (szVar != null) {
            szVar.uym();
        }
    }

    public void cf() {
        com.bytedance.sdk.openadsdk.dg.dg.bw bwVar = this.uym;
        if (bwVar != null) {
            bwVar.zz();
        }
        com.bytedance.sdk.openadsdk.dg.sz szVar = this.dg;
        if (szVar != null) {
            szVar.msw();
        }
    }

    public void db() {
        com.bytedance.sdk.openadsdk.dg.dg.bw bwVar = this.uym;
        if (bwVar != null) {
            bwVar.ru();
        }
    }

    public void ee() {
        com.bytedance.sdk.openadsdk.dg.dg.bw bwVar = this.uym;
        if (bwVar != null) {
            bwVar.xq();
            this.uym.dg();
        }
    }

    public void gbl() {
        com.bytedance.sdk.component.zz.ycc yccVar = this.cf;
        if (yccVar != null) {
            com.bytedance.sdk.component.utils.dr.emc(yccVar);
        }
        rie rieVar = this.dr.ypw;
        long j10 = this.vw;
        if (j10 > 0) {
            if (this.tp > 0) {
                this.vw = j10 + (SystemClock.elapsedRealtime() - this.tp);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("endcard_overlay_render_type", rie.xq(rieVar) ? 7 : 0);
            } catch (Throwable unused) {
            }
            com.bytedance.sdk.openadsdk.dg.xq.emc(this.dr.ypw, this.ru, "second_endcard_duration", jSONObject, this.vw);
        }
        this.cf = null;
        if (this.uym != null && !ul.dg(rieVar) && !ul.uym(rieVar) && !rie.xq(rieVar)) {
            this.uym.emc(true);
            this.uym.sup();
        }
        rtt rttVar = this.emc;
        if (rttVar != null) {
            rttVar.sup();
        }
        com.bytedance.sdk.openadsdk.dg.sz szVar = this.dg;
        if (szVar != null) {
            szVar.dg(rieVar.oa());
        }
        DeviceUtils.AudioInfoReceiver.ypw(this);
    }

    public boolean hxp() {
        return this.msw;
    }

    public com.bytedance.sdk.component.zz.ycc msw() {
        return this.cf;
    }

    public boolean qh() {
        return this.sba;
    }

    public void rie() {
        com.bytedance.sdk.openadsdk.dg.sz szVar = this.dg;
        if (szVar != null) {
            szVar.emc(System.currentTimeMillis());
        }
    }

    public void ru() {
        com.bytedance.sdk.openadsdk.activity.msw mswVar;
        rie rieVar = this.dr.ypw;
        String strMsw = rieVar.msw();
        if (!TextUtils.isEmpty(strMsw) && (mswVar = this.dr.pe) != null && (mswVar.tp() || this.dr.pe.wo().ee())) {
            this.xq = strMsw;
        } else if (dr.bw(rieVar)) {
            b bVarIat = rieVar.iat();
            if (bVarIat != null) {
                this.xq = bVarIat.v();
            }
        } else {
            this.xq = dr.sup(rieVar);
        }
        String strEmc = emc(this.xq, rieVar, this.gbl, this.qh, this.sz);
        this.xq = strEmc;
        if (TextUtils.isEmpty(strEmc)) {
            return;
        }
        this.mkp = this.xq.contains("use_second_endcard=1");
    }

    public boolean sb() {
        rtt rttVar = this.emc;
        if (rttVar == null) {
            return false;
        }
        return rttVar.zz();
    }

    public int sba() {
        return this.bw;
    }

    public void sra() {
        com.bytedance.sdk.openadsdk.dg.dg.bw bwVar = this.uym;
        if (bwVar != null) {
            bwVar.uym();
        }
    }

    public boolean sup() {
        String str = this.xq;
        if (str == null) {
            return false;
        }
        try {
            return Uri.parse(str).getQueryParameterNames().contains("show_landingpage");
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean sz() {
        return this.f9275aa.get();
    }

    public boolean ul() {
        return rie.xq(this.dr.ypw) ? this.mkp && !this.iyl && this.dr.lt.sup() : this.mkp && !this.iyl && this.f9275aa.get() && this.sba;
    }

    public void uym() {
        this.emc.emc("showPlayableEndCardOverlay", (JSONObject) null);
        this.dr.ra.sendEmptyMessageDelayed(Sdk$SDKError.Reason.NATIVE_ASSET_ERROR_VALUE, 1000L);
        this.dr.ra.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.vk.10
            @Override // java.lang.Runnable
            public void run() {
                vk.this.mkp();
            }
        }, 1000L);
        com.bytedance.sdk.openadsdk.utils.qh qhVar = this.dr.nw;
        if (qhVar != null) {
            qhVar.emc(0L);
        }
    }

    public void vk() throws JSONException {
        com.bytedance.sdk.component.zz.ycc yccVar = this.cf;
        if (yccVar != null) {
            yccVar.cf();
        }
        if (this.tp > 0) {
            this.vw += SystemClock.elapsedRealtime() - this.tp;
            this.tp = 0L;
        }
        rtt rttVar = this.emc;
        if (rttVar != null) {
            rttVar.emc(false);
            ypw(this.emc, false);
            emc(this.emc, true, false);
        }
    }

    public void ylm() {
        com.bytedance.sdk.openadsdk.dg.dg.bw bwVar = this.uym;
        if (bwVar != null) {
            bwVar.msw();
        }
    }

    public String yzg() {
        return this.ycc;
    }

    public rtt zz() {
        return this.emc;
    }

    public void bw() {
        if (dr.bw(this.dr.ypw) && this.dr.bv) {
            return;
        }
        ycc();
    }

    public void ycc() {
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.dr;
        rie rieVar = emcVar.ypw;
        if (TextUtils.isEmpty(rie.emc(emcVar.vw, rieVar))) {
            if (rieVar != null && !rieVar.mkp() && this.wpn == null && sup()) {
                this.yz = rieVar.qlw();
                this.wpn = com.bytedance.sdk.openadsdk.uym.ypw.emc().ypw();
                int iEmc = com.bytedance.sdk.openadsdk.uym.ypw.emc().emc(this.wpn, this.yz);
                this.wo = iEmc;
                this.xxg = iEmc > 0 ? 2 : 0;
                if (!TextUtils.isEmpty(this.yz)) {
                    com.bytedance.sdk.openadsdk.dg.sz szVar = this.dg;
                    if (szVar != null) {
                        szVar.emc(this.xxg);
                    }
                    xq.emc.emc(this.rqm, rieVar, "landingpage_endcard", this.wpn, this.yz);
                }
            }
            if ((!TextUtils.isEmpty(this.xq) && this.xq.contains("play.google.com/store")) || ((rieVar != null && !rieVar.wpn() && ul.msw(rieVar)) || ul.uym(rieVar))) {
                this.msw = true;
                return;
            }
            Log.d("TTAD.RFWVM", "preLoadEndCardForce: return mShouldPreloadEndCard " + this.ypw + ",webViewIsLoading " + this.ffd);
            if (this.ypw) {
                boolean z10 = this.dr.ltx;
                if (this.cf != null && ((z10 || !TextUtils.isEmpty(this.xq)) && rie.ypw(rieVar))) {
                    if (this.ffd) {
                        return;
                    }
                    String str = this.xq + "&is_pre_render=1";
                    com.bytedance.sdk.openadsdk.dg.sz szVar2 = this.dg;
                    if (szVar2 != null) {
                        szVar2.dg();
                    }
                    sra.emc(this.cf, str);
                    this.ffd = true;
                    return;
                }
                if (rie.xq(rieVar)) {
                    this.dr.lt.xq();
                }
            }
        }
    }

    public boolean dg() {
        return this.iyl;
    }

    public boolean xq() {
        return this.mxo;
    }

    public void ypw() {
        this.ul = this.dr.mxo.findViewById(R.id.content);
        com.bytedance.sdk.component.zz.ycc yccVar = (com.bytedance.sdk.component.zz.ycc) this.dr.iyl.findViewById(com.bytedance.sdk.openadsdk.utils.vk.vk);
        this.cf = yccVar;
        if (yccVar != null && rie.ypw(this.dr.ypw)) {
            this.cf.bw();
        } else {
            vw.emc((View) this.cf, 8);
        }
        com.bytedance.sdk.component.zz.ycc yccVar2 = this.cf;
        if (yccVar2 != null) {
            yccVar2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.vk.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() throws JSONException {
                    if (vk.this.cf == null || vk.this.cf.getViewTreeObserver() == null) {
                        return;
                    }
                    vk.this.cf.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int measuredWidth = vk.this.cf.getMeasuredWidth();
                    int measuredHeight = vk.this.cf.getMeasuredHeight();
                    if (vk.this.cf.getVisibility() == 0) {
                        vk.this.emc(measuredWidth, measuredHeight);
                    }
                }
            });
        }
    }

    public void bw(boolean z10) {
        if (this.emc == null || this.dr.mxo.isFinishing()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z10);
            this.emc.emc("volumeChange", jSONObject);
        } catch (Exception unused) {
        }
    }

    public void dg(boolean z10) {
        if (dr.ypw(this.dr.ypw)) {
            return;
        }
        bw(z10);
    }

    public void xq(boolean z10) throws JSONException {
        ypw(this.emc, z10);
    }

    public static class emc extends com.bytedance.sdk.openadsdk.core.xq.emc implements ypw.emc {
        private final com.bytedance.sdk.openadsdk.component.reward.emc.emc emc;
        private final View.OnClickListener xq;
        private final View ypw;

        public emc(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar, View view, View.OnClickListener onClickListener) {
            super(emcVar.mxo, emcVar.ypw, emcVar.bw, emcVar.dg ? 7 : 5);
            this.emc = emcVar;
            this.ypw = view;
            this.xq = onClickListener;
            HashMap map = new HashMap();
            map.put("close_auto_click", Boolean.TRUE);
            map.put("click_scence", 2);
            emc(map);
            emc(emcVar.sra.xq());
            emc(this);
        }

        @Override // com.bytedance.sdk.openadsdk.core.xq.emc, com.bytedance.sdk.openadsdk.core.xq.ypw, com.bytedance.sdk.openadsdk.core.xq.xq
        public void emc(View view, float f10, float f11, float f12, float f13, SparseArray<xq.emc> sparseArray, boolean z10) {
            if (!this.emc.ypw.pdv()) {
                super.emc(view, f10, f11, f12, f13, sparseArray, z10);
                this.emc.tp.mkp();
            } else {
                this.xq.onClick(view);
                this.ypw.setOnTouchListener(null);
                this.ypw.setOnClickListener(this.xq);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.xq.ypw.emc
        public void emc(View view, int i10) {
            this.ypw.setOnTouchListener(null);
            this.ypw.setOnClickListener(this.xq);
        }
    }

    public void uym(boolean z10) {
        this.ndl = z10;
    }

    public void emc() {
        if (this.yzg) {
            return;
        }
        this.yzg = true;
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.dr;
        this.gbl = emcVar.rqm;
        this.sz = emcVar.but;
        this.qh = emcVar.wd;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ypw();
        this.rqm = SystemClock.elapsedRealtime() - jElapsedRealtime;
    }

    public void ypw(boolean z10) {
        emc(this.emc, z10);
    }

    public void ypw(rtt rttVar, boolean z10) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewStatus", z10 ? 1 : 0);
            rttVar.emc("viewableChange", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.sz.msw
    public void ypw(int i10) {
        int i11 = this.hj;
        if (i11 <= 0 && i10 > 0) {
            dg(false);
        } else if (i11 > 0 && i10 == 0) {
            dg(true);
        }
        this.hj = i10;
    }

    public void emc(String str, final com.bytedance.sdk.openadsdk.core.sz.dg.ypw ypwVar) {
        emc(str, new dg() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.vk.5
            @Override // com.bytedance.sdk.openadsdk.component.reward.emc.vk.dg
            public void emc(WebView webView, String str2) {
                if (vk.this.dr.mxo.isFinishing()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.emc.emc unused = vk.this.dr;
                vk.this.sz();
            }
        });
        emc(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.vk.6
            @Override // android.webkit.DownloadListener
            public void onDownloadStart(String str2, String str3, String str4, String str5, long j10) {
                vk.this.dr.sra.ypw();
                com.bytedance.sdk.openadsdk.core.sz.dg.ypw ypwVar2 = ypwVar;
                if (ypwVar2 != null) {
                    ypwVar2.hj();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(int i10, com.bytedance.sdk.openadsdk.core.sz.dg.ypw ypwVar) {
        this.dr.ul.get();
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.dr;
        com.bytedance.sdk.openadsdk.activity.msw mswVar = emcVar.pe;
        if (mswVar == null || !mswVar.sup || emcVar.ul.get()) {
            return;
        }
        this.dr.ul.set(true);
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = this.dr;
        if (emcVar2.wbn && ul.sz(emcVar2.ypw) && ypwVar != null) {
            ypwVar.bw();
        }
    }

    public void emc(com.bytedance.sdk.openadsdk.sz.ycc yccVar, String str, final com.bytedance.sdk.openadsdk.core.sz.dg.ypw ypwVar) {
        if (this.cf == null) {
            return;
        }
        HashMap map = new HashMap();
        final rie rieVar = this.dr.ypw;
        map.put("click_scence", 2);
        this.uym = iyl();
        rtt rttVar = new rtt(this.dr.mxo);
        this.emc = rttVar;
        rttVar.emc(this.dr.tp);
        rtt rttVarEmc = this.emc.ypw(this.cf).emc(rieVar).emc(com.bytedance.sdk.openadsdk.core.zz.emc.ypw.emc(rieVar)).xq(rieVar.ye()).dg(rieVar.wdp()).ypw(rieVar.zc() ? 7 : 5).emc(new ypw(this.cf)).bw(rieVar.drx()).emc(this.cf);
        if (sup()) {
            str = "landingpage_endcard";
        }
        rttVarEmc.ypw(str).emc(map).emc(this.uym).emc(new com.bytedance.sdk.openadsdk.core.widget.bw() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.vk.8
            @Override // com.bytedance.sdk.openadsdk.core.widget.bw
            public void emc() {
                if (vk.this.lt != null) {
                    vk.this.lt.xq();
                }
                com.bytedance.sdk.openadsdk.core.sz.dg.ypw ypwVar2 = ypwVar;
                if (ypwVar2 != null) {
                    ypwVar2.hj();
                }
            }
        }).emc(new rtt.emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.vk.7
            @Override // com.bytedance.sdk.openadsdk.core.rtt.emc
            public void emc() {
                vk.this.mkp();
            }
        });
        this.emc.emc(new xq(this.cf));
        this.emc.emc(this.dr.mkp.ru()).emc(this.dr.rie.xq()).emc(new com.bytedance.sdk.openadsdk.sz.xq() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.vk.9
            @Override // com.bytedance.sdk.openadsdk.sz.xq
            public void emc(boolean z10, int i10, String str2) throws JSONException {
                if (z10) {
                    vk vkVar = vk.this;
                    vkVar.zz = true;
                    if (vkVar.wad) {
                        vk.this.wad = false;
                        vk vkVar2 = vk.this;
                        vkVar2.emc(vkVar2.dr.yz, true);
                    }
                }
                if (rie.dg(rieVar)) {
                    vk.this.emc(z10, i10, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.sz.xq
            public void emc() {
                vk.this.mxo = true;
                vk.this.dr.mkp.ru().performClick();
            }
        });
        this.emc.dg(this.mkp);
    }

    public void ycc(boolean z10) {
        this.iyl = true;
        JSONObject jSONObject = new JSONObject();
        rie rieVar = this.dr.ypw;
        try {
            jSONObject.put("endcard_overlay_render_type", rie.xq(rieVar) ? 7 : 0);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.dg.xq.ypw(rieVar, this.ru, "use_second_endcard", jSONObject);
        this.tp = SystemClock.elapsedRealtime();
        try {
            if (!rie.xq(rieVar)) {
                this.emc.emc("click_endcard_close", (JSONObject) null);
            } else if (z10) {
                this.dr.lt.msw();
                com.bytedance.sdk.openadsdk.dg.xq.ypw(rieVar, this.ru, "endcard_close_skip", jSONObject);
            }
        } catch (Exception unused2) {
        }
        this.dr.nw.emc(r5.uym);
    }

    public void emc(int i10, int i11) throws JSONException {
        if (this.emc == null || this.dr.mxo.isFinishing()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", i10);
            jSONObject.put("height", i11);
            this.emc.emc("resize", jSONObject);
        } catch (Exception e10) {
            Log.e("TTAD.RFWVM", "", e10);
        }
    }

    public void emc(boolean z10) {
        this.ypw = z10;
    }

    private static String emc(String str, rie rieVar, int i10, int i11, int i12) {
        String str2;
        String str3;
        float fKx = rieVar.kx();
        if (!TextUtils.isEmpty(str)) {
            if (i10 == 1) {
                if (str.contains("?")) {
                    str3 = str + "&";
                } else {
                    str3 = str + "?";
                }
                str = str3 + "orientation=portrait";
            }
            if (str.contains("?")) {
                str2 = str + "&";
            } else {
                str2 = str + "?";
            }
            str = str2 + "height=" + i11 + "&width=" + i12 + "&aspect_ratio=" + fKx;
        }
        return !dr.ypw(rieVar) ? com.bytedance.sdk.openadsdk.utils.ycc.emc(str) : str;
    }

    public void emc(int i10) {
        if (this.sba || !this.f9275aa.get()) {
            emc(0, this.dr.tp);
        }
        vw.emc((View) this.cf, i10);
        com.bytedance.sdk.component.zz.ycc yccVar = this.cf;
        if (yccVar != null) {
            vw.emc((View) yccVar.getWebView(), i10);
        }
        rie rieVar = this.dr.ypw;
        if (this.cf == null || !rieVar.oa()) {
            return;
        }
        this.cf.setLandingPage(true);
        this.cf.setTag("landingpage_endcard");
        this.cf.setMaterialMeta(rieVar.wg());
    }

    public void emc(float f10) {
        vw.emc(this.cf, f10);
    }

    public void emc(rtt rttVar, boolean z10) {
        if (this.emc == null || this.dr.mxo.isFinishing()) {
            return;
        }
        rttVar.emc(z10);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void emc(String str, final dg dgVar) {
        com.bytedance.sdk.component.zz.ycc yccVar;
        final rie rieVar = this.dr.ypw;
        com.bytedance.sdk.component.zz.ycc yccVar2 = this.cf;
        if (yccVar2 == null || yccVar2.getWebView() == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.dg.sz szVarYpw = new com.bytedance.sdk.openadsdk.dg.sz(rieVar, this.cf.getWebView(), new com.bytedance.sdk.openadsdk.dg.sup() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.vk.11
            @Override // com.bytedance.sdk.openadsdk.dg.sup
            public void emc(int i10) {
                if (TextUtils.isEmpty(vk.this.yz)) {
                    return;
                }
                xq.emc.emc(vk.this.wo, vk.this.ra, vk.this.wa, vk.this.pxa - vk.this.wa, rieVar, "landingpage_endcard", i10);
            }
        }, this.xxg).ypw(true);
        this.dg = szVarYpw;
        this.but = szVarYpw.emc;
        szVarYpw.emc(sup() ? "landingpage_endcard" : str);
        this.dg.ypw(this.ru);
        this.dg.xq(true);
        int i10 = Build.VERSION.SDK_INT;
        this.cf.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.vk.12
            @Override // android.view.View.OnScrollChangeListener
            public void onScrollChange(View view, int i11, int i12, int i13, int i14) {
                com.bytedance.sdk.openadsdk.dg.sz szVar = vk.this.dg;
                if (szVar != null) {
                    szVar.ypw(i12);
                }
            }
        });
        msw mswVar = this.dr.rie;
        if (mswVar != null) {
            this.dg.emc(mswVar.emc());
        }
        com.bytedance.sdk.openadsdk.common.bw bwVarEmc = tp.emc(rieVar, this.cf, this.dr.mxo, this.ru);
        this.wd = bwVarEmc;
        if (bwVarEmc != null) {
            bwVarEmc.emc(sup() ? "landingpage_endcard" : str);
        }
        if (sup()) {
            tp.emc(rieVar, this.cf);
        }
        com.bytedance.sdk.openadsdk.core.widget.emc.bw bwVar = new com.bytedance.sdk.openadsdk.core.widget.emc.bw(com.bytedance.sdk.openadsdk.core.aa.emc(), this.emc, rieVar.ye(), this.wd, this.dg, rieVar.oa()) { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.vk.2
            @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str2) {
                super.onPageFinished(webView, str2);
                vk.this.ffd = false;
                vk.this.sba = true;
                vk vkVar = vk.this;
                vkVar.emc(100, vkVar.dr.tp);
                if (vk.this.dr.xmt.ul()) {
                    View viewRu = vk.this.dr.mkp.ru();
                    if (viewRu instanceof com.bytedance.sdk.openadsdk.core.ycc.dg) {
                        ((com.bytedance.sdk.openadsdk.core.ycc.dg) viewRu).setImageResource(com.bytedance.sdk.component.utils.rie.dg(vk.this.dr.vw, "tt_skip_btn"));
                    }
                }
                DeviceUtils.AudioInfoReceiver.emc(vk.this);
                vk.this.hj = DeviceUtils.uym();
                com.bytedance.sdk.openadsdk.dg.dg.bw bwVar2 = vk.this.uym;
                if (bwVar2 != null) {
                    bwVar2.ycc();
                }
                com.bytedance.sdk.openadsdk.component.reward.emc.emc unused = vk.this.dr;
                dg dgVar2 = dgVar;
                if (dgVar2 != null) {
                    dgVar2.emc(webView, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                super.onPageStarted(webView, str2, bitmap);
                com.bytedance.sdk.openadsdk.dg.dg.bw bwVar2 = vk.this.uym;
                if (bwVar2 != null) {
                    bwVar2.bw();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i11, String str2, String str3) {
                super.onReceivedError(webView, i11, str2, str3);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
            @TargetApi(21)
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) throws JSONException {
                com.bytedance.sdk.openadsdk.component.reward.emc.emc unused = vk.this.dr;
                webResourceRequest.isForMainFrame();
                webResourceRequest.getUrl();
                webResourceResponse.getStatusCode();
                if (webResourceRequest.getUrl() != null) {
                    Log.i("TTAD.RFWVM", "onReceivedHttpError:url =" + webResourceRequest.getUrl().toString());
                }
                if (webResourceRequest.isForMainFrame()) {
                    vk.this.f9275aa.set(false);
                    vk.this.ffd = false;
                    vk.this.bw = webResourceResponse.getStatusCode();
                    vk vkVar = vk.this;
                    vkVar.ycc = "onReceivedHttpError";
                    vkVar.emc(vkVar.bw, vkVar.dr.tp);
                }
                if (vk.this.uym != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", webResourceResponse.getStatusCode());
                        jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceResponse.getReasonPhrase());
                        vk.this.uym.emc(jSONObject);
                    } catch (JSONException unused2) {
                    }
                }
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
            public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str2) {
                try {
                    if (TextUtils.isEmpty(vk.this.yz)) {
                        return super.shouldInterceptRequest(webView, str2);
                    }
                    vk.gbl(vk.this);
                    WebResourceResponseModel webResourceResponseModelEmc = com.bytedance.sdk.openadsdk.uym.ypw.emc().emc(vk.this.wpn, vk.this.yz, str2);
                    if (webResourceResponseModelEmc != null && webResourceResponseModelEmc.getWebResourceResponse() != null) {
                        vk.sz(vk.this);
                        return webResourceResponseModelEmc.getWebResourceResponse();
                    }
                    if (webResourceResponseModelEmc != null && webResourceResponseModelEmc.getMsg() == 2) {
                        vk.qh(vk.this);
                    }
                    return super.shouldInterceptRequest(webView, str2);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.ul.emc("TTAD.RFWVM", "shouldInterceptRequest url error", th);
                    return super.shouldInterceptRequest(webView, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
            @TargetApi(23)
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) throws JSONException {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceError != null && webResourceRequest != null && webResourceRequest.getUrl() != null) {
                    Log.i("TTAD.RFWVM", "onReceivedError WebResourceError : description=" + ((Object) webResourceError.getDescription()) + "  url =" + webResourceRequest.getUrl().toString());
                }
                if (webResourceRequest == null || webResourceRequest.getUrl() == null || !vk.this.emc(webResourceRequest.getUrl().toString())) {
                    if (webResourceError != null && webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                        com.bytedance.sdk.openadsdk.component.reward.emc.emc unused = vk.this.dr;
                        webResourceError.getErrorCode();
                        String.valueOf(webResourceError.getDescription());
                        String.valueOf(webResourceRequest.getUrl());
                    }
                    if (webResourceRequest == null || webResourceRequest.isForMainFrame()) {
                        vk.this.f9275aa.set(false);
                        vk.this.ffd = false;
                        vk.this.emc(webResourceError != null ? webResourceError.getErrorCode() : -1, vk.this.dr.tp);
                    }
                    if (vk.this.uym != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (webResourceError != null) {
                                jSONObject.put("code", webResourceError.getErrorCode());
                                jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceError.getDescription());
                            }
                            vk.this.uym.emc(jSONObject);
                        } catch (JSONException unused2) {
                        }
                    }
                    if (webResourceError != null) {
                        vk.this.bw = webResourceError.getErrorCode();
                        vk.this.ycc = String.valueOf(webResourceError.getDescription());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
            @TargetApi(21)
            public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                try {
                    return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.ul.emc("TTAD.RFWVM", "shouldInterceptRequest error1", th);
                    return super.shouldInterceptRequest(webView, webResourceRequest);
                }
            }
        };
        this.lt = bwVar;
        this.cf.setWebViewClient(bwVar);
        this.lt.emc(rieVar);
        this.lt.emc(this.sup ? "rewarded_video" : "fullscreen_interstitial_ad");
        if (rieVar.oa() && (yccVar = this.cf) != null && yccVar.getWebView() != null) {
            this.cf.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.vk.3
                private final int xq = com.bytedance.sdk.openadsdk.core.aa.ypw();

                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    int actionMasked;
                    int i11;
                    com.bytedance.sdk.openadsdk.dg.sz szVar = vk.this.dg;
                    if (szVar != null) {
                        szVar.emc(motionEvent);
                    }
                    if (vk.this.wd != null) {
                        vk.this.wd.emc(motionEvent);
                    }
                    try {
                        actionMasked = motionEvent.getActionMasked();
                    } catch (Throwable th) {
                        Log.e("TTAD.RFWVM", "TouchRecordTool onTouch error", th);
                    }
                    if (actionMasked != 0) {
                        int i12 = 3;
                        if (actionMasked == 1) {
                            i11 = i12;
                        } else if (actionMasked != 2) {
                            i12 = actionMasked != 3 ? -1 : 4;
                            i11 = i12;
                        } else {
                            float rawX = motionEvent.getRawX();
                            float rawY = motionEvent.getRawY();
                            if (Math.abs(rawX - vk.this.sra) >= this.xq || Math.abs(rawY - vk.this.rie) >= this.xq) {
                                vk.this.db = false;
                            }
                            vk.this.sb += Math.abs(motionEvent.getX() - vk.this.sra);
                            vk.this.sf += Math.abs(motionEvent.getY() - vk.this.rie);
                            i11 = (System.currentTimeMillis() - vk.this.hxp <= 200 || (vk.this.sb <= 8.0f && vk.this.sf <= 8.0f)) ? 2 : 1;
                        }
                        return false;
                    }
                    vk.this.db = true;
                    vk.this.ee = new SparseArray();
                    vk.this.sra = motionEvent.getRawX();
                    vk.this.rie = motionEvent.getRawY();
                    vk.this.hxp = System.currentTimeMillis();
                    try {
                        long landingPageClickBegin = vk.this.cf.getLandingPageClickBegin();
                        if (landingPageClickBegin > 0 && landingPageClickBegin < vk.this.hxp) {
                            vk.this.hxp = landingPageClickBegin;
                            vk.this.cf.setLandingPageClickBegin(-1L);
                        }
                    } catch (Exception unused) {
                    }
                    vk.this.sb = -1.0f;
                    vk.this.sf = -1.0f;
                    i11 = 0;
                    vk.this.ee.put(motionEvent.getActionMasked(), new xq.emc(i11, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
                    if (motionEvent.getAction() == 1 && ul.ycc(vk.this.dr.ypw) && vk.this.dr.tp != null) {
                        vk.this.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.vk.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                vk.this.dr.tp.ndl();
                            }
                        });
                    }
                    if (motionEvent.getAction() == 1 && view.getVisibility() == 0 && Float.valueOf(view.getAlpha()).intValue() == 1 && ((!vk.this.vk || ul.ru(rieVar)) && vk.this.db)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("down_x", vk.this.sra);
                        jSONObject.put("down_y", vk.this.rie);
                        jSONObject.put("down_time", vk.this.hxp);
                        jSONObject.put("up_x", motionEvent.getRawX());
                        jSONObject.put("up_y", motionEvent.getRawY());
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        try {
                            long landingPageClickEnd = vk.this.cf.getLandingPageClickEnd();
                            if (landingPageClickEnd > 0 && landingPageClickEnd < jCurrentTimeMillis) {
                                try {
                                    vk.this.cf.setLandingPageClickEnd(-1L);
                                } catch (Exception unused2) {
                                }
                                jCurrentTimeMillis = landingPageClickEnd;
                            }
                        } catch (Exception unused3) {
                        }
                        jSONObject.put("up_time", jCurrentTimeMillis);
                        int[] iArr = new int[2];
                        vk vkVar = vk.this;
                        vkVar.ylm = vkVar.dr.iyl.findViewById(520093713);
                        if (vk.this.ylm != null) {
                            vk.this.ylm.getLocationOnScreen(iArr);
                            jSONObject.put("button_x", iArr[0]);
                            jSONObject.put("button_y", iArr[1]);
                            jSONObject.put("button_width", vk.this.ylm.getWidth());
                            jSONObject.put("button_height", vk.this.ylm.getHeight());
                        }
                        if (vk.this.ul != null) {
                            int[] iArr2 = new int[2];
                            vk.this.ul.getLocationOnScreen(iArr2);
                            jSONObject.put("ad_x", iArr2[0]);
                            jSONObject.put("ad_y", iArr2[1]);
                            jSONObject.put("width", vk.this.ul.getWidth());
                            jSONObject.put("height", vk.this.ul.getHeight());
                        }
                        jSONObject.put("toolType", motionEvent.getToolType(0));
                        jSONObject.put("deviceId", motionEvent.getDeviceId());
                        jSONObject.put("source", motionEvent.getSource());
                        jSONObject.put("ft", com.bytedance.sdk.openadsdk.core.model.sup.emc(vk.this.ee, com.bytedance.sdk.openadsdk.core.zz.ypw().emc() ? 1 : 2));
                        jSONObject.put("user_behavior_type", vk.this.db ? 1 : 2);
                        jSONObject.put("click_scence", 2);
                        if (vk.this.lt != null) {
                            vk.this.lt.emc(jSONObject);
                        }
                        if (!vk.this.vk && !ul.zz(rieVar)) {
                            if (vk.this.sup) {
                                com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar, "rewarded_video", CampaignEx.JSON_NATIVE_VIDEO_CLICK, jSONObject);
                            } else {
                                com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar, "fullscreen_interstitial_ad", CampaignEx.JSON_NATIVE_VIDEO_CLICK, jSONObject);
                            }
                            vk.this.vk = true;
                        }
                        return false;
                    }
                    return false;
                }
            });
        }
        com.bytedance.sdk.component.zz.ycc yccVar3 = this.cf;
        if (yccVar3 != null) {
            yccVar3.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.emc.dg(this.emc, this.dg, this.wd) { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.vk.4
                @Override // com.bytedance.sdk.openadsdk.core.widget.emc.dg, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i11) {
                    super.onProgressChanged(webView, i11);
                }
            });
        }
        emc(this.cf);
        if (i10 >= 24) {
            this.cf.setLayerType(1, null);
        }
        this.cf.setBackgroundColor(-1);
        this.cf.setDisplayZoomControls(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean emc(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return this.dr.ypw.oa() && str.endsWith(".mp4");
    }

    public void emc(DownloadListener downloadListener) {
        com.bytedance.sdk.component.zz.ycc yccVar = this.cf;
        if (yccVar == null || downloadListener == null) {
            return;
        }
        yccVar.setDownloadListener(downloadListener);
    }

    public void emc(com.bytedance.sdk.component.zz.ycc yccVar) {
        if (yccVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.emc.xq.emc(this.dr.mxo).emc(false).ypw(false).emc(yccVar.getWebView());
        yccVar.setUserAgentString(com.bytedance.sdk.openadsdk.utils.yzg.emc(yccVar.getWebView(), BuildConfig.VERSION_CODE));
        yccVar.setMixedContentMode(0);
    }

    public void emc(boolean z10, boolean z11) throws JSONException {
        emc(this.emc, z10, z11);
    }

    public void emc(rtt rttVar, boolean z10, boolean z11) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z10);
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD_SHOW, z11);
            com.bytedance.sdk.openadsdk.activity.msw mswVar = this.dr.pe;
            String str = TtmlNode.END;
            if (mswVar != null) {
                jSONObject.put("multi_ads_show", mswVar.wo().ru());
                if (!mswVar.f9258aa) {
                    str = "mid";
                }
                jSONObject.put("endcard_type", str);
            } else {
                jSONObject.put("endcard_type", TtmlNode.END);
            }
            rttVar.emc("endcard_control_event", jSONObject);
            if (z11) {
                if (this.sba) {
                    return;
                }
                this.wad = true;
                return;
            }
            this.wad = false;
        } catch (Exception unused) {
        }
    }

    public void emc(boolean z10, int i10, String str) {
        com.bytedance.sdk.openadsdk.dg.dg.bw bwVar = this.uym;
        if (bwVar == null) {
            return;
        }
        if (z10) {
            bwVar.ypw();
        } else {
            bwVar.emc(i10, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean emc(Runnable runnable) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.cuf < 100) {
            return false;
        }
        this.cuf = jCurrentTimeMillis;
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }
}
