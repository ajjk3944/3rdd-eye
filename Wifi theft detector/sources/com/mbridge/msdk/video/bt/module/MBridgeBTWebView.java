package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.video.signal.impl.k;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class MBridgeBTWebView extends MBridgeBTWebViewDiff {

    /* renamed from: p, reason: collision with root package name */
    private String f18659p;

    /* renamed from: q, reason: collision with root package name */
    private String f18660q;

    /* renamed from: r, reason: collision with root package name */
    private String f18661r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f18662s;

    /* renamed from: t, reason: collision with root package name */
    private ImageView f18663t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f18664u;

    /* renamed from: v, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.c f18665v;

    /* renamed from: w, reason: collision with root package name */
    private List<CampaignEx> f18666w;

    /* renamed from: x, reason: collision with root package name */
    private WebView f18667x;

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            if (MBridgeBTWebView.this.f18667x != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f18535n);
                    jSONObject.put("id", MBridgeBTWebView.this.f18540d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("x", String.valueOf(view.getX()));
                    jSONObject2.put("y", String.valueOf(view.getY()));
                    jSONObject.put("data", jSONObject2);
                    f.a().a(MBridgeBTWebView.this.f18667x, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception unused) {
                    com.mbridge.msdk.video.bt.component.d.c().a(MBridgeBTWebView.this.f18667x, "onClicked", MBridgeBTWebView.this.f18540d);
                }
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            MBridgeBTWebView.this.close();
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WindVaneWebView windVaneWebView = MBridgeBTWebView.this.webView;
                if (windVaneWebView != null) {
                    windVaneWebView.clearWebView();
                    MBridgeBTWebView.this.webView.release();
                }
                MBridgeBTWebView.this.f18659p = null;
                MBridgeBTWebView.this.f18660q = null;
                MBridgeBTWebView.this.f18661r = null;
                if (MBridgeBTWebView.this.f18667x != null) {
                    MBridgeBTWebView.this.f18667x = null;
                }
            } catch (Throwable th) {
                q0.a(BTBaseView.TAG, th.getMessage());
            }
        }
    }

    public MBridgeBTWebView(Context context) {
        super(context);
        this.f18662s = false;
        this.f18664u = false;
    }

    private void setIntentFilter(com.mbridge.msdk.mbsignalcommon.base.c cVar) {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setFilter(cVar);
        }
    }

    public void broadcast(String str, JSONObject jSONObject) throws JSONException {
        if (this.webView != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", BTBaseView.f18535n);
                jSONObject2.put("id", this.f18540d);
                jSONObject2.put("eventName", str);
                jSONObject2.put("data", jSONObject);
                f.a().a((WebView) this.webView, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                com.mbridge.msdk.video.bt.component.d.c().a((WebView) this.webView, "broadcast", this.f18540d);
            }
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTWebViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void close() throws JSONException {
        WebView webView = this.f18667x;
        if (webView != null) {
            BTBaseView.a(webView, "onPlayerCloseBtnClicked", this.f18540d);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTWebViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void expand(String str, boolean z10) {
    }

    public List<CampaignEx> getCampaigns() {
        return this.f18666w;
    }

    public String getFilePath() {
        return this.f18660q;
    }

    public String getFileURL() {
        return this.f18659p;
    }

    public String getHtml() {
        return this.f18661r;
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTWebViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public CampaignEx getMraidCampaign() {
        return this.f18538b;
    }

    public com.mbridge.msdk.videocommon.setting.c getRewardUnitSetting() {
        return this.f18665v;
    }

    public WindVaneWebView getWebView() {
        return this.webView;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void init(Context context) {
        WindVaneWebView windVaneWebView = new WindVaneWebView(context);
        this.webView = windVaneWebView;
        windVaneWebView.setBackgroundColor(0);
        this.webView.setVisibility(0);
        k kVar = new k(null, this.f18538b, this.f18666w);
        this.jsCommon = kVar;
        kVar.setUnitId(this.f18539c);
        if (com.mbridge.msdk.util.b.a()) {
            setChinaAlertInstallState(this.jsCommon);
        }
        this.webView.setObject(this.jsCommon);
        this.webView.setMraidObject(this);
        this.webView.setWebViewListener(new a());
        addView(this.webView, new FrameLayout.LayoutParams(-1, -1));
        setOnClickListener(new b());
        try {
            ImageView imageView = new ImageView(getContext());
            this.f18663t = imageView;
            imageView.setImageResource(findDrawable("mbridge_reward_close"));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
            layoutParams.gravity = 8388661;
            layoutParams.setMargins(30, 30, 30, 30);
            this.f18663t.setLayoutParams(layoutParams);
            this.f18663t.setVisibility(this.f18662s ? 4 : 8);
            CampaignEx campaignEx = this.f18538b;
            if (campaignEx != null && campaignEx.isMraid()) {
                this.f18663t.setVisibility(4);
            }
            this.f18663t.setOnClickListener(new c());
            addView(this.f18663t);
        } catch (Throwable th) {
            q0.a(BTBaseView.TAG, th.getMessage());
        }
    }

    public void onBackPressed() throws JSONException {
        if (this.webView != null) {
            com.mbridge.msdk.video.bt.component.d.c().a((WebView) this.webView, "onSystemBackPressed", this.f18540d);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) throws JSONException {
        if (this.webView != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (configuration.orientation == 2) {
                    jSONObject.put(AdUnitActivity.EXTRA_ORIENTATION, "landscape");
                } else {
                    jSONObject.put(AdUnitActivity.EXTRA_ORIENTATION, "portrait");
                }
                jSONObject.put("instanceId", this.f18540d);
                f.a().a((WebView) this.webView, AdUnitActivity.EXTRA_ORIENTATION, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void onDestory() {
        if (this.f18664u) {
            return;
        }
        this.f18664u = true;
        try {
            if (this.webView != null) {
                com.mbridge.msdk.video.bt.component.d.c().a((WebView) this.webView, "onSystemDestory", this.f18540d);
            }
            new Handler(Looper.getMainLooper()).postDelayed(new d(), 500L);
            setOnClickListener(null);
            removeAllViews();
        } catch (Throwable th) {
            q0.a(BTBaseView.TAG, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onFinishRedirection(Campaign campaign, String str) {
        u0.a(campaign, this);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onRedirectionFailed(Campaign campaign, String str) {
        u0.a(campaign, this);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onStartRedirection(Campaign campaign, String str) {
        u0.b(campaign, this);
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTWebViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void open(String str) {
        try {
            String clickURL = this.f18538b.getClickURL();
            if (!TextUtils.isEmpty(str)) {
                this.f18538b.setClickURL(str);
                reportOpen(str);
            }
            this.f18538b.setClickTempSource(2);
            this.f18538b.setClickType(2);
            this.f18538b.setTriggerClickSource(2);
            com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(getContext(), this.f18539c);
            aVar.a(this);
            aVar.a(this.f18538b);
            this.f18538b.setClickURL(clickURL);
        } catch (Throwable th) {
            q0.b(BTBaseView.TAG, th.getMessage());
        }
    }

    public void preload() {
        if (!TextUtils.isEmpty(this.f18659p)) {
            this.webView.loadUrl(this.f18659p);
        } else if (!TextUtils.isEmpty(this.f18660q)) {
            this.webView.loadUrl(this.f18660q);
        } else {
            if (TextUtils.isEmpty(this.f18661r)) {
                return;
            }
            this.webView.loadDataWithBaseURL("", this.f18661r, "text/html", C.UTF8_NAME, null);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTWebViewDiff
    public void reportOpen(String str) {
        try {
            CampaignEx mraidCampaign = getMraidCampaign();
            if (mraidCampaign != null) {
                new h(getContext()).a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.f18539c, str, this.f18538b.isBidCampaign());
            }
        } catch (Throwable th) {
            q0.a(BTBaseView.TAG, th.getMessage());
        }
    }

    public void setCampaigns(List<CampaignEx> list) {
        this.f18666w = list;
    }

    public void setCreateWebView(WebView webView) {
        this.f18667x = webView;
    }

    public void setFilePath(String str) {
        this.f18660q = str;
    }

    public void setFileURL(String str) {
        this.f18659p = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean zContains = str.contains("play.google.com");
        setWebviewClickable(!zContains);
        if (zContains) {
            setIntentFilter(new com.mbridge.msdk.mbsignalcommon.base.c());
        }
    }

    public void setHtml(String str) {
        this.f18661r = str;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void setRewardUnitSetting(com.mbridge.msdk.videocommon.setting.c cVar) {
        this.f18665v = cVar;
    }

    public void setTempTypeForMetrics(int i10) {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setTempTypeForMetrics(i10);
        }
    }

    public void setWebViewLocalRequestId(String str) {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setLocalRequestId(str);
        }
    }

    public void setWebViewRid(String str) {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setRid(str);
        }
    }

    public void setWebviewClickable(boolean z10) {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setClickable(z10);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTWebViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void unload() throws JSONException {
        close();
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTWebViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void useCustomClose(boolean z10) {
        try {
            this.f18663t.setVisibility(z10 ? 4 : 0);
        } catch (Throwable th) {
            q0.b(BTBaseView.TAG, th.getMessage());
        }
    }

    public boolean webviewGoBack() {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView == null || !windVaneWebView.canGoBack()) {
            return false;
        }
        this.webView.goBack();
        return true;
    }

    public boolean webviewGoForward() {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView == null || !windVaneWebView.canGoForward()) {
            return false;
        }
        this.webView.goForward();
        return true;
    }

    public void webviewLoad(int i10) {
        if (this.jsCommon == null) {
            this.jsCommon = new k(null, this.f18538b, this.f18666w);
        }
        CampaignEx campaignEx = this.f18538b;
        if (campaignEx != null) {
            this.jsCommon.c(campaignEx);
        } else {
            List<CampaignEx> list = this.f18666w;
            if (list != null && list.size() > 0) {
                this.jsCommon.a(this.f18666w);
                if (this.f18666w.size() == 1) {
                    this.jsCommon.c(this.f18666w.get(0));
                }
            }
        }
        com.mbridge.msdk.videocommon.setting.c cVar = this.f18665v;
        if (cVar != null) {
            this.jsCommon.setRewardUnitSetting(cVar);
        }
        this.jsCommon.setUnitId(this.f18539c);
        this.jsCommon.c(this.f18540d);
        if (com.mbridge.msdk.util.b.a()) {
            setChinaAlertInstallState(this.jsCommon);
        }
        if (i10 == 1) {
            this.jsCommon.r();
        }
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setObject(this.jsCommon);
        }
        CampaignEx campaignEx2 = this.f18538b;
        if (campaignEx2 != null && campaignEx2.isMraid()) {
            this.f18663t.setVisibility(4);
        }
        preload();
    }

    public boolean webviewReload() {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView == null) {
            return false;
        }
        windVaneWebView.reload();
        return true;
    }

    public MBridgeBTWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18662s = false;
        this.f18664u = false;
    }

    public class a extends com.mbridge.msdk.mbsignalcommon.listener.a {
        public a() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a
        public void a(Object obj) {
            super.a(obj);
            try {
                k kVar = MBridgeBTWebView.this.jsCommon;
                String strEncodeToString = "";
                String strC = kVar != null ? kVar.c() : "";
                if (TextUtils.isEmpty(strC)) {
                    q0.a("RVWindVaneWebView", "getEndScreenInfo failed");
                } else {
                    strEncodeToString = Base64.encodeToString(strC.getBytes(), 2);
                    q0.a("RVWindVaneWebView", "getEndScreenInfo success");
                }
                f.a().b(obj, strEncodeToString);
            } catch (Throwable th) {
                q0.a("RVWindVaneWebView", th.getMessage());
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) throws JSONException {
            super.onPageFinished(webView, str);
            if (MBridgeBTWebView.this.f18667x != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", MBridgeBTWebView.this.f18540d);
                    jSONObject.put("code", BTBaseView.f18535n);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", MBridgeBTWebView.this.f18540d);
                    jSONObject2.put("result", 1);
                    jSONObject.put("data", jSONObject2);
                    f.a().a(MBridgeBTWebView.this.f18667x, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    com.mbridge.msdk.video.bt.component.d.c().a(MBridgeBTWebView.this.f18667x, e10.getMessage());
                    q0.a("RVWindVaneWebView", e10.getMessage());
                }
            }
            f.a().a(MBridgeBTWebView.this.webView);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) throws JSONException {
            super.onReceivedError(webView, i10, str, str2);
            if (MBridgeBTWebView.this.f18667x != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", MBridgeBTWebView.this.f18540d);
                    jSONObject.put("code", BTBaseView.f18535n);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", MBridgeBTWebView.this.f18540d);
                    jSONObject2.put("result", 2);
                    jSONObject2.put("error", str);
                    jSONObject.put("data", jSONObject2);
                    f.a().a(MBridgeBTWebView.this.f18667x, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    com.mbridge.msdk.video.bt.component.d.c().a(MBridgeBTWebView.this.f18667x, e10.getMessage());
                    q0.a("RVWindVaneWebView", e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) throws JSONException {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            if (MBridgeBTWebView.this.f18667x != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", MBridgeBTWebView.this.f18540d);
                    jSONObject.put("code", BTBaseView.f18535n);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", MBridgeBTWebView.this.f18540d);
                    jSONObject2.put("result", 2);
                    jSONObject2.put("error", sslError.toString());
                    jSONObject.put("data", jSONObject2);
                    f.a().a(MBridgeBTWebView.this.f18667x, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    com.mbridge.msdk.video.bt.component.d.c().a(MBridgeBTWebView.this.f18667x, e10.getMessage());
                    q0.a("RVWindVaneWebView", e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            super.a(webView, i10);
        }
    }
}
