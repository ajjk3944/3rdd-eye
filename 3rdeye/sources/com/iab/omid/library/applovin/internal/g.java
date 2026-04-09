package com.iab.omid.library.applovin.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f23563b = new g();

    /* renamed from: a, reason: collision with root package name */
    private Context f23564a;

    private g() {
    }

    public static g b() {
        return f23563b;
    }

    public Context a() {
        return this.f23564a;
    }

    public void a(Context context) {
        this.f23564a = context != null ? context.getApplicationContext() : null;
    }
}
