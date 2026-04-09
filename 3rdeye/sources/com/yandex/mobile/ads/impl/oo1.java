package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class oo1 {
    public static no1 a(Context context, a8 adResponse, C4072a3 adConfiguration, C4101e4 adIdStorageManager, ha adVisibilityValidator, wo1 renderingImpressionTrackingListener) {
        e9 adStructureType = e9.f26735b;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adIdStorageManager, "adIdStorageManager");
        kotlin.jvm.internal.l.f(adVisibilityValidator, "adVisibilityValidator");
        kotlin.jvm.internal.l.f(renderingImpressionTrackingListener, "renderingImpressionTrackingListener");
        kotlin.jvm.internal.l.f(adStructureType, "adStructureType");
        return new no1(context, new g7(adVisibilityValidator, new cg0()), adResponse, adConfiguration, adStructureType, adIdStorageManager, renderingImpressionTrackingListener, (qo1) null, adResponse.j());
    }
}
