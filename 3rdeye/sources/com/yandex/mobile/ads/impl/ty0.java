package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ty0 {

    /* renamed from: a, reason: collision with root package name */
    private final va2 f33811a;

    public ty0(va2 versionParser) {
        kotlin.jvm.internal.l.f(versionParser, "versionParser");
        this.f33811a = versionParser;
    }

    public final boolean a(String current, String str) {
        kotlin.jvm.internal.l.f(current, "current");
        if (str == null || y9.q.i0(str)) {
            return true;
        }
        this.f33811a.getClass();
        ua2 ua2VarA = va2.a(current);
        if (ua2VarA == null) {
            return true;
        }
        this.f33811a.getClass();
        ua2 ua2VarA2 = va2.a(str);
        return ua2VarA2 == null || ua2VarA.compareTo(ua2VarA2) >= 0;
    }
}
