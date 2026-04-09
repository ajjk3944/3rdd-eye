package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ja implements tg1 {

    /* renamed from: a, reason: collision with root package name */
    private final ip1.c f29030a;

    /* renamed from: b, reason: collision with root package name */
    private final String f29031b;

    public ja(ip1.c status, String str) {
        kotlin.jvm.internal.l.f(status, "status");
        this.f29030a = status;
        this.f29031b = str;
    }

    @Override // com.yandex.mobile.ads.impl.tg1
    public final Map<String, Object> a(long j4) {
        jp1 jp1Var = new jp1((Map) null, 3);
        jp1Var.b(this.f29031b, "adapter");
        jp1Var.b(this.f29030a.a(), "status");
        jp1Var.b(Long.valueOf(j4), "duration");
        return jp1Var.b();
    }
}
