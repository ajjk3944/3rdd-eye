package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* loaded from: classes3.dex */
public class WindVaneWebView extends BaseWebView {

    /* renamed from: d, reason: collision with root package name */
    protected j f16228d;

    /* renamed from: e, reason: collision with root package name */
    protected b f16229e;

    /* renamed from: f, reason: collision with root package name */
    protected e f16230f;

    /* renamed from: g, reason: collision with root package name */
    private Object f16231g;

    /* renamed from: h, reason: collision with root package name */
    private Object f16232h;

    /* renamed from: i, reason: collision with root package name */
    private String f16233i;

    /* renamed from: j, reason: collision with root package name */
    private c f16234j;

    /* renamed from: k, reason: collision with root package name */
    private String f16235k;

    /* renamed from: l, reason: collision with root package name */
    private String f16236l;

    /* renamed from: m, reason: collision with root package name */
    private CampaignEx f16237m;

    /* renamed from: n, reason: collision with root package name */
    private int f16238n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f16239o;

    /* renamed from: p, reason: collision with root package name */
    private float f16240p;

    /* renamed from: q, reason: collision with root package name */
    private float f16241q;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WindVaneWebView.this.f16239o = true;
            WindVaneWebView.this.destroy();
        }
    }

    public WindVaneWebView(Context context) {
        super(context);
        this.f16239o = false;
        this.f16240p = 0.0f;
        this.f16241q = 0.0f;
    }

    public void clearWebView() {
        if (this.f16239o) {
            return;
        }
        loadUrl(AndroidWebViewClient.BLANK_PAGE);
    }

    public CampaignEx getCampaignEx() {
        return this.f16237m;
    }

    public String getCampaignId() {
        return this.f16233i;
    }

    public Object getJsObject(String str) {
        e eVar = this.f16230f;
        if (eVar == null) {
            return null;
        }
        return eVar.a(str);
    }

    public String getLocalRequestId() {
        return this.f16236l;
    }

    public Object getMraidObject() {
        return this.f16232h;
    }

    public Object getObject() {
        return this.f16231g;
    }

    public String getRid() {
        return this.f16235k;
    }

    public b getSignalCommunication() {
        return this.f16229e;
    }

    public c getWebViewListener() {
        return this.f16234j;
    }

    public boolean isDestoryed() {
        return this.f16239o;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.mbridge.msdk.mbsignalcommon.base.b bVar = this.mWebViewClient;
        if (bVar != null && (bVar.a() instanceof IntentFilter)) {
            String url = getUrl();
            if (!TextUtils.isEmpty(url) && url.contains("https://play.google.com")) {
                if (motionEvent.getAction() == 0) {
                    this.f16240p = motionEvent.getRawX();
                    this.f16241q = motionEvent.getRawY();
                } else {
                    float rawX = motionEvent.getRawX() - this.f16240p;
                    float y10 = motionEvent.getY() - this.f16241q;
                    if ((rawX >= 0.0f || rawX * (-1.0f) <= 48) && ((rawX <= 0.0f || rawX <= 48) && ((y10 >= 0.0f || (-1.0f) * y10 <= 48) && (y10 <= 0.0f || y10 <= 48)))) {
                        setClickable(false);
                        return true;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void registerWindVanePlugin(Class cls) {
        e eVar = this.f16230f;
        if (eVar == null) {
            return;
        }
        eVar.a(cls.getSimpleName(), cls);
    }

    public void release() {
        try {
            if (!this.f16239o) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a(HandleInvocationsFromAdViewer.KEY_AD_TYPE, Integer.valueOf(this.f16238n));
                if (this.f16237m != null) {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000135", this.f16237m, eVar);
                }
            }
        } catch (Exception unused) {
        }
        try {
            setVisibility(8);
            removeAllViews();
            setDownloadListener(null);
            this.f16231g = null;
            if (v0.b(getContext()) == 0) {
                this.f16239o = true;
                destroy();
            } else {
                new Handler().postDelayed(new a(), r0 * 1000);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setApiManagerContext(Context context) {
        e eVar = this.f16230f;
        if (eVar != null) {
            eVar.a(context);
        }
    }

    public void setApiManagerJSFactory(Object obj) {
        e eVar = this.f16230f;
        if (eVar != null) {
            eVar.a(obj);
        }
    }

    public void setCampaignEx(CampaignEx campaignEx) {
        this.f16237m = campaignEx;
    }

    public void setCampaignId(String str) {
        this.f16233i = str;
    }

    public void setLocalRequestId(String str) {
        this.f16236l = str;
    }

    public void setMraidObject(Object obj) {
        this.f16232h = obj;
    }

    public void setObject(Object obj) {
        this.f16231g = obj;
    }

    public void setRid(String str) {
        this.f16235k = str;
    }

    public void setSignalCommunication(b bVar) {
        this.f16229e = bVar;
        bVar.a(this);
    }

    public void setTempTypeForMetrics(int i10) {
        this.f16238n = i10;
    }

    public void setWebViewChromeClient(j jVar) {
        this.f16228d = jVar;
        setWebChromeClient(jVar);
    }

    public void setWebViewListener(c cVar) {
        this.f16234j = cVar;
        j jVar = this.f16228d;
        if (jVar != null) {
            jVar.a(cVar);
        }
        com.mbridge.msdk.mbsignalcommon.base.b bVar = this.mWebViewClient;
        if (bVar != null) {
            bVar.a(cVar);
        }
    }

    public void setWebViewTransparent() {
        super.setTransparent();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.BaseWebView
    public void a() {
        super.a();
        getSettings().setSavePassword(false);
        getSettings().setUserAgentString(getSettings().getUserAgentString() + " WindVane/3.0.2");
        if (this.f16228d == null) {
            this.f16228d = new j(this);
        }
        setWebViewChromeClient(this.f16228d);
        k kVar = new k();
        this.mWebViewClient = kVar;
        setWebViewClient(kVar);
        if (this.f16229e == null) {
            b hVar = new h(this.f16128a);
            this.f16229e = hVar;
            setSignalCommunication(hVar);
        }
        this.f16230f = new e(this.f16128a, this);
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16239o = false;
        this.f16240p = 0.0f;
        this.f16241q = 0.0f;
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16239o = false;
        this.f16240p = 0.0f;
        this.f16241q = 0.0f;
    }
}
