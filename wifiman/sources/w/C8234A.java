package w;

import Yg.J;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.M;
import l0.AbstractC6532h;
import l0.C6531g;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;
import s.EnumC7839L;
import s.S;
import x0.C8413b;

/* renamed from: w.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8234A {

    /* renamed from: a, reason: collision with root package name */
    private y f63697a;

    /* renamed from: b, reason: collision with root package name */
    private S f63698b;

    /* renamed from: c, reason: collision with root package name */
    private n f63699c;

    /* renamed from: d, reason: collision with root package name */
    private q f63700d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f63701e;

    /* renamed from: f, reason: collision with root package name */
    private C8413b f63702f;

    /* renamed from: g, reason: collision with root package name */
    private int f63703g = x0.e.f65322a.b();

    /* renamed from: h, reason: collision with root package name */
    private v f63704h = androidx.compose.foundation.gestures.d.f27951b;

    /* renamed from: i, reason: collision with root package name */
    private final c f63705i = new c();

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC6835l f63706j = new e();

    /* renamed from: w.A$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f63707a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f63708b;

        /* renamed from: d, reason: collision with root package name */
        int f63710d;

        a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f63708b = obj;
            this.f63710d |= PduHandle.NONE;
            return C8234A.this.n(0L, this);
        }
    }

    /* renamed from: w.A$b */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        Object f63711a;

        /* renamed from: b, reason: collision with root package name */
        Object f63712b;

        /* renamed from: c, reason: collision with root package name */
        long f63713c;

        /* renamed from: d, reason: collision with root package name */
        int f63714d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f63715e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ M f63717g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f63718h;

        /* renamed from: w.A$b$a */
        public static final class a implements v {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C8234A f63719a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f63720b;

            a(C8234A c8234a, p pVar) {
                this.f63719a = c8234a;
                this.f63720b = pVar;
            }

            @Override // w.v
            public float a(float f10) {
                C8234A c8234a = this.f63719a;
                return c8234a.t(c8234a.A(this.f63720b.a(c8234a.u(c8234a.B(f10)), x0.e.f65322a.a())));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(M m10, long j10, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f63717g = m10;
            this.f63718h = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            b bVar = C8234A.this.new b(this.f63717g, this.f63718h, interfaceC5380e);
            bVar.f63715e = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C8234A c8234a;
            M m10;
            C8234A c8234a2;
            long j10;
            Object objG = AbstractC5467b.g();
            int i10 = this.f63714d;
            if (i10 == 0) {
                Yg.v.b(obj);
                a aVar = new a(C8234A.this, (p) this.f63715e);
                c8234a = C8234A.this;
                M m11 = this.f63717g;
                long j11 = this.f63718h;
                n nVar = c8234a.f63699c;
                long j12 = m11.f51688a;
                float fT = c8234a.t(c8234a.z(j11));
                this.f63715e = c8234a;
                this.f63711a = c8234a;
                this.f63712b = m11;
                this.f63713c = j12;
                this.f63714d = 1;
                Object objA = nVar.a(aVar, fT, this);
                if (objA == objG) {
                    return objG;
                }
                m10 = m11;
                obj = objA;
                c8234a2 = c8234a;
                j10 = j12;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = this.f63713c;
                m10 = (M) this.f63712b;
                c8234a = (C8234A) this.f63711a;
                c8234a2 = (C8234A) this.f63715e;
                Yg.v.b(obj);
            }
            m10.f51688a = c8234a.D(j10, c8234a2.t(((Number) obj).floatValue()));
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p pVar, InterfaceC5380e interfaceC5380e) {
            return ((b) create(pVar, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    /* renamed from: w.A$c */
    public static final class c implements p {
        c() {
        }

        @Override // w.p
        public long a(long j10, int i10) {
            C8234A.this.f63703g = i10;
            S s10 = C8234A.this.f63698b;
            if (s10 != null && C8234A.this.o()) {
                return s10.b(j10, C8234A.this.f63703g, C8234A.this.f63706j);
            }
            return C8234A.this.s(C8234A.this.f63704h, j10, i10);
        }

        @Override // w.p
        public long b(long j10, int i10) {
            return C8234A.this.s(C8234A.this.f63704h, j10, i10);
        }
    }

    /* renamed from: w.A$d */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        long f63722a;

        /* renamed from: b, reason: collision with root package name */
        int f63723b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ long f63724c;

        d(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            d dVar = C8234A.this.new d(interfaceC5380e);
            dVar.f63724c = ((Y0.y) obj).o();
            return dVar;
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return n(((Y0.y) obj).o(), (InterfaceC5380e) obj2);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0087 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r6 = eh.AbstractC5467b.g()
                int r0 = r13.f63723b
                r1 = 3
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L35
                if (r0 == r3) goto L2e
                if (r0 == r2) goto L24
                if (r0 != r1) goto L1c
                long r0 = r13.f63722a
                long r2 = r13.f63724c
                Yg.v.b(r14)
                r9 = r0
                r0 = r14
                goto L89
            L1c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L24:
                long r2 = r13.f63722a
                long r4 = r13.f63724c
                Yg.v.b(r14)
                r0 = r14
                r7 = r4
                goto L68
            L2e:
                long r3 = r13.f63724c
                Yg.v.b(r14)
                r0 = r14
                goto L4c
            L35:
                Yg.v.b(r14)
                long r4 = r13.f63724c
                w.A r0 = w.C8234A.this
                x0.b r0 = w.C8234A.c(r0)
                r13.f63724c = r4
                r13.f63723b = r3
                java.lang.Object r0 = r0.c(r4, r13)
                if (r0 != r6) goto L4b
                return r6
            L4b:
                r3 = r4
            L4c:
                Y0.y r0 = (Y0.y) r0
                long r7 = r0.o()
                long r7 = Y0.y.k(r3, r7)
                w.A r0 = w.C8234A.this
                r13.f63724c = r3
                r13.f63722a = r7
                r13.f63723b = r2
                java.lang.Object r0 = r0.n(r7, r13)
                if (r0 != r6) goto L65
                return r6
            L65:
                r11 = r3
                r2 = r7
                r7 = r11
            L68:
                Y0.y r0 = (Y0.y) r0
                long r9 = r0.o()
                w.A r0 = w.C8234A.this
                x0.b r0 = w.C8234A.c(r0)
                long r2 = Y0.y.k(r2, r9)
                r13.f63724c = r7
                r13.f63722a = r9
                r13.f63723b = r1
                r1 = r2
                r3 = r9
                r5 = r13
                java.lang.Object r0 = r0.a(r1, r3, r5)
                if (r0 != r6) goto L88
                return r6
            L88:
                r2 = r7
            L89:
                Y0.y r0 = (Y0.y) r0
                long r0 = r0.o()
                long r0 = Y0.y.k(r9, r0)
                long r0 = Y0.y.k(r2, r0)
                Y0.y r0 = Y0.y.b(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: w.C8234A.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object n(long j10, InterfaceC5380e interfaceC5380e) {
            return ((d) create(Y0.y.b(j10), interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    /* renamed from: w.A$e */
    static final class e extends AbstractC6494u implements InterfaceC6835l {
        e() {
            super(1);
        }

        public final long a(long j10) {
            v vVar = C8234A.this.f63704h;
            C8234A c8234a = C8234A.this;
            return c8234a.s(vVar, j10, c8234a.f63703g);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C6531g.d(a(((C6531g) obj).v()));
        }
    }

    /* renamed from: w.A$f */
    static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f63727a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f63728b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f63730d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f63730d = interfaceC6839p;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            f fVar = C8234A.this.new f(this.f63730d, interfaceC5380e);
            fVar.f63728b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f63727a;
            if (i10 == 0) {
                Yg.v.b(obj);
                C8234A.this.f63704h = (v) this.f63728b;
                InterfaceC6839p interfaceC6839p = this.f63730d;
                c cVar = C8234A.this.f63705i;
                this.f63727a = 1;
                if (interfaceC6839p.invoke(cVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v vVar, InterfaceC5380e interfaceC5380e) {
            return ((f) create(vVar, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public C8234A(y yVar, S s10, n nVar, q qVar, boolean z10, C8413b c8413b) {
        this.f63697a = yVar;
        this.f63698b = s10;
        this.f63699c = nVar;
        this.f63700d = qVar;
        this.f63701e = z10;
        this.f63702f = c8413b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long D(long j10, float f10) {
        return this.f63700d == q.Horizontal ? Y0.y.e(j10, f10, 0.0f, 2, null) : Y0.y.e(j10, 0.0f, f10, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o() {
        return this.f63697a.e() || this.f63697a.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long s(v vVar, long j10, int i10) {
        long jD = this.f63702f.d(j10, i10);
        long jQ = C6531g.q(j10, jD);
        long jU = u(B(vVar.a(A(u(x(jQ))))));
        return C6531g.r(C6531g.r(jD, jU), this.f63702f.b(jU, C6531g.q(jQ, jU), i10));
    }

    private final long y(long j10) {
        return this.f63700d == q.Horizontal ? Y0.y.e(j10, 0.0f, 0.0f, 1, null) : Y0.y.e(j10, 0.0f, 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float z(long j10) {
        return this.f63700d == q.Horizontal ? Y0.y.h(j10) : Y0.y.i(j10);
    }

    public final float A(long j10) {
        return this.f63700d == q.Horizontal ? C6531g.m(j10) : C6531g.n(j10);
    }

    public final long B(float f10) {
        return f10 == 0.0f ? C6531g.f52335b.c() : this.f63700d == q.Horizontal ? AbstractC6532h.a(f10, 0.0f) : AbstractC6532h.a(0.0f, f10);
    }

    public final boolean C(y yVar, q qVar, S s10, boolean z10, n nVar, C8413b c8413b) {
        boolean z11;
        boolean z12 = true;
        if (AbstractC6492s.d(this.f63697a, yVar)) {
            z11 = false;
        } else {
            this.f63697a = yVar;
            z11 = true;
        }
        this.f63698b = s10;
        if (this.f63700d != qVar) {
            this.f63700d = qVar;
            z11 = true;
        }
        if (this.f63701e != z10) {
            this.f63701e = z10;
        } else {
            z12 = z11;
        }
        this.f63699c = nVar;
        this.f63702f = c8413b;
        return z12;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(long r12, dh.InterfaceC5380e r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof w.C8234A.a
            if (r0 == 0) goto L13
            r0 = r14
            w.A$a r0 = (w.C8234A.a) r0
            int r1 = r0.f63710d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f63710d = r1
            goto L18
        L13:
            w.A$a r0 = new w.A$a
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f63708b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f63710d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r12 = r0.f63707a
            kotlin.jvm.internal.M r12 = (kotlin.jvm.internal.M) r12
            Yg.v.b(r14)
            goto L57
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            Yg.v.b(r14)
            kotlin.jvm.internal.M r14 = new kotlin.jvm.internal.M
            r14.<init>()
            r14.f51688a = r12
            s.L r2 = s.EnumC7839L.Default
            w.A$b r10 = new w.A$b
            r9 = 0
            r4 = r10
            r5 = r11
            r6 = r14
            r7 = r12
            r4.<init>(r6, r7, r9)
            r0.f63707a = r14
            r0.f63710d = r3
            java.lang.Object r12 = r11.v(r2, r10, r0)
            if (r12 != r1) goto L56
            return r1
        L56:
            r12 = r14
        L57:
            long r12 = r12.f51688a
            Y0.y r12 = Y0.y.b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C8234A.n(long, dh.e):java.lang.Object");
    }

    public final boolean p() {
        return this.f63700d == q.Vertical;
    }

    public final Object q(long j10, InterfaceC5380e interfaceC5380e) {
        long jY = y(j10);
        d dVar = new d(null);
        S s10 = this.f63698b;
        if (s10 == null || !o()) {
            Object objInvoke = dVar.invoke(Y0.y.b(jY), interfaceC5380e);
            return objInvoke == AbstractC5467b.g() ? objInvoke : J.f24997a;
        }
        Object objA = s10.a(jY, dVar, interfaceC5380e);
        return objA == AbstractC5467b.g() ? objA : J.f24997a;
    }

    public final long r(long j10) {
        return this.f63697a.a() ? C6531g.f52335b.c() : B(t(this.f63697a.f(t(A(j10)))));
    }

    public final float t(float f10) {
        return this.f63701e ? f10 * (-1) : f10;
    }

    public final long u(long j10) {
        return this.f63701e ? C6531g.s(j10, -1.0f) : j10;
    }

    public final Object v(EnumC7839L enumC7839L, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
        Object objC = this.f63697a.c(enumC7839L, new f(interfaceC6839p, null), interfaceC5380e);
        return objC == AbstractC5467b.g() ? objC : J.f24997a;
    }

    public final boolean w() {
        if (!this.f63697a.a()) {
            S s10 = this.f63698b;
            if (!(s10 != null ? s10.d() : false)) {
                return false;
            }
        }
        return true;
    }

    public final long x(long j10) {
        return this.f63700d == q.Horizontal ? C6531g.g(j10, 0.0f, 0.0f, 1, null) : C6531g.g(j10, 0.0f, 0.0f, 2, null);
    }
}
