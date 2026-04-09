package com.yandex.mobile.ads.impl;

import com.singular.sdk.internal.Constants;
import com.yandex.mobile.ads.impl.yc2;
import java.util.Map;

/* loaded from: classes3.dex */
public final class kl0 implements yc2.a {

    /* renamed from: a, reason: collision with root package name */
    private final m7 f29696a;

    public kl0(zs coreInstreamAdBreak) {
        kotlin.jvm.internal.l.f(coreInstreamAdBreak, "coreInstreamAdBreak");
        this.f29696a = new m7(coreInstreamAdBreak.a());
    }

    @Override // com.yandex.mobile.ads.impl.yc2.a
    public final Map<String, Object> a() {
        jp1 jp1Var = new jp1((Map) null, 3);
        jp1Var.b(ns.f30992h.b(), Constants.ADMON_AD_TYPE);
        jp1Var.b(this.f29696a.d(), "page_id");
        jp1Var.b(this.f29696a.b(), "category_id");
        jp1Var.b(this.f29696a.c(), "imp_id");
        return jp1Var.b();
    }
}
