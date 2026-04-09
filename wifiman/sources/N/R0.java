package N;

import Li.AbstractC3222i;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import T.InterfaceC3543m0;
import T.InterfaceC3551q0;
import T.o1;
import T.t1;
import T.z1;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;
import r.AbstractC7519b;
import r.C7517a;
import r.InterfaceC7533i;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public class R0 {

    /* renamed from: q, reason: collision with root package name */
    public static final a f13947q = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7533i f13948a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6835l f13949b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3551q0 f13950c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3551q0 f13951d = t1.d(Boolean.FALSE, null, 2, null);

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3543m0 f13952e = T.C0.a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3543m0 f13953f = T.C0.a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3543m0 f13954g = T.C0.a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3551q0 f13955h = t1.d(null, null, 2, null);

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC3551q0 f13956i = t1.d(Zg.U.h(), null, 2, null);

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3220g f13957j = AbstractC3222i.N(new i(o1.o(new e())), 1);

    /* renamed from: k, reason: collision with root package name */
    private float f13958k = Float.NEGATIVE_INFINITY;

    /* renamed from: l, reason: collision with root package name */
    private float f13959l = Float.POSITIVE_INFINITY;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC3551q0 f13960m = t1.d(j.f13998a, null, 2, null);

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC3543m0 f13961n = T.C0.a(0.0f);

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC3551q0 f13962o = t1.d(null, null, 2, null);

    /* renamed from: p, reason: collision with root package name */
    private final w.m f13963p = w.l.a(new d());

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f13964a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f13965b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f13967d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC7533i f13968e;

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ w.k f13969a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.K f13970b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w.k kVar, kotlin.jvm.internal.K k10) {
                super(1);
                this.f13969a = kVar;
                this.f13970b = k10;
            }

            public final void a(C7517a c7517a) {
                this.f13969a.a(((Number) c7517a.m()).floatValue() - this.f13970b.f51686a);
                this.f13970b.f51686a = ((Number) c7517a.m()).floatValue();
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C7517a) obj);
                return Yg.J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f10, InterfaceC7533i interfaceC7533i, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f13967d = f10;
            this.f13968e = interfaceC7533i;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            b bVar = R0.this.new b(this.f13967d, this.f13968e, interfaceC5380e);
            bVar.f13965b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f13964a;
            try {
                if (i10 == 0) {
                    Yg.v.b(obj);
                    w.k kVar = (w.k) this.f13965b;
                    kotlin.jvm.internal.K k10 = new kotlin.jvm.internal.K();
                    k10.f51686a = R0.this.f13954g.c();
                    R0.this.f13955h.setValue(kotlin.coroutines.jvm.internal.b.c(this.f13967d));
                    R0.this.B(true);
                    C7517a c7517aB = AbstractC7519b.b(k10.f51686a, 0.0f, 2, null);
                    Float fC = kotlin.coroutines.jvm.internal.b.c(this.f13967d);
                    InterfaceC7533i interfaceC7533i = this.f13968e;
                    a aVar = new a(kVar, k10);
                    this.f13964a = 1;
                    if (C7517a.f(c7517aB, fC, interfaceC7533i, null, aVar, this, 4, null) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                }
                R0.this.f13955h.setValue(null);
                R0.this.B(false);
                return Yg.J.f24997a;
            } catch (Throwable th2) {
                R0.this.f13955h.setValue(null);
                R0.this.B(false);
                throw th2;
            }
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(w.k kVar, InterfaceC5380e interfaceC5380e) {
            return ((b) create(kVar, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class c implements InterfaceC3221h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f13971a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ R0 f13972b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC7533i f13973c;

        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f13974a;

            /* renamed from: b, reason: collision with root package name */
            Object f13975b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f13976c;

            /* renamed from: e, reason: collision with root package name */
            int f13978e;

            a(InterfaceC5380e interfaceC5380e) {
                super(interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f13976c = obj;
                this.f13978e |= PduHandle.NONE;
                return c.this.a(null, this);
            }
        }

        c(Object obj, R0 r02, InterfaceC7533i interfaceC7533i) {
            this.f13971a = obj;
            this.f13972b = r02;
            this.f13973c = interfaceC7533i;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0114  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Li.InterfaceC3221h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(java.util.Map r7, dh.InterfaceC5380e r8) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 288
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: N.R0.c.a(java.util.Map, dh.e):java.lang.Object");
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6835l {
        d() {
            super(1);
        }

        public final void a(float f10) {
            float fC = R0.this.f13954g.c() + f10;
            float fJ = AbstractC7978m.j(fC, R0.this.r(), R0.this.q());
            float f11 = fC - fJ;
            C3354x0 c3354x0T = R0.this.t();
            R0.this.f13952e.k(fJ + (c3354x0T != null ? c3354x0T.a(f11) : 0.0f));
            R0.this.f13953f.k(f11);
            R0.this.f13954g.k(fC);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).floatValue());
            return Yg.J.f24997a;
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6824a {
        e() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            return R0.this.l();
        }
    }

    static final class f implements InterfaceC3221h {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f13982b;

        f(float f10) {
            this.f13982b = f10;
        }

        @Override // Li.InterfaceC3221h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object a(Map map, InterfaceC5380e interfaceC5380e) {
            Float fE = Q0.e(map, R0.this.o());
            AbstractC6492s.f(fE);
            float fFloatValue = fE.floatValue();
            Object obj = map.get(kotlin.coroutines.jvm.internal.b.c(Q0.c(((Number) R0.this.s().getValue()).floatValue(), fFloatValue, map.keySet(), R0.this.v(), this.f13982b, R0.this.w())));
            if (obj != null && ((Boolean) R0.this.n().invoke(obj)).booleanValue()) {
                Object objJ = R0.j(R0.this, obj, null, interfaceC5380e, 2, null);
                return objJ == AbstractC5467b.g() ? objJ : Yg.J.f24997a;
            }
            R0 r02 = R0.this;
            Object objH = r02.h(fFloatValue, r02.m(), interfaceC5380e);
            return objH == AbstractC5467b.g() ? objH : Yg.J.f24997a;
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f13983a;

        /* renamed from: b, reason: collision with root package name */
        Object f13984b;

        /* renamed from: c, reason: collision with root package name */
        float f13985c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f13986d;

        /* renamed from: f, reason: collision with root package name */
        int f13988f;

        g(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13986d = obj;
            this.f13988f |= PduHandle.NONE;
            return R0.this.z(null, null, this);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f13989a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f13990b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f13991c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ R0 f13992d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(float f10, R0 r02, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f13991c = f10;
            this.f13992d = r02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            h hVar = new h(this.f13991c, this.f13992d, interfaceC5380e);
            hVar.f13990b = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f13989a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Yg.v.b(obj);
            ((w.k) this.f13990b).a(this.f13991c - this.f13992d.f13954g.c());
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(w.k kVar, InterfaceC5380e interfaceC5380e) {
            return ((h) create(kVar, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public static final class i implements InterfaceC3220g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f13993a;

        public static final class a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3221h f13994a;

            /* renamed from: N.R0$i$a$a, reason: collision with other inner class name */
            public static final class C0547a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f13995a;

                /* renamed from: b, reason: collision with root package name */
                int f13996b;

                public C0547a(InterfaceC5380e interfaceC5380e) {
                    super(interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f13995a = obj;
                    this.f13996b |= PduHandle.NONE;
                    return a.this.a(null, this);
                }
            }

            public a(InterfaceC3221h interfaceC3221h) {
                this.f13994a = interfaceC3221h;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // Li.InterfaceC3221h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(java.lang.Object r5, dh.InterfaceC5380e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof N.R0.i.a.C0547a
                    if (r0 == 0) goto L13
                    r0 = r6
                    N.R0$i$a$a r0 = (N.R0.i.a.C0547a) r0
                    int r1 = r0.f13996b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f13996b = r1
                    goto L18
                L13:
                    N.R0$i$a$a r0 = new N.R0$i$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f13995a
                    java.lang.Object r1 = eh.AbstractC5467b.g()
                    int r2 = r0.f13996b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    Yg.v.b(r6)
                    goto L48
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    Yg.v.b(r6)
                    Li.h r6 = r4.f13994a
                    r2 = r5
                    java.util.Map r2 = (java.util.Map) r2
                    boolean r2 = r2.isEmpty()
                    if (r2 != 0) goto L48
                    r0.f13996b = r3
                    java.lang.Object r5 = r6.a(r5, r0)
                    if (r5 != r1) goto L48
                    return r1
                L48:
                    Yg.J r5 = Yg.J.f24997a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: N.R0.i.a.a(java.lang.Object, dh.e):java.lang.Object");
            }
        }

        public i(InterfaceC3220g interfaceC3220g) {
            this.f13993a = interfaceC3220g;
        }

        @Override // Li.InterfaceC3220g
        public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            Object objB = this.f13993a.b(new a(interfaceC3221h), interfaceC5380e);
            return objB == AbstractC5467b.g() ? objB : Yg.J.f24997a;
        }
    }

    static final class j extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final j f13998a = new j();

        j() {
            super(2);
        }

        public final Float a(float f10, float f11) {
            return Float.valueOf(0.0f);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
        }
    }

    public R0(Object obj, InterfaceC7533i interfaceC7533i, InterfaceC6835l interfaceC6835l) {
        this.f13948a = interfaceC7533i;
        this.f13949b = interfaceC6835l;
        this.f13950c = t1.d(obj, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(boolean z10) {
        this.f13951d.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(Object obj) {
        this.f13950c.setValue(obj);
    }

    private final Object G(float f10, InterfaceC5380e interfaceC5380e) {
        Object objB = w.m.b(this.f13963p, null, new h(f10, this, null), interfaceC5380e, 1, null);
        return objB == AbstractC5467b.g() ? objB : Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(float f10, InterfaceC7533i interfaceC7533i, InterfaceC5380e interfaceC5380e) {
        Object objB = w.m.b(this.f13963p, null, new b(f10, interfaceC7533i, null), interfaceC5380e, 1, null);
        return objB == AbstractC5467b.g() ? objB : Yg.J.f24997a;
    }

    public static /* synthetic */ Object j(R0 r02, Object obj, InterfaceC7533i interfaceC7533i, InterfaceC5380e interfaceC5380e, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
        }
        if ((i10 & 2) != 0) {
            interfaceC7533i = r02.f13948a;
        }
        return r02.i(obj, interfaceC7533i, interfaceC5380e);
    }

    public final void A(Map map) {
        this.f13956i.setValue(map);
    }

    public final void D(C3354x0 c3354x0) {
        this.f13962o.setValue(c3354x0);
    }

    public final void E(InterfaceC6839p interfaceC6839p) {
        this.f13960m.setValue(interfaceC6839p);
    }

    public final void F(float f10) {
        this.f13961n.k(f10);
    }

    public final Object i(Object obj, InterfaceC7533i interfaceC7533i, InterfaceC5380e interfaceC5380e) {
        Object objB = this.f13957j.b(new c(obj, this, interfaceC7533i), interfaceC5380e);
        return objB == AbstractC5467b.g() ? objB : Yg.J.f24997a;
    }

    public final void k(Map map) {
        if (l().isEmpty()) {
            Float fE = Q0.e(map, o());
            if (fE == null) {
                throw new IllegalArgumentException("The initial value must have an associated anchor.");
            }
            this.f13952e.k(fE.floatValue());
            this.f13954g.k(fE.floatValue());
        }
    }

    public final Map l() {
        return (Map) this.f13956i.getValue();
    }

    public final InterfaceC7533i m() {
        return this.f13948a;
    }

    public final InterfaceC6835l n() {
        return this.f13949b;
    }

    public final Object o() {
        return this.f13950c.getValue();
    }

    public final w.m p() {
        return this.f13963p;
    }

    public final float q() {
        return this.f13959l;
    }

    public final float r() {
        return this.f13958k;
    }

    public final z1 s() {
        return this.f13952e;
    }

    public final C3354x0 t() {
        return (C3354x0) this.f13962o.getValue();
    }

    public final Object u() {
        float fC;
        Float f10 = (Float) this.f13955h.getValue();
        if (f10 != null) {
            fC = f10.floatValue();
        } else {
            float fFloatValue = ((Number) s().getValue()).floatValue();
            Float fE = Q0.e(l(), o());
            fC = Q0.c(fFloatValue, fE != null ? fE.floatValue() : ((Number) s().getValue()).floatValue(), l().keySet(), v(), 0.0f, Float.POSITIVE_INFINITY);
        }
        Object obj = l().get(Float.valueOf(fC));
        return obj == null ? o() : obj;
    }

    public final InterfaceC6839p v() {
        return (InterfaceC6839p) this.f13960m.getValue();
    }

    public final float w() {
        return this.f13961n.c();
    }

    public final boolean x() {
        return ((Boolean) this.f13951d.getValue()).booleanValue();
    }

    public final Object y(float f10, InterfaceC5380e interfaceC5380e) {
        Object objB = this.f13957j.b(new f(f10), interfaceC5380e);
        return objB == AbstractC5467b.g() ? objB : Yg.J.f24997a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0216 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0217  */
    /* JADX WARN: Type inference failed for: r10v21, types: [float] */
    /* JADX WARN: Type inference failed for: r10v76, types: [float] */
    /* JADX WARN: Type inference failed for: r10v78, types: [float] */
    /* JADX WARN: Type inference failed for: r10v83 */
    /* JADX WARN: Type inference failed for: r10v84 */
    /* JADX WARN: Type inference failed for: r10v85 */
    /* JADX WARN: Type inference failed for: r10v86 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z(java.util.Map r10, java.util.Map r11, dh.InterfaceC5380e r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 639
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.R0.z(java.util.Map, java.util.Map, dh.e):java.lang.Object");
    }
}
