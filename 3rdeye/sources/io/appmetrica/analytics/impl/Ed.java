package io.appmetrica.analytics.impl;

import java.util.Map;

/* loaded from: classes3.dex */
public final class Ed extends kotlin.jvm.internal.m implements p9.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5097yb f39365a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ed(C5097yb c5097yb) {
        super(1);
        this.f39365a = c5097yb;
    }

    @Override // p9.l
    public final Object invoke(Object obj) {
        C4922rd c4922rd = (C4922rd) ((Map.Entry) obj).getValue();
        return c4922rd.f41572b.parse(this.f39365a);
    }
}
