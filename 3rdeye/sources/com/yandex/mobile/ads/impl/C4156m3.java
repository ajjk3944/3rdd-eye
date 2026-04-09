package com.yandex.mobile.ads.impl;

import c9.C2097r;
import java.util.ArrayList;

/* renamed from: com.yandex.mobile.ads.impl.m3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4156m3 {
    public static final void a(String adType, ArrayList errors) {
        kotlin.jvm.internal.l.f(adType, "adType");
        kotlin.jvm.internal.l.f(errors, "errors");
        if (errors.isEmpty()) {
            return;
        }
        uo0.a(C4215v0.a(new Object[]{adType, C2097r.u0(errors, "\n - ", "\n - ", null, null, 60)}, 2, "Found following errors for %s ad type: %s", "format(...)"), new Object[0]);
    }

    public static final void a(String adConfigurationInfo) {
        kotlin.jvm.internal.l.f(adConfigurationInfo, "adConfigurationInfo");
        uo0.b(C4215v0.a(new Object[]{adConfigurationInfo}, 1, "Ad type %s was integrated successfully", "format(...)"), new Object[0]);
    }
}
