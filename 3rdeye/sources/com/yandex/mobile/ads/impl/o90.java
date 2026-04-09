package com.yandex.mobile.ads.impl;

import A9.C0575f;
import C9.g;
import D9.InterfaceC0644f;
import D9.InterfaceC0645g;
import b9.C1992A;
import c9.C2099t;
import com.yandex.mobile.ads.impl.h90;
import com.yandex.mobile.ads.impl.z90;
import f9.C4351i;
import f9.InterfaceC4347e;
import f9.InterfaceC4350h;

/* loaded from: classes3.dex */
public final class o90 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0644f<h90> f31299a;

    /* renamed from: b, reason: collision with root package name */
    private final y90 f31300b;

    /* renamed from: c, reason: collision with root package name */
    private final A9.E f31301c;

    /* renamed from: d, reason: collision with root package name */
    private final K9.a f31302d;

    /* renamed from: e, reason: collision with root package name */
    private final D9.y<z90> f31303e;

    /* renamed from: f, reason: collision with root package name */
    private final D9.I<ga0> f31304f;

    @h9.e(c = "com.monetization.ads.feed.domain.FeedItemListUseCase$invoke$1", f = "FeedItemListUseCase.kt", l = {41}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f31305b;

        /* renamed from: com.yandex.mobile.ads.impl.o90$a$a, reason: collision with other inner class name */
        public static final class C0414a<T> implements InterfaceC0645g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ o90 f31307a;

            public C0414a(o90 o90Var) {
                this.f31307a = o90Var;
            }

            @Override // D9.InterfaceC0645g
            public final Object emit(Object obj, InterfaceC4347e interfaceC4347e) {
                if (!(((h90) obj) instanceof h90.a)) {
                    return C1992A.f18074a;
                }
                Object objA = o90.a(this.f31307a, interfaceC4347e);
                return objA == g9.a.COROUTINE_SUSPENDED ? objA : C1992A.f18074a;
            }
        }

        public a(InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return o90.this.new a(interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return o90.this.new a(interfaceC4347e).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f31305b;
            if (i == 0) {
                b9.n.b(obj);
                InterfaceC0644f interfaceC0644f = o90.this.f31299a;
                C0414a c0414a = new C0414a(o90.this);
                this.f31305b = 1;
                if (interfaceC0644f.b(c0414a, this) == aVar) {
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

    public o90(D9.x feedInputEventFlow, y90 repo, A9.E coroutineScope) {
        kotlin.jvm.internal.l.f(feedInputEventFlow, "feedInputEventFlow");
        kotlin.jvm.internal.l.f(repo, "repo");
        kotlin.jvm.internal.l.f(coroutineScope, "coroutineScope");
        this.f31299a = feedInputEventFlow;
        this.f31300b = repo;
        this.f31301c = coroutineScope;
        this.f31302d = K9.f.a();
        z90.b bVar = z90.b.f36252a;
        D9.J jC = D9.E.c(bVar);
        this.f31303e = jC;
        D9.u uVar = new D9.u(jC, repo.a(), new n90(null));
        Object obj = D9.H.f1158a;
        ga0 ga0Var = new ga0(bVar, C2099t.f18581b);
        C9.g.f1000W7.getClass();
        g.a aVar = g.a.f1001a;
        C9.a aVar2 = C9.a.SUSPEND;
        D9.G g10 = new D9.G(uVar, C4351i.f37871b);
        D9.J jC2 = D9.E.c(ga0Var);
        this.f31304f = new D9.A(jC2, C0575f.d(coroutineScope, (InterfaceC4350h) g10.f1157c, obj.equals(obj) ? A9.G.DEFAULT : A9.G.UNDISPATCHED, new D9.s((InterfaceC0644f) g10.f1156b, jC2, ga0Var, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.yandex.mobile.ads.impl.o90 r5, f9.InterfaceC4347e r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof com.yandex.mobile.ads.impl.p90
            if (r0 == 0) goto L16
            r0 = r6
            com.yandex.mobile.ads.impl.p90 r0 = (com.yandex.mobile.ads.impl.p90) r0
            int r1 = r0.f31684e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f31684e = r1
            goto L1b
        L16:
            com.yandex.mobile.ads.impl.p90 r0 = new com.yandex.mobile.ads.impl.p90
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f31682c
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f31684e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.yandex.mobile.ads.impl.o90 r5 = r0.f31681b
            b9.n.b(r6)
        L2b:
            r2 = r5
            goto L5e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            b9.n.b(r6)
            K9.a r6 = r5.f31302d
            boolean r6 = r6.tryLock()
            if (r6 == 0) goto L97
            D9.y<com.yandex.mobile.ads.impl.z90> r6 = r5.f31303e
        L42:
            java.lang.Object r2 = r6.getValue()
            r4 = r2
            com.yandex.mobile.ads.impl.z90 r4 = (com.yandex.mobile.ads.impl.z90) r4
            com.yandex.mobile.ads.impl.z90$d r4 = com.yandex.mobile.ads.impl.z90.d.f36254a
            boolean r2 = r6.a(r2, r4)
            if (r2 == 0) goto L42
            com.yandex.mobile.ads.impl.y90 r6 = r5.f31300b
            r0.f31681b = r5
            r0.f31684e = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L2b
            return r1
        L5e:
            com.yandex.mobile.ads.impl.tk1 r6 = (com.yandex.mobile.ads.impl.tk1) r6
            boolean r5 = r6 instanceof com.yandex.mobile.ads.impl.tk1.a
            if (r5 == 0) goto L80
            D9.y<com.yandex.mobile.ads.impl.z90> r5 = r2.f31303e
        L66:
            java.lang.Object r0 = r5.getValue()
            r1 = r0
            com.yandex.mobile.ads.impl.z90 r1 = (com.yandex.mobile.ads.impl.z90) r1
            com.yandex.mobile.ads.impl.z90$a r1 = new com.yandex.mobile.ads.impl.z90$a
            r3 = r6
            com.yandex.mobile.ads.impl.tk1$a r3 = (com.yandex.mobile.ads.impl.tk1.a) r3
            com.yandex.mobile.ads.impl.i3 r3 = r3.a()
            r1.<init>(r3)
            boolean r0 = r5.a(r0, r1)
            if (r0 == 0) goto L66
            goto L91
        L80:
            D9.y<com.yandex.mobile.ads.impl.z90> r4 = r2.f31303e
        L82:
            java.lang.Object r5 = r4.getValue()
            r6 = r5
            com.yandex.mobile.ads.impl.z90 r6 = (com.yandex.mobile.ads.impl.z90) r6
            com.yandex.mobile.ads.impl.z90$c r6 = com.yandex.mobile.ads.impl.z90.c.f36253a
            boolean r5 = r4.a(r5, r6)
            if (r5 == 0) goto L82
        L91:
            K9.a r5 = r2.f31302d
            r6 = 0
            r5.c(r6)
        L97:
            b9.A r5 = b9.C1992A.f18074a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.o90.a(com.yandex.mobile.ads.impl.o90, f9.e):java.lang.Object");
    }

    public o90(D9.x xVar, y90 y90Var) {
        this(xVar, y90Var, A9.F.a(A9.U.f211a.plus(C0575f.a())));
    }

    public final D9.I<ga0> a() {
        C0575f.e(this.f31301c, null, null, new a(null), 3);
        return this.f31304f;
    }
}
