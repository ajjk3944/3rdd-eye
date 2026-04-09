package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.ViewGroup;
import android.view.Window;
import com.yandex.mobile.ads.R;

/* loaded from: classes3.dex */
public final class ib {

    /* renamed from: a, reason: collision with root package name */
    private final Context f28625a;

    /* renamed from: b, reason: collision with root package name */
    private final fb f28626b;

    /* renamed from: c, reason: collision with root package name */
    private final hb f28627c;

    public ib(Activity context, ub adtuneWebView, fb adtuneContainerCreator, hb adtuneControlsConfigurator) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adtuneWebView, "adtuneWebView");
        kotlin.jvm.internal.l.f(adtuneContainerCreator, "adtuneContainerCreator");
        kotlin.jvm.internal.l.f(adtuneControlsConfigurator, "adtuneControlsConfigurator");
        this.f28625a = context;
        this.f28626b = adtuneContainerCreator;
        this.f28627c = adtuneControlsConfigurator;
    }

    public final Dialog a() {
        Dialog dialog = new Dialog(this.f28625a, R.style.MonetizationAdsInternal_BottomAdtuneDialog);
        ViewGroup viewGroupA = this.f28626b.a();
        this.f28627c.a(viewGroupA, dialog);
        dialog.setContentView(viewGroupA);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        return dialog;
    }
}
