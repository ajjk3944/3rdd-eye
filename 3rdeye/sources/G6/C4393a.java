package g6;

import K6.ViewOnTouchListenerC0710b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.vungle.ads.internal.util.k;
import com.vungle.ads.internal.util.s;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* compiled from: MRAIDAdWidget.kt */
/* renamed from: g6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4393a extends RelativeLayout {
    public static final b Companion = new b(null);
    private static final String TAG = "MRAIDAdWidget";
    private InterfaceC0460a closeDelegate;
    private d onViewTouchListener;
    private e orientationDelegate;
    private final WebView webView;

    /* compiled from: MRAIDAdWidget.kt */
    /* renamed from: g6.a$a, reason: collision with other inner class name */
    public interface InterfaceC0460a {
        void close();
    }

    /* compiled from: MRAIDAdWidget.kt */
    /* renamed from: g6.a$b */
    public static final class b {
        public /* synthetic */ b(g gVar) {
            this();
        }

        private b() {
        }
    }

    /* compiled from: MRAIDAdWidget.kt */
    /* renamed from: g6.a$c */
    public static final class c implements Runnable {
        private final WebView webView;

        public c(WebView webView) {
            l.f(webView, "webView");
            this.webView = webView;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.webView.stopLoading();
                if (Build.VERSION.SDK_INT >= 29) {
                    this.webView.setWebViewRenderProcessClient(null);
                }
                this.webView.loadData("", null, null);
                this.webView.destroy();
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: MRAIDAdWidget.kt */
    /* renamed from: g6.a$d */
    public interface d {
        boolean onTouch(MotionEvent motionEvent);
    }

    /* compiled from: MRAIDAdWidget.kt */
    /* renamed from: g6.a$e */
    public interface e {
        void setOrientation(int i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4393a(Context context) throws InstantiationException {
        super(context);
        l.f(context, "context");
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(layoutParams);
        WebView webView = s.INSTANCE.getWebView(context);
        this.webView = webView;
        webView.setLayoutParams(layoutParams);
        webView.setTag("VungleWebView");
        addView(webView, layoutParams);
        bindListeners();
        prepare();
    }

    private final void applyDefault(WebView webView) {
        WebSettings settings = webView.getSettings();
        l.e(settings, "webView.settings");
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSaveFormData(true);
        settings.setUseWideViewPort(false);
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        webView.setVisibility(4);
        settings.setMediaPlaybackRequiresUserGesture(false);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void bindListeners() {
        this.webView.setOnTouchListener(new ViewOnTouchListenerC0710b(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindListeners$lambda-0, reason: not valid java name */
    public static final boolean m139bindListeners$lambda0(C4393a this$0, View view, MotionEvent motionEvent) {
        l.f(this$0, "this$0");
        d dVar = this$0.onViewTouchListener;
        if (dVar != null) {
            return dVar.onTouch(motionEvent);
        }
        return false;
    }

    private final void prepare() {
        WebView webView = this.webView;
        webView.setLayerType(2, null);
        webView.setBackgroundColor(0);
        webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        webView.setVisibility(8);
    }

    public final void close() {
        InterfaceC0460a interfaceC0460a = this.closeDelegate;
        if (interfaceC0460a != null) {
            interfaceC0460a.close();
        }
    }

    public final void destroyWebView(long j4) {
        WebView webView = this.webView;
        webView.setWebChromeClient(null);
        removeAllViews();
        if (j4 <= 0) {
            new c(webView).run();
        } else {
            new com.vungle.ads.internal.util.g().schedule(new c(webView), j4);
        }
    }

    public final InterfaceC0460a getCloseDelegate$vungle_ads_release() {
        return this.closeDelegate;
    }

    public final d getOnViewTouchListener$vungle_ads_release() {
        return this.onViewTouchListener;
    }

    public final e getOrientationDelegate$vungle_ads_release() {
        return this.orientationDelegate;
    }

    public final String getUrl() {
        return this.webView.getUrl();
    }

    public final void linkWebView(WebViewClient vngWebViewClient) {
        l.f(vngWebViewClient, "vngWebViewClient");
        WebView webView = this.webView;
        applyDefault(webView);
        webView.setWebViewClient(vngWebViewClient);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
        ViewGroup.LayoutParams layoutParams2 = this.webView.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = -1;
            layoutParams2.width = -1;
        }
    }

    public final void pauseWeb() {
        this.webView.onPause();
    }

    public final void resumeWeb() {
        this.webView.onResume();
    }

    public final void setCloseDelegate(InterfaceC0460a closeDelegate) {
        l.f(closeDelegate, "closeDelegate");
        this.closeDelegate = closeDelegate;
    }

    public final void setCloseDelegate$vungle_ads_release(InterfaceC0460a interfaceC0460a) {
        this.closeDelegate = interfaceC0460a;
    }

    public final void setOnViewTouchListener(d dVar) {
        this.onViewTouchListener = dVar;
    }

    public final void setOnViewTouchListener$vungle_ads_release(d dVar) {
        this.onViewTouchListener = dVar;
    }

    public final void setOrientation(int i) {
        e eVar = this.orientationDelegate;
        if (eVar != null) {
            eVar.setOrientation(i);
        }
    }

    public final void setOrientationDelegate(e eVar) {
        this.orientationDelegate = eVar;
    }

    public final void setOrientationDelegate$vungle_ads_release(e eVar) {
        this.orientationDelegate = eVar;
    }

    public final void showWebsite(String url) {
        l.f(url, "url");
        k.Companion.d(TAG, "loadUrl: ".concat(url));
        WebView webView = this.webView;
        webView.setVisibility(0);
        webView.loadUrl(url);
    }

    public static /* synthetic */ void getCloseDelegate$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getOnViewTouchListener$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getOrientationDelegate$vungle_ads_release$annotations() {
    }
}
