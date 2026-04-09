package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import f9.InterfaceC4347e;

@h9.e(c = "com.monetization.ads.nativeads.creator.videowrapper.NativeAdBlockVideoWrapperLoader", f = "NativeAdBlockVideoWrapperLoader.kt", l = {56}, m = "loadVideoWrapperAsset")
/* loaded from: classes3.dex */
final class m41 extends h9.c {

    /* renamed from: b, reason: collision with root package name */
    ag f30200b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f30201c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ n41 f30202d;

    /* renamed from: e, reason: collision with root package name */
    int f30203e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m41(n41 n41Var, InterfaceC4347e<? super m41> interfaceC4347e) {
        super(interfaceC4347e);
        this.f30202d = n41Var;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f30201c = obj;
        this.f30203e |= RecyclerView.UNDEFINED_DURATION;
        return n41.a(this.f30202d, (ag) null, this);
    }
}
