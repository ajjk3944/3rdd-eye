package com.vungle.ads.internal.ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import androidx.annotation.VisibleForTesting;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.vungle.ads.internal.presenter.WebViewManager;
import com.vungle.ads.internal.ui.view.MRAIDAdWidget;
import com.vungle.ads.internal.util.j;
import com.vungle.ads.internal.util.x;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q7.a;
import y8.s;

/* loaded from: classes3.dex */
public final class MRAIDAdWidget extends RelativeLayout {

    @NotNull
    public static final b Companion = new b(null);

    @NotNull
    private static final String TAG = "MRAIDAdWidget";

    @Nullable
    private a closeDelegate;

    @Nullable
    private final String eventId;

    @Nullable
    private d onViewTouchListener;

    @Nullable
    private e orientationDelegate;

    @Nullable
    private WebView webView;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0005\b\u0086\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget$AdStopReason;", "", "<init>", "()V", "Companion", "a", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface AdStopReason {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int IS_AD_FINISHED_BY_API = 4;
        public static final int IS_AD_FINISHING = 2;
        public static final int IS_CHANGING_CONFIGURATION = 1;

        /* renamed from: com.vungle.ads.internal.ui.view.MRAIDAdWidget$AdStopReason$a, reason: from kotlin metadata */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int IS_AD_FINISHED_BY_API = 4;
            public static final int IS_AD_FINISHING = 2;
            public static final int IS_CHANGING_CONFIGURATION = 1;

