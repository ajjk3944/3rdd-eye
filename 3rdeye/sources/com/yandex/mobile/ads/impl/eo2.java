package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes3.dex */
public final class eo2 {

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static eo2 f26975b = new eo2();

    /* renamed from: a, reason: collision with root package name */
    private Context f26976a;

    private eo2() {
    }

    public static eo2 a() {
        return f26975b;
    }

    public final Context b() {
        return this.f26976a;
    }

    public final void a(Context context) {
        this.f26976a = context != null ? context.getApplicationContext() : null;
    }
}
