package com.bytedance.sdk.openadsdk.activity;

import L1.e;
import L1.f;
import L1.g;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.bw.gbl;
import com.bytedance.sdk.component.utils.sb;
import com.bytedance.sdk.component.utils.sba;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.cf;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.core.rtt;
import com.bytedance.sdk.openadsdk.core.sf;
import com.bytedance.sdk.openadsdk.core.tp;
import com.bytedance.sdk.openadsdk.core.widget.emc.ycc;
import com.bytedance.sdk.openadsdk.dg.sup;
import com.bytedance.sdk.openadsdk.dg.sz;
import com.bytedance.sdk.openadsdk.dg.xq;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.sra;
import com.bytedance.sdk.openadsdk.utils.vk;
import com.bytedance.sdk.openadsdk.utils.vw;
import com.bytedance.sdk.openadsdk.utils.yzg;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class TTVideoLandingPageActivity extends TTBaseLandingPageActivity implements com.bytedance.sdk.openadsdk.gbl.dg {
    protected Context bw;
    protected long cf;
    protected TextView db;
    protected TextView dg;
    protected com.bytedance.sdk.openadsdk.ul.emc.emc.xq dr;
    protected TextView ee;
    protected com.bytedance.sdk.component.zz.ycc emc;
    private int ffd;
    protected int gbl;
    protected com.bytedance.sdk.openadsdk.core.widget.emc hxp;
    protected String lt;
    protected rtt msw;
    protected int mxo;
    protected com.bytedance.sdk.openadsdk.core.sz.ypw.ycc qh;
    protected TextView rie;
    protected cf sb;
    protected Button sf;
    protected RelativeLayout sra;
    protected FrameLayout sup;
    protected com.bytedance.sdk.openadsdk.multipro.ypw.emc tp;
    protected String uym;
    protected rie vk;
    protected sz vw;
    private ILoader wa;
    private int wd;
    protected ImageView xq;
    protected String xxg;
    protected String ycc;
    protected ImageView ypw;
    protected ycc.emc yz;
    protected int sz = -1;
    protected int aa = 0;
    protected int sba = 0;
    protected int yzg = 0;
    protected int ul = 0;
    protected String ylm = "ダウンロード";
    protected boolean xmt = false;
    protected boolean cuf = false;
    protected boolean rtt = true;
    protected boolean mkp = false;
    protected String iyl = null;
    protected AtomicBoolean ra = new AtomicBoolean(true);
    protected JSONArray wo = null;
    private final AtomicInteger rqm = new AtomicInteger(0);
    private final AtomicInteger wad = new AtomicInteger(0);
    private final AtomicInteger but = new AtomicInteger(0);
    int wpn = -1;
    protected com.bytedance.sdk.openadsdk.core.xq.emc pxa = null;
    private final e ndl = new e() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.11
        @Override // L1.e
        public void emc(boolean z6) {
            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
            tTVideoLandingPageActivity.xmt = z6;
            if (tTVideoLandingPageActivity.isFinishing()) {
                return;
            }
            if (!z6) {
                vw.emc((View) TTVideoLandingPageActivity.this.emc, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.sup.getLayoutParams();
                TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                marginLayoutParams.width = tTVideoLandingPageActivity2.yzg;
                marginLayoutParams.height = tTVideoLandingPageActivity2.ul;
                marginLayoutParams.leftMargin = tTVideoLandingPageActivity2.sba;
                marginLayoutParams.topMargin = tTVideoLandingPageActivity2.aa;
                tTVideoLandingPageActivity2.sup.setLayoutParams(marginLayoutParams);
                return;
            }
            vw.emc((View) TTVideoLandingPageActivity.this.emc, 8);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.sup.getLayoutParams();
            TTVideoLandingPageActivity tTVideoLandingPageActivity3 = TTVideoLandingPageActivity.this;
            tTVideoLandingPageActivity3.sba = marginLayoutParams2.leftMargin;
            tTVideoLandingPageActivity3.aa = marginLayoutParams2.topMargin;
            tTVideoLandingPageActivity3.yzg = marginLayoutParams2.width;
            tTVideoLandingPageActivity3.ul = marginLayoutParams2.height;
            marginLayoutParams2.width = -1;
            marginLayoutParams2.height = -1;
            marginLayoutParams2.topMargin = 0;
            marginLayoutParams2.leftMargin = 0;
            tTVideoLandingPageActivity3.sup.setLayoutParams(marginLayoutParams2);
        }
    };
    private final sb.emc hj = new sb.emc() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.2
        @Override // com.bytedance.sdk.component.utils.sb.emc
        public void emc(Context context, Intent intent, boolean z6, final int i) {
            iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.2.1
                @Override // java.lang.Runnable
                public void run() {
                    emc(i);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void emc(int i) {
            com.bytedance.sdk.component.zz.ycc yccVar;
            String str;
            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
            if (tTVideoLandingPageActivity.mxo == 0 && i != 0 && (yccVar = tTVideoLandingPageActivity.emc) != null && (str = tTVideoLandingPageActivity.iyl) != null) {
                yccVar.a_(str);
            }
            com.bytedance.sdk.openadsdk.core.sz.ypw.ycc yccVar2 = TTVideoLandingPageActivity.this.qh;
            if (yccVar2 != null && yccVar2.getNativeVideoController() != null) {
                TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                if (!tTVideoLandingPageActivity2.cuf && tTVideoLandingPageActivity2.mxo != i) {
                    tTVideoLandingPageActivity2.qh.getNativeVideoController().xq(i);
                }
            }
            TTVideoLandingPageActivity.this.mxo = i;
        }
    };

    @SuppressLint({"StaticFieldLeak"})
    public static class emc extends AsyncTask<Void, Void, Drawable> {
        private final Bitmap emc;
        private final WeakReference<g> ypw;

        @Override // android.os.AsyncTask
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public Drawable doInBackground(Void... voidArr) {
            try {
                Bitmap bitmapEmc = com.bytedance.sdk.component.adexpress.dg.emc.emc(aa.emc(), this.emc, 25);
                if (bitmapEmc == null) {
                    return null;
                }
                return new BitmapDrawable(aa.emc().getResources(), bitmapEmc);
            } catch (Throwable th) {
                ul.xq("TTVideoLandingPage", th.getMessage());
                return null;
            }
        }

        private emc(Bitmap bitmap, g gVar) {
            this.emc = bitmap;
            this.ypw = new WeakReference<>(gVar);
        }

        @Override // android.os.AsyncTask
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Drawable drawable) {
            WeakReference<g> weakReference;
            if (drawable == null || (weakReference = this.ypw) == null || weakReference.get() == null) {
                return;
            }
            this.ypw.get().emc(drawable);
        }
    }

    private void aa() {
        com.bytedance.sdk.openadsdk.core.sz.ypw.ycc yccVar = this.qh;
        if (yccVar == null || yccVar.getNativeVideoController() == null || yzg()) {
            return;
        }
        this.qh.qh();
    }

    private void cf() {
        rtt rttVar = new rtt(this);
        this.msw = rttVar;
        rttVar.ypw(this.emc).xq(this.ycc).dg(this.uym).ypw(this.gbl).emc(this.vk).emc(this.vk.nx()).emc(this.emc).ypw("landingpage_split_screen").bw(this.vk.drx());
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void qh() {
        rie rieVar = this.vk;
        if (rieVar == null || rieVar.sx() != 4) {
            return;
        }
        this.sb.setVisibility(0);
        Button button = (Button) findViewById(vk.ej);
        this.sf = button;
        if (button != null) {
            emc(dg());
            this.sf.setOnClickListener(this.pxa);
            this.sf.setOnTouchListener(this.pxa);
        }
    }

    private void sba() {
        if (this.qh == null || yzg()) {
            return;
        }
        this.qh.qh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ul() {
        return !TextUtils.isEmpty(this.iyl) && this.iyl.contains("__luban_sdk");
    }

    private void vk() throws JSONException {
        com.bytedance.sdk.openadsdk.core.sz.ypw.ycc yccVar;
        if (this.xmt && (yccVar = this.qh) != null && yccVar.getNativeVideoController() != null) {
            this.qh.getNativeVideoController().bw(null, null);
            this.xmt = false;
        } else if (!ul() || this.ra.getAndSet(true)) {
            super.onBackPressed();
        } else {
            ylm();
            emc(0);
        }
    }

    private void ylm() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.msw.emc("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    private boolean yzg() {
        com.bytedance.sdk.openadsdk.core.sz.ypw.ycc yccVar = this.qh;
        if (yccVar == null || yccVar.getNativeVideoController() == null) {
            return true;
        }
        return this.qh.getNativeVideoController().sz();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public boolean emc() {
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void gbl() {
        if (this.vk == null) {
            return;
        }
        this.dr = com.bytedance.sdk.openadsdk.ul.emc.emc.dg.emc(this, this.lt);
        com.bytedance.sdk.openadsdk.core.xq.emc emcVar = new com.bytedance.sdk.openadsdk.core.xq.emc(this, this.vk, this.lt, this.gbl);
        this.pxa = emcVar;
        emcVar.emc(false);
        this.pxa.xq(true);
        this.db.setOnClickListener(this.pxa);
        this.db.setOnTouchListener(this.pxa);
        this.pxa.emc(this.dr);
    }

    public long msw() {
        com.bytedance.sdk.openadsdk.core.sz.ypw.ycc yccVar = this.qh;
        if (yccVar == null || yccVar.getNativeVideoController() == null) {
            return 0L;
        }
        return this.qh.getNativeVideoController().zz();
    }

    @Override // android.app.Activity
    public void onBackPressed() throws JSONException {
        vk();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        qh();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String strXou;
        super.onCreate(bundle);
        if (!qh.bw()) {
            finish();
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            getWindow().addFlags(16777216);
        } catch (Throwable unused) {
        }
        try {
            aa.ypw(this);
        } catch (Throwable unused2) {
        }
        this.mxo = sba.xq(getApplicationContext());
        try {
            setContentView(xq());
            this.bw = this;
            Intent intent = getIntent();
            this.mkp = intent.getBooleanExtra("video_is_auto_play", true);
            if (bundle != null && bundle.getLong("video_play_position") > 0) {
                this.cf = bundle.getLong("video_play_position", 0L);
            }
            String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_DATA);
            if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
                String stringExtra2 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra2 != null) {
                    try {
                        this.vk = com.bytedance.sdk.openadsdk.core.ypw.emc(new JSONObject(stringExtra2));
                    } catch (Exception unused3) {
                    }
                }
                rie rieVar = this.vk;
                if (rieVar != null) {
                    this.sz = rieVar.in();
                }
                this.ycc = intent.getStringExtra("adid");
                this.uym = intent.getStringExtra("log_extra");
                strXou = intent.getStringExtra("web_title");
                this.xxg = intent.getStringExtra("gecko_id");
                this.lt = intent.getStringExtra("event_tag");
                this.gbl = intent.getIntExtra("source", -1);
                this.iyl = intent.getStringExtra("url");
            } else {
                rie rieVarEmc = sf.emc().emc(sf.emc(intent));
                this.vk = rieVarEmc;
                if (rieVarEmc != null) {
                    this.sz = rieVarEmc.in();
                    this.ycc = this.vk.ye();
                    this.uym = this.vk.wdp();
                    strXou = this.vk.xou();
                    this.xxg = this.vk.qlw();
                    this.iyl = this.vk.gbl();
                    this.gbl = this.vk.sz();
                    this.lt = this.vk.sup();
                } else {
                    strXou = null;
                }
            }
            if (this.vk == null) {
                finish();
                return;
            }
            if (!TextUtils.isEmpty(this.xxg)) {
                this.wa = com.bytedance.sdk.openadsdk.uym.ypw.emc().ypw();
                int iEmc = com.bytedance.sdk.openadsdk.uym.ypw.emc().emc(this.wa, this.xxg);
                this.wd = iEmc;
                this.ffd = iEmc > 0 ? 2 : 0;
            }
            if (stringExtra != null) {
                try {
                    this.tp = com.bytedance.sdk.openadsdk.multipro.ypw.emc.emc(new JSONObject(stringExtra));
                } catch (Exception unused4) {
                }
                com.bytedance.sdk.openadsdk.multipro.ypw.emc emcVar = this.tp;
                if (emcVar != null) {
                    this.cf = emcVar.uym;
                }
            }
            if (bundle != null) {
                this.vk = sf.emc().emc(bundle.getInt("meta_index", -1));
                long j6 = bundle.getLong("video_play_position");
                if (j6 > 0) {
                    this.cf = j6;
                }
            }
            bw();
            gbl();
            cf();
            emc(4);
            if (this.emc != null) {
                com.bytedance.sdk.openadsdk.core.widget.emc.xq.emc(this.bw).emc(true).ypw(false).emc(this.emc.getWebView());
                sz szVarYpw = new sz(this.vk, this.emc.getWebView(), new sup() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.1
                    @Override // com.bytedance.sdk.openadsdk.dg.sup
                    public void emc(int i) {
                        xq.emc.emc(TTVideoLandingPageActivity.this.wd, TTVideoLandingPageActivity.this.but.get(), TTVideoLandingPageActivity.this.wad.get(), TTVideoLandingPageActivity.this.rqm.get() - TTVideoLandingPageActivity.this.wad.get(), TTVideoLandingPageActivity.this.vk, "landingpage_split_screen", i);
                    }
                }, this.ffd).ypw(true);
                this.vw = szVarYpw;
                this.yz = szVarYpw.emc;
                szVarYpw.emc("landingpage_split_screen");
            }
            com.bytedance.sdk.component.zz.ycc yccVar = this.emc;
            if (yccVar != null) {
                yccVar.setLandingPage(true);
                this.emc.setTag("landingpage_split_screen");
                this.emc.setMaterialMeta(this.vk.wg());
                this.emc.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.emc.bw(this.bw, this.msw, this.ycc, this.vw, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.4
                    @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                        try {
                            if (TextUtils.isEmpty(TTVideoLandingPageActivity.this.xxg)) {
                                return super.shouldInterceptRequest(webView, str);
                            }
                            TTVideoLandingPageActivity.this.rqm.incrementAndGet();
                            WebResourceResponseModel webResourceResponseModelEmc = com.bytedance.sdk.openadsdk.uym.ypw.emc().emc(TTVideoLandingPageActivity.this.wa, TTVideoLandingPageActivity.this.xxg, str);
                            if (webResourceResponseModelEmc != null && webResourceResponseModelEmc.getWebResourceResponse() != null) {
                                TTVideoLandingPageActivity.this.wad.incrementAndGet();
                                return webResourceResponseModelEmc.getWebResourceResponse();
                            }
                            if (webResourceResponseModelEmc != null && webResourceResponseModelEmc.getMsg() == 2) {
                                TTVideoLandingPageActivity.this.but.incrementAndGet();
                            }
                            return super.shouldInterceptRequest(webView, str);
                        } catch (Throwable th) {
                            ul.emc("TTVideoLandingPage", "shouldInterceptRequest url error", th);
                            return super.shouldInterceptRequest(webView, str);
                        }
                    }
                });
                com.bytedance.sdk.component.zz.ycc yccVar2 = this.emc;
                yccVar2.setUserAgentString(yzg.emc(yccVar2.getWebView(), BuildConfig.VERSION_CODE));
            }
            com.bytedance.sdk.component.zz.ycc yccVar3 = this.emc;
            if (yccVar3 != null) {
                yccVar3.setMixedContentMode(0);
            }
            com.bytedance.sdk.openadsdk.dg.xq.emc(this.vk, "landingpage_split_screen", this.ffd);
            sra.emc(this.emc, this.iyl);
            this.emc.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.emc.dg(this.msw, this.vw) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.5
                @Override // com.bytedance.sdk.openadsdk.core.widget.emc.dg, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                }
            });
            this.emc.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.6
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j7) {
                    TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                    com.bytedance.sdk.openadsdk.ul.emc.emc.xq xqVar = tTVideoLandingPageActivity.dr;
                    if (xqVar != null) {
                        xqVar.emc(tTVideoLandingPageActivity.vk);
                    }
                }
            });
            TextView textView = this.dg;
            if (textView != null) {
                if (TextUtils.isEmpty(strXou)) {
                    strXou = com.bytedance.sdk.component.utils.rie.emc(this, "tt_web_title_default");
                }
                textView.setText(strXou);
            }
            sup();
            ycc();
            qh();
            xq.emc.emc(SystemClock.elapsedRealtime() - jElapsedRealtime, this.vk, "landingpage_split_screen", this.wa, this.xxg);
        } catch (Throwable unused5) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        sz();
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
            this.vk.sup(false);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.component.zz.ycc yccVar = this.emc;
        if (yccVar != null) {
            tp.emc(yccVar.getWebView());
        }
        this.emc = null;
        rtt rttVar = this.msw;
        if (rttVar != null) {
            rttVar.sup();
        }
        com.bytedance.sdk.openadsdk.core.sz.ypw.ycc yccVar2 = this.qh;
        if (yccVar2 != null && yccVar2.getNativeVideoController() != null) {
            this.qh.getNativeVideoController().bw();
        }
        this.qh = null;
        this.vk = null;
        sz szVar = this.vw;
        if (szVar != null) {
            szVar.dg(true);
        }
        if (!TextUtils.isEmpty(this.xxg)) {
            xq.emc.emc(this.wad.get(), this.rqm.get(), this.vk);
        }
        com.bytedance.sdk.openadsdk.uym.ypw.emc().emc(this.wa);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onPause();
        sba();
        com.bytedance.sdk.openadsdk.core.sz.ypw.ycc yccVar = this.qh;
        if (yccVar == null || yccVar.getNativeVideoController() == null) {
            return;
        }
        emc(this.qh.getNativeVideoController());
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onResume();
        if (!this.rtt) {
            aa();
        }
        this.rtt = false;
        rtt rttVar = this.msw;
        if (rttVar != null) {
            rttVar.gbl();
        }
        sz szVar = this.vw;
        if (szVar != null) {
            szVar.uym();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        int iEmc = this.vk != null ? sf.emc().emc(this.vk) : -1;
        this.wpn = iEmc;
        bundle.putInt("meta_index", iEmc);
        bundle.putLong("video_play_position", this.cf);
        bundle.putBoolean("is_complete", this.cuf);
        long jYcc = this.cf;
        com.bytedance.sdk.openadsdk.core.sz.ypw.ycc yccVar = this.qh;
        if (yccVar != null && yccVar.getNativeVideoController() != null) {
            jYcc = this.qh.getNativeVideoController().ycc();
        }
        bundle.putLong("video_play_position", jYcc);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.wpn >= 0) {
            sf.emc().xq(this.wpn);
            this.wpn = -1;
        }
        com.bytedance.sdk.openadsdk.utils.dg.emc(this, this.vk);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        sz szVar = this.vw;
        if (szVar != null) {
            szVar.msw();
        }
    }

    public void ru() {
        rie rieVar = this.vk;
        if (rieVar == null || rieVar.sx() != 4) {
            return;
        }
        vw.emc((View) this.sra, 0);
        String strXou = !TextUtils.isEmpty(this.vk.xou()) ? this.vk.xou() : !TextUtils.isEmpty(this.vk.vyk()) ? this.vk.vyk() : !TextUtils.isEmpty(this.vk.hs()) ? this.vk.hs() : "";
        if (this.vk.ya() != null && this.vk.ya().emc() != null) {
            vw.emc((View) this.hxp, 0);
            vw.emc((View) this.rie, 4);
            com.bytedance.sdk.openadsdk.yzg.ypw.ypw().emc(this.vk.ya(), this.hxp, this.vk);
        } else if (!TextUtils.isEmpty(strXou)) {
            vw.emc((View) this.hxp, 4);
            vw.emc((View) this.rie, 0);
            this.rie.setText(strXou.substring(0, 1));
        }
        if (!TextUtils.isEmpty(this.vk.xxo())) {
            this.db.setText(this.vk.xxo());
        }
        if (!TextUtils.isEmpty(strXou)) {
            this.ee.setText(strXou);
        }
        vw.emc((View) this.ee, 0);
        vw.emc((View) this.db, 0);
    }

    public void sup() {
        sb.emc(this.hj, this.bw);
    }

    public void sz() {
        try {
            sb.emc(this.hj);
        } catch (Exception unused) {
        }
    }

    public abstract boolean uym();

    public abstract View xq();

    public int zz() {
        com.bytedance.sdk.openadsdk.core.sz.ypw.ycc yccVar = this.qh;
        if (yccVar == null || yccVar.getNativeVideoController() == null) {
            return 0;
        }
        return this.qh.getNativeVideoController().ru();
    }

    public void bw() {
        this.sb = (cf) findViewById(vk.hj);
        this.emc = (com.bytedance.sdk.component.zz.ycc) findViewById(vk.pxa);
        ImageView imageView = (ImageView) findViewById(520093720);
        this.ypw = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) throws JSONException {
                    JSONObject jSONObjectEmc;
                    TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                    if (tTVideoLandingPageActivity.emc != null) {
                        ycc.emc emcVar = tTVideoLandingPageActivity.yz;
                        if (emcVar != null) {
                            emcVar.emc();
                        }
                        if (TTVideoLandingPageActivity.this.emc.zz()) {
                            TTVideoLandingPageActivity.this.emc.ru();
                            return;
                        }
                        if (TTVideoLandingPageActivity.this.ul()) {
                            TTVideoLandingPageActivity.this.onBackPressed();
                            return;
                        }
                        com.bytedance.sdk.openadsdk.core.sz.ypw.ycc yccVar = TTVideoLandingPageActivity.this.qh;
                        if (yccVar == null || yccVar.getNativeVideoController() == null) {
                            jSONObjectEmc = null;
                        } else {
                            TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                            jSONObjectEmc = com.bytedance.sdk.openadsdk.utils.tp.emc(tTVideoLandingPageActivity2.vk, tTVideoLandingPageActivity2.qh.getNativeVideoController().uym(), TTVideoLandingPageActivity.this.qh.getNativeVideoController().gbl());
                        }
                        JSONObject jSONObject = jSONObjectEmc;
                        TTVideoLandingPageActivity tTVideoLandingPageActivity3 = TTVideoLandingPageActivity.this;
                        com.bytedance.sdk.openadsdk.dg.xq.emc(tTVideoLandingPageActivity3.vk, "embeded_ad", "detail_back", tTVideoLandingPageActivity3.msw(), TTVideoLandingPageActivity.this.zz(), jSONObject, (com.bytedance.sdk.openadsdk.dg.uym) null);
                        TTVideoLandingPageActivity.this.finish();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.sz.ypw.ycc yccVar = this.qh;
        if (yccVar != null) {
            yccVar.setIsAutoPlay(this.mkp);
        }
        ImageView imageView2 = (ImageView) findViewById(vk.vw);
        this.xq = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) throws JSONException {
                    JSONObject jSONObjectEmc;
                    com.bytedance.sdk.openadsdk.core.sz.ypw.ycc yccVar2 = TTVideoLandingPageActivity.this.qh;
                    if (yccVar2 != null) {
                        if (yccVar2.getNativeVideoController() != null) {
                            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                            jSONObjectEmc = com.bytedance.sdk.openadsdk.utils.tp.emc(tTVideoLandingPageActivity.vk, tTVideoLandingPageActivity.qh.getNativeVideoController().uym(), TTVideoLandingPageActivity.this.qh.getNativeVideoController().gbl());
                        } else {
                            jSONObjectEmc = null;
                        }
                        JSONObject jSONObject = jSONObjectEmc;
                        TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                        com.bytedance.sdk.openadsdk.dg.xq.emc(tTVideoLandingPageActivity2.vk, "embeded_ad", "detail_skip", tTVideoLandingPageActivity2.msw(), TTVideoLandingPageActivity.this.zz(), jSONObject, (com.bytedance.sdk.openadsdk.dg.uym) null);
                    }
                    TTVideoLandingPageActivity.this.finish();
                }
            });
        }
        this.dg = (TextView) findViewById(vk.vum);
        this.sup = (FrameLayout) findViewById(vk.tp);
        this.sra = (RelativeLayout) findViewById(vk.ra);
        this.rie = (TextView) findViewById(vk.xxg);
        this.ee = (TextView) findViewById(vk.yz);
        this.db = (TextView) findViewById(vk.wpn);
        this.hxp = (com.bytedance.sdk.openadsdk.core.widget.emc) findViewById(vk.wo);
        ru();
    }

    public String dg() {
        rie rieVar = this.vk;
        if (rieVar != null && !TextUtils.isEmpty(rieVar.xxo())) {
            this.ylm = this.vk.xxo();
        }
        return this.ylm;
    }

    public void ycc() {
        if (uym()) {
            try {
                com.bytedance.sdk.openadsdk.core.sz.ypw.ycc yccVar = new com.bytedance.sdk.openadsdk.core.sz.ypw.ycc(this.bw, this.vk, true, null);
                this.qh = yccVar;
                if (yccVar.getNativeVideoController() != null) {
                    this.qh.getNativeVideoController().emc(false);
                }
                if (this.cuf) {
                    this.sup.setVisibility(0);
                    this.sup.removeAllViews();
                    this.sup.addView(this.qh);
                    this.qh.ypw(true);
                } else {
                    if (!this.mkp) {
                        this.cf = 0L;
                    }
                    if (this.tp != null && this.qh.getNativeVideoController() != null) {
                        this.qh.getNativeVideoController().xq(this.tp.uym);
                        this.qh.getNativeVideoController().dg(this.tp.bw);
                        this.qh.emc(aa.dg().xq(String.valueOf(this.vk.tx())), "landingPageInit");
                    }
                    if (this.qh.emc(this.cf, this.rtt, this.cuf)) {
                        this.sup.setVisibility(0);
                        this.sup.removeAllViews();
                        this.sup.addView(this.qh);
                    }
                    if (this.qh.getNativeVideoController() != null) {
                        this.qh.getNativeVideoController().emc(false);
                        this.qh.getNativeVideoController().emc(this.ndl);
                    }
                }
                String strEmc = this.vk.rr().get(0).emc();
                com.bytedance.sdk.openadsdk.ru.dg.emc().emc(strEmc).emc(this.vk.rr().get(0).ypw()).ypw(this.vk.rr().get(0).xq()).bw(vw.bw(aa.emc())).dg(vw.xq(aa.emc())).xq(2).emc(new com.bytedance.sdk.openadsdk.ru.ypw(this.vk, strEmc, new com.bytedance.sdk.component.bw.vk() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.10
                    @Override // com.bytedance.sdk.component.bw.vk
                    public void emc(int i, String str, Throwable th) {
                    }

                    @Override // com.bytedance.sdk.component.bw.vk
                    public void emc(gbl gblVar) {
                        try {
                            Object objYpw = gblVar.ypw();
                            if (objYpw instanceof Bitmap) {
                                new emc((Bitmap) objYpw, TTVideoLandingPageActivity.this.qh.getNativeVideoController().sup()).execute(new Void[0]);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }), 4);
                this.qh.findViewById(520093726).setOnTouchListener(null);
                this.qh.findViewById(520093726).setOnClickListener(null);
            } catch (Exception e6) {
                ul.xq("TTVideoLandingPage", e6.getMessage());
                if (this.qh == null) {
                    ApmHelper.reportCustomError("mNativeVideoTsView is null", "FUNCTION EXCEPTION", e6);
                }
            }
            if (this.mxo == 0) {
                try {
                    Toast.makeText(this, com.bytedance.sdk.component.utils.rie.emc(this, "tt_no_network"), 0).show();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public void ypw() throws JSONException {
        vk();
    }

    private void emc(final String str) {
        Button button;
        if (TextUtils.isEmpty(str) || (button = this.sf) == null) {
            return;
        }
        button.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.7
            @Override // java.lang.Runnable
            public void run() {
                TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                if (tTVideoLandingPageActivity.sf == null || tTVideoLandingPageActivity.isFinishing()) {
                    return;
                }
                TTVideoLandingPageActivity.this.sf.setText(str);
            }
        });
    }

    private void emc(f fVar) {
        this.cuf = this.cuf || fVar.sz();
        Boolean bool = Boolean.TRUE;
        com.bytedance.sdk.openadsdk.multipro.dg.emc.emc("sp_multi_native_video_data", "key_video_is_update_flag", bool);
        com.bytedance.sdk.openadsdk.multipro.dg.emc.emc("sp_multi_native_video_data", "key_video_isfromvideodetailpage", bool);
        com.bytedance.sdk.openadsdk.multipro.dg.emc.emc("sp_multi_native_video_data", "key_native_video_complete", Boolean.valueOf(this.cuf));
        com.bytedance.sdk.openadsdk.multipro.dg.emc.emc("sp_multi_native_video_data", "key_video_current_play_position", Long.valueOf(fVar.ycc()));
        com.bytedance.sdk.openadsdk.multipro.dg.emc.emc("sp_multi_native_video_data", "key_video_total_play_duration", Long.valueOf(fVar.uym() + fVar.zz()));
        com.bytedance.sdk.openadsdk.multipro.dg.emc.emc("sp_multi_native_video_data", "key_video_duration", Long.valueOf(fVar.zz()));
    }

    private void emc(final int i) {
        if (this.xq == null || !ul()) {
            return;
        }
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.3
            @Override // java.lang.Runnable
            public void run() {
                vw.emc((View) TTVideoLandingPageActivity.this.xq, i);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.gbl.dg
    public void emc(boolean z6, JSONArray jSONArray) {
        if (!z6 || jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        this.wo = jSONArray;
    }
}
