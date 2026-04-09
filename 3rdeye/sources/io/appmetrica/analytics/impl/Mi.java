package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public abstract class Mi {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f39872a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39873b;

    /* renamed from: c, reason: collision with root package name */
    public final String f39874c;

    public Mi(Context context, String str, String str2) {
        this.f39872a = context;
        this.f39873b = str;
        this.f39874c = str2;
    }

    public final Object a() {
        int identifier = this.f39872a.getResources().getIdentifier(this.f39873b, this.f39874c, this.f39872a.getPackageName());
        if (identifier == 0) {
            return null;
        }
        try {
            return a(identifier);
        } catch (Throwable unused) {
            return null;
        }
    }

    public abstract Object a(int i);
}
