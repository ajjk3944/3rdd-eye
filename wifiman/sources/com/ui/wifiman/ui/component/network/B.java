package com.ui.wifiman.ui.component.network;

import A.AbstractC2395b;
import A.InterfaceC2396c;
import L0.C3174d;
import N.AbstractC3345t;
import N.a1;
import T.AbstractC3546o;
import T.AbstractC3561w;
import T.H0;
import T.I0;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import T.o1;
import T.z1;
import androidx.compose.ui.platform.AbstractC3932k0;
import b0.InterfaceC4038a;
import com.ui.wifiman.ui.component.network.B;
import com.ui.wifiman.ui.component.network.C5219q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import l0.AbstractC6532h;
import l0.C6537m;
import la.C6562a;
import m0.C6733v0;
import m0.V0;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import o0.InterfaceC7039f;
import org.conscrypt.PSKKeyManager;
import q.AbstractC7402u;
import s.AbstractC7848i;
import sa.AbstractC7930a;
import z.AbstractC8682e;
import z.InterfaceC8683f;

/* loaded from: classes4.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    private static final H0 f44301a = AbstractC3561w.f(new InterfaceC6824a() { // from class: com.ui.wifiman.ui.component.network.A
        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return B.o();
        }
    });

    static final class a implements mh.s {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f44302a;

        a(boolean z10) {
            this.f44302a = z10;
        }

        @Override // mh.s
        public /* bridge */ /* synthetic */ Object K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            a((InterfaceC2396c) obj, ((Y0.h) obj2).s(), (C5219q.a) obj3, (InterfaceC3540l) obj4, ((Number) obj5).intValue());
            return Yg.J.f24997a;
        }

        public final void a(InterfaceC2396c interfaceC2396c, float f10, C5219q.a connection, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            AbstractC6492s.i(interfaceC2396c, "<this>");
            AbstractC6492s.i(connection, "connection");
            if ((i10 & 6) == 0) {
                i11 = (interfaceC3540l.T(interfaceC2396c) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= interfaceC3540l.g(f10) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                i11 |= interfaceC3540l.T(connection) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            if ((i11 & 1171) == 1170 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1576896590, i11, -1, "com.ui.wifiman.ui.component.network.BaseNetworkTopology.<anonymous> (NetworkTopology.kt:173)");
            }
            androidx.compose.ui.e eVarB = androidx.compose.ui.e.f28771b0;
            if (this.f44302a) {
                eVarB = InterfaceC2396c.b(interfaceC2396c, eVarB, null, 1, null);
            }
            B.p(androidx.compose.foundation.layout.r.s(androidx.compose.foundation.layout.o.m(eVarB, 0.0f, Y0.h.j(Y0.h.j(64) / 2), 0.0f, 0.0f, 13, null), f10), connection, interfaceC3540l, (i11 >> 3) & 112);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
    }

    static final class b implements mh.s {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f44303a;

        b(boolean z10) {
            this.f44303a = z10;
        }

        @Override // mh.s
        public /* bridge */ /* synthetic */ Object K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            a((InterfaceC2396c) obj, ((Y0.h) obj2).s(), (C5219q.b) obj3, (InterfaceC3540l) obj4, ((Number) obj5).intValue());
            return Yg.J.f24997a;
        }

        public final void a(InterfaceC2396c interfaceC2396c, float f10, C5219q.b item, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            AbstractC6492s.i(interfaceC2396c, "<this>");
            AbstractC6492s.i(item, "item");
            if ((i10 & 6) == 0) {
                i11 = (interfaceC3540l.T(interfaceC2396c) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= interfaceC3540l.g(f10) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                i11 |= (i10 & 512) == 0 ? interfaceC3540l.T(item) : interfaceC3540l.l(item) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            if ((i11 & 1171) == 1170 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(454813239, i11, -1, "com.ui.wifiman.ui.component.network.BaseNetworkTopology.<anonymous> (NetworkTopology.kt:188)");
            }
            androidx.compose.ui.e eVarS = androidx.compose.foundation.layout.r.s(androidx.compose.ui.e.f28771b0, f10);
            B.s(this.f44303a ? InterfaceC2396c.b(interfaceC2396c, eVarS, null, 1, null) : eVarS, item, null, null, null, 0L, interfaceC3540l, (i11 >> 3) & 112, 60);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
    }

    static final class c implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f44304a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ mh.q f44305b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ mh.r f44306c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ mh.t f44307d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ mh.s f44308e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ mh.s f44309f;

        static final class a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ mh.q f44310a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ mh.r f44311b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ mh.t f44312c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ mh.s f44313d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ mh.s f44314e;

            /* renamed from: com.ui.wifiman.ui.component.network.B$c$a$a, reason: collision with other inner class name */
            static final class C1545a implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ float f44315a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C5219q.c f44316b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ mh.s f44317c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ A.B f44318d;

                /* renamed from: com.ui.wifiman.ui.component.network.B$c$a$a$a, reason: collision with other inner class name */
                static final class C1546a implements mh.r {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ mh.s f44319a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ float f44320b;

                    C1546a(mh.s sVar, float f10) {
                        this.f44319a = sVar;
                        this.f44320b = f10;
                    }

                    public final void a(InterfaceC2396c paddedItems, Yg.s destruct$, InterfaceC3540l interfaceC3540l, int i10) {
                        int i11;
                        AbstractC6492s.i(paddedItems, "$this$paddedItems");
                        AbstractC6492s.i(destruct$, "$destruct$");
                        if ((i10 & 6) == 0) {
                            i11 = (interfaceC3540l.T(paddedItems) ? 4 : 2) | i10;
                        } else {
                            i11 = i10;
                        }
                        if ((i10 & 48) == 0) {
                            i11 |= (i10 & 64) == 0 ? interfaceC3540l.T(destruct$) : interfaceC3540l.l(destruct$) ? 32 : 16;
                        }
                        if ((i11 & 147) == 146 && interfaceC3540l.v()) {
                            interfaceC3540l.C();
                            return;
                        }
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.Q(-1228121961, i11, -1, "com.ui.wifiman.ui.component.network.BaseNetworkTopology.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NetworkTopology.kt:242)");
                        }
                        this.f44319a.K(paddedItems, Y0.h.d(this.f44320b), (C5219q.a) destruct$.c(), interfaceC3540l, Integer.valueOf(i11 & 14));
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.P();
                        }
                    }

                    @Override // mh.r
                    public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
                        a((InterfaceC2396c) obj, (Yg.s) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
                        return Yg.J.f24997a;
                    }
                }

                C1545a(float f10, C5219q.c cVar, mh.s sVar, A.B b10) {
                    this.f44315a = f10;
                    this.f44316b = cVar;
                    this.f44317c = sVar;
                    this.f44318d = b10;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final int i(A.B b10) {
                    return b10.r();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final int j(A.B b10) {
                    return b10.s();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Yg.J k(final C5219q.c cVar, mh.s sVar, float f10, A.y LazyRow) {
                    AbstractC6492s.i(LazyRow, "$this$LazyRow");
                    B.B(LazyRow, cVar.a().size(), new InterfaceC6835l() { // from class: com.ui.wifiman.ui.component.network.F
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return B.c.a.C1545a.l(cVar, ((Integer) obj).intValue());
                        }
                    }, new InterfaceC6835l() { // from class: com.ui.wifiman.ui.component.network.G
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return B.c.a.C1545a.n((Yg.s) obj);
                        }
                    }, b0.c.c(-1228121961, true, new C1546a(sVar, f10)));
                    return Yg.J.f24997a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Yg.s l(C5219q.c cVar, int i10) {
                    return (Yg.s) cVar.a().get(i10);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String n(Yg.s item) {
                    AbstractC6492s.i(item, "item");
                    return ((C5219q.b) item.h()).getId();
                }

                public final void h(InterfaceC3540l interfaceC3540l, int i10) {
                    if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(1229026361, i10, -1, "com.ui.wifiman.ui.component.network.BaseNetworkTopology.<anonymous>.<anonymous>.<anonymous> (NetworkTopology.kt:225)");
                    }
                    androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
                    interfaceC3540l.U(-2096176650);
                    final A.B b10 = this.f44318d;
                    Object objF = interfaceC3540l.f();
                    InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
                    if (objF == aVar.a()) {
                        objF = o1.e(new InterfaceC6824a() { // from class: com.ui.wifiman.ui.component.network.C
                            @Override // mh.InterfaceC6824a
                            public final Object invoke() {
                                return Integer.valueOf(B.c.a.C1545a.i(b10));
                            }
                        });
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    int iIntValue = ((Number) ((z1) objF).getValue()).intValue();
                    interfaceC3540l.U(-2096173507);
                    final A.B b11 = this.f44318d;
                    Object objF2 = interfaceC3540l.f();
                    if (objF2 == aVar.a()) {
                        objF2 = o1.e(new InterfaceC6824a() { // from class: com.ui.wifiman.ui.component.network.D
                            @Override // mh.InterfaceC6824a
                            public final Object invoke() {
                                return Integer.valueOf(B.c.a.C1545a.j(b11));
                            }
                        });
                        interfaceC3540l.K(objF2);
                    }
                    interfaceC3540l.J();
                    A.B b12 = new A.B(iIntValue, ((Number) ((z1) objF2).getValue()).intValue());
                    z.N nC = androidx.compose.foundation.layout.o.c(Y0.h.j(this.f44315a / 2), 0.0f, 2, null);
                    interfaceC3540l.U(-2096165403);
                    boolean zL = interfaceC3540l.l(this.f44316b) | interfaceC3540l.T(this.f44317c) | interfaceC3540l.g(this.f44315a);
                    final C5219q.c cVar = this.f44316b;
                    final mh.s sVar = this.f44317c;
                    final float f10 = this.f44315a;
                    Object objF3 = interfaceC3540l.f();
                    if (zL || objF3 == aVar.a()) {
                        objF3 = new InterfaceC6835l() { // from class: com.ui.wifiman.ui.component.network.E
                            @Override // mh.InterfaceC6835l
                            public final Object invoke(Object obj) {
                                return B.c.a.C1545a.k(cVar, sVar, f10, (A.y) obj);
                            }
                        };
                        interfaceC3540l.K(objF3);
                    }
                    interfaceC3540l.J();
                    AbstractC2395b.b(eVarH, b12, nC, false, null, null, null, false, (InterfaceC6835l) objF3, interfaceC3540l, 12582918, 120);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.InterfaceC6839p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    h((InterfaceC3540l) obj, ((Number) obj2).intValue());
                    return Yg.J.f24997a;
                }
            }

            static final class b implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ A.B f44321a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C5219q.c f44322b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ mh.s f44323c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ float f44324d;

                /* renamed from: com.ui.wifiman.ui.component.network.B$c$a$b$a, reason: collision with other inner class name */
                static final class C1547a implements mh.r {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ mh.s f44325a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ float f44326b;

                    C1547a(mh.s sVar, float f10) {
                        this.f44325a = sVar;
                        this.f44326b = f10;
                    }

                    public final void a(InterfaceC2396c paddedItems, C5219q.b item, InterfaceC3540l interfaceC3540l, int i10) {
                        int i11;
                        AbstractC6492s.i(paddedItems, "$this$paddedItems");
                        AbstractC6492s.i(item, "item");
                        if ((i10 & 6) == 0) {
                            i11 = (interfaceC3540l.T(paddedItems) ? 4 : 2) | i10;
                        } else {
                            i11 = i10;
                        }
                        if ((i10 & 48) == 0) {
                            i11 |= (i10 & 64) == 0 ? interfaceC3540l.T(item) : interfaceC3540l.l(item) ? 32 : 16;
                        }
                        if ((i11 & 147) == 146 && interfaceC3540l.v()) {
                            interfaceC3540l.C();
                            return;
                        }
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.Q(1641228898, i11, -1, "com.ui.wifiman.ui.component.network.BaseNetworkTopology.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NetworkTopology.kt:271)");
                        }
                        this.f44325a.K(paddedItems, Y0.h.d(this.f44326b), item, interfaceC3540l, Integer.valueOf((i11 & 14) | ((i11 << 3) & 896)));
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.P();
                        }
                    }

                    @Override // mh.r
                    public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
                        a((InterfaceC2396c) obj, (C5219q.b) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
                        return Yg.J.f24997a;
                    }
                }

                b(A.B b10, C5219q.c cVar, mh.s sVar, float f10) {
                    this.f44321a = b10;
                    this.f44322b = cVar;
                    this.f44323c = sVar;
                    this.f44324d = f10;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Yg.J f(final C5219q.c cVar, mh.s sVar, float f10, A.y LazyRow) {
                    AbstractC6492s.i(LazyRow, "$this$LazyRow");
                    B.B(LazyRow, C5219q.f44518a.e(cVar), new InterfaceC6835l() { // from class: com.ui.wifiman.ui.component.network.I
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return B.c.a.b.h(cVar, ((Integer) obj).intValue());
                        }
                    }, new InterfaceC6835l() { // from class: com.ui.wifiman.ui.component.network.J
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return B.c.a.b.i((C5219q.b) obj);
                        }
                    }, b0.c.c(1641228898, true, new C1547a(sVar, f10)));
                    return Yg.J.f24997a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final C5219q.b h(C5219q.c cVar, int i10) {
                    return i10 == 0 ? cVar.b() : (C5219q.b) ((Yg.s) cVar.a().get(i10 - 1)).h();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String i(C5219q.b item) {
                    AbstractC6492s.i(item, "item");
                    return item.getId();
                }

                public final void e(InterfaceC3540l interfaceC3540l, int i10) {
                    if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-1860433310, i10, -1, "com.ui.wifiman.ui.component.network.BaseNetworkTopology.<anonymous>.<anonymous>.<anonymous> (NetworkTopology.kt:256)");
                    }
                    androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
                    A.B b10 = this.f44321a;
                    interfaceC3540l.U(-2096140559);
                    boolean zL = interfaceC3540l.l(this.f44322b) | interfaceC3540l.T(this.f44323c) | interfaceC3540l.g(this.f44324d);
                    final C5219q.c cVar = this.f44322b;
                    final mh.s sVar = this.f44323c;
                    final float f10 = this.f44324d;
                    Object objF = interfaceC3540l.f();
                    if (zL || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new InterfaceC6835l() { // from class: com.ui.wifiman.ui.component.network.H
                            @Override // mh.InterfaceC6835l
                            public final Object invoke(Object obj) {
                                return B.c.a.b.f(cVar, sVar, f10, (A.y) obj);
                            }
                        };
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    AbstractC2395b.b(eVarH, b10, null, false, null, null, null, false, (InterfaceC6835l) objF, interfaceC3540l, 6, 252);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.InterfaceC6839p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    e((InterfaceC3540l) obj, ((Number) obj2).intValue());
                    return Yg.J.f24997a;
                }
            }

            a(mh.q qVar, mh.r rVar, mh.t tVar, mh.s sVar, mh.s sVar2) {
                this.f44310a = qVar;
                this.f44311b = rVar;
                this.f44312c = tVar;
                this.f44313d = sVar;
                this.f44314e = sVar2;
            }

            public final void a(InterfaceC8683f BoxWithConstraints, InterfaceC3540l interfaceC3540l, int i10) {
                int i11;
                AbstractC6492s.i(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((i10 & 6) == 0) {
                    i11 = i10 | (interfaceC3540l.T(BoxWithConstraints) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-438382343, i11, -1, "com.ui.wifiman.ui.component.network.BaseNetworkTopology.<anonymous>.<anonymous> (NetworkTopology.kt:209)");
                }
                A.B bC = A.C.c(0, 0, interfaceC3540l, 0, 3);
                int i12 = i11 & 14;
                C5219q.c cVar = (C5219q.c) this.f44310a.s(BoxWithConstraints, interfaceC3540l, Integer.valueOf(i12));
                float fS = ((Y0.h) this.f44311b.y(BoxWithConstraints, cVar, interfaceC3540l, Integer.valueOf(i12))).s();
                z1 z1VarA = AbstractC7402u.a(((C6733v0) cVar.c().invoke(interfaceC3540l, 0)).u(), null, "connection", null, interfaceC3540l, 384, 10);
                I0 i0D = AbstractC3345t.a().d(z1VarA.getValue());
                InterfaceC4038a interfaceC4038aE = b0.c.e(1229026361, true, new C1545a(fS, cVar, this.f44313d, bC), interfaceC3540l, 54);
                int i13 = I0.f20869i;
                AbstractC3561w.a(i0D, interfaceC4038aE, interfaceC3540l, i13 | 48);
                AbstractC3561w.a(s.Q.a().d(null), b0.c.e(-1860433310, true, new b(bC, cVar, this.f44314e, fS), interfaceC3540l, 54), interfaceC3540l, i13 | 48);
                this.f44312c.F(BoxWithConstraints, bC, Y0.h.d(fS), z1VarA.getValue(), interfaceC3540l, Integer.valueOf(i12));
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((InterfaceC8683f) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return Yg.J.f24997a;
            }
        }

        c(androidx.compose.ui.e eVar, mh.q qVar, mh.r rVar, mh.t tVar, mh.s sVar, mh.s sVar2) {
            this.f44304a = eVar;
            this.f44305b = qVar;
            this.f44306c = rVar;
            this.f44307d = tVar;
            this.f44308e = sVar;
            this.f44309f = sVar2;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1808148849, i10, -1, "com.ui.wifiman.ui.component.network.BaseNetworkTopology.<anonymous> (NetworkTopology.kt:206)");
            }
            AbstractC8682e.a(this.f44304a, null, false, b0.c.e(-438382343, true, new a(this.f44305b, this.f44306c, this.f44307d, this.f44308e, this.f44309f), interfaceC3540l, 54), interfaceC3540l, 3072, 6);
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

    static final class d implements mh.r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f44327a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ mh.r f44328b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f44329c;

        d(int i10, mh.r rVar, InterfaceC6835l interfaceC6835l) {
            this.f44327a = i10;
            this.f44328b = rVar;
            this.f44329c = interfaceC6835l;
        }

        public final void a(InterfaceC2396c items, int i10, InterfaceC3540l interfaceC3540l, int i11) {
            int i12;
            AbstractC6492s.i(items, "$this$items");
            if ((i11 & 6) == 0) {
                i12 = (interfaceC3540l.T(items) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= interfaceC3540l.i(i10) ? 32 : 16;
            }
            if ((i12 & 147) == 146 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1916222224, i12, -1, "com.ui.wifiman.ui.component.network.paddedItems.<anonymous> (NetworkTopology.kt:156)");
            }
            if (i10 == 0 || i10 == this.f44327a - 1) {
                interfaceC3540l.U(-202483471);
                B.m(interfaceC3540l, 0);
                interfaceC3540l.J();
            } else {
                interfaceC3540l.U(-202482054);
                this.f44328b.y(items, this.f44329c.invoke(Integer.valueOf(i10 - 1)), interfaceC3540l, Integer.valueOf(i12 & 14));
                interfaceC3540l.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
            a((InterfaceC2396c) obj, ((Number) obj2).intValue(), (InterfaceC3540l) obj3, ((Number) obj4).intValue());
            return Yg.J.f24997a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(A.y yVar, int i10, final InterfaceC6835l interfaceC6835l, final InterfaceC6835l interfaceC6835l2, mh.r rVar) {
        final int i11 = i10 + 2;
        yVar.a(i11, new InterfaceC6835l() { // from class: com.ui.wifiman.ui.component.network.w
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return B.C(i11, interfaceC6835l2, interfaceC6835l, ((Integer) obj).intValue());
            }
        }, new InterfaceC6835l() { // from class: com.ui.wifiman.ui.component.network.x
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return B.D(i11, ((Integer) obj).intValue());
            }
        }, b0.c.c(1916222224, true, new d(i11, rVar, interfaceC6835l)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object C(int i10, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, int i11) {
        return i11 == 0 ? "paddingStart" : i11 == i10 + (-1) ? "paddingEnd" : (String) interfaceC6835l.invoke(interfaceC6835l2.invoke(Integer.valueOf(i11 - 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object D(int i10, int i11) {
        return (i11 == 0 || i11 == i10 + (-1)) ? "padding" : "item";
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void k(final androidx.compose.ui.e r18, final mh.q r19, boolean r20, float r21, mh.r r22, mh.s r23, mh.s r24, mh.t r25, T.InterfaceC3540l r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.ui.component.network.B.k(androidx.compose.ui.e, mh.q, boolean, float, mh.r, mh.s, mh.s, mh.t, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J l(androidx.compose.ui.e eVar, mh.q qVar, boolean z10, float f10, mh.r rVar, mh.s sVar, mh.s sVar2, mh.t tVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        k(eVar, qVar, z10, f10, rVar, sVar, sVar2, tVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(InterfaceC3540l interfaceC3540l, final int i10) {
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1936243556);
        if (i10 == 0 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1936243556, i10, -1, "com.ui.wifiman.ui.component.network.HorizontalPaddingItem (NetworkTopology.kt:284)");
            }
            z.a0.a(androidx.compose.foundation.layout.r.z(androidx.compose.ui.e.f28771b0, ((Y0.h) interfaceC3540lR.t(f44301a)).s()), interfaceC3540lR, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: com.ui.wifiman.ui.component.network.y
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return B.n(i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J n(int i10, InterfaceC3540l interfaceC3540l, int i11) {
        m(interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y0.h o() {
        throw new IllegalStateException("No padding set");
    }

    public static final void p(final androidx.compose.ui.e modifier, final C5219q.a connection, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(connection, "connection");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(53066962);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(connection) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(53066962, i11, -1, "com.ui.wifiman.ui.component.network.TopologyConnection (NetworkTopology.kt:346)");
            }
            interfaceC3540lR.U(844330150);
            final V0 v0C = null;
            if (connection == C5219q.a.WIRELESS) {
                Y0.d dVar = (Y0.d) interfaceC3540lR.t(AbstractC3932k0.g());
                v0C = V0.a.c(V0.f52859a, new float[]{dVar.d1(Y0.h.j(8.0f)), dVar.d1(Y0.h.j(4.0f))}, 0.0f, 2, null);
            } else if (connection != C5219q.a.WIRED) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC3540lR.J();
            final long jU = ((C6733v0) interfaceC3540lR.t(AbstractC3345t.a())).u();
            float f10 = 1;
            final float fD1 = ((Y0.d) interfaceC3540lR.t(AbstractC3932k0.g())).d1(Y0.h.j(f10));
            androidx.compose.ui.e eVarL = androidx.compose.foundation.layout.r.l(modifier, Y0.h.j(f10));
            interfaceC3540lR.U(844353303);
            boolean zJ = interfaceC3540lR.j(jU) | interfaceC3540lR.g(fD1) | interfaceC3540lR.l(v0C);
            Object objF = interfaceC3540lR.f();
            if (zJ || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6835l() { // from class: com.ui.wifiman.ui.component.network.u
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return B.q(jU, fD1, v0C, (InterfaceC7039f) obj);
                    }
                };
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            AbstractC7848i.a(eVarL, (InterfaceC6835l) objF, interfaceC3540lR, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: com.ui.wifiman.ui.component.network.v
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return B.r(modifier, connection, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J q(long j10, float f10, V0 v02, InterfaceC7039f Canvas) {
        AbstractC6492s.i(Canvas, "$this$Canvas");
        InterfaceC7039f.w1(Canvas, j10, AbstractC6532h.a(0.0f, 0.0f), AbstractC6532h.a(C6537m.i(Canvas.c()), 0.0f), f10, 0, v02, 0.0f, null, 0, 464, null);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J r(androidx.compose.ui.e eVar, C5219q.a aVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        p(eVar, aVar, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void s(final androidx.compose.ui.e r29, final com.ui.wifiman.ui.component.network.C5219q.b r30, mh.q r31, mh.q r32, mh.q r33, long r34, T.InterfaceC3540l r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.ui.component.network.B.s(androidx.compose.ui.e, com.ui.wifiman.ui.component.network.q$b, mh.q, mh.q, mh.q, long, T.l, int, int):void");
    }

    public static final void t(final androidx.compose.ui.e modifier, final C5219q.b item, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(item, "item");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-219162989);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? interfaceC3540lR.T(item) : interfaceC3540lR.l(item) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-219162989, i12, -1, "com.ui.wifiman.ui.component.network.TopologyItemSubtitle (NetworkTopology.kt:398)");
            }
            s9.d dVarB = item.b();
            if (dVarB == null) {
                interfaceC3540l2 = interfaceC3540lR;
            } else {
                C3174d c3174dA = AbstractC7930a.a(dVarB, interfaceC3540lR, 0);
                int iA = W0.j.f23523b.a();
                int iB = W0.t.f23567a.b();
                C6562a c6562a = C6562a.f52458a;
                int i13 = C6562a.f52459b;
                interfaceC3540l2 = interfaceC3540lR;
                a1.c(c3174dA, modifier, c6562a.a(interfaceC3540lR, i13).f().c(), 0L, null, null, null, 0L, null, W0.j.h(iA), 0L, iB, false, 1, 0, null, null, c6562a.c(interfaceC3540lR, i13).b().f(), interfaceC3540l2, (i12 << 3) & 112, 3120, 120312);
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: com.ui.wifiman.ui.component.network.t
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return B.u(modifier, item, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J u(androidx.compose.ui.e eVar, C5219q.b bVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        t(eVar, bVar, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    public static final void v(final androidx.compose.ui.e modifier, final C5219q.b item, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(item, "item");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1346608397);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? interfaceC3540lR.T(item) : interfaceC3540lR.l(item) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1346608397, i12, -1, "com.ui.wifiman.ui.component.network.TopologyItemTitle (NetworkTopology.kt:379)");
            }
            s9.d title = item.getTitle();
            if (title == null) {
                interfaceC3540l2 = interfaceC3540lR;
            } else {
                C3174d c3174dA = AbstractC7930a.a(title, interfaceC3540lR, 0);
                int iA = W0.j.f23523b.a();
                int iB = W0.t.f23567a.b();
                C6562a c6562a = C6562a.f52458a;
                int i13 = C6562a.f52459b;
                interfaceC3540l2 = interfaceC3540lR;
                a1.c(c3174dA, modifier, c6562a.a(interfaceC3540lR, i13).f().a(), 0L, null, null, null, 0L, null, W0.j.h(iA), 0L, iB, false, 1, 0, null, null, c6562a.c(interfaceC3540lR, i13).b().a(), interfaceC3540l2, (i12 << 3) & 112, 3120, 120312);
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: com.ui.wifiman.ui.component.network.s
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return B.w(modifier, item, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J w(androidx.compose.ui.e eVar, C5219q.b bVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        v(eVar, bVar, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J x(androidx.compose.ui.e eVar, C5219q.b bVar, mh.q qVar, mh.q qVar2, mh.q qVar3, long j10, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        s(eVar, bVar, qVar, qVar2, qVar3, j10, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }
}
