package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class xy1 {
    public static final boolean a(Context context, a8<?> adResponse, vy1 responseSizeInfo, v8 adSizeValidator, vy1 containerSizeInfo) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(responseSizeInfo, "responseSizeInfo");
        kotlin.jvm.internal.l.f(adSizeValidator, "adSizeValidator");
        kotlin.jvm.internal.l.f(containerSizeInfo, "containerSizeInfo");
        boolean zA = adSizeValidator.a(context, responseSizeInfo);
        boolean zN = adResponse.N();
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        boolean zA2 = ca.a(applicationContext, responseSizeInfo, containerSizeInfo);
        if (zN) {
            return true;
        }
        return zA && zA2;
    }
}
