package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;

/* loaded from: classes3.dex */
public final class f50 {

    /* renamed from: a, reason: collision with root package name */
    private final r22 f27198a = new r22();

    public final String a(Context context, String rawQuery) {
        String strA;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(rawQuery, "rawQuery");
        du1 du1VarA = ew1.a.a().a(context);
        return (du1VarA == null || !du1VarA.i0() || (strA = this.f27198a.a(context, rawQuery)) == null) ? rawQuery : strA;
    }
}
