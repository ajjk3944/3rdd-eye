package com.yandex.mobile.ads.impl;

import b9.C1992A;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
final class gl2 extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ hl2 f27813b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f27814c = "Cannot load bidder token. Token generation failed";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl2(hl2 hl2Var) {
        super(0);
        this.f27813b = hl2Var;
    }

    @Override // p9.InterfaceC5480a
    public final C1992A invoke() {
        this.f27813b.f28261a.onBidderTokenFailedToLoad(this.f27814c);
        return C1992A.f18074a;
    }
}
