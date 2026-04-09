package com.yandex.mobile.ads.impl;

import D9.InterfaceC0645g;
import b9.C1992A;
import b9.C1998e;
import c9.C2097r;
import com.yandex.mobile.ads.impl.z90;
import f9.InterfaceC4347e;
import java.util.concurrent.CancellationException;

@h9.e(c = "com.monetization.ads.feed.ui.FeedAdapterInternal$observePagedData$1", f = "FeedAdapterInternal.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class c90 extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: b, reason: collision with root package name */
    int f25573b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f25574c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ b90 f25575d;

    public static final class a<T> implements InterfaceC0645g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b90 f25576a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A9.E f25577b;

        public a(b90 b90Var, A9.E e4) {
            this.f25576a = b90Var;
            this.f25577b = e4;
        }

        @Override // D9.InterfaceC0645g
        public final Object emit(Object obj, InterfaceC4347e interfaceC4347e) {
            ga0 ga0Var = (ga0) obj;
            z90 z90VarC = ga0Var.c();
            if (z90VarC instanceof z90.a) {
                C4128i3 c4128i3A = ((z90.a) ga0Var.c()).a();
                this.f25576a.submitList(ga0Var.b());
                A9.E e4 = this.f25577b;
                CancellationException cancellationException = new CancellationException(c4128i3A.d());
                cancellationException.initCause(null);
                A9.F.b(e4, cancellationException);
            } else if (z90VarC instanceof z90.c) {
                this.f25576a.submitList(C2097r.z0(ga0Var.b(), ca0.f25580a));
            } else if (z90VarC instanceof z90.b) {
                this.f25576a.submitList(ga0Var.b());
            } else if (z90VarC instanceof z90.d) {
                if (ga0Var.b().isEmpty()) {
                    this.f25576a.submitList(ga0Var.b());
                } else {
                    this.f25576a.submitList(C2097r.z0(ga0Var.b(), ca0.f25580a));
                }
            }
            return C1992A.f18074a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c90(b90 b90Var, InterfaceC4347e<? super c90> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f25575d = b90Var;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        c90 c90Var = new c90(this.f25575d, interfaceC4347e);
        c90Var.f25574c = obj;
        return c90Var;
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        c90 c90Var = new c90(this.f25575d, interfaceC4347e);
        c90Var.f25574c = e4;
        return c90Var.invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f25573b;
        if (i == 0) {
            b9.n.b(obj);
            A9.E e4 = (A9.E) this.f25574c;
            D9.I<ga0> iC = this.f25575d.f25138a.c();
            a aVar2 = new a(this.f25575d, e4);
            this.f25573b = 1;
            if (iC.b(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
        }
        throw new C1998e();
    }
}
