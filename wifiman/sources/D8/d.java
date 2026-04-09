package D8;

import Cc.InterfaceC2557a;
import Li.N;
import Zg.AbstractC3689v;
import bf.AbstractC4107k;
import bf.C4101e;
import bf.EnumC4106j;
import com.ubnt.usurvey.R;
import com.ubnt.usurvey.product.m;
import com.ui.wifiman.model.network.hosts.NetworkHost;
import ec.AbstractC5452a;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import hc.C5973a;
import hc.InterfaceC5974b;
import i8.InterfaceC6084a;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import jd.C6292a;
import jd.InterfaceC6293b;
import kg.InterfaceC6465b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import n8.AbstractC6912m;
import org.kodein.di.DI;
import rj.InterfaceC7810x2;
import s9.InterfaceC7929a;
import s9.c;
import s9.d;
import ye.AbstractC8661g;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class d extends AbstractC4107k {

    /* renamed from: q, reason: collision with root package name */
    static final /* synthetic */ th.l[] f2931q = {O.h(new F(d.class, "favoriteHostsManager", "getFavoriteHostsManager()Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager;", 0)), O.h(new F(d.class, "topologyService", "getTopologyService()Lcom/ui/wifiman/model/network/topology/NetworkTopologyService;", 0)), O.h(new F(d.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new F(d.class, "toastService", "getToastService()Lcom/ui/wifiman/domain/toast/ToastService;", 0))};

    /* renamed from: r, reason: collision with root package name */
    public static final int f2932r = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f2933g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f2934h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f2935i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f2936j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f2937k;

    /* renamed from: l, reason: collision with root package name */
    private final Fg.a f2938l;

    /* renamed from: m, reason: collision with root package name */
    private final gg.i f2939m;

    /* renamed from: n, reason: collision with root package name */
    private final s9.b f2940n;

    /* renamed from: o, reason: collision with root package name */
    private final N f2941o;

    /* renamed from: p, reason: collision with root package name */
    private final N f2942p;

    static final class a implements InterfaceC6465b {
        a() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(List hosts, C6556a c6556a) {
            C4101e c4101e;
            inet.ipaddr.g gVarG;
            InterfaceC7929a interfaceC7929aE;
            inet.ipaddr.g gVarG2;
            InterfaceC2557a interfaceC2557aB;
            AbstractC6492s.i(hosts, "hosts");
            AbstractC6492s.i(c6556a, "<destruct>");
            C6292a.b bVar = (C6292a.b) c6556a.a();
            List<NetworkHost> list = hosts;
            d dVar = d.this;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            for (NetworkHost networkHost : list) {
                d.c cVar = null;
                cVar = null;
                if (networkHost instanceof NetworkHost.b) {
                    NetworkHost.b bVar2 = (NetworkHost.b) networkHost;
                    String strValueOf = String.valueOf(bVar2.a());
                    if (bVar == null || (interfaceC2557aB = bVar.b()) == null || (interfaceC7929aE = AbstractC6912m.e(interfaceC2557aB, m.c.SMALL, dVar.f2940n)) == null) {
                        interfaceC7929aE = dVar.f2940n;
                    }
                    InterfaceC7929a interfaceC7929a = interfaceC7929aE;
                    d.b bVar3 = new d.b(R.string.network_topology_network_gateway);
                    dd.i iVarB = bVar2.b();
                    d.c cVar2 = (iVarB == null || (gVarG2 = iVarB.g()) == null) ? null : new d.c(L8.f.a(gVarG2));
                    dd.i iVarB2 = bVar2.b();
                    c4101e = new C4101e(strValueOf, interfaceC7929a, bVar3, cVar2, true, iVarB2 != null ? iVarB2.d() : null, false);
                } else {
                    if (!(networkHost instanceof NetworkHost.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    NetworkHost.a aVar = (NetworkHost.a) networkHost;
                    String strValueOf2 = String.valueOf(aVar.b());
                    URI uriA = L8.e.f11263a.a(aVar.a());
                    InterfaceC7929a bVar4 = uriA != null ? new c.b(uriA, dVar.f2940n, null, null, 12, null) : dVar.f2940n;
                    d.c cVar3 = new d.c(aVar.a());
                    dd.i iVarC = aVar.c();
                    if (iVarC != null && (gVarG = iVarC.g()) != null) {
                        String strA0 = gVarG.a0();
                        AbstractC6492s.h(strA0, "toNormalizedString(...)");
                        cVar = new d.c(strA0);
                    }
                    c4101e = new C4101e(strValueOf2, bVar4, cVar3, cVar, aVar.c() != null, D8.b.a(aVar), true);
                }
                arrayList.add(c4101e);
            }
            return arrayList;
        }
    }

    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f2944a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC4107k.a apply(List it) {
            AbstractC6492s.i(it, "it");
            return new AbstractC4107k.a(it);
        }
    }

    static final class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f2945a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EnumC4106j apply(Boolean it) {
            AbstractC6492s.i(it, "it");
            return it.booleanValue() ? EnumC4106j.EDIT : EnumC4106j.DEFAULT;
        }
    }

    /* renamed from: D8.d$d, reason: collision with other inner class name */
    public static final class C0145d implements gg.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2946a;

        public C0145d(String str) {
            this.f2946a = str;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                Long lS = kotlin.text.t.s(this.f2946a);
                if (lS != null) {
                    oVar.onSuccess(lS);
                } else {
                    oVar.a();
                }
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    static final class e implements kg.n {
        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Long hostId) {
            AbstractC6492s.i(hostId, "hostId");
            return d.this.x0().d(hostId.longValue());
        }
    }

    static final class f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2948a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f2949b;

        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f2950a;

            public a(d dVar) {
                this.f2950a = dVar;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    this.f2950a.y0().a(new C5973a(new AbstractC5452a.C1741a(R.string.error_unexpected_try_again, new Object[0]), false, 2, null));
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        f(String str, d dVar) {
            this.f2948a = str;
            this.f2949b = dVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            if (!(error instanceof NetworkHost.Manager.Error)) {
                return AbstractC5912b.D(error);
            }
            Z7.b.e("Failed to delete host " + this.f2948a, error, null, 4, null);
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(this.f2949b));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }
    }

    public static final class g implements InterfaceC5915e {
        public g() {
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                d.this.f2938l.h(Boolean.FALSE);
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    public static final class h implements InterfaceC5915e {
        public h() {
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                d.this.f2938l.h(Boolean.TRUE);
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    public static final class i implements gg.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2953a;

        public i(String str) {
            this.f2953a = str;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                Long lS = kotlin.text.t.s(this.f2953a);
                if (lS != null) {
                    oVar.onSuccess(lS);
                    return;
                }
                throw new IllegalStateException("host id failed must always by a number " + this.f2953a);
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    static final class j implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f2955b;

        j(int i10) {
            this.f2955b = i10;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Long hostId) {
            AbstractC6492s.i(hostId, "hostId");
            return d.this.x0().b(hostId.longValue(), this.f2955b);
        }
    }

    static final class k implements kg.n {

        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f2957a;

            public a(d dVar) {
                this.f2957a = dVar;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    this.f2957a.y0().a(new C5973a(new AbstractC5452a.C1741a(R.string.error_unexpected_try_again, new Object[0]), false, 2, null));
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        k() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            if (!(error instanceof NetworkHost.Manager.Error)) {
                return AbstractC5912b.D(error);
            }
            Z7.b.e("Failed to reorder hosts", error, null, 4, null);
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(d.this));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class l extends org.kodein.type.o<NetworkHost.Manager> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class m extends org.kodein.type.o<InterfaceC6293b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class n extends org.kodein.type.o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class o extends org.kodein.type.o<InterfaceC5974b> {
    }

    public d(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f2933g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new l().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, NetworkHost.Manager.class), null);
        th.l[] lVarArr = f2931q;
        this.f2934h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new m().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f2935i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, InterfaceC6293b.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new n().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f2936j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, InterfaceC6084a.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new o().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f2937k = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE4, InterfaceC5974b.class), null).a(this, lVarArr[3]);
        Fg.a aVarK2 = Fg.a.k2(Boolean.FALSE);
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f2938l = aVarK2;
        gg.i iVarI2 = aVarK2.e1().Y0(Gg.a.a(), false, 1).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f2939m = iVarI2;
        this.f2940n = N9.b.f16117a.B();
        gg.i iVarW = gg.i.v(x0().c(), z0().d(), new a()).N0(b.f2944a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f2941o = AbstractC8661g.d0(this, iVarW, new AbstractC4107k.a(AbstractC3689v.l()), false, null, 6, null);
        gg.i iVarW2 = iVarI2.N0(c.f2945a).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f2942p = AbstractC8661g.d0(this, iVarW2, EnumC4106j.DEFAULT, false, null, 6, null);
    }

    private final InterfaceC6084a A0() {
        return (InterfaceC6084a) this.f2936j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NetworkHost.Manager x0() {
        return (NetworkHost.Manager) this.f2934h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC5974b y0() {
        return (InterfaceC5974b) this.f2937k.getValue();
    }

    private final InterfaceC6293b z0() {
        return (InterfaceC6293b) this.f2935i.getValue();
    }

    @Override // bf.AbstractC4107k
    public N C() {
        return this.f2942p;
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f2933g;
    }

    @Override // bf.AbstractC4107k
    public N n0() {
        return this.f2941o;
    }

    @Override // bf.AbstractC4107k
    public void o0() {
        C8658d.f66727a.d(A0().a(i8.i.f48962a), this);
    }

    @Override // bf.AbstractC4107k
    public void p0(String id2) {
        AbstractC6492s.i(id2, "id");
        C8658d c8658d = C8658d.f66727a;
        gg.n nVarC = gg.n.c(new C0145d(id2));
        AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bO = nVarC.k(new e()).O(new f(id2, this));
        AbstractC6492s.h(abstractC5912bO, "onErrorResumeNext(...)");
        c8658d.d(abstractC5912bO, this);
    }

    @Override // bf.AbstractC4107k
    public void q0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new g());
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        c8658d.d(abstractC5912bR, this);
    }

    @Override // bf.AbstractC4107k
    public void r0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new h());
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        c8658d.d(abstractC5912bR, this);
    }

    @Override // bf.AbstractC4107k
    public void s0(String id2, int i10) {
        AbstractC6492s.i(id2, "id");
        C8658d c8658d = C8658d.f66727a;
        gg.n nVarC = gg.n.c(new i(id2));
        AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bO = nVarC.k(new j(i10)).O(new k());
        AbstractC6492s.h(abstractC5912bO, "onErrorResumeNext(...)");
        c8658d.d(abstractC5912bO, this);
    }
}
