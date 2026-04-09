package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Typeface;
import io.appmetrica.analytics.impl.Oo;

/* loaded from: classes3.dex */
public final class h30 implements u6.a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f28088a;

    public h30(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f28088a = context;
    }

    @Override // u6.a
    public final Typeface getBold() {
        Typeface typefaceA;
        yb0 yb0VarA = zb0.a(this.f28088a);
        return (yb0VarA == null || (typefaceA = yb0VarA.a()) == null) ? Typeface.DEFAULT_BOLD : typefaceA;
    }

    @Override // u6.a
    public final Typeface getLight() {
        yb0 yb0VarA = zb0.a(this.f28088a);
        if (yb0VarA != null) {
            return yb0VarA.b();
        }
        return null;
    }

    @Override // u6.a
    public final Typeface getMedium() {
        yb0 yb0VarA = zb0.a(this.f28088a);
        if (yb0VarA != null) {
            return yb0VarA.c();
        }
        return null;
    }

    @Override // u6.a
    public final Typeface getRegular() {
        yb0 yb0VarA = zb0.a(this.f28088a);
        if (yb0VarA != null) {
            return yb0VarA.d();
        }
        return null;
    }

    @Override // u6.a
    public /* bridge */ /* synthetic */ Typeface getTypefaceFor(int i) {
        return Oo.b(i, this);
    }
}
