package com.yandex.mobile.ads.impl;

import H6.C0675l;
import android.app.Dialog;
import android.content.Context;
import com.yandex.mobile.ads.R;

/* loaded from: classes3.dex */
public final class m20 {

    /* renamed from: a, reason: collision with root package name */
    private final h10 f30162a;

    /* renamed from: b, reason: collision with root package name */
    private final l20 f30163b;

    public m20(h10 contentCloseListener, j20 actionHandler, l20 binder) {
        kotlin.jvm.internal.l.f(contentCloseListener, "contentCloseListener");
        kotlin.jvm.internal.l.f(actionHandler, "actionHandler");
        kotlin.jvm.internal.l.f(binder, "binder");
        this.f30162a = contentCloseListener;
        this.f30163b = binder;
    }

    public final void a(Context context, i20 action) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(action, "action");
        C0675l c0675lA = this.f30163b.a(context, action);
        Dialog dialog = new Dialog(c0675lA.getContext(), R.style.MonetizationAdsInternal_FullscreenDialog);
        this.f30162a.a(dialog);
        dialog.setContentView(c0675lA);
        dialog.show();
    }
}
