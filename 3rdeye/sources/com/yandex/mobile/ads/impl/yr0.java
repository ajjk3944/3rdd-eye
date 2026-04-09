package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import c9.C2099t;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes3.dex */
public final class yr0 {

    /* renamed from: a, reason: collision with root package name */
    private final bi2 f35963a;

    /* renamed from: b, reason: collision with root package name */
    private final sl0 f35964b;

    public static final class a implements bt {

        /* renamed from: a, reason: collision with root package name */
        private final b f35965a;

        /* renamed from: b, reason: collision with root package name */
        private final WeakReference<ViewGroup> f35966b;

        /* renamed from: c, reason: collision with root package name */
        private final WeakReference<List<kb2>> f35967c;

        public a(ViewGroup viewGroup, List<kb2> friendlyOverlays, b instreamAdLoadListener) {
            kotlin.jvm.internal.l.f(viewGroup, "viewGroup");
            kotlin.jvm.internal.l.f(friendlyOverlays, "friendlyOverlays");
            kotlin.jvm.internal.l.f(instreamAdLoadListener, "instreamAdLoadListener");
            this.f35965a = instreamAdLoadListener;
            this.f35966b = new WeakReference<>(viewGroup);
            this.f35967c = new WeakReference<>(friendlyOverlays);
        }

        @Override // com.yandex.mobile.ads.impl.bt
        public final void a(xs instreamAd) {
            kotlin.jvm.internal.l.f(instreamAd, "instreamAd");
            ViewGroup viewGroup = this.f35966b.get();
            List<kb2> list = this.f35967c.get();
            if (list == null) {
                list = C2099t.f18581b;
            }
            if (viewGroup != null) {
                this.f35965a.a(viewGroup, list, instreamAd);
            } else {
                this.f35965a.a("Ad was received but there's no view group to display it");
            }
        }

        @Override // com.yandex.mobile.ads.impl.bt
        public final void onInstreamAdFailedToLoad(String reason) {
            kotlin.jvm.internal.l.f(reason, "reason");
            this.f35965a.a(reason);
        }
    }

    public interface b {
        void a(ViewGroup viewGroup, List<kb2> list, xs xsVar);

        void a(String str);
    }

    public yr0(Context context, vu1 sdkEnvironmentModule, bi2 vmapRequestConfig, sl0 instreamAdLoadingController) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(vmapRequestConfig, "vmapRequestConfig");
        kotlin.jvm.internal.l.f(instreamAdLoadingController, "instreamAdLoadingController");
        this.f35963a = vmapRequestConfig;
        this.f35964b = instreamAdLoadingController;
    }

    public final void a() {
        this.f35964b.a((bt) null);
    }

    public final void a(ViewGroup adViewGroup, List<kb2> friendlyOverlays, b loadListener) {
        kotlin.jvm.internal.l.f(adViewGroup, "adViewGroup");
        kotlin.jvm.internal.l.f(friendlyOverlays, "friendlyOverlays");
        kotlin.jvm.internal.l.f(loadListener, "loadListener");
        a aVar = new a(adViewGroup, friendlyOverlays, loadListener);
        sl0 sl0Var = this.f35964b;
        sl0Var.a(aVar);
        sl0Var.a(this.f35963a);
    }
}
