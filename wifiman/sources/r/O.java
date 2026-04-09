package r;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.L0;
import T.X0;
import T.t1;
import T.z1;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: f, reason: collision with root package name */
    public static final int f59497f = 8;

    /* renamed from: a, reason: collision with root package name */
    private final String f59498a;

    /* renamed from: b, reason: collision with root package name */
    private final V.b f59499b = new V.b(new a[16], 0);

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3551q0 f59500c = t1.d(Boolean.FALSE, null, 2, null);

    /* renamed from: d, reason: collision with root package name */
    private long f59501d = Long.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3551q0 f59502e = t1.d(Boolean.TRUE, null, 2, null);

    public final class a implements z1 {

        /* renamed from: a, reason: collision with root package name */
        private Object f59503a;

        /* renamed from: b, reason: collision with root package name */
        private Object f59504b;

        /* renamed from: c, reason: collision with root package name */
        private final s0 f59505c;

        /* renamed from: d, reason: collision with root package name */
        private final String f59506d;

        /* renamed from: e, reason: collision with root package name */
        private final InterfaceC3551q0 f59507e;

        /* renamed from: f, reason: collision with root package name */
        private InterfaceC7533i f59508f;

        /* renamed from: g, reason: collision with root package name */
        private n0 f59509g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f59510h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f59511i;

        /* renamed from: j, reason: collision with root package name */
        private long f59512j;

        public a(Object obj, Object obj2, s0 s0Var, InterfaceC7533i interfaceC7533i, String str) {
            this.f59503a = obj;
            this.f59504b = obj2;
            this.f59505c = s0Var;
            this.f59506d = str;
            this.f59507e = t1.d(obj, null, 2, null);
            this.f59508f = interfaceC7533i;
            this.f59509g = new n0(this.f59508f, s0Var, this.f59503a, this.f59504b, null, 16, null);
        }

        public final Object g() {
            return this.f59503a;
        }

        @Override // T.z1
        public Object getValue() {
            return this.f59507e.getValue();
        }

        public final Object i() {
            return this.f59504b;
        }

        public final boolean j() {
            return this.f59510h;
        }

        public final void p(long j10) {
            O.this.l(false);
            if (this.f59511i) {
                this.f59511i = false;
                this.f59512j = j10;
            }
            long j11 = j10 - this.f59512j;
            r(this.f59509g.f(j11));
            this.f59510h = this.f59509g.e(j11);
        }

        public final void q() {
            this.f59511i = true;
        }

        public void r(Object obj) {
            this.f59507e.setValue(obj);
        }

        public final void s() {
            r(this.f59509g.g());
            this.f59511i = true;
        }

        public final void t(Object obj, Object obj2, InterfaceC7533i interfaceC7533i) {
            this.f59503a = obj;
            this.f59504b = obj2;
            this.f59508f = interfaceC7533i;
            this.f59509g = new n0(interfaceC7533i, this.f59505c, obj, obj2, null, 16, null);
            O.this.l(true);
            this.f59510h = false;
            this.f59511i = true;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        Object f59514a;

        /* renamed from: b, reason: collision with root package name */
        int f59515b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f59516c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f59517d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ O f59518e;

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3551q0 f59519a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O f59520b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.K f59521c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Ii.N f59522d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC3551q0 interfaceC3551q0, O o10, kotlin.jvm.internal.K k10, Ii.N n10) {
                super(1);
                this.f59519a = interfaceC3551q0;
                this.f59520b = o10;
                this.f59521c = k10;
                this.f59522d = n10;
            }

            public final void a(long j10) {
                z1 z1Var = (z1) this.f59519a.getValue();
                long jLongValue = z1Var != null ? ((Number) z1Var.getValue()).longValue() : j10;
                int i10 = 0;
                if (this.f59520b.f59501d == Long.MIN_VALUE || this.f59521c.f51686a != m0.n(this.f59522d.getCoroutineContext())) {
                    this.f59520b.f59501d = j10;
                    V.b bVar = this.f59520b.f59499b;
                    int iO = bVar.o();
                    if (iO > 0) {
                        Object[] objArrM = bVar.m();
                        int i11 = 0;
                        do {
                            ((a) objArrM[i11]).q();
                            i11++;
                        } while (i11 < iO);
                    }
                    this.f59521c.f51686a = m0.n(this.f59522d.getCoroutineContext());
                }
                if (this.f59521c.f51686a != 0.0f) {
                    this.f59520b.i((long) ((jLongValue - this.f59520b.f59501d) / this.f59521c.f51686a));
                    return;
                }
                V.b bVar2 = this.f59520b.f59499b;
                int iO2 = bVar2.o();
                if (iO2 > 0) {
                    Object[] objArrM2 = bVar2.m();
                    do {
                        ((a) objArrM2[i10]).s();
                        i10++;
                    } while (i10 < iO2);
                }
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Number) obj).longValue());
                return Yg.J.f24997a;
            }
        }

        /* renamed from: r.O$b$b, reason: collision with other inner class name */
        static final class C2081b extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ii.N f59523a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2081b(Ii.N n10) {
                super(0);
                this.f59523a = n10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(m0.n(this.f59523a.getCoroutineContext()));
            }
        }

        static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f59524a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ float f59525b;

            c(InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                c cVar = new c(interfaceC5380e);
                cVar.f59525b = ((Number) obj).floatValue();
                return cVar;
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return n(((Number) obj).floatValue(), (InterfaceC5380e) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f59524a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(this.f59525b > 0.0f);
            }

            public final Object n(float f10, InterfaceC5380e interfaceC5380e) {
                return ((c) create(Float.valueOf(f10), interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3551q0 interfaceC3551q0, O o10, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f59517d = interfaceC3551q0;
            this.f59518e = o10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            b bVar = new b(this.f59517d, this.f59518e, interfaceC5380e);
            bVar.f59516c = obj;
            return bVar;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005b -> B:11:0x0040). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0076 -> B:11:0x0040). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = eh.AbstractC5467b.g()
                int r1 = r7.f59515b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L30
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r7.f59514a
                kotlin.jvm.internal.K r1 = (kotlin.jvm.internal.K) r1
                java.lang.Object r4 = r7.f59516c
                Ii.N r4 = (Ii.N) r4
                Yg.v.b(r8)
                r8 = r4
                goto L40
            L1b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L23:
                java.lang.Object r1 = r7.f59514a
                kotlin.jvm.internal.K r1 = (kotlin.jvm.internal.K) r1
                java.lang.Object r4 = r7.f59516c
                Ii.N r4 = (Ii.N) r4
                Yg.v.b(r8)
                r8 = r4
                goto L56
            L30:
                Yg.v.b(r8)
                java.lang.Object r8 = r7.f59516c
                Ii.N r8 = (Ii.N) r8
                kotlin.jvm.internal.K r1 = new kotlin.jvm.internal.K
                r1.<init>()
                r4 = 1065353216(0x3f800000, float:1.0)
                r1.f51686a = r4
            L40:
                r.O$b$a r4 = new r.O$b$a
                T.q0 r5 = r7.f59517d
                r.O r6 = r7.f59518e
                r4.<init>(r5, r6, r1, r8)
                r7.f59516c = r8
                r7.f59514a = r1
                r7.f59515b = r3
                java.lang.Object r4 = r.M.a(r4, r7)
                if (r4 != r0) goto L56
                return r0
            L56:
                float r4 = r1.f51686a
                r5 = 0
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 != 0) goto L40
                r.O$b$b r4 = new r.O$b$b
                r4.<init>(r8)
                Li.g r4 = T.o1.o(r4)
                r.O$b$c r5 = new r.O$b$c
                r6 = 0
                r5.<init>(r6)
                r7.f59516c = r8
                r7.f59514a = r1
                r7.f59515b = r2
                java.lang.Object r4 = Li.AbstractC3222i.y(r4, r5, r7)
                if (r4 != r0) goto L40
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: r.O.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((b) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f59527b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10) {
            super(2);
            this.f59527b = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            O.this.k(interfaceC3540l, L0.a(this.f59527b | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    public O(String str) {
        this.f59498a = str;
    }

    private final boolean g() {
        return ((Boolean) this.f59500c.getValue()).booleanValue();
    }

    private final boolean h() {
        return ((Boolean) this.f59502e.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(long j10) {
        boolean z10;
        V.b bVar = this.f59499b;
        int iO = bVar.o();
        if (iO > 0) {
            Object[] objArrM = bVar.m();
            z10 = true;
            int i10 = 0;
            do {
                a aVar = (a) objArrM[i10];
                if (!aVar.j()) {
                    aVar.p(j10);
                }
                if (!aVar.j()) {
                    z10 = false;
                }
                i10++;
            } while (i10 < iO);
        } else {
            z10 = true;
        }
        m(!z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(boolean z10) {
        this.f59500c.setValue(Boolean.valueOf(z10));
    }

    private final void m(boolean z10) {
        this.f59502e.setValue(Boolean.valueOf(z10));
    }

    public final void f(a aVar) {
        this.f59499b.b(aVar);
        l(true);
    }

    public final void j(a aVar) {
        this.f59499b.x(aVar);
    }

    public final void k(InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-318043801);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-318043801, i11, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:171)");
            }
            Object objF = interfaceC3540lR.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                objF = t1.d(null, null, 2, null);
                interfaceC3540lR.K(objF);
            }
            InterfaceC3551q0 interfaceC3551q0 = (InterfaceC3551q0) objF;
            if (h() || g()) {
                interfaceC3540lR.U(1719915818);
                boolean zL = interfaceC3540lR.l(this);
                Object objF2 = interfaceC3540lR.f();
                if (zL || objF2 == aVar.a()) {
                    objF2 = new b(interfaceC3551q0, this, null);
                    interfaceC3540lR.K(objF2);
                }
                T.O.f(this, (InterfaceC6839p) objF2, interfaceC3540lR, i11 & 14);
                interfaceC3540lR.J();
            } else {
                interfaceC3540lR.U(1721436120);
                interfaceC3540lR.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new c(i10));
        }
    }
}
