package N;

import E0.InterfaceC2629g;
import Ii.AbstractC3063k;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.z1;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AbstractC3932k0;
import c0.AbstractC4174c;
import c0.InterfaceC4182k;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import l0.AbstractC6532h;
import l0.C6531g;
import m0.i1;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import o0.InterfaceC7039f;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.mp.PduHandle;
import r.AbstractC7521c;
import r.InterfaceC7533i;
import s.AbstractC7848i;
import w.AbstractC8235B;
import x0.InterfaceC8412a;
import y0.AbstractC8576P;
import y0.InterfaceC8567G;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;

/* renamed from: N.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3333m0 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f14551a = Y0.h.j(56);

    /* renamed from: b, reason: collision with root package name */
    private static final float f14552b = Y0.h.j(125);

    /* renamed from: c, reason: collision with root package name */
    private static final float f14553c = Y0.h.j(640);

    /* renamed from: N.m0$a */
    public static final class a implements InterfaceC8412a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3310b f14554a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w.q f14555b;

        /* renamed from: N.m0$a$a, reason: collision with other inner class name */
        static final class C0557a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            long f14556a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f14557b;

            /* renamed from: d, reason: collision with root package name */
            int f14559d;

            C0557a(InterfaceC5380e interfaceC5380e) {
                super(interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f14557b = obj;
                this.f14559d |= PduHandle.NONE;
                return a.this.g1(0L, 0L, this);
            }
        }

        /* renamed from: N.m0$a$b */
        static final class b extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            long f14560a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f14561b;

            /* renamed from: d, reason: collision with root package name */
            int f14563d;

            b(InterfaceC5380e interfaceC5380e) {
                super(interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f14561b = obj;
                this.f14563d |= PduHandle.NONE;
                return a.this.R(0L, this);
            }
        }

        a(C3310b c3310b, w.q qVar) {
            this.f14554a = c3310b;
            this.f14555b = qVar;
        }

        private final float a(long j10) {
            return this.f14555b == w.q.Horizontal ? C6531g.m(j10) : C6531g.n(j10);
        }

        private final long b(float f10) {
            w.q qVar = this.f14555b;
            float f11 = qVar == w.q.Horizontal ? f10 : 0.0f;
            if (qVar != w.q.Vertical) {
                f10 = 0.0f;
            }
            return AbstractC6532h.a(f11, f10);
        }

        private final float c(long j10) {
            return this.f14555b == w.q.Horizontal ? Y0.y.h(j10) : Y0.y.i(j10);
        }

        @Override // x0.InterfaceC8412a
        public long L1(long j10, long j11, int i10) {
            return x0.e.d(i10, x0.e.f65322a.b()) ? b(this.f14554a.n(a(j11))) : C6531g.f52335b.c();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // x0.InterfaceC8412a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object R(long r6, dh.InterfaceC5380e r8) {
            /*
                r5 = this;
                boolean r0 = r8 instanceof N.AbstractC3333m0.a.b
                if (r0 == 0) goto L13
                r0 = r8
                N.m0$a$b r0 = (N.AbstractC3333m0.a.b) r0
                int r1 = r0.f14563d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f14563d = r1
                goto L18
            L13:
                N.m0$a$b r0 = new N.m0$a$b
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f14561b
                java.lang.Object r1 = eh.AbstractC5467b.g()
                int r2 = r0.f14563d
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L2b
                long r6 = r0.f14560a
                Yg.v.b(r8)
                goto L66
            L2b:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L33:
                Yg.v.b(r8)
                float r8 = r5.c(r6)
                N.b r2 = r5.f14554a
                float r2 = r2.A()
                r4 = 0
                int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r4 >= 0) goto L60
                N.b r4 = r5.f14554a
                N.D r4 = r4.o()
                float r4 = r4.b()
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 <= 0) goto L60
                N.b r2 = r5.f14554a
                r0.f14560a = r6
                r0.f14563d = r3
                java.lang.Object r8 = r2.G(r8, r0)
                if (r8 != r1) goto L66
                return r1
            L60:
                Y0.y$a r6 = Y0.y.f24558b
                long r6 = r6.a()
            L66:
                Y0.y r6 = Y0.y.b(r6)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: N.AbstractC3333m0.a.R(long, dh.e):java.lang.Object");
        }

        @Override // x0.InterfaceC8412a
        public long V0(long j10, int i10) {
            float fA = a(j10);
            return (fA >= 0.0f || !x0.e.d(i10, x0.e.f65322a.b())) ? C6531g.f52335b.c() : b(this.f14554a.n(fA));
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // x0.InterfaceC8412a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object g1(long r3, long r5, dh.InterfaceC5380e r7) {
            /*
                r2 = this;
                boolean r3 = r7 instanceof N.AbstractC3333m0.a.C0557a
                if (r3 == 0) goto L13
                r3 = r7
                N.m0$a$a r3 = (N.AbstractC3333m0.a.C0557a) r3
                int r4 = r3.f14559d
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r4 & r0
                if (r1 == 0) goto L13
                int r4 = r4 - r0
                r3.f14559d = r4
                goto L18
            L13:
                N.m0$a$a r3 = new N.m0$a$a
                r3.<init>(r7)
            L18:
                java.lang.Object r4 = r3.f14557b
                java.lang.Object r7 = eh.AbstractC5467b.g()
                int r0 = r3.f14559d
                r1 = 1
                if (r0 == 0) goto L33
                if (r0 != r1) goto L2b
                long r5 = r3.f14556a
                Yg.v.b(r4)
                goto L47
            L2b:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r4)
                throw r3
            L33:
                Yg.v.b(r4)
                N.b r4 = r2.f14554a
                float r0 = r2.c(r5)
                r3.f14556a = r5
                r3.f14559d = r1
                java.lang.Object r3 = r4.G(r0, r3)
                if (r3 != r7) goto L47
                return r7
            L47:
                Y0.y r3 = Y0.y.b(r5)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: N.AbstractC3333m0.a.g1(long, long, dh.e):java.lang.Object");
        }
    }

    /* renamed from: N.m0$b */
    static final class b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3335n0 f14564a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ii.N f14565b;

        /* renamed from: N.m0$b$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f14566a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3335n0 f14567b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C3335n0 c3335n0, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f14567b = c3335n0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new a(this.f14567b, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f14566a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    C3335n0 c3335n0 = this.f14567b;
                    this.f14566a = 1;
                    if (c3335n0.i(this) == objG) {
                        return objG;
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
            public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3335n0 c3335n0, Ii.N n10) {
            super(0);
            this.f14564a = c3335n0;
            this.f14565b = n10;
        }

        public final void a() {
            if (((Boolean) this.f14564a.d().r().invoke(EnumC3337o0.Hidden)).booleanValue()) {
                AbstractC3063k.d(this.f14565b, null, null, new a(this.f14564a, null), 3, null);
            }
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    /* renamed from: N.m0$c */
    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3335n0 f14568a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ii.N f14569b;

        /* renamed from: N.m0$c$a */
        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3335n0 f14570a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ii.N f14571b;

            /* renamed from: N.m0$c$a$a, reason: collision with other inner class name */
            static final class C0558a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f14572a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C3335n0 f14573b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0558a(C3335n0 c3335n0, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f14573b = c3335n0;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new C0558a(this.f14573b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f14572a;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        C3335n0 c3335n0 = this.f14573b;
                        this.f14572a = 1;
                        if (c3335n0.i(this) == objG) {
                            return objG;
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
                public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                    return ((C0558a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C3335n0 c3335n0, Ii.N n10) {
                super(0);
                this.f14570a = c3335n0;
                this.f14571b = n10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                if (((Boolean) this.f14570a.d().r().invoke(EnumC3337o0.Hidden)).booleanValue()) {
                    AbstractC3063k.d(this.f14571b, null, null, new C0558a(this.f14570a, null), 3, null);
                }
                return Boolean.TRUE;
            }
        }

        /* renamed from: N.m0$c$b */
        static final class b extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3335n0 f14574a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ii.N f14575b;

            /* renamed from: N.m0$c$b$a */
            static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f14576a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C3335n0 f14577b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(C3335n0 c3335n0, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f14577b = c3335n0;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new a(this.f14577b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f14576a;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        C3335n0 c3335n0 = this.f14577b;
                        this.f14576a = 1;
                        if (c3335n0.c(this) == objG) {
                            return objG;
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
                public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                    return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C3335n0 c3335n0, Ii.N n10) {
                super(0);
                this.f14574a = c3335n0;
                this.f14575b = n10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                if (((Boolean) this.f14574a.d().r().invoke(EnumC3337o0.Expanded)).booleanValue()) {
                    AbstractC3063k.d(this.f14575b, null, null, new a(this.f14574a, null), 3, null);
                }
                return Boolean.TRUE;
            }
        }

        /* renamed from: N.m0$c$c, reason: collision with other inner class name */
        static final class C0559c extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3335n0 f14578a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ii.N f14579b;

            /* renamed from: N.m0$c$c$a */
            static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f14580a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C3335n0 f14581b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(C3335n0 c3335n0, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f14581b = c3335n0;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new a(this.f14581b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f14580a;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        C3335n0 c3335n0 = this.f14581b;
                        this.f14580a = 1;
                        if (c3335n0.h(this) == objG) {
                            return objG;
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
                public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                    return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0559c(C3335n0 c3335n0, Ii.N n10) {
                super(0);
                this.f14578a = c3335n0;
                this.f14579b = n10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                if (((Boolean) this.f14578a.d().r().invoke(EnumC3337o0.HalfExpanded)).booleanValue()) {
                    AbstractC3063k.d(this.f14579b, null, null, new a(this.f14578a, null), 3, null);
                }
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C3335n0 c3335n0, Ii.N n10) {
            super(1);
            this.f14568a = c3335n0;
            this.f14569b = n10;
        }

        public final void a(J0.w wVar) {
            if (this.f14568a.k()) {
                J0.t.n(wVar, null, new a(this.f14568a, this.f14569b), 1, null);
                if (this.f14568a.d().s() == EnumC3337o0.HalfExpanded) {
                    J0.t.q(wVar, null, new b(this.f14568a, this.f14569b), 1, null);
                } else if (this.f14568a.f()) {
                    J0.t.f(wVar, null, new C0559c(this.f14568a, this.f14569b), 1, null);
                }
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((J0.w) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: N.m0$d */
    static final class d extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ mh.q f14582a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(mh.q qVar) {
            super(2);
            this.f14582a = qVar;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(17396558, i10, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous>.<anonymous> (ModalBottomSheet.kt:445)");
            }
            mh.q qVar = this.f14582a;
            e.a aVar = androidx.compose.ui.e.f28771b0;
            C0.C cA = AbstractC8685h.a(C8680c.f66832a.g(), f0.c.f46573a.k(), interfaceC3540l, 0);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, aVar);
            InterfaceC2629g.a aVar2 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar2.a();
            if (interfaceC3540l.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540l.u();
            if (interfaceC3540l.o()) {
                interfaceC3540l.D(interfaceC6824aA);
            } else {
                interfaceC3540l.I();
            }
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540l);
            E1.c(interfaceC3540lA, cA, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            qVar.s(C8688k.f66923a, interfaceC3540l, 6);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: N.m0$e */
    static final class e extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ mh.q f14583a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f14584b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3335n0 f14585c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f14586d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ i1 f14587e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f14588f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f14589g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f14590h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f14591i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f14592j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f14593k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f14594l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(mh.q qVar, androidx.compose.ui.e eVar, C3335n0 c3335n0, boolean z10, i1 i1Var, float f10, long j10, long j11, long j12, InterfaceC6839p interfaceC6839p, int i10, int i11) {
            super(2);
            this.f14583a = qVar;
            this.f14584b = eVar;
            this.f14585c = c3335n0;
            this.f14586d = z10;
            this.f14587e = i1Var;
            this.f14588f = f10;
            this.f14589g = j10;
            this.f14590h = j11;
            this.f14591i = j12;
            this.f14592j = interfaceC6839p;
            this.f14593k = i10;
            this.f14594l = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC3333m0.b(this.f14583a, this.f14584b, this.f14585c, this.f14586d, this.f14587e, this.f14588f, this.f14589g, this.f14590h, this.f14591i, this.f14592j, interfaceC3540l, T.L0.a(this.f14593k | 1), this.f14594l);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: N.m0$f */
    static final class f extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f14595a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z1 f14596b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j10, z1 z1Var) {
            super(1);
            this.f14595a = j10;
            this.f14596b = z1Var;
        }

        public final void a(InterfaceC7039f interfaceC7039f) {
            InterfaceC7039f.u0(interfaceC7039f, this.f14595a, 0L, 0L, AbstractC3333m0.d(this.f14596b), null, null, 0, 118, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC7039f) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: N.m0$g */
    static final class g extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f14597a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f14598b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f14599c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f14600d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(long j10, InterfaceC6824a interfaceC6824a, boolean z10, int i10) {
            super(2);
            this.f14597a = j10;
            this.f14598b = interfaceC6824a;
            this.f14599c = z10;
            this.f14600d = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC3333m0.c(this.f14597a, this.f14598b, this.f14599c, interfaceC3540l, T.L0.a(this.f14600d | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: N.m0$h */
    static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f14601a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f14602b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f14603c;

        /* renamed from: N.m0$h$a */
        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC6824a f14604a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC6824a interfaceC6824a) {
                super(1);
                this.f14604a = interfaceC6824a;
            }

            public final void a(long j10) {
                this.f14604a.invoke();
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((C6531g) obj).v());
                return Yg.J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(InterfaceC6824a interfaceC6824a, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f14603c = interfaceC6824a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            h hVar = new h(this.f14603c, interfaceC5380e);
            hVar.f14602b = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f14601a;
            if (i10 == 0) {
                Yg.v.b(obj);
                InterfaceC8567G interfaceC8567G = (InterfaceC8567G) this.f14602b;
                a aVar = new a(this.f14603c);
                this.f14601a = 1;
                if (AbstractC8235B.k(interfaceC8567G, null, null, null, aVar, this, 7, null) == objG) {
                    return objG;
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
        public final Object invoke(InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e) {
            return ((h) create(interfaceC8567G, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* renamed from: N.m0$i */
    static final class i extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f14605a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f14606b;

        /* renamed from: N.m0$i$a */
        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC6824a f14607a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC6824a interfaceC6824a) {
                super(0);
                this.f14607a = interfaceC6824a;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                this.f14607a.invoke();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, InterfaceC6824a interfaceC6824a) {
            super(1);
            this.f14605a = str;
            this.f14606b = interfaceC6824a;
        }

        public final void a(J0.w wVar) {
            J0.t.a0(wVar, this.f14605a);
            J0.t.A(wVar, null, new a(this.f14606b), 1, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((J0.w) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: N.m0$j */
    static final class j extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3335n0 f14608a;

        /* renamed from: N.m0$j$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f14609a;

            static {
                int[] iArr = new int[EnumC3337o0.values().length];
                try {
                    iArr[EnumC3337o0.Hidden.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC3337o0.HalfExpanded.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC3337o0.Expanded.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f14609a = iArr;
            }
        }

        /* renamed from: N.m0$j$b */
        static final class b extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f14610a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3335n0 f14611b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f14612c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(float f10, C3335n0 c3335n0, long j10) {
                super(1);
                this.f14610a = f10;
                this.f14611b = c3335n0;
                this.f14612c = j10;
            }

            public final void a(E e10) {
                e10.a(EnumC3337o0.Hidden, this.f14610a);
                float f10 = this.f14610a / 2.0f;
                if (!this.f14611b.j() && Y0.r.f(this.f14612c) > f10) {
                    e10.a(EnumC3337o0.HalfExpanded, f10);
                }
                if (Y0.r.f(this.f14612c) != 0) {
                    e10.a(EnumC3337o0.Expanded, Math.max(0.0f, this.f14610a - Y0.r.f(this.f14612c)));
                }
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((E) obj);
                return Yg.J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(C3335n0 c3335n0) {
            super(2);
            this.f14608a = c3335n0;
        }

        public final Yg.s a(long j10, long j11) {
            D dA = androidx.compose.material.a.a(new b(Y0.b.k(j11), this.f14608a, j10));
            boolean z10 = this.f14608a.d().o().a() > 0;
            EnumC3337o0 enumC3337o0E = this.f14608a.e();
            if (z10 || !dA.f(enumC3337o0E)) {
                int i10 = a.f14609a[this.f14608a.g().ordinal()];
                if (i10 == 1) {
                    enumC3337o0E = EnumC3337o0.Hidden;
                } else {
                    if (i10 != 2 && i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    EnumC3337o0 enumC3337o0 = EnumC3337o0.HalfExpanded;
                    if (!dA.f(enumC3337o0)) {
                        enumC3337o0 = EnumC3337o0.Expanded;
                        if (!dA.f(enumC3337o0)) {
                            enumC3337o0 = EnumC3337o0.Hidden;
                        }
                    }
                    enumC3337o0E = enumC3337o0;
                }
            }
            return Yg.z.a(dA, enumC3337o0E);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Y0.r) obj).j(), ((Y0.b) obj2).r());
        }
    }

    /* renamed from: N.m0$k */
    static final class k extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final k f14613a = new k();

        k() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(EnumC3337o0 enumC3337o0) {
            return Boolean.TRUE;
        }
    }

    /* renamed from: N.m0$l */
    static final class l extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ EnumC3337o0 f14614a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Y0.d f14615b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f14616c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC7533i f14617d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f14618e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(EnumC3337o0 enumC3337o0, Y0.d dVar, InterfaceC6835l interfaceC6835l, InterfaceC7533i interfaceC7533i, boolean z10) {
            super(0);
            this.f14614a = enumC3337o0;
            this.f14615b = dVar;
            this.f14616c = interfaceC6835l;
            this.f14617d = interfaceC7533i;
            this.f14618e = z10;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3335n0 invoke() {
            return new C3335n0(this.f14614a, this.f14615b, this.f14616c, this.f14617d, this.f14618e);
        }
    }

    private static final InterfaceC8412a a(C3310b c3310b, w.q qVar) {
        return new a(c3310b, qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:236:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(mh.q r38, androidx.compose.ui.e r39, N.C3335n0 r40, boolean r41, m0.i1 r42, float r43, long r44, long r46, long r48, mh.InterfaceC6839p r50, T.InterfaceC3540l r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 1241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.AbstractC3333m0.b(mh.q, androidx.compose.ui.e, N.n0, boolean, m0.i1, float, long, long, long, mh.p, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(long j10, InterfaceC6824a interfaceC6824a, boolean z10, InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        androidx.compose.ui.e eVarB;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-526532668);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.j(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.l(interfaceC6824a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.c(z10) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i12 = i11;
        if ((i12 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-526532668, i12, -1, "androidx.compose.material.Scrim (ModalBottomSheet.kt:496)");
            }
            if (j10 != 16) {
                interfaceC3540lR.U(477285297);
                z1 z1VarD = AbstractC7521c.d(z10 ? 1.0f : 0.0f, new r.r0(0, 0, null, 7, null), 0.0f, null, null, interfaceC3540lR, 48, 28);
                String strA = N0.a(M0.f13846a.b(), interfaceC3540lR, 6);
                if (z10) {
                    interfaceC3540lR.U(477511845);
                    e.a aVar = androidx.compose.ui.e.f28771b0;
                    int i13 = i12 & 112;
                    boolean z11 = i13 == 32;
                    Object objF = interfaceC3540lR.f();
                    if (z11 || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new h(interfaceC6824a, null);
                        interfaceC3540lR.K(objF);
                    }
                    androidx.compose.ui.e eVarD = AbstractC8576P.d(aVar, interfaceC6824a, (InterfaceC6839p) objF);
                    boolean zT = interfaceC3540lR.T(strA) | (i13 == 32);
                    Object objF2 = interfaceC3540lR.f();
                    if (zT || objF2 == InterfaceC3540l.f21100a.a()) {
                        objF2 = new i(strA, interfaceC6824a);
                        interfaceC3540lR.K(objF2);
                    }
                    eVarB = J0.m.b(eVarD, true, (InterfaceC6835l) objF2);
                    interfaceC3540lR.J();
                } else {
                    interfaceC3540lR.U(477792674);
                    interfaceC3540lR.J();
                    eVarB = androidx.compose.ui.e.f28771b0;
                }
                androidx.compose.ui.e eVarB0 = androidx.compose.foundation.layout.r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null).b0(eVarB);
                boolean zT2 = interfaceC3540lR.T(z1VarD) | ((i12 & 14) == 4);
                Object objF3 = interfaceC3540lR.f();
                if (zT2 || objF3 == InterfaceC3540l.f21100a.a()) {
                    objF3 = new f(j10, z1VarD);
                    interfaceC3540lR.K(objF3);
                }
                AbstractC7848i.a(eVarB0, (InterfaceC6835l) objF3, interfaceC3540lR, 0);
                interfaceC3540lR.J();
            } else {
                interfaceC3540lR.U(478008930);
                interfaceC3540lR.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        T.X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new g(j10, interfaceC6824a, z10, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(z1 z1Var) {
        return ((Number) z1Var.getValue()).floatValue();
    }

    private static final androidx.compose.ui.e i(androidx.compose.ui.e eVar, C3335n0 c3335n0) {
        return androidx.compose.material.a.h(eVar, c3335n0.d(), w.q.Vertical, new j(c3335n0));
    }

    public static final C3335n0 j(EnumC3337o0 enumC3337o0, InterfaceC7533i interfaceC7533i, InterfaceC6835l interfaceC6835l, boolean z10, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        InterfaceC7533i interfaceC7533iA = (i11 & 2) != 0 ? C3331l0.f14534a.a() : interfaceC7533i;
        InterfaceC6835l interfaceC6835l2 = (i11 & 4) != 0 ? k.f14613a : interfaceC6835l;
        boolean z11 = (i11 & 8) != 0 ? false : z10;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-126412120, i10, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:291)");
        }
        Y0.d dVar = (Y0.d) interfaceC3540l.t(AbstractC3932k0.g());
        interfaceC3540l.s(976450751, enumC3337o0);
        Object[] objArr = {enumC3337o0, interfaceC7533iA, Boolean.valueOf(z11), interfaceC6835l2, dVar};
        InterfaceC4182k interfaceC4182kA = C3335n0.f14621d.a(interfaceC7533iA, interfaceC6835l2, z11, dVar);
        boolean zT = ((((i10 & 14) ^ 6) > 4 && interfaceC3540l.T(enumC3337o0)) || (i10 & 6) == 4) | interfaceC3540l.T(dVar) | ((((i10 & 896) ^ 384) > 256 && interfaceC3540l.T(interfaceC6835l2)) || (i10 & 384) == 256) | interfaceC3540l.l(interfaceC7533iA) | ((((i10 & 7168) ^ 3072) > 2048 && interfaceC3540l.c(z11)) || (i10 & 3072) == 2048);
        Object objF = interfaceC3540l.f();
        if (zT || objF == InterfaceC3540l.f21100a.a()) {
            Object lVar = new l(enumC3337o0, dVar, interfaceC6835l2, interfaceC7533iA, z11);
            interfaceC3540l.K(lVar);
            objF = lVar;
        }
        C3335n0 c3335n0 = (C3335n0) AbstractC4174c.e(objArr, interfaceC4182kA, null, (InterfaceC6824a) objF, interfaceC3540l, 0, 4);
        interfaceC3540l.N();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return c3335n0;
    }
}
