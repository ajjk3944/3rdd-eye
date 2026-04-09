package com.bytedance.sdk.component.zz;

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
import com.bytedance.sdk.component.utils.dr;
import com.bytedance.sdk.component.utils.ee;
import com.bytedance.sdk.component.zz.emc;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ycc extends FrameLayout {
    private static dg ra;
    private com.bytedance.sdk.component.zz.emc aa;
    private String bw;
    private View cf;
    private ee cuf;
    private xq db;
    private com.bytedance.sdk.component.zz.ypw.emc dg;
    private float dr;
    private WebViewClient ee;
    public int emc;
    private long gbl;
    private boolean hxp;
    private AtomicBoolean iyl;
    private ypw lt;
    private Context mkp;
    private float msw;
    private AtomicBoolean mxo;
    private volatile WebView qh;
    private boolean rie;
    private AttributeSet rtt;
    private long ru;
    private float sb;
    private List<String> sba;
    private float sf;
    private boolean sra;
    private long sup;
    private boolean sz;
    private AtomicBoolean tp;
    private boolean ul;
    private boolean uym;
    private emc.InterfaceC0045emc vk;
    private bw vw;
    private long wo;
    private int xmt;
    public int xq;
    private long xxg;
    private JSONObject ycc;
    private boolean ylm;
    public int ypw;
    private com.bytedance.sdk.component.zz.dg yzg;
    private float zz;

    public interface bw {
    }

    public interface dg {
        WebView emc(Context context, AttributeSet attributeSet, int i, xq xqVar);
    }

    public static class emc extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(final WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26) {
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            if (webView == null) {
                return true;
            }
            webView.post(new Runnable() { // from class: com.bytedance.sdk.component.zz.ycc.emc.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ViewGroup viewGroup = (ViewGroup) webView.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(webView);
                        }
                        webView.destroy();
                    } catch (Exception unused) {
                    }
                }
            });
            return true;
        }
    }

    public enum xq {
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

        public final String sz;

        xq(String str) {
            this.sz = str;
        }
    }

    public interface ypw {
    }

    public ycc(Context context, xq xqVar) {
        this(emc(context), false, xqVar);
    }

    private static Context emc(Context context) {
        return context;
    }

    public static void setDataDirectorySuffix(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            WebView.setDataDirectorySuffix(str);
        }
    }

    public static void setWebViewProvider(dg dgVar) {
        ra = dgVar;
    }

    private void ul() {
        try {
            WebSettings settings = this.qh.getSettings();
            if (settings != null) {
                settings.setSavePassword(false);
            }
        } catch (Throwable unused) {
        }
    }

    private static void xq(Context context) {
    }

    private void ylm() {
        if (this.cuf == null) {
            this.tp.set(false);
            this.cuf = new ee(getContext());
        }
        new Object() { // from class: com.bytedance.sdk.component.zz.ycc.1
        };
        this.tp.set(true);
    }

    private void yzg() {
        if (this.qh == null) {
            return;
        }
        try {
            this.qh.removeJavascriptInterface("searchBoxJavaBridge_");
            this.qh.removeJavascriptInterface("accessibility");
            this.qh.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable unused) {
        }
    }

    public void a_(String str) {
        try {
            setJavaScriptEnabled(str);
            this.qh.loadUrl(str);
        } catch (Throwable unused) {
        }
    }

    public void aa() {
        try {
            this.qh.clearView();
        } catch (Throwable unused) {
        }
    }

    public void b_(String str) {
        try {
            this.qh.removeJavascriptInterface(str);
        } catch (Throwable unused) {
        }
    }

    public void bw() {
        try {
            if (this.qh == null) {
                this.qh = emc(this.rtt, 0);
            }
            ycc();
            ypw(emc(this.mkp));
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void cf() {
        if (this.qh == null) {
            return;
        }
        try {
            this.qh.onPause();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.qh == null) {
            return;
        }
        try {
            this.qh.computeScroll();
        } catch (Throwable unused) {
        }
    }

    public boolean dg() {
        return this.rie;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean gbl() {
        if (this.qh == null) {
            return false;
        }
        try {
            return this.qh.canGoForward();
        } catch (Throwable unused) {
            return false;
        }
    }

    public View getArbitrageLoadingView() {
        return this.cf;
    }

    public int getContentHeight() {
        if (this.qh == null) {
            return 0;
        }
        try {
            return this.qh.getContentHeight();
        } catch (Throwable unused) {
            return 1;
        }
    }

    public long getLandingPageClickBegin() {
        return this.wo;
    }

    public long getLandingPageClickEnd() {
        return this.xxg;
    }

    public com.bytedance.sdk.component.zz.ypw.emc getMaterialMeta() {
        return this.dg;
    }

    public String getOriginalUrl() {
        String url;
        if (this.qh == null) {
            return null;
        }
        try {
            String originalUrl = this.qh.getOriginalUrl();
            if (originalUrl != null && originalUrl.startsWith("data:text/html") && (url = this.qh.getUrl()) != null) {
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
        if (this.qh == null) {
            return 0;
        }
        try {
            return this.qh.getProgress();
        } catch (Throwable unused) {
            return 100;
        }
    }

    public xq getScene() {
        return this.db;
    }

    public String getUrl() {
        if (this.qh == null) {
            return null;
        }
        try {
            return this.qh.getUrl();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getUserAgentString() {
        if (this.qh == null) {
            return "";
        }
        try {
            return this.qh.getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public WebView getWebView() {
        return this.qh;
    }

    public WebViewClient getWebViewClient() {
        return this.ee;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public boolean k_() {
        return this.ul;
    }

    public void msw() {
        try {
            this.qh.reload();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.iyl.set(true);
        if (!this.mxo.get() || this.tp.get()) {
            return;
        }
        ylm();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.iyl.set(false);
    }

    @Override // android.view.ViewGroup
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent viewParentEmc;
        try {
            emc(motionEvent);
            boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            if ((motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 0) && this.sz && (viewParentEmc = emc(this)) != null) {
                viewParentEmc.requestDisallowInterceptTouchEvent(true);
            }
            return zOnInterceptTouchEvent;
        } catch (Throwable unused) {
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z6) {
    }

    public void qh() {
        try {
            this.qh.clearHistory();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        try {
            this.qh.removeAllViews();
        } catch (Throwable unused) {
        }
    }

    public void ru() {
        try {
            this.qh.goBack();
        } catch (Throwable unused) {
        }
    }

    public void sba() {
        try {
            this.qh.pauseTimers();
        } catch (Throwable unused) {
        }
    }

    public void setAllowFileAccess(boolean z6) {
        try {
            this.qh.getSettings().setAllowFileAccess(z6);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setAlpha(float f2) {
        try {
            super.setAlpha(f2);
            this.qh.setAlpha(f2);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        try {
            this.qh.setBackgroundColor(i);
        } catch (Throwable unused) {
        }
    }

    public void setBuiltInZoomControls(boolean z6) {
        try {
            this.qh.getSettings().setBuiltInZoomControls(z6);
        } catch (Throwable unused) {
        }
    }

    public void setCacheMode(int i) {
        try {
            this.qh.getSettings().setCacheMode(i);
        } catch (Throwable unused) {
        }
    }

    public void setCalculationMethod(int i) {
        this.xmt = i;
    }

    public void setDatabaseEnabled(boolean z6) {
        try {
            this.qh.getSettings().setDatabaseEnabled(z6);
        } catch (Throwable unused) {
        }
    }

    public void setDeepShakeValue(float f2) {
        this.sf = f2;
    }

    public void setDefaultFontSize(int i) {
        try {
            this.qh.getSettings().setDefaultFontSize(i);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultTextEncodingName(String str) {
        try {
            this.qh.getSettings().setDefaultTextEncodingName(str);
        } catch (Throwable unused) {
        }
    }

    public void setDisplayZoomControls(boolean z6) {
        try {
            this.qh.getSettings().setDisplayZoomControls(z6);
        } catch (Throwable unused) {
        }
    }

    public void setDomStorageEnabled(boolean z6) {
        try {
            this.qh.getSettings().setDomStorageEnabled(z6);
        } catch (Throwable unused) {
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            this.qh.setDownloadListener(downloadListener);
        } catch (Throwable unused) {
        }
    }

    public void setIsPreventTouchEvent(boolean z6) {
        this.sz = z6;
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean z6) {
        try {
            this.qh.getSettings().setJavaScriptCanOpenWindowsAutomatically(z6);
        } catch (Throwable unused) {
        }
    }

    public void setJavaScriptEnabled(boolean z6) {
        try {
            this.qh.getSettings().setJavaScriptEnabled(z6);
        } catch (Throwable unused) {
        }
    }

    public void setLandingPage(boolean z6) {
        this.uym = z6;
    }

    public void setLandingPageClickBegin(long j6) {
        this.wo = j6;
    }

    public void setLandingPageClickEnd(long j6) {
        this.xxg = j6;
    }

    @Override // android.view.View
    public void setLayerType(int i, Paint paint) {
        try {
            this.qh.setLayerType(i, paint);
        } catch (Throwable unused) {
        }
    }

    public void setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm) {
        try {
            this.qh.getSettings().setLayoutAlgorithm(layoutAlgorithm);
        } catch (Throwable unused) {
        }
    }

    public void setLoadWithOverviewMode(boolean z6) {
        try {
            this.qh.getSettings().setLoadWithOverviewMode(z6);
        } catch (Throwable unused) {
        }
    }

    public void setLpPreRender(boolean z6) {
        this.ul = z6;
    }

    public void setMaterialMeta(com.bytedance.sdk.component.zz.ypw.emc emcVar) {
        this.dg = emcVar;
    }

    public void setMixedContentMode(int i) {
        try {
            this.qh.getSettings().setMixedContentMode(i);
        } catch (Throwable unused) {
        }
    }

    public void setNetworkAvailable(boolean z6) {
        try {
            this.qh.setNetworkAvailable(z6);
        } catch (Throwable unused) {
        }
    }

    public void setOnShakeListener(ypw ypwVar) {
        this.lt = ypwVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        try {
            this.qh.setOverScrollMode(i);
            super.setOverScrollMode(i);
        } catch (Throwable unused) {
        }
    }

    public void setPreError(boolean z6) {
        this.hxp = z6;
    }

    public void setPreFinish(boolean z6) {
        this.sra = z6;
    }

    public void setPreProgressHundred(boolean z6) {
        this.rie = z6;
    }

    public void setPreStart(boolean z6) {
        this.ylm = z6;
    }

    public void setRecycler(boolean z6) {
        if (this.qh == null || !(this.qh instanceof com.bytedance.sdk.component.zz.bw)) {
            return;
        }
        ((com.bytedance.sdk.component.zz.bw) this.qh).setRecycler(z6);
    }

    public void setShakeValue(float f2) {
        this.sb = f2;
    }

    public void setSupportZoom(boolean z6) {
        try {
            this.qh.getSettings().setSupportZoom(z6);
        } catch (Throwable unused) {
        }
    }

    public void setTag(String str) {
        this.bw = str;
        com.bytedance.sdk.component.zz.emc emcVar = this.aa;
        if (emcVar != null) {
            emcVar.emc(str);
        }
        com.bytedance.sdk.component.zz.dg dgVar = this.yzg;
        if (dgVar != null) {
            dgVar.emc(str);
        }
    }

    public void setTouchStateListener(bw bwVar) {
        this.vw = bwVar;
    }

    public void setUseWideViewPort(boolean z6) {
        try {
            this.qh.getSettings().setUseWideViewPort(z6);
        } catch (Throwable unused) {
        }
    }

    public void setUserAgentString(String str) {
        try {
            this.qh.getSettings().setUserAgentString(str);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        try {
            super.setVisibility(i);
            this.qh.setVisibility(i);
        } catch (Throwable unused) {
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            this.qh.setWebChromeClient(webChromeClient);
        } catch (Throwable unused) {
        }
    }

    public void setWebView(WebView webView) {
        this.qh = webView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            if (webViewClient instanceof bw) {
                setTouchStateListener((bw) webViewClient);
            } else {
                setTouchStateListener(null);
            }
            if (webViewClient == 0) {
                webViewClient = new emc();
            }
            this.ee = webViewClient;
            this.qh.setWebViewClient(new uym(this.vk, webViewClient, this.sba));
        } catch (Throwable unused) {
        }
    }

    public void setWriggleValue(float f2) {
        this.dr = f2;
    }

    public void sup() {
        try {
            this.qh.goForward();
        } catch (Throwable unused) {
        }
    }

    public void sz() {
        if (this.qh != null) {
            this.qh.onResume();
        }
    }

    public void uym() {
        try {
            this.qh.stopLoading();
        } catch (Throwable unused) {
        }
    }

    public void vk() {
        if (this.qh == null) {
            return;
        }
        xq xqVar = this.db;
        if (xqVar != xq.ADS && xqVar != xq.ADS_V3) {
            dr.emc(this);
        } else {
            try {
                this.qh.destroy();
            } catch (Throwable unused) {
            }
        }
    }

    public void ycc() {
        if (this.qh != null) {
            removeAllViews();
            setBackground(null);
            try {
                this.qh.setId(520093704);
            } catch (Throwable unused) {
            }
            addView(this.qh, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public boolean ypw() {
        return this.ylm;
    }

    public boolean zz() {
        if (this.qh == null) {
            return false;
        }
        try {
            return this.qh.canGoBack();
        } catch (Throwable unused) {
            return false;
        }
    }

    public ycc(Context context, boolean z6, xq xqVar) {
        super(emc(context));
        this.msw = 0.0f;
        this.zz = 0.0f;
        this.ru = 0L;
        this.gbl = 0L;
        this.sup = 0L;
        this.sz = false;
        this.sb = 20.0f;
        this.dr = 50.0f;
        this.iyl = new AtomicBoolean();
        this.mxo = new AtomicBoolean();
        this.tp = new AtomicBoolean();
        this.mkp = context;
        this.db = xqVar;
        if (z6) {
            return;
        }
        try {
            this.qh = emc((AttributeSet) null, 0);
            ycc();
        } catch (Throwable unused) {
        }
        ypw(emc(context));
    }

    private void setJavaScriptEnabled(String str) {
        WebSettings settings;
        try {
            if (!TextUtils.isEmpty(str) && (settings = this.qh.getSettings()) != null) {
                if (Uri.parse(str).getScheme().equalsIgnoreCase("file")) {
                    settings.setJavaScriptEnabled(false);
                } else {
                    settings.setJavaScriptEnabled(true);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void ypw(Context context) {
        xq(context);
        ul();
        yzg();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void emc(boolean z6, int i, int i3, List<Integer> list, int i6, List<String> list2) {
        if (z6 && this.qh != null && (this.qh instanceof com.bytedance.sdk.component.zz.bw)) {
            this.aa = new com.bytedance.sdk.component.zz.emc(this.mkp, i, i3, list, i6);
            this.sba = list2;
            if (!TextUtils.isEmpty(this.bw)) {
                this.aa.emc(this.bw);
            }
            ((com.bytedance.sdk.component.zz.bw) this.qh).setTouchListenerProxy(this.aa);
            this.vk = this.aa.emc();
        }
    }

    @Override // android.view.View
    public String getTag() {
        return this.bw;
    }

    public boolean xq() {
        return this.sra;
    }

    private static boolean xq(View view) {
        try {
            Class<?> clsLoadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ScrollingView");
            if (clsLoadClass != null) {
                if (clsLoadClass.isInstance(view)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> clsLoadClass2 = view.getClass().getClassLoader().loadClass("androidx.core.view.ScrollingView");
            if (clsLoadClass2 != null) {
                return clsLoadClass2.isInstance(view);
            }
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }

    private static boolean ypw(View view) {
        try {
            Class<?> clsLoadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ViewPager");
            if (clsLoadClass != null) {
                if (clsLoadClass.isInstance(view)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> clsLoadClass2 = view.getClass().getClassLoader().loadClass("androidx.viewpager.widget.ViewPager");
            if (clsLoadClass2 != null) {
                return clsLoadClass2.isInstance(view);
            }
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }

    public void emc(int i, long j6) {
        if (this.qh == null || !(this.qh instanceof com.bytedance.sdk.component.zz.bw)) {
            return;
        }
        this.yzg = new com.bytedance.sdk.component.zz.dg(this.mkp, this.aa, i, j6, this);
        if (!TextUtils.isEmpty(this.bw)) {
            this.yzg.emc(this.bw);
        }
        ((com.bytedance.sdk.component.zz.bw) this.qh).setTouchListenerProxy(this.yzg);
    }

    public void emc(boolean z6, View view) {
        if (z6) {
            this.cf = view;
            view.setVisibility(8);
            View view2 = this.cf;
            if (view2 == null || view2.getParent() != null) {
                return;
            }
            addView(this.cf, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    private WebView emc(AttributeSet attributeSet, int i) {
        dg dgVar = ra;
        if (dgVar != null) {
            return dgVar.emc(getContext(), attributeSet, i, this.db);
        }
        if (attributeSet == null) {
            return new WebView(emc(this.mkp));
        }
        return new WebView(emc(this.mkp), attributeSet);
    }

    @TargetApi(19)
    public void emc(String str, Map<String, String> map) {
        try {
            setJavaScriptEnabled(str);
            this.qh.loadUrl(str, map);
        } catch (Throwable unused) {
        }
    }

    public void emc(String str, String str2, String str3, String str4, String str5) {
        try {
            setJavaScriptEnabled(str);
            this.qh.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Throwable unused) {
        }
    }

    public void emc(boolean z6) {
        try {
            this.qh.clearCache(z6);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewParent emc(View view) {
        ViewParent parent = view.getParent();
        if ((parent instanceof AbsListView) || (parent instanceof ScrollView) || (parent instanceof HorizontalScrollView) || !(parent instanceof View)) {
            return parent;
        }
        View view2 = (View) parent;
        return (ypw(view2) || xq(view2)) ? parent : emc(view2);
    }

    @SuppressLint({"JavascriptInterface"})
    public void emc(Object obj, String str) {
        try {
            this.qh.addJavascriptInterface(obj, str);
        } catch (Throwable unused) {
        }
    }

    private void emc(MotionEvent motionEvent) {
        if (!this.uym || this.dg == null) {
            return;
        }
        if ((this.bw == null && this.ycc == null) || motionEvent == null) {
            return;
        }
        try {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.msw = motionEvent.getRawX();
                this.zz = motionEvent.getRawY();
                this.ru = System.currentTimeMillis();
                this.ycc = new JSONObject();
                if (this.qh != null) {
                    this.wo = this.ru;
                    return;
                }
                return;
            }
            if (action == 1 || action == 3) {
                this.ycc.put("start_x", String.valueOf(this.msw));
                this.ycc.put("start_y", String.valueOf(this.zz));
                this.ycc.put("offset_x", String.valueOf(motionEvent.getRawX() - this.msw));
                this.ycc.put("offset_y", String.valueOf(motionEvent.getRawY() - this.zz));
                this.ycc.put("url", String.valueOf(getUrl()));
                this.ycc.put("tag", "");
                this.gbl = System.currentTimeMillis();
                if (this.qh != null) {
                    this.xxg = this.gbl;
                }
                this.ycc.put("down_time", this.ru);
                this.ycc.put("up_time", this.gbl);
                if (com.bytedance.sdk.component.zz.emc.emc.emc().ypw() != null) {
                    long j6 = this.sup;
                    long j7 = this.ru;
                    if (j6 != j7) {
                        this.sup = j7;
                        com.bytedance.sdk.component.zz.emc.emc.emc().ypw().emc(this.dg, this.bw, "in_web_click", this.ycc, this.gbl - this.ru);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
