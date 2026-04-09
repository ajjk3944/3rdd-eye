package N6;

import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    final gg.y f15390a;

    /* renamed from: b, reason: collision with root package name */
    final gg.w f15391b;

    /* renamed from: c, reason: collision with root package name */
    final gg.w f15392c = new e();

    /* renamed from: d, reason: collision with root package name */
    private final gg.w f15393d = new g();

    class a implements gg.w {

        /* renamed from: b, reason: collision with root package name */
        final gg.s f15395b;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ gg.y f15398e;

        /* renamed from: a, reason: collision with root package name */
        final kg.n f15394a = y.g();

        /* renamed from: c, reason: collision with root package name */
        final kg.n f15396c = new C0584a();

        /* renamed from: d, reason: collision with root package name */
        final kg.n f15397d = new b();

        /* renamed from: N6.y$a$a, reason: collision with other inner class name */
        class C0584a implements kg.n {
            C0584a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public gg.s apply(o oVar) {
                return a.this.f15395b;
            }
        }

        class b implements kg.n {
            b() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public gg.s apply(gg.s sVar) {
                return sVar.R0(1L);
            }
        }

        class c implements kg.n {
            c() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public gg.v apply(gg.s sVar) {
                return sVar.f1(sVar.O0(a.this.f15396c)).Q(a.this.f15397d).i0(a.this.f15394a);
            }
        }

        a(gg.y yVar) {
            this.f15398e = yVar;
            this.f15395b = gg.s.c1(10L, TimeUnit.SECONDS, yVar);
        }

        @Override // gg.w
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public gg.s b(gg.s sVar) {
            return sVar.s0(new c());
        }
    }

    class b implements gg.w {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f15403a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f15404b;

        class a implements kg.n {
            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public gg.v apply(gg.s sVar) {
                b bVar = b.this;
                return sVar.s(bVar.f15404b, TimeUnit.MILLISECONDS, y.this.f15390a);
            }
        }

        b(int i10, long j10) {
            this.f15403a = i10;
            this.f15404b = j10;
        }

        @Override // gg.w
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public gg.s b(gg.s sVar) {
            return sVar.S0(this.f15403a, TimeUnit.MILLISECONDS, y.this.f15390a).v0(new a());
        }
    }

    class c implements gg.w {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ gg.w f15407a;

        class a implements kg.n {
            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public gg.s apply(Bg.b bVar) {
                return bVar.g(c.this.f15407a);
            }
        }

        class b implements kg.n {
            b() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String apply(o oVar) {
                return oVar.c().getAddress();
            }
        }

        c(gg.w wVar) {
            this.f15407a = wVar;
        }

        @Override // gg.w
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public gg.s b(gg.s sVar) {
            return sVar.d0(new b()).Q(new a());
        }
    }

    class d implements kg.n {
        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o apply(o oVar) {
            return new o(oVar.c(), oVar.d(), oVar.f(), oVar.b(), Q6.c.CALLBACK_TYPE_FIRST_MATCH, oVar.g());
        }
    }

    class e implements gg.w {
        e() {
        }

        @Override // gg.w
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public gg.s b(gg.s sVar) {
            return sVar.q(10L, TimeUnit.SECONDS, y.this.f15390a).i0(y.h());
        }
    }

    class f implements kg.n {
        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o apply(o oVar) {
            return new o(oVar.c(), oVar.d(), oVar.f(), oVar.b(), Q6.c.CALLBACK_TYPE_MATCH_LOST, oVar.g());
        }
    }

    class g implements gg.w {

        class a implements kg.n {
            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public gg.s apply(gg.s sVar) {
                return gg.s.j0(sVar.g(y.this.f15391b), sVar.g(y.this.f15392c));
            }
        }

        g() {
        }

        @Override // gg.w
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public gg.s b(gg.s sVar) {
            return sVar.s0(new a());
        }
    }

    public y(gg.y yVar) {
        this.f15390a = yVar;
        this.f15391b = new a(yVar);
    }

    private gg.w c(int i10) {
        return new b(i10, Math.max(TimeUnit.SECONDS.toMillis(5L) - i10, 0L));
    }

    private gg.w d() {
        return c(2500);
    }

    private gg.w e() {
        return c(500);
    }

    private static gg.w f(gg.w wVar) {
        return new c(wVar);
    }

    static kg.n g() {
        return new d();
    }

    static kg.n h() {
        return new f();
    }

    gg.w a(int i10) {
        return i10 != 2 ? i10 != 4 ? i10 != 6 ? P6.E.a() : f(this.f15393d) : f(this.f15392c) : f(this.f15391b);
    }

    gg.w b(int i10) {
        if (i10 == -1) {
            I6.q.q("Cannot emulate opportunistic scan mode since it is OS dependent - fallthrough to low power", new Object[0]);
        } else if (i10 != 0) {
            return i10 != 1 ? P6.E.a() : d();
        }
        return e();
    }
}
