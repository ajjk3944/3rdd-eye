package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;

/* loaded from: classes3.dex */
public final class bn2 implements sa2 {

    /* renamed from: a, reason: collision with root package name */
    private final le1 f25351a;

    public bn2(le1 omSdkUsageValidator) {
        kotlin.jvm.internal.l.f(omSdkUsageValidator, "omSdkUsageValidator");
        this.f25351a = omSdkUsageValidator;
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    public final an2 a(Context context, nc2 videoAdPosition, bd2 bd2Var, List verifications) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(videoAdPosition, "videoAdPosition");
        kotlin.jvm.internal.l.f(verifications, "verifications");
        if (this.f25351a.a(context)) {
            return new an2(context, videoAdPosition, bd2Var, verifications, new xf2(context), new me1(), new rm2(context).c());
        }
        return null;
    }
}
