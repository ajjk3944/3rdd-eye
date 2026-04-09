package n8;

import Cc.InterfaceC2557a;
import Cd.j;
import Ee.C2706g;
import Je.a;
import Je.b;
import Ke.m;
import Li.N;
import Rc.a;
import Yg.y;
import Zg.AbstractC3689v;
import ae.InterfaceC3790b;
import androidx.lifecycle.InterfaceC4017o;
import com.ui.wifiman.model.speedtest.Speedtest;
import com.ui.wifiman.model.ubiquiti.cloud.sso.UiSSOAccountManager;
import com.ui.wifiman.model.ubiquiti.cloud.sso.b;
import com.ui.wifiman.model.ubiquiti.console.e;
import e8.EnumC5428a;
import gg.AbstractC5912b;
import gg.EnumC5911a;
import gg.z;
import h9.C5969a;
import i8.InterfaceC6084a;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import mh.InterfaceC6824a;
import org.kodein.di.DI;
import qd.InterfaceC7451a;
import rj.InterfaceC7810x2;
import xa.InterfaceC8439a;
import ye.AbstractC8661g;
import ye.C8658d;

/* renamed from: n8.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6909j extends Je.c {

    /* renamed from: v, reason: collision with root package name */
    static final /* synthetic */ th.l[] f54441v = {O.h(new F(C6909j.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new F(C6909j.class, "ssAccountService", "getSsAccountService()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;", 0)), O.h(new F(C6909j.class, "localConsoleService", "getLocalConsoleService()Lcom/ui/wifiman/model/ubiquiti/console/local/UnifiLocalConsoleService;", 0)), O.h(new F(C6909j.class, "unifiNetworkDeeplinkResolver", "getUnifiNetworkDeeplinkResolver()Lcom/ui/wifiman/model/ubiquiti/unifi/network/app/UnifiNetworkDeeplinkResolver;", 0)), O.g(new D(C6909j.class, "inForegroundStream", "<v#0>", 0))};

    /* renamed from: w, reason: collision with root package name */
    public static final int f54442w = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f54443g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f54444h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f54445i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f54446j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f54447k;

    /* renamed from: l, reason: collision with root package name */
    private final gg.i f54448l;

    /* renamed from: m, reason: collision with root package name */
    private InterfaceC6904e f54449m;

    /* renamed from: n, reason: collision with root package name */
    private final gg.i f54450n;

    /* renamed from: o, reason: collision with root package name */
    private final N f54451o;

    /* renamed from: p, reason: collision with root package name */
    private final N f54452p;

    /* renamed from: q, reason: collision with root package name */
    private final N f54453q;

    /* renamed from: r, reason: collision with root package name */
    private final N f54454r;

    /* renamed from: s, reason: collision with root package name */
    private final N f54455s;

    /* renamed from: t, reason: collision with root package name */
    private final gg.i f54456t;

    /* renamed from: u, reason: collision with root package name */
    private final gg.i f54457u;

    /* renamed from: n8.j$a */
    static final class a implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f54458a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(InterfaceC6904e it) {
            AbstractC6492s.i(it, "it");
            return it.h();
        }
    }

    /* renamed from: n8.j$b */
    static final class b implements kg.n {
        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6904e apply(Je.b params) {
            AbstractC6492s.i(params, "params");
            if (params instanceof b.C0408b) {
                return new C6905f(C6909j.this.getDi(), ((b.C0408b) params).a());
            }
            if (params instanceof b.c) {
                return new C6905f(C6909j.this.getDi(), ((b.c) params).a());
            }
            if (params instanceof b.d) {
                return new C6907h(C6909j.this.getDi());
            }
            if (params instanceof b.a) {
                return new C6906g(C6909j.this.getDi());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: n8.j$c */
    static final class c implements InterfaceC6469f {
        c() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6904e it) {
            AbstractC6492s.i(it, "it");
            C6909j.this.f54449m = it;
            it.d(C6909j.this.j0());
        }
    }

    /* renamed from: n8.j$d */
    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f54461a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(InterfaceC6904e it) {
            AbstractC6492s.i(it, "it");
            return it.g();
        }
    }

    /* renamed from: n8.j$e */
    static final class e implements kg.n {

        /* renamed from: n8.j$e$a */
        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f54463a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(InterfaceC6904e it) {
                AbstractC6492s.i(it, "it");
                return it.a();
            }
        }

        /* renamed from: n8.j$e$b */
        static final class b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final b f54464a = new b();

            b() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(C6556a c6556a) {
                AbstractC6492s.i(c6556a, "<destruct>");
                InterfaceC2557a interfaceC2557a = (InterfaceC2557a) c6556a.a();
                return new C6556a(interfaceC2557a != null ? interfaceC2557a.k() : null);
            }
        }

        /* renamed from: n8.j$e$c */
        static final class c implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final c f54465a = new c();

            c() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(Wc.b bVar) {
                AbstractC6492s.i(bVar, "<destruct>");
                return new C6556a((List) bVar.a());
            }
        }

        /* renamed from: n8.j$e$d */
        static final class d implements InterfaceC6465b {

            /* renamed from: a, reason: collision with root package name */
            public static final d f54466a = new d();

            d() {
            }

            @Override // kg.InterfaceC6465b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(C6556a c6556a, C6556a c6556a2) {
                Vd.a aVar;
                Object next;
                AbstractC6492s.i(c6556a, "<destruct>");
                AbstractC6492s.i(c6556a2, "<destruct>");
                Set set = (Set) c6556a.a();
                List list = (List) c6556a2.a();
                C5969a c5969aA = null;
                if (set != null) {
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            Vd.a aVar2 = (Vd.a) next;
                            if (aVar2.a() != null && AbstractC3689v.f0(set, aVar2.a())) {
                                break;
                            }
                        }
                        aVar = (Vd.a) next;
                    } else {
                        aVar = null;
                    }
                    if (aVar != null) {
                        c5969aA = aVar.a();
                    }
                }
                return new C6556a(c5969aA);
            }
        }

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            gg.i iVarV;
            AbstractC6492s.i(c6556a, "<destruct>");
            Td.a aVar = (Td.a) c6556a.a();
            return (aVar == null || (iVarV = gg.i.v(C6909j.this.f54450n.I1(a.f54463a).N0(b.f54464a).W(), aVar.a().N0(c.f54465a), d.f54466a)) == null) ? gg.i.K0(new C6556a(null)) : iVarV;
        }
    }

    /* renamed from: n8.j$f */
    static final class f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f54467a = new f();

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(InterfaceC6904e it) {
            AbstractC6492s.i(it, "it");
            return it.a();
        }
    }

    /* renamed from: n8.j$g */
    static final class g implements kg.n {
        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(C6556a c6556a) {
            C5969a c5969aL;
            AbstractC5912b abstractC5912bA;
            AbstractC6492s.i(c6556a, "<destruct>");
            InterfaceC2557a interfaceC2557a = (InterfaceC2557a) c6556a.a();
            return (interfaceC2557a == null || (c5969aL = interfaceC2557a.l()) == null || (abstractC5912bA = C6909j.this.L0().a(new InterfaceC6084a.b.C6090h(new Je.m(c5969aL)))) == null) ? AbstractC5912b.m() : abstractC5912bA;
        }
    }

    /* renamed from: n8.j$h */
    static final class h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f54469a = new h();

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(InterfaceC6904e it) {
            AbstractC6492s.i(it, "it");
            return it.a();
        }
    }

    /* renamed from: n8.j$i */
    static final class i implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final i f54470a = new i();

        /* renamed from: n8.j$i$a */
        public static final class a implements gg.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2557a f54471a;

            public a(InterfaceC2557a interfaceC2557a) {
                this.f54471a = interfaceC2557a;
            }

            @Override // gg.q
            public final void a(gg.o oVar) {
                InterfaceC8439a.d dVarF;
                try {
                    InterfaceC2557a interfaceC2557a = this.f54471a;
                    EnumC5428a enumC5428aA = (interfaceC2557a == null || (dVarF = interfaceC2557a.f()) == null) ? null : Ld.d.a(dVarF);
                    if (enumC5428aA != null) {
                        oVar.onSuccess(enumC5428aA);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            gg.n nVarC = gg.n.c(new a((InterfaceC2557a) c6556a.a()));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    /* renamed from: n8.j$j, reason: collision with other inner class name */
    static final class C1983j implements kg.n {

        /* renamed from: n8.j$j$a */
        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C6909j f54473a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ EnumC5428a f54474b;

            a(C6909j c6909j, EnumC5428a enumC5428a) {
                this.f54473a = c6909j;
                this.f54474b = enumC5428a;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(C6556a c6556a) {
                AbstractC6492s.i(c6556a, "<destruct>");
                InterfaceC3790b.a aVar = (InterfaceC3790b.a) c6556a.a();
                if (aVar instanceof InterfaceC3790b.a.C1003b) {
                    return this.f54473a.L0().a(new InterfaceC6084a.b.AbstractC6087e.C1831a(((InterfaceC3790b.a.C1003b) aVar).a()));
                }
                if ((aVar instanceof InterfaceC3790b.a.c) || (aVar instanceof InterfaceC3790b.a.C1002a) || aVar == null) {
                    return this.f54473a.L0().a(new InterfaceC6084a.b.m(this.f54474b.getPackageName()));
                }
                throw new NoWhenBranchMatchedException();
            }
        }

        /* renamed from: n8.j$j$b */
        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f54475a;

            static {
                int[] iArr = new int[EnumC5428a.values().length];
                try {
                    iArr[EnumC5428a.NETWORK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f54475a = iArr;
            }
        }

        C1983j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(EnumC5428a managerApp) {
            AbstractC6492s.i(managerApp, "managerApp");
            return b.f54475a[managerApp.ordinal()] == 1 ? C6909j.this.f54457u.o0().t(new a(C6909j.this, managerApp)) : C6909j.this.L0().a(new InterfaceC6084a.b.m(managerApp.getPackageName()));
        }
    }

    /* renamed from: n8.j$k */
    static final class k implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final k f54476a = new k();

        k() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(InterfaceC6904e it) {
            AbstractC6492s.i(it, "it");
            return it.i();
        }
    }

    /* renamed from: n8.j$l */
    static final class l implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final l f54477a = new l();

        l() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(InterfaceC6904e it) {
            AbstractC6492s.i(it, "it");
            return it.a();
        }
    }

    /* renamed from: n8.j$m */
    static final class m implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final m f54478a = new m();

        /* renamed from: n8.j$m$a */
        public static final class a implements gg.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2557a f54479a;

            public a(InterfaceC2557a interfaceC2557a) {
                this.f54479a = interfaceC2557a;
            }

            @Override // gg.q
            public final void a(gg.o oVar) {
                Dc.j jVarJ;
                a.C0703a c0703aK;
                Dc.j jVarJ2;
                Dc.j jVarJ3;
                try {
                    InterfaceC2557a interfaceC2557a = this.f54479a;
                    Object c2063a = null;
                    if (((interfaceC2557a == null || (jVarJ3 = interfaceC2557a.j()) == null) ? null : jVarJ3.J()) != null) {
                        inet.ipaddr.g gVarN = this.f54479a.n();
                        if (gVarN == null) {
                            gVarN = this.f54479a.i();
                        }
                        if (gVarN != null) {
                            c2063a = new j.c(gVarN);
                        }
                    } else {
                        InterfaceC2557a interfaceC2557a2 = this.f54479a;
                        if (((interfaceC2557a2 == null || (jVarJ2 = interfaceC2557a2.j()) == null) ? null : jVarJ2.K()) != null && (jVarJ = this.f54479a.j()) != null && (c0703aK = jVarJ.K()) != null) {
                            c2063a = new InterfaceC7451a.C2063a(c0703aK.c(), c0703aK.j(), this.f54479a.getName(), this.f54479a.b());
                        }
                    }
                    if (c2063a != null) {
                        oVar.onSuccess(c2063a);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        m() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            gg.n nVarC = gg.n.c(new a((InterfaceC2557a) c6556a.a()));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    /* renamed from: n8.j$n */
    static final class n implements kg.n {
        n() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Speedtest.b params) {
            AbstractC6492s.i(params, "params");
            return params instanceof j.c ? C6909j.this.L0().a(new InterfaceC6084a.b.B.c.d((j.c) params)) : params instanceof InterfaceC7451a.C2063a ? C6909j.this.L0().a(new InterfaceC6084a.b.B.c.C1817a((InterfaceC7451a.C2063a) params)) : AbstractC5912b.m();
        }
    }

    /* renamed from: n8.j$o */
    static final class o implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final o f54481a = new o();

        o() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(InterfaceC6904e it) {
            AbstractC6492s.i(it, "it");
            return it.b();
        }
    }

    /* renamed from: n8.j$p */
    public static final class p implements gg.k {
        public p() {
        }

        @Override // gg.k
        public final void a(gg.j it) {
            AbstractC6492s.i(it, "it");
            try {
                it.h(C6909j.this.p0());
            } catch (Throwable th2) {
                it.onError(th2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: n8.j$q */
    public static final class q extends org.kodein.type.o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: n8.j$r */
    public static final class r extends org.kodein.type.o<UiSSOAccountManager> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: n8.j$s */
    public static final class s extends org.kodein.type.o<Sd.d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: n8.j$t */
    public static final class t extends org.kodein.type.o<InterfaceC3790b> {
    }

    /* renamed from: n8.j$u */
    static final class u implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final u f54483a = new u();

        u() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(InterfaceC6904e it) {
            AbstractC6492s.i(it, "it");
            return it.j();
        }
    }

    /* renamed from: n8.j$v */
    static final class v implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final v f54484a = new v();

        v() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(InterfaceC6904e it) {
            AbstractC6492s.i(it, "it");
            return it.f();
        }
    }

    /* renamed from: n8.j$w */
    static final class w implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final w f54485a = new w();

        w() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(InterfaceC6904e it) {
            AbstractC6492s.i(it, "it");
            return it.c();
        }
    }

    /* renamed from: n8.j$x */
    static final class x implements kg.n {

        /* renamed from: n8.j$x$a */
        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f54487a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(C6556a c6556a) {
                AbstractC6492s.i(c6556a, "<destruct>");
                com.ui.wifiman.model.ubiquiti.cloud.sso.b bVar = (com.ui.wifiman.model.ubiquiti.cloud.sso.b) c6556a.a();
                UUID uuidE = bVar != null ? bVar.e() : null;
                return new C6556a(uuidE != null ? b.a.a(uuidE) : null);
            }
        }

        /* renamed from: n8.j$x$b */
        static final class b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final b f54488a = new b();

            b() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(C6556a c6556a) {
                AbstractC6492s.i(c6556a, "<destruct>");
                Td.a aVar = (Td.a) c6556a.a();
                String strD = aVar != null ? aVar.d() : null;
                return new C6556a(strD != null ? e.b.a(strD) : null);
            }
        }

        /* renamed from: n8.j$x$c */
        static final class c implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C6909j f54489a;

            /* renamed from: n8.j$x$c$a */
            static final class a implements kg.n {

                /* renamed from: a, reason: collision with root package name */
                public static final a f54490a = new a();

                a() {
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C6556a apply(InterfaceC3790b.a it) {
                    AbstractC6492s.i(it, "it");
                    return new C6556a(it);
                }
            }

            c(C6909j c6909j) {
                this.f54489a = c6909j;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.D apply(y yVar) {
                AbstractC6492s.i(yVar, "<destruct>");
                Object objA = yVar.a();
                AbstractC6492s.h(objA, "component1(...)");
                C6556a c6556a = (C6556a) objA;
                Object objC = yVar.c();
                AbstractC6492s.h(objC, "component2(...)");
                C6556a c6556a2 = (C6556a) objC;
                C6556a c6556a3 = (C6556a) yVar.d();
                if (c6556a.b() == null || c6556a2.b() == null || c6556a3.b() == null) {
                    z zVarZ = z.z(new C6556a(null));
                    AbstractC6492s.f(zVarZ);
                    return zVarZ;
                }
                InterfaceC3790b interfaceC3790bK0 = this.f54489a.K0();
                Object objB = c6556a.b();
                AbstractC6492s.f(objB);
                UUID uuidG = ((b.a) objB).g();
                Object objB2 = c6556a2.b();
                AbstractC6492s.f(objB2);
                String strN = ((e.b) objB2).n();
                Object objB3 = c6556a3.b();
                AbstractC6492s.f(objB3);
                z zVarA = interfaceC3790bK0.a(uuidG, strN, (C5969a) objB3).A(a.f54490a);
                AbstractC6492s.f(zVarA);
                return zVarA;
            }
        }

        x() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Je.b topic) {
            AbstractC6492s.i(topic, "topic");
            Ag.c cVar = Ag.c.f753a;
            gg.i iVarW = C6909j.this.J0().e().N0(a.f54487a).W();
            AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
            gg.i iVarW2 = C6909j.this.I0().b().N0(b.f54488a).W();
            AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
            return cVar.b(iVarW, iVarW2, C6909j.this.f54456t).N1(new c(C6909j.this));
        }
    }

    public C6909j(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f54443g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new q().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, InterfaceC6084a.class), null);
        th.l[] lVarArr = f54441v;
        this.f54444h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new r().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f54445i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, UiSSOAccountManager.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new s().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f54446j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, Sd.d.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new t().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f54447k = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE4, InterfaceC3790b.class), null).a(this, lVarArr[3]);
        gg.i iVarI2 = gg.i.N(new p(), EnumC5911a.LATEST).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f54448l = iVarI2;
        gg.i iVarI22 = iVarI2.N0(new b()).f0(new c()).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f54450n = iVarI22;
        gg.i iVarI1 = iVarI22.I1(d.f54461a);
        AbstractC6492s.h(iVarI1, "switchMap(...)");
        this.f54451o = AbstractC8661g.d0(this, iVarI1, a.c.f10006a, false, null, 6, null);
        gg.i iVarI12 = iVarI22.I1(v.f54484a);
        AbstractC6492s.h(iVarI12, "switchMap(...)");
        this.f54452p = AbstractC8661g.d0(this, iVarI12, Boolean.FALSE, false, null, 6, null);
        gg.i iVarI13 = iVarI22.I1(w.f54485a);
        AbstractC6492s.h(iVarI13, "switchMap(...)");
        this.f54453q = AbstractC8661g.h0(this, iVarI13, null, null, 2, null);
        gg.i iVarI14 = iVarI22.I1(a.f54458a);
        AbstractC6492s.h(iVarI14, "switchMap(...)");
        this.f54454r = AbstractC8661g.d0(this, iVarI14, new C2706g(AbstractC3689v.l()), false, null, 6, null);
        gg.i iVarI15 = iVarI22.I1(o.f54481a);
        AbstractC6492s.h(iVarI15, "switchMap(...)");
        this.f54455s = AbstractC8661g.d0(this, iVarI15, m.b.f10729a, false, null, 6, null);
        gg.i iVarW = I0().b().I1(new e()).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f54456t = iVarW;
        gg.i iVarI23 = iVarI2.o0().w(new x()).o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f54457u = iVarI23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Sd.d I0() {
        return (Sd.d) this.f54446j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UiSSOAccountManager J0() {
        return (UiSSOAccountManager) this.f54445i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC3790b K0() {
        return (InterfaceC3790b) this.f54447k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a L0() {
        return (InterfaceC6084a) this.f54444h.getValue();
    }

    private final void M0() {
        C8658d c8658d = C8658d.f66727a;
        c8658d.e(O0(C8658d.c(c8658d, this, null, new InterfaceC6824a() { // from class: n8.i
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return C6909j.N0(this.f54440a);
            }
        }, 1, null)), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.i N0(C6909j c6909j) {
        gg.i iVarC0 = c6909j.f54450n.L1(u.f54483a).c0();
        AbstractC6492s.h(iVarC0, "toFlowable(...)");
        return iVarC0;
    }

    private static final gg.i O0(C8658d.a aVar) {
        return aVar.c(null, f54441v[4]);
    }

    @Override // Je.c
    public N c() {
        return this.f54453q;
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f54443g;
    }

    @Override // ye.AbstractC8661g
    public void l0() {
        M0();
    }

    @Override // Je.c
    public N n0() {
        return this.f54454r;
    }

    @Override // Je.c
    public N o0() {
        return this.f54451o;
    }

    @Override // ye.AbstractC8661g, androidx.lifecycle.InterfaceC4007e
    public void p(InterfaceC4017o owner) {
        AbstractC6492s.i(owner, "owner");
        InterfaceC6904e interfaceC6904e = this.f54449m;
        if (interfaceC6904e != null) {
            interfaceC6904e.e(j0());
        }
        super.p(owner);
    }

    @Override // Je.c
    public N q0() {
        return this.f54455s;
    }

    @Override // Je.c
    public N r0() {
        return this.f54452p;
    }

    @Override // Je.c
    public void s0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bT = this.f54450n.I1(f.f54467a).o0().t(new g());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }

    @Override // Je.c
    public void t0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bK = this.f54450n.I1(h.f54469a).o0().u(i.f54470a).k(new C1983j());
        AbstractC6492s.h(abstractC5912bK, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bK, this);
    }

    @Override // Je.c
    public void u0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bT = this.f54450n.o0().t(k.f54476a);
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }

    @Override // Je.c
    public void v0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bK = this.f54450n.I1(l.f54477a).o0().u(m.f54478a).k(new n());
        AbstractC6492s.h(abstractC5912bK, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bK, this);
    }

    @Override // Je.c
    public void w0(C5969a bssid) {
        AbstractC6492s.i(bssid, "bssid");
        C8658d.f66727a.d(L0().a(new InterfaceC6084a.b.K(new xf.d(bssid))), this);
    }
}
