package io.appmetrica.analytics.billingv6.impl;

import b9.C1992A;
import java.util.LinkedHashMap;
import java.util.Map;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class h extends kotlin.jvm.internal.m implements InterfaceC5480a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f38839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f38840b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f38841c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LinkedHashMap linkedHashMap, Map map, i iVar) {
        super(0);
        this.f38839a = linkedHashMap;
        this.f38840b = map;
        this.f38841c = iVar;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        Map map = this.f38839a;
        Map map2 = this.f38840b;
        i iVar = this.f38841c;
        m.a(map, map2, iVar.f38845d, iVar.f38844c.getBillingInfoManager());
        return C1992A.f18074a;
    }
}
