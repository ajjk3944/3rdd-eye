package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zn2 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f36570a;

    public final void a(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context cannot be null");
        }
        if (this.f36570a) {
            return;
        }
        this.f36570a = true;
        po2.a().a(context);
        tn2.a().a(context);
        vn2.a(context);
        eo2.a().a(context);
    }

    public final boolean a() {
        return this.f36570a;
    }
}
