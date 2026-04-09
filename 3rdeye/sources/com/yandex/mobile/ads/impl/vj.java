package com.yandex.mobile.ads.impl;

import A9.C0575f;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import b9.C1992A;
import com.monetization.ads.mediation.base.model.MediatedAdObjectInfo;
import com.yandex.mobile.ads.impl.C4142k3;
import com.yandex.mobile.ads.impl.ah1;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.ip1;
import com.yandex.mobile.ads.impl.kk;
import com.yandex.mobile.ads.impl.x22;
import f9.InterfaceC4347e;
import java.util.Objects;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public abstract class vj<T> implements ah1.b, lo, kk.a<a8<T>>, yp1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f34555a;

    /* renamed from: b, reason: collision with root package name */
    private final C4198s4 f34556b;

    /* renamed from: c, reason: collision with root package name */
    private final C4072a3 f34557c;

    /* renamed from: d, reason: collision with root package name */
    private final A9.E f34558d;

    /* renamed from: e, reason: collision with root package name */
    private final x6 f34559e;

    /* renamed from: f, reason: collision with root package name */
    private final Handler f34560f;

    /* renamed from: g, reason: collision with root package name */
    private final c82 f34561g;

    /* renamed from: h, reason: collision with root package name */
    private final zw1 f34562h;
    private final xh i;

    /* renamed from: j, reason: collision with root package name */
    private final sr0 f34563j;

    /* renamed from: k, reason: collision with root package name */
    private final jv1 f34564k;

    /* renamed from: l, reason: collision with root package name */
    private final gf0 f34565l;

    /* renamed from: m, reason: collision with root package name */
    private final ak1 f34566m;

    /* renamed from: n, reason: collision with root package name */
    private final x22 f34567n;

    /* renamed from: o, reason: collision with root package name */
    private final oq1 f34568o;

    /* renamed from: p, reason: collision with root package name */
    private final ah1 f34569p;

    /* renamed from: q, reason: collision with root package name */
    private final C4142k3 f34570q;

    /* renamed from: r, reason: collision with root package name */
    private EnumC4219v4 f34571r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f34572s;

    /* renamed from: t, reason: collision with root package name */
    private long f34573t;

    /* renamed from: u, reason: collision with root package name */
    private InterfaceC4107f3 f34574u;

    /* renamed from: v, reason: collision with root package name */
    private a8<T> f34575v;

    @h9.e(c = "com.monetization.ads.base.BaseAdLoadController$fetchRequest$1", f = "BaseAdLoadController.kt", l = {}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f34576b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ vj<T> f34577c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c82 f34578d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(vj<T> vjVar, c82 c82Var, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f34577c = vjVar;
            this.f34578d = c82Var;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            a aVar = new a(this.f34577c, this.f34578d, interfaceC4347e);
            aVar.f34576b = obj;
            return aVar;
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            b9.n.b(obj);
            A9.E e4 = (A9.E) this.f34576b;
            if (!this.f34577c.a()) {
                String strA = this.f34578d.a(this.f34577c.f());
                if (strA == null || strA.length() == 0) {
                    this.f34577c.b(i7.u());
                } else {
                    C4198s4 c4198s4I = this.f34577c.i();
                    EnumC4191r4 enumC4191r4 = EnumC4191r4.f32469s;
                    uj.a(c4198s4I, enumC4191r4, "adLoadingPhaseType", enumC4191r4, null);
                    this.f34577c.f().a(this.f34578d.a());
                    C4072a3 c4072a3F = this.f34577c.f();
                    oq1 oq1Var = ((vj) this.f34577c).f34568o;
                    Context context = this.f34577c.l();
                    oq1Var.getClass();
                    kotlin.jvm.internal.l.f(context, "context");
                    c4072a3F.a(context.getResources().getConfiguration().orientation);
                    tj<T> tjVarA = this.f34577c.a(strA, this.f34578d.a(this.f34577c.l(), this.f34577c.f(), ((vj) this.f34577c).f34562h));
                    tjVarA.b((Object) aa.a(e4));
                    this.f34577c.g().a(tjVarA);
                }
            }
            return C1992A.f18074a;
        }
    }

    @h9.e(c = "com.monetization.ads.base.BaseAdLoadController$loadBiddingData$1", f = "BaseAdLoadController.kt", l = {185, 186}, m = "invokeSuspend")
    public static final class b extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: b, reason: collision with root package name */
        C4072a3 f34579b;

        /* renamed from: c, reason: collision with root package name */
        int f34580c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f34581d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ vj<T> f34582e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ c82 f34583f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ zk f34584g;

        @h9.e(c = "com.monetization.ads.base.BaseAdLoadController$loadBiddingData$1$headerBiddingData$1", f = "BaseAdLoadController.kt", l = {182}, m = "invokeSuspend")
        public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super String>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f34585b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ vj<T> f34586c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ zk f34587d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(vj<T> vjVar, zk zkVar, InterfaceC4347e<? super a> interfaceC4347e) {
                super(2, interfaceC4347e);
                this.f34586c = vjVar;
                this.f34587d = zkVar;
            }

            @Override // h9.AbstractC4424a
            public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                return new a(this.f34586c, this.f34587d, interfaceC4347e);
            }

            @Override // p9.p
            public final Object invoke(A9.E e4, InterfaceC4347e<? super String> interfaceC4347e) {
                return new a(this.f34586c, this.f34587d, interfaceC4347e).invokeSuspend(C1992A.f18074a);
            }

            @Override // h9.AbstractC4424a
            public final Object invokeSuspend(Object obj) {
                g9.a aVar = g9.a.COROUTINE_SUSPENDED;
                int i = this.f34585b;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b9.n.b(obj);
                    return obj;
                }
                b9.n.b(obj);
                gf0 gf0Var = ((vj) this.f34586c).f34565l;
                Context contextL = this.f34586c.l();
                zk zkVar = this.f34587d;
                this.f34585b = 1;
                Object objA = gf0Var.a(contextL, zkVar, this);
                return objA == aVar ? aVar : objA;
            }
        }

        @h9.e(c = "com.monetization.ads.base.BaseAdLoadController$loadBiddingData$1$prefetchedMediationData$1", f = "BaseAdLoadController.kt", l = {179}, m = "invokeSuspend")
        /* renamed from: com.yandex.mobile.ads.impl.vj$b$b, reason: collision with other inner class name */
        public static final class C0423b extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super String>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f34588b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ vj<T> f34589c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ zk f34590d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0423b(vj<T> vjVar, zk zkVar, InterfaceC4347e<? super C0423b> interfaceC4347e) {
                super(2, interfaceC4347e);
                this.f34589c = vjVar;
                this.f34590d = zkVar;
            }

            @Override // h9.AbstractC4424a
            public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                return new C0423b(this.f34589c, this.f34590d, interfaceC4347e);
            }

            @Override // p9.p
            public final Object invoke(A9.E e4, InterfaceC4347e<? super String> interfaceC4347e) {
                return new C0423b(this.f34589c, this.f34590d, interfaceC4347e).invokeSuspend(C1992A.f18074a);
            }

            @Override // h9.AbstractC4424a
            public final Object invokeSuspend(Object obj) {
                g9.a aVar = g9.a.COROUTINE_SUSPENDED;
                int i = this.f34588b;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b9.n.b(obj);
                    return obj;
                }
                b9.n.b(obj);
                ak1 ak1Var = ((vj) this.f34589c).f34566m;
                Context contextL = this.f34589c.l();
                zk zkVar = this.f34590d;
                this.f34588b = 1;
                Object objA = ak1Var.a(contextL, zkVar, this);
                return objA == aVar ? aVar : objA;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(vj<T> vjVar, c82 c82Var, zk zkVar, InterfaceC4347e<? super b> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f34582e = vjVar;
            this.f34583f = c82Var;
            this.f34584g = zkVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            b bVar = new b(this.f34582e, this.f34583f, this.f34584g, interfaceC4347e);
            bVar.f34581d = obj;
            return bVar;
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((b) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) throws Throwable {
            A9.L l5;
            C4072a3 c4072a3;
            C4072a3 c4072a32;
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f34580c;
            if (i == 0) {
                b9.n.b(obj);
                A9.E e4 = (A9.E) this.f34581d;
                A9.M mB = C0575f.b(e4, null, new C0423b(this.f34582e, this.f34584g, null), 3);
                A9.M mB2 = C0575f.b(e4, null, new a(this.f34582e, this.f34584g, null), 3);
                C4072a3 c4072a3F = this.f34582e.f();
                this.f34581d = mB;
                this.f34579b = c4072a3F;
                this.f34580c = 1;
                obj = mB2.t(this);
                if (obj != aVar) {
                    l5 = mB;
                    c4072a3 = c4072a3F;
                }
                return aVar;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c4072a32 = (C4072a3) this.f34581d;
                b9.n.b(obj);
                c4072a32.e((String) obj);
                this.f34582e.i().a(EnumC4191r4.f32459h);
                this.f34582e.a(this.f34583f);
                return C1992A.f18074a;
            }
            c4072a3 = this.f34579b;
            l5 = (A9.L) this.f34581d;
            b9.n.b(obj);
            c4072a3.d((String) obj);
            C4072a3 c4072a3F2 = this.f34582e.f();
            this.f34581d = c4072a3F2;
            this.f34579b = null;
            this.f34580c = 2;
            Object objL = l5.l(this);
            if (objL != aVar) {
                c4072a32 = c4072a3F2;
                obj = objL;
                c4072a32.e((String) obj);
                this.f34582e.i().a(EnumC4191r4.f32459h);
                this.f34582e.a(this.f34583f);
                return C1992A.f18074a;
            }
            return aVar;
        }
    }

    @h9.e(c = "com.monetization.ads.base.BaseAdLoadController$onUnverifiedMediatedAdLoaded$1", f = "BaseAdLoadController.kt", l = {260, 262, 266}, m = "invokeSuspend")
    public static final class c extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f34591b;

        /* renamed from: c, reason: collision with root package name */
        int f34592c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ vj<T> f34593d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f34594e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ MediatedAdObjectInfo f34595f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5480a<C1992A> f34596g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ p9.l<String, C1992A> f34597h;

        @h9.e(c = "com.monetization.ads.base.BaseAdLoadController$onUnverifiedMediatedAdLoaded$1$1$1", f = "BaseAdLoadController.kt", l = {}, m = "invokeSuspend")
        public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5480a<C1992A> f34598b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC5480a<C1992A> interfaceC5480a, InterfaceC4347e<? super a> interfaceC4347e) {
                super(2, interfaceC4347e);
                this.f34598b = interfaceC5480a;
            }

            @Override // h9.AbstractC4424a
            public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                return new a(this.f34598b, interfaceC4347e);
            }

            @Override // p9.p
            public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
                return new a(this.f34598b, interfaceC4347e).invokeSuspend(C1992A.f18074a);
            }

            @Override // h9.AbstractC4424a
            public final Object invokeSuspend(Object obj) {
                g9.a aVar = g9.a.COROUTINE_SUSPENDED;
                b9.n.b(obj);
                this.f34598b.invoke();
                return C1992A.f18074a;
            }
        }

        @h9.e(c = "com.monetization.ads.base.BaseAdLoadController$onUnverifiedMediatedAdLoaded$1$2$1", f = "BaseAdLoadController.kt", l = {}, m = "invokeSuspend")
        public static final class b extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ p9.l<String, C1992A> f34599b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Throwable f34600c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(p9.l<? super String, C1992A> lVar, Throwable th, InterfaceC4347e<? super b> interfaceC4347e) {
                super(2, interfaceC4347e);
                this.f34599b = lVar;
                this.f34600c = th;
            }

            @Override // h9.AbstractC4424a
            public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                return new b(this.f34599b, this.f34600c, interfaceC4347e);
            }

            @Override // p9.p
            public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
                return new b(this.f34599b, this.f34600c, interfaceC4347e).invokeSuspend(C1992A.f18074a);
            }

            @Override // h9.AbstractC4424a
            public final Object invokeSuspend(Object obj) {
                g9.a aVar = g9.a.COROUTINE_SUSPENDED;
                b9.n.b(obj);
                this.f34599b.invoke(String.valueOf(this.f34600c.getMessage()));
                return C1992A.f18074a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(vj<T> vjVar, Object obj, MediatedAdObjectInfo mediatedAdObjectInfo, InterfaceC5480a<C1992A> interfaceC5480a, p9.l<? super String, C1992A> lVar, InterfaceC4347e<? super c> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f34593d = vjVar;
            this.f34594e = obj;
            this.f34595f = mediatedAdObjectInfo;
            this.f34596g = interfaceC5480a;
            this.f34597h = lVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new c(this.f34593d, this.f34594e, this.f34595f, this.f34596g, this.f34597h, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((c) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
        
            if (A9.C0575f.h(r5, r6, r8) == r0) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
        @Override // h9.AbstractC4424a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                g9.a r0 = g9.a.COROUTINE_SUSPENDED
                int r1 = r8.f34592c
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L2b
                if (r1 == r5) goto L22
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                b9.n.b(r9)
                goto L80
            L14:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1c:
                java.lang.Object r1 = r8.f34591b
                b9.n.b(r9)
                goto L64
            L22:
                b9.n.b(r9)
                b9.m r9 = (b9.m) r9
                java.lang.Object r9 = r9.f18085b
            L29:
                r1 = r9
                goto L47
            L2b:
                b9.n.b(r9)
                com.yandex.mobile.ads.impl.vj<T> r9 = r8.f34593d
                com.yandex.mobile.ads.impl.x6 r9 = r9.j()
                java.lang.Object r1 = r8.f34594e
                com.yandex.mobile.ads.impl.vj<T> r6 = r8.f34593d
                com.yandex.mobile.ads.impl.a8 r6 = r6.k()
                com.monetization.ads.mediation.base.model.MediatedAdObjectInfo r7 = r8.f34595f
                r8.f34592c = r5
                java.lang.Object r9 = r9.a(r1, r6, r7, r8)
                if (r9 != r0) goto L29
                goto L7f
            L47:
                p9.a<b9.A> r9 = r8.f34596g
                boolean r5 = r1 instanceof b9.m.a
                if (r5 != 0) goto L64
                r5 = r1
                b9.A r5 = (b9.C1992A) r5
                I9.c r5 = A9.U.f211a
                B9.g r5 = F9.q.f1782a
                com.yandex.mobile.ads.impl.vj$c$a r6 = new com.yandex.mobile.ads.impl.vj$c$a
                r6.<init>(r9, r2)
                r8.f34591b = r1
                r8.f34592c = r4
                java.lang.Object r9 = A9.C0575f.h(r5, r6, r8)
                if (r9 != r0) goto L64
                goto L7f
            L64:
                p9.l<java.lang.String, b9.A> r9 = r8.f34597h
                java.lang.Throwable r4 = b9.m.a(r1)
                if (r4 == 0) goto L80
                I9.c r5 = A9.U.f211a
                B9.g r5 = F9.q.f1782a
                com.yandex.mobile.ads.impl.vj$c$b r6 = new com.yandex.mobile.ads.impl.vj$c$b
                r6.<init>(r9, r4, r2)
                r8.f34591b = r1
                r8.f34592c = r3
                java.lang.Object r9 = A9.C0575f.h(r5, r6, r8)
                if (r9 != r0) goto L80
            L7f:
                return r0
            L80:
                b9.A r9 = b9.C1992A.f18074a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.vj.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @h9.e(c = "com.monetization.ads.base.BaseAdLoadController$startAdLoading$1", f = "BaseAdLoadController.kt", l = {139}, m = "invokeSuspend")
    public static final class d extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f34601b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ vj<T> f34602c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c82 f34603d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(vj<T> vjVar, c82 c82Var, InterfaceC4347e<? super d> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f34602c = vjVar;
            this.f34603d = c82Var;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new d(this.f34602c, this.f34603d, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return new d(this.f34602c, this.f34603d, interfaceC4347e).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f34601b;
            if (i == 0) {
                b9.n.b(obj);
                vj<T> vjVar = this.f34602c;
                c82 c82Var = this.f34603d;
                this.f34601b = 1;
                if (vj.a(vjVar, c82Var, this) == aVar) {
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

    public /* synthetic */ vj(Context context, C4198s4 c4198s4, C4072a3 c4072a3, A9.E e4) {
        this(context, c4198s4, c4072a3, e4, new x6(c4072a3, context), new Handler(Looper.getMainLooper()), new z9(), new zw1(), yh.a(), new sr0(context, c4072a3), new jv1(context, c4072a3.q(), e4, c4198s4, null, null, 524272), new gf0(c4072a3), new ak1(c4072a3), x22.a.a(), new oq1(), ah1.f24667h.a(context), new C4149l3());
    }

    public abstract tj<T> a(String str, String str2);

    public final C4072a3 f() {
        return this.f34557c;
    }

    public final C4142k3 g() {
        return this.f34570q;
    }

    public final boolean h() {
        return this.f34571r == EnumC4219v4.f34335b;
    }

    public final C4198s4 i() {
        return this.f34556b;
    }

    public final x6 j() {
        return this.f34559e;
    }

    public final a8<T> k() {
        return this.f34575v;
    }

    public final Context l() {
        return this.f34555a;
    }

    public final Handler m() {
        return this.f34560f;
    }

    public final sr0 n() {
        return this.f34563j;
    }

    public final boolean o() {
        return !this.f34569p.b();
    }

    public final jv1 p() {
        return this.f34564k;
    }

    public final vy1 q() {
        return this.f34557c.r();
    }

    public void r() {
        s();
    }

    public synchronized void s() {
        fp0.d(new Object[0]);
        InterfaceC4107f3 interfaceC4107f3 = this.f34574u;
        if (interfaceC4107f3 != null) {
            interfaceC4107f3.onAdLoaded();
        }
    }

    public final void t() {
        String strE;
        ip1.c cVar = ip1.c.f28829c;
        zy0 zy0VarI = this.f34557c.i();
        if (zy0VarI == null || (strE = zy0VarI.e()) == null) {
            strE = ip1.a.f28774a;
        }
        ja jaVar = new ja(cVar, strE);
        C4198s4 c4198s4 = this.f34556b;
        EnumC4191r4 adLoadingPhaseType = EnumC4191r4.f32454c;
        c4198s4.getClass();
        kotlin.jvm.internal.l.f(adLoadingPhaseType, "adLoadingPhaseType");
        c4198s4.a(adLoadingPhaseType, jaVar, null);
        this.f34556b.a(EnumC4191r4.f32456e);
        this.f34567n.a(kq0.f29755b, this);
        a(EnumC4219v4.f34338e);
        this.f34573t = SystemClock.elapsedRealtime();
    }

    public void u() {
        C4156m3.a(this.f34557c.b().b());
        t();
        s();
    }

    public final void v() {
        getClass().toString();
        fp0.d(new Object[0]);
        this.f34569p.a(this);
    }

    public final void w() {
        getClass().toString();
        fp0.d(new Object[0]);
        this.f34569p.b(this);
    }

    public C4128i3 x() {
        return this.f34563j.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.yandex.mobile.ads.impl.vj r4, com.yandex.mobile.ads.impl.c82 r5, f9.InterfaceC4347e r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof com.yandex.mobile.ads.impl.wj
            if (r0 == 0) goto L16
            r0 = r6
            com.yandex.mobile.ads.impl.wj r0 = (com.yandex.mobile.ads.impl.wj) r0
            int r1 = r0.f34999f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f34999f = r1
            goto L1b
        L16:
            com.yandex.mobile.ads.impl.wj r0 = new com.yandex.mobile.ads.impl.wj
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.f34997d
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f34999f
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            com.yandex.mobile.ads.impl.c82 r5 = r0.f34996c
            com.yandex.mobile.ads.impl.vj r4 = r0.f34995b
            b9.n.b(r6)
            goto L4a
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            b9.n.b(r6)
            com.yandex.mobile.ads.impl.jv1 r6 = r4.f34564k
            com.yandex.mobile.ads.impl.tk0 r2 = com.yandex.mobile.ads.impl.tk0.f33654d
            r0.f34995b = r4
            r0.f34996c = r5
            r0.f34999f = r3
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            com.yandex.mobile.ads.impl.gv1 r6 = (com.yandex.mobile.ads.impl.gv1) r6
            boolean r0 = r6 instanceof com.yandex.mobile.ads.impl.gv1.b
            if (r0 == 0) goto L7f
            com.yandex.mobile.ads.impl.a3 r0 = r4.f34557c
            com.yandex.mobile.ads.impl.gv1$b r6 = (com.yandex.mobile.ads.impl.gv1.b) r6
            com.yandex.mobile.ads.impl.cc r1 = r6.a()
            r0.a(r1)
            com.yandex.mobile.ads.impl.a3 r0 = r4.f34557c
            com.yandex.mobile.ads.impl.j50 r6 = r6.b()
            r0.a(r6)
            java.lang.String r6 = "urlConfigurator"
            kotlin.jvm.internal.l.f(r5, r6)
            com.yandex.mobile.ads.impl.s4 r6 = r4.f34556b
            com.yandex.mobile.ads.impl.r4 r0 = com.yandex.mobile.ads.impl.EnumC4191r4.f32458g
            java.lang.String r1 = "adLoadingPhaseType"
            r2 = 0
            com.yandex.mobile.ads.impl.uj.a(r6, r0, r1, r0, r2)
            A9.E r6 = r4.f34558d
            com.yandex.mobile.ads.impl.xj r0 = new com.yandex.mobile.ads.impl.xj
            r0.<init>(r4, r5, r2)
            r4 = 3
            A9.C0575f.e(r6, r2, r2, r0, r4)
            goto L8c
        L7f:
            boolean r5 = r6 instanceof com.yandex.mobile.ads.impl.gv1.a
            if (r5 == 0) goto L8c
            com.yandex.mobile.ads.impl.gv1$a r6 = (com.yandex.mobile.ads.impl.gv1.a) r6
            com.yandex.mobile.ads.impl.i3 r5 = r6.a()
            r4.b(r5)
        L8c:
            b9.A r4 = b9.C1992A.f18074a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.vj.a(com.yandex.mobile.ads.impl.vj, com.yandex.mobile.ads.impl.c82, f9.e):java.lang.Object");
    }

    public synchronized void b(h7 h7Var) {
        try {
            Objects.toString(this.f34571r);
            fp0.a(new Object[0]);
            if (this.f34571r != EnumC4219v4.f34337d) {
                if (a(h7Var)) {
                    this.f34556b.a();
                    this.f34556b.b(EnumC4191r4.f32456e);
                    this.f34567n.b(kq0.f29755b, this);
                    c(h7Var);
                } else {
                    r();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c() {
        this.i.a();
    }

    public synchronized void d() {
        if (!a()) {
            this.f34572s = true;
            w();
            this.f34564k.a();
            this.i.a();
            this.f34570q.b();
            this.f34560f.removeCallbacksAndMessages(null);
            this.f34567n.a(kq0.f29755b, this);
            this.f34575v = null;
            this.f34559e.d();
            A9.F.b(this.f34558d, null);
            fp0.f(getClass().toString());
        }
    }

    public void e() {
        d();
        getClass().toString();
        fp0.d(new Object[0]);
    }

    public final synchronized void c(h7 h7Var) {
        a(h7Var, this.f34561g);
    }

    public final void b(c82 urlConfigurator) {
        kotlin.jvm.internal.l.f(urlConfigurator, "urlConfigurator");
        du1 du1VarA = ew1.a.a().a(this.f34555a);
        zk zkVarO = du1VarA != null ? du1VarA.o() : null;
        if (zkVarO != null) {
            C4198s4 c4198s4 = this.f34556b;
            EnumC4191r4 enumC4191r4 = EnumC4191r4.f32459h;
            uj.a(c4198s4, enumC4191r4, "adLoadingPhaseType", enumC4191r4, null);
            C0575f.e(this.f34558d, null, null, new b(this, urlConfigurator, zkVarO, null), 3);
            return;
        }
        a(urlConfigurator);
    }

    public vj(Context context, C4198s4 adLoadingPhasesManager, C4072a3 adConfiguration, A9.E coroutineScope, x6 adQualityVerifierController, Handler handler, c82 adUrlConfigurator, zw1 sensitiveModeChecker, xh autograbLoader, sr0 loadStateValidator, jv1 sdkInitializer, gf0 headerBiddingDataLoader, ak1 prefetchedMediationDataLoader, x22 strongReferenceKeepingManager, oq1 resourceUtils, ah1 phoneStateTracker, C4149l3 adFetcherFactory) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.l.f(adQualityVerifierController, "adQualityVerifierController");
        kotlin.jvm.internal.l.f(handler, "handler");
        kotlin.jvm.internal.l.f(adUrlConfigurator, "adUrlConfigurator");
        kotlin.jvm.internal.l.f(sensitiveModeChecker, "sensitiveModeChecker");
        kotlin.jvm.internal.l.f(autograbLoader, "autograbLoader");
        kotlin.jvm.internal.l.f(loadStateValidator, "loadStateValidator");
        kotlin.jvm.internal.l.f(sdkInitializer, "sdkInitializer");
        kotlin.jvm.internal.l.f(headerBiddingDataLoader, "headerBiddingDataLoader");
        kotlin.jvm.internal.l.f(prefetchedMediationDataLoader, "prefetchedMediationDataLoader");
        kotlin.jvm.internal.l.f(strongReferenceKeepingManager, "strongReferenceKeepingManager");
        kotlin.jvm.internal.l.f(resourceUtils, "resourceUtils");
        kotlin.jvm.internal.l.f(phoneStateTracker, "phoneStateTracker");
        kotlin.jvm.internal.l.f(adFetcherFactory, "adFetcherFactory");
        this.f34555a = context;
        this.f34556b = adLoadingPhasesManager;
        this.f34557c = adConfiguration;
        this.f34558d = coroutineScope;
        this.f34559e = adQualityVerifierController;
        this.f34560f = handler;
        this.f34561g = adUrlConfigurator;
        this.f34562h = sensitiveModeChecker;
        this.i = autograbLoader;
        this.f34563j = loadStateValidator;
        this.f34564k = sdkInitializer;
        this.f34565l = headerBiddingDataLoader;
        this.f34566m = prefetchedMediationDataLoader;
        this.f34567n = strongReferenceKeepingManager;
        this.f34568o = resourceUtils;
        this.f34569p = phoneStateTracker;
        this.f34570q = C4149l3.a(this);
        this.f34571r = EnumC4219v4.f34336c;
    }

    public void b(C4128i3 error) {
        String strE;
        kotlin.jvm.internal.l.f(error, "error");
        uo0.c(error.d(), new Object[0]);
        a(EnumC4219v4.f34339f);
        ip1.c cVar = ip1.c.f28830d;
        zy0 zy0VarI = this.f34557c.i();
        if (zy0VarI == null || (strE = zy0VarI.e()) == null) {
            strE = ip1.a.f28774a;
        }
        ja jaVar = new ja(cVar, strE);
        C4198s4 c4198s4 = this.f34556b;
        EnumC4191r4 adLoadingPhaseType = EnumC4191r4.f32454c;
        c4198s4.getClass();
        kotlin.jvm.internal.l.f(adLoadingPhaseType, "adLoadingPhaseType");
        c4198s4.a(adLoadingPhaseType, jaVar, null);
        this.f34556b.a(EnumC4191r4.f32456e);
        this.f34567n.a(kq0.f29755b, this);
        a(error);
    }

    public final synchronized void a(EnumC4219v4 state) {
        kotlin.jvm.internal.l.f(state, "state");
        state.toString();
        fp0.a(new Object[0]);
        this.f34571r = state;
    }

    public final synchronized void a(c82 urlConfigurator) {
        kotlin.jvm.internal.l.f(urlConfigurator, "urlConfigurator");
        C0575f.e(this.f34558d, null, null, new a(this, urlConfigurator, null), 3);
    }

    @Override // com.yandex.mobile.ads.impl.lo
    public final synchronized boolean a() {
        return this.f34572s;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean a(com.yandex.mobile.ads.impl.h7 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.yandex.mobile.ads.impl.a8<T> r0 = r5.f34575v     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.v4 r1 = r5.f34571r     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.v4 r2 = com.yandex.mobile.ads.impl.EnumC4219v4.f34339f     // Catch: java.lang.Throwable -> L33
            if (r1 != r2) goto La
            goto L4a
        La:
            if (r0 == 0) goto L4a
            long r1 = r5.f34573t     // Catch: java.lang.Throwable -> L33
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L4a
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L33
            long r3 = r5.f34573t     // Catch: java.lang.Throwable -> L33
            long r1 = r1 - r3
            int r0 = r0.i()     // Catch: java.lang.Throwable -> L33
            long r3 = (long) r0     // Catch: java.lang.Throwable -> L33
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L4a
            if (r6 == 0) goto L35
            com.yandex.mobile.ads.impl.a3 r0 = r5.f34557c     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.h7 r0 = r0.a()     // Catch: java.lang.Throwable -> L33
            boolean r6 = r6.equals(r0)     // Catch: java.lang.Throwable -> L33
            if (r6 == 0) goto L4a
            goto L35
        L33:
            r6 = move-exception
            goto L4d
        L35:
            android.content.Context r6 = r5.f34555a     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.ef1 r6 = com.yandex.mobile.ads.impl.es.b(r6)     // Catch: java.lang.Throwable -> L33
            int r6 = r6.a()     // Catch: java.lang.Throwable -> L33
            com.yandex.mobile.ads.impl.a3 r0 = r5.f34557c     // Catch: java.lang.Throwable -> L33
            int r0 = r0.o()     // Catch: java.lang.Throwable -> L33
            if (r6 == r0) goto L48
            goto L4a
        L48:
            r6 = 0
            goto L4b
        L4a:
            r6 = 1
        L4b:
            monitor-exit(r5)
            return r6
        L4d:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L33
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.vj.a(com.yandex.mobile.ads.impl.h7):boolean");
    }

    @Override // com.yandex.mobile.ads.impl.yp1
    public final void b() {
        this.f34556b.a(EnumC4191r4.f32469s);
        C4198s4 c4198s4 = this.f34556b;
        EnumC4191r4 enumC4191r4 = EnumC4191r4.f32470t;
        uj.a(c4198s4, enumC4191r4, "adLoadingPhaseType", enumC4191r4, null);
    }

    public final void a(dg1 urlConfigurator) {
        kotlin.jvm.internal.l.f(urlConfigurator, "urlConfigurator");
        a(EnumC4219v4.f34337d);
        a((c82) urlConfigurator);
    }

    public synchronized void a(C4128i3 error) {
        kotlin.jvm.internal.l.f(error, "error");
        InterfaceC4107f3 interfaceC4107f3 = this.f34574u;
        if (interfaceC4107f3 != null) {
            interfaceC4107f3.a(error);
        }
    }

    @Override // com.yandex.mobile.ads.impl.rq1.a
    public final void a(fi2 error) {
        kotlin.jvm.internal.l.f(error, "error");
        if (error instanceof C4093d3) {
            b(C4142k3.a.a(this.f34557c, ((C4093d3) error).a()));
        }
    }

    @Override // com.yandex.mobile.ads.impl.ah1.b
    public void a(xg1 phoneState) {
        kotlin.jvm.internal.l.f(phoneState, "phoneState");
        phoneState.toString();
        fp0.d(new Object[0]);
    }

    @Override // com.yandex.mobile.ads.impl.rq1.b
    public synchronized void a(a8<T> adResponse) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        this.f34556b.a(EnumC4191r4.f32470t);
        this.f34575v = adResponse;
    }

    public final void a(Object ad, MediatedAdObjectInfo mediatedAdObjectInfo, InterfaceC5480a<C1992A> adAccepted, p9.l<? super String, C1992A> adBlocked) {
        kotlin.jvm.internal.l.f(ad, "ad");
        kotlin.jvm.internal.l.f(adAccepted, "adAccepted");
        kotlin.jvm.internal.l.f(adBlocked, "adBlocked");
        C0575f.e(this.f34558d, null, null, new c(this, ad, mediatedAdObjectInfo, adAccepted, adBlocked, null), 3);
    }

    public final void a(si siVar) {
        this.f34574u = siVar;
    }

    public void a(String str) {
        this.f34557c.a(str);
    }

    public final void a(vy1 vy1Var) {
        this.f34557c.a(vy1Var);
    }

    public final synchronized void a(h7 h7Var, c82 urlConfigurator) {
        try {
            kotlin.jvm.internal.l.f(urlConfigurator, "urlConfigurator");
            a(EnumC4219v4.f34337d);
            this.f34557c.a(h7Var);
            C4128i3 c4128i3X = x();
            if (c4128i3X == null) {
                C0575f.e(this.f34558d, null, null, new d(this, urlConfigurator, null), 3);
            } else {
                b(c4128i3X);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
