package com.iab.omid.library.applovin.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f20943b = new g();

    /* renamed from: a, reason: collision with root package name */
    private Context f20944a;

    private g() {
    }

    public static g b() {
        return f20943b;
    }

    public Context a() {
        return this.f20944a;
    }

    public void a(Context context) {
        this.f20944a = context != null ? context.getApplicationContext() : null;
    }
}
