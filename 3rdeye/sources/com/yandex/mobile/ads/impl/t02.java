package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.widget.PopupMenu;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* loaded from: classes3.dex */
public final class t02 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f33355a;

    /* renamed from: b, reason: collision with root package name */
    private final p41 f33356b;

    /* renamed from: c, reason: collision with root package name */
    private final g51 f33357c;

    /* renamed from: d, reason: collision with root package name */
    private final h91 f33358d;

    /* renamed from: e, reason: collision with root package name */
    private final y02 f33359e;

    public t02(Context context, C4072a3 adConfiguration, a8<?> adResponse, p41 clickReporterCreator, g51 nativeAdEventController, x61 nativeAdViewAdapter, h91 nativeOpenUrlHandlerCreator, y02 socialMenuCreator) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(clickReporterCreator, "clickReporterCreator");
        kotlin.jvm.internal.l.f(nativeAdEventController, "nativeAdEventController");
        kotlin.jvm.internal.l.f(nativeAdViewAdapter, "nativeAdViewAdapter");
        kotlin.jvm.internal.l.f(nativeOpenUrlHandlerCreator, "nativeOpenUrlHandlerCreator");
        kotlin.jvm.internal.l.f(socialMenuCreator, "socialMenuCreator");
        this.f33355a = adConfiguration;
        this.f33356b = clickReporterCreator;
        this.f33357c = nativeAdEventController;
        this.f33358d = nativeOpenUrlHandlerCreator;
        this.f33359e = socialMenuCreator;
    }

    public final void a(View view, k02 action) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(action, "action");
        List<n02> listC = action.c();
        if (listC.isEmpty()) {
            return;
        }
        PopupMenu popupMenuA = this.f33359e.a(view, listC);
        Context context = view.getContext();
        kotlin.jvm.internal.l.e(context, "getContext(...)");
        popupMenuA.setOnMenuItemClickListener(new s02(new l62(new h9(context, this.f33355a)), this.f33356b, listC, this.f33357c, this.f33358d));
        popupMenuA.show();
    }
}
