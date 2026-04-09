package androidx.lifecycle;

import Ii.AbstractC3059i;
import Ii.AbstractC3063k;
import Ii.C3048c0;
import Ii.H0;
import Ii.InterfaceC3069n;
import Ii.InterfaceC3091y0;
import Yg.u;
import androidx.lifecycle.AbstractC4013k;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public abstract class A {

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f31560a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f31561b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC4013k f31562c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC4013k.b f31563d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f31564e;

        /* renamed from: androidx.lifecycle.A$a$a, reason: collision with other inner class name */
        static final class C1105a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            Object f31565a;

            /* renamed from: b, reason: collision with root package name */
            Object f31566b;

            /* renamed from: c, reason: collision with root package name */
            Object f31567c;

            /* renamed from: d, reason: collision with root package name */
            Object f31568d;

            /* renamed from: e, reason: collision with root package name */
            Object f31569e;

            /* renamed from: f, reason: collision with root package name */
            Object f31570f;

            /* renamed from: g, reason: collision with root package name */
            int f31571g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ AbstractC4013k f31572h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ AbstractC4013k.b f31573i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ Ii.N f31574j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ InterfaceC6839p f31575k;

            /* renamed from: androidx.lifecycle.A$a$a$a, reason: collision with other inner class name */
            static final class C1106a implements InterfaceC4015m {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ AbstractC4013k.a f31576a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlin.jvm.internal.N f31577b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Ii.N f31578c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ AbstractC4013k.a f31579d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC3069n f31580e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Ti.a f31581f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ InterfaceC6839p f31582g;

                /* renamed from: androidx.lifecycle.A$a$a$a$a, reason: collision with other inner class name */
                static final class C1107a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                    /* renamed from: a, reason: collision with root package name */
                    Object f31583a;

                    /* renamed from: b, reason: collision with root package name */
                    Object f31584b;

                    /* renamed from: c, reason: collision with root package name */
                    int f31585c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ Ti.a f31586d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ InterfaceC6839p f31587e;

                    /* renamed from: androidx.lifecycle.A$a$a$a$a$a, reason: collision with other inner class name */
                    static final class C1108a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                        /* renamed from: a, reason: collision with root package name */
                        int f31588a;

                        /* renamed from: b, reason: collision with root package name */
                        private /* synthetic */ Object f31589b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ InterfaceC6839p f31590c;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C1108a(InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
                            super(2, interfaceC5380e);
                            this.f31590c = interfaceC6839p;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                            C1108a c1108a = new C1108a(this.f31590c, interfaceC5380e);
                            c1108a.f31589b = obj;
                            return c1108a;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            Object objG = AbstractC5467b.g();
                            int i10 = this.f31588a;
                            if (i10 == 0) {
                                Yg.v.b(obj);
                                Ii.N n10 = (Ii.N) this.f31589b;
                                InterfaceC6839p interfaceC6839p = this.f31590c;
                                this.f31588a = 1;
                                if (interfaceC6839p.invoke(n10, this) == objG) {
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
                            return ((C1108a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1107a(Ti.a aVar, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
                        super(2, interfaceC5380e);
                        this.f31586d = aVar;
                        this.f31587e = interfaceC6839p;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                        return new C1107a(this.f31586d, this.f31587e, interfaceC5380e);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        Ti.a aVar;
                        InterfaceC6839p interfaceC6839p;
                        Ti.a aVar2;
                        Throwable th2;
                        Object objG = AbstractC5467b.g();
                        int i10 = this.f31585c;
                        try {
                            if (i10 == 0) {
                                Yg.v.b(obj);
                                aVar = this.f31586d;
                                interfaceC6839p = this.f31587e;
                                this.f31583a = aVar;
                                this.f31584b = interfaceC6839p;
                                this.f31585c = 1;
                                if (aVar.a(null, this) == objG) {
                                    return objG;
                                }
                            } else {
                                if (i10 != 1) {
                                    if (i10 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    aVar2 = (Ti.a) this.f31583a;
                                    try {
                                        Yg.v.b(obj);
                                        Yg.J j10 = Yg.J.f24997a;
                                        aVar2.d(null);
                                        return Yg.J.f24997a;
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        aVar2.d(null);
                                        throw th2;
                                    }
                                }
                                interfaceC6839p = (InterfaceC6839p) this.f31584b;
                                Ti.a aVar3 = (Ti.a) this.f31583a;
                                Yg.v.b(obj);
                                aVar = aVar3;
                            }
                            C1108a c1108a = new C1108a(interfaceC6839p, null);
                            this.f31583a = aVar;
                            this.f31584b = null;
                            this.f31585c = 2;
                            if (Ii.O.g(c1108a, this) == objG) {
                                return objG;
                            }
                            aVar2 = aVar;
                            Yg.J j102 = Yg.J.f24997a;
                            aVar2.d(null);
                            return Yg.J.f24997a;
                        } catch (Throwable th4) {
                            aVar2 = aVar;
                            th2 = th4;
                            aVar2.d(null);
                            throw th2;
                        }
                    }

                    @Override // mh.InterfaceC6839p
                    /* renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                        return ((C1107a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                    }
                }

                C1106a(AbstractC4013k.a aVar, kotlin.jvm.internal.N n10, Ii.N n11, AbstractC4013k.a aVar2, InterfaceC3069n interfaceC3069n, Ti.a aVar3, InterfaceC6839p interfaceC6839p) {
                    this.f31576a = aVar;
                    this.f31577b = n10;
                    this.f31578c = n11;
                    this.f31579d = aVar2;
                    this.f31580e = interfaceC3069n;
                    this.f31581f = aVar3;
                    this.f31582g = interfaceC6839p;
                }

                @Override // androidx.lifecycle.InterfaceC4015m
                public final void j(InterfaceC4017o interfaceC4017o, AbstractC4013k.a event) {
                    AbstractC6492s.i(interfaceC4017o, "<anonymous parameter 0>");
                    AbstractC6492s.i(event, "event");
                    if (event == this.f31576a) {
                        this.f31577b.f51689a = AbstractC3063k.d(this.f31578c, null, null, new C1107a(this.f31581f, this.f31582g, null), 3, null);
                        return;
                    }
                    if (event == this.f31579d) {
                        InterfaceC3091y0 interfaceC3091y0 = (InterfaceC3091y0) this.f31577b.f51689a;
                        if (interfaceC3091y0 != null) {
                            InterfaceC3091y0.a.b(interfaceC3091y0, null, 1, null);
                        }
                        this.f31577b.f51689a = null;
                    }
                    if (event == AbstractC4013k.a.ON_DESTROY) {
                        InterfaceC3069n interfaceC3069n = this.f31580e;
                        u.a aVar = Yg.u.f25017b;
                        interfaceC3069n.resumeWith(Yg.u.c(Yg.J.f24997a));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1105a(AbstractC4013k abstractC4013k, AbstractC4013k.b bVar, Ii.N n10, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f31572h = abstractC4013k;
                this.f31573i = bVar;
                this.f31574j = n10;
                this.f31575k = interfaceC6839p;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new C1105a(this.f31572h, this.f31573i, this.f31574j, this.f31575k, interfaceC5380e);
            }

            /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00c1  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00d9  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 223
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.A.a.C1105a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                return ((C1105a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC4013k abstractC4013k, AbstractC4013k.b bVar, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f31562c = abstractC4013k;
            this.f31563d = bVar;
            this.f31564e = interfaceC6839p;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = new a(this.f31562c, this.f31563d, this.f31564e, interfaceC5380e);
            aVar.f31561b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f31560a;
            if (i10 == 0) {
                Yg.v.b(obj);
                Ii.N n10 = (Ii.N) this.f31561b;
                H0 h0R0 = C3048c0.c().r0();
                C1105a c1105a = new C1105a(this.f31562c, this.f31563d, n10, this.f31564e, null);
                this.f31560a = 1;
                if (AbstractC3059i.g(h0R0, c1105a, this) == objG) {
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

    public static final Object a(AbstractC4013k abstractC4013k, AbstractC4013k.b bVar, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
        Object objG;
        if (bVar != AbstractC4013k.b.INITIALIZED) {
            return (abstractC4013k.b() != AbstractC4013k.b.DESTROYED && (objG = Ii.O.g(new a(abstractC4013k, bVar, interfaceC6839p, null), interfaceC5380e)) == AbstractC5467b.g()) ? objG : Yg.J.f24997a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }

    public static final Object b(InterfaceC4017o interfaceC4017o, AbstractC4013k.b bVar, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
        Object objA = a(interfaceC4017o.O(), bVar, interfaceC6839p, interfaceC5380e);
        return objA == AbstractC5467b.g() ? objA : Yg.J.f24997a;
    }
}
