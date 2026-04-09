package A8;

import Ii.AbstractC3063k;
import Li.N;
import P7.c;
import Qe.c;
import Te.W;
import Yg.J;
import android.content.Context;
import com.ubnt.usurvey.R;
import com.ubnt.usurvey.ui.signal.floorplan.WifimanFloorplanViewControllerManager;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import gg.AbstractC5912b;
import gg.EnumC5911a;
import i8.InterfaceC6084a;
import java.io.File;
import kg.InterfaceC6465b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.AbstractC6561f;
import l9.C6556a;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import od.C7119a;
import od.InterfaceC7120b;
import org.kodein.di.DI;
import rj.InterfaceC7733m2;
import rj.InterfaceC7810x2;
import s9.d;
import ye.AbstractC8661g;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class f extends We.c {

    /* renamed from: p, reason: collision with root package name */
    static final /* synthetic */ th.l[] f384p = {O.h(new F(f.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new F(f.class, "analytics", "getAnalytics()Lcom/ubnt/usurvey/analytics/Analytics;", 0)), O.h(new F(f.class, "floorplanRecordManager", "getFloorplanRecordManager()Lcom/ui/wifiman/model/signalmapper/floorplan/FloorplanRecordManager;", 0)), O.h(new F(f.class, "floorplanViewControllerManager", "getFloorplanViewControllerManager()Lcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;", 0)), O.g(new kotlin.jvm.internal.D(f.class, "stream", "<v#0>", 0))};

    /* renamed from: q, reason: collision with root package name */
    public static final int f385q = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f386g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f387h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f388i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f389j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f390k;

    /* renamed from: l, reason: collision with root package name */
    private final gg.i f391l;

    /* renamed from: m, reason: collision with root package name */
    private final gg.i f392m;

    /* renamed from: n, reason: collision with root package name */
    private final gg.i f393n;

    /* renamed from: o, reason: collision with root package name */
    private final N f394o;

    static final class a implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f395a = new a();

        a() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final We.b apply(C7119a record, Ue.g controller) {
            AbstractC6492s.i(record, "record");
            AbstractC6492s.i(controller, "controller");
            String strC = record.c();
            s9.d cVar = strC != null ? new d.c(strC) : new d.b(R.string.wifi);
            W wC = Ue.r.f22430a.c();
            String strB = record.b();
            if (strB == null) {
                strB = "";
            }
            return new We.b(controller, wC, new d.c(strB), cVar);
        }
    }

    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f396a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(We.b it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(it);
        }
    }

    static final class c implements kg.n {
        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.D apply(We.a it) {
            AbstractC6492s.i(it, "it");
            return f.this.z0().c(it.a());
        }
    }

    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f398a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(z it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(new C2411c(it));
        }
    }

    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f399a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            if (!(error instanceof WifimanFloorplanViewControllerManager.Error)) {
                return gg.i.k0(error);
            }
            Z7.b.e("Failed to load controller", error, null, 4, null);
            return gg.i.K0(new C6556a(null));
        }
    }

    /* renamed from: A8.f$f, reason: collision with other inner class name */
    static final class C0011f implements kg.p {

        /* renamed from: a, reason: collision with root package name */
        public static final C0011f f400a = new C0011f();

        C0011f() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(C6556a it) {
            AbstractC6492s.i(it, "it");
            return it.b() == null;
        }
    }

    static final class g implements kg.n {
        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(C6556a it) {
            AbstractC6492s.i(it, "it");
            return f.this.A0().a(new InterfaceC6084a.b.C6085c(c.a.SIGNAL));
        }
    }

    static final class h implements kg.n {
        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(We.a it) {
            AbstractC6492s.i(it, "it");
            return f.this.A0().a(new InterfaceC6084a.b.AbstractC6093k.C1835a(it.a()));
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f403a;

        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends org.kodein.type.o<Context> {
        }

        i(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return f.this.new i(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objG = AbstractC5467b.g();
            int i10 = this.f403a;
            if (i10 == 0) {
                Yg.v.b(obj);
                C2412d c2412d = C2412d.f374a;
                long jA = f.this.o0().a();
                InterfaceC7733m2 interfaceC7733m2G = org.kodein.di.d.f(f.this.getDi()).g();
                org.kodein.type.i iVarE = org.kodein.type.s.e(new a().getSuperType());
                AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
                Context context = (Context) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, Context.class), null);
                WifimanFloorplanViewControllerManager wifimanFloorplanViewControllerManagerZ0 = f.this.z0();
                this.f403a = 1;
                obj = c2412d.b(jA, context, wifimanFloorplanViewControllerManagerZ0, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                    return J.f24997a;
                }
                Yg.v.b(obj);
            }
            File file = (File) obj;
            if (file != null) {
                f.this.x0().b(new c.g.C0635c());
                AbstractC5912b abstractC5912bA = f.this.A0().a(new InterfaceC6084a.b.x(file));
                this.f403a = 2;
                if (Qi.b.b(abstractC5912bA, this) == objG) {
                    return objG;
                }
            } else {
                Z7.b.e("Failed to share floorplan image", null, null, 6, null);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((i) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class j implements kg.n {
        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(We.a it) {
            AbstractC6492s.i(it, "it");
            return f.this.y0().e(it.a());
        }
    }

    public static final class k implements gg.k {
        public k() {
        }

        @Override // gg.k
        public final void a(gg.j it) {
            AbstractC6492s.i(it, "it");
            try {
                it.h(f.this.o0());
            } catch (Throwable th2) {
                it.onError(th2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class l extends org.kodein.type.o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class m extends org.kodein.type.o<P7.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class n extends org.kodein.type.o<InterfaceC7120b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class o extends org.kodein.type.o<WifimanFloorplanViewControllerManager> {
    }

    public f(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f386g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new l().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, InterfaceC6084a.class), null);
        th.l[] lVarArr = f384p;
        this.f387h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new m().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f388i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, P7.a.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new n().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f389j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, InterfaceC7120b.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new o().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f390k = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE4, WifimanFloorplanViewControllerManager.class), null).a(this, lVarArr[3]);
        gg.i iVarI2 = gg.i.N(new k(), EnumC5911a.LATEST).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f391l = iVarI2;
        gg.i iVarI22 = iVarI2.I1(new j()).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f392m = iVarI22;
        gg.i iVarI23 = iVarI2.N1(new c()).N0(d.f398a).f1(e.f399a).o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f393n = iVarI23;
        gg.i iVarN0 = gg.i.v(AbstractC6561f.e(iVarI22), AbstractC6561f.e(iVarI23), a.f395a).N0(b.f396a);
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f394o = AbstractC8661g.h0(this, iVarN0, null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a A0() {
        return (InterfaceC6084a) this.f387h.getValue();
    }

    private final void B0() {
        C8658d c8658d = C8658d.f66727a;
        c8658d.e(D0(C8658d.c(c8658d, this, null, new InterfaceC6824a() { // from class: A8.e
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return f.C0(this.f383a);
            }
        }, 1, null)), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.i C0(f fVar) {
        gg.i iVarC0 = fVar.f392m.m0(C0011f.f400a).O1(1L).t0(fVar.new g()).c0();
        AbstractC6492s.h(iVarC0, "toFlowable(...)");
        return iVarC0;
    }

    private static final gg.i D0(C8658d.a aVar) {
        return aVar.c(null, f384p[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final P7.a x0() {
        return (P7.a) this.f388i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC7120b y0() {
        return (InterfaceC7120b) this.f389j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WifimanFloorplanViewControllerManager z0() {
        return (WifimanFloorplanViewControllerManager) this.f390k.getValue();
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f386g;
    }

    @Override // ye.AbstractC8661g
    public void l0() {
        super.l0();
        B0();
    }

    @Override // We.c
    public N n0() {
        return this.f394o;
    }

    @Override // We.c
    public void p0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bT = this.f391l.o0().t(new h());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }

    @Override // We.c
    public void q0() {
        AbstractC3063k.d(androidx.lifecycle.O.a(this), null, null, new i(null), 3, null);
    }
}
