package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.Log;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.xz0;
import java.io.File;

/* loaded from: classes3.dex */
public final class dq1 {
    public static final cq1 a(Context context, int i) {
        kotlin.jvm.internal.l.f(context, "context");
        int i10 = um1.f34089b;
        boolean z10 = gi2.f27765a;
        fp0.a("Yandex Mobile Ads");
        gi2.f27765a = Log.isLoggable("Yandex Mobile Ads", 2);
        gi2.f27765a = false;
        rk rkVar = new rk(new oh0(context, xs1.a()).a(), new jm());
        File fileA = m10.a(context, "mobileads-volley-cache");
        du1 du1VarA = ew1.a.a().a(context);
        cq1 cq1Var = new cq1(new l10(fileA, (int) xz0.a.a(context, 10485760L, (du1VarA == null || du1VarA.D() == 0) ? 52428800L : du1VarA.D())), rkVar, i);
        cq1Var.a(new up1());
        return cq1Var;
    }
}
