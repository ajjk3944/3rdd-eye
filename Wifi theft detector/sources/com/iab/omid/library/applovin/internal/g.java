package com.iab.omid.library.applovin.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f12237b = new g();

    /* renamed from: a, reason: collision with root package name */
    private Context f12238a;

    private g() {
    }

    public static g b() {
        return f12237b;
    }

    public Context a() {
        return this.f12238a;
    }

    public void a(Context context) {
        this.f12238a = context != null ? context.getApplicationContext() : null;
    }
}
