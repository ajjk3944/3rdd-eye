package com.bytedance.sdk.openadsdk.activity;

import A.f;
import android.R;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.utils.dr;
import com.bytedance.sdk.component.zz.ycc;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.aa;
import com.bytedance.sdk.openadsdk.common.cf;
import com.bytedance.sdk.openadsdk.common.ru;
import com.bytedance.sdk.openadsdk.common.sup;
import com.bytedance.sdk.openadsdk.common.ul;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.rtt;
import com.bytedance.sdk.openadsdk.core.sf;
import com.bytedance.sdk.openadsdk.core.widget.emc.ycc;
import com.bytedance.sdk.openadsdk.dg.sz;
import com.bytedance.sdk.openadsdk.dg.xq;
import com.bytedance.sdk.openadsdk.utils.gbl;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.qh;
import com.bytedance.sdk.openadsdk.utils.sra;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.ul;
import com.bytedance.sdk.openadsdk.utils.vk;
import com.bytedance.sdk.openadsdk.utils.vw;
import com.bytedance.sdk.openadsdk.utils.yzg;
import com.bytedance.sdk.openadsdk.utils.zz;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TTLandingPageActivity extends TTBaseLandingPageActivity {
    private rtt aa;
    private String cf;
    private qh cuf;
    private int dr;
    private ILoader ee;
    sz emc;
    private Context gbl;
    private String hxp;
    private com.bytedance.sdk.openadsdk.core.widget.emc.bw iyl;
    private sup lt;
    private com.bytedance.sdk.openadsdk.common.bw mkp;
    private TextView msw;
    private boolean mxo;
    private com.bytedance.sdk.openadsdk.core.ycc.ycc qh;
    private ImageView ra;
    private ycc.emc rtt;
    private int sba;
    private int sf;
    private String sra;
    private cf sup;
    private Button sz;
    private rie ul;
    private ImageView uym;
    private String vk;
    private ImageView vw;
    private ImageView wo;
    TTAdDislikeToast xq;
    private com.bytedance.sdk.openadsdk.common.sz xxg;
    private com.bytedance.sdk.component.zz.ycc ycc;
    private com.bytedance.sdk.openadsdk.ul.emc.emc.xq ylm;
    aa ypw;
    private boolean yz;
    private String yzg;
    private final AtomicBoolean rie = new AtomicBoolean(true);
    private final AtomicInteger db = new AtomicInteger(0);
    private final AtomicInteger sb = new AtomicInteger(0);
    private final AtomicInteger xmt = new AtomicInteger(0);
    final AtomicBoolean dg = new AtomicBoolean(false);
    final AtomicBoolean bw = new AtomicBoolean(false);
    private boolean tp = false;
    private long wpn = 0;
    private String pxa = "ダウンロード";

    public static class emc implements com.bytedance.sdk.openadsdk.dg.sup {
        private final WeakReference<TTLandingPageActivity> dg;
        private final int emc;
        private final String xq;
        private final rie ypw;

        public emc(int i, rie rieVar, String str, TTLandingPageActivity tTLandingPageActivity) {
            this.emc = i;
            this.ypw = rieVar;
            this.xq = str;
            this.dg = new WeakReference<>(tTLandingPageActivity);
        }

        @Override // com.bytedance.sdk.openadsdk.dg.sup
        public void emc(int i) {
            TTLandingPageActivity tTLandingPageActivity = this.dg.get();
            if (tTLandingPageActivity != null) {
                xq.emc.emc(this.emc, tTLandingPageActivity.sb.get(), tTLandingPageActivity.xmt.get(), tTLandingPageActivity.db.get() - tTLandingPageActivity.xmt.get(), this.ypw, this.xq, i);
            }
        }
    }

    public static class xq implements View.OnTouchListener {
        private final WeakReference<sz> emc;
        private final WeakReference<com.bytedance.sdk.openadsdk.common.bw> ypw;

        public xq(sz szVar, com.bytedance.sdk.openadsdk.common.bw bwVar) {
            this.emc = new WeakReference<>(szVar);
            this.ypw = new WeakReference<>(bwVar);
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            sz szVar = this.emc.get();
            if (szVar != null) {
                szVar.emc(motionEvent);
            }
            com.bytedance.sdk.openadsdk.common.bw bwVar = this.ypw.get();
            if (bwVar == null) {
                return false;
            }
            bwVar.emc(motionEvent);
            return false;
        }
    }

    public static class ypw implements View.OnScrollChangeListener {
        private final WeakReference<sz> emc;

        public ypw(sz szVar) {
            this.emc = new WeakReference<>(szVar);
        }

        @Override // android.view.View.OnScrollChangeListener
        public void onScrollChange(View view, int i, int i3, int i6, int i7) {
            sz szVar = this.emc.get();
            if (szVar != null) {
                szVar.ypw(i3);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public boolean emc() {
        return true;
    }

    @Override // android.app.Activity
    public void onBackPressed() throws JSONException {
        zz();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        try {
            super.onConfigurationChanged(configuration);
        } catch (Throwable unused) {
        }
        bw();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    @SuppressLint({"ClickableViewAccessibility"})
    public void onCreate(Bundle bundle) throws JSONException {
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.qh.bw()) {
            finish();
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.aa.ypw(this);
        } catch (Throwable unused) {
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Intent intent = getIntent();
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            this.mxo = intent.getBooleanExtra("only_loading", false);
        } else {
            rie rieVarEmc = sf.emc().emc(sf.emc(intent));
            this.ul = rieVarEmc;
            if (rieVarEmc != null) {
                this.mxo = rieVarEmc.qh();
                this.ul.cn(0);
                if (com.bytedance.sdk.openadsdk.sra.emc.emc("lp_cache_enable", false)) {
                    ul.emc(this.ul);
                }
            }
        }
        this.sra = "";
        emc(4);
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
            if (stringExtra != null) {
                try {
                    this.ul = com.bytedance.sdk.openadsdk.core.ypw.emc(new JSONObject(stringExtra));
                } catch (Exception e6) {
                    com.bytedance.sdk.component.utils.ul.emc("TTAD.LandingPageAct", "TTLandingPageActivity - onCreate MultiGlobalInfo : ", e6);
                }
            }
            this.sra = intent.getStringExtra("url");
            this.yzg = intent.getStringExtra("event_tag");
            this.sba = intent.getIntExtra("source", -1);
            this.cf = intent.getStringExtra("adid");
            this.vk = intent.getStringExtra("log_extra");
            this.hxp = intent.getStringExtra("gecko_id");
        } else {
            rie rieVar = this.ul;
            if (rieVar != null) {
                this.cf = rieVar.ye();
                this.vk = this.ul.wdp();
                this.hxp = this.ul.qlw();
                this.sra = this.ul.gbl();
                this.sba = this.ul.sz();
                this.yzg = this.ul.sup();
            }
        }
        try {
            setContentView(emc(this.sra));
            if (this.ul == null) {
                finish();
                return;
            }
            if (com.bytedance.sdk.openadsdk.sra.emc.emc("lp_cache_enable", false)) {
                dg();
            }
            uym();
            if (!TextUtils.isEmpty(this.hxp)) {
                this.ee = com.bytedance.sdk.openadsdk.uym.ypw.emc().ypw();
                int iEmc = com.bytedance.sdk.openadsdk.uym.ypw.emc().emc(this.ee, this.hxp);
                this.sf = iEmc;
                this.dr = iEmc > 0 ? 2 : 0;
            }
            this.gbl = this;
            if (this.ycc != null) {
                com.bytedance.sdk.openadsdk.core.widget.emc.xq.emc(this).emc(false).ypw(false).emc(this.ycc.getWebView());
            }
            if (this.yz) {
                this.xxg.emc(true);
            }
            com.bytedance.sdk.component.zz.ycc yccVar = this.ycc;
            if (yccVar != null && yccVar.getWebView() != null) {
                sz szVarYpw = new sz(this.ul, this.ycc.getWebView(), new emc(this.sf, this.ul, "landingpage", this), this.dr).ypw(true);
                this.emc = szVarYpw;
                this.rtt = szVarYpw.emc;
                this.mkp = tp.emc(this.ul, this.ycc, this.gbl, this.yzg);
                this.emc.bw(this.tp);
                this.ul.aa(this.tp);
            }
            msw();
            com.bytedance.sdk.component.zz.ycc yccVar2 = this.ycc;
            if (yccVar2 != null) {
                yccVar2.setLandingPage(true);
                this.ycc.setTag("landingpage");
                this.ycc.setMaterialMeta(this.ul.wg());
            }
            com.bytedance.sdk.openadsdk.core.widget.emc.bw bwVar = new com.bytedance.sdk.openadsdk.core.widget.emc.bw(this.gbl, this.aa, this.cf, this.mkp, this.emc, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    try {
                        if (TTLandingPageActivity.this.qh != null && !TTLandingPageActivity.this.isFinishing()) {
                            TTLandingPageActivity.this.qh.setVisibility(8);
                        }
                    } catch (Throwable unused2) {
                    }
                    if (TTLandingPageActivity.this.lt != null) {
                        TTLandingPageActivity.this.lt.ypw();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    try {
                        if (TextUtils.isEmpty(TTLandingPageActivity.this.hxp)) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        TTLandingPageActivity.this.db.incrementAndGet();
                        WebResourceResponseModel webResourceResponseModelEmc = com.bytedance.sdk.openadsdk.uym.ypw.emc().emc(TTLandingPageActivity.this.ee, TTLandingPageActivity.this.hxp, str);
                        if (webResourceResponseModelEmc != null && webResourceResponseModelEmc.getWebResourceResponse() != null) {
                            TTLandingPageActivity.this.xmt.incrementAndGet();
                            return webResourceResponseModelEmc.getWebResourceResponse();
                        }
                        if (webResourceResponseModelEmc != null && webResourceResponseModelEmc.getMsg() == 2) {
                            TTLandingPageActivity.this.sb.incrementAndGet();
                        }
                        return super.shouldInterceptRequest(webView, str);
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.ul.emc("TTAD.LandingPageAct", "shouldInterceptRequest url error", th);
                        return super.shouldInterceptRequest(webView, str);
                    }
                }
            };
            this.iyl = bwVar;
            bwVar.emc(this.ul);
            this.iyl.emc("landingpage");
            com.bytedance.sdk.component.zz.ycc yccVar3 = this.ycc;
            if (yccVar3 != null) {
                yccVar3.setWebViewClient(this.iyl);
                com.bytedance.sdk.component.zz.ycc yccVar4 = this.ycc;
                if (yccVar4 != null) {
                    yccVar4.setUserAgentString(yzg.emc(yccVar4.getWebView(), BuildConfig.VERSION_CODE));
                }
                com.bytedance.sdk.component.zz.ycc yccVar5 = this.ycc;
                if (yccVar5 != null) {
                    yccVar5.setMixedContentMode(0);
                }
            }
            com.bytedance.sdk.openadsdk.dg.xq.emc(this.ul, "landingpage", this.dr);
            if (this.ycc != null) {
                if (com.bytedance.sdk.openadsdk.sra.emc.emc("lp_cache_enable", false) && this.tp) {
                    sz szVar = this.emc;
                    if (szVar != null) {
                        szVar.xq(this.sra);
                        this.emc.dg(this.sra);
                        this.emc.emc(this.sra, 0L);
                    }
                    sup supVar = this.lt;
                    if (supVar != null) {
                        supVar.ypw();
                    }
                } else {
                    sra.emc(this.ycc, this.sra);
                }
                this.ycc.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.emc.dg(this.aa, this.emc, this.mkp) { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.11
                    @Override // com.bytedance.sdk.openadsdk.core.widget.emc.dg, android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView, int i) {
                        super.onProgressChanged(webView, i);
                        if (TTLandingPageActivity.this.lt != null) {
                            TTLandingPageActivity.this.lt.emc(i);
                        }
                        if (TTLandingPageActivity.this.qh != null && !TTLandingPageActivity.this.isFinishing()) {
                            if (i == 100 && TTLandingPageActivity.this.qh.isShown()) {
                                TTLandingPageActivity.this.qh.setVisibility(8);
                            } else {
                                TTLandingPageActivity.this.qh.setProgress(i);
                            }
                        }
                        if (!TTLandingPageActivity.this.yz || TTLandingPageActivity.this.xxg == null) {
                            return;
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (jCurrentTimeMillis - TTLandingPageActivity.this.wpn >= 200 || i == 100) {
                            TTLandingPageActivity.this.xxg.emc(webView, TTLandingPageActivity.this.rtt);
                            TTLandingPageActivity.this.wpn = jCurrentTimeMillis;
                        }
                    }

                    @Override // android.webkit.WebChromeClient
                    public void onReceivedTitle(WebView webView, String str) {
                        super.onReceivedTitle(webView, str);
                        if (TTLandingPageActivity.this.yz) {
                            TTLandingPageActivity.this.xxg.emc(str);
                            TTLandingPageActivity.this.xxg.ypw(webView.getUrl());
                        } else if (TTLandingPageActivity.this.msw != null) {
                            TextView textView = TTLandingPageActivity.this.msw;
                            if (TextUtils.isEmpty(str)) {
                                str = com.bytedance.sdk.component.utils.rie.emc(TTLandingPageActivity.this, "tt_web_title_default");
                            }
                            textView.setText(str);
                        }
                    }
                });
                if (this.ycc.getWebView() != null) {
                    this.ycc.getWebView().setOnScrollChangeListener(new ypw(this.emc));
                    this.ycc.getWebView().setOnTouchListener(new xq(this.emc, this.mkp) { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.12
                        private long bw;
                        private float dg;
                        private float xq;
                        private final int ypw = com.bytedance.sdk.openadsdk.core.aa.ypw();
                        private float ycc = 0.0f;
                        private float uym = 0.0f;

                        @Override // com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.xq, android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            if (!TTLandingPageActivity.this.yz) {
                                return super.onTouch(view, motionEvent);
                            }
                            try {
                                int actionMasked = motionEvent.getActionMasked();
                                if (actionMasked == 0) {
                                    this.xq = motionEvent.getRawX();
                                    this.dg = motionEvent.getRawY();
                                    this.bw = System.currentTimeMillis();
                                } else if (actionMasked == 2) {
                                    float rawX = motionEvent.getRawX();
                                    float rawY = motionEvent.getRawY();
                                    if (Math.abs(rawX - this.xq) < this.ypw) {
                                        Math.abs(rawY - this.dg);
                                    }
                                    this.ycc += Math.abs(motionEvent.getX() - this.xq);
                                    this.uym += Math.abs(motionEvent.getY() - this.dg);
                                    System.currentTimeMillis();
                                    if (rawY - this.dg > this.ypw) {
                                        TTLandingPageActivity.this.xxg.emc();
                                    }
                                    if (rawY - this.dg < (-this.ypw)) {
                                        TTLandingPageActivity.this.xxg.ypw();
                                    }
                                }
                            } catch (Throwable th) {
                                Log.e("TTAD.LandingPageAct", "TouchRecordTool onTouch error", th);
                            }
                            return super.onTouch(view, motionEvent);
                        }
                    });
                }
                this.ycc.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.13
                    @Override // android.webkit.DownloadListener
                    public void onDownloadStart(String str, String str2, String str3, String str4, long j6) {
                        if (TTLandingPageActivity.this.ylm != null) {
                            TTLandingPageActivity.this.ylm.emc(TTLandingPageActivity.this.ul);
                        }
                    }
                });
            }
            bw();
            qh qhVarEmc = com.bytedance.sdk.openadsdk.utils.zz.emc(this, new zz.emc() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.14
                @Override // com.bytedance.sdk.openadsdk.utils.zz.emc
                public View emc() {
                    return TTLandingPageActivity.this.uym;
                }

                @Override // com.bytedance.sdk.openadsdk.utils.zz.emc
                public void ypw() {
                }
            });
            this.cuf = qhVarEmc;
            qhVarEmc.emc(0L);
            xq.emc.emc(SystemClock.elapsedRealtime() - jElapsedRealtime, this.ul, "landingpage", this.ee, this.hxp);
        } catch (Throwable unused2) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        com.bytedance.sdk.component.zz.ycc yccVar;
        com.bytedance.sdk.component.zz.ycc yccVar2;
        super.onDestroy();
        if (com.bytedance.sdk.openadsdk.sra.emc.emc("lp_cache_enable", false)) {
            rie rieVar = this.ul;
            if (rieVar != null) {
                rieVar.cn(0);
            }
            sz szVar = this.emc;
            if (szVar != null && (yccVar2 = this.ycc) != null) {
                szVar.emc(yccVar2);
            }
            if (this.ycc == null || TextUtils.isEmpty(this.sra)) {
                com.bytedance.sdk.component.zz.ycc yccVar3 = this.ycc;
                if (yccVar3 != null) {
                    dr.emc(yccVar3);
                }
            } else {
                Bundle bundle = new Bundle();
                if (this.ycc.getWebView() != null) {
                    this.ycc.getWebView().saveState(bundle);
                }
                ul.emc(System.identityHashCode(this.ul) + "_" + this.sra, this.ycc, bundle);
            }
            this.ycc = null;
        } else {
            sz szVar2 = this.emc;
            if (szVar2 != null && (yccVar = this.ycc) != null) {
                szVar2.emc(yccVar);
            }
        }
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
        } catch (Throwable unused) {
        }
        if (!com.bytedance.sdk.openadsdk.sra.emc.emc("lp_cache_enable", false)) {
            com.bytedance.sdk.component.zz.ycc yccVar4 = this.ycc;
            if (yccVar4 != null) {
                dr.emc(yccVar4);
            }
            this.ycc = null;
        }
        rtt rttVar = this.aa;
        if (rttVar != null) {
            rttVar.sup();
        }
        sz szVar3 = this.emc;
        if (szVar3 != null) {
            szVar3.dg(true);
        }
        if (!TextUtils.isEmpty(this.hxp)) {
            xq.emc.emc(this.xmt.get(), this.db.get(), this.ul);
        }
        com.bytedance.sdk.openadsdk.uym.ypw.emc().emc(this.ee);
        qh qhVar = this.cuf;
        if (qhVar != null) {
            qhVar.xq();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onPause();
        qh qhVar = this.cuf;
        if (qhVar != null) {
            qhVar.ypw();
        }
        rie rieVar = this.ul;
        if (rieVar != null) {
            rieVar.uym(SystemClock.elapsedRealtime());
            this.ul.cn(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onResume();
        rie rieVar = this.ul;
        if (rieVar != null) {
            rieVar.cn(1);
        }
        rtt rttVar = this.aa;
        if (rttVar != null) {
            rttVar.gbl();
        }
        sz szVar = this.emc;
        if (szVar != null) {
            szVar.uym();
        }
        qh qhVar = this.cuf;
        if (qhVar != null) {
            qhVar.emc();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.utils.dg.emc(this, this.ul);
        rie rieVar = this.ul;
        if (rieVar != null) {
            rieVar.cn(1);
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        rie rieVar = this.ul;
        if (rieVar != null) {
            rieVar.cn(0);
        }
        sz szVar = this.emc;
        if (szVar != null) {
            szVar.msw();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void bw() {
        rie rieVar = this.ul;
        if (rieVar == null || rieVar.sx() != 4) {
            return;
        }
        cf cfVar = this.sup;
        if (cfVar != null) {
            cfVar.setVisibility(0);
        }
        Button button = (Button) findViewById(vk.ej);
        this.sz = button;
        if (button != null) {
            ypw(ycc());
            if (this.ylm == null) {
                this.ylm = com.bytedance.sdk.openadsdk.ul.emc.emc.dg.emc(this, TextUtils.isEmpty(this.yzg) ? tp.ypw(this.sba) : this.yzg);
            }
            com.bytedance.sdk.openadsdk.core.xq.emc emcVar = new com.bytedance.sdk.openadsdk.core.xq.emc(this, this.ul, this.yzg, this.sba);
            emcVar.emc(false);
            this.sz.setOnClickListener(emcVar);
            this.sz.setOnTouchListener(emcVar);
            emcVar.xq(true);
            emcVar.emc(this.ylm);
        }
    }

    private void dg() {
        if (TextUtils.isEmpty(this.sra)) {
            return;
        }
        com.bytedance.sdk.openadsdk.sba.xq.emc(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.15
            @Override // com.bytedance.sdk.openadsdk.sba.dg
            public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                com.bytedance.sdk.openadsdk.sba.ypw.emc emcVarE = f.e("lp_reuse");
                emcVarE.dg(TTLandingPageActivity.this.yzg);
                emcVarE.emc(BuildConfig.VERSION_NAME);
                return emcVarE;
            }
        });
        if (!this.tp) {
            this.tp = false;
            com.bytedance.sdk.openadsdk.vk.xq.emc(false);
            com.bytedance.sdk.openadsdk.sba.xq.xq(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.17
                @Override // com.bytedance.sdk.openadsdk.sba.dg
                public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                    com.bytedance.sdk.openadsdk.sba.ypw.emc emcVarE = f.e("lp_reuse");
                    emcVarE.dg(TTLandingPageActivity.this.yzg);
                    emcVarE.emc(BuildConfig.VERSION_NAME);
                    return emcVarE;
                }
            });
        } else {
            sz szVar = this.emc;
            if (szVar != null) {
                szVar.bw(true);
                this.ul.aa(true);
            }
            com.bytedance.sdk.openadsdk.sba.xq.ypw(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.16
                @Override // com.bytedance.sdk.openadsdk.sba.dg
                public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                    com.bytedance.sdk.openadsdk.sba.ypw.emc emcVarE = f.e("lp_reuse");
                    emcVarE.dg(TTLandingPageActivity.this.yzg);
                    emcVarE.emc(BuildConfig.VERSION_NAME);
                    return emcVarE;
                }
            });
            com.bytedance.sdk.openadsdk.vk.xq.emc(true);
        }
    }

    private void gbl() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.aa.emc("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    private void msw() {
        rtt rttVar = new rtt(this);
        this.aa = rttVar;
        rttVar.ypw(this.ycc).xq(this.cf).dg(this.vk).emc(this.ul).ypw(this.sba).emc(this.ul.nx()).bw(this.ul.drx()).emc(this.ycc).ypw("landingpage");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qh() {
        TTAdDislikeToast tTAdDislikeToast;
        if (isFinishing() || (tTAdDislikeToast = this.xq) == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
    }

    private boolean ru() {
        return !TextUtils.isEmpty(this.sra) && this.sra.contains("__luban_sdk");
    }

    private void sup() {
        try {
            if (this.ypw == null) {
                aa aaVar = new aa(this.gbl, this.ul);
                this.ypw = aaVar;
                aaVar.setDislikeSource("landing_page");
                this.ypw.setCallback(new aa.emc() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.10
                    @Override // com.bytedance.sdk.openadsdk.common.aa.emc
                    public void emc(View view) {
                        TTLandingPageActivity.this.dg.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.aa.emc
                    public void ypw(View view) {
                        TTLandingPageActivity.this.dg.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.aa.emc
                    public void emc(FilterWord filterWord) {
                        if (TTLandingPageActivity.this.bw.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTLandingPageActivity.this.bw.set(true);
                        TTLandingPageActivity.this.qh();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.ypw);
            if (this.xq == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.gbl);
                this.xq = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "LandingPageActivity", th);
        }
    }

    private void sz() {
        TTAdDislikeToast tTAdDislikeToast = this.xq;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
    }

    private void uym() {
        com.bytedance.sdk.component.zz.ycc yccVar = (com.bytedance.sdk.component.zz.ycc) findViewById(vk.pxa);
        this.ycc = yccVar;
        tp.emc(this.ul, yccVar);
        this.sup = (cf) findViewById(vk.hj);
        cf cfVar = (cf) findViewById(vk.cn);
        sup supVar = (sup) findViewById(520093721);
        this.lt = supVar;
        if (supVar != null) {
            supVar.emc(this.ul);
            this.lt.emc();
        }
        if (cfVar != null) {
            cfVar.setVisibility(0);
        }
        if (this.yz) {
            this.vw = (ImageView) findViewById(vk.pm);
        } else {
            this.vw = (ImageView) findViewById(520093720);
        }
        ImageView imageView = this.vw;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTLandingPageActivity.this.ycc != null) {
                        if (TTLandingPageActivity.this.rtt != null) {
                            TTLandingPageActivity.this.rtt.emc();
                        }
                        if (!TTLandingPageActivity.this.ycc.zz()) {
                            if (TTLandingPageActivity.this.yz) {
                                return;
                            }
                            TTLandingPageActivity.this.finish();
                        } else {
                            TTLandingPageActivity.this.ycc.ru();
                            if (!TTLandingPageActivity.this.yz || TTLandingPageActivity.this.xxg == null) {
                                return;
                            }
                            TTLandingPageActivity.this.xxg.emc(TTLandingPageActivity.this.ycc.getWebView(), TTLandingPageActivity.this.rtt);
                        }
                    }
                }
            });
        }
        ImageView imageView2 = (ImageView) findViewById(vk.ipv);
        this.ra = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTLandingPageActivity.this.ycc == null || !TTLandingPageActivity.this.ycc.gbl()) {
                        return;
                    }
                    TTLandingPageActivity.this.ycc.sup();
                    if (!TTLandingPageActivity.this.yz || TTLandingPageActivity.this.xxg == null) {
                        return;
                    }
                    TTLandingPageActivity.this.xxg.emc(TTLandingPageActivity.this.ycc.getWebView(), TTLandingPageActivity.this.rtt);
                }
            });
        }
        ImageView imageView3 = (ImageView) findViewById(520093716);
        this.uym = imageView3;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTLandingPageActivity.this.finish();
                }
            });
        }
        this.msw = (TextView) findViewById(vk.vum);
        com.bytedance.sdk.openadsdk.core.ycc.ycc yccVar2 = (com.bytedance.sdk.openadsdk.core.ycc.ycc) findViewById(vk.wbn);
        this.qh = yccVar2;
        if (yccVar2 != null) {
            yccVar2.setVisibility(0);
        }
        this.wo = (ImageView) findViewById(520093740);
        if (this.yz) {
            final com.bytedance.sdk.openadsdk.common.ul ulVar = new com.bytedance.sdk.openadsdk.common.ul(this, false);
            ImageView imageView4 = this.wo;
            if (imageView4 != null) {
                imageView4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.7
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        ulVar.setOnMenuItemClickListener(new ul.emc() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.7.1
                            @Override // com.bytedance.sdk.openadsdk.common.ul.emc
                            public void dg() {
                                TTLandingPageActivity.this.xq();
                                ulVar.emc();
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.ul.emc
                            public void emc() {
                                if (TTLandingPageActivity.this.ycc == null || TTLandingPageActivity.this.ycc.getWebView().getUrl() == null) {
                                    return;
                                }
                                if (TTLandingPageActivity.this.qh != null) {
                                    TTLandingPageActivity.this.qh.setVisibility(0);
                                    TTLandingPageActivity.this.qh.setProgress(0);
                                }
                                TTLandingPageActivity.this.ycc.uym();
                                TTLandingPageActivity.this.ycc.a_(TTLandingPageActivity.this.ycc.getWebView().getUrl());
                                ulVar.emc();
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.ul.emc
                            public void xq() {
                                if (TTLandingPageActivity.this.ycc != null) {
                                    Intent intent = new Intent("android.intent.action.VIEW");
                                    String url = TTLandingPageActivity.this.ycc.getUrl();
                                    if (!TextUtils.isEmpty(url)) {
                                        intent.setData(Uri.parse(url));
                                        com.bytedance.sdk.component.utils.ypw.emc(TTLandingPageActivity.this, intent, null);
                                    }
                                    ulVar.emc();
                                }
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.ul.emc
                            public void ypw() {
                                ClipboardManager clipboardManager;
                                if (TTLandingPageActivity.this.ycc != null) {
                                    String url = TTLandingPageActivity.this.ycc.getUrl();
                                    if (!TextUtils.isEmpty(url) && (clipboardManager = (ClipboardManager) TTLandingPageActivity.this.getSystemService("clipboard")) != null) {
                                        clipboardManager.setPrimaryClip(ClipData.newPlainText("URL", url));
                                    }
                                }
                                ulVar.emc();
                            }
                        });
                        ulVar.emc(view);
                    }
                });
            }
        }
        View viewFindViewById = findViewById(vk.yuz);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTLandingPageActivity.this.xq();
                }
            });
        }
    }

    private String ycc() {
        rie rieVar = this.ul;
        if (rieVar != null && !TextUtils.isEmpty(rieVar.xxo())) {
            this.pxa = this.ul.xxo();
        }
        return this.pxa;
    }

    private void ypw(final String str) {
        Button button;
        if (TextUtils.isEmpty(str) || (button = this.sz) == null) {
            return;
        }
        button.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.3
            @Override // java.lang.Runnable
            public void run() {
                if (TTLandingPageActivity.this.sz == null || TTLandingPageActivity.this.isFinishing()) {
                    return;
                }
                TTLandingPageActivity.this.sz.setText(str);
            }
        });
    }

    private void zz() throws JSONException {
        if (ru() && !this.rie.getAndSet(true)) {
            gbl();
            emc(0);
        } else {
            try {
                super.onBackPressed();
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.ul.xq("TTAD.LandingPageAct", "onBackPressed: ", th.getMessage());
            }
        }
    }

    public void xq() {
        if (isFinishing()) {
            return;
        }
        if (this.bw.get()) {
            sz();
            return;
        }
        if (this.ypw == null) {
            sup();
        }
        aa aaVar = this.ypw;
        if (aaVar != null) {
            aaVar.emc();
        }
    }

    private View emc(String str) {
        Bundle bundleEmc;
        com.bytedance.sdk.component.zz.ycc yccVar;
        com.bytedance.sdk.openadsdk.core.ycc.xq xqVar = new com.bytedance.sdk.openadsdk.core.ycc.xq(this);
        if (Build.VERSION.SDK_INT >= 35) {
            xqVar.setFitsSystemWindows(true);
        }
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar = new com.bytedance.sdk.openadsdk.core.ycc.bw(this);
        bwVar.setOrientation(1);
        xqVar.addView(bwVar, new FrameLayout.LayoutParams(-1, -1));
        boolean zXmt = com.bytedance.sdk.openadsdk.core.aa.dg().xmt();
        this.yz = zXmt;
        rie rieVar = this.ul;
        if (rieVar != null && zXmt) {
            this.xxg = new com.bytedance.sdk.openadsdk.common.sz(this, rieVar, this.yzg, false);
        }
        View cfVar = new cf(this, new cf.emc() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.18
            @Override // com.bytedance.sdk.openadsdk.common.cf.emc
            public View emc(Context context) {
                return (TTLandingPageActivity.this.ul == null || !TTLandingPageActivity.this.yz) ? new ru(context) : TTLandingPageActivity.this.xxg.dg();
            }
        });
        cfVar.setId(vk.cn);
        bwVar.addView(cfVar, new LinearLayout.LayoutParams(-1, this.yz ? -2 : vw.ypw(this, 44.0f)));
        com.bytedance.sdk.openadsdk.core.ycc.xq xqVar2 = new com.bytedance.sdk.openadsdk.core.ycc.xq(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        bwVar.addView(xqVar2, layoutParams);
        if (!com.bytedance.sdk.openadsdk.sra.emc.emc("lp_cache_enable", false) || TextUtils.isEmpty(str)) {
            bundleEmc = null;
            yccVar = null;
        } else {
            String str2 = System.identityHashCode(this.ul) + "_" + str;
            yccVar = com.bytedance.sdk.openadsdk.utils.ul.emc(this, str2);
            bundleEmc = com.bytedance.sdk.openadsdk.utils.ul.emc(str2);
        }
        if (yccVar == null) {
            yccVar = new com.bytedance.sdk.component.zz.ycc(this, ycc.xq.LANDING_PAGE);
        } else {
            if (bundleEmc != null && yccVar.getWebView() != null) {
                yccVar.getWebView().restoreState(bundleEmc);
            }
            this.tp = true;
        }
        yccVar.setId(vk.pxa);
        xqVar2.addView(yccVar, new FrameLayout.LayoutParams(-1, -1));
        cf cfVar2 = new cf(this, new cf.emc() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.2
            @Override // com.bytedance.sdk.openadsdk.common.cf.emc
            public View emc(Context context) {
                return new com.bytedance.sdk.openadsdk.common.msw(context);
            }
        });
        cfVar2.setId(vk.hj);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 81;
        xqVar2.addView(cfVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.ycc.ycc yccVar2 = new com.bytedance.sdk.openadsdk.core.ycc.ycc(this, null, R.style.Widget.ProgressBar.Horizontal);
        yccVar2.setId(vk.wbn);
        yccVar2.setProgress(1);
        yccVar2.setVisibility(8);
        yccVar2.setProgressDrawable(gbl.emc(this, "tt_browser_progress_style"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, vw.ypw(this, 3.0f));
        layoutParams3.gravity = 49;
        xqVar2.addView(yccVar2, layoutParams3);
        sup supVar = new sup(this);
        supVar.setOnlyLoading(this.mxo);
        supVar.setId(520093721);
        xqVar.addView(supVar, new FrameLayout.LayoutParams(-1, -1));
        return xqVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public void ypw() throws JSONException {
        zz();
    }

    private void emc(final int i) {
        if (this.uym == null || !ru()) {
            return;
        }
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.9
            @Override // java.lang.Runnable
            public void run() {
                vw.emc((View) TTLandingPageActivity.this.uym, i);
            }
        });
    }
}
