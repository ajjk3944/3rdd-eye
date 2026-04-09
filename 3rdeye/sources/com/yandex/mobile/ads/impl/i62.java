package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;

/* loaded from: classes3.dex */
public final class i62 {

    /* renamed from: a, reason: collision with root package name */
    private final C4104f0 f28526a;

    /* renamed from: b, reason: collision with root package name */
    private final f71 f28527b;

    /* renamed from: c, reason: collision with root package name */
    private final k62 f28528c;

    /* renamed from: d, reason: collision with root package name */
    private j62 f28529d;

    /* renamed from: e, reason: collision with root package name */
    private e71 f28530e;

    public interface a {
        void a();

        void b();
    }

    public /* synthetic */ i62() {
        this(new C4104f0(), new f71(), new k62());
    }

    public final void a(View nativeAdView, q81 trackingListener) {
        C4097e0 c4097e0;
        kotlin.jvm.internal.l.f(nativeAdView, "nativeAdView");
        kotlin.jvm.internal.l.f(trackingListener, "trackingListener");
        Context context = nativeAdView.getContext();
        kotlin.jvm.internal.l.e(context, "getContext(...)");
        j62 j62Var = this.f28529d;
        if (j62Var != null) {
            j62Var.a(context);
        }
        Activity activity = null;
        this.f28529d = null;
        e71 e71Var = this.f28530e;
        if (e71Var != null) {
            e71Var.b();
        }
        this.f28530e = null;
        C4104f0 c4104f0 = this.f28526a;
        Context context2 = nativeAdView.getContext();
        kotlin.jvm.internal.l.e(context2, "getContext(...)");
        c4104f0.getClass();
        int i = 0;
        while (true) {
            if (!(context2 instanceof ContextWrapper)) {
                break;
            }
            int i10 = i + 1;
            if (i >= 10) {
                break;
            }
            if (context2 instanceof Activity) {
                activity = (Activity) context2;
                break;
            } else {
                context2 = ((ContextWrapper) context2).getBaseContext();
                i = i10;
            }
        }
        if (activity != null) {
            this.f28528c.getClass();
            C4097e0 c4097e02 = C4097e0.f26592g;
            if (c4097e02 == null) {
                synchronized (C4097e0.f26591f) {
                    c4097e0 = C4097e0.f26592g;
                    if (c4097e0 == null) {
                        c4097e0 = new C4097e0();
                        C4097e0.f26592g = c4097e0;
                    }
                }
                c4097e02 = c4097e0;
            }
            j62 j62Var2 = new j62(activity, trackingListener, c4097e02);
            this.f28529d = j62Var2;
            j62Var2.c(activity);
        }
        this.f28527b.getClass();
        e71 e71Var2 = new e71(nativeAdView, trackingListener, new a71());
        this.f28530e = e71Var2;
        e71Var2.a();
    }

    public i62(C4104f0 activityContextProvider, f71 windowAttachListenerFactory, k62 activityLifecycleListenerFactory) {
        kotlin.jvm.internal.l.f(activityContextProvider, "activityContextProvider");
        kotlin.jvm.internal.l.f(windowAttachListenerFactory, "windowAttachListenerFactory");
        kotlin.jvm.internal.l.f(activityLifecycleListenerFactory, "activityLifecycleListenerFactory");
        this.f28526a = activityContextProvider;
        this.f28527b = windowAttachListenerFactory;
        this.f28528c = activityLifecycleListenerFactory;
    }

    public final void a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        j62 j62Var = this.f28529d;
        if (j62Var != null) {
            j62Var.a(context);
        }
        this.f28529d = null;
        e71 e71Var = this.f28530e;
        if (e71Var != null) {
            e71Var.b();
        }
        this.f28530e = null;
    }
}
