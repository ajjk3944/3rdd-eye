package com.iab.omid.library.bytedance2.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f18671b = new g();

    /* renamed from: a, reason: collision with root package name */
    private Context f18672a;

    private g() {
    }

    public static g b() {
        return f18671b;
    }

    public Context a() {
        return this.f18672a;
    }

    public void a(Context context) {
        this.f18672a = context != null ? context.getApplicationContext() : null;
    }
}
