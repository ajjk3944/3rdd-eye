package com.yandex.mobile.ads.impl;

import b9.C1992A;
import f9.InterfaceC4347e;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@h9.e(c = "com.monetization.ads.nativeads.creator.videowrapper.NativeAdBlockVideoWrapperLoader$updateNativeAdsWithWrappers$2", f = "NativeAdBlockVideoWrapperLoader.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class o41 extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super List<? extends w31>>, Object> {

    /* renamed from: b, reason: collision with root package name */
    n41 f31164b;

    /* renamed from: c, reason: collision with root package name */
    Collection f31165c;

    /* renamed from: d, reason: collision with root package name */
    Iterator f31166d;

    /* renamed from: e, reason: collision with root package name */
    w31 f31167e;

    /* renamed from: f, reason: collision with root package name */
    Collection f31168f;

    /* renamed from: g, reason: collision with root package name */
    int f31169g;

    /* renamed from: h, reason: collision with root package name */
    private /* synthetic */ Object f31170h;
    final /* synthetic */ List<w31> i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ n41 f31171j;

    @h9.e(c = "com.monetization.ads.nativeads.creator.videowrapper.NativeAdBlockVideoWrapperLoader$updateNativeAdsWithWrappers$2$1$newAssets$1$1", f = "NativeAdBlockVideoWrapperLoader.kt", l = {43}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super ag<?>>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f31172b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n41 f31173c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ag<?> f31174d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n41 n41Var, ag<?> agVar, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f31173c = n41Var;
            this.f31174d = agVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f31173c, this.f31174d, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super ag<?>> interfaceC4347e) {
            return new a(this.f31173c, this.f31174d, interfaceC4347e).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) throws Throwable {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f31172b;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
                return obj;
            }
            b9.n.b(obj);
            n41 n41Var = this.f31173c;
            ag<?> agVar = this.f31174d;
            this.f31172b = 1;
            Object objA = n41.a(n41Var, agVar, this);
            return objA == aVar ? aVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o41(List<w31> list, n41 n41Var, InterfaceC4347e<? super o41> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.i = list;
        this.f31171j = n41Var;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        o41 o41Var = new o41(this.i, this.f31171j, interfaceC4347e);
        o41Var.f31170h = obj;
        return o41Var;
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super List<? extends w31>> interfaceC4347e) {
        return ((o41) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00e9 -> B:40:0x00ea). Please report as a decompilation issue!!! */
    @Override // h9.AbstractC4424a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.o41.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
