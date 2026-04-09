package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2078B;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class yx0 extends zx0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx0(C4072a3 adConfiguration) {
        super(adConfiguration);
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
    }

    @Override // com.yandex.mobile.ads.impl.zx0, com.yandex.mobile.ads.impl.z70
    public final Map<String, Object> a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        LinkedHashMap linkedHashMapU = C2078B.u(super.a(context));
        vy1 vy1VarR = a().r();
        if (vy1VarR != null) {
            linkedHashMapU.put("width", Integer.valueOf(vy1VarR.c(context)));
            linkedHashMapU.put("height", Integer.valueOf(vy1VarR.a(context)));
        }
        return linkedHashMapU;
    }
}
