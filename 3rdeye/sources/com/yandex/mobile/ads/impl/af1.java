package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class af1 {

    /* renamed from: a, reason: collision with root package name */
    private final cs0 f24635a;

    public /* synthetic */ af1(Context context) {
        this(context, es0.a(context));
    }

    public final boolean a() {
        return this.f24635a.a("OPT_OUT_ENABLED", false);
    }

    public final void b() {
        this.f24635a.b("OPT_OUT_ENABLED", true);
    }

    public af1(Context context, cs0 localStorage) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(localStorage, "localStorage");
        this.f24635a = localStorage;
    }
}
