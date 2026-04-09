package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4469a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f40500a;

    public C4469a(Context context) {
        this.f40500a = context;
    }

    public final byte[] a() {
        try {
            return AbstractC4903qj.a(new StringBuilder(this.f40500a.getPackageName()).reverse().toString());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }

    public final byte[] b() {
        try {
            return AbstractC4903qj.a(this.f40500a.getPackageName());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }
}
