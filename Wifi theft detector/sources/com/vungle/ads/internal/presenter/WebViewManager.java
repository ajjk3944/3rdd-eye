package com.vungle.ads.internal.presenter;

import android.content.Context;
import android.webkit.WebView;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.presenter.WebViewManager;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.ui.VungleWebClient;
import com.vungle.ads.internal.util.p;
import com.vungle.ads.internal.util.v;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q7.a;
import y8.s;

/* loaded from: classes3.dex */
public final class WebViewManager {

    @NotNull
    private static final String TAG = "WebViewManager";

    @NotNull
    public static final WebViewManager INSTANCE = new WebViewManager();

    @NotNull
    private static final ReentrantLock lock = new ReentrantLock();

    @NotNull
    private static final LinkedHashMap<String, a> webViewCache = new LinkedHashMap<>();

    public static final class a {

        @NotNull
        private final WebView webView;

        @NotNull
        private final VungleWebClient webViewClient;

        public a(@NotNull WebView webView, @NotNull VungleWebClient webViewClient) {
            p.e(webView, "webView");
            p.e(webViewClient, "webViewClient");
            this.webView = webView;
            this.webViewClient = webViewClient;
        }

        public static /* synthetic */ a copy$default(a aVar, WebView webView, VungleWebClient vungleWebClient, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                webView = aVar.webView;
            }
            if ((i10 & 2) != 0) {
                vungleWebClient = aVar.webViewClient;
            }
            return aVar.copy(webView, vungleWebClient);
        }

        @NotNull
        public final WebView component1() {
            return this.webView;
        }

        @NotNull
        public final VungleWebClient component2() {
            return this.webViewClient;
        }

        @NotNull
        public final a copy(@NotNull WebView webView, @NotNull VungleWebClient webViewClient) {
            p.e(webView, "webView");
            p.e(webViewClient, "webViewClient");
            return new a(webView, webViewClient);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p.a(this.webView, aVar.webView) && p.a(this.webViewClient, aVar.webViewClient);
        }

        @NotNull
        public final WebView getWebView() {
            return this.webView;
        }

        @NotNull
        public final VungleWebClient getWebViewClient() {
            return this.webViewClient;
        }

        public int hashCode() {
            return (this.webView.hashCode() * 31) + this.webViewClient.hashCode();
        }

