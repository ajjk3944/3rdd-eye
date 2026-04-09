package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import f9.InterfaceC4347e;

@h9.e(c = "com.monetization.ads.feed.domain.FeedItemListUseCase", f = "FeedItemListUseCase.kt", l = {54}, m = "loadMore")
/* loaded from: classes3.dex */
final class p90 extends h9.c {

    /* renamed from: b, reason: collision with root package name */
    o90 f31681b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f31682c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ o90 f31683d;

    /* renamed from: e, reason: collision with root package name */
    int f31684e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p90(o90 o90Var, InterfaceC4347e<? super p90> interfaceC4347e) {
        super(interfaceC4347e);
        this.f31683d = o90Var;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f31682c = obj;
        this.f31684e |= RecyclerView.UNDEFINED_DURATION;
        return o90.a(this.f31683d, this);
    }
}
