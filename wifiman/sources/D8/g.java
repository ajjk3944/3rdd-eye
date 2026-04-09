package D8;

import Cc.InterfaceC2557a;
import Zg.AbstractC3689v;
import af.AbstractC3793B;
import af.C3792A;
import b8.AbstractC4075b;
import com.ubnt.usurvey.R;
import com.ubnt.usurvey.product.m;
import com.ui.wifiman.model.network.hosts.NetworkHost;
import gg.AbstractC5912b;
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

/* loaded from: classes3.dex */
public final class g implements f {

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ th.l[] f2992e = {O.h(new F(g.class, "favoriteHostsManager", "getFavoriteHostsManager()Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager;", 0)), O.h(new F(g.class, "topologyService", "getTopologyService()Lcom/ui/wifiman/model/network/topology/NetworkTopologyService;", 0)), O.h(new F(g.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0))};

    /* renamed from: f, reason: collision with root package name */
    public static final int f2993f = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Yg.m f2994a;

    /* renamed from: b, reason: collision with root package name */
    private final Yg.m f2995b;

    /* renamed from: c, reason: collision with root package name */
    private final Yg.m f2996c;

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f2997d;

    static final class a implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f2998a = new a();

        a() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC3793B apply(List hosts, C6556a c6556a) {
            C3792A c3792a;
            InterfaceC7929a interfaceC7929aO;
            InterfaceC2557a interfaceC2557aB;
            AbstractC6492s.i(hosts, "hosts");
            AbstractC6492s.i(c6556a, "<destruct>");
            C6292a.b bVar = (C6292a.b) c6556a.a();
            List<NetworkHost> list = hosts;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            for (NetworkHost networkHost : list) {
                if (networkHost instanceof NetworkHost.b) {
                    if (bVar == null || (interfaceC2557aB = bVar.b()) == null || (interfaceC7929aO = AbstractC6912m.e(interfaceC2557aB, m.c.SMALL, Pe.a.f18599a.o())) == null) {
                        interfaceC7929aO = Pe.a.f18599a.o();
                    }
                    InterfaceC7929a interfaceC7929a = interfaceC7929aO;
                    d.b bVar2 = new d.b(R.string.network_topology_network_gateway);
                    NetworkHost.b bVar3 = (NetworkHost.b) networkHost;
                    dd.i iVarB = bVar3.b();
                    AbstractC4075b abstractC4075bD = iVarB != null ? iVarB.d() : null;
                    dd.i iVarB2 = bVar3.b();
                    c3792a = new C3792A("gateway", interfaceC7929a, bVar2, (iVarB2 != null ? iVarB2.f() : null) != null, abstractC4075bD);
                } else {
                    if (!(networkHost instanceof NetworkHost.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    NetworkHost.a aVar = (NetworkHost.a) networkHost;
                    String strA = aVar.a();
                    URI uriA = L8.e.f11263a.a(aVar.a());
                    InterfaceC7929a bVar4 = uriA != null ? new c.b(uriA, N9.b.f16117a.B(), null, null, 12, null) : N9.b.f16117a.B();
                    d.c cVar = new d.c(aVar.a());
                    AbstractC4075b abstractC4075bA = D8.b.a(aVar);
                    dd.i iVarC = aVar.c();
                    c3792a = new C3792A(strA, bVar4, cVar, (iVarC != null ? iVarC.f() : null) != null, abstractC4075bA);
                }
                arrayList.add(c3792a);
            }
            return new AbstractC3793B.a(arrayList);
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends org.kodein.type.o<NetworkHost.Manager> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends org.kodein.type.o<InterfaceC6293b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends org.kodein.type.o<InterfaceC6084a> {
    }

    public g(DI di2) {
        AbstractC6492s.i(di2, "di");
        org.kodein.type.i iVarE = org.kodein.type.s.e(new b().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE, NetworkHost.Manager.class), null);
        th.l[] lVarArr = f2992e;
        this.f2994a = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new c().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f2995b = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE2, InterfaceC6293b.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new d().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f2996c = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE3, InterfaceC6084a.class), null).a(this, lVarArr[2]);
        gg.i iVarI2 = gg.i.v(c().c(), d().d(), a.f2998a).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f2997d = iVarI2;
    }

    private final NetworkHost.Manager c() {
        return (NetworkHost.Manager) this.f2994a.getValue();
    }

    private final InterfaceC6293b d() {
        return (InterfaceC6293b) this.f2995b.getValue();
    }

    private final InterfaceC6084a e() {
        return (InterfaceC6084a) this.f2996c.getValue();
    }

    @Override // D8.f
    public AbstractC5912b a() {
        return e().a(i8.j.f48963a);
    }

    @Override // D8.f
    public gg.i b() {
        return this.f2997d;
    }
}
