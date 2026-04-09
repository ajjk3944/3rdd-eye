package com.vungle.ads.internal.ui.view;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface e {

    public interface a {
        boolean processCommand(@NotNull String str, @NotNull JsonObject jsonObject);
    }

    public interface b {
        void onReceivedError(@NotNull String str, boolean z10);

        void onRenderProcessUnresponsive(@Nullable WebView webView, @Nullable WebViewRenderProcess webViewRenderProcess);

        boolean onWebRenderingProcessGone(@Nullable WebView webView, @Nullable Boolean bool);
    }

    void notifyPropertiesChange(boolean z10);

    void setAdVisibility(boolean z10);

    void setConsentStatus(boolean z10, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4);

    void setErrorHandler(@NotNull b bVar);

    void setMraidDelegate(@Nullable a aVar);

    void setWebViewObserver(@Nullable s7.d dVar);
}
