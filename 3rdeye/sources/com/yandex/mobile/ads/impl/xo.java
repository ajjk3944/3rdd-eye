package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes3.dex */
public interface xo {

    /* renamed from: a, reason: collision with root package name */
    public static final a f35374a = a.f35375a;

    View.OnClickListener a(ag<?> agVar, ir0 ir0Var, InterfaceC4217v2 interfaceC4217v2, x61 x61Var, qo1 qo1Var, bc0 bc0Var);

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f35375a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final xo f35376b = new L2(9);

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final View.OnClickListener a(ag asset, ir0 ir0Var, InterfaceC4217v2 adClickable, x61 viewAdapter, qo1 renderedTimer, bc0 forceImpressionTrackingListener) {
            kotlin.jvm.internal.l.f(asset, "asset");
            kotlin.jvm.internal.l.f(adClickable, "adClickable");
            kotlin.jvm.internal.l.f(viewAdapter, "viewAdapter");
            kotlin.jvm.internal.l.f(renderedTimer, "renderedTimer");
            kotlin.jvm.internal.l.f(forceImpressionTrackingListener, "forceImpressionTrackingListener");
            return new f51(asset, ir0Var, adClickable, viewAdapter, renderedTimer, forceImpressionTrackingListener);
        }

        public static xo a() {
            return f35376b;
        }
    }
}
