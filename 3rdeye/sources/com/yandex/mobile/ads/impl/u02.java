package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;

/* loaded from: classes3.dex */
public final class u02 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final w02 f33848a;

    /* renamed from: b, reason: collision with root package name */
    private final l82 f33849b;

    public u02(w02 socialAdInfo, l82 urlViewerLauncher) {
        kotlin.jvm.internal.l.f(socialAdInfo, "socialAdInfo");
        kotlin.jvm.internal.l.f(urlViewerLauncher, "urlViewerLauncher");
        this.f33848a = socialAdInfo;
        this.f33849b = urlViewerLauncher;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v10) {
        kotlin.jvm.internal.l.f(v10, "v");
        Context context = v10.getContext();
        String strA = this.f33848a.a();
        l82 l82Var = this.f33849b;
        kotlin.jvm.internal.l.c(context);
        l82Var.a(context, strA);
    }
}
