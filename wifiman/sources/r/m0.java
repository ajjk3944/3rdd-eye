package r;

import T.AbstractC3535i0;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.C6486l;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
public abstract class m0 {

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f59732a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s0 f59733b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6839p interfaceC6839p, s0 s0Var) {
            super(1);
            this.f59732a = interfaceC6839p;
            this.f59733b = s0Var;
        }

        public final void a(C7531h c7531h) {
            this.f59732a.invoke(c7531h.e(), this.f59733b.b().invoke(c7531h.g()));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C7531h) obj);
            return Yg.J.f24997a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f59734a;

        /* renamed from: b, reason: collision with root package name */
        Object f59735b;

        /* renamed from: c, reason: collision with root package name */
        Object f59736c;

        /* renamed from: d, reason: collision with root package name */
        Object f59737d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f59738e;

        /* renamed from: f, reason: collision with root package name */
        int f59739f;

        b(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f59738e = obj;
            this.f59739f |= PduHandle.NONE;
            return m0.c(null, null, 0L, null, this);
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final c f59740a = new c();

        c() {
            super(1);
        }

        public final void a(C7531h c7531h) {
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C7531h) obj);
            return Yg.J.f24997a;
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.N f59741a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f59742b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC7523d f59743c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC7542q f59744d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C7536k f59745e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f59746f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f59747g;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C7536k f59748a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C7536k c7536k) {
                super(0);
                this.f59748a = c7536k;
            }

            public final void a() {
                this.f59748a.u(false);
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Yg.J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(kotlin.jvm.internal.N n10, Object obj, InterfaceC7523d interfaceC7523d, AbstractC7542q abstractC7542q, C7536k c7536k, float f10, InterfaceC6835l interfaceC6835l) {
            super(1);
            this.f59741a = n10;
            this.f59742b = obj;
            this.f59743c = interfaceC7523d;
            this.f59744d = abstractC7542q;
            this.f59745e = c7536k;
            this.f59746f = f10;
            this.f59747g = interfaceC6835l;
        }

        public final void a(long j10) {
            kotlin.jvm.internal.N n10 = this.f59741a;
            C7531h c7531h = new C7531h(this.f59742b, this.f59743c.c(), this.f59744d, j10, this.f59743c.g(), j10, true, new a(this.f59745e));
            m0.m(c7531h, j10, this.f59746f, this.f59743c, this.f59745e, this.f59747g);
            n10.f51689a = c7531h;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return Yg.J.f24997a;
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C7536k f59749a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C7536k c7536k) {
            super(0);
            this.f59749a = c7536k;
        }

        public final void a() {
            this.f59749a.u(false);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.N f59750a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f59751b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC7523d f59752c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C7536k f59753d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f59754e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(kotlin.jvm.internal.N n10, float f10, InterfaceC7523d interfaceC7523d, C7536k c7536k, InterfaceC6835l interfaceC6835l) {
            super(1);
            this.f59750a = n10;
            this.f59751b = f10;
            this.f59752c = interfaceC7523d;
            this.f59753d = c7536k;
            this.f59754e = interfaceC6835l;
        }

        public final void a(long j10) {
            Object obj = this.f59750a.f51689a;
            AbstractC6492s.f(obj);
            m0.m((C7531h) obj, j10, this.f59751b, this.f59752c, this.f59753d, this.f59754e);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return Yg.J.f24997a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class g extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final g f59755a = new g();

        g() {
            super(1);
        }

        public final void a(C7531h c7531h) {
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C7531h) obj);
            return Yg.J.f24997a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class h extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final h f59756a = new h();

        h() {
            super(1);
        }

        public final void a(C7531h c7531h) {
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C7531h) obj);
            return Yg.J.f24997a;
        }
    }

    static final class i extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f59757a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(InterfaceC6835l interfaceC6835l) {
            super(1);
            this.f59757a = interfaceC6835l;
        }

        public final Object a(long j10) {
            return this.f59757a.invoke(Long.valueOf(j10));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).longValue());
        }
    }

    public static final Object b(float f10, float f11, float f12, InterfaceC7533i interfaceC7533i, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
        Object objD = d(u0.f(C6486l.f51726a), kotlin.coroutines.jvm.internal.b.c(f10), kotlin.coroutines.jvm.internal.b.c(f11), kotlin.coroutines.jvm.internal.b.c(f12), interfaceC7533i, interfaceC6839p, interfaceC5380e);
        return objD == AbstractC5467b.g() ? objD : Yg.J.f24997a;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(r.C7536k r25, r.InterfaceC7523d r26, long r27, mh.InterfaceC6835l r29, dh.InterfaceC5380e r30) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r.m0.c(r.k, r.d, long, mh.l, dh.e):java.lang.Object");
    }

    public static final Object d(s0 s0Var, Object obj, Object obj2, Object obj3, InterfaceC7533i interfaceC7533i, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
        AbstractC7542q abstractC7542qG;
        if (obj3 == null || (abstractC7542qG = (AbstractC7542q) s0Var.a().invoke(obj3)) == null) {
            abstractC7542qG = r.g((AbstractC7542q) s0Var.a().invoke(obj));
        }
        Object objF = f(new C7536k(s0Var, obj, abstractC7542qG, 0L, 0L, false, 56, null), new n0(interfaceC7533i, s0Var, obj, obj2, abstractC7542qG), 0L, new a(interfaceC6839p, s0Var), interfaceC5380e, 2, null);
        return objF == AbstractC5467b.g() ? objF : Yg.J.f24997a;
    }

    public static /* synthetic */ Object e(float f10, float f11, float f12, InterfaceC7533i interfaceC7533i, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e, int i10, Object obj) {
        float f13 = (i10 & 4) != 0 ? 0.0f : f12;
        if ((i10 & 8) != 0) {
            interfaceC7533i = AbstractC7535j.j(0.0f, 0.0f, null, 7, null);
        }
        return b(f10, f11, f13, interfaceC7533i, interfaceC6839p, interfaceC5380e);
    }

    public static /* synthetic */ Object f(C7536k c7536k, InterfaceC7523d interfaceC7523d, long j10, InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Long.MIN_VALUE;
        }
        long j11 = j10;
        if ((i10 & 4) != 0) {
            interfaceC6835l = c.f59740a;
        }
        return c(c7536k, interfaceC7523d, j11, interfaceC6835l, interfaceC5380e);
    }

    public static final Object g(C7536k c7536k, InterfaceC7550z interfaceC7550z, boolean z10, InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
        Object objC = c(c7536k, new C7549y(interfaceC7550z, c7536k.j(), c7536k.getValue(), c7536k.q()), z10 ? c7536k.i() : Long.MIN_VALUE, interfaceC6835l, interfaceC5380e);
        return objC == AbstractC5467b.g() ? objC : Yg.J.f24997a;
    }

    public static /* synthetic */ Object h(C7536k c7536k, InterfaceC7550z interfaceC7550z, boolean z10, InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            interfaceC6835l = g.f59755a;
        }
        return g(c7536k, interfaceC7550z, z10, interfaceC6835l, interfaceC5380e);
    }

    public static final Object i(C7536k c7536k, Object obj, InterfaceC7533i interfaceC7533i, boolean z10, InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
        Object objC = c(c7536k, new n0(interfaceC7533i, c7536k.j(), c7536k.getValue(), obj, c7536k.q()), z10 ? c7536k.i() : Long.MIN_VALUE, interfaceC6835l, interfaceC5380e);
        return objC == AbstractC5467b.g() ? objC : Yg.J.f24997a;
    }

    public static /* synthetic */ Object j(C7536k c7536k, Object obj, InterfaceC7533i interfaceC7533i, boolean z10, InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            interfaceC7533i = AbstractC7535j.j(0.0f, 0.0f, null, 7, null);
        }
        InterfaceC7533i interfaceC7533i2 = interfaceC7533i;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            interfaceC6835l = h.f59756a;
        }
        return i(c7536k, obj, interfaceC7533i2, z11, interfaceC6835l, interfaceC5380e);
    }

    private static final Object k(InterfaceC7523d interfaceC7523d, InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
        return interfaceC7523d.a() ? M.a(interfaceC6835l, interfaceC5380e) : AbstractC3535i0.c(new i(interfaceC6835l), interfaceC5380e);
    }

    private static final void l(C7531h c7531h, long j10, long j11, InterfaceC7523d interfaceC7523d, C7536k c7536k, InterfaceC6835l interfaceC6835l) {
        c7531h.j(j10);
        c7531h.l(interfaceC7523d.f(j11));
        c7531h.m(interfaceC7523d.d(j11));
        if (interfaceC7523d.e(j11)) {
            c7531h.i(c7531h.c());
            c7531h.k(false);
        }
        o(c7531h, c7536k);
        interfaceC6835l.invoke(c7531h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(C7531h c7531h, long j10, float f10, InterfaceC7523d interfaceC7523d, C7536k c7536k, InterfaceC6835l interfaceC6835l) {
        l(c7531h, j10, f10 == 0.0f ? interfaceC7523d.b() : (long) ((j10 - c7531h.d()) / f10), interfaceC7523d, c7536k, interfaceC6835l);
    }

    public static final float n(InterfaceC5384i interfaceC5384i) {
        f0.g gVar = (f0.g) interfaceC5384i.get(f0.g.f46598n0);
        float fV = gVar != null ? gVar.v() : 1.0f;
        if (!(fV >= 0.0f)) {
            AbstractC7518a0.b("negative scale factor");
        }
        return fV;
    }

    public static final void o(C7531h c7531h, C7536k c7536k) {
        c7536k.v(c7531h.e());
        r.f(c7536k.q(), c7531h.g());
        c7536k.s(c7531h.b());
        c7536k.t(c7531h.c());
        c7536k.u(c7531h.h());
    }
}
