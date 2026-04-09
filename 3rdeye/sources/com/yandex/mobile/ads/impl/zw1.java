package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;

/* loaded from: classes3.dex */
public final class zw1 {

    /* renamed from: a, reason: collision with root package name */
    private final nr f36768a;

    public /* synthetic */ zw1() {
        this(new nr());
    }

    public static boolean a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        du1 du1VarA = ew1.a.a().a(context);
        return du1VarA != null && du1VarA.l0();
    }

    public final boolean b(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        du1 du1VarA = ew1.a.a().a(context);
        if (du1VarA == null || !du1VarA.C0() || a(context)) {
            return true;
        }
        this.f36768a.getClass();
        return !kotlin.jvm.internal.l.b(ew1.a.a().e(), du1VarA.Z()) && kotlin.jvm.internal.l.b(ew1.a.a().e(), Boolean.TRUE);
    }

    public zw1(nr consentUpdateValidator) {
        kotlin.jvm.internal.l.f(consentUpdateValidator, "consentUpdateValidator");
        this.f36768a = consentUpdateValidator;
    }
}
