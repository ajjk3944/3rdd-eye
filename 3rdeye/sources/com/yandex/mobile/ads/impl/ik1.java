package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import f9.InterfaceC4347e;

@h9.e(c = "com.monetization.ads.base.mediation.prefetch.PrefetchedMediationNetworksDataLoader", f = "PrefetchedMediationNetworksDataLoader.kt", l = {55, 59}, m = "loadNetworksMediationDataInternal")
/* loaded from: classes3.dex */
final class ik1 extends h9.c {

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f28725b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ lk1 f28726c;

    /* renamed from: d, reason: collision with root package name */
    int f28727d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik1(lk1 lk1Var, InterfaceC4347e<? super ik1> interfaceC4347e) {
        super(interfaceC4347e);
        this.f28726c = lk1Var;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f28725b = obj;
        this.f28727d |= RecyclerView.UNDEFINED_DURATION;
        return lk1.a(0L, null, null, this.f28726c, null, this);
    }
}
