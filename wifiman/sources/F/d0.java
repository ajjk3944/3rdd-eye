package F;

import Ii.AbstractC3063k;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.o1;
import T.t1;
import T.z1;
import androidx.compose.ui.e;
import dh.C5385j;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6531g;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import w.AbstractC8235B;
import y.InterfaceC8555j;
import y.InterfaceC8558m;
import y.InterfaceC8560o;
import y0.AbstractC8576P;
import y0.InterfaceC8567G;

/* loaded from: classes.dex */
public abstract class d0 {

    static final class a extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f5062a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC8558m f5063b;

        /* renamed from: F.d0$a$a, reason: collision with other inner class name */
        static final class C0215a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3551q0 f5064a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC8558m f5065b;

            /* renamed from: F.d0$a$a$a, reason: collision with other inner class name */
            public static final class C0216a implements T.K {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3551q0 f5066a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC8558m f5067b;

                public C0216a(InterfaceC3551q0 interfaceC3551q0, InterfaceC8558m interfaceC8558m) {
                    this.f5066a = interfaceC3551q0;
                    this.f5067b = interfaceC8558m;
                }

                @Override // T.K
                public void dispose() {
                    InterfaceC8560o.b bVar = (InterfaceC8560o.b) this.f5066a.getValue();
                    if (bVar != null) {
                        InterfaceC8560o.a aVar = new InterfaceC8560o.a(bVar);
                        InterfaceC8558m interfaceC8558m = this.f5067b;
                        if (interfaceC8558m != null) {
                            interfaceC8558m.c(aVar);
                        }
                        this.f5066a.setValue(null);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0215a(InterfaceC3551q0 interfaceC3551q0, InterfaceC8558m interfaceC8558m) {
                super(1);
                this.f5064a = interfaceC3551q0;
                this.f5065b = interfaceC8558m;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final T.K invoke(T.L l10) {
                return new C0216a(this.f5064a, this.f5065b);
            }
        }

        static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f5068a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f5069b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Ii.N f5070c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC3551q0 f5071d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC8558m f5072e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ z1 f5073f;

            /* renamed from: F.d0$a$b$a, reason: collision with other inner class name */
            static final class C0217a extends kotlin.coroutines.jvm.internal.l implements mh.q {

                /* renamed from: a, reason: collision with root package name */
                int f5074a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f5075b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ long f5076c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ Ii.N f5077d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC3551q0 f5078e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ InterfaceC8558m f5079f;

                /* renamed from: F.d0$a$b$a$a, reason: collision with other inner class name */
                static final class C0218a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                    /* renamed from: a, reason: collision with root package name */
                    Object f5080a;

                    /* renamed from: b, reason: collision with root package name */
                    int f5081b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ InterfaceC3551q0 f5082c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ long f5083d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ InterfaceC8558m f5084e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0218a(InterfaceC3551q0 interfaceC3551q0, long j10, InterfaceC8558m interfaceC8558m, InterfaceC5380e interfaceC5380e) {
                        super(2, interfaceC5380e);
                        this.f5082c = interfaceC3551q0;
                        this.f5083d = j10;
                        this.f5084e = interfaceC8558m;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                        return new C0218a(this.f5082c, this.f5083d, this.f5084e, interfaceC5380e);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
                    @Override // kotlin.coroutines.jvm.internal.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                        /*
                            r7 = this;
                            java.lang.Object r0 = eh.AbstractC5467b.g()
                            int r1 = r7.f5081b
                            r2 = 0
                            r3 = 2
                            r4 = 1
                            if (r1 == 0) goto L27
                            if (r1 == r4) goto L1f
                            if (r1 != r3) goto L17
                            java.lang.Object r0 = r7.f5080a
                            y.o$b r0 = (y.InterfaceC8560o.b) r0
                            Yg.v.b(r8)
                            goto L66
                        L17:
                            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r8.<init>(r0)
                            throw r8
                        L1f:
                            java.lang.Object r1 = r7.f5080a
                            T.q0 r1 = (T.InterfaceC3551q0) r1
                            Yg.v.b(r8)
                            goto L4b
                        L27:
                            Yg.v.b(r8)
                            T.q0 r8 = r7.f5082c
                            java.lang.Object r8 = r8.getValue()
                            y.o$b r8 = (y.InterfaceC8560o.b) r8
                            if (r8 == 0) goto L4f
                            y.m r1 = r7.f5084e
                            T.q0 r5 = r7.f5082c
                            y.o$a r6 = new y.o$a
                            r6.<init>(r8)
                            if (r1 == 0) goto L4c
                            r7.f5080a = r5
                            r7.f5081b = r4
                            java.lang.Object r8 = r1.a(r6, r7)
                            if (r8 != r0) goto L4a
                            return r0
                        L4a:
                            r1 = r5
                        L4b:
                            r5 = r1
                        L4c:
                            r5.setValue(r2)
                        L4f:
                            y.o$b r8 = new y.o$b
                            long r4 = r7.f5083d
                            r8.<init>(r4, r2)
                            y.m r1 = r7.f5084e
                            if (r1 == 0) goto L67
                            r7.f5080a = r8
                            r7.f5081b = r3
                            java.lang.Object r1 = r1.a(r8, r7)
                            if (r1 != r0) goto L65
                            return r0
                        L65:
                            r0 = r8
                        L66:
                            r8 = r0
                        L67:
                            T.q0 r0 = r7.f5082c
                            r0.setValue(r8)
                            Yg.J r8 = Yg.J.f24997a
                            return r8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: F.d0.a.b.C0217a.C0218a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }

                    @Override // mh.InterfaceC6839p
                    /* renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                        return ((C0218a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                    }
                }

                /* renamed from: F.d0$a$b$a$b, reason: collision with other inner class name */
                static final class C0219b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                    /* renamed from: a, reason: collision with root package name */
                    Object f5085a;

                    /* renamed from: b, reason: collision with root package name */
                    int f5086b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ InterfaceC3551q0 f5087c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ boolean f5088d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ InterfaceC8558m f5089e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0219b(InterfaceC3551q0 interfaceC3551q0, boolean z10, InterfaceC8558m interfaceC8558m, InterfaceC5380e interfaceC5380e) {
                        super(2, interfaceC5380e);
                        this.f5087c = interfaceC3551q0;
                        this.f5088d = z10;
                        this.f5089e = interfaceC8558m;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                        return new C0219b(this.f5087c, this.f5088d, this.f5089e, interfaceC5380e);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        InterfaceC3551q0 interfaceC3551q0;
                        InterfaceC3551q0 interfaceC3551q02;
                        Object objG = AbstractC5467b.g();
                        int i10 = this.f5086b;
                        if (i10 == 0) {
                            Yg.v.b(obj);
                            InterfaceC8560o.b bVar = (InterfaceC8560o.b) this.f5087c.getValue();
                            if (bVar != null) {
                                boolean z10 = this.f5088d;
                                InterfaceC8558m interfaceC8558m = this.f5089e;
                                interfaceC3551q0 = this.f5087c;
                                InterfaceC8555j cVar = z10 ? new InterfaceC8560o.c(bVar) : new InterfaceC8560o.a(bVar);
                                if (interfaceC8558m != null) {
                                    this.f5085a = interfaceC3551q0;
                                    this.f5086b = 1;
                                    if (interfaceC8558m.a(cVar, this) == objG) {
                                        return objG;
                                    }
                                    interfaceC3551q02 = interfaceC3551q0;
                                }
                                interfaceC3551q0.setValue(null);
                            }
                            return Yg.J.f24997a;
                        }
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC3551q02 = (InterfaceC3551q0) this.f5085a;
                        Yg.v.b(obj);
                        interfaceC3551q0 = interfaceC3551q02;
                        interfaceC3551q0.setValue(null);
                        return Yg.J.f24997a;
                    }

                    @Override // mh.InterfaceC6839p
                    /* renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                        return ((C0219b) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0217a(Ii.N n10, InterfaceC3551q0 interfaceC3551q0, InterfaceC8558m interfaceC8558m, InterfaceC5380e interfaceC5380e) {
                    super(3, interfaceC5380e);
                    this.f5077d = n10;
                    this.f5078e = interfaceC3551q0;
                    this.f5079f = interfaceC8558m;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f5074a;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        w.r rVar = (w.r) this.f5075b;
                        AbstractC3063k.d(this.f5077d, null, null, new C0218a(this.f5078e, this.f5076c, this.f5079f, null), 3, null);
                        this.f5074a = 1;
                        obj = rVar.q0(this);
                        if (obj == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Yg.v.b(obj);
                    }
                    AbstractC3063k.d(this.f5077d, null, null, new C0219b(this.f5078e, ((Boolean) obj).booleanValue(), this.f5079f, null), 3, null);
                    return Yg.J.f24997a;
                }

                public final Object n(w.r rVar, long j10, InterfaceC5380e interfaceC5380e) {
                    C0217a c0217a = new C0217a(this.f5077d, this.f5078e, this.f5079f, interfaceC5380e);
                    c0217a.f5075b = rVar;
                    c0217a.f5076c = j10;
                    return c0217a.invokeSuspend(Yg.J.f24997a);
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                    return n((w.r) obj, ((C6531g) obj2).v(), (InterfaceC5380e) obj3);
                }
            }

            /* renamed from: F.d0$a$b$b, reason: collision with other inner class name */
            static final class C0220b extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ z1 f5090a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0220b(z1 z1Var) {
                    super(1);
                    this.f5090a = z1Var;
                }

                public final void a(long j10) {
                    ((InterfaceC6835l) this.f5090a.getValue()).invoke(C6531g.d(j10));
                }

                @Override // mh.InterfaceC6835l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a(((C6531g) obj).v());
                    return Yg.J.f24997a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Ii.N n10, InterfaceC3551q0 interfaceC3551q0, InterfaceC8558m interfaceC8558m, z1 z1Var, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f5070c = n10;
                this.f5071d = interfaceC3551q0;
                this.f5072e = interfaceC8558m;
                this.f5073f = z1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                b bVar = new b(this.f5070c, this.f5071d, this.f5072e, this.f5073f, interfaceC5380e);
                bVar.f5069b = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f5068a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    InterfaceC8567G interfaceC8567G = (InterfaceC8567G) this.f5069b;
                    C0217a c0217a = new C0217a(this.f5070c, this.f5071d, this.f5072e, null);
                    C0220b c0220b = new C0220b(this.f5073f);
                    this.f5068a = 1;
                    if (AbstractC8235B.i(interfaceC8567G, c0217a, c0220b, this) == objG) {
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
                return ((b) create(interfaceC8567G, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6835l interfaceC6835l, InterfaceC8558m interfaceC8558m) {
            super(3);
            this.f5062a = interfaceC6835l;
            this.f5063b = interfaceC8558m;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, int i10) {
            interfaceC3540l.U(-102778667);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-102778667, i10, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
            }
            Object objF = interfaceC3540l.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                Object a10 = new T.A(T.O.i(C5385j.f46088a, interfaceC3540l));
                interfaceC3540l.K(a10);
                objF = a10;
            }
            Ii.N nA = ((T.A) objF).a();
            Object objF2 = interfaceC3540l.f();
            if (objF2 == aVar.a()) {
                objF2 = t1.d(null, null, 2, null);
                interfaceC3540l.K(objF2);
            }
            InterfaceC3551q0 interfaceC3551q0 = (InterfaceC3551q0) objF2;
            z1 z1VarN = o1.n(this.f5062a, interfaceC3540l, 0);
            InterfaceC8558m interfaceC8558m = this.f5063b;
            boolean zT = interfaceC3540l.T(this.f5063b);
            InterfaceC8558m interfaceC8558m2 = this.f5063b;
            Object objF3 = interfaceC3540l.f();
            if (zT || objF3 == aVar.a()) {
                objF3 = new C0215a(interfaceC3551q0, interfaceC8558m2);
                interfaceC3540l.K(objF3);
            }
            T.O.c(interfaceC8558m, (InterfaceC6835l) objF3, interfaceC3540l, 0);
            e.a aVar2 = androidx.compose.ui.e.f28771b0;
            InterfaceC8558m interfaceC8558m3 = this.f5063b;
            boolean zL = interfaceC3540l.l(nA) | interfaceC3540l.T(this.f5063b) | interfaceC3540l.T(z1VarN);
            InterfaceC8558m interfaceC8558m4 = this.f5063b;
            Object objF4 = interfaceC3540l.f();
            if (zL || objF4 == aVar.a()) {
                Object bVar = new b(nA, interfaceC3551q0, interfaceC8558m4, z1VarN, null);
                interfaceC3540l.K(bVar);
                objF4 = bVar;
            }
            androidx.compose.ui.e eVarD = AbstractC8576P.d(aVar2, interfaceC8558m3, (InterfaceC6839p) objF4);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return eVarD;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC8558m interfaceC8558m, boolean z10, InterfaceC6835l interfaceC6835l) {
        return z10 ? androidx.compose.ui.c.c(eVar, null, new a(interfaceC6835l, interfaceC8558m), 1, null) : eVar;
    }
}
