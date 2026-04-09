package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R;

/* loaded from: classes3.dex */
public final class fb {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27260a;

    /* renamed from: b, reason: collision with root package name */
    private final ub f27261b;

    /* renamed from: c, reason: collision with root package name */
    private final tb f27262c;

    /* renamed from: d, reason: collision with root package name */
    private final jb f27263d;

    public /* synthetic */ fb(Activity activity, ub ubVar) {
        this(activity, ubVar, new tb(), new jb(activity, false, 14));
    }

    @SuppressLint({"InflateParams"})
    public final ViewGroup a() {
        View viewInflate = LayoutInflater.from(this.f27260a).inflate(R.layout.monetization_ads_internal_adtune_container, (ViewGroup) null);
        kotlin.jvm.internal.l.d(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        this.f27262c.getClass();
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) viewGroup.findViewById(R.id.adtune_content_container);
        if (extendedViewContainer != null) {
            extendedViewContainer.setMeasureSpecProvider(this.f27263d);
        }
        this.f27262c.getClass();
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.adtune_webview_container);
        if (viewGroup2 != null) {
            viewGroup2.addView(this.f27261b);
        }
        return viewGroup;
    }

    public fb(Activity context, ub adtuneWebView, tb adtuneViewProvider, jb adtuneMeasureSpecProvider) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adtuneWebView, "adtuneWebView");
        kotlin.jvm.internal.l.f(adtuneViewProvider, "adtuneViewProvider");
        kotlin.jvm.internal.l.f(adtuneMeasureSpecProvider, "adtuneMeasureSpecProvider");
        this.f27260a = context;
        this.f27261b = adtuneWebView;
        this.f27262c = adtuneViewProvider;
        this.f27263d = adtuneMeasureSpecProvider;
    }
}
