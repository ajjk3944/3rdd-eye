package I;

import I.N0;
import Ii.AbstractC3063k;
import Ii.InterfaceC3091y0;
import Li.InterfaceC3221h;
import R0.C3465s;
import T.AbstractC3535i0;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.C6490p;
import l0.C6533i;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* renamed from: I.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2920a extends N0 {

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC3091y0 f8130b;

    /* renamed from: c, reason: collision with root package name */
    private P0 f8131c;

    /* renamed from: d, reason: collision with root package name */
    private Li.y f8132d;

    /* renamed from: I.a$a, reason: collision with other inner class name */
    static final class C0331a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ R0.Q f8133a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2920a f8134b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3465s f8135c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f8136d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f8137e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0331a(R0.Q q10, C2920a c2920a, C3465s c3465s, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
            super(1);
            this.f8133a = q10;
            this.f8134b = c2920a;
            this.f8135c = c3465s;
            this.f8136d = interfaceC6835l;
            this.f8137e = interfaceC6835l2;
        }

        public final void a(P0 p02) {
            p02.l(this.f8133a, this.f8134b.i(), this.f8135c, this.f8136d, this.f8137e);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((P0) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: I.a$b */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f8138a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f8139b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f8140c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2920a f8141d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ N0.a f8142e;

        /* renamed from: I.a$b$a, reason: collision with other inner class name */
        static final class C0332a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f8143a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f8144b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.O0 f8145c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f8146d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C2920a f8147e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ N0.a f8148f;

            /* renamed from: I.a$b$a$a, reason: collision with other inner class name */
            static final class C0333a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f8149a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C2920a f8150b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ I0 f8151c;

                /* renamed from: I.a$b$a$a$a, reason: collision with other inner class name */
                static final class C0334a extends AbstractC6494u implements InterfaceC6835l {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C0334a f8152a = new C0334a();

                    C0334a() {
                        super(1);
                    }

                    public final void a(long j10) {
                    }

                    @Override // mh.InterfaceC6835l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a(((Number) obj).longValue());
                        return Yg.J.f24997a;
                    }
                }

                /* renamed from: I.a$b$a$a$b, reason: collision with other inner class name */
                static final class C0335b implements InterfaceC3221h {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ I0 f8153a;

                    C0335b(I0 i02) {
                        this.f8153a = i02;
                    }

                    @Override // Li.InterfaceC3221h
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Object a(Yg.J j10, InterfaceC5380e interfaceC5380e) {
                        this.f8153a.e();
                        return Yg.J.f24997a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0333a(C2920a c2920a, I0 i02, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f8150b = c2920a;
                    this.f8151c = i02;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new C0333a(this.f8150b, this.f8151c, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f8149a;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        C0334a c0334a = C0334a.f8152a;
                        this.f8149a = 1;
                        if (AbstractC3535i0.b(c0334a, this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Yg.v.b(obj);
                            throw new KotlinNothingValueException();
                        }
                        Yg.v.b(obj);
                    }
                    Li.y yVarP = this.f8150b.p();
                    if (yVarP == null) {
                        return Yg.J.f24997a;
                    }
                    C0335b c0335b = new C0335b(this.f8151c);
                    this.f8149a = 2;
                    if (yVarP.b(c0335b, this) == objG) {
                        return objG;
                    }
                    throw new KotlinNothingValueException();
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                    return ((C0333a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                }
            }

            /* renamed from: I.a$b$a$b, reason: collision with other inner class name */
            /* synthetic */ class C0336b extends C6490p implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ N0.a f8154a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0336b(N0.a aVar) {
                    super(1, AbstractC6492s.a.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
                    this.f8154a = aVar;
                }

                public final void a(float[] fArr) {
                    C2920a.r(this.f8154a, fArr);
                }

                @Override // mh.InterfaceC6835l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a(((m0.O0) obj).r());
                    return Yg.J.f24997a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0332a(androidx.compose.ui.platform.O0 o02, InterfaceC6835l interfaceC6835l, C2920a c2920a, N0.a aVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f8145c = o02;
                this.f8146d = interfaceC6835l;
                this.f8147e = c2920a;
                this.f8148f = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                C0332a c0332a = new C0332a(this.f8145c, this.f8146d, this.f8147e, this.f8148f, interfaceC5380e);
                c0332a.f8144b = obj;
                return c0332a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f8143a;
                try {
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        Ii.N n10 = (Ii.N) this.f8144b;
                        I0 i02 = (I0) O0.c().invoke(this.f8145c.a());
                        P0 p02 = new P0(this.f8145c.a(), new C0336b(this.f8148f), i02);
                        if (G.c.a()) {
                            AbstractC3063k.d(n10, null, null, new C0333a(this.f8147e, i02, null), 3, null);
                        }
                        InterfaceC6835l interfaceC6835l = this.f8146d;
                        if (interfaceC6835l != null) {
                            interfaceC6835l.invoke(p02);
                        }
                        this.f8147e.f8131c = p02;
                        androidx.compose.ui.platform.O0 o02 = this.f8145c;
                        this.f8143a = 1;
                        if (o02.b(p02, this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Yg.v.b(obj);
                    }
                    throw new KotlinNothingValueException();
                } catch (Throwable th2) {
                    this.f8147e.f8131c = null;
                    throw th2;
                }
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                return ((C0332a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC6835l interfaceC6835l, C2920a c2920a, N0.a aVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f8140c = interfaceC6835l;
            this.f8141d = c2920a;
            this.f8142e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            b bVar = new b(this.f8140c, this.f8141d, this.f8142e, interfaceC5380e);
            bVar.f8139b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f8138a;
            if (i10 == 0) {
                Yg.v.b(obj);
                C0332a c0332a = new C0332a((androidx.compose.ui.platform.O0) this.f8139b, this.f8140c, this.f8141d, this.f8142e, null);
                this.f8138a = 1;
                if (Ii.O.g(c0332a, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(androidx.compose.ui.platform.O0 o02, InterfaceC5380e interfaceC5380e) {
            return ((b) create(o02, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Li.y p() {
        Li.y yVar = this.f8132d;
        if (yVar != null) {
            return yVar;
        }
        if (!G.c.a()) {
            return null;
        }
        Li.y yVarB = Li.F.b(1, 0, Ki.a.DROP_LATEST, 2, null);
        this.f8132d = yVarB;
        return yVarB;
    }

    private final void q(InterfaceC6835l interfaceC6835l) {
        N0.a aVarI = i();
        if (aVarI == null) {
            return;
        }
        this.f8130b = aVarI.U0(new b(interfaceC6835l, this, aVarI, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(N0.a aVar, float[] fArr) {
        C0.r rVarO1 = aVar.o1();
        if (rVarO1 != null) {
            if (!rVarO1.M()) {
                rVarO1 = null;
            }
            if (rVarO1 == null) {
                return;
            }
            rVarO1.O(fArr);
        }
    }

    @Override // R0.L
    public void a(R0.Q q10, C3465s c3465s, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
        q(new C0331a(q10, this, c3465s, interfaceC6835l, interfaceC6835l2));
    }

    @Override // R0.L
    public void b() {
        q(null);
    }

    @Override // R0.L
    public void d() {
        InterfaceC3091y0 interfaceC3091y0 = this.f8130b;
        if (interfaceC3091y0 != null) {
            InterfaceC3091y0.a.b(interfaceC3091y0, null, 1, null);
        }
        this.f8130b = null;
        Li.y yVarP = p();
        if (yVarP != null) {
            yVarP.h();
        }
    }

    @Override // R0.L
    public void e(R0.Q q10, R0.H h10, L0.M m10, InterfaceC6835l interfaceC6835l, C6533i c6533i, C6533i c6533i2) {
        P0 p02 = this.f8131c;
        if (p02 != null) {
            p02.n(q10, h10, m10, c6533i, c6533i2);
        }
    }

    @Override // R0.L
    public void f(R0.Q q10, R0.Q q11) {
        P0 p02 = this.f8131c;
        if (p02 != null) {
            p02.m(q10, q11);
        }
    }

    @Override // R0.L
    public void h(C6533i c6533i) {
        P0 p02 = this.f8131c;
        if (p02 != null) {
            p02.j(c6533i);
        }
    }

    @Override // I.N0
    public void k() {
        Li.y yVarP = p();
        if (yVarP != null) {
            yVarP.j(Yg.J.f24997a);
        }
    }
}
