package com.yandex.mobile.ads.impl;

import d9.C4285c;
import java.util.Map;

/* loaded from: classes3.dex */
public final class sn0 implements v92 {

    /* renamed from: a, reason: collision with root package name */
    private final u92 f33144a;

    public sn0(u92 requestConfiguration) {
        kotlin.jvm.internal.l.f(requestConfiguration, "requestConfiguration");
        this.f33144a = requestConfiguration;
    }

    @Override // com.yandex.mobile.ads.impl.v92
    public final Map<String, String> a() {
        m7 m7Var = new m7(this.f33144a.a());
        C4285c c4285c = new C4285c();
        Map<String, String> mapB = this.f33144a.b();
        if (mapB != null) {
            c4285c.putAll(mapB);
        }
        String strE = m7Var.e();
        if (strE != null) {
            c4285c.put("video-session-id", strE);
        }
        return c4285c.c();
    }
}
