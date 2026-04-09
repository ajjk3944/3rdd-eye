package com.yandex.mobile.ads.impl;

import c9.C2078B;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ds {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, cs> f26299a = C2078B.o(new b9.l("html", cs.f25763b), new b9.l("native", cs.f25764c));

    public static cs a(Map headers) {
        kotlin.jvm.internal.l.f(headers, "headers");
        return f26299a.get(hf0.a(headers, gh0.f27737u));
    }
}
