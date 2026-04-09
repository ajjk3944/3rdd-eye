package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2097r;
import com.yandex.mobile.ads.impl.za0;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class lu1 {

    /* renamed from: a, reason: collision with root package name */
    private final f50 f30104a = new f50();

    public final String a(Context context, zw1 sensitiveModeChecker, cc advertisingConfiguration, j50 environmentConfiguration) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(environmentConfiguration, "environmentConfiguration");
        kotlin.jvm.internal.l.f(advertisingConfiguration, "advertisingConfiguration");
        kotlin.jvm.internal.l.f(sensitiveModeChecker, "sensitiveModeChecker");
        String[] strArr = {new za0(new za0.a(sensitiveModeChecker.b(context)).j(environmentConfiguration.g()).e(environmentConfiguration.e()).a(advertisingConfiguration.a(), advertisingConfiguration.b()).a(advertisingConfiguration.c()).N0().l(context).k(context).M0().a(zw1.a(context)).a(context, environmentConfiguration.b()).b(context).R0().S0(), 0).toString(), C2097r.u0(environmentConfiguration.f(), "&", null, null, ku1.f29793b, 30)};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            if (!y9.q.i0(str)) {
                arrayList.add(str);
            }
        }
        return this.f30104a.a(context, C2097r.u0(arrayList, "&", null, null, null, 62));
    }
}
