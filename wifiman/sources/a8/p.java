package A8;

import Li.N;
import P7.c;
import Zg.AbstractC3689v;
import com.ubnt.usurvey.R;
import gg.AbstractC5912b;
import gg.EnumC5911a;
import i8.InterfaceC6084a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import od.C7119a;
import od.InterfaceC7120b;
import org.kodein.di.DI;
import rj.InterfaceC7810x2;
import s9.d;
import ye.AbstractC8661g;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class p extends Ve.b {

    /* renamed from: m, reason: collision with root package name */
    static final /* synthetic */ th.l[] f494m = {O.h(new F(p.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new F(p.class, "analytics", "getAnalytics()Lcom/ubnt/usurvey/analytics/Analytics;", 0)), O.h(new F(p.class, "floorplanRecordManager", "getFloorplanRecordManager()Lcom/ui/wifiman/model/signalmapper/floorplan/FloorplanRecordManager;", 0))};

    /* renamed from: n, reason: collision with root package name */
    public static final int f495n = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f496g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f497h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f498i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f499j;

    /* renamed from: k, reason: collision with root package name */
    private final gg.i f500k;

    /* renamed from: l, reason: collision with root package name */
    private final N f501l;

    static final class a implements kg.n {
        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Ve.a it) {
            AbstractC6492s.i(it, "it");
            return p.this.t0().a(it.a());
        }
    }

    public static final class b implements gg.k {
        public b() {
        }

        @Override // gg.k
        public final void a(gg.j it) {
            AbstractC6492s.i(it, "it");
            try {
                it.h(p.this.n0());
            } catch (Throwable th2) {
                it.onError(th2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends org.kodein.type.o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends org.kodein.type.o<P7.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends org.kodein.type.o<InterfaceC7120b> {
    }

    static final class f implements kg.n {
        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Ve.a it) {
            AbstractC6492s.i(it, "it");
            return p.this.t0().e(it.a());
        }
    }

    static final class g implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f505a = new g();

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            C7119a c7119a = (C7119a) c6556a.a();
            return new C6556a(c7119a != null ? c7119a.b() : null);
        }
    }

    static final class h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f506a = new h();

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            String str = (String) c6556a.a();
            return new C6556a(str != null ? new d.b(R.string.floorplan_remove_subtitle_format, AbstractC3689v.e(str)) : null);
        }
    }

    public p(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f496g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new c().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, InterfaceC6084a.class), null);
        th.l[] lVarArr = f494m;
        this.f497h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new d().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f498i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, P7.a.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new e().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f499j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, InterfaceC7120b.class), null).a(this, lVarArr[2]);
        gg.i iVarI2 = gg.i.N(new b(), EnumC5911a.LATEST).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f500k = iVarI2;
        gg.i iVarN0 = iVarI2.I1(new f()).N0(g.f505a).N0(h.f506a);
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f501l = AbstractC8661g.h0(this, iVarN0, null, null, 2, null);
    }

    private final P7.a s0() {
        return (P7.a) this.f498i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC7120b t0() {
        return (InterfaceC7120b) this.f499j.getValue();
    }

    private final InterfaceC6084a u0() {
        return (InterfaceC6084a) this.f497h.getValue();
    }

    @Override // org.kodein.di.c
    public DI d() {
        return this.f496g;
    }

    @Override // Ve.b
    public N o0() {
        return this.f501l;
    }

    @Override // Ve.b
    public void p0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bG = this.f500k.o0().t(new a()).g(s0().d(new c.g.a())).g(u0().a(InterfaceC6084a.b.n.f48939a));
        AbstractC6492s.h(abstractC5912bG, "andThen(...)");
        c8658d.d(abstractC5912bG, this);
    }
}
