package com.yandex.mobile.ads.impl;

import A9.C0575f;
import A9.C0585k;
import A9.C0597q;
import A9.InterfaceC0595p;
import android.os.Handler;
import b9.C1992A;
import f9.InterfaceC4347e;
import f9.InterfaceC4350h;

/* loaded from: classes3.dex */
public final class td {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4350h f33542a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f33543b;

    @h9.e(c = "com.monetization.ads.core.anr.AnrChecker$isAlive$2", f = "AnrChecker.kt", l = {20}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super Boolean>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f33544b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f33546d;

        @h9.e(c = "com.monetization.ads.core.anr.AnrChecker$isAlive$2$2", f = "AnrChecker.kt", l = {20}, m = "invokeSuspend")
        /* renamed from: com.yandex.mobile.ads.impl.td$a$a, reason: collision with other inner class name */
        public static final class C0420a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f33547b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC0595p<C1992A> f33548c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0420a(InterfaceC0595p<C1992A> interfaceC0595p, InterfaceC4347e<? super C0420a> interfaceC4347e) {
                super(2, interfaceC4347e);
                this.f33548c = interfaceC0595p;
            }

            @Override // h9.AbstractC4424a
            public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                return new C0420a(this.f33548c, interfaceC4347e);
            }

            @Override // p9.p
            public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
                return new C0420a(this.f33548c, interfaceC4347e).invokeSuspend(C1992A.f18074a);
            }

            @Override // h9.AbstractC4424a
            public final Object invokeSuspend(Object obj) {
                g9.a aVar = g9.a.COROUTINE_SUSPENDED;
                int i = this.f33547b;
                if (i == 0) {
                    b9.n.b(obj);
                    InterfaceC0595p<C1992A> interfaceC0595p = this.f33548c;
                    this.f33547b = 1;
                    if (interfaceC0595p.l(this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j4, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f33546d = j4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(InterfaceC0595p interfaceC0595p) {
            interfaceC0595p.q0(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return td.this.new a(this.f33546d, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super Boolean> interfaceC4347e) {
            return td.this.new a(this.f33546d, interfaceC4347e).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f33544b;
            if (i == 0) {
                b9.n.b(obj);
                C0597q c0597q = new C0597q();
                td.this.f33543b.post(new Z(c0597q, 2));
                long j4 = this.f33546d;
                C0420a c0420a = new C0420a(c0597q, null);
                this.f33544b = 1;
                obj = C0585k.c(j4, c0420a, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
            }
            return Boolean.valueOf(obj != null);
        }
    }

    public td(InterfaceC4350h coroutineContext, Handler mainHandler) {
        kotlin.jvm.internal.l.f(coroutineContext, "coroutineContext");
        kotlin.jvm.internal.l.f(mainHandler, "mainHandler");
        this.f33542a = coroutineContext;
        this.f33543b = mainHandler;
    }

    public final Object a(long j4, InterfaceC4347e<? super Boolean> interfaceC4347e) {
        return C0575f.h(this.f33542a, new a(j4, null), interfaceC4347e);
    }
}
