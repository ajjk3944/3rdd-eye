package com.yandex.mobile.ads.impl;

import N7.G8;

/* loaded from: classes3.dex */
public final class ze {

    /* renamed from: c, reason: collision with root package name */
    private static final String f36431c = "Incorrect AppMetrica Integration. The minimum supported version of AppMetrica SDK is 7.9.0 (inclusive) and the maximum supported version is 8.0.0 (exclusive). Please, check your AppMetrica integration.";

    /* renamed from: d, reason: collision with root package name */
    private static final String f36432d = "Incorrect AppMetrica Version. The minimum supported version of AppMetrica SDK is 7.9.0 (inclusive) and the maximum supported version is 8.0.0 (exclusive). And the current version of AppMetrica SDK is ";

    /* renamed from: a, reason: collision with root package name */
    private final va2 f36433a;

    /* renamed from: b, reason: collision with root package name */
    private final le f36434b;

    public /* synthetic */ ze() {
        this(new va2(), me.a());
    }

    public final void a() throws oo0 {
        String strA = this.f36434b.a();
        if (strA == null) {
            String str = f36431c;
            throw new oo0(str, str);
        }
        this.f36433a.getClass();
        ua2 ua2VarA = va2.a("7.9.0");
        if (ua2VarA == null) {
            return;
        }
        this.f36433a.getClass();
        ua2 ua2VarA2 = va2.a("8.0.0");
        if (ua2VarA2 == null) {
            return;
        }
        this.f36433a.getClass();
        ua2 ua2VarA3 = va2.a(strA);
        if (ua2VarA3 == null || ua2VarA3.compareTo(ua2VarA) < 0 || ua2VarA3.compareTo(ua2VarA2) >= 0) {
            String strA2 = a(strA);
            throw new oo0(strA2, strA2);
        }
    }

    public ze(va2 versionNameParser, le appMetricaAdapter) {
        kotlin.jvm.internal.l.f(versionNameParser, "versionNameParser");
        kotlin.jvm.internal.l.f(appMetricaAdapter, "appMetricaAdapter");
        this.f36433a = versionNameParser;
        this.f36434b = appMetricaAdapter;
    }

    private static String a(String str) {
        return G8.s(f36432d, str);
    }
}
