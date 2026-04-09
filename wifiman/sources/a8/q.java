package A8;

import Ii.AbstractC3063k;
import Li.N;
import P7.c;
import Qe.c;
import Yg.J;
import android.content.Context;
import com.ubnt.usurvey.R;
import com.ubnt.usurvey.ui.signal.floorplan.WifimanFloorplanViewControllerManager;
import dh.InterfaceC5380e;
import ec.AbstractC5452a;
import eh.AbstractC5467b;
import gg.AbstractC5912b;
import gg.EnumC5911a;
import i8.InterfaceC6084a;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import mh.InterfaceC6839p;
import od.C7119a;
import od.InterfaceC7120b;
import org.kodein.di.DI;
import rj.InterfaceC7733m2;
import rj.InterfaceC7810x2;
import ye.AbstractC8661g;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class q extends Xe.b {

    /* renamed from: g, reason: collision with root package name */
    private final DI f510g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f511h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f512i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f513j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f514k;

    /* renamed from: l, reason: collision with root package name */
    private final gg.i f515l;

    /* renamed from: m, reason: collision with root package name */
    private final gg.i f516m;

    /* renamed from: n, reason: collision with root package name */
    private final Fg.a f517n;

    /* renamed from: o, reason: collision with root package name */
    private final gg.i f518o;

    /* renamed from: p, reason: collision with root package name */
    private final N f519p;

    /* renamed from: q, reason: collision with root package name */
    private final N f520q;

    /* renamed from: s, reason: collision with root package name */
    static final /* synthetic */ th.l[] f508s = {O.h(new F(q.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new F(q.class, "analytics", "getAnalytics()Lcom/ubnt/usurvey/analytics/Analytics;", 0)), O.h(new F(q.class, "floorplanRecordManager", "getFloorplanRecordManager()Lcom/ui/wifiman/model/signalmapper/floorplan/FloorplanRecordManager;", 0)), O.h(new F(q.class, "floorplanViewControllerManager", "getFloorplanViewControllerManager()Lcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;", 0))};

    /* renamed from: r, reason: collision with root package name */
    public static final a f507r = new a(null);

    /* renamed from: t, reason: collision with root package name */
    public static final int f509t = 8;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f521a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            C7119a c7119a = (C7119a) c6556a.a();
            return new C6556a(c7119a != null ? new AbstractC5452a.C1741a(R.string.floorplan_name_format_default, Long.valueOf(c7119a.a() + 1)) : null);
        }
    }

    static final class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f522a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(Xe.a it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(Long.valueOf(it.a()));
        }
    }

    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f523a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC5452a abstractC5452a = (AbstractC5452a) c6556a.a();
            return new C6556a(abstractC5452a != null ? L8.i.a(abstractC5452a) : null);
        }
    }

    static final class e implements kg.n {

        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends org.kodein.type.o<Context> {
        }

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Yg.s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            Xe.a aVar = (Xe.a) sVar.a();
            C6556a c6556a = (C6556a) sVar.c();
            InterfaceC7120b interfaceC7120bB0 = q.this.B0();
            long jA = aVar.a();
            String strD0 = q.this.D0();
            String string = null;
            if (kotlin.text.t.m0(strD0)) {
                strD0 = null;
            }
            if (strD0 == null) {
                AbstractC5452a abstractC5452a = (AbstractC5452a) c6556a.b();
                if (abstractC5452a != null) {
                    InterfaceC7733m2 interfaceC7733m2G = org.kodein.di.d.f(q.this.getDi()).g();
                    org.kodein.type.i iVarE = org.kodein.type.s.e(new a().getSuperType());
                    AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
                    CharSequence charSequenceA = abstractC5452a.a((Context) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, Context.class), null));
                    if (charSequenceA != null) {
                        string = charSequenceA.toString();
                    }
                }
            } else {
                string = strD0;
            }
            return interfaceC7120bB0.b(jA, string);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f525a;

        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends org.kodein.type.o<Context> {
        }

        f(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return q.this.new f(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objG = AbstractC5467b.g();
            int i10 = this.f525a;
            if (i10 == 0) {
                Yg.v.b(obj);
                C2412d c2412d = C2412d.f374a;
                long jA = q.this.p0().a();
                InterfaceC7733m2 interfaceC7733m2G = org.kodein.di.d.f(q.this.getDi()).g();
                org.kodein.type.i iVarE = org.kodein.type.s.e(new a().getSuperType());
                AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
                Context context = (Context) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, Context.class), null);
                WifimanFloorplanViewControllerManager wifimanFloorplanViewControllerManagerC0 = q.this.C0();
                this.f525a = 1;
                obj = c2412d.b(jA, context, wifimanFloorplanViewControllerManagerC0, this);
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
                q.this.A0().b(new c.g.C0635c());
                AbstractC5912b abstractC5912bA = q.this.E0().a(new InterfaceC6084a.b.x(file));
                this.f525a = 2;
                if (Qi.b.b(abstractC5912bA, this) == objG) {
                    return objG;
                }
            } else {
                Z7.b.e("Failed to share floorplan image. Failed to instantiate floorplan controller " + q.this.p0().a(), null, null, 6, null);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((f) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class g implements kg.n {
        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Xe.a it) {
            AbstractC6492s.i(it, "it");
            return q.this.B0().e(it.a());
        }
    }

    public static final class h implements gg.k {
        public h() {
        }

        @Override // gg.k
        public final void a(gg.j it) {
            AbstractC6492s.i(it, "it");
            try {
                it.h(q.this.p0());
            } catch (Throwable th2) {
                it.onError(th2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class i extends org.kodein.type.o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class j extends org.kodein.type.o<P7.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class k extends org.kodein.type.o<InterfaceC7120b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class l extends org.kodein.type.o<WifimanFloorplanViewControllerManager> {
    }

    public q(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f510g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new i().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, InterfaceC6084a.class), null);
        th.l[] lVarArr = f508s;
        this.f511h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new j().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f512i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, P7.a.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new k().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f513j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, InterfaceC7120b.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new l().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f514k = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE4, WifimanFloorplanViewControllerManager.class), null).a(this, lVarArr[3]);
        gg.i iVarI2 = gg.i.N(new h(), EnumC5911a.LATEST).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f515l = iVarI2;
        gg.i iVarI22 = iVarI2.I1(new g()).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f516m = iVarI22;
        Fg.a aVarK2 = Fg.a.k2("");
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f517n = aVarK2;
        gg.i iVarI23 = iVarI22.N0(b.f521a).o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f518o = iVarI23;
        gg.i iVarN0 = iVarI23.N0(d.f523a);
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f519p = AbstractC8661g.h0(this, iVarN0, null, null, 2, null);
        gg.i iVarN02 = iVarI2.N0(c.f522a);
        AbstractC6492s.h(iVarN02, "map(...)");
        this.f520q = AbstractC8661g.h0(this, iVarN02, null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final P7.a A0() {
        return (P7.a) this.f512i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC7120b B0() {
        return (InterfaceC7120b) this.f513j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WifimanFloorplanViewControllerManager C0() {
        return (WifimanFloorplanViewControllerManager) this.f514k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String D0() {
        String str = (String) j0().d("name");
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a E0() {
        return (InterfaceC6084a) this.f511h.getValue();
    }

    private final void F0(String str) {
        j0().i("name", str);
        this.f517n.h(str);
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f510g;
    }

    @Override // ye.AbstractC8661g
    public void l0() {
        super.l0();
        this.f517n.h(D0());
    }

    @Override // Xe.b
    public N n0() {
        return this.f520q;
    }

    @Override // Xe.b
    public N o0() {
        return this.f519p;
    }

    @Override // Xe.b
    public Object q0(long j10, InterfaceC5380e interfaceC5380e) {
        return C2412d.f374a.a(j10, C0(), interfaceC5380e);
    }

    @Override // Xe.b
    public void r0(String value) {
        AbstractC6492s.i(value, "value");
        F0(value);
    }

    @Override // Xe.b
    public void s0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bG = Ag.c.f753a.a(this.f515l, this.f518o).o0().t(new e()).g(A0().d(new c.g.b())).g(E0().a(new InterfaceC6084a.b.C6085c(c.a.SIGNAL)));
        AbstractC6492s.h(abstractC5912bG, "andThen(...)");
        c8658d.d(abstractC5912bG, this);
    }

    @Override // Xe.b
    public void t0() {
        AbstractC3063k.d(androidx.lifecycle.O.a(this), null, null, new f(null), 3, null);
    }
}
