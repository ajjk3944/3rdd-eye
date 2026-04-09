package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.w5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5041w5 {

    /* renamed from: a, reason: collision with root package name */
    public final C4759l5 f41896a;

    /* renamed from: b, reason: collision with root package name */
    public final C4916r7 f41897b;

    public C5041w5(Context context, C4759l5 c4759l5) {
        this(c4759l5, C4916r7.a(context));
    }

    public final Cif a() {
        return new Cif(this.f41897b.b(this.f41896a));
    }

    public C5041w5(C4759l5 c4759l5, C4916r7 c4916r7) {
        this.f41896a = c4759l5;
        this.f41897b = c4916r7;
    }
}
