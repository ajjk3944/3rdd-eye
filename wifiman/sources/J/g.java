package J;

import E0.AbstractC2631i;
import E0.InterfaceC2630h;
import I.l1;
import I.o1;
import Ii.AbstractC3063k;
import Ii.InterfaceC3091y0;
import Ii.N;
import J.j;
import J0.w;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import M.z;
import T.InterfaceC3551q0;
import T.t1;
import Y0.r;
import Y0.s;
import Yg.J;
import Yg.v;
import androidx.compose.ui.platform.AbstractC3932k0;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import l0.AbstractC6532h;
import l0.C6531g;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import o0.InterfaceC7036c;
import r.C7517a;
import r.C7532h0;
import s.AbstractC7838K;
import s.C7837J;

/* loaded from: classes.dex */
public final class g extends f implements InterfaceC2630h {

    /* renamed from: p, reason: collision with root package name */
    private o1 f9378p;

    /* renamed from: q, reason: collision with root package name */
    private j f9379q;

    /* renamed from: r, reason: collision with root package name */
    private l1 f9380r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f9381s;

    /* renamed from: u, reason: collision with root package name */
    private final C7517a f9383u;

    /* renamed from: w, reason: collision with root package name */
    private InterfaceC3091y0 f9385w;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC3551q0 f9382t = t1.d(r.b(r.f24545b.a()), null, 2, null);

    /* renamed from: v, reason: collision with root package name */
    private final C7837J f9384v = (C7837J) D2(new C7837J(new a(), null, new b(), 0.0f, true, 0, 0.0f, 0.0f, false, null, 1002, null));

    static final class a extends AbstractC6494u implements InterfaceC6835l {
        a() {
            super(1);
        }

        public final long a(Y0.d dVar) {
            return ((C6531g) g.this.f9383u.m()).v();
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C6531g.d(a((Y0.d) obj));
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {
        b() {
            super(1);
        }

        public final void a(long j10) {
            g gVar = g.this;
            Y0.d dVar = (Y0.d) AbstractC2631i.a(gVar, AbstractC3932k0.g());
            gVar.T2(s.a(dVar.x1(Y0.k.h(j10)), dVar.x1(Y0.k.g(j10))));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Y0.k) obj).k());
            return J.f24997a;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f9388a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f9389b;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f9391a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g gVar) {
                super(0);
                this.f9391a = gVar;
            }

            public final long a() {
                return (this.f9391a.f9381s || this.f9391a.f9379q.U() == j.EnumC3094a.Touch) ? e.a(this.f9391a.f9378p, this.f9391a.f9379q, this.f9391a.f9380r, this.f9391a.R2()) : C6531g.f52335b.b();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                return C6531g.d(a());
            }
        }

        static final class b implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f9392a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ N f9393b;

            static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f9394a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ g f9395b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ long f9396c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(g gVar, long j10, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f9395b = gVar;
                    this.f9396c = j10;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new a(this.f9395b, this.f9396c, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f9394a;
                    if (i10 == 0) {
                        v.b(obj);
                        C7517a c7517a = this.f9395b.f9383u;
                        C6531g c6531gD = C6531g.d(this.f9396c);
                        C7532h0 c7532h0E = z.e();
                        this.f9394a = 1;
                        if (C7517a.f(c7517a, c6531gD, c7532h0E, null, null, this, 12, null) == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v.b(obj);
                    }
                    return J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                    return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            b(g gVar, N n10) {
                this.f9392a = gVar;
                this.f9393b = n10;
            }

            @Override // Li.InterfaceC3221h
            public /* bridge */ /* synthetic */ Object a(Object obj, InterfaceC5380e interfaceC5380e) {
                return b(((C6531g) obj).v(), interfaceC5380e);
            }

            public final Object b(long j10, InterfaceC5380e interfaceC5380e) {
                if (AbstractC6532h.c(((C6531g) this.f9392a.f9383u.m()).v()) && AbstractC6532h.c(j10) && C6531g.n(((C6531g) this.f9392a.f9383u.m()).v()) != C6531g.n(j10)) {
                    AbstractC3063k.d(this.f9393b, null, null, new a(this.f9392a, j10, null), 3, null);
                    return J.f24997a;
                }
                Object objT = this.f9392a.f9383u.t(C6531g.d(j10), interfaceC5380e);
                return objT == AbstractC5467b.g() ? objT : J.f24997a;
            }
        }

        c(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            c cVar = g.this.new c(interfaceC5380e);
            cVar.f9389b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f9388a;
            if (i10 == 0) {
                v.b(obj);
                N n10 = (N) this.f9389b;
                InterfaceC3220g interfaceC3220gO = T.o1.o(new a(g.this));
                b bVar = new b(g.this, n10);
                this.f9388a = 1;
                if (interfaceC3220gO.b(bVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public g(o1 o1Var, j jVar, l1 l1Var, boolean z10) {
        this.f9378p = o1Var;
        this.f9379q = jVar;
        this.f9380r = l1Var;
        this.f9381s = z10;
        this.f9383u = new C7517a(C6531g.d(e.a(this.f9378p, this.f9379q, this.f9380r, R2())), z.g(), C6531g.d(z.f()), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long R2() {
        return ((r) this.f9382t.getValue()).j();
    }

    private final void S2() {
        InterfaceC3091y0 interfaceC3091y0 = this.f9385w;
        if (interfaceC3091y0 != null) {
            InterfaceC3091y0.a.b(interfaceC3091y0, null, 1, null);
        }
        this.f9385w = null;
        if (AbstractC7838K.d(0, 1, null)) {
            this.f9385w = AbstractC3063k.d(d2(), null, null, new c(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T2(long j10) {
        this.f9382t.setValue(r.b(j10));
    }

    @Override // J.f, C0.J
    public void B(C0.r rVar) {
        this.f9384v.B(rVar);
    }

    @Override // J.f, E0.r
    public void J(InterfaceC7036c interfaceC7036c) {
        interfaceC7036c.X1();
        this.f9384v.J(interfaceC7036c);
    }

    @Override // J.f
    public void J2(o1 o1Var, j jVar, l1 l1Var, boolean z10) {
        o1 o1Var2 = this.f9378p;
        j jVar2 = this.f9379q;
        l1 l1Var2 = this.f9380r;
        boolean z11 = this.f9381s;
        this.f9378p = o1Var;
        this.f9379q = jVar;
        this.f9380r = l1Var;
        this.f9381s = z10;
        if (AbstractC6492s.d(o1Var, o1Var2) && AbstractC6492s.d(jVar, jVar2) && AbstractC6492s.d(l1Var, l1Var2) && z10 == z11) {
            return;
        }
        S2();
    }

    @Override // androidx.compose.ui.e.c
    public void n2() {
        S2();
    }

    @Override // J.f, E0.v0
    public void q(w wVar) {
        this.f9384v.q(wVar);
    }
}
