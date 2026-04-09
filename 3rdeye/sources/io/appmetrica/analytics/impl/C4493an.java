package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.HashMap;
import p9.InterfaceC5480a;

/* renamed from: io.appmetrica.analytics.impl.an, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4493an extends kotlin.jvm.internal.m implements InterfaceC5480a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4519bn f40552a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4493an(C4519bn c4519bn) {
        super(0);
        this.f40552a = c4519bn;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        HashMap map = new HashMap();
        C4519bn c4519bn = this.f40552a;
        String strA = c4519bn.f40594a.a();
        if (strA != null) {
        }
        String strA2 = c4519bn.f40595b.a();
        if (strA2 != null) {
            map.put(AdRevenueConstants.PLUGIN_SUPPORTED_SOURCES_KEY, strA2);
        }
        return map;
    }
}
