package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import f9.InterfaceC4347e;

@h9.e(c = "com.monetization.ads.nativeads.creator.videowrapper.NativeWrapperVideoLoader", f = "NativeWrapperVideoLoader.kt", l = {62}, m = "loadWrapperVideoAdsInfo")
/* loaded from: classes3.dex */
final class dc1 extends h9.c {

    /* renamed from: b, reason: collision with root package name */
    fc1 f26126b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f26127c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ fc1 f26128d;

    /* renamed from: e, reason: collision with root package name */
    int f26129e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc1(fc1 fc1Var, InterfaceC4347e<? super dc1> interfaceC4347e) {
        super(interfaceC4347e);
        this.f26128d = fc1Var;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f26127c = obj;
        this.f26129e |= RecyclerView.UNDEFINED_DURATION;
        return fc1.a(this.f26128d, null, this);
    }
}
