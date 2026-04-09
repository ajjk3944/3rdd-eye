package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class kv {

    /* renamed from: a, reason: collision with root package name */
    private final Context f29794a;

    public kv(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f29794a = es.a(context);
    }

    public final boolean a() {
        return (this.f29794a.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
