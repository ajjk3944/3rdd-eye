package Li;

import Ii.AbstractC3059i;
import Ii.InterfaceC3091y0;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class v {

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f12022a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J f12023b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f12024c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ y f12025d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f12026e;

        /* renamed from: Li.v$a$a, reason: collision with other inner class name */
        static final class C0471a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f12027a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ int f12028b;

            C0471a(InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                C0471a c0471a = new C0471a(interfaceC5380e);
                c0471a.f12028b = ((Number) obj).intValue();
                return c0471a;
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return n(((Number) obj).intValue(), (InterfaceC5380e) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f12027a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(this.f12028b > 0);
            }

            public final Object n(int i10, InterfaceC5380e interfaceC5380e) {
                return ((C0471a) create(Integer.valueOf(i10), interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f12029a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f12030b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC3220g f12031c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ y f12032d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Object f12033e;

            /* renamed from: Li.v$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C0472a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f12034a;

                static {
                    int[] iArr = new int[H.values().length];
                    try {
                        iArr[H.START.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[H.STOP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[H.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f12034a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC3220g interfaceC3220g, y yVar, Object obj, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f12031c = interfaceC3220g;
                this.f12032d = yVar;
                this.f12033e = obj;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                b bVar = new b(this.f12031c, this.f12032d, this.f12033e, interfaceC5380e);
                bVar.f12030b = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f12029a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    int i11 = C0472a.f12034a[((H) this.f12030b).ordinal()];
                    if (i11 == 1) {
                        InterfaceC3220g interfaceC3220g = this.f12031c;
                        y yVar = this.f12032d;
                        this.f12029a = 1;
                        if (interfaceC3220g.b(yVar, this) == objG) {
                            return objG;
                        }
                    } else if (i11 != 2) {
                        if (i11 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Object obj2 = this.f12033e;
                        if (obj2 == F.f11853a) {
                            this.f12032d.h();
                        } else {
                            kotlin.coroutines.jvm.internal.b.a(this.f12032d.j(obj2));
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                }
                return Yg.J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(H h10, InterfaceC5380e interfaceC5380e) {
                return ((b) create(h10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(J j10, InterfaceC3220g interfaceC3220g, y yVar, Object obj, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f12023b = j10;
            this.f12024c = interfaceC3220g;
            this.f12025d = yVar;
            this.f12026e = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new a(this.f12023b, this.f12024c, this.f12025d, this.f12026e, interfaceC5380e);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0068 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = eh.AbstractC5467b.g()
                int r1 = r7.f12022a
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L21
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L21
                if (r1 != r2) goto L15
                goto L21
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                Yg.v.b(r8)
                goto L5c
            L21:
                Yg.v.b(r8)
                goto L8d
            L25:
                Yg.v.b(r8)
                Li.J r8 = r7.f12023b
                Li.J$a r1 = Li.J.f11860a
                Li.J r6 = r1.c()
                if (r8 != r6) goto L3f
                Li.g r8 = r7.f12024c
                Li.y r1 = r7.f12025d
                r7.f12022a = r5
                java.lang.Object r8 = r8.b(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L3f:
                Li.J r8 = r7.f12023b
                Li.J r1 = r1.d()
                r5 = 0
                if (r8 != r1) goto L69
                Li.y r8 = r7.f12025d
                Li.N r8 = r8.l()
                Li.v$a$a r1 = new Li.v$a$a
                r1.<init>(r5)
                r7.f12022a = r4
                java.lang.Object r8 = Li.AbstractC3222i.y(r8, r1, r7)
                if (r8 != r0) goto L5c
                return r0
            L5c:
                Li.g r8 = r7.f12024c
                Li.y r1 = r7.f12025d
                r7.f12022a = r3
                java.lang.Object r8 = r8.b(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L69:
                Li.J r8 = r7.f12023b
                Li.y r1 = r7.f12025d
                Li.N r1 = r1.l()
                Li.g r8 = r8.a(r1)
                Li.g r8 = Li.AbstractC3222i.n(r8)
                Li.v$a$b r1 = new Li.v$a$b
                Li.g r3 = r7.f12024c
                Li.y r4 = r7.f12025d
                java.lang.Object r6 = r7.f12026e
                r1.<init>(r3, r4, r6, r5)
                r7.f12022a = r2
                java.lang.Object r8 = Li.AbstractC3222i.i(r8, r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L8d:
                Yg.J r8 = Yg.J.f24997a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: Li.v.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public static final D a(y yVar) {
        return new A(yVar, null);
    }

    public static final N b(z zVar) {
        return new B(zVar, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final Li.I c(Li.InterfaceC3220g r7, int r8) {
        /*
            Ki.g$a r0 = Ki.g.f10869P
            int r0 = r0.a()
            int r0 = sh.AbstractC7978m.d(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof Mi.d
            if (r1 == 0) goto L3c
            r1 = r7
            Mi.d r1 = (Mi.d) r1
            Li.g r2 = r1.k()
            if (r2 == 0) goto L3c
            Li.I r7 = new Li.I
            int r3 = r1.f13237b
            r4 = -3
            if (r3 == r4) goto L26
            r4 = -2
            if (r3 == r4) goto L26
            if (r3 == 0) goto L26
            r0 = r3
            goto L34
        L26:
            Ki.a r4 = r1.f13238c
            Ki.a r5 = Ki.a.SUSPEND
            r6 = 0
            if (r4 != r5) goto L31
            if (r3 != 0) goto L34
        L2f:
            r0 = r6
            goto L34
        L31:
            if (r8 != 0) goto L2f
            r0 = 1
        L34:
            Ki.a r8 = r1.f13238c
            dh.i r1 = r1.f13236a
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3c:
            Li.I r8 = new Li.I
            Ki.a r1 = Ki.a.SUSPEND
            dh.j r2 = dh.C5385j.f46088a
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Li.v.c(Li.g, int):Li.I");
    }

    private static final InterfaceC3091y0 d(Ii.N n10, InterfaceC5384i interfaceC5384i, InterfaceC3220g interfaceC3220g, y yVar, J j10, Object obj) {
        return AbstractC3059i.c(n10, interfaceC5384i, AbstractC6492s.d(j10, J.f11860a.c()) ? Ii.P.DEFAULT : Ii.P.UNDISPATCHED, new a(j10, interfaceC3220g, yVar, obj, null));
    }

    public static final D e(InterfaceC3220g interfaceC3220g, Ii.N n10, J j10, int i10) {
        I iC = c(interfaceC3220g, i10);
        y yVarA = F.a(i10, iC.f11857b, iC.f11858c);
        return new A(yVarA, d(n10, iC.f11859d, iC.f11856a, yVarA, j10, F.f11853a));
    }

    public static /* synthetic */ D f(InterfaceC3220g interfaceC3220g, Ii.N n10, J j10, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return AbstractC3222i.K(interfaceC3220g, n10, j10, i10);
    }

    public static final N g(InterfaceC3220g interfaceC3220g, Ii.N n10, J j10, Object obj) {
        I iC = c(interfaceC3220g, 1);
        z zVarA = P.a(obj);
        return new B(zVarA, d(n10, iC.f11859d, iC.f11856a, zVarA, j10, obj));
    }
}
