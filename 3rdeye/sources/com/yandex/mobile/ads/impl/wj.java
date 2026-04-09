package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import f9.InterfaceC4347e;

@h9.e(c = "com.monetization.ads.base.BaseAdLoadController", f = "BaseAdLoadController.kt", l = {147}, m = "initializeSdk")
/* loaded from: classes3.dex */
final class wj extends h9.c {

    /* renamed from: b, reason: collision with root package name */
    vj f34995b;

    /* renamed from: c, reason: collision with root package name */
    c82 f34996c;

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f34997d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ vj<Object> f34998e;

    /* renamed from: f, reason: collision with root package name */
    int f34999f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj(vj<Object> vjVar, InterfaceC4347e<? super wj> interfaceC4347e) {
        super(interfaceC4347e);
        this.f34998e = vjVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f34997d = obj;
        this.f34999f |= RecyclerView.UNDEFINED_DURATION;
        return vj.a(this.f34998e, null, this);
    }
}
