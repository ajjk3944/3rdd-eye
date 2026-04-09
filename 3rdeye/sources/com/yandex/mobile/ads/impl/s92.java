package com.yandex.mobile.ads.impl;

import c9.C2078B;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class s92 implements tg1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f32915a;

    /* renamed from: b, reason: collision with root package name */
    private final fb2 f32916b;

    public s92(String responseStatus, fb2 fb2Var) {
        kotlin.jvm.internal.l.f(responseStatus, "responseStatus");
        this.f32915a = responseStatus;
        this.f32916b = fb2Var;
    }

    @Override // com.yandex.mobile.ads.impl.tg1
    public final Map<String, Object> a(long j4) {
        LinkedHashMap linkedHashMapP = C2078B.p(new b9.l("duration", Long.valueOf(j4)), new b9.l("status", this.f32915a));
        fb2 fb2Var = this.f32916b;
        if (fb2Var != null) {
            linkedHashMapP.put("failure_reason", fb2Var.a());
        }
        return linkedHashMapP;
    }
}
