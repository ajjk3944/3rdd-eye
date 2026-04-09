package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.vi0;

/* loaded from: classes3.dex */
public final class t81 implements vi0.a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f33479a;

    public t81(a8<?> adResponse) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        this.f33479a = kotlin.jvm.internal.l.b(adResponse.E(), s81.f32895c.a()) || kotlin.jvm.internal.l.b(adResponse.E(), s81.f32896d.a());
    }

    @Override // com.yandex.mobile.ads.impl.vi0.a
    public final boolean a() {
        return this.f33479a;
    }
}
