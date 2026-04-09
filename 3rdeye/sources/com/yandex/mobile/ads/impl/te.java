package com.yandex.mobile.ads.impl;

import c9.C2078B;
import java.util.Map;

/* loaded from: classes3.dex */
public final class te {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<df, String> f33560a = C2078B.o(new b9.l(df.f26154c, "Network error"), new b9.l(df.f26155d, "Invalid response"), new b9.l(df.f26153b, "Unknown"));

    public static String a(df dfVar) {
        String str = f33560a.get(dfVar);
        return str == null ? "Unknown" : str;
    }
}
