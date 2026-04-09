package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;

/* loaded from: classes3.dex */
public final class i50 {

    /* renamed from: a, reason: collision with root package name */
    private final j10 f28494a = new j10();

    public final boolean a(View view, int i, int i10, int i11, int i12) {
        kotlin.jvm.internal.l.f(view, "view");
        int i13 = i11 - i;
        int i14 = i12 - i10;
        j10 j10Var = this.f28494a;
        Context context = view.getContext();
        kotlin.jvm.internal.l.e(context, "getContext(...)");
        j10Var.getClass();
        int iA = j10.a(context, 144.0f);
        j10 j10Var2 = this.f28494a;
        Context context2 = view.getContext();
        kotlin.jvm.internal.l.e(context2, "getContext(...)");
        j10Var2.getClass();
        return i13 >= iA && i14 >= j10.a(context2, 96.0f);
    }
}
