package com.unity3d.ads.core.domain;

import android.webkit.WebSettings;
import android.webkit.WebView;
import c9.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.j0;
import l9.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/j0;", "Landroid/webkit/WebView;", "<anonymous>", "(Lkotlinx/coroutines/j0;)Landroid/webkit/WebView;"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$webview$1", f = "AndroidGetWebViewContainerUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class AndroidGetWebViewContainerUseCase$invoke$webview$1 extends SuspendLambda implements p {
    int label;
    final /* synthetic */ AndroidGetWebViewContainerUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidGetWebViewContainerUseCase$invoke$webview$1(AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase, c cVar) {
        super(2, cVar);
        this.this$0 = androidGetWebViewContainerUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c create(@Nullable Object obj, @NotNull c cVar) {
        return new AndroidGetWebViewContainerUseCase$invoke$webview$1(this.this$0, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        kotlin.coroutines.intrinsics.a.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(obj);
        WebView webView = new WebView(this.this$0.context);
        AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase = this.this$0;
        WebSettings settings = webView.getSettings();
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setBlockNetworkLoads(false);
        settings.setBuiltInZoomControls(false);
        settings.setCacheMode(-1);
        settings.setDatabaseEnabled(false);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(false);
        settings.setGeolocationEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setMixedContentMode(1);
        settings.setNeedInitialFocus(true);
        settings.setSupportMultipleWindows(false);
        settings.setSupportZoom(false);
        settings.setUseWideViewPort(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        webView.setWebViewClient(androidGetWebViewContainerUseCase.androidWebViewClient);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setInitialScale(0);
        webView.setBackgroundColor(0);
        webView.setBackgroundResource(0);
        return webView;
    }

    @Override // l9.p
    @Nullable
    public final Object invoke(@NotNull j0 j0Var, @Nullable c cVar) {
        return ((AndroidGetWebViewContainerUseCase$invoke$webview$1) create(j0Var, cVar)).invokeSuspend(s.f25199a);
    }
}
