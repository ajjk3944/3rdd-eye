package w8;

import Li.N;
import Sd.d;
import Zg.d0;
import com.ui.wifiman.model.ubiquiti.console.e;
import java.util.Set;
import kg.InterfaceC6465b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import org.kodein.di.DI;
import rj.InterfaceC7810x2;
import ye.AbstractC8661g;

/* loaded from: classes3.dex */
public final class u extends com.ui.wifiman.ui.settings.preferences.l {

    /* renamed from: l, reason: collision with root package name */
    static final /* synthetic */ th.l[] f64638l = {O.h(new F(u.class, "localConsoleService", "getLocalConsoleService()Lcom/ui/wifiman/model/ubiquiti/console/local/UnifiLocalConsoleService;", 0)), O.h(new F(u.class, "localConsoleCertManager", "getLocalConsoleCertManager()Lcom/ui/wifiman/model/ubiquiti/console/local/UnifiLocalConsoleCertificateManager;", 0))};

    /* renamed from: m, reason: collision with root package name */
    public static final int f64639m = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f64640g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f64641h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f64642i;

    /* renamed from: j, reason: collision with root package name */
    private final gg.i f64643j;

    /* renamed from: k, reason: collision with root package name */
    private final N f64644k;

    static final class a implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f64645a = new a();

        a() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a, Boolean isTrusted) {
            inet.ipaddr.g gVarB;
            String strA;
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(isTrusted, "isTrusted");
            d.b bVar = (d.b) c6556a.a();
            String str = null;
            if (bVar != null && (gVarB = bVar.b()) != null && (strA = L8.f.a(gVarB)) != null && isTrusted.booleanValue()) {
                str = strA;
            }
            return new C6556a(str);
        }
    }

    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f64646a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a) {
            com.ui.wifiman.model.ubiquiti.console.e eVarA;
            AbstractC6492s.i(c6556a, "<destruct>");
            d.b bVar = (d.b) c6556a.a();
            String strF = (bVar == null || (eVarA = bVar.a()) == null) ? null : eVarA.f();
            return new C6556a(strF != null ? e.b.a(strF) : null);
        }
    }

    static final class c implements kg.n {
        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            e.b bVar = (e.b) c6556a.a();
            String strN = bVar != null ? bVar.n() : null;
            return strN == null ? gg.i.K0(d0.e()) : u.this.p0().b(strN);
        }
    }

    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f64648a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Set it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(!it.isEmpty());
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends org.kodein.type.o<Sd.d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends org.kodein.type.o<Sd.a> {
    }

    public u(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f64640g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new e().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, Sd.d.class), null);
        th.l[] lVarArr = f64638l;
        this.f64641h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new f().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f64642i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, Sd.a.class), null).a(this, lVarArr[1]);
        gg.i iVarN0 = q0().c().N0(b.f64646a).I1(new c()).N0(d.f64648a);
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f64643j = iVarN0;
        gg.i iVarV = gg.i.v(q0().c(), iVarN0, a.f64645a);
        AbstractC6492s.h(iVarV, "combineLatest(...)");
        this.f64644k = AbstractC8661g.h0(this, iVarV, null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Sd.a p0() {
        return (Sd.a) this.f64642i.getValue();
    }

    private final Sd.d q0() {
        return (Sd.d) this.f64641h.getValue();
    }

    @Override // org.kodein.di.c
    public DI d() {
        return this.f64640g;
    }

    @Override // com.ui.wifiman.ui.settings.preferences.l
    public N n0() {
        return this.f64644k;
    }
}
