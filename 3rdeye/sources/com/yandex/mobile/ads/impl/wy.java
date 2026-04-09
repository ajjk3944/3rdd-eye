package com.yandex.mobile.ads.impl;

import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
final class wy extends kotlin.jvm.internal.m implements InterfaceC5480a<Long> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ xy f35111b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy(xy xyVar) {
        super(0);
        this.f35111b = xyVar;
    }

    @Override // p9.InterfaceC5480a
    public final Long invoke() {
        return Long.valueOf(this.f35111b.f35539a.toMillis(xy.a(this.f35111b)));
    }
}
