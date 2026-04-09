package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R;

/* loaded from: classes3.dex */
public final class kb {

    /* renamed from: a, reason: collision with root package name */
    private final Context f29579a;

    /* renamed from: b, reason: collision with root package name */
    private final ob f29580b;

    /* renamed from: c, reason: collision with root package name */
    private final tb f29581c;

    /* renamed from: d, reason: collision with root package name */
    private final jb f29582d;

    public /* synthetic */ kb(Context context, ob obVar) {
        this(context, obVar, new tb(), new jb(context, true, 12));
    }

    @SuppressLint({"InflateParams"})
    public final ViewGroup a() {
        View viewInflate = LayoutInflater.from(this.f29579a).inflate(R.layout.monetization_ads_internal_adtune_container, (ViewGroup) null);
        kotlin.jvm.internal.l.d(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        this.f29581c.getClass();
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) viewGroup.findViewById(R.id.adtune_content_container);
        if (extendedViewContainer != null) {
            extendedViewContainer.setMeasureSpecProvider(this.f29582d);
        }
        this.f29581c.getClass();
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.adtune_webview_container);
        if (viewGroup2 != null) {
            viewGroup2.addView(this.f29580b);
        }
        return viewGroup;
    }

    public kb(Context context, ob adtuneOptOutWebView, tb adtuneViewProvider, jb adtuneMeasureSpecProvider) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adtuneOptOutWebView, "adtuneOptOutWebView");
        kotlin.jvm.internal.l.f(adtuneViewProvider, "adtuneViewProvider");
        kotlin.jvm.internal.l.f(adtuneMeasureSpecProvider, "adtuneMeasureSpecProvider");
        this.f29579a = context;
        this.f29580b = adtuneOptOutWebView;
        this.f29581c = adtuneViewProvider;
        this.f29582d = adtuneMeasureSpecProvider;
    }
}
