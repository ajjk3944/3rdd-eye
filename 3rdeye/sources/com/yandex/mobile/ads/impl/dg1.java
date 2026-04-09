package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import com.yandex.mobile.ads.impl.c82;
import com.yandex.mobile.ads.impl.za0;

/* loaded from: classes3.dex */
public final class dg1 implements c82 {

    /* renamed from: a, reason: collision with root package name */
    private final eg1 f26167a;

    /* renamed from: b, reason: collision with root package name */
    private final f50 f26168b;

    public dg1(eg1 passbackUrlParametersProvider) {
        kotlin.jvm.internal.l.f(passbackUrlParametersProvider, "passbackUrlParametersProvider");
        this.f26167a = passbackUrlParametersProvider;
        this.f26168b = new f50();
    }

    @Override // com.yandex.mobile.ads.impl.c82
    public final String a(Context context, C4072a3 adConfiguration, zw1 sensitiveModeChecker) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(sensitiveModeChecker, "sensitiveModeChecker");
        return this.f26168b.a(context, new za0(za0.b.a(context, adConfiguration, sensitiveModeChecker).b(this.f26167a.a()), 0).toString());
    }

    @Override // com.yandex.mobile.ads.impl.c82
    public final String a(C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        String strA = adConfiguration.k().a();
        if (strA == null || strA.length() <= 0) {
            return null;
        }
        return Uri.parse(strA).buildUpon().appendEncodedPath("v4/ad").build().toString();
    }

    @Override // com.yandex.mobile.ads.impl.c82
    public final c82.a a() {
        return c82.a.f25569c;
    }
}
