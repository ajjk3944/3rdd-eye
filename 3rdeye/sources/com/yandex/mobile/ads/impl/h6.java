package com.yandex.mobile.ads.impl;

import b9.C1992A;
import java.util.Map;

/* loaded from: classes3.dex */
final class h6 extends kotlin.jvm.internal.m implements p9.l<R9.A, C1992A> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Map.Entry<String, o6> f28095b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(Map.Entry<String, o6> entry) {
        super(1);
        this.f28095b = entry;
    }

    @Override // p9.l
    public final C1992A invoke(R9.A a10) {
        R9.A putJsonObject = a10;
        kotlin.jvm.internal.l.f(putJsonObject, "$this$putJsonObject");
        T1.B.t(putJsonObject, "usagePercent", Integer.valueOf(this.f28095b.getValue().b()));
        T1.B.s(putJsonObject, "isDisabled", Boolean.valueOf(this.f28095b.getValue().a()));
        return C1992A.f18074a;
    }
}
