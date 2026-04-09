package com.yandex.mobile.ads.impl;

import b9.C1992A;
import com.yandex.mobile.ads.impl.z41;
import f9.InterfaceC4347e;

@h9.e(c = "com.monetization.ads.nativeads.creator.NativeAdCreationManager$NativeAdCreationRunnable$ResourcesLoaderListener$onLoaded$1", f = "NativeAdCreationManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class y41 extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ z41 f35622b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j41 f35623c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ej0 f35624d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ z41.a f35625e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ z41.a.C0427a f35626f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y41(z41 z41Var, j41 j41Var, ej0 ej0Var, z41.a aVar, z41.a.C0427a c0427a, InterfaceC4347e<? super y41> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f35622b = z41Var;
        this.f35623c = j41Var;
        this.f35624d = ej0Var;
        this.f35625e = aVar;
        this.f35626f = c0427a;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new y41(this.f35622b, this.f35623c, this.f35624d, this.f35625e, this.f35626f, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((y41) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        b9.n.b(obj);
        this.f35622b.f36186e.a(this.f35622b.f36185d, this.f35623c, this.f35624d, this.f35625e.f36190d, this.f35626f.f36194a);
        return C1992A.f18074a;
    }
}
