package com.yandex.mobile.ads.impl;

import D9.InterfaceC0644f;
import D9.InterfaceC0645g;
import b9.C1992A;
import f9.InterfaceC4347e;

@h9.e(c = "com.monetization.ads.nativeads.creator.NativeImagesLoader$loadInBackground$1", f = "NativeImagesLoader.kt", l = {79}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class x81 extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: b, reason: collision with root package name */
    int f35216b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC0644f<ui0> f35217c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ej0 f35218d;

    public static final class a<T> implements InterfaceC0645g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ej0 f35219a;

        public a(ej0 ej0Var) {
            this.f35219a = ej0Var;
        }

        @Override // D9.InterfaceC0645g
        public final Object emit(Object obj, InterfaceC4347e interfaceC4347e) {
            ui0 ui0Var = (ui0) obj;
            this.f35219a.a(ui0Var.b(), ui0Var.a());
            return C1992A.f18074a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x81(InterfaceC0644f<ui0> interfaceC0644f, ej0 ej0Var, InterfaceC4347e<? super x81> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f35217c = interfaceC0644f;
        this.f35218d = ej0Var;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new x81(this.f35217c, this.f35218d, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return new x81(this.f35217c, this.f35218d, interfaceC4347e).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f35216b;
        if (i == 0) {
            b9.n.b(obj);
            InterfaceC0644f<ui0> interfaceC0644f = this.f35217c;
            a aVar2 = new a(this.f35218d);
            this.f35216b = 1;
            if (interfaceC0644f.b(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
        }
        return C1992A.f18074a;
    }
}
