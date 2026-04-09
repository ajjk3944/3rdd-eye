package xa;

import Ii.AbstractC3059i;
import Ii.C3048c0;
import Li.AbstractC3222i;
import Li.F;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import Li.y;
import Yg.J;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;
import wa.InterfaceC8290a;
import xa.InterfaceC8439a;
import xa.j;

/* loaded from: classes3.dex */
public final class j implements InterfaceC8439a {

    /* renamed from: g, reason: collision with root package name */
    public static final a f65506g = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final ya.n f65507b;

    /* renamed from: c, reason: collision with root package name */
    private final ya.n f65508c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC8439a.c f65509d;

    /* renamed from: e, reason: collision with root package name */
    private final y f65510e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3220g f65511f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f65512a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f65513b;

        b(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String t(InterfaceC8290a interfaceC8290a) {
            return "Catalog browser emission - contains " + interfaceC8290a.b().size() + " products";
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            b bVar = new b(interfaceC5380e);
            bVar.f65513b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f65512a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            final InterfaceC8290a interfaceC8290a = (InterfaceC8290a) this.f65513b;
            Ba.a.b(new InterfaceC6824a() { // from class: xa.k
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return j.b.t(interfaceC8290a);
                }
            });
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC8290a interfaceC8290a, InterfaceC5380e interfaceC5380e) {
            return ((b) create(interfaceC8290a, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f65514a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f65515b;

        c(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            c cVar = j.this.new c(interfaceC5380e);
            cVar.f65515b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC3221h interfaceC3221h;
            Object objG = AbstractC5467b.g();
            int i10 = this.f65514a;
            if (i10 == 0) {
                v.b(obj);
                interfaceC3221h = (InterfaceC3221h) this.f65515b;
                j jVar = j.this;
                this.f65515b = interfaceC3221h;
                this.f65514a = 1;
                obj = jVar.k(this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                    return J.f24997a;
                }
                interfaceC3221h = (InterfaceC3221h) this.f65515b;
                v.b(obj);
            }
            this.f65515b = null;
            this.f65514a = 2;
            if (interfaceC3221h.a(obj, this) == objG) {
                return objG;
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            return ((c) create(interfaceC3221h, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f65517a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f65518b;

        d(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String t(InterfaceC8290a interfaceC8290a) {
            return "Catalog browser emission - contains " + interfaceC8290a.b().size() + " products";
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            d dVar = new d(interfaceC5380e);
            dVar.f65518b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f65517a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            final InterfaceC8290a interfaceC8290a = (InterfaceC8290a) this.f65518b;
            Ba.a.b(new InterfaceC6824a() { // from class: xa.l
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return j.d.t(interfaceC8290a);
                }
            });
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC8290a interfaceC8290a, InterfaceC5380e interfaceC5380e) {
            return ((d) create(interfaceC8290a, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        Object f65519a;

        /* renamed from: b, reason: collision with root package name */
        Object f65520b;

        /* renamed from: c, reason: collision with root package name */
        long f65521c;

        /* renamed from: d, reason: collision with root package name */
        int f65522d;

        e(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String t(long j10) {
            return "ProductCatalog - Load finished in " + j10 + " ms";
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return j.this.new e(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            N n10;
            j jVar;
            long j10;
            j jVar2;
            long j11;
            N n11;
            Object objG = AbstractC5467b.g();
            int i10 = this.f65522d;
            if (i10 == 0) {
                v.b(obj);
                n10 = new N();
                jVar = j.this;
                long jCurrentTimeMillis = System.currentTimeMillis();
                ya.n nVar = jVar.f65507b;
                if (nVar != null) {
                    this.f65519a = n10;
                    this.f65520b = jVar;
                    this.f65521c = jCurrentTimeMillis;
                    this.f65522d = 1;
                    if (nVar.c(this) == objG) {
                        return objG;
                    }
                }
                j10 = jCurrentTimeMillis;
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j11 = this.f65521c;
                    jVar2 = (j) this.f65520b;
                    n11 = (N) this.f65519a;
                    v.b(obj);
                    n11.f51689a = jVar2.m();
                    final long jCurrentTimeMillis2 = System.currentTimeMillis() - j11;
                    Ba.a.b(new InterfaceC6824a() { // from class: xa.m
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return j.e.t(jCurrentTimeMillis2);
                        }
                    });
                    return n11.f51689a;
                }
                j10 = this.f65521c;
                jVar = (j) this.f65520b;
                n10 = (N) this.f65519a;
                v.b(obj);
            }
            ya.n nVar2 = jVar.f65508c;
            this.f65519a = n10;
            this.f65520b = jVar;
            this.f65521c = j10;
            this.f65522d = 2;
            if (nVar2.c(this) == objG) {
                return objG;
            }
            jVar2 = jVar;
            j11 = j10;
            n11 = n10;
            n11.f51689a = jVar2.m();
            final long jCurrentTimeMillis22 = System.currentTimeMillis() - j11;
            Ba.a.b(new InterfaceC6824a() { // from class: xa.m
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return j.e.t(jCurrentTimeMillis22);
                }
            });
            return n11.f51689a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((e) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f65524a;

        /* renamed from: c, reason: collision with root package name */
        int f65526c;

        f(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f65524a = obj;
            this.f65526c |= PduHandle.NONE;
            return j.this.a(this);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        Object f65527a;

        /* renamed from: b, reason: collision with root package name */
        long f65528b;

        /* renamed from: c, reason: collision with root package name */
        int f65529c;

        g(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return j.this.new g(interfaceC5380e);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0079 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = eh.AbstractC5467b.g()
                int r1 = r7.f65529c
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L34
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L20
                if (r1 != r2) goto L17
                long r0 = r7.f65528b
                Yg.v.b(r8)
                goto L7b
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L20:
                long r3 = r7.f65528b
                java.lang.Object r1 = r7.f65527a
                xa.j r1 = (xa.j) r1
                Yg.v.b(r8)
                goto L64
            L2a:
                long r4 = r7.f65528b
                java.lang.Object r1 = r7.f65527a
                xa.j r1 = (xa.j) r1
                Yg.v.b(r8)
                goto L51
            L34:
                Yg.v.b(r8)
                xa.j r1 = xa.j.this
                long r5 = java.lang.System.currentTimeMillis()
                ya.n r8 = xa.j.g(r1)
                if (r8 == 0) goto L52
                r7.f65527a = r1
                r7.f65528b = r5
                r7.f65529c = r4
                java.lang.Object r8 = r8.a(r7)
                if (r8 != r0) goto L50
                return r0
            L50:
                r4 = r5
            L51:
                r5 = r4
            L52:
                ya.n r8 = xa.j.h(r1)
                r7.f65527a = r1
                r7.f65528b = r5
                r7.f65529c = r3
                java.lang.Object r8 = r8.a(r7)
                if (r8 != r0) goto L63
                return r0
            L63:
                r3 = r5
            L64:
                Li.y r8 = xa.j.f(r1)
                wa.a r1 = xa.j.j(r1)
                r5 = 0
                r7.f65527a = r5
                r7.f65528b = r3
                r7.f65529c = r2
                java.lang.Object r8 = r8.a(r1, r7)
                if (r8 != r0) goto L7a
                return r0
            L7a:
                r0 = r3
            L7b:
                long r2 = java.lang.System.currentTimeMillis()
                long r2 = r2 - r0
                java.lang.Long r8 = kotlin.coroutines.jvm.internal.b.e(r2)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: xa.j.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((g) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public j(Ii.N externalScope, ya.n nVar, ya.n sourceRemote, InterfaceC8439a.c cVar) {
        AbstractC6492s.i(externalScope, "externalScope");
        AbstractC6492s.i(sourceRemote, "sourceRemote");
        this.f65507b = nVar;
        this.f65508c = sourceRemote;
        this.f65509d = cVar;
        y yVarB = F.b(0, 0, null, 7, null);
        this.f65510e = yVarB;
        this.f65511f = AbstractC3222i.K(AbstractC3222i.l(AbstractC3222i.n(AbstractC3222i.I(AbstractC3222i.J(AbstractC3222i.I(yVarB, new b(null)), new c(null)), new d(null)))), externalScope, Li.J.f11860a.d(), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object k(InterfaceC5380e interfaceC5380e) {
        Ba.a.b(new InterfaceC6824a() { // from class: xa.g
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return j.l();
            }
        });
        return AbstractC3059i.g(C3048c0.b(), new e(null), interfaceC5380e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String l() {
        return "ProductCatalog - Load initiated";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC8290a m() {
        ya.n nVar = this.f65507b;
        return new xa.f(nVar != null ? nVar.b() : null, this.f65508c.b(), this.f65509d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String n() {
        return "ProductCatalog - Sync initiated";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String o(long j10) {
        return "ProductCatalog - Sync finished in " + j10 + " ms";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.ui.product.catalog.UiProductCatalog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(dh.InterfaceC5380e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof xa.j.f
            if (r0 == 0) goto L13
            r0 = r6
            xa.j$f r0 = (xa.j.f) r0
            int r1 = r0.f65526c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f65526c = r1
            goto L18
        L13:
            xa.j$f r0 = new xa.j$f
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f65524a
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f65526c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L29
            Yg.v.b(r6)
            goto L50
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            Yg.v.b(r6)
            xa.h r6 = new xa.h
            r6.<init>()
            Ba.a.b(r6)
            Ii.J r6 = Ii.C3048c0.b()
            xa.j$g r2 = new xa.j$g
            r4 = 0
            r2.<init>(r4)
            r0.f65526c = r3
            java.lang.Object r6 = Ii.AbstractC3059i.g(r6, r2, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            java.lang.Number r6 = (java.lang.Number) r6
            long r0 = r6.longValue()
            xa.i r6 = new xa.i
            r6.<init>()
            Ba.a.b(r6)
            Yg.J r6 = Yg.J.f24997a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.j.a(dh.e):java.lang.Object");
    }

    @Override // com.ui.product.catalog.UiProductCatalog
    public InterfaceC3220g b() {
        return this.f65511f;
    }
}
