package androidx.lifecycle;

import A9.C0575f;
import A9.C0583j;
import A9.InterfaceC0594o0;
import androidx.lifecycle.AbstractC1781n;
import b9.C1992A;
import f9.InterfaceC4347e;

/* compiled from: RepeatOnLifecycle.kt */
@h9.e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {84}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class M extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f16060l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f16061m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC1781n f16062n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC1781n.b f16063o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h9.i f16064p;

    /* compiled from: RepeatOnLifecycle.kt */
    @h9.e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {166}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public kotlin.jvm.internal.w f16065l;

        /* renamed from: m, reason: collision with root package name */
        public kotlin.jvm.internal.w f16066m;

        /* renamed from: n, reason: collision with root package name */
        public A9.E f16067n;

        /* renamed from: o, reason: collision with root package name */
        public int f16068o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ AbstractC1781n f16069p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ AbstractC1781n.b f16070q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ A9.E f16071r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ h9.i f16072s;

        /* compiled from: RepeatOnLifecycle.kt */
        /* renamed from: androidx.lifecycle.M$a$a, reason: collision with other inner class name */
        public static final class C0241a implements InterfaceC1788v {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractC1781n.a f16073b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.w<InterfaceC0594o0> f16074c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ A9.E f16075d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ AbstractC1781n.a f16076e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ C0583j f16077f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ K9.d f16078g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ h9.i f16079h;

            /* compiled from: RepeatOnLifecycle.kt */
            @h9.e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {171, 110}, m = "invokeSuspend")
            /* renamed from: androidx.lifecycle.M$a$a$a, reason: collision with other inner class name */
            public static final class C0242a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

                /* renamed from: l, reason: collision with root package name */
                public K9.a f16080l;

                /* renamed from: m, reason: collision with root package name */
                public h9.i f16081m;

                /* renamed from: n, reason: collision with root package name */
                public int f16082n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ K9.d f16083o;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ h9.i f16084p;

                /* compiled from: RepeatOnLifecycle.kt */
                @h9.e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {111}, m = "invokeSuspend")
                /* renamed from: androidx.lifecycle.M$a$a$a$a, reason: collision with other inner class name */
                public static final class C0243a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

                    /* renamed from: l, reason: collision with root package name */
                    public int f16085l;

                    /* renamed from: m, reason: collision with root package name */
                    public /* synthetic */ Object f16086m;

                    /* renamed from: n, reason: collision with root package name */
                    public final /* synthetic */ p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> f16087n;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0243a(p9.p<? super A9.E, ? super InterfaceC4347e<? super C1992A>, ? extends Object> pVar, InterfaceC4347e<? super C0243a> interfaceC4347e) {
                        super(2, interfaceC4347e);
                        this.f16087n = pVar;
                    }

                    @Override // h9.AbstractC4424a
                    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                        C0243a c0243a = new C0243a(this.f16087n, interfaceC4347e);
                        c0243a.f16086m = obj;
                        return c0243a;
                    }

                    @Override // p9.p
                    public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
                        return ((C0243a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
                    }

                    @Override // h9.AbstractC4424a
                    public final Object invokeSuspend(Object obj) {
                        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
                        int i = this.f16085l;
                        if (i == 0) {
                            b9.n.b(obj);
                            A9.E e4 = (A9.E) this.f16086m;
                            this.f16085l = 1;
                            if (this.f16087n.invoke(e4, this) == aVar) {
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
                /* JADX WARN: Multi-variable type inference failed */
                public C0242a(K9.d dVar, p9.p pVar, InterfaceC4347e interfaceC4347e) {
                    super(2, interfaceC4347e);
                    this.f16083o = dVar;
                    this.f16084p = (h9.i) pVar;
                }

                /* JADX WARN: Type inference failed for: r1v0, types: [h9.i, p9.p] */
                @Override // h9.AbstractC4424a
                public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                    return new C0242a(this.f16083o, this.f16084p, interfaceC4347e);
                }

                @Override // p9.p
                public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
                    return ((C0242a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v2, types: [p9.p] */
                /* JADX WARN: Type inference failed for: r1v6 */
                /* JADX WARN: Type inference failed for: r1v7 */
                /* JADX WARN: Type inference failed for: r3v3, types: [K9.a] */
                @Override // h9.AbstractC4424a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    K9.d dVar;
                    ?? r12;
                    K9.a aVar;
                    Throwable th;
                    g9.a aVar2 = g9.a.COROUTINE_SUSPENDED;
                    int i = this.f16082n;
                    try {
                        if (i == 0) {
                            b9.n.b(obj);
                            dVar = this.f16083o;
                            this.f16080l = dVar;
                            h9.i iVar = this.f16084p;
                            this.f16081m = iVar;
                            this.f16082n = 1;
                            r12 = iVar;
                            if (dVar.a(this) != aVar2) {
                            }
                            return aVar2;
                        }
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = this.f16080l;
                            try {
                                b9.n.b(obj);
                                C1992A c1992a = C1992A.f18074a;
                                aVar.c(null);
                                return C1992A.f18074a;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar.c(null);
                                throw th;
                            }
                        }
                        p9.p pVar = (p9.p) this.f16081m;
                        ?? r32 = this.f16080l;
                        b9.n.b(obj);
                        dVar = r32;
                        r12 = pVar;
                        C0243a c0243a = new C0243a(r12, null);
                        this.f16080l = dVar;
                        this.f16081m = null;
                        this.f16082n = 2;
                        if (A9.F.c(c0243a, this) != aVar2) {
                            aVar = dVar;
                            C1992A c1992a2 = C1992A.f18074a;
                            aVar.c(null);
                            return C1992A.f18074a;
                        }
                        return aVar2;
                    } catch (Throwable th3) {
                        aVar = dVar;
                        th = th3;
                        aVar.c(null);
                        throw th;
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0241a(AbstractC1781n.a aVar, kotlin.jvm.internal.w wVar, A9.E e4, AbstractC1781n.a aVar2, C0583j c0583j, K9.d dVar, p9.p pVar) {
                this.f16073b = aVar;
                this.f16074c = wVar;
                this.f16075d = e4;
                this.f16076e = aVar2;
                this.f16077f = c0583j;
                this.f16078g = dVar;
                this.f16079h = (h9.i) pVar;
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [h9.i, p9.p] */
            /* JADX WARN: Type inference failed for: r5v3, types: [A9.K0, T] */
            @Override // androidx.lifecycle.InterfaceC1788v
            public final void c(InterfaceC1790x interfaceC1790x, AbstractC1781n.a aVar) {
                kotlin.jvm.internal.w<InterfaceC0594o0> wVar = this.f16074c;
                if (aVar == this.f16073b) {
                    wVar.f43660b = C0575f.e(this.f16075d, null, null, new C0242a(this.f16078g, this.f16079h, null), 3);
                    return;
                }
                if (aVar == this.f16076e) {
                    InterfaceC0594o0 interfaceC0594o0 = wVar.f43660b;
                    if (interfaceC0594o0 != null) {
                        interfaceC0594o0.c(null);
                    }
                    wVar.f43660b = null;
                }
                if (aVar == AbstractC1781n.a.ON_DESTROY) {
                    this.f16077f.resumeWith(C1992A.f18074a);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(AbstractC1781n abstractC1781n, AbstractC1781n.b bVar, A9.E e4, p9.p<? super A9.E, ? super InterfaceC4347e<? super C1992A>, ? extends Object> pVar, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f16069p = abstractC1781n;
            this.f16070q = bVar;
            this.f16071r = e4;
            this.f16072s = (h9.i) pVar;
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [h9.i, p9.p] */
        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f16069p, this.f16070q, this.f16071r, this.f16072s, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:42:? A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r11v0, types: [h9.i, p9.p] */
        /* JADX WARN: Type inference failed for: r4v3, types: [T, androidx.lifecycle.M$a$a, androidx.lifecycle.w] */
        @Override // h9.AbstractC4424a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                r12 = this;
                g9.a r0 = g9.a.COROUTINE_SUSPENDED
                int r1 = r12.f16068o
                r2 = 0
                androidx.lifecycle.n r3 = r12.f16069p
                r4 = 1
                if (r1 == 0) goto L20
                if (r1 != r4) goto L18
                kotlin.jvm.internal.w r1 = r12.f16066m
                kotlin.jvm.internal.w r4 = r12.f16065l
                b9.n.b(r13)     // Catch: java.lang.Throwable -> L14
                goto L75
            L14:
                r0 = move-exception
                r13 = r0
                goto L8d
            L18:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L20:
                b9.n.b(r13)
                androidx.lifecycle.n$b r13 = r3.getCurrentState()
                androidx.lifecycle.n$b r1 = androidx.lifecycle.AbstractC1781n.b.DESTROYED
                if (r13 != r1) goto L2e
                b9.A r13 = b9.C1992A.f18074a
                return r13
            L2e:
                kotlin.jvm.internal.w r6 = new kotlin.jvm.internal.w
                r6.<init>()
                kotlin.jvm.internal.w r1 = new kotlin.jvm.internal.w
                r1.<init>()
                androidx.lifecycle.n$b r13 = r12.f16070q     // Catch: java.lang.Throwable -> L8a
                A9.E r7 = r12.f16071r     // Catch: java.lang.Throwable -> L8a
                h9.i r11 = r12.f16072s     // Catch: java.lang.Throwable -> L8a
                r12.f16065l = r6     // Catch: java.lang.Throwable -> L8a
                r12.f16066m = r1     // Catch: java.lang.Throwable -> L8a
                r12.f16067n = r7     // Catch: java.lang.Throwable -> L8a
                r12.f16068o = r4     // Catch: java.lang.Throwable -> L8a
                A9.j r9 = new A9.j     // Catch: java.lang.Throwable -> L8a
                f9.e r5 = com.google.gson.internal.c.r(r12)     // Catch: java.lang.Throwable -> L8a
                r9.<init>(r4, r5)     // Catch: java.lang.Throwable -> L8a
                r9.s()     // Catch: java.lang.Throwable -> L8a
                androidx.lifecycle.n$a$a r4 = androidx.lifecycle.AbstractC1781n.a.Companion     // Catch: java.lang.Throwable -> L8a
                r4.getClass()     // Catch: java.lang.Throwable -> L8a
                androidx.lifecycle.n$a r5 = androidx.lifecycle.AbstractC1781n.a.C0246a.c(r13)     // Catch: java.lang.Throwable -> L8a
                androidx.lifecycle.n$a r8 = androidx.lifecycle.AbstractC1781n.a.C0246a.a(r13)     // Catch: java.lang.Throwable -> L8a
                K9.d r10 = K9.f.a()     // Catch: java.lang.Throwable -> L8a
                androidx.lifecycle.M$a$a r4 = new androidx.lifecycle.M$a$a     // Catch: java.lang.Throwable -> L8a
                r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L8a
                r1.f43660b = r4     // Catch: java.lang.Throwable -> L8a
                r3.addObserver(r4)     // Catch: java.lang.Throwable -> L8a
                java.lang.Object r13 = r9.r()     // Catch: java.lang.Throwable -> L8a
                if (r13 != r0) goto L74
                return r0
            L74:
                r4 = r6
            L75:
                T r13 = r4.f43660b
                A9.o0 r13 = (A9.InterfaceC0594o0) r13
                if (r13 == 0) goto L7e
                r13.c(r2)
            L7e:
                T r13 = r1.f43660b
                androidx.lifecycle.v r13 = (androidx.lifecycle.InterfaceC1788v) r13
                if (r13 == 0) goto L87
                r3.removeObserver(r13)
            L87:
                b9.A r13 = b9.C1992A.f18074a
                return r13
            L8a:
                r0 = move-exception
                r13 = r0
                r4 = r6
            L8d:
                T r0 = r4.f43660b
                A9.o0 r0 = (A9.InterfaceC0594o0) r0
                if (r0 == 0) goto L96
                r0.c(r2)
            L96:
                T r0 = r1.f43660b
                androidx.lifecycle.v r0 = (androidx.lifecycle.InterfaceC1788v) r0
                if (r0 == 0) goto L9f
                r3.removeObserver(r0)
            L9f:
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.M.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public M(AbstractC1781n abstractC1781n, AbstractC1781n.b bVar, p9.p<? super A9.E, ? super InterfaceC4347e<? super C1992A>, ? extends Object> pVar, InterfaceC4347e<? super M> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f16062n = abstractC1781n;
        this.f16063o = bVar;
        this.f16064p = (h9.i) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [h9.i, p9.p] */
    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        M m10 = new M(this.f16062n, this.f16063o, this.f16064p, interfaceC4347e);
        m10.f16061m = obj;
        return m10;
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((M) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [h9.i, p9.p] */
    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f16060l;
        if (i == 0) {
            b9.n.b(obj);
            A9.E e4 = (A9.E) this.f16061m;
            I9.c cVar = A9.U.f211a;
            B9.g gVarR0 = F9.q.f1782a.R0();
            a aVar2 = new a(this.f16062n, this.f16063o, e4, this.f16064p, null);
            this.f16060l = 1;
            if (C0575f.h(gVarR0, aVar2, this) == aVar) {
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