            private Companion() {
            }
        }
    }

    public interface a {
        void close();
    }

    public static final class b {
        public /* synthetic */ b(i iVar) {
            this();
        }

        private b() {
        }
    }

    public static final class c implements Runnable {
        private final boolean isMaliBuggy;

        @NotNull
        private final MRAIDAdWidget widget;

        public c(@NotNull MRAIDAdWidget widget, boolean z10) {
            p.e(widget, "widget");
            this.widget = widget;
            this.isMaliBuggy = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: run$lambda-0, reason: not valid java name */
        public static final void m373run$lambda0(c this$0) {
            p.e(this$0, "this$0");
            this$0.run();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: run$lambda-10, reason: not valid java name */
        public static final void m374run$lambda10(WebView wv, c this$0) {
            p.e(wv, "$wv");
            p.e(this$0, "this$0");
            try {
                wv.destroy();
                String eventId = this$0.widget.getEventId();
                if (eventId != null) {
                    WebViewManager.INSTANCE.destroyWebView(eventId);
                }
                this$0.widget.webView = null;
            } catch (Throwable th) {
                com.vungle.ads.internal.util.p.Companion.e(MRAIDAdWidget.TAG, "Destroy webview " + th.getMessage());
            }
        }

        public final boolean isMaliBuggy() {
            return this.isMaliBuggy;
        }

        @Override // java.lang.Runnable
        public void run() {
            final WebView webView = this.widget.webView;
            if (webView == null) {
                return;
            }
            if (!p.a(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.vungle.ads.internal.ui.view.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        MRAIDAdWidget.c.m373run$lambda0(this.f20234a);
                    }
                });
                return;
            }
            try {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    webView.onPause();
                    Result.b(s.f25199a);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.b(kotlin.c.a(th));
                }
                try {
                    webView.stopLoading();
                    Result.b(s.f25199a);
                } catch (Throwable th2) {
                    Result.Companion companion3 = Result.INSTANCE;
                    Result.b(kotlin.c.a(th2));
                }
                try {
                    webView.setWebChromeClient(null);
                    Result.b(s.f25199a);
                } catch (Throwable th3) {
                    Result.Companion companion4 = Result.INSTANCE;
                    Result.b(kotlin.c.a(th3));
                }
                try {
                    webView.setWebViewClient(new WebViewClient());
                    Result.b(s.f25199a);
                } catch (Throwable th4) {
                    Result.Companion companion5 = Result.INSTANCE;
                    Result.b(kotlin.c.a(th4));
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    try {
                        webView.setWebViewRenderProcessClient(null);
                        Result.b(s.f25199a);
                    } catch (Throwable th5) {
                        Result.Companion companion6 = Result.INSTANCE;
                        Result.b(kotlin.c.a(th5));
                    }
                }
                webView.setVisibility(8);
                if (this.isMaliBuggy) {
                    webView.setLayerType(1, null);
                }
                try {
                    webView.loadUrl(AndroidWebViewClient.BLANK_PAGE);
                    Result.b(s.f25199a);
                } catch (Throwable th6) {
                    Result.Companion companion7 = Result.INSTANCE;
                    Result.b(kotlin.c.a(th6));
                }
                try {
                    webView.clearHistory();
                    Result.b(s.f25199a);
                } catch (Throwable th7) {
                    Result.Companion companion8 = Result.INSTANCE;
                    Result.b(kotlin.c.a(th7));
                }
                try {
                    webView.removeAllViews();
                    Result.b(s.f25199a);
                } catch (Throwable th8) {
                    Result.Companion companion9 = Result.INSTANCE;
                    Result.b(kotlin.c.a(th8));
                }
                new j().schedule(new Runnable() { // from class: com.vungle.ads.internal.ui.view.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        MRAIDAdWidget.c.m374run$lambda10(webView, this);
                    }
                }, this.isMaliBuggy ? 300L : 100L);
            } catch (Throwable th9) {
                com.vungle.ads.internal.util.p.Companion.e(MRAIDAdWidget.TAG, "Destroy webview: " + th9.getMessage());
            }
        }
    }

    public interface d {
        boolean onTouch(@Nullable MotionEvent motionEvent);
    }

    public interface e {
        void setOrientation(int i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MRAIDAdWidget(@NotNull Context context) throws InstantiationException {
        this(context, null, 2, 0 == true ? 1 : 0);
        p.e(context, "context");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void bindListeners() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.vungle.ads.internal.ui.view.a
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return MRAIDAdWidget.m372bindListeners$lambda0(this.f20233a, view, motionEvent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindListeners$lambda-0, reason: not valid java name */
    public static final boolean m372bindListeners$lambda0(MRAIDAdWidget this$0, View view, MotionEvent motionEvent) {
        p.e(this$0, "this$0");
        d dVar = this$0.onViewTouchListener;
        if (dVar != null) {
            return dVar.onTouch(motionEvent);
        }
        return false;
    }

    public static /* synthetic */ void destroyWebView$default(MRAIDAdWidget mRAIDAdWidget, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        mRAIDAdWidget.destroyWebView(j10, z10);
    }

    @VisibleForTesting
    public static /* synthetic */ void getCloseDelegate$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getOnViewTouchListener$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getOrientationDelegate$vungle_ads_release$annotations() {
    }

    private final void prepare() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.setLayerType(2, null);
            webView.setBackgroundColor(0);
            webView.setVisibility(8);
        }
    }

    public final void close() {
        a aVar = this.closeDelegate;
        if (aVar != null) {
            aVar.close();
        }
    }

    public final void destroyWebView(long j10, boolean z10) {
        try {
            Result.Companion companion = Result.INSTANCE;
            ViewParent parent = getParent();
            s sVar = null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this);
                sVar = s.f25199a;
            }
            Result.b(sVar);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.b(kotlin.c.a(th));
        }
        try {
            removeAllViews();
            Result.b(s.f25199a);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            Result.b(kotlin.c.a(th2));
        }
        if (j10 <= 0) {
            new c(this, z10).run();
        } else {
            new j().schedule(new c(this, z10), j10);
        }
    }

    @Nullable
    public final a getCloseDelegate$vungle_ads_release() {
        return this.closeDelegate;
    }

    @Nullable
    public final String getEventId() {
        return this.eventId;
    }

    @Nullable
    public final d getOnViewTouchListener$vungle_ads_release() {
        return this.onViewTouchListener;
    }

    @Nullable
    public final e getOrientationDelegate$vungle_ads_release() {
        return this.orientationDelegate;
    }

    @Nullable
    public final String getUrl() {
        WebView webView = this.webView;
        if (webView != null) {
            return webView.getUrl();
        }
        return null;
    }

    public final void linkWebView(@NotNull WebViewClient vngWebViewClient, @Nullable a.k kVar) {
        p.e(vngWebViewClient, "vngWebViewClient");
        WebView webView = this.webView;
        if (webView != null) {
            com.vungle.ads.internal.platform.e.INSTANCE.applyWebSettings(webView, kVar);
            webView.setWebViewClient(vngWebViewClient);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        ViewGroup.LayoutParams layoutParams;
        super.onAttachedToWindow();
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = -1;
            layoutParams2.width = -1;
        }
        WebView webView = this.webView;
        if (webView == null || (layoutParams = webView.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = -1;
        layoutParams.width = -1;
    }

    public final void pauseWeb() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.onPause();
        }
    }

    public final void resumeWeb() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.setVisibility(0);
        }
        WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.onResume();
        }
    }

    public final void setCloseDelegate(@NotNull a closeDelegate) {
        p.e(closeDelegate, "closeDelegate");
        this.closeDelegate = closeDelegate;
    }

    public final void setCloseDelegate$vungle_ads_release(@Nullable a aVar) {
        this.closeDelegate = aVar;
    }

    public final void setOnViewTouchListener(@Nullable d dVar) {
        this.onViewTouchListener = dVar;
    }

    public final void setOnViewTouchListener$vungle_ads_release(@Nullable d dVar) {
        this.onViewTouchListener = dVar;
    }

    public final void setOrientation(int i10) {
        e eVar = this.orientationDelegate;
        if (eVar != null) {
            eVar.setOrientation(i10);
        }
    }

    public final void setOrientationDelegate(@Nullable e eVar) {
        this.orientationDelegate = eVar;
    }

    public final void setOrientationDelegate$vungle_ads_release(@Nullable e eVar) {
        this.orientationDelegate = eVar;
    }

    public final void showWebsite(@NotNull String url) {
        p.e(url, "url");
        com.vungle.ads.internal.util.p.Companion.d(TAG, "loadUrl: " + url);
        WebView webView = this.webView;
        if (webView != null) {
            webView.loadUrl(url);
        }
    }

    public /* synthetic */ MRAIDAdWidget(Context context, String str, int i10, i iVar) throws InstantiationException {
        this(context, (i10 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MRAIDAdWidget(@NotNull Context context, @Nullable String str) throws InstantiationException {
        super(context);
        p.e(context, "context");
        this.eventId = str;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(layoutParams);
        WebView webView = x.INSTANCE.getWebView(context, str);
        this.webView = webView;
        if (webView != null) {
            webView.setLayoutParams(layoutParams);
        }
        WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.setTag("VungleWebView");
        }
        addView(this.webView, layoutParams);
        bindListeners();
        prepare();
    }
}
