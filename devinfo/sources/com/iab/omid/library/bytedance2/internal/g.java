package com.iab.omid.library.bytedance2.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f21069b = new g();

    /* renamed from: a, reason: collision with root package name */
    private Context f21070a;

    private g() {
    }

    public static g b() {
        return f21069b;
    }

    public Context a() {
        return this.f21070a;
    }

    public void a(Context context) {
        this.f21070a = context != null ? context.getApplicationContext() : null;
    }
}
