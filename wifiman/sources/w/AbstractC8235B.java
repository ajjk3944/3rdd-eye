package w;

import Ii.AbstractC3063k;
import Ii.N;
import Ii.O;
import Yg.J;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import l0.C6531g;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;
import y0.C8604y;
import y0.EnumC8595p;
import y0.InterfaceC8567G;
import y0.InterfaceC8581b;

/* renamed from: w.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8235B {

    /* renamed from: a, reason: collision with root package name */
    private static final mh.q f63731a = new a(null);

    /* renamed from: w.B$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        int f63732a;

        a(InterfaceC5380e interfaceC5380e) {
            super(3, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f63732a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Yg.v.b(obj);
            return J.f24997a;
        }

        public final Object n(r rVar, long j10, InterfaceC5380e interfaceC5380e) {
            return new a(interfaceC5380e).invokeSuspend(J.f24997a);
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return n((r) obj, ((C6531g) obj2).v(), (InterfaceC5380e) obj3);
        }
    }

    /* renamed from: w.B$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f63733a;

        /* renamed from: b, reason: collision with root package name */
        Object f63734b;

        /* renamed from: c, reason: collision with root package name */
        boolean f63735c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f63736d;

        /* renamed from: e, reason: collision with root package name */
        int f63737e;

        b(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f63736d = obj;
            this.f63737e |= PduHandle.NONE;
            return AbstractC8235B.e(null, false, null, this);
        }
    }

    /* renamed from: w.B$c */
    static final class c extends kotlin.coroutines.jvm.internal.k implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        long f63738b;

        /* renamed from: c, reason: collision with root package name */
        int f63739c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f63740d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C8604y f63741e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C8604y c8604y, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f63741e = c8604y;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            c cVar = new c(this.f63741e, interfaceC5380e);
            cVar.f63740d = obj;
            return cVar;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0046 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0051 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0044 -> B:12:0x0047). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = eh.AbstractC5467b.g()
                int r1 = r11.f63739c
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                long r3 = r11.f63738b
                java.lang.Object r1 = r11.f63740d
                y0.b r1 = (y0.InterfaceC8581b) r1
                Yg.v.b(r12)
                goto L47
            L15:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1d:
                Yg.v.b(r12)
                java.lang.Object r12 = r11.f63740d
                y0.b r12 = (y0.InterfaceC8581b) r12
                y0.y r1 = r11.f63741e
                long r3 = r1.o()
                androidx.compose.ui.platform.w1 r1 = r12.getViewConfiguration()
                long r5 = r1.b()
                long r3 = r3 + r5
                r1 = r12
            L34:
                r11.f63740d = r1
                r11.f63738b = r3
                r11.f63739c = r2
                r6 = 0
                r7 = 0
                r9 = 3
                r10 = 0
                r5 = r1
                r8 = r11
                java.lang.Object r12 = w.AbstractC8235B.f(r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L47
                return r0
            L47:
                y0.y r12 = (y0.C8604y) r12
                long r5 = r12.o()
                int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r5 < 0) goto L34
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: w.AbstractC8235B.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC8581b interfaceC8581b, InterfaceC5380e interfaceC5380e) {
            return ((c) create(interfaceC8581b, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    /* renamed from: w.B$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f63742a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f63743b;

        /* renamed from: c, reason: collision with root package name */
        int f63744c;

        d(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f63743b = obj;
            this.f63744c |= PduHandle.NONE;
            return AbstractC8235B.h(null, this);
        }
    }

    /* renamed from: w.B$e */
    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f63745a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f63746b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC8567G f63747c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ mh.q f63748d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f63749e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ s f63750f;

        /* renamed from: w.B$e$a */
        static final class a extends kotlin.coroutines.jvm.internal.k implements InterfaceC6839p {

            /* renamed from: b, reason: collision with root package name */
            int f63751b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f63752c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ N f63753d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ mh.q f63754e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f63755f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ s f63756g;

            /* renamed from: w.B$e$a$a, reason: collision with other inner class name */
            static final class C2268a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f63757a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ s f63758b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2268a(s sVar, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f63758b = sVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new C2268a(this.f63758b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f63757a;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        s sVar = this.f63758b;
                        this.f63757a = 1;
                        if (sVar.q(this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Yg.v.b(obj);
                    }
                    return J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                    return ((C2268a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            /* renamed from: w.B$e$a$b */
            static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f63759a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ mh.q f63760b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ s f63761c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C8604y f63762d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(mh.q qVar, s sVar, C8604y c8604y, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f63760b = qVar;
                    this.f63761c = sVar;
                    this.f63762d = c8604y;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new b(this.f63760b, this.f63761c, this.f63762d, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f63759a;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        mh.q qVar = this.f63760b;
                        s sVar = this.f63761c;
                        C6531g c6531gD = C6531g.d(this.f63762d.h());
                        this.f63759a = 1;
                        if (qVar.s(sVar, c6531gD, this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Yg.v.b(obj);
                    }
                    return J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                    return ((b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            /* renamed from: w.B$e$a$c */
            static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f63763a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ s f63764b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(s sVar, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f63764b = sVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new c(this.f63764b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    AbstractC5467b.g();
                    if (this.f63763a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                    this.f63764b.b();
                    return J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                    return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            /* renamed from: w.B$e$a$d */
            static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f63765a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ s f63766b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(s sVar, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f63766b = sVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new d(this.f63766b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    AbstractC5467b.g();
                    if (this.f63765a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                    this.f63766b.p();
                    return J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                    return ((d) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(N n10, mh.q qVar, InterfaceC6835l interfaceC6835l, s sVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f63753d = n10;
                this.f63754e = qVar;
                this.f63755f = interfaceC6835l;
                this.f63756g = sVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                a aVar = new a(this.f63753d, this.f63754e, this.f63755f, this.f63756g, interfaceC5380e);
                aVar.f63752c = obj;
                return aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r24) {
                /*
                    r23 = this;
                    r6 = r23
                    java.lang.Object r7 = eh.AbstractC5467b.g()
                    int r0 = r6.f63751b
                    r8 = 2
                    r9 = 1
                    r10 = 0
                    if (r0 == 0) goto L2a
                    if (r0 == r9) goto L1f
                    if (r0 != r8) goto L17
                    Yg.v.b(r24)
                    r0 = r24
                    goto L7d
                L17:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L1f:
                    java.lang.Object r0 = r6.f63752c
                    y0.b r0 = (y0.InterfaceC8581b) r0
                    Yg.v.b(r24)
                    r11 = r0
                    r0 = r24
                    goto L51
                L2a:
                    Yg.v.b(r24)
                    java.lang.Object r0 = r6.f63752c
                    r11 = r0
                    y0.b r11 = (y0.InterfaceC8581b) r11
                    Ii.N r0 = r6.f63753d
                    w.B$e$a$a r3 = new w.B$e$a$a
                    w.s r1 = r6.f63756g
                    r3.<init>(r1, r10)
                    r4 = 3
                    r5 = 0
                    r1 = 0
                    r2 = 0
                    Ii.AbstractC3059i.d(r0, r1, r2, r3, r4, r5)
                    r6.f63752c = r11
                    r6.f63751b = r9
                    r1 = 0
                    r0 = r11
                    r3 = r23
                    java.lang.Object r0 = w.AbstractC8235B.f(r0, r1, r2, r3, r4, r5)
                    if (r0 != r7) goto L51
                    return r7
                L51:
                    y0.y r0 = (y0.C8604y) r0
                    r0.a()
                    mh.q r1 = r6.f63754e
                    mh.q r2 = w.AbstractC8235B.c()
                    if (r1 == r2) goto L72
                    Ii.N r12 = r6.f63753d
                    w.B$e$a$b r15 = new w.B$e$a$b
                    mh.q r1 = r6.f63754e
                    w.s r2 = r6.f63756g
                    r15.<init>(r1, r2, r0, r10)
                    r16 = 3
                    r17 = 0
                    r13 = 0
                    r14 = 0
                    Ii.AbstractC3059i.d(r12, r13, r14, r15, r16, r17)
                L72:
                    r6.f63752c = r10
                    r6.f63751b = r8
                    java.lang.Object r0 = w.AbstractC8235B.m(r11, r10, r6, r9, r10)
                    if (r0 != r7) goto L7d
                    return r7
                L7d:
                    y0.y r0 = (y0.C8604y) r0
                    if (r0 != 0) goto L93
                    Ii.N r11 = r6.f63753d
                    w.B$e$a$c r14 = new w.B$e$a$c
                    w.s r0 = r6.f63756g
                    r14.<init>(r0, r10)
                    r15 = 3
                    r16 = 0
                    r12 = 0
                    r13 = 0
                    Ii.AbstractC3059i.d(r11, r12, r13, r14, r15, r16)
                    goto Lbd
                L93:
                    r0.a()
                    Ii.N r1 = r6.f63753d
                    w.B$e$a$d r2 = new w.B$e$a$d
                    w.s r3 = r6.f63756g
                    r2.<init>(r3, r10)
                    r21 = 3
                    r22 = 0
                    r18 = 0
                    r19 = 0
                    r17 = r1
                    r20 = r2
                    Ii.AbstractC3059i.d(r17, r18, r19, r20, r21, r22)
                    mh.l r1 = r6.f63755f
                    if (r1 == 0) goto Lbd
                    long r2 = r0.h()
                    l0.g r0 = l0.C6531g.d(r2)
                    r1.invoke(r0)
                Lbd:
                    Yg.J r0 = Yg.J.f24997a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: w.AbstractC8235B.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC8581b interfaceC8581b, InterfaceC5380e interfaceC5380e) {
                return ((a) create(interfaceC8581b, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(InterfaceC8567G interfaceC8567G, mh.q qVar, InterfaceC6835l interfaceC6835l, s sVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f63747c = interfaceC8567G;
            this.f63748d = qVar;
            this.f63749e = interfaceC6835l;
            this.f63750f = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            e eVar = new e(this.f63747c, this.f63748d, this.f63749e, this.f63750f, interfaceC5380e);
            eVar.f63746b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f63745a;
            if (i10 == 0) {
                Yg.v.b(obj);
                N n10 = (N) this.f63746b;
                InterfaceC8567G interfaceC8567G = this.f63747c;
                a aVar = new a(n10, this.f63748d, this.f63749e, this.f63750f, null);
                this.f63745a = 1;
                if (o.d(interfaceC8567G, aVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((e) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    /* renamed from: w.B$f */
    static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f63767a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f63768b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC8567G f63769c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ mh.q f63770d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f63771e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f63772f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f63773g;

        /* renamed from: w.B$f$a */
        static final class a extends kotlin.coroutines.jvm.internal.k implements InterfaceC6839p {

            /* renamed from: b, reason: collision with root package name */
            Object f63774b;

            /* renamed from: c, reason: collision with root package name */
            Object f63775c;

            /* renamed from: d, reason: collision with root package name */
            Object f63776d;

            /* renamed from: e, reason: collision with root package name */
            long f63777e;

            /* renamed from: f, reason: collision with root package name */
            int f63778f;

            /* renamed from: g, reason: collision with root package name */
            private /* synthetic */ Object f63779g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ N f63780h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ mh.q f63781i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f63782j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f63783k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f63784l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ s f63785m;

            /* renamed from: w.B$f$a$a, reason: collision with other inner class name */
            static final class C2269a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f63786a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ s f63787b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2269a(s sVar, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f63787b = sVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new C2269a(this.f63787b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    AbstractC5467b.g();
                    if (this.f63786a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                    this.f63787b.p();
                    return J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                    return ((C2269a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            /* renamed from: w.B$f$a$b */
            static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f63788a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ s f63789b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(s sVar, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f63789b = sVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new b(this.f63789b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f63788a;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        s sVar = this.f63789b;
                        this.f63788a = 1;
                        if (sVar.q(this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Yg.v.b(obj);
                    }
                    return J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                    return ((b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            /* renamed from: w.B$f$a$c */
            static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f63790a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ mh.q f63791b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ s f63792c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C8604y f63793d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(mh.q qVar, s sVar, C8604y c8604y, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f63791b = qVar;
                    this.f63792c = sVar;
                    this.f63793d = c8604y;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new c(this.f63791b, this.f63792c, this.f63793d, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f63790a;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        mh.q qVar = this.f63791b;
                        s sVar = this.f63792c;
                        C6531g c6531gD = C6531g.d(this.f63793d.h());
                        this.f63790a = 1;
                        if (qVar.s(sVar, c6531gD, this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Yg.v.b(obj);
                    }
                    return J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                    return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            /* renamed from: w.B$f$a$d */
            static final class d extends kotlin.coroutines.jvm.internal.k implements InterfaceC6839p {

                /* renamed from: b, reason: collision with root package name */
                int f63794b;

                /* renamed from: c, reason: collision with root package name */
                private /* synthetic */ Object f63795c;

                d(InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    d dVar = new d(interfaceC5380e);
                    dVar.f63795c = obj;
                    return dVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f63794b;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        InterfaceC8581b interfaceC8581b = (InterfaceC8581b) this.f63795c;
                        this.f63794b = 1;
                        obj = AbstractC8235B.m(interfaceC8581b, null, this, 1, null);
                        if (obj == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Yg.v.b(obj);
                    }
                    return obj;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC8581b interfaceC8581b, InterfaceC5380e interfaceC5380e) {
                    return ((d) create(interfaceC8581b, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            /* renamed from: w.B$f$a$e */
            static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f63796a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ s f63797b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(s sVar, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f63797b = sVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new e(this.f63797b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    AbstractC5467b.g();
                    if (this.f63796a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                    this.f63797b.b();
                    return J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                    return ((e) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            /* renamed from: w.B$f$a$f, reason: collision with other inner class name */
            static final class C2270f extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f63798a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ s f63799b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2270f(s sVar, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f63799b = sVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new C2270f(this.f63799b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    AbstractC5467b.g();
                    if (this.f63798a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                    this.f63799b.p();
                    return J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                    return ((C2270f) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            /* renamed from: w.B$f$a$g */
            static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f63800a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ s f63801b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                g(s sVar, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f63801b = sVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new g(this.f63801b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    AbstractC5467b.g();
                    if (this.f63800a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                    this.f63801b.p();
                    return J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                    return ((g) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            /* renamed from: w.B$f$a$h */
            static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f63802a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ s f63803b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                h(s sVar, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f63803b = sVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new h(this.f63803b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f63802a;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        s sVar = this.f63803b;
                        this.f63802a = 1;
                        if (sVar.q(this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Yg.v.b(obj);
                    }
                    return J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                    return ((h) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            /* renamed from: w.B$f$a$i */
            static final class i extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f63804a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ mh.q f63805b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ s f63806c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C8604y f63807d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                i(mh.q qVar, s sVar, C8604y c8604y, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f63805b = qVar;
                    this.f63806c = sVar;
                    this.f63807d = c8604y;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new i(this.f63805b, this.f63806c, this.f63807d, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f63804a;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        mh.q qVar = this.f63805b;
                        s sVar = this.f63806c;
                        C6531g c6531gD = C6531g.d(this.f63807d.h());
                        this.f63804a = 1;
                        if (qVar.s(sVar, c6531gD, this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Yg.v.b(obj);
                    }
                    return J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                    return ((i) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            /* renamed from: w.B$f$a$j */
            static final class j extends kotlin.coroutines.jvm.internal.k implements InterfaceC6839p {

                /* renamed from: b, reason: collision with root package name */
                int f63808b;

                /* renamed from: c, reason: collision with root package name */
                private /* synthetic */ Object f63809c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ N f63810d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC6835l f63811e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ InterfaceC6835l f63812f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ kotlin.jvm.internal.N f63813g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ s f63814h;

                /* renamed from: w.B$f$a$j$a, reason: collision with other inner class name */
                static final class C2271a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                    /* renamed from: a, reason: collision with root package name */
                    int f63815a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ s f63816b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C2271a(s sVar, InterfaceC5380e interfaceC5380e) {
                        super(2, interfaceC5380e);
                        this.f63816b = sVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                        return new C2271a(this.f63816b, interfaceC5380e);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        AbstractC5467b.g();
                        if (this.f63815a != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Yg.v.b(obj);
                        this.f63816b.p();
                        return J.f24997a;
                    }

                    @Override // mh.InterfaceC6839p
                    /* renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                        return ((C2271a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                    }
                }

                /* renamed from: w.B$f$a$j$b */
                static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                    /* renamed from: a, reason: collision with root package name */
                    int f63817a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ s f63818b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(s sVar, InterfaceC5380e interfaceC5380e) {
                        super(2, interfaceC5380e);
                        this.f63818b = sVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                        return new b(this.f63818b, interfaceC5380e);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        AbstractC5467b.g();
                        if (this.f63817a != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Yg.v.b(obj);
                        this.f63818b.b();
                        return J.f24997a;
                    }

                    @Override // mh.InterfaceC6839p
                    /* renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                        return ((b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                j(N n10, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, kotlin.jvm.internal.N n11, s sVar, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f63810d = n10;
                    this.f63811e = interfaceC6835l;
                    this.f63812f = interfaceC6835l2;
                    this.f63813g = n11;
                    this.f63814h = sVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    j jVar = new j(this.f63810d, this.f63811e, this.f63812f, this.f63813g, this.f63814h, interfaceC5380e);
                    jVar.f63809c = obj;
                    return jVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f63808b;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        InterfaceC8581b interfaceC8581b = (InterfaceC8581b) this.f63809c;
                        this.f63808b = 1;
                        obj = AbstractC8235B.m(interfaceC8581b, null, this, 1, null);
                        if (obj == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Yg.v.b(obj);
                    }
                    C8604y c8604y = (C8604y) obj;
                    if (c8604y != null) {
                        c8604y.a();
                        AbstractC3063k.d(this.f63810d, null, null, new C2271a(this.f63814h, null), 3, null);
                        this.f63811e.invoke(C6531g.d(c8604y.h()));
                        return J.f24997a;
                    }
                    AbstractC3063k.d(this.f63810d, null, null, new b(this.f63814h, null), 3, null);
                    InterfaceC6835l interfaceC6835l = this.f63812f;
                    if (interfaceC6835l == null) {
                        return null;
                    }
                    interfaceC6835l.invoke(C6531g.d(((C8604y) this.f63813g.f51689a).h()));
                    return J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC8581b interfaceC8581b, InterfaceC5380e interfaceC5380e) {
                    return ((j) create(interfaceC8581b, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(N n10, mh.q qVar, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, InterfaceC6835l interfaceC6835l3, s sVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f63780h = n10;
                this.f63781i = qVar;
                this.f63782j = interfaceC6835l;
                this.f63783k = interfaceC6835l2;
                this.f63784l = interfaceC6835l3;
                this.f63785m = sVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                a aVar = new a(this.f63780h, this.f63781i, this.f63782j, this.f63783k, this.f63784l, this.f63785m, interfaceC5380e);
                aVar.f63779g = obj;
                return aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x00b0  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00c6  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00cf  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00f1 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00f2  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00fb A[Catch: PointerEventTimeoutCancellationException -> 0x010c, TryCatch #4 {PointerEventTimeoutCancellationException -> 0x010c, blocks: (B:34:0x00f5, B:36:0x00fb, B:38:0x0110), top: B:93:0x00f5 }] */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0110 A[Catch: PointerEventTimeoutCancellationException -> 0x010c, TRY_LEAVE, TryCatch #4 {PointerEventTimeoutCancellationException -> 0x010c, blocks: (B:34:0x00f5, B:36:0x00fb, B:38:0x0110), top: B:93:0x00f5 }] */
            /* JADX WARN: Removed duplicated region for block: B:42:0x012a  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0148 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:49:0x015f  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x0191  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x01a6  */
            /* JADX WARN: Removed duplicated region for block: B:72:0x01f7  */
            /* JADX WARN: Removed duplicated region for block: B:75:0x020a  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0224 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r17) {
                /*
                    Method dump skipped, instructions count: 586
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: w.AbstractC8235B.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC8581b interfaceC8581b, InterfaceC5380e interfaceC5380e) {
                return ((a) create(interfaceC8581b, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(InterfaceC8567G interfaceC8567G, mh.q qVar, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, InterfaceC6835l interfaceC6835l3, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f63769c = interfaceC8567G;
            this.f63770d = qVar;
            this.f63771e = interfaceC6835l;
            this.f63772f = interfaceC6835l2;
            this.f63773g = interfaceC6835l3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            f fVar = new f(this.f63769c, this.f63770d, this.f63771e, this.f63772f, this.f63773g, interfaceC5380e);
            fVar.f63768b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f63767a;
            if (i10 == 0) {
                Yg.v.b(obj);
                N n10 = (N) this.f63768b;
                s sVar = new s(this.f63769c);
                InterfaceC8567G interfaceC8567G = this.f63769c;
                a aVar = new a(n10, this.f63770d, this.f63771e, this.f63772f, this.f63773g, sVar, null);
                this.f63767a = 1;
                if (o.d(interfaceC8567G, aVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((f) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    /* renamed from: w.B$g */
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f63819a;

        /* renamed from: b, reason: collision with root package name */
        Object f63820b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f63821c;

        /* renamed from: d, reason: collision with root package name */
        int f63822d;

        g(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f63821c = obj;
            this.f63822d |= PduHandle.NONE;
            return AbstractC8235B.l(null, null, this);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004e -> B:18:0x0051). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(y0.InterfaceC8581b r9, boolean r10, y0.EnumC8595p r11, dh.InterfaceC5380e r12) {
        /*
            boolean r0 = r12 instanceof w.AbstractC8235B.b
            if (r0 == 0) goto L13
            r0 = r12
            w.B$b r0 = (w.AbstractC8235B.b) r0
            int r1 = r0.f63737e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f63737e = r1
            goto L18
        L13:
            w.B$b r0 = new w.B$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f63736d
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f63737e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            boolean r9 = r0.f63735c
            java.lang.Object r10 = r0.f63734b
            y0.p r10 = (y0.EnumC8595p) r10
            java.lang.Object r11 = r0.f63733a
            y0.b r11 = (y0.InterfaceC8581b) r11
            Yg.v.b(r12)
            r8 = r10
            r10 = r9
            r9 = r11
            r11 = r8
            goto L51
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3f:
            Yg.v.b(r12)
        L42:
            r0.f63733a = r9
            r0.f63734b = r11
            r0.f63735c = r10
            r0.f63737e = r3
            java.lang.Object r12 = r9.A1(r11, r0)
            if (r12 != r1) goto L51
            return r1
        L51:
            y0.n r12 = (y0.C8593n) r12
            java.util.List r2 = r12.c()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L5d:
            if (r6 >= r4) goto L77
            java.lang.Object r7 = r2.get(r6)
            y0.y r7 = (y0.C8604y) r7
            if (r10 == 0) goto L6c
            boolean r7 = y0.AbstractC8594o.a(r7)
            goto L70
        L6c:
            boolean r7 = y0.AbstractC8594o.b(r7)
        L70:
            if (r7 != 0) goto L74
            r2 = r5
            goto L78
        L74:
            int r6 = r6 + 1
            goto L5d
        L77:
            r2 = r3
        L78:
            if (r2 == 0) goto L42
            java.util.List r9 = r12.c()
            java.lang.Object r9 = r9.get(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: w.AbstractC8235B.e(y0.b, boolean, y0.p, dh.e):java.lang.Object");
    }

    public static /* synthetic */ Object f(InterfaceC8581b interfaceC8581b, boolean z10, EnumC8595p enumC8595p, InterfaceC5380e interfaceC5380e, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            enumC8595p = EnumC8595p.Main;
        }
        return e(interfaceC8581b, z10, enumC8595p, interfaceC5380e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object g(InterfaceC8581b interfaceC8581b, C8604y c8604y, InterfaceC5380e interfaceC5380e) {
        return interfaceC8581b.T1(interfaceC8581b.getViewConfiguration().a(), new c(c8604y, null), interfaceC5380e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[LOOP:0: B:19:0x0050->B:20:0x0052, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(y0.InterfaceC8581b r8, dh.InterfaceC5380e r9) {
        /*
            boolean r0 = r9 instanceof w.AbstractC8235B.d
            if (r0 == 0) goto L13
            r0 = r9
            w.B$d r0 = (w.AbstractC8235B.d) r0
            int r1 = r0.f63744c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f63744c = r1
            goto L18
        L13:
            w.B$d r0 = new w.B$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f63743b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f63744c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f63742a
            y0.b r8 = (y0.InterfaceC8581b) r8
            Yg.v.b(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            Yg.v.b(r9)
        L38:
            r0.f63742a = r8
            r0.f63744c = r3
            r9 = 0
            java.lang.Object r9 = y0.InterfaceC8581b.s1(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            y0.n r9 = (y0.C8593n) r9
            java.util.List r2 = r9.c()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L50:
            if (r6 >= r4) goto L5e
            java.lang.Object r7 = r2.get(r6)
            y0.y r7 = (y0.C8604y) r7
            r7.a()
            int r6 = r6 + 1
            goto L50
        L5e:
            java.util.List r9 = r9.c()
            int r2 = r9.size()
        L66:
            if (r5 >= r2) goto L78
            java.lang.Object r4 = r9.get(r5)
            y0.y r4 = (y0.C8604y) r4
            boolean r4 = r4.i()
            if (r4 == 0) goto L75
            goto L38
        L75:
            int r5 = r5 + 1
            goto L66
        L78:
            Yg.J r8 = Yg.J.f24997a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w.AbstractC8235B.h(y0.b, dh.e):java.lang.Object");
    }

    public static final Object i(InterfaceC8567G interfaceC8567G, mh.q qVar, InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
        Object objG = O.g(new e(interfaceC8567G, qVar, interfaceC6835l, new s(interfaceC8567G), null), interfaceC5380e);
        return objG == AbstractC5467b.g() ? objG : J.f24997a;
    }

    public static final Object j(InterfaceC8567G interfaceC8567G, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, mh.q qVar, InterfaceC6835l interfaceC6835l3, InterfaceC5380e interfaceC5380e) {
        Object objG = O.g(new f(interfaceC8567G, qVar, interfaceC6835l2, interfaceC6835l, interfaceC6835l3, null), interfaceC5380e);
        return objG == AbstractC5467b.g() ? objG : J.f24997a;
    }

    public static /* synthetic */ Object k(InterfaceC8567G interfaceC8567G, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, mh.q qVar, InterfaceC6835l interfaceC6835l3, InterfaceC5380e interfaceC5380e, int i10, Object obj) {
        InterfaceC6835l interfaceC6835l4 = (i10 & 1) != 0 ? null : interfaceC6835l;
        InterfaceC6835l interfaceC6835l5 = (i10 & 2) != 0 ? null : interfaceC6835l2;
        if ((i10 & 4) != 0) {
            qVar = f63731a;
        }
        return j(interfaceC8567G, interfaceC6835l4, interfaceC6835l5, qVar, (i10 & 8) != 0 ? null : interfaceC6835l3, interfaceC5380e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b3, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c0 -> B:13:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object l(y0.InterfaceC8581b r18, y0.EnumC8595p r19, dh.InterfaceC5380e r20) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.AbstractC8235B.l(y0.b, y0.p, dh.e):java.lang.Object");
    }

    public static /* synthetic */ Object m(InterfaceC8581b interfaceC8581b, EnumC8595p enumC8595p, InterfaceC5380e interfaceC5380e, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC8595p = EnumC8595p.Main;
        }
        return l(interfaceC8581b, enumC8595p, interfaceC5380e);
    }
}
