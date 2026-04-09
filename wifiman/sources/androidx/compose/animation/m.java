package androidx.compose.animation;

import C0.B;
import C0.D;
import Ii.AbstractC3063k;
import Ii.N;
import T.InterfaceC3551q0;
import T.t1;
import Y0.r;
import Y0.s;
import Yg.J;
import Yg.v;
import androidx.compose.ui.layout.t;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import q.AbstractC7398q;
import r.C7517a;
import r.C7529g;
import r.EnumC7525e;
import r.InterfaceC7533i;
import r.u0;

/* loaded from: classes.dex */
final class m extends AbstractC7398q {

    /* renamed from: n, reason: collision with root package name */
    private InterfaceC7533i f27652n;

    /* renamed from: o, reason: collision with root package name */
    private f0.c f27653o;

    /* renamed from: p, reason: collision with root package name */
    private InterfaceC6839p f27654p;

    /* renamed from: s, reason: collision with root package name */
    private boolean f27657s;

    /* renamed from: q, reason: collision with root package name */
    private long f27655q = f.c();

    /* renamed from: r, reason: collision with root package name */
    private long f27656r = Y0.c.b(0, 0, 0, 0, 15, null);

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC3551q0 f27658t = t1.d(null, null, 2, null);

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final C7517a f27659a;

        /* renamed from: b, reason: collision with root package name */
        private long f27660b;

        public /* synthetic */ a(C7517a c7517a, long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this(c7517a, j10);
        }

        public final C7517a a() {
            return this.f27659a;
        }

        public final long b() {
            return this.f27660b;
        }

        public final void c(long j10) {
            this.f27660b = j10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f27659a, aVar.f27659a) && r.e(this.f27660b, aVar.f27660b);
        }

        public int hashCode() {
            return (this.f27659a.hashCode() * 31) + r.h(this.f27660b);
        }

        public String toString() {
            return "AnimData(anim=" + this.f27659a + ", startSize=" + ((Object) r.i(this.f27660b)) + ')';
        }

        private a(C7517a c7517a, long j10) {
            this.f27659a = c7517a;
            this.f27660b = j10;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f27661a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f27662b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f27663c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ m f27664d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, long j10, m mVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f27662b = aVar;
            this.f27663c = j10;
            this.f27664d = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new b(this.f27662b, this.f27663c, this.f27664d, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC6839p interfaceC6839pH2;
            Object objG = AbstractC5467b.g();
            int i10 = this.f27661a;
            if (i10 == 0) {
                v.b(obj);
                C7517a c7517aA = this.f27662b.a();
                r rVarB = r.b(this.f27663c);
                InterfaceC7533i interfaceC7533iG2 = this.f27664d.G2();
                this.f27661a = 1;
                obj = C7517a.f(c7517aA, rVarB, interfaceC7533iG2, null, null, this, 12, null);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            C7529g c7529g = (C7529g) obj;
            if (c7529g.a() == EnumC7525e.Finished && (interfaceC6839pH2 = this.f27664d.H2()) != null) {
                interfaceC6839pH2.invoke(r.b(this.f27662b.b()), c7529g.b().getValue());
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f27666b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f27667c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f27668d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.m f27669e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ t f27670f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j10, int i10, int i11, androidx.compose.ui.layout.m mVar, t tVar) {
            super(1);
            this.f27666b = j10;
            this.f27667c = i10;
            this.f27668d = i11;
            this.f27669e = mVar;
            this.f27670f = tVar;
        }

        public final void a(t.a aVar) {
            t.a.j(aVar, this.f27670f, m.this.E2().a(this.f27666b, s.a(this.f27667c, this.f27668d), this.f27669e.getLayoutDirection()), 0.0f, 2, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    public m(InterfaceC7533i interfaceC7533i, f0.c cVar, InterfaceC6839p interfaceC6839p) {
        this.f27652n = interfaceC7533i;
        this.f27653o = cVar;
        this.f27654p = interfaceC6839p;
    }

    private final void M2(long j10) {
        this.f27656r = j10;
        this.f27657s = true;
    }

    private final long N2(long j10) {
        return this.f27657s ? this.f27656r : j10;
    }

    public final long D2(long j10) {
        a aVarF2 = F2();
        if (aVarF2 != null) {
            boolean z10 = (r.e(j10, ((r) aVarF2.a().m()).j()) || aVarF2.a().p()) ? false : true;
            if (!r.e(j10, ((r) aVarF2.a().k()).j()) || z10) {
                aVarF2.c(((r) aVarF2.a().m()).j());
                AbstractC3063k.d(d2(), null, null, new b(aVarF2, j10, this, null), 3, null);
            }
        } else {
            aVarF2 = new a(new C7517a(r.b(j10), u0.e(r.f24545b), r.b(s.a(1, 1)), null, 8, null), j10, null);
        }
        J2(aVarF2);
        return ((r) aVarF2.a().m()).j();
    }

    public final f0.c E2() {
        return this.f27653o;
    }

    public final a F2() {
        return (a) this.f27658t.getValue();
    }

    public final InterfaceC7533i G2() {
        return this.f27652n;
    }

    public final InterfaceC6839p H2() {
        return this.f27654p;
    }

    public final void I2(f0.c cVar) {
        this.f27653o = cVar;
    }

    public final void J2(a aVar) {
        this.f27658t.setValue(aVar);
    }

    public final void K2(InterfaceC7533i interfaceC7533i) {
        this.f27652n = interfaceC7533i;
    }

    public final void L2(InterfaceC6839p interfaceC6839p) {
        this.f27654p = interfaceC6839p;
    }

    @Override // E0.B
    public D b(androidx.compose.ui.layout.m mVar, B b10, long j10) {
        t tVarT;
        long jF;
        if (mVar.a1()) {
            M2(j10);
            tVarT = b10.T(j10);
        } else {
            tVarT = b10.T(N2(j10));
        }
        t tVar = tVarT;
        long jA = s.a(tVar.I0(), tVar.C0());
        if (mVar.a1()) {
            this.f27655q = jA;
            jF = jA;
        } else {
            jF = Y0.c.f(j10, D2(f.d(this.f27655q) ? this.f27655q : jA));
        }
        int iG = r.g(jF);
        int iF = r.f(jF);
        return androidx.compose.ui.layout.m.x0(mVar, iG, iF, null, new c(jA, iG, iF, mVar, tVar), 4, null);
    }

    @Override // androidx.compose.ui.e.c
    public void n2() {
        super.n2();
        this.f27655q = f.c();
        this.f27657s = false;
    }

    @Override // androidx.compose.ui.e.c
    public void p2() {
        super.p2();
        J2(null);
    }
}
