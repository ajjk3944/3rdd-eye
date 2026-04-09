package D8;

import Li.N;
import cf.AbstractC4251a;
import com.ui.wifiman.model.network.hosts.NetworkHost;
import gg.AbstractC5912b;
import i8.InterfaceC6084a;
import inet.ipaddr.AddressStringException;
import inet.ipaddr.HostNameException;
import inet.ipaddr.IncompatibleAddressException;
import inet.ipaddr.f;
import inet.ipaddr.o;
import java.util.Locale;
import kg.InterfaceC6469f;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import org.kodein.di.DI;
import rj.InterfaceC7810x2;
import ye.AbstractC8661g;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class c extends AbstractC4251a {

    /* renamed from: g, reason: collision with root package name */
    private final DI f2921g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f2922h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f2923i;

    /* renamed from: j, reason: collision with root package name */
    private final Fg.a f2924j;

    /* renamed from: k, reason: collision with root package name */
    private final gg.i f2925k;

    /* renamed from: l, reason: collision with root package name */
    private final N f2926l;

    /* renamed from: n, reason: collision with root package name */
    static final /* synthetic */ th.l[] f2919n = {O.h(new F(c.class, "favoriteHostsManager", "getFavoriteHostsManager()Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager;", 0)), O.h(new F(c.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0))};

    /* renamed from: m, reason: collision with root package name */
    public static final a f2918m = new a(null);

    /* renamed from: o, reason: collision with root package name */
    public static final int f2920o = 8;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b implements kg.n {
        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String apply(String it) {
            AbstractC6492s.i(it, "it");
            return c.this.u0(it);
        }
    }

    /* renamed from: D8.c$c, reason: collision with other inner class name */
    static final class C0144c implements kg.n {

        /* renamed from: D8.c$c$a */
        static final class a implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            public static final a f2929a = new a();

            a() {
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(Throwable it) {
                AbstractC6492s.i(it, "it");
                Z7.b.e("Failed to add network host", it, null, 4, null);
            }
        }

        C0144c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(String host) {
            AbstractC6492s.i(host, "host");
            return c.this.y0(host) ? AbstractC5912b.p(c.this.v0().a(host).z(a.f2929a).M(), c.this.w0().a(InterfaceC6084a.b.n.f48939a)) : AbstractC5912b.m();
        }
    }

    static final class d implements kg.n {
        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(String it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(c.this.y0(it));
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends org.kodein.type.o<NetworkHost.Manager> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends org.kodein.type.o<InterfaceC6084a> {
    }

    public c(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f2921g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new e().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, NetworkHost.Manager.class), null);
        th.l[] lVarArr = f2919n;
        this.f2922h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new f().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f2923i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, InterfaceC6084a.class), null).a(this, lVarArr[1]);
        Fg.a aVarK2 = Fg.a.k2("");
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f2924j = aVarK2;
        gg.i iVarI2 = aVarK2.e1().Y0(Gg.a.a(), false, 1).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f2925k = iVarI2;
        gg.i iVarN0 = iVarI2.N0(new d());
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f2926l = AbstractC8661g.d0(this, iVarN0, Boolean.FALSE, false, null, 6, null);
    }

    private final boolean A0(String str) {
        try {
            new inet.ipaddr.n(str, new o.a().k(false).q(false).l(true).m(true).n(false).r(true).o(false).s(false).v()).p();
            return true;
        } catch (AddressStringException e10) {
            Z7.b.h("NetworkHosts: invalid ip `" + str + "`: " + e10.getMessage(), null, 2, null);
            return false;
        } catch (IncompatibleAddressException e11) {
            Z7.b.h("NetworkHosts: invalid ip `" + str + "`: " + e11.getMessage(), null, 2, null);
            return false;
        }
    }

    private final void B0(String str) {
        j0().i("host", str);
        this.f2924j.h(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String u0(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC6492s.h(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NetworkHost.Manager v0() {
        return (NetworkHost.Manager) this.f2922h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a w0() {
        return (InterfaceC6084a) this.f2923i.getValue();
    }

    private final String x0() {
        String str = (String) j0().d("host");
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y0(String str) {
        return z0(str) || A0(str);
    }

    private final boolean z0(String str) {
        try {
            new inet.ipaddr.e(str, new f.a().j(false).k(false).l(false).n()).B();
            return true;
        } catch (HostNameException e10) {
            Z7.b.h("NetworkHosts: invalid host `" + str + "`: " + e10.getMessage(), null, 2, null);
            return false;
        }
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f2921g;
    }

    @Override // ye.AbstractC8661g
    public void l0() {
        super.l0();
        this.f2924j.h(x0());
    }

    @Override // cf.AbstractC4251a
    public N n0() {
        return this.f2926l;
    }

    @Override // cf.AbstractC4251a
    public void o0(String host) {
        AbstractC6492s.i(host, "host");
        B0(host);
    }

    @Override // cf.AbstractC4251a
    public void p0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bT = this.f2925k.o0().A(new b()).t(new C0144c());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }
}
