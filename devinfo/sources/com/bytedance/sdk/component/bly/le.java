package com.bytedance.sdk.component.bly;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.DownloadListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.bytedance.sdk.component.bly.ouw;
import com.bytedance.sdk.component.utils.ex;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.od;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class le extends FrameLayout {
    private static yu jvy;
    public int bly;
    private AttributeSet bs;

    /* renamed from: cd, reason: collision with root package name */
    private float f7421cd;

    /* renamed from: cf, reason: collision with root package name */
    private String f7422cf;
    private boolean ex;
    private AtomicBoolean ey;
    private Context fak;
    public boolean fkw;
    private long fqk;
    private ex fvf;
    private long hun;
    private float jae;

    /* renamed from: jg, reason: collision with root package name */
    private float f7423jg;
    private com.bytedance.sdk.component.bly.yu jqy;
    private float ko;
    private lh ksc;

    /* renamed from: le, reason: collision with root package name */
    public boolean f7424le;

    /* renamed from: lh, reason: collision with root package name */
    public boolean f7425lh;
    private boolean mwh;

    /* renamed from: od, reason: collision with root package name */
    private float f7426od;
    private AtomicBoolean osn;
    public volatile WebView ouw;

    /* renamed from: pd, reason: collision with root package name */
    private vt f7427pd;
    public int pno;
    private ouw.InterfaceC0049ouw qbp;
    public int ra;
    private long rn;
    private fkw rrs;
    private JSONObject ryl;
    private WebViewClient tc;

    /* renamed from: th, reason: collision with root package name */
    private boolean f7428th;
    private com.bytedance.sdk.component.bly.vt.ouw tlj;
    private AtomicBoolean uoy;
    private int uq;
    private long vm;
    private List<String> vpp;
    public View vt;
    public boolean yu;
    private long zih;
    private com.bytedance.sdk.component.bly.ouw zin;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface fkw {
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum lh {
        ADS("ads"),
        ADS_V3("ads_v3"),
        ENDCARD("endcard"),
        USER_AGENT("ua"),
        PLAYABLE("playable"),
        DSP("dsp"),
        PRIVACY("privacy"),
        VAST_ENDCARD("vast_endcard"),
        EASY_PLAYABLE("easy_playable"),
        LANDING_PAGE("landing_page"),
        LANDING_PAGE_LOADING("lp_loading"),
        LANDING_PAGE_PRE_RENDER("lp_pre_render");

        public final String mwh;

        lh(String str) {
            this.mwh = str;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(final WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26) {
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            if (webView == null) {
                return true;
            }
            webView.post(new Runnable() { // from class: com.bytedance.sdk.component.bly.le.ouw.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        ViewGroup viewGroup = (ViewGroup) webView.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(webView);
                        }
                        webView.destroy();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            });
            return true;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface vt {
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface yu {
        WebView ouw(Context context, AttributeSet attributeSet, lh lhVar);
    }

    public le(Context context, lh lhVar) {
        this(ouw(context), false, lhVar);
    }

    private void cf() {
        if (this.ouw != null) {
            removeAllViews();
            setBackground(null);
            try {
                this.ouw.setId(520093704);
            } catch (Throwable unused) {
            }
            addView(this.ouw, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    private static void lh(Context context) {
    }

    private void mwh() {
        try {
            WebSettings settings = this.ouw.getSettings();
            if (settings != null) {
                settings.setSavePassword(false);
            }
        } catch (Throwable unused) {
        }
    }

    private static Context ouw(Context context) {
        return context;
    }

    private void ryl() {
        if (this.ouw == null) {
            return;
        }
        try {
            this.ouw.removeJavascriptInterface("searchBoxJavaBridge_");
            this.ouw.removeJavascriptInterface("accessibility");
            this.ouw.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable unused) {
        }
    }

    public static void setDataDirectorySuffix(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            WebView.setDataDirectorySuffix(str);
        }
    }

    public static void setWebViewProvider(yu yuVar) {
        jvy = yuVar;
    }

    private void vt(Context context) {
        lh(context);
        mwh();
        ryl();
    }

    public final void a_(String str) {
        try {
            setJavaScriptEnabled(str);
            this.ouw.loadUrl(str);
        } catch (Throwable unused) {
        }
    }

    public final void b_(String str) {
        try {
            this.ouw.removeJavascriptInterface(str);
        } catch (Throwable unused) {
        }
    }

    public void bly() {
        if (this.ouw == null) {
            return;
        }
        lh lhVar = this.ksc;
        if (lhVar != lh.ADS && lhVar != lh.ADS_V3) {
            od.ouw(this);
        } else {
            try {
                this.ouw.destroy();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.ouw == null) {
            return;
        }
        try {
            this.ouw.computeScroll();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean fkw() {
        if (this.ouw == null) {
            return false;
        }
        try {
            return this.ouw.canGoForward();
        } catch (Throwable unused) {
            return false;
        }
    }

    public View getArbitrageLoadingView() {
        return this.vt;
    }

    public int getContentHeight() {
        if (this.ouw == null) {
            return 0;
        }
        try {
            return this.ouw.getContentHeight();
        } catch (Throwable unused) {
            return 1;
        }
    }

    public long getLandingPageClickBegin() {
        return this.fqk;
    }

    public long getLandingPageClickEnd() {
        return this.hun;
    }

    public com.bytedance.sdk.component.bly.vt.ouw getMaterialMeta() {
        return this.tlj;
    }

    public String getOriginalUrl() {
        String url;
        if (this.ouw == null) {
            return null;
        }
        try {
            String originalUrl = this.ouw.getOriginalUrl();
            if (originalUrl != null && originalUrl.startsWith("data:text/html") && (url = this.ouw.getUrl()) != null) {
                if (url.startsWith("file://")) {
                    return url;
                }
            }
            return originalUrl;
        } catch (Throwable unused) {
            return null;
        }
    }

    public int getProgress() {
        if (this.ouw == null) {
            return 0;
        }
        try {
            return this.ouw.getProgress();
        } catch (Throwable unused) {
            return 100;
        }
    }

    public lh getScene() {
        return this.ksc;
    }

    public String getUrl() {
        if (this.ouw == null) {
            return null;
        }
        try {
            return this.ouw.getUrl();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getUserAgentString() {
        if (this.ouw == null) {
            return "";
        }
        try {
            return this.ouw.getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public WebView getWebView() {
        return this.ouw;
    }

    public WebViewClient getWebViewClient() {
        return this.tc;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public final void le() {
        if (this.ouw != null) {
            this.ouw.onResume();
        }
    }

    public final void o_() {
        try {
            if (this.ouw == null) {
                this.ouw = ouw(this.bs);
            }
            cf();
            vt(ouw(this.fak));
        } catch (Throwable th2) {
            ko.fkw("SSWebView.TAG", "initWebview: " + th2.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.uoy.set(true);
        if (!this.osn.get() || this.ey.get()) {
            return;
        }
        if (this.fvf == null) {
            this.ey.set(false);
            getContext();
            this.fvf = new ex((byte) 0);
        }
        new Object() { // from class: com.bytedance.sdk.component.bly.le.1
        };
        this.ey.set(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.uoy.set(false);
    }

    @Override // android.view.ViewGroup
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent viewParentOuw;
        try {
            if (this.mwh && this.tlj != null && ((this.f7422cf != null || this.ryl != null) && motionEvent != null)) {
                try {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        this.f7423jg = motionEvent.getRawX();
                        this.ko = motionEvent.getRawY();
                        this.rn = System.currentTimeMillis();
                        this.ryl = new JSONObject();
                        if (this.ouw != null) {
                            this.fqk = this.rn;
                        }
                    } else if (action == 1 || action == 3) {
                        this.ryl.put("start_x", String.valueOf(this.f7423jg));
                        this.ryl.put("start_y", String.valueOf(this.ko));
                        this.ryl.put("offset_x", String.valueOf(motionEvent.getRawX() - this.f7423jg));
                        this.ryl.put("offset_y", String.valueOf(motionEvent.getRawY() - this.ko));
                        this.ryl.put("url", String.valueOf(getUrl()));
                        this.ryl.put("tag", "");
                        this.zih = System.currentTimeMillis();
                        if (this.ouw != null) {
                            this.hun = this.zih;
                        }
                        this.ryl.put("down_time", this.rn);
                        this.ryl.put("up_time", this.zih);
                        if (com.bytedance.sdk.component.bly.ouw.ouw.ouw().ouw != null) {
                            long j = this.vm;
                            long j8 = this.rn;
                            if (j != j8) {
                                this.vm = j8;
                                com.bytedance.sdk.component.bly.ouw.ouw.ouw().ouw.ouw(this.tlj, this.f7422cf, "in_web_click", this.ryl, this.zih - this.rn);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
            boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            if ((motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 0) && this.f7428th && (viewParentOuw = ouw(this)) != null) {
                viewParentOuw.requestDisallowInterceptTouchEvent(true);
            }
            return zOnInterceptTouchEvent;
        } catch (Throwable unused) {
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public final void pno() {
        if (this.ouw == null) {
            return;
        }
        try {
            this.ouw.onPause();
        } catch (Throwable unused) {
        }
    }

    public final void ra() {
        try {
            this.ouw.clearHistory();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        try {
            this.ouw.removeAllViews();
        } catch (Throwable unused) {
        }
    }

    public void setAllowFileAccess(boolean z3) {
        try {
            this.ouw.getSettings().setAllowFileAccess(z3);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        try {
            super.setAlpha(f10);
            this.ouw.setAlpha(f10);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        try {
            this.ouw.setBackgroundColor(i4);
        } catch (Throwable unused) {
        }
    }

    public void setBuiltInZoomControls(boolean z3) {
        try {
            this.ouw.getSettings().setBuiltInZoomControls(z3);
        } catch (Throwable unused) {
        }
    }

    public void setCacheMode(int i4) {
        try {
            this.ouw.getSettings().setCacheMode(i4);
        } catch (Throwable unused) {
        }
    }

    public void setCalculationMethod(int i4) {
        this.uq = i4;
    }

    public void setDatabaseEnabled(boolean z3) {
        try {
            this.ouw.getSettings().setDatabaseEnabled(z3);
        } catch (Throwable unused) {
        }
    }

    public void setDeepShakeValue(float f10) {
        this.f7426od = f10;
    }

    public void setDefaultFontSize(int i4) {
        try {
            this.ouw.getSettings().setDefaultFontSize(i4);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultTextEncodingName(String str) {
        try {
            this.ouw.getSettings().setDefaultTextEncodingName(str);
        } catch (Throwable unused) {
        }
    }

    public void setDisplayZoomControls(boolean z3) {
        try {
            this.ouw.getSettings().setDisplayZoomControls(z3);
        } catch (Throwable unused) {
        }
    }

    public void setDomStorageEnabled(boolean z3) {
        try {
            this.ouw.getSettings().setDomStorageEnabled(z3);
        } catch (Throwable unused) {
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            this.ouw.setDownloadListener(downloadListener);
        } catch (Throwable unused) {
        }
    }

    public void setIsPreventTouchEvent(boolean z3) {
        this.f7428th = z3;
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean z3) {
        try {
            this.ouw.getSettings().setJavaScriptCanOpenWindowsAutomatically(z3);
        } catch (Throwable unused) {
        }
    }

    public void setJavaScriptEnabled(boolean z3) {
        try {
            this.ouw.getSettings().setJavaScriptEnabled(z3);
        } catch (Throwable unused) {
        }
    }

    public void setLandingPage(boolean z3) {
        this.mwh = z3;
    }

    public void setLandingPageClickBegin(long j) {
        this.fqk = j;
    }

    public void setLandingPageClickEnd(long j) {
        this.hun = j;
    }

    @Override // android.view.View
    public void setLayerType(int i4, Paint paint) {
        try {
            this.ouw.setLayerType(i4, paint);
        } catch (Throwable unused) {
        }
    }

    public void setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm) {
        try {
            this.ouw.getSettings().setLayoutAlgorithm(layoutAlgorithm);
        } catch (Throwable unused) {
        }
    }

    public void setLoadWithOverviewMode(boolean z3) {
        try {
            this.ouw.getSettings().setLoadWithOverviewMode(z3);
        } catch (Throwable unused) {
        }
    }

    public void setLpPreRender(boolean z3) {
        this.f7425lh = z3;
    }

    public void setMaterialMeta(com.bytedance.sdk.component.bly.vt.ouw ouwVar) {
        this.tlj = ouwVar;
    }

    public void setMixedContentMode(int i4) {
        try {
            this.ouw.getSettings().setMixedContentMode(i4);
        } catch (Throwable unused) {
        }
    }

    public void setNetworkAvailable(boolean z3) {
        try {
            this.ouw.setNetworkAvailable(z3);
        } catch (Throwable unused) {
        }
    }

    public void setOnShakeListener(vt vtVar) {
        this.f7427pd = vtVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i4) {
        try {
            this.ouw.setOverScrollMode(i4);
            super.setOverScrollMode(i4);
        } catch (Throwable unused) {
        }
    }

    public void setPreError(boolean z3) {
        this.ex = z3;
    }

    public void setPreFinish(boolean z3) {
        this.fkw = z3;
    }

    public void setPreProgressHundred(boolean z3) {
        this.f7424le = z3;
    }

    public void setPreStart(boolean z3) {
        this.yu = z3;
    }

    public void setRecycler(boolean z3) {
        if (this.ouw == null || !(this.ouw instanceof com.bytedance.sdk.component.bly.fkw)) {
            return;
        }
        ((com.bytedance.sdk.component.bly.fkw) this.ouw).setRecycler(z3);
    }

    public void setShakeValue(float f10) {
        this.jae = f10;
    }

    public void setSupportZoom(boolean z3) {
        try {
            this.ouw.getSettings().setSupportZoom(z3);
        } catch (Throwable unused) {
        }
    }

    public void setTag(String str) {
        this.f7422cf = str;
        com.bytedance.sdk.component.bly.ouw ouwVar = this.zin;
        if (ouwVar != null) {
            ouwVar.vt = str;
        }
        com.bytedance.sdk.component.bly.yu yuVar = this.jqy;
        if (yuVar != null) {
            yuVar.ouw = str;
        }
    }

    public void setTouchStateListener(fkw fkwVar) {
        this.rrs = fkwVar;
    }

    public void setUseWideViewPort(boolean z3) {
        try {
            this.ouw.getSettings().setUseWideViewPort(z3);
        } catch (Throwable unused) {
        }
    }

    public void setUserAgentString(String str) {
        try {
            this.ouw.getSettings().setUserAgentString(str);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        try {
            super.setVisibility(i4);
            this.ouw.setVisibility(i4);
        } catch (Throwable unused) {
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            this.ouw.setWebChromeClient(webChromeClient);
        } catch (Throwable unused) {
        }
    }

    public void setWebView(WebView webView) {
        this.ouw = webView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            if (webViewClient instanceof fkw) {
                setTouchStateListener((fkw) webViewClient);
            } else {
                setTouchStateListener(null);
            }
            if (webViewClient == 0) {
                webViewClient = new ouw();
            }
            this.tc = webViewClient;
            this.ouw.setWebViewClient(new ra(this.qbp, webViewClient, this.vpp));
        } catch (Throwable unused) {
        }
    }

    public void setWriggleValue(float f10) {
        this.f7421cd = f10;
    }

    public final void tlj() {
        try {
            this.ouw.clearView();
        } catch (Throwable unused) {
        }
    }

    public final void yu() {
        try {
            this.ouw.goBack();
        } catch (Throwable unused) {
        }
    }

    public le(Context context, boolean z3, lh lhVar) {
        super(ouw(context));
        this.f7423jg = 0.0f;
        this.ko = 0.0f;
        this.rn = 0L;
        this.zih = 0L;
        this.vm = 0L;
        this.f7428th = false;
        this.jae = 20.0f;
        this.f7421cd = 50.0f;
        this.uoy = new AtomicBoolean();
        this.osn = new AtomicBoolean();
        this.ey = new AtomicBoolean();
        this.fak = context;
        this.ksc = lhVar;
        if (z3) {
            return;
        }
        try {
            this.ouw = ouw((AttributeSet) null);
            cf();
        } catch (Throwable unused) {
        }
        vt(ouw(context));
    }

    private void setJavaScriptEnabled(String str) {
        WebSettings settings;
        try {
            if (!TextUtils.isEmpty(str) && (settings = this.ouw.getSettings()) != null) {
                if (Uri.parse(str).getScheme().equalsIgnoreCase("file")) {
                    settings.setJavaScriptEnabled(false);
                } else {
                    settings.setJavaScriptEnabled(true);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public String getTag() {
        return this.f7422cf;
    }

    public final boolean lh() {
        if (this.ouw == null) {
            return false;
        }
        try {
            return this.ouw.canGoBack();
        } catch (Throwable unused) {
            return false;
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void ouw(int i4, int i10, List<Integer> list, int i11, List<String> list2) {
        if (this.ouw == null || !(this.ouw instanceof com.bytedance.sdk.component.bly.fkw)) {
            return;
        }
        this.zin = new com.bytedance.sdk.component.bly.ouw(this.fak, i4, i10, list, i11);
        this.vpp = list2;
        if (!TextUtils.isEmpty(this.f7422cf)) {
            this.zin.vt = this.f7422cf;
        }
        ((com.bytedance.sdk.component.bly.fkw) this.ouw).setTouchListenerProxy(this.zin);
        this.qbp = this.zin.ouw;
    }

    private static boolean lh(View view) {
        try {
            Class<?> clsLoadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ScrollingView");
            if (clsLoadClass != null) {
                if (clsLoadClass.isInstance(view)) {
                    return true;
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        try {
            Class<?> clsLoadClass2 = view.getClass().getClassLoader().loadClass("androidx.core.view.ScrollingView");
            if (clsLoadClass2 != null) {
                return clsLoadClass2.isInstance(view);
            }
            return false;
        } catch (Throwable th3) {
            th3.printStackTrace();
            return false;
        }
    }

    public final void vt() {
        try {
            this.ouw.stopLoading();
        } catch (Throwable unused) {
        }
    }

    private static boolean vt(View view) {
        try {
            Class<?> clsLoadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ViewPager");
            if (clsLoadClass != null) {
                if (clsLoadClass.isInstance(view)) {
                    return true;
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        try {
            Class<?> clsLoadClass2 = view.getClass().getClassLoader().loadClass("androidx.viewpager.widget.ViewPager");
            if (clsLoadClass2 != null) {
                return clsLoadClass2.isInstance(view);
            }
            return false;
        } catch (Throwable th3) {
            th3.printStackTrace();
            return false;
        }
    }

    public final void ouw(int i4, long j) {
        if (this.ouw == null || !(this.ouw instanceof com.bytedance.sdk.component.bly.fkw)) {
            return;
        }
        this.jqy = new com.bytedance.sdk.component.bly.yu(this.fak, this.zin, i4, j, this);
        if (!TextUtils.isEmpty(this.f7422cf)) {
            this.jqy.ouw = this.f7422cf;
        }
        ((com.bytedance.sdk.component.bly.fkw) this.ouw).setTouchListenerProxy(this.jqy);
    }

    private WebView ouw(AttributeSet attributeSet) {
        yu yuVar = jvy;
        if (yuVar != null) {
            return yuVar.ouw(getContext(), attributeSet, this.ksc);
        }
        if (attributeSet == null) {
            return new WebView(ouw(this.fak));
        }
        return new WebView(ouw(this.fak), attributeSet);
    }

    @TargetApi(19)
    public final void ouw(String str, Map<String, String> map) {
        try {
            setJavaScriptEnabled(str);
            this.ouw.loadUrl(str, map);
        } catch (Throwable unused) {
        }
    }

    public final void ouw(String str, String str2, String str3, String str4, String str5) {
        try {
            setJavaScriptEnabled(str);
            this.ouw.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Throwable unused) {
        }
    }

    public final void ouw(boolean z3) {
        try {
            this.ouw.clearCache(z3);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static ViewParent ouw(View view) {
        ViewParent parent;
        while (true) {
            parent = view.getParent();
            if ((parent instanceof AbsListView) || (parent instanceof ScrollView) || (parent instanceof HorizontalScrollView) || !(parent instanceof View)) {
                break;
            }
            View view2 = (View) parent;
            if (vt(view2) || lh(view2)) {
                break;
            }
            view = view2;
        }
        return parent;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z3) {
    }
}