        @NotNull
        public String toString() {
            return "WebViewEntry(webView=" + this.webView + ", webViewClient=" + this.webViewClient + ')';
        }
    }

    private WebViewManager() {
    }

    private final void destroyWebViewInternal(String str) {
        webViewCache.remove(str);
    }

    public final void destroyWebView(@NotNull String key) {
        p.e(key, "key");
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            INSTANCE.destroyWebViewInternal(key);
            s sVar = s.f25199a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @NotNull
    public final WebView getOrCreateWebView(@NotNull Context context, @Nullable String str) {
        WebView webView;
        p.e(context, "context");
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            LinkedHashMap<String, a> linkedHashMap = webViewCache;
            a aVar = linkedHashMap.get(str);
            if (aVar != null) {
                com.vungle.ads.internal.util.p.Companion.d(TAG, "Reusing cached webview. Cache size: " + linkedHashMap.size());
                webView = aVar.getWebView();
            } else {
                com.vungle.ads.internal.util.p.Companion.d(TAG, "Creating new webview. Cache size: " + linkedHashMap.size());
                webView = new WebView(context);
            }
            reentrantLock.unlock();
            return webView;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @NotNull
    public final VungleWebClient getOrCreateWebViewClient(@NotNull q7.a advertisement, @NotNull q7.h placement, @NotNull VungleThreadPoolExecutor offloadExecutor, @NotNull com.vungle.ads.internal.platform.d platform) {
        p.e(advertisement, "advertisement");
        p.e(placement, "placement");
        p.e(offloadExecutor, "offloadExecutor");
        p.e(platform, "platform");
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            a aVar = webViewCache.get(advertisement.eventId());
            VungleWebClient webViewClient = aVar != null ? aVar.getWebViewClient() : null;
            if (webViewClient == null) {
                webViewClient = new VungleWebClient(advertisement, placement, offloadExecutor, platform, null, null, 48, null);
            }
            reentrantLock.unlock();
            return webViewClient;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void preloadWebView$vungle_ads_release(@NotNull final Context context, @NotNull final q7.a adv, @NotNull final q7.h placement, @NotNull final String templatePath, @Nullable final a.k kVar, @NotNull final k delegate, @Nullable final Long l10) {
        p.e(context, "context");
        p.e(adv, "adv");
        p.e(placement, "placement");
        p.e(templatePath, "templatePath");
        p.e(delegate, "delegate");
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            p.a aVar = com.vungle.ads.internal.util.p.Companion;
            StringBuilder sb = new StringBuilder();
            sb.append("Preload webview start. Cache size: ");
            LinkedHashMap<String, a> linkedHashMap = webViewCache;
            sb.append(linkedHashMap.size());
            aVar.d(TAG, sb.toString());
            final String strEventId = adv.eventId();
            if (!linkedHashMap.containsKey(strEventId)) {
                v.INSTANCE.runOnUiThread(new l9.a() { // from class: com.vungle.ads.internal.presenter.WebViewManager$preloadWebView$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke$lambda-3$lambda-1, reason: not valid java name */
                    private static final com.vungle.ads.internal.executor.a m344invoke$lambda3$lambda1(y8.h hVar) {
                        return (com.vungle.ads.internal.executor.a) hVar.getValue();
                    }

                    /* renamed from: invoke$lambda-3$lambda-2, reason: not valid java name */
                    private static final com.vungle.ads.internal.platform.d m345invoke$lambda3$lambda2(y8.h hVar) {
                        return (com.vungle.ads.internal.platform.d) hVar.getValue();
                    }

                    @Override // l9.a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m346invoke();
                        return s.f25199a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m346invoke() {
                        Object objB;
                        WebViewManager webViewManager = WebViewManager.INSTANCE;
                        final Context context2 = context;
                        q7.a aVar2 = adv;
                        q7.h hVar = placement;
                        k kVar2 = delegate;
                        Long l11 = l10;
                        String str = templatePath;
                        String str2 = strEventId;
                        a.k kVar3 = kVar;
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            WebView webView = new WebView(context2.getApplicationContext());
                            com.vungle.ads.internal.platform.e.INSTANCE.applyWebSettings(webView, kVar3);
                            ServiceLocator.Companion companion2 = ServiceLocator.Companion;
                            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f21907a;
                            VungleWebClient vungleWebClient = new VungleWebClient(aVar2, hVar, m344invoke$lambda3$lambda1(kotlin.b.a(lazyThreadSafetyMode, new l9.a() { // from class: com.vungle.ads.internal.presenter.WebViewManager$preloadWebView$1$1$invoke$lambda-3$$inlined$inject$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.a, java.lang.Object] */
                                @Override // l9.a
                                @NotNull
                                public final com.vungle.ads.internal.executor.a invoke() {
                                    return ServiceLocator.Companion.getInstance(context2).getService(com.vungle.ads.internal.executor.a.class);
                                }
                            })).getOffloadExecutor(), m345invoke$lambda3$lambda2(kotlin.b.a(lazyThreadSafetyMode, new l9.a() { // from class: com.vungle.ads.internal.presenter.WebViewManager$preloadWebView$1$1$invoke$lambda-3$$inlined$inject$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.platform.d, java.lang.Object] */
                                @Override // l9.a
                                @NotNull
                                public final com.vungle.ads.internal.platform.d invoke() {
                                    return ServiceLocator.Companion.getInstance(context2).getService(com.vungle.ads.internal.platform.d.class);
                                }
                            })), kVar2, l11);
                            ConfigManager configManager = ConfigManager.INSTANCE;
                            vungleWebClient.setConsentStatus(configManager.getGDPRIsCountryDataProtected() && kotlin.jvm.internal.p.a("unknown", PrivacyManager.INSTANCE.getConsentStatus()), configManager.getGDPRConsentTitle(), configManager.getGDPRConsentMessage(), configManager.getGDPRButtonAccept(), configManager.getGDPRButtonDeny());
                            webView.setWebViewClient(vungleWebClient);
                            webView.loadUrl(str);
                            WebViewManager.webViewCache.put(String.valueOf(str2), new WebViewManager.a(webView, vungleWebClient));
                            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, Sdk$SDKMetric.SDKMetricType.CONCURRENT_CACHED_WEBVIEW_COUNT, WebViewManager.webViewCache.size(), aVar2.getLogEntry$vungle_ads_release(), null, 8, null);
                            objB = Result.b(Integer.valueOf(com.vungle.ads.internal.util.p.Companion.d("WebViewManager", "Preload complete. Cache size: " + WebViewManager.webViewCache.size())));
                        } catch (Throwable th) {
                            Result.Companion companion3 = Result.INSTANCE;
                            objB = Result.b(kotlin.c.a(th));
                        }
                        k kVar4 = delegate;
                        Throwable thE = Result.e(objB);
                        if (thE != null) {
                            com.vungle.ads.internal.util.p.Companion.e("WebViewManager", "Preload webview failed", thE);
                            kVar4.onAdReadyToPlay();
                        }
                    }
                });
            }
            s sVar = s.f25199a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
