package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import android.content.Context;
import android.view.ViewGroup;
import android.view.Window;
import com.yandex.mobile.ads.R;

/* loaded from: classes3.dex */
public final class mb {

    /* renamed from: a, reason: collision with root package name */
    private final Context f30325a;

    /* renamed from: b, reason: collision with root package name */
    private final kb f30326b;

    /* renamed from: c, reason: collision with root package name */
    private final hb f30327c;

    public mb(ob adtuneOptOutWebView, Context context, kb adtuneOptOutContainerCreator, hb adtuneControlsConfigurator) {
        kotlin.jvm.internal.l.f(adtuneOptOutWebView, "adtuneOptOutWebView");
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adtuneOptOutContainerCreator, "adtuneOptOutContainerCreator");
        kotlin.jvm.internal.l.f(adtuneControlsConfigurator, "adtuneControlsConfigurator");
        this.f30325a = context;
        this.f30326b = adtuneOptOutContainerCreator;
        this.f30327c = adtuneControlsConfigurator;
    }

    public final Dialog a() {
        Dialog dialog = new Dialog(this.f30325a, R.style.MonetizationAdsInternal_BottomAdtuneDialog);
        ViewGroup viewGroupA = this.f30326b.a();
        this.f30327c.a(viewGroupA, dialog);
        dialog.setContentView(viewGroupA);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        return dialog;
    }
}
