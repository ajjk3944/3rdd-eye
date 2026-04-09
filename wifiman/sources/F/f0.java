package F;

import T.C0;
import T.InterfaceC3543m0;
import T.InterfaceC3551q0;
import T.o1;
import Zg.AbstractC3689v;
import c0.AbstractC4172a;
import c0.InterfaceC4182k;
import c0.InterfaceC4184m;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C6533i;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final c f5257f = new c(null);

    /* renamed from: g, reason: collision with root package name */
    private static final InterfaceC4182k f5258g = AbstractC4172a.a(a.f5264a, b.f5265a);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3543m0 f5259a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3543m0 f5260b;

    /* renamed from: c, reason: collision with root package name */
    private C6533i f5261c;

    /* renamed from: d, reason: collision with root package name */
    private long f5262d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3551q0 f5263e;

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5264a = new a();

        a() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(InterfaceC4184m interfaceC4184m, f0 f0Var) {
            return AbstractC3689v.o(Float.valueOf(f0Var.d()), Boolean.valueOf(f0Var.f() == w.q.Vertical));
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f5265a = new b();

        b() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f0 invoke(List list) {
            Object obj = list.get(1);
            AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.Boolean");
            w.q qVar = ((Boolean) obj).booleanValue() ? w.q.Vertical : w.q.Horizontal;
            Object obj2 = list.get(0);
            AbstractC6492s.g(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new f0(qVar, ((Float) obj2).floatValue());
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC4182k a() {
            return f0.f5258g;
        }

        private c() {
        }
    }

    public f0(w.q qVar, float f10) {
        this.f5259a = C0.a(f10);
        this.f5260b = C0.a(0.0f);
        this.f5261c = C6533i.f52340e.a();
        this.f5262d = L0.S.f11103b.a();
        this.f5263e = o1.h(qVar, o1.p());
    }

    private final void g(float f10) {
        this.f5260b.k(f10);
    }

    public final void b(float f10, float f11, int i10) {
        float fD = d();
        float f12 = i10;
        float f13 = fD + f12;
        h(d() + ((f11 <= f13 && (f10 >= fD || f11 - f10 <= f12)) ? (f10 >= fD || f11 - f10 > f12) ? 0.0f : f10 - fD : f11 - f13));
    }

    public final float c() {
        return this.f5260b.c();
    }

    public final float d() {
        return this.f5259a.c();
    }

    public final int e(long j10) {
        return L0.S.n(j10) != L0.S.n(this.f5262d) ? L0.S.n(j10) : L0.S.i(j10) != L0.S.i(this.f5262d) ? L0.S.i(j10) : L0.S.l(j10);
    }

    public final w.q f() {
        return (w.q) this.f5263e.getValue();
    }

    public final void h(float f10) {
        this.f5259a.k(f10);
    }

    public final void i(long j10) {
        this.f5262d = j10;
    }

    public final void j(w.q qVar, C6533i c6533i, int i10, int i11) {
        float f10 = i11 - i10;
        g(f10);
        if (c6533i.k() != this.f5261c.k() || c6533i.n() != this.f5261c.n()) {
            boolean z10 = qVar == w.q.Vertical;
            b(z10 ? c6533i.n() : c6533i.k(), z10 ? c6533i.e() : c6533i.l(), i10);
            this.f5261c = c6533i;
        }
        h(AbstractC7978m.j(d(), 0.0f, f10));
    }

    public /* synthetic */ f0(w.q qVar, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(qVar, (i10 & 2) != 0 ? 0.0f : f10);
    }
}
