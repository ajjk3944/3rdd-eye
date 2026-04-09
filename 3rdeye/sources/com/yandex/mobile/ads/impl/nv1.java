package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.List;

/* loaded from: classes3.dex */
public final class nv1 implements xw0 {

    /* renamed from: a, reason: collision with root package name */
    private final a8<?> f31024a;

    /* renamed from: b, reason: collision with root package name */
    private final bx0 f31025b;

    /* renamed from: c, reason: collision with root package name */
    private final yw0 f31026c;

    /* renamed from: d, reason: collision with root package name */
    private final ax0 f31027d;

    /* renamed from: e, reason: collision with root package name */
    private final zw0 f31028e;

    public nv1(vu1 sdkEnvironmentModule, a8<?> adResponse, bx0 mediaViewAdapterWithVideoCreator, yw0 mediaViewAdapterWithImageCreator, ax0 mediaViewAdapterWithMultiBannerCreator, zw0 mediaViewAdapterWithMediaCreator) {
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(mediaViewAdapterWithVideoCreator, "mediaViewAdapterWithVideoCreator");
        kotlin.jvm.internal.l.f(mediaViewAdapterWithImageCreator, "mediaViewAdapterWithImageCreator");
        kotlin.jvm.internal.l.f(mediaViewAdapterWithMultiBannerCreator, "mediaViewAdapterWithMultiBannerCreator");
        kotlin.jvm.internal.l.f(mediaViewAdapterWithMediaCreator, "mediaViewAdapterWithMediaCreator");
        this.f31024a = adResponse;
        this.f31025b = mediaViewAdapterWithVideoCreator;
        this.f31026c = mediaViewAdapterWithImageCreator;
        this.f31027d = mediaViewAdapterWithMultiBannerCreator;
        this.f31028e = mediaViewAdapterWithMediaCreator;
    }

    private final vw0 a(CustomizableMediaView customizableMediaView, C4072a3 c4072a3, ej0 ej0Var, cx0 cx0Var, nx1 nx1Var, sw0 sw0Var) {
        CustomizableMediaView customizableMediaView2;
        ej0 ej0Var2;
        cx0 cx0Var2;
        List<jj0> listA = sw0Var.a();
        if (listA == null || listA.isEmpty()) {
            return null;
        }
        if (listA.size() == 1) {
            return this.f31026c.a(customizableMediaView, ej0Var, cx0Var);
        }
        try {
            customizableMediaView2 = customizableMediaView;
            ej0Var2 = ej0Var;
            cx0Var2 = cx0Var;
            try {
                return this.f31027d.a(this.f31024a, c4072a3, customizableMediaView2, ej0Var2, listA, cx0Var2, nx1Var);
            } catch (Throwable unused) {
                return this.f31026c.a(customizableMediaView2, ej0Var2, cx0Var2);
            }
        } catch (Throwable unused2) {
            customizableMediaView2 = customizableMediaView;
            ej0Var2 = ej0Var;
            cx0Var2 = cx0Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.yandex.mobile.ads.impl.sv1] */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.yandex.mobile.ads.impl.rv1] */
    @Override // com.yandex.mobile.ads.impl.xw0
    public final vw0 a(CustomizableMediaView mediaView, C4072a3 adConfiguration, ej0 imageProvider, ov0 controlsProvider, ck0 impressionEventsObservable, c91 nativeMediaContent, j81 nativeForcePauseObserver, v41 nativeAdControllers, cx0 mediaViewRenderController, nx1 nx1Var, sw0 sw0Var) {
        vw0 vw0VarA;
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(controlsProvider, "controlsProvider");
        kotlin.jvm.internal.l.f(impressionEventsObservable, "impressionEventsObservable");
        kotlin.jvm.internal.l.f(nativeMediaContent, "nativeMediaContent");
        kotlin.jvm.internal.l.f(nativeForcePauseObserver, "nativeForcePauseObserver");
        kotlin.jvm.internal.l.f(nativeAdControllers, "nativeAdControllers");
        kotlin.jvm.internal.l.f(mediaViewRenderController, "mediaViewRenderController");
        pv1 pv1VarA = null;
        pv1VarA = null;
        pv1VarA = null;
        pv1VarA = null;
        if (sw0Var == null) {
            return null;
        }
        ta1 ta1VarA = nativeMediaContent.a();
        yb1 yb1VarB = nativeMediaContent.b();
        ku0 ku0VarB = sw0Var.b();
        Context context = mediaView.getContext();
        Context context2 = mediaView.getContext();
        kotlin.jvm.internal.l.e(context2, "getContext(...)");
        boolean zA = s80.a(context2, r80.f32551e);
        if (zA) {
            mediaView.removeAllViews();
        }
        if (ta1VarA != null) {
            ?? A10 = this.f31025b.a(mediaView, controlsProvider, adConfiguration, impressionEventsObservable, ta1VarA, nativeForcePauseObserver, nativeAdControllers, mediaViewRenderController, imageProvider, nx1Var, sw0Var.c());
            uy1 uy1VarA = nx1Var != null ? nx1Var.a() : null;
            pv1VarA = (uy1VarA == null || !zA || (vw0VarA = a(mediaView, adConfiguration, imageProvider, mediaViewRenderController, nx1Var, sw0Var)) == null) ? A10 : new sv1(mediaView, A10, vw0VarA, mediaViewRenderController, uy1VarA);
        } else if (yb1VarB != null && ku0VarB != null) {
            kotlin.jvm.internal.l.c(context);
            if (aa.a(context)) {
                try {
                    pv1VarA = this.f31028e.a(mediaView, ku0VarB, impressionEventsObservable, yb1VarB, mediaViewRenderController);
                } catch (gj2 unused) {
                }
            }
        }
        return pv1VarA == null ? a(mediaView, adConfiguration, imageProvider, mediaViewRenderController, nx1Var, sw0Var) : pv1VarA;
    }
}
