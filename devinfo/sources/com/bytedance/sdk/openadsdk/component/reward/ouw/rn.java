package com.bytedance.sdk.openadsdk.component.reward.ouw;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.webkit.WebView;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.c;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.component.utils.od;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.lh.lh;
import com.bytedance.sdk.openadsdk.core.lh.vt;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.widget.ouw.le;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.utils.zin;
import com.bytedance.sdk.openadsdk.yu.lh;
import d.h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import je.u;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class rn implements com.bytedance.sdk.openadsdk.mwh.pno {
    protected String bly;
    public boolean bs;

    /* renamed from: cd, reason: collision with root package name */
    public boolean f7975cd;
    public long ey;
    boolean fak;
    public int fkw;
    String hun;
    long jqy;
    int jvy;
    public com.bytedance.sdk.openadsdk.common.fkw kn;

    /* renamed from: le, reason: collision with root package name */
    public com.bytedance.sdk.component.bly.le f7979le;

    /* renamed from: lh, reason: collision with root package name */
    public final boolean f7980lh;
    boolean mwh;

    /* renamed from: od, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.common.jg f7981od;
    public final String ouw;

    /* renamed from: pd, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.widget.ouw.fkw f7982pd;
    boolean pv;
    View qbp;
    public bs ra;
    protected com.bytedance.sdk.openadsdk.yu.yu.fkw rn;

    /* renamed from: th, reason: collision with root package name */
    public View f7983th;
    public com.bytedance.sdk.openadsdk.yu.mwh tlj;
    boolean uoy;
    public final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw uq;
    ILoader ux;

    /* renamed from: vh, reason: collision with root package name */
    boolean f7985vh;
    public boolean vm;
    float vpp;
    public int vt;
    public le.ouw wp;
    private boolean xdk;
    public boolean yib;
    public int yu;
    float zin;
    protected boolean pno = true;

    /* renamed from: cf, reason: collision with root package name */
    boolean f7976cf = false;
    public final AtomicBoolean ryl = new AtomicBoolean(true);

    /* renamed from: jg, reason: collision with root package name */
    int f7978jg = 0;
    String ko = "";
    boolean zih = false;
    SparseArray<lh.ouw> ex = new SparseArray<>();
    boolean tc = true;
    float ksc = -1.0f;
    float jae = -1.0f;
    private boolean mt = false;
    long fvf = 0;
    public long osn = -1;
    volatile int rrs = 0;
    public int fqk = -1;
    volatile int lso = 0;

    /* renamed from: ub, reason: collision with root package name */
    volatile int f7984ub = 0;

    /* renamed from: cj, reason: collision with root package name */
    public long f7977cj = 0;
    public boolean ucs = false;
    int yhj = -1;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class lh implements com.bytedance.sdk.openadsdk.mwh.tlj {
        private final com.bytedance.sdk.component.bly.le ouw;

        public /* synthetic */ lh(com.bytedance.sdk.component.bly.le leVar, byte b10) {
            this(leVar);
        }

        @Override // com.bytedance.sdk.openadsdk.mwh.tlj
        public final void ouw() {
            com.bytedance.sdk.component.bly.le leVar = this.ouw;
            if (leVar == null) {
                com.bytedance.sdk.component.utils.ko.vt("TTAD.RFWVM", "webView has destroy when onPauseWebView");
            } else {
                leVar.pno();
                com.bytedance.sdk.component.utils.ko.vt("TTAD.RFWVM", "js make webView onPause OK");
            }
        }

        @Override // com.bytedance.sdk.openadsdk.mwh.tlj
        public final void vt() {
            com.bytedance.sdk.component.bly.le leVar = this.ouw;
            if (leVar == null) {
                com.bytedance.sdk.component.utils.ko.vt("TTAD.RFWVM", "webView has destroy when onPauseWebViewTimers");
            } else {
                try {
                    leVar.ouw.pauseTimers();
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.component.utils.ko.vt("TTAD.RFWVM", "js make webView pauseTimers OK");
            }
        }

        private lh(com.bytedance.sdk.component.bly.le leVar) {
            this.ouw = leVar;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class vt implements com.bytedance.sdk.openadsdk.mwh.ouw {
        private final View ouw;

        public vt(View view) {
            this.ouw = view;
        }

        @Override // com.bytedance.sdk.openadsdk.mwh.ouw
        public final int ouw() {
            View view = this.ouw;
            int measuredHeight = view != null ? view.getMeasuredHeight() : -1;
            com.bytedance.sdk.component.utils.ko.lh("TTAndroidObject", "mWebView height is ".concat(String.valueOf(measuredHeight)));
            return measuredHeight <= 0 ? osn.le(com.bytedance.sdk.openadsdk.core.zih.ouw()) : measuredHeight;
        }

        @Override // com.bytedance.sdk.openadsdk.mwh.ouw
        public final int vt() {
            View view = this.ouw;
            int measuredWidth = view != null ? view.getMeasuredWidth() : -1;
            com.bytedance.sdk.component.utils.ko.lh("TTAndroidObject", "mWebView width is ".concat(String.valueOf(measuredWidth)));
            return measuredWidth <= 0 ? osn.yu(com.bytedance.sdk.openadsdk.core.zih.ouw()) : measuredWidth;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface yu {
        void ouw();

        void ouw(WebView webView, int i4);
    }

    public rn(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        this.uq = ouwVar;
        this.ouw = ouwVar.fkw;
        this.f7980lh = ouwVar.yu;
    }

    public final void bly() {
        ouw(this.ra, true);
    }

    public final boolean cf() {
        return vpp.lh(this.uq.vt) ? this.xdk && !this.fak && this.uq.fak.yu.get() : this.xdk && !this.fak && this.ryl.get() && this.mwh;
    }

    public final void fkw() {
        com.bytedance.sdk.component.bly.le leVar = this.f7979le;
        if (leVar != null) {
            od.ouw(leVar);
        }
        vpp vppVar = this.uq.vt;
        long j = this.ey;
        if (j > 0) {
            if (this.osn > 0) {
                this.ey = (SystemClock.elapsedRealtime() - this.osn) + j;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("endcard_overlay_render_type", vpp.lh(vppVar) ? 7 : 0);
            } catch (Throwable unused) {
            }
            com.bytedance.sdk.openadsdk.yu.lh.ouw(this.uq.vt, this.ouw, "second_endcard_duration", jSONObject, this.ey);
        }
        this.f7979le = null;
        if (this.rn != null && !th.yu(vppVar) && !th.ra(vppVar) && !vpp.lh(vppVar)) {
            this.rn.ryl();
            this.rn.mwh();
        }
        bs bsVar = this.ra;
        if (bsVar != null) {
            bsVar.lh();
        }
        com.bytedance.sdk.openadsdk.yu.mwh mwhVar = this.tlj;
        if (mwhVar != null) {
            mwhVar.ouw(vppVar.vm());
        }
        DeviceUtils.AudioInfoReceiver.vt(this);
    }

    public final void jg() {
        com.bytedance.sdk.openadsdk.yu.mwh mwhVar = this.tlj;
        if (mwhVar != null) {
            mwhVar.vpp = System.currentTimeMillis();
        }
    }

    public final void ko() {
        com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar = this.rn;
        if (fkwVar != null) {
            fkwVar.lh();
            this.rn.yu();
        }
    }

    public final void le() {
        ouw(this.ra);
    }

    public final void lh() {
        this.ra.ouw("showPlayableEndCardOverlay", (JSONObject) null);
        this.uq.ux.sendEmptyMessageDelayed(600, 1000L);
        this.uq.ux.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.rn.10
            @Override // java.lang.Runnable
            public final void run() {
                rn.ouw(rn.this);
            }
        }, 1000L);
        com.bytedance.sdk.openadsdk.utils.jg jgVar = this.uq.f7966sd;
        if (jgVar != null) {
            jgVar.ouw(0L);
        }
    }

    public final void mwh() {
        com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar = this.rn;
        if (fkwVar != null) {
            fkwVar.ra();
        }
    }

    public final void ouw(int i4, com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar) {
        StringBuilder sbW = u.w(i4, "onHideLoadingLayout: errorCode = ", ",hasInvoke =");
        sbW.append(this.uq.jqy.get());
        com.bytedance.sdk.component.utils.ko.vt("TTAD.RFWVM", sbW.toString());
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.uq;
        com.bytedance.sdk.openadsdk.activity.pno pnoVar = ouwVar.f7959gh;
        if (pnoVar == null || !pnoVar.ryl || ouwVar.jqy.get()) {
            return;
        }
        this.uq.jqy.set(true);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.uq;
        if (ouwVar2.euf && th.ryl(ouwVar2.vt) && vtVar != null) {
            vtVar.le();
        }
    }

    public final void pno() {
        com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar = this.rn;
        if (fkwVar != null) {
            fkwVar.bly();
        }
        com.bytedance.sdk.openadsdk.yu.mwh mwhVar = this.tlj;
        if (mwhVar != null) {
            mwhVar.le();
        }
    }

    public final void qbp() {
        com.bytedance.sdk.openadsdk.yu.mwh mwhVar = this.tlj;
        if (mwhVar != null) {
            mwhVar.vt();
        }
    }

    public final boolean ra() {
        String str = this.bly;
        if (str == null) {
            return false;
        }
        try {
            return Uri.parse(str).getQueryParameterNames().contains("show_landingpage");
        } catch (Exception unused) {
            return false;
        }
    }

    public final void rn() {
        com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar = this.rn;
        if (fkwVar != null) {
            fkwVar.tlj();
        }
    }

    public final void ryl() {
        com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar = this.rn;
        if (fkwVar != null) {
            fkwVar.pno();
        }
    }

    public final boolean th() {
        com.bytedance.sdk.component.bly.le leVar = this.f7979le;
        return leVar == null || leVar.getWebView() == null;
    }

    public final void tlj() {
        com.bytedance.sdk.component.bly.le leVar = this.f7979le;
        if (leVar != null) {
            leVar.le();
        }
        if (this.osn == 0) {
            this.osn = SystemClock.elapsedRealtime();
        }
        vpp vppVar = this.uq.vt;
        bs bsVar = this.ra;
        if (bsVar != null) {
            bsVar.vt();
            com.bytedance.sdk.component.bly.le leVar2 = this.f7979le;
            if (leVar2 != null) {
                if (leVar2.getVisibility() == 0) {
                    bs bsVar2 = this.ra;
                    bsVar2.vm = true;
                    ouw(bsVar2, true);
                    ouw(this.ra, false, true);
                    if (com.bytedance.sdk.openadsdk.core.model.od.pno(vppVar) && !this.bs && this.uq.vt.cj()) {
                        lh();
                    }
                } else {
                    bs bsVar3 = this.ra;
                    bsVar3.vm = false;
                    ouw(bsVar3, false);
                    ouw(this.ra, true, false);
                }
            }
        }
        com.bytedance.sdk.openadsdk.yu.mwh mwhVar = this.tlj;
        if (mwhVar != null) {
            mwhVar.fkw();
        }
    }

    public final boolean vm() {
        return this.mwh && this.ryl.get();
    }

    public final void vt() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.uq;
        vpp vppVar = ouwVar.vt;
        if (TextUtils.isEmpty(vpp.ouw(ouwVar.hun, vppVar))) {
            if (vppVar != null && !vppVar.hai && this.ux == null && ra()) {
                this.hun = vppVar.f8298ki;
                com.bytedance.sdk.openadsdk.ra.vt.ouw();
                this.ux = com.bytedance.sdk.openadsdk.ra.vt.vt();
                com.bytedance.sdk.openadsdk.ra.vt.ouw();
                int iOuw = com.bytedance.sdk.openadsdk.ra.vt.ouw(this.ux, this.hun);
                this.jvy = iOuw;
                this.fqk = iOuw > 0 ? 2 : 0;
                if (!TextUtils.isEmpty(this.hun)) {
                    com.bytedance.sdk.openadsdk.yu.mwh mwhVar = this.tlj;
                    if (mwhVar != null) {
                        mwhVar.fak = this.fqk;
                    }
                    lh.ouw.ouw(this.f7977cj, vppVar, "landingpage_endcard", this.ux, this.hun);
                }
            }
            if ((!TextUtils.isEmpty(this.bly) && this.bly.contains("play.google.com/store")) || ((vppVar != null && !vppVar.tpk && th.pno(vppVar)) || th.ra(vppVar))) {
                this.zih = true;
                return;
            }
            Log.d("TTAD.RFWVM", "preLoadEndCardForce: return mShouldPreloadEndCard " + this.pno + ",webViewIsLoading " + this.f7985vh);
            if (this.pno) {
                boolean z3 = this.uq.mq;
                if (this.f7979le == null || ((!z3 && TextUtils.isEmpty(this.bly)) || !vpp.vt(vppVar))) {
                    if (vpp.lh(vppVar)) {
                        com.bytedance.sdk.component.utils.ko.vt("TTAD.RFWVM", "preLoadUgenEndCard: ");
                        this.uq.fak.ouw();
                        return;
                    }
                    return;
                }
                if (this.f7985vh) {
                    return;
                }
                String strW = h.w(new StringBuilder(), this.bly, "&is_pre_render=1");
                com.bytedance.sdk.openadsdk.yu.mwh mwhVar2 = this.tlj;
                if (mwhVar2 != null) {
                    mwhVar2.ouw();
                }
                zin.ouw(this.f7979le, strW);
                this.f7985vh = true;
            }
        }
    }

    public final void yu() {
        com.bytedance.sdk.openadsdk.activity.pno pnoVar;
        vpp vppVar = this.uq.vt;
        String strYu = vppVar.yu();
        if (!TextUtils.isEmpty(strYu) && (pnoVar = this.uq.f7959gh) != null && (pnoVar.fqk() || (this.uq.f7959gh.hun().tlj instanceof com.bytedance.sdk.openadsdk.activity.yu))) {
            this.bly = strYu;
        } else if (com.bytedance.sdk.openadsdk.core.model.od.fkw(vppVar)) {
            c cVar = vppVar.f8309sd;
            if (cVar != null) {
                this.bly = cVar.f6579h;
            }
        } else {
            this.bly = com.bytedance.sdk.openadsdk.core.model.od.cf(vppVar);
        }
        String strOuw = this.bly;
        int i4 = this.vt;
        int i10 = this.fkw;
        int i11 = this.yu;
        float fEx = vppVar.ex();
        if (!TextUtils.isEmpty(strOuw)) {
            if (i4 == 1) {
                strOuw = h.s(strOuw.contains("?") ? strOuw.concat("&") : strOuw.concat("?"), "orientation=portrait");
            }
            strOuw = (strOuw.contains("?") ? strOuw.concat("&") : strOuw.concat("?")) + "height=" + i10 + "&width=" + i11 + "&aspect_ratio=" + fEx;
        }
        if (!com.bytedance.sdk.openadsdk.core.model.od.vt(vppVar)) {
            strOuw = com.bytedance.sdk.openadsdk.utils.le.ouw(strOuw);
        }
        this.bly = strOuw;
        if (TextUtils.isEmpty(strOuw)) {
            return;
        }
        this.xdk = this.bly.contains("use_second_endcard=1");
    }

    public final boolean zih() {
        bs bsVar = this.ra;
        if (bsVar == null) {
            return false;
        }
        return bsVar.tc;
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw extends com.bytedance.sdk.openadsdk.core.lh.ouw implements vt.ouw {

        /* renamed from: lh, reason: collision with root package name */
        private final View.OnClickListener f7987lh;
        private final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouw;
        private final View vt;

        public ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar, View view, View.OnClickListener onClickListener) {
            super(ouwVar.jvy, ouwVar.vt, ouwVar.fkw, ouwVar.yu ? 7 : 5);
            this.ouw = ouwVar;
            this.vt = view;
            this.f7987lh = onClickListener;
            HashMap map = new HashMap();
            map.put("close_auto_click", Boolean.TRUE);
            map.put("click_scence", 2);
            ouw(map);
            ouw(ouwVar.tc.f7993lh);
            ouw(this);
        }

        @Override // com.bytedance.sdk.openadsdk.core.lh.ouw, com.bytedance.sdk.openadsdk.core.lh.vt, com.bytedance.sdk.openadsdk.core.lh.lh
        public final void ouw(View view, float f10, float f11, float f12, float f13, SparseArray<lh.ouw> sparseArray, boolean z3) {
            if (!this.ouw.vt.cj()) {
                super.ouw(view, f10, f11, f12, f13, sparseArray, z3);
                this.ouw.fqk.osn();
            } else {
                this.f7987lh.onClick(view);
                this.vt.setOnTouchListener(null);
                this.vt.setOnClickListener(this.f7987lh);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.lh.vt.ouw
        public final void ouw(View view, int i4) {
            this.vt.setOnTouchListener(null);
            this.vt.setOnClickListener(this.f7987lh);
        }
    }

    public final void lh(boolean z3) {
        if (this.ra == null || this.uq.jvy.isFinishing()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z3);
            this.ra.ouw("volumeChange", jSONObject);
        } catch (Exception unused) {
        }
    }

    public final void ouw(String str, final com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar) {
        if (this.f7979le == null) {
            return;
        }
        HashMap map = new HashMap();
        final vpp vppVar = this.uq.vt;
        map.put("click_scence", 2);
        this.rn = new com.bytedance.sdk.openadsdk.yu.th(2, this.f7980lh ? "rewarded_video" : "fullscreen_interstitial_ad", this.uq.vt);
        bs bsVar = new bs(this.uq.jvy);
        this.ra = bsVar;
        bsVar.uq = this.uq.fqk;
        String strHun = vppVar.hun();
        bs bsVarOuw = this.ra.vt(this.f7979le).ouw(vppVar);
        bsVarOuw.ryl = com.bytedance.sdk.openadsdk.core.bly.ouw.ouw.ouw(vppVar);
        bsVarOuw.f8108lh = vppVar.pv;
        bsVarOuw.fkw = vppVar.yhj;
        bsVarOuw.f8107le = vppVar.ey() ? 7 : 5;
        bsVarOuw.mwh = new vt(this.f7979le);
        bsVarOuw.ra = strHun;
        bs bsVarOuw2 = bsVarOuw.ouw(this.f7979le);
        if (ra()) {
            str = "landingpage_endcard";
        }
        bsVarOuw2.ouw = str;
        bs bsVarOuw3 = bsVarOuw2.ouw(map);
        bsVarOuw3.zin = this.rn;
        bsVarOuw3.vt = new com.bytedance.sdk.openadsdk.core.widget.fkw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.rn.8
            @Override // com.bytedance.sdk.openadsdk.core.widget.fkw
            public final void ouw() {
                com.bytedance.sdk.openadsdk.core.widget.ouw.fkw fkwVar = rn.this.f7982pd;
                if (fkwVar != null) {
                    fkwVar.lh();
                }
                com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar2 = vtVar;
                if (vtVar2 != null) {
                    vtVar2.kn();
                }
            }
        };
        bsVarOuw3.fvf = new bs.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.rn.7
            @Override // com.bytedance.sdk.openadsdk.core.bs.ouw
            public final void ouw() {
                rn.ouw(rn.this);
            }
        };
        this.ra.rn = new lh(this.f7979le, (byte) 0);
        bs bsVar2 = this.ra;
        bsVar2.yu = new WeakReference<>(this.uq.ey.tlj());
        bsVar2.f8106jg = pno.vt();
        bsVar2.ko = new com.bytedance.sdk.openadsdk.mwh.lh() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.rn.9
            @Override // com.bytedance.sdk.openadsdk.mwh.lh
            public final void ouw(boolean z3, int i4, String str2) {
                if (z3) {
                    rn rnVar = rn.this;
                    rnVar.ucs = true;
                    if (rnVar.pv) {
                        rnVar.pv = false;
                        rnVar.vt(rnVar.uq.f7958cj);
                    }
                }
                if (vpp.yu(vppVar)) {
                    com.bytedance.sdk.component.utils.ko.vt("TTAD.RFWVM", "TimeTrackLog report from js ".concat(String.valueOf(z3)));
                    rn.this.ouw(z3, i4, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.mwh.lh
            public final void ouw() {
                rn rnVar = rn.this;
                rnVar.uoy = true;
                rnVar.uq.ey.tlj().performClick();
            }
        };
        this.ra.f8103cd = this.xdk;
    }

    private void fkw(boolean z3) {
        if (com.bytedance.sdk.openadsdk.core.model.od.vt(this.uq.vt)) {
            return;
        }
        lh(z3);
    }

    public final void yu(boolean z3) {
        this.fak = true;
        JSONObject jSONObject = new JSONObject();
        vpp vppVar = this.uq.vt;
        try {
            jSONObject.put("endcard_overlay_render_type", vpp.lh(vppVar) ? 7 : 0);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar, this.ouw, "use_second_endcard", jSONObject);
        this.osn = SystemClock.elapsedRealtime();
        try {
            if (!vpp.lh(vppVar)) {
                this.ra.ouw("click_endcard_close", (JSONObject) null);
            } else if (z3) {
                this.uq.fak.lh();
                com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar, this.ouw, "endcard_close_skip", jSONObject);
            }
        } catch (Exception unused2) {
        }
        this.uq.f7966sd.ouw(r5.pno);
    }

    public final void vt(boolean z3) {
        ouw(this.ra, z3, true);
    }

    @Override // com.bytedance.sdk.openadsdk.mwh.pno
    public final void vt(int i4) {
        int i10 = this.yhj;
        if (i10 <= 0 && i4 > 0) {
            com.bytedance.sdk.component.utils.ko.vt("TTAD.RFWVM", "onVolumeChanged >>>> become unmuted, notify h5");
            fkw(false);
        } else if (i10 > 0 && i4 == 0) {
            com.bytedance.sdk.component.utils.ko.vt("TTAD.RFWVM", "onVolumeChanged >>>> become mute notification h5");
            fkw(true);
        }
        this.yhj = i4;
    }

    public final void ouw(boolean z3) {
        this.pno = z3;
    }

    public final void ouw() {
        if (com.bytedance.sdk.openadsdk.core.model.od.fkw(this.uq.vt) && this.uq.odc) {
            return;
        }
        vt();
    }

    public final void ouw(int i4) {
        if (this.mwh || !this.ryl.get()) {
            ouw(0, this.uq.fqk);
        }
        osn.ouw((View) this.f7979le, i4);
        com.bytedance.sdk.component.bly.le leVar = this.f7979le;
        if (leVar != null) {
            osn.ouw((View) leVar.getWebView(), i4);
        }
        vpp vppVar = this.uq.vt;
        if (this.f7979le == null || !vppVar.vm()) {
            return;
        }
        this.f7979le.setLandingPage(true);
        this.f7979le.setTag("landingpage_endcard");
        this.f7979le.setMaterialMeta(vppVar.bs());
    }

    private void ouw(bs bsVar) {
        if (this.ra == null || this.uq.jvy.isFinishing()) {
            return;
        }
        bsVar.vm = true;
    }

    public static void ouw(bs bsVar, boolean z3) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewStatus", z3 ? 1 : 0);
            bsVar.ouw("viewableChange", jSONObject);
        } catch (Exception unused) {
        }
    }

    public final void ouw(bs bsVar, boolean z3, boolean z10) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z3);
            jSONObject.put("endcard_show", z10);
            com.bytedance.sdk.openadsdk.activity.pno pnoVar = this.uq.f7959gh;
            String str = "end";
            if (pnoVar != null) {
                jSONObject.put("multi_ads_show", pnoVar.hun().tlj.tlj());
                if (!pnoVar.zih) {
                    str = "mid";
                }
                jSONObject.put("endcard_type", str);
            } else {
                jSONObject.put("endcard_type", "end");
            }
            bsVar.ouw("endcard_control_event", jSONObject);
            if (z10) {
                if (this.mwh) {
                    return;
                }
                this.pv = true;
                return;
            }
            this.pv = false;
        } catch (Exception unused) {
        }
    }

    public final void ouw(boolean z3, int i4, String str) {
        com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar = this.rn;
        if (fkwVar == null) {
            return;
        }
        if (z3) {
            fkwVar.vt();
        } else {
            fkwVar.ouw(i4, str);
        }
    }

    public static /* synthetic */ void ouw(rn rnVar) {
        int i4;
        rnVar.bs = true;
        int i10 = 0;
        rnVar.yib = false;
        rnVar.uq.ux.removeMessages(600);
        rnVar.uq.ux.removeMessages(700);
        rnVar.uq.ux.removeMessages(900);
        rnVar.uq.uoy.yu(false);
        rnVar.uq.f7967th.set(true);
        rnVar.uq.coz.jg();
        vpp vppVar = rnVar.uq.vt;
        com.bytedance.sdk.component.utils.ko.vt("TTAD.RFWVM", "onOverlayRendFinish: hasClicked=" + vppVar.cj());
        if (vppVar.cj()) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.od odVar = vppVar.nbp;
        if (odVar != null && (i4 = odVar.ouw) >= 0 && i4 <= 100) {
            i10 = i4;
        }
        if (uoy.pno(i10)) {
            View viewTlj = rnVar.uq.ey.tlj();
            View.OnClickListener onClickListener = (View.OnClickListener) viewTlj.getTag(viewTlj.getId());
            if (onClickListener != null) {
                ouw ouwVar = new ouw(rnVar.uq, viewTlj, onClickListener);
                viewTlj.setOnClickListener(ouwVar);
                viewTlj.setOnTouchListener(ouwVar);
            }
        }
    }

    public static /* synthetic */ boolean ouw(rn rnVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return rnVar.uq.vt.vm() && str.endsWith(".mp4");
    }
}
