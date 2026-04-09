package com.bytedance.sdk.openadsdk.activity;

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
import b9.c;
import b9.g;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.rn;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.ey;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.od;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.widget.ouw.le;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.tlj.yu;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.th;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.utils.zin;
import com.bytedance.sdk.openadsdk.yu.lh;
import com.bytedance.sdk.openadsdk.yu.mwh;
import com.bytedance.sdk.openadsdk.yu.ryl;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class TTVideoLandingPageActivity extends TTBaseLandingPageActivity implements com.bytedance.sdk.openadsdk.cf.yu {
    protected int bly;

    /* renamed from: cd, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh f7732cd;

    /* renamed from: cj, reason: collision with root package name */
    private ILoader f7734cj;
    protected com.bytedance.sdk.openadsdk.core.widget.ouw ex;
    protected com.bytedance.sdk.openadsdk.multipro.vt.ouw ey;
    protected Context fkw;
    protected String hun;
    protected rn jae;
    protected TextView jqy;
    protected long ko;
    protected TextView ksc;

    /* renamed from: le, reason: collision with root package name */
    protected String f7735le;

    /* renamed from: lh, reason: collision with root package name */
    protected ImageView f7736lh;

    /* renamed from: od, reason: collision with root package name */
    protected Button f7737od;
    protected int osn;
    protected com.bytedance.sdk.component.bly.le ouw;

    /* renamed from: pd, reason: collision with root package name */
    protected String f7738pd;
    protected bs pno;
    protected String ra;
    protected vpp rn;
    protected mwh rrs;
    protected com.bytedance.sdk.openadsdk.core.mwh.vt.le ryl;
    protected TextView tc;
    protected FrameLayout tlj;
    private int ucs;
    protected le.ouw ux;

    /* renamed from: vh, reason: collision with root package name */
    private int f7741vh;
    protected RelativeLayout vpp;
    protected ImageView vt;
    protected TextView yu;

    /* renamed from: cf, reason: collision with root package name */
    protected int f7733cf = -1;
    protected int zih = 0;
    protected int vm = 0;

    /* renamed from: th, reason: collision with root package name */
    protected int f7739th = 0;
    protected int qbp = 0;
    protected String zin = "ダウンロード";
    protected boolean uq = false;
    protected boolean fvf = false;
    protected boolean bs = true;
    protected boolean fak = false;
    protected String uoy = null;
    protected AtomicBoolean jvy = new AtomicBoolean(true);
    protected JSONArray fqk = null;
    private final AtomicInteger pv = new AtomicInteger(0);
    private final AtomicInteger wp = new AtomicInteger(0);
    private final AtomicInteger kn = new AtomicInteger(0);
    int lso = -1;

    /* renamed from: ub, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.core.lh.ouw f7740ub = null;
    private final c yib = new c() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.11
        @Override // b9.c
        public final void ouw(boolean z3) {
            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
            tTVideoLandingPageActivity.uq = z3;
            if (tTVideoLandingPageActivity.isFinishing()) {
                return;
            }
            if (!z3) {
                osn.ouw((View) TTVideoLandingPageActivity.this.ouw, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.tlj.getLayoutParams();
                TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                marginLayoutParams.width = tTVideoLandingPageActivity2.f7739th;
                marginLayoutParams.height = tTVideoLandingPageActivity2.qbp;
                marginLayoutParams.leftMargin = tTVideoLandingPageActivity2.vm;
                marginLayoutParams.topMargin = tTVideoLandingPageActivity2.zih;
                tTVideoLandingPageActivity2.tlj.setLayoutParams(marginLayoutParams);
                return;
            }
            osn.ouw((View) TTVideoLandingPageActivity.this.ouw, 8);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.tlj.getLayoutParams();
            TTVideoLandingPageActivity tTVideoLandingPageActivity3 = TTVideoLandingPageActivity.this;
            tTVideoLandingPageActivity3.vm = marginLayoutParams2.leftMargin;
            tTVideoLandingPageActivity3.zih = marginLayoutParams2.topMargin;
            tTVideoLandingPageActivity3.f7739th = marginLayoutParams2.width;
            tTVideoLandingPageActivity3.qbp = marginLayoutParams2.height;
            marginLayoutParams2.width = -1;
            marginLayoutParams2.height = -1;
            marginLayoutParams2.topMargin = 0;
            marginLayoutParams2.leftMargin = 0;
            tTVideoLandingPageActivity3.tlj.setLayoutParams(marginLayoutParams2);
        }
    };
    private final ksc.ouw yhj = new ksc.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.2
        @Override // com.bytedance.sdk.component.utils.ksc.ouw
        public final void ouw(boolean z3, final int i4) {
            com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.2.1
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass2.ouw(AnonymousClass2.this, i4);
                }
            });
        }

        public static /* synthetic */ void ouw(AnonymousClass2 anonymousClass2, int i4) {
            com.bytedance.sdk.component.bly.le leVar;
            String str;
            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
            if (tTVideoLandingPageActivity.osn == 0 && i4 != 0 && (leVar = tTVideoLandingPageActivity.ouw) != null && (str = tTVideoLandingPageActivity.uoy) != null) {
                leVar.a_(str);
            }
            com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar2 = TTVideoLandingPageActivity.this.ryl;
            if (leVar2 != null && leVar2.getNativeVideoController() != null) {
                TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                if (!tTVideoLandingPageActivity2.fvf && tTVideoLandingPageActivity2.osn != i4) {
                    com.bytedance.sdk.openadsdk.core.mwh.vt.lh nativeVideoController = tTVideoLandingPageActivity2.ryl.getNativeVideoController();
                    nativeVideoController.yu(i4);
                    if (i4 == 4) {
                        nativeVideoController.zih = false;
                        nativeVideoController.ryl();
                    }
                }
            }
            TTVideoLandingPageActivity.this.osn = i4;
        }
    };

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    @SuppressLint({"StaticFieldLeak"})
    public static class ouw extends AsyncTask<Void, Void, Drawable> {
        private final Bitmap ouw;
        private final WeakReference<g> vt;

        public /* synthetic */ ouw(Bitmap bitmap, g gVar, byte b10) {
            this(bitmap, gVar);
        }

        private Drawable ouw() {
            try {
                Bitmap bitmapOuw = com.bytedance.sdk.component.adexpress.yu.ouw.ouw(zih.ouw(), this.ouw, 25);
                if (bitmapOuw == null) {
                    return null;
                }
                return new BitmapDrawable(zih.ouw().getResources(), bitmapOuw);
            } catch (Throwable th2) {
                qbp.lh("TTVideoLandingPage", th2.getMessage());
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ Drawable doInBackground(Void[] voidArr) {
            return ouw();
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(Drawable drawable) {
            WeakReference<g> weakReference;
            Drawable drawable2 = drawable;
            if (drawable2 == null || (weakReference = this.vt) == null || weakReference.get() == null) {
                return;
            }
            this.vt.get().ouw(drawable2);
        }

        private ouw(Bitmap bitmap, g gVar) {
            this.ouw = bitmap;
            this.vt = new WeakReference<>(gVar);
        }
    }

    private boolean jg() {
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar = this.ryl;
        if (leVar == null || leVar.getNativeVideoController() == null) {
            return true;
        }
        return this.ryl.getNativeVideoController().f8335jg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ko() {
        return !TextUtils.isEmpty(this.uoy) && this.uoy.contains("__luban_sdk");
    }

    private void mwh() throws JSONException {
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar;
        if (this.uq && (leVar = this.ryl) != null && leVar.getNativeVideoController() != null) {
            this.ryl.getNativeVideoController().le();
            this.uq = false;
        } else if (!ko() || this.jvy.getAndSet(true)) {
            super.onBackPressed();
        } else {
            rn();
            ouw(0);
        }
    }

    private void rn() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.pno.ouw("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void ryl() {
        vpp vppVar = this.rn;
        if (vppVar == null || vppVar.f8305pd != 4) {
            return;
        }
        this.jae.setVisibility(0);
        Button button = (Button) findViewById(com.bytedance.sdk.openadsdk.utils.rn.f8716gh);
        this.f7737od = button;
        if (button != null) {
            ouw(yu());
            this.f7737od.setOnClickListener(this.f7740ub);
            this.f7737od.setOnTouchListener(this.f7740ub);
        }
    }

    public final long bly() {
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar = this.ryl;
        if (leVar == null || leVar.getNativeVideoController() == null) {
            return 0L;
        }
        return this.ryl.getNativeVideoController().th();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void cf() {
        if (this.rn == null) {
            return;
        }
        this.f7732cd = com.bytedance.sdk.openadsdk.qbp.ouw.ouw.yu.ouw(this, this.f7738pd);
        com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar = new com.bytedance.sdk.openadsdk.core.lh.ouw(this, this.rn, this.f7738pd, this.bly);
        this.f7740ub = ouwVar;
        ouwVar.yu = false;
        ouwVar.f8205le = true;
        this.ksc.setOnClickListener(ouwVar);
        this.ksc.setOnTouchListener(this.f7740ub);
        this.f7740ub.ouw(this.f7732cd);
    }

    public abstract View lh();

    @Override // android.app.Activity
    public void onBackPressed() throws JSONException {
        mwh();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ryl();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String strOuw;
        super.onCreate(bundle);
        if (!jg.fkw()) {
            finish();
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            getWindow().addFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        } catch (Throwable unused) {
        }
        try {
            zih.vt(this);
        } catch (Throwable unused2) {
        }
        this.osn = ksc.ouw(getApplicationContext(), 60000L);
        try {
            setContentView(lh());
            this.fkw = this;
            Intent intent = getIntent();
            this.fak = intent.getBooleanExtra("video_is_auto_play", true);
            if (bundle != null && bundle.getLong("video_play_position") > 0) {
                this.ko = bundle.getLong("video_play_position", 0L);
            }
            String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_DATA);
            if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                String stringExtra2 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra2 != null) {
                    try {
                        this.rn = com.bytedance.sdk.openadsdk.core.vt.ouw(new JSONObject(stringExtra2));
                    } catch (Exception unused3) {
                    }
                }
                vpp vppVar = this.rn;
                if (vppVar != null) {
                    this.f7733cf = vppVar.ucs;
                }
                this.f7735le = intent.getStringExtra("adid");
                this.ra = intent.getStringExtra("log_extra");
                strOuw = intent.getStringExtra("web_title");
                this.hun = intent.getStringExtra("gecko_id");
                this.f7738pd = intent.getStringExtra("event_tag");
                this.bly = intent.getIntExtra("source", -1);
                this.uoy = intent.getStringExtra("url");
            } else {
                vpp vppVarOuw = od.ouw().ouw(od.ouw(intent));
                this.rn = vppVarOuw;
                if (vppVarOuw != null) {
                    this.f7733cf = vppVarOuw.ucs;
                    this.f7735le = vppVarOuw.pv;
                    this.ra = vppVarOuw.yhj;
                    strOuw = vppVarOuw.fqk;
                    this.hun = vppVarOuw.f8298ki;
                    this.uoy = vppVarOuw.f8310th;
                    this.bly = vppVarOuw.zin;
                    this.f7738pd = vppVarOuw.qbp;
                } else {
                    strOuw = null;
                }
            }
            if (this.rn == null) {
                finish();
                return;
            }
            if (!TextUtils.isEmpty(this.hun)) {
                com.bytedance.sdk.openadsdk.ra.vt.ouw();
                this.f7734cj = com.bytedance.sdk.openadsdk.ra.vt.vt();
                com.bytedance.sdk.openadsdk.ra.vt.ouw();
                int iOuw = com.bytedance.sdk.openadsdk.ra.vt.ouw(this.f7734cj, this.hun);
                this.ucs = iOuw;
                this.f7741vh = iOuw > 0 ? 2 : 0;
            }
            if (stringExtra != null) {
                try {
                    this.ey = com.bytedance.sdk.openadsdk.multipro.vt.ouw.ouw(new JSONObject(stringExtra));
                } catch (Exception unused4) {
                }
                com.bytedance.sdk.openadsdk.multipro.vt.ouw ouwVar = this.ey;
                if (ouwVar != null) {
                    this.ko = ouwVar.ra;
                }
            }
            if (bundle != null) {
                this.rn = od.ouw().ouw(bundle.getInt("meta_index", -1));
                long j = bundle.getLong("video_play_position");
                if (j > 0) {
                    this.ko = j;
                }
            }
            le();
            cf();
            bs bsVar = new bs(this);
            this.pno = bsVar;
            bs bsVarVt = bsVar.vt(this.ouw);
            bsVarVt.f8108lh = this.f7735le;
            bsVarVt.fkw = this.ra;
            bsVarVt.f8107le = this.bly;
            bs bsVarOuw = bsVarVt.ouw(this.rn);
            bsVarOuw.pno = this.rn.f8316vi;
            bs bsVarOuw2 = bsVarOuw.ouw(this.ouw);
            bsVarOuw2.ouw = "landingpage_split_screen";
            bsVarOuw2.ra = this.rn.hun();
            ouw(4);
            if (this.ouw != null) {
                com.bytedance.sdk.openadsdk.core.widget.ouw.lh lhVarOuw = com.bytedance.sdk.openadsdk.core.widget.ouw.lh.ouw(this.fkw);
                lhVarOuw.vt = true;
                lhVarOuw.ouw = false;
                lhVarOuw.ouw(this.ouw.getWebView());
                mwh mwhVar = new mwh(this.rn, this.ouw.getWebView(), new ryl() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.1
                    @Override // com.bytedance.sdk.openadsdk.yu.ryl
                    public final void ouw(int i4) {
                        lh.ouw.ouw(TTVideoLandingPageActivity.this.ucs, TTVideoLandingPageActivity.this.kn.get(), TTVideoLandingPageActivity.this.wp.get(), TTVideoLandingPageActivity.this.pv.get() - TTVideoLandingPageActivity.this.wp.get(), TTVideoLandingPageActivity.this.rn, "landingpage_split_screen", i4);
                    }
                }, this.f7741vh);
                mwhVar.jae = true;
                this.rrs = mwhVar;
                this.ux = mwhVar.ryl;
                mwhVar.ouw("landingpage_split_screen");
            }
            com.bytedance.sdk.component.bly.le leVar = this.ouw;
            if (leVar != null) {
                leVar.setLandingPage(true);
                this.ouw.setTag("landingpage_split_screen");
                this.ouw.setMaterialMeta(this.rn.bs());
                this.ouw.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.ouw.fkw(this.fkw, this.pno, this.f7735le, this.rrs) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.4
                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                        try {
                            if (TextUtils.isEmpty(TTVideoLandingPageActivity.this.hun)) {
                                return super.shouldInterceptRequest(webView, str);
                            }
                            TTVideoLandingPageActivity.this.pv.incrementAndGet();
                            com.bytedance.sdk.openadsdk.ra.vt.ouw();
                            WebResourceResponseModel webResourceResponseModelOuw = com.bytedance.sdk.openadsdk.ra.vt.ouw(TTVideoLandingPageActivity.this.f7734cj, TTVideoLandingPageActivity.this.hun, str);
                            if (webResourceResponseModelOuw != null && webResourceResponseModelOuw.getWebResourceResponse() != null) {
                                TTVideoLandingPageActivity.this.wp.incrementAndGet();
                                ko.vt("TTVideoLandingPage", "GeckoLog: hit++");
                                return webResourceResponseModelOuw.getWebResourceResponse();
                            }
                            if (webResourceResponseModelOuw != null && webResourceResponseModelOuw.getMsg() == 2) {
                                TTVideoLandingPageActivity.this.kn.incrementAndGet();
                            }
                            return super.shouldInterceptRequest(webView, str);
                        } catch (Throwable th2) {
                            qbp.ouw("TTVideoLandingPage", "shouldInterceptRequest url error", th2);
                            return super.shouldInterceptRequest(webView, str);
                        }
                    }
                });
                com.bytedance.sdk.component.bly.le leVar2 = this.ouw;
                leVar2.setUserAgentString(th.ouw(leVar2.getWebView()));
            }
            com.bytedance.sdk.component.bly.le leVar3 = this.ouw;
            if (leVar3 != null) {
                leVar3.setMixedContentMode(0);
            }
            com.bytedance.sdk.openadsdk.yu.lh.ouw(this.rn, "landingpage_split_screen", this.f7741vh);
            zin.ouw(this.ouw, this.uoy);
            this.ouw.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.ouw.yu(this.pno, this.rrs) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.5
                @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.yu, android.webkit.WebChromeClient
                public final void onProgressChanged(WebView webView, int i4) {
                    super.onProgressChanged(webView, i4);
                }
            });
            this.ouw.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.6
                @Override // android.webkit.DownloadListener
                public final void onDownloadStart(String str, String str2, String str3, String str4, long j8) {
                    TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                    com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh lhVar = tTVideoLandingPageActivity.f7732cd;
                    if (lhVar != null) {
                        lhVar.ouw(tTVideoLandingPageActivity.rn);
                    }
                }
            });
            TextView textView = this.yu;
            if (textView != null) {
                if (TextUtils.isEmpty(strOuw)) {
                    strOuw = com.bytedance.sdk.component.utils.vpp.ouw(this, "tt_web_title_default");
                }
                textView.setText(strOuw);
            }
            ksc.ouw(this.yhj, this.fkw);
            ra();
            ryl();
            lh.ouw.ouw(SystemClock.elapsedRealtime() - jElapsedRealtime, this.rn, "landingpage_split_screen", this.f7734cj, this.hun);
        } catch (Throwable unused5) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            ksc.ouw(this.yhj);
        } catch (Exception unused) {
        }
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
            this.rn.f8290cd = false;
        } catch (Throwable unused2) {
        }
        com.bytedance.sdk.component.bly.le leVar = this.ouw;
        if (leVar != null) {
            ey.ouw(leVar.getWebView());
        }
        this.ouw = null;
        bs bsVar = this.pno;
        if (bsVar != null) {
            bsVar.lh();
        }
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar2 = this.ryl;
        if (leVar2 != null && leVar2.getNativeVideoController() != null) {
            this.ryl.getNativeVideoController().ko();
        }
        this.ryl = null;
        this.rn = null;
        mwh mwhVar = this.rrs;
        if (mwhVar != null) {
            mwhVar.ouw(true);
        }
        if (!TextUtils.isEmpty(this.hun)) {
            lh.ouw.ouw(this.wp.get(), this.pv.get(), this.rn);
        }
        com.bytedance.sdk.openadsdk.ra.vt.ouw();
        com.bytedance.sdk.openadsdk.ra.vt.ouw(this.f7734cj);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onPause();
        if (this.ryl != null && !jg()) {
            this.ryl.cf();
        }
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar = this.ryl;
        if (leVar == null || leVar.getNativeVideoController() == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.mwh.vt.lh nativeVideoController = this.ryl.getNativeVideoController();
        this.fvf = this.fvf || nativeVideoController.jqy();
        Boolean bool = Boolean.TRUE;
        com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_is_update_flag", bool);
        com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_isfromvideodetailpage", bool);
        com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_native_video_complete", Boolean.valueOf(this.fvf));
        com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_current_play_position", Long.valueOf(nativeVideoController.rn()));
        com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_total_play_duration", Long.valueOf(nativeVideoController.zih() + nativeVideoController.th()));
        com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_duration", Long.valueOf(nativeVideoController.th()));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar;
        super.onResume();
        if (!this.bs && (leVar = this.ryl) != null && leVar.getNativeVideoController() != null && !jg()) {
            this.ryl.cf();
        }
        this.bs = false;
        bs bsVar = this.pno;
        if (bsVar != null) {
            bsVar.vt();
        }
        mwh mwhVar = this.rrs;
        if (mwhVar != null) {
            mwhVar.fkw();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        int iOuw = this.rn != null ? od.ouw().ouw(this.rn) : -1;
        this.lso = iOuw;
        bundle.putInt("meta_index", iOuw);
        bundle.putLong("video_play_position", this.ko);
        bundle.putBoolean("is_complete", this.fvf);
        long j = this.ko;
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar = this.ryl;
        if (leVar != null && leVar.getNativeVideoController() != null) {
            j = this.ryl.getNativeVideoController().bly;
        }
        bundle.putLong("video_play_position", j);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.lso >= 0) {
            od.ouw().vt(this.lso);
            this.lso = -1;
        }
        com.bytedance.sdk.openadsdk.utils.yu.ouw(this, this.rn);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        mwh mwhVar = this.rrs;
        if (mwhVar != null) {
            mwhVar.le();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public final boolean ouw() {
        return true;
    }

    public abstract boolean pno();

    public void ra() {
        if (pno()) {
            try {
                com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar = new com.bytedance.sdk.openadsdk.core.mwh.vt.le(this.fkw, this.rn, true, (com.bytedance.sdk.openadsdk.yu.ra) null);
                this.ryl = leVar;
                if (leVar.getNativeVideoController() != null) {
                    this.ryl.getNativeVideoController().vt(false);
                }
                if (this.fvf) {
                    this.tlj.setVisibility(0);
                    this.tlj.removeAllViews();
                    this.tlj.addView(this.ryl);
                    this.ryl.bly();
                } else {
                    if (!this.fak) {
                        this.ko = 0L;
                    }
                    if (this.ey != null && this.ryl.getNativeVideoController() != null) {
                        this.ryl.getNativeVideoController().uoy = this.ey.ra;
                        this.ryl.getNativeVideoController().bs = this.ey.fkw;
                        int iFqk = this.rn.fqk();
                        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar2 = this.ryl;
                        zih.yu();
                        leVar2.ouw(cf.vt(String.valueOf(iFqk)), "landingPageInit");
                    }
                    if (this.ryl.ouw(this.ko, this.bs, this.fvf)) {
                        this.tlj.setVisibility(0);
                        this.tlj.removeAllViews();
                        this.tlj.addView(this.ryl);
                    }
                    if (this.ryl.getNativeVideoController() != null) {
                        this.ryl.getNativeVideoController().vt(false);
                        this.ryl.getNativeVideoController().ouw(this.yib);
                    }
                }
                String str = this.rn.tc.get(0).ouw;
                yu.ouw.vt.ouw(str).ouw(this.rn.tc.get(0).vt).vt(this.rn.tc.get(0).f8323lh).fkw(osn.le(zih.ouw())).yu(osn.yu(zih.ouw())).lh(2).ouw(new com.bytedance.sdk.openadsdk.tlj.vt(this.rn, str, new com.bytedance.sdk.component.fkw.rn() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.10
                    @Override // com.bytedance.sdk.component.fkw.rn
                    public final void ouw(int i4, String str2, Throwable th2) {
                    }

                    @Override // com.bytedance.sdk.component.fkw.rn
                    public final void ouw(com.bytedance.sdk.component.fkw.cf cfVar) {
                        try {
                            Object objVt = cfVar.vt();
                            if (objVt instanceof Bitmap) {
                                new ouw((Bitmap) objVt, TTVideoLandingPageActivity.this.ryl.getNativeVideoController().ra, (byte) 0).execute(new Void[0]);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }));
                this.ryl.findViewById(520093726).setOnTouchListener(null);
                this.ryl.findViewById(520093726).setOnClickListener(null);
            } catch (Exception e2) {
                qbp.lh("TTVideoLandingPage", e2.getMessage());
                if (this.ryl == null) {
                    ApmHelper.reportCustomError("mNativeVideoTsView is null", "FUNCTION EXCEPTION", e2);
                }
            }
            if (this.osn == 0) {
                try {
                    Toast.makeText(this, com.bytedance.sdk.component.utils.vpp.ouw(this, "tt_no_network"), 0).show();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final int tlj() {
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar = this.ryl;
        if (leVar == null || leVar.getNativeVideoController() == null) {
            return 0;
        }
        return this.ryl.getNativeVideoController().qbp();
    }

    public void le() {
        this.jae = (rn) findViewById(com.bytedance.sdk.openadsdk.utils.rn.f8733vh);
        this.ouw = (com.bytedance.sdk.component.bly.le) findViewById(com.bytedance.sdk.openadsdk.utils.rn.ux);
        ImageView imageView = (ImageView) findViewById(520093720);
        this.vt = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws JSONException {
                    JSONObject jSONObjectOuw;
                    TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                    if (tTVideoLandingPageActivity.ouw != null) {
                        le.ouw ouwVar = tTVideoLandingPageActivity.ux;
                        if (ouwVar != null) {
                            ouwVar.ouw();
                        }
                        if (TTVideoLandingPageActivity.this.ouw.lh()) {
                            TTVideoLandingPageActivity.this.ouw.yu();
                            return;
                        }
                        if (TTVideoLandingPageActivity.this.ko()) {
                            TTVideoLandingPageActivity.this.onBackPressed();
                            return;
                        }
                        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar = TTVideoLandingPageActivity.this.ryl;
                        if (leVar == null || leVar.getNativeVideoController() == null) {
                            jSONObjectOuw = null;
                        } else {
                            TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                            jSONObjectOuw = uoy.ouw(tTVideoLandingPageActivity2.rn, tTVideoLandingPageActivity2.ryl.getNativeVideoController().zih(), TTVideoLandingPageActivity.this.ryl.getNativeVideoController().f8336le);
                        }
                        JSONObject jSONObject = jSONObjectOuw;
                        TTVideoLandingPageActivity tTVideoLandingPageActivity3 = TTVideoLandingPageActivity.this;
                        com.bytedance.sdk.openadsdk.yu.lh.ouw(tTVideoLandingPageActivity3.rn, "embeded_ad", "detail_back", tTVideoLandingPageActivity3.bly(), TTVideoLandingPageActivity.this.tlj(), jSONObject, (com.bytedance.sdk.openadsdk.yu.ra) null);
                        TTVideoLandingPageActivity.this.finish();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar = this.ryl;
        if (leVar != null) {
            leVar.setIsAutoPlay(this.fak);
        }
        ImageView imageView2 = (ImageView) findViewById(com.bytedance.sdk.openadsdk.utils.rn.osn);
        this.f7736lh = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws JSONException {
                    JSONObject jSONObjectOuw;
                    com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar2 = TTVideoLandingPageActivity.this.ryl;
                    if (leVar2 != null) {
                        if (leVar2.getNativeVideoController() != null) {
                            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                            jSONObjectOuw = uoy.ouw(tTVideoLandingPageActivity.rn, tTVideoLandingPageActivity.ryl.getNativeVideoController().zih(), TTVideoLandingPageActivity.this.ryl.getNativeVideoController().f8336le);
                        } else {
                            jSONObjectOuw = null;
                        }
                        JSONObject jSONObject = jSONObjectOuw;
                        TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                        com.bytedance.sdk.openadsdk.yu.lh.ouw(tTVideoLandingPageActivity2.rn, "embeded_ad", "detail_skip", tTVideoLandingPageActivity2.bly(), TTVideoLandingPageActivity.this.tlj(), jSONObject, (com.bytedance.sdk.openadsdk.yu.ra) null);
                    }
                    TTVideoLandingPageActivity.this.finish();
                }
            });
        }
        this.yu = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.rn.odc);
        this.tlj = (FrameLayout) findViewById(com.bytedance.sdk.openadsdk.utils.rn.uoy);
        this.vpp = (RelativeLayout) findViewById(com.bytedance.sdk.openadsdk.utils.rn.ey);
        this.jqy = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.rn.jvy);
        this.tc = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.rn.fqk);
        this.ksc = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.rn.hun);
        this.ex = (com.bytedance.sdk.openadsdk.core.widget.ouw) findViewById(com.bytedance.sdk.openadsdk.utils.rn.rrs);
        vpp vppVar = this.rn;
        if (vppVar == null || vppVar.f8305pd != 4) {
            return;
        }
        osn.ouw((View) this.vpp, 0);
        String str = !TextUtils.isEmpty(this.rn.fqk) ? this.rn.fqk : !TextUtils.isEmpty(this.rn.hun) ? this.rn.hun : !TextUtils.isEmpty(this.rn.f8315vh) ? this.rn.f8315vh : "";
        com.bytedance.sdk.openadsdk.core.model.zih zihVar = this.rn.fak;
        if (zihVar != null && zihVar.ouw != null) {
            osn.ouw((View) this.ex, 0);
            osn.ouw((View) this.jqy, 4);
            com.bytedance.sdk.openadsdk.th.vt.ouw();
            vpp vppVar2 = this.rn;
            com.bytedance.sdk.openadsdk.th.vt.ouw(vppVar2.fak, this.ex, vppVar2);
        } else if (!TextUtils.isEmpty(str)) {
            osn.ouw((View) this.ex, 4);
            osn.ouw((View) this.jqy, 0);
            this.jqy.setText(str.substring(0, 1));
        }
        if (!TextUtils.isEmpty(this.rn.vpp())) {
            this.ksc.setText(this.rn.vpp());
        }
        if (!TextUtils.isEmpty(str)) {
            this.tc.setText(str);
        }
        osn.ouw((View) this.tc, 0);
        osn.ouw((View) this.ksc, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public final void vt() throws JSONException {
        mwh();
    }

    public final String yu() {
        vpp vppVar = this.rn;
        if (vppVar != null && !TextUtils.isEmpty(vppVar.vpp())) {
            this.zin = this.rn.vpp();
        }
        return this.zin;
    }

    private void ouw(final String str) {
        Button button;
        if (TextUtils.isEmpty(str) || (button = this.f7737od) == null) {
            return;
        }
        button.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.7
            @Override // java.lang.Runnable
            public final void run() {
                TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                if (tTVideoLandingPageActivity.f7737od == null || tTVideoLandingPageActivity.isFinishing()) {
                    return;
                }
                TTVideoLandingPageActivity.this.f7737od.setText(str);
            }
        });
    }

    private void ouw(final int i4) {
        if (this.f7736lh == null || !ko()) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.3
            @Override // java.lang.Runnable
            public final void run() {
                osn.ouw((View) TTVideoLandingPageActivity.this.f7736lh, i4);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.cf.yu
    public final void ouw(boolean z3, JSONArray jSONArray) {
        if (!z3 || jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        this.fqk = jSONArray;
    }
}
