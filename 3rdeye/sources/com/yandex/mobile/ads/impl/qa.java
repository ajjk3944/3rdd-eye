package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class qa {

    /* renamed from: a, reason: collision with root package name */
    private final ew1 f32123a;

    public /* synthetic */ qa() {
        this(ew1.a.a());
    }

    public final Set<? extends String> a(Context context, ns adType) {
        Map<ns, Set<String>> mapH;
        Set<String> set;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adType, "adType");
        du1 du1VarA = this.f32123a.a(context);
        if (du1VarA == null || (mapH = du1VarA.h()) == null || (set = mapH.get(adType)) == null) {
            return null;
        }
        return set;
    }

    public qa(ew1 sdkSettings) {
        kotlin.jvm.internal.l.f(sdkSettings, "sdkSettings");
        this.f32123a = sdkSettings;
    }
}
