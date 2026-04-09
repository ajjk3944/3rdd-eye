package D8;

import Cc.InterfaceC2557a;
import D8.j;
import Li.N;
import Sd.d;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.y;
import Zg.AbstractC3689v;
import ae.InterfaceC3790b;
import af.C3806O;
import af.C3807P;
import android.content.Context;
import com.ubnt.usurvey.R;
import com.ui.wifiman.model.ubiquiti.cloud.sso.UiSSOAccountManager;
import com.ui.wifiman.model.ubiquiti.cloud.sso.b;
import com.ui.wifiman.model.ubiquiti.console.e;
import e8.EnumC5428a;
import ef.AbstractC5459a;
import ef.AbstractC5460b;
import ef.AbstractC5461c;
import gg.AbstractC5912b;
import gg.D;
import gg.EnumC5911a;
import gg.z;
import h9.C5969a;
import i8.InterfaceC6084a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import jd.C6292a;
import jd.InterfaceC6293b;
import kg.InterfaceC6465b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.AbstractC6561f;
import l9.C6556a;
import org.kodein.di.DI;
import rj.InterfaceC7810x2;
import s9.d;
import sa.AbstractC7930a;
import ye.AbstractC8661g;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class e extends AbstractC5461c {

    /* renamed from: g, reason: collision with root package name */
    private final DI f2961g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f2962h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f2963i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f2964j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f2965k;

    /* renamed from: l, reason: collision with root package name */
    private final Yg.m f2966l;

    /* renamed from: m, reason: collision with root package name */
    private final Yg.m f2967m;

    /* renamed from: n, reason: collision with root package name */
    private final gg.i f2968n;

    /* renamed from: o, reason: collision with root package name */
    private final gg.i f2969o;

    /* renamed from: p, reason: collision with root package name */
    private final gg.i f2970p;

    /* renamed from: q, reason: collision with root package name */
    private final N f2971q;

    /* renamed from: r, reason: collision with root package name */
    private final N f2972r;

    /* renamed from: t, reason: collision with root package name */
    static final /* synthetic */ th.l[] f2959t = {O.h(new F(e.class, "ssAccountService", "getSsAccountService()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;", 0)), O.h(new F(e.class, "localConsoleService", "getLocalConsoleService()Lcom/ui/wifiman/model/ubiquiti/console/local/UnifiLocalConsoleService;", 0)), O.h(new F(e.class, "unifiNetworkDeeplinkResolver", "getUnifiNetworkDeeplinkResolver()Lcom/ui/wifiman/model/ubiquiti/unifi/network/app/UnifiNetworkDeeplinkResolver;", 0)), O.h(new F(e.class, "topologyService", "getTopologyService()Lcom/ui/wifiman/model/network/topology/NetworkTopologyService;", 0)), O.h(new F(e.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new F(e.class, "wifiSpeedFactorsCardOperator", "getWifiSpeedFactorsCardOperator()Lcom/ubnt/usurvey/ui/speed/SpeedTabSpeedFactorsCardOperator$Wifi;", 0))};

    /* renamed from: s, reason: collision with root package name */
    public static final a f2958s = new a(null);

    /* renamed from: u, reason: collision with root package name */
    public static final int f2960u = 8;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2973a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f2974b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f2975c;

        static {
            int[] iArr = new int[S8.c.values().length];
            try {
                iArr[S8.c.GHZ_2_4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[S8.c.GHZ_5.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[S8.c.GHZ_6.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f2973a = iArr;
            int[] iArr2 = new int[C3806O.b.a.values().length];
            try {
                iArr2[C3806O.b.a.BAND.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[C3806O.b.a.CHANNEL_WIDTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[C3806O.b.a.STANDARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[C3806O.b.a.CHANNEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[C3806O.b.a.SIGNAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[C3806O.b.a.UTILIZATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[C3806O.b.a.TX_RETRIES.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[C3806O.b.a.MIMO.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[C3806O.b.a.PROVIDER.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            f2974b = iArr2;
            int[] iArr3 = new int[W7.e.values().length];
            try {
                iArr3[W7.e.EXCELLENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[W7.e.GOOD.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[W7.e.FAIR.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[W7.e.POOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            f2975c = iArr3;
        }
    }

    static final class c implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f2977a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(C6556a c6556a) {
                InterfaceC2557a interfaceC2557aB;
                AbstractC6492s.i(c6556a, "<destruct>");
                C6292a.b bVar = (C6292a.b) c6556a.a();
                return new C6556a((bVar == null || (interfaceC2557aB = bVar.b()) == null) ? null : interfaceC2557aB.k());
            }
        }

        static final class b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final b f2978a = new b();

            b() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(Wc.b bVar) {
                AbstractC6492s.i(bVar, "<destruct>");
                return new C6556a((List) bVar.a());
            }
        }

        /* renamed from: D8.e$c$c, reason: collision with other inner class name */
        static final class C0146c implements InterfaceC6465b {

            /* renamed from: a, reason: collision with root package name */
            public static final C0146c f2979a = new C0146c();

            C0146c() {
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

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            gg.i iVarV;
            AbstractC6492s.i(c6556a, "<destruct>");
            Td.a aVar = (Td.a) c6556a.a();
            return (aVar == null || (iVarV = gg.i.v(e.this.B0().c().N0(a.f2977a).W(), aVar.a().N0(b.f2978a), C0146c.f2979a)) == null) ? gg.i.K0(new C6556a(null)) : iVarV;
        }
    }

    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f2980a = new d();

        d() {
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

    /* renamed from: D8.e$e, reason: collision with other inner class name */
    static final class C0147e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0147e f2981a = new C0147e();

        C0147e() {
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

    static final class f implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f2983a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(InterfaceC3790b.a it) {
                AbstractC6492s.i(it, "it");
                return new C6556a(it);
            }
        }

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(y yVar) {
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
            InterfaceC3790b interfaceC3790bC0 = e.this.C0();
            Object objB = c6556a.b();
            AbstractC6492s.f(objB);
            UUID uuidG = ((b.a) objB).g();
            Object objB2 = c6556a2.b();
            AbstractC6492s.f(objB2);
            String strN = ((e.b) objB2).n();
            Object objB3 = c6556a3.b();
            AbstractC6492s.f(objB3);
            z zVarA = interfaceC3790bC0.a(uuidG, strN, (C5969a) objB3).A(a.f2983a);
            AbstractC6492s.f(zVarA);
            return zVarA;
        }
    }

    static final class g implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3806O.b f2984a;

        g(C3806O.b bVar) {
            this.f2984a = bVar;
        }

        public final CharSequence a(Context it, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(it, "it");
            interfaceC3540l.U(539216256);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(539216256, i10, -1, "com.ubnt.usurvey.ui.speed.SpeedFactorExplanationVM.getWifiIssueModel.<anonymous> (SpeedFactorExplanationVM.kt:95)");
            }
            String str = String.format(H0.f.a(R.string.speed_factors_explanation_wifi_standard_legacy_format, interfaceC3540l, 6), Arrays.copyOf(new Object[]{AbstractC7930a.b(this.f2984a.c(), interfaceC3540l, 0)}, 1));
            AbstractC6492s.h(str, "format(...)");
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return str;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    static final class h implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f2985a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ S8.c f2986b;

        h(boolean z10, S8.c cVar) {
            this.f2985a = z10;
            this.f2986b = cVar;
        }

        public final CharSequence a(Context it, InterfaceC3540l interfaceC3540l, int i10) {
            String str;
            AbstractC6492s.i(it, "it");
            interfaceC3540l.U(-1283971007);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1283971007, i10, -1, "com.ubnt.usurvey.ui.speed.SpeedFactorExplanationVM.getWifiIssueModel.<anonymous> (SpeedFactorExplanationVM.kt:99)");
            }
            if (this.f2985a) {
                interfaceC3540l.U(2114761953);
                str = String.format(H0.f.a(R.string.speed_factors_explanation_wifi_channel_deeplink_format, interfaceC3540l, 6), Arrays.copyOf(new Object[]{AbstractC7930a.b(Ne.h.c(this.f2986b), interfaceC3540l, 0)}, 1));
                AbstractC6492s.h(str, "format(...)");
                interfaceC3540l.J();
            } else {
                interfaceC3540l.U(2114996778);
                str = String.format(H0.f.a(R.string.speed_factors_explanation_wifi_channel_format, interfaceC3540l, 6), Arrays.copyOf(new Object[]{AbstractC7930a.b(Ne.h.c(this.f2986b), interfaceC3540l, 0)}, 1));
                AbstractC6492s.h(str, "format(...)");
                interfaceC3540l.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return str;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    static final class i implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final i f2987a = new i();

        i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(C6556a it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(!(it.b() == null));
        }
    }

    static final class j implements kg.h {
        j() {
        }

        @Override // kg.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ci.c a(AbstractC5460b topic, S8.c band, C6556a c6556a, Boolean isApDeeplinkAvailable) {
            AbstractC6492s.i(topic, "topic");
            AbstractC6492s.i(band, "band");
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(isApDeeplinkAvailable, "isApDeeplinkAvailable");
            return e.this.x0(topic, band, (C3807P) c6556a.a(), isApDeeplinkAvailable.booleanValue());
        }
    }

    static final class k implements kg.n {
        k() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(InterfaceC3790b.a deepLink) {
            AbstractC6492s.i(deepLink, "deepLink");
            if (deepLink instanceof InterfaceC3790b.a.C1003b) {
                return e.this.D0().a(InterfaceC6084a.b.n.f48939a, new InterfaceC6084a.b.AbstractC6087e.C1831a(((InterfaceC3790b.a.C1003b) deepLink).a()));
            }
            if (deepLink instanceof InterfaceC3790b.a.C1002a) {
                return e.this.D0().a(InterfaceC6084a.b.n.f48939a, new InterfaceC6084a.b.C(EnumC5428a.NETWORK.getPackageName()));
            }
            if (deepLink instanceof InterfaceC3790b.a.c) {
                return e.this.D0().a(InterfaceC6084a.b.n.f48939a, new InterfaceC6084a.b.m(EnumC5428a.NETWORK.getPackageName()));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final class l implements gg.k {
        public l() {
        }

        @Override // gg.k
        public final void a(gg.j it) {
            AbstractC6492s.i(it, "it");
            try {
                it.h(e.this.o0());
            } catch (Throwable th2) {
                it.onError(th2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class m extends org.kodein.type.o<UiSSOAccountManager> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class n extends org.kodein.type.o<Sd.d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class o extends org.kodein.type.o<InterfaceC3790b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class p extends org.kodein.type.o<InterfaceC6293b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class q extends org.kodein.type.o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class r extends org.kodein.type.o<j.b> {
    }

    static final class s implements kg.n {
        s() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s9.d apply(AbstractC5460b it) {
            AbstractC6492s.i(it, "it");
            return e.this.A0(it);
        }
    }

    public e(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f2961g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new m().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, UiSSOAccountManager.class), null);
        th.l[] lVarArr = f2959t;
        this.f2962h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new n().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f2963i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, Sd.d.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new o().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f2964j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, InterfaceC3790b.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new p().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f2965k = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE4, InterfaceC6293b.class), null).a(this, lVarArr[3]);
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new q().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f2966l = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE5, InterfaceC6084a.class), null).a(this, lVarArr[4]);
        DI di3 = getDi();
        org.kodein.type.i iVarE6 = org.kodein.type.s.e(new r().getSuperType());
        AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f2967m = org.kodein.di.d.a(di3, new org.kodein.type.d(iVarE6, j.b.class), null).a(this, lVarArr[5]);
        gg.i iVarI2 = gg.i.N(new l(), EnumC5911a.LATEST).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f2968n = iVarI2;
        gg.i iVarW = y0().b().I1(new c()).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f2969o = iVarW;
        Ag.c cVar = Ag.c.f753a;
        gg.i iVarW2 = z0().e().N0(d.f2980a).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        gg.i iVarW3 = y0().c().N0(C0147e.f2981a).W();
        AbstractC6492s.h(iVarW3, "distinctUntilChanged(...)");
        gg.i iVarI22 = cVar.b(iVarW2, iVarW3, iVarW).N1(new f()).z1(new C6556a(null)).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f2970p = iVarI22;
        gg.i iVarW4 = iVarI2.N0(new s()).W();
        AbstractC6492s.h(iVarW4, "distinctUntilChanged(...)");
        this.f2971q = AbstractC8661g.d0(this, iVarW4, new d.c(""), false, null, 6, null);
        gg.i iVarW5 = gg.i.t(iVarI2, F0().c(), F0().b(), iVarI22.N0(i.f2987a).W(), new j()).W();
        AbstractC6492s.h(iVarW5, "distinctUntilChanged(...)");
        this.f2972r = AbstractC8661g.d0(this, iVarW5, Ci.a.a(), false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s9.d A0(AbstractC5460b abstractC5460b) {
        if (abstractC5460b instanceof AbstractC5460b.AbstractC1746b.C1747b) {
            return new d.b(R.string.speed_factors_explanation_wifi_overall_title);
        }
        if (abstractC5460b instanceof AbstractC5460b.AbstractC1746b.d) {
            return new d.b(R.string.speed_factors_item_spectrum_title);
        }
        if (abstractC5460b instanceof AbstractC5460b.AbstractC1746b.c) {
            return new d.b(R.string.speed_factors_item_radio_potential_title);
        }
        if (abstractC5460b instanceof AbstractC5460b.AbstractC1746b.a) {
            return new d.b(R.string.speed_factors_item_channel_health_title);
        }
        if (abstractC5460b instanceof AbstractC5460b.a.C1745a) {
            return new d.b(R.string.speed_factors_item_cellular_signal);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6293b B0() {
        return (InterfaceC6293b) this.f2965k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC3790b C0() {
        return (InterfaceC3790b) this.f2964j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a D0() {
        return (InterfaceC6084a) this.f2966l.getValue();
    }

    private final AbstractC5459a.C1744a E0(C3806O.b bVar, S8.c cVar, boolean z10) {
        s9.d bVar2;
        s9.d aVar;
        if (bVar.a() != null) {
            W7.e eVarA = bVar.a();
            AbstractC6492s.f(eVarA);
            if (eVarA.compareTo(W7.e.GOOD) < 0) {
                String strName = bVar.b().name();
                W7.e eVarA2 = bVar.a();
                if (eVarA2 == null) {
                    eVarA2 = W7.e.POOR;
                }
                W7.e eVar = eVarA2;
                C3806O.b.a aVarB = bVar.b();
                s9.d dVarC = bVar.c();
                switch (b.f2974b[bVar.b().ordinal()]) {
                    case 1:
                        int i10 = b.f2973a[cVar.ordinal()];
                        if (i10 == 1) {
                            bVar2 = new d.b(R.string.speed_factors_explanation_wifi_band_2ghz);
                            aVar = bVar2;
                            return new AbstractC5459a.C1744a(strName, aVarB, eVar, dVarC, aVar);
                        }
                        if (i10 == 2 || i10 == 3) {
                            return null;
                        }
                        throw new NoWhenBranchMatchedException();
                    case 2:
                        int i11 = b.f2973a[cVar.ordinal()];
                        if (i11 == 1) {
                            return null;
                        }
                        if (i11 == 2) {
                            bVar2 = z10 ? new d.b(R.string.speed_factors_explanation_wifi_channel_width_5ghz_deeplink) : new d.b(R.string.speed_factors_explanation_wifi_channel_width_5ghz);
                        } else {
                            if (i11 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar2 = z10 ? new d.b(R.string.speed_factors_explanation_wifi_channel_width_6ghz_deeplink) : new d.b(R.string.speed_factors_explanation_wifi_channel_width_6ghz);
                        }
                        aVar = bVar2;
                        return new AbstractC5459a.C1744a(strName, aVarB, eVar, dVarC, aVar);
                    case 3:
                        aVar = new d.a(String.valueOf(bVar.c()), new g(bVar));
                        return new AbstractC5459a.C1744a(strName, aVarB, eVar, dVarC, aVar);
                    case 4:
                        bVar2 = new d.a("channelDeeplink" + cVar, new h(z10, cVar));
                        aVar = bVar2;
                        return new AbstractC5459a.C1744a(strName, aVarB, eVar, dVarC, aVar);
                    case 5:
                        bVar2 = new d.b(R.string.speed_factors_explanation_wifi_signal);
                        aVar = bVar2;
                        return new AbstractC5459a.C1744a(strName, aVarB, eVar, dVarC, aVar);
                    case 6:
                        bVar2 = new d.b(R.string.speed_factors_explanation_wifi_utilization);
                        aVar = bVar2;
                        return new AbstractC5459a.C1744a(strName, aVarB, eVar, dVarC, aVar);
                    case 7:
                        bVar2 = new d.b(R.string.speed_factors_explanation_wifi_tx_retries);
                        aVar = bVar2;
                        return new AbstractC5459a.C1744a(strName, aVarB, eVar, dVarC, aVar);
                    case 8:
                    case 9:
                        return null;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }
        return null;
    }

    private final j.b F0() {
        return (j.b) this.f2967m.getValue();
    }

    private final AbstractC5459a w0() {
        return new AbstractC5459a.b("cellularChannelValue", new d.b(R.string.speed_factors_item_cellular_signal_explanation));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ci.c x0(AbstractC5460b abstractC5460b, S8.c cVar, C3807P c3807p, boolean z10) {
        d.b bVar;
        C3806O c3806oE;
        List listD;
        C3806O c3806oD;
        List listD2;
        C3806O c3806oB;
        List listD3;
        List listC = AbstractC3689v.c();
        if (c3807p != null && (c3806oB = c3807p.b()) != null && (listD3 = c3806oB.d()) != null) {
            if (!(abstractC5460b instanceof AbstractC5460b.AbstractC1746b.d)) {
                listD3 = null;
            }
            if (listD3 != null) {
                Iterator it = listD3.iterator();
                while (it.hasNext()) {
                    AbstractC5459a.C1744a c1744aE0 = E0((C3806O.b) it.next(), cVar, z10);
                    if (c1744aE0 != null) {
                        listC.add(c1744aE0);
                    }
                }
            }
        }
        if (c3807p != null && (c3806oD = c3807p.d()) != null && (listD2 = c3806oD.d()) != null) {
            if (!(abstractC5460b instanceof AbstractC5460b.AbstractC1746b.c)) {
                listD2 = null;
            }
            if (listD2 != null) {
                Iterator it2 = listD2.iterator();
                while (it2.hasNext()) {
                    AbstractC5459a.C1744a c1744aE02 = E0((C3806O.b) it2.next(), cVar, z10);
                    if (c1744aE02 != null) {
                        listC.add(c1744aE02);
                    }
                }
            }
        }
        if (c3807p != null && (c3806oE = c3807p.e()) != null && (listD = c3806oE.d()) != null) {
            if (!(abstractC5460b instanceof AbstractC5460b.AbstractC1746b.a)) {
                listD = null;
            }
            if (listD != null) {
                Iterator it3 = listD.iterator();
                while (it3.hasNext()) {
                    AbstractC5459a.C1744a c1744aE03 = E0((C3806O.b) it3.next(), cVar, z10);
                    if (c1744aE03 != null) {
                        listC.add(c1744aE03);
                    }
                }
            }
        }
        List listA = AbstractC3689v.a(listC);
        if (AbstractC6492s.d(abstractC5460b, AbstractC5460b.a.C1745a.f46389b)) {
            return Ci.a.h(AbstractC3689v.e(w0()));
        }
        if (!listA.isEmpty()) {
            return Ci.a.h(listA);
        }
        W7.e eVarC = c3807p != null ? c3807p.c() : null;
        int i10 = eVarC == null ? -1 : b.f2975c[eVarC.ordinal()];
        if (i10 == -1 || i10 == 1 || i10 == 2) {
            bVar = new d.b(R.string.speed_factors_explanation_wifi_overall_all_good);
        } else {
            if (i10 != 3 && i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = new d.b(R.string.speed_factors_explanation_wifi_overall_issues);
        }
        return Ci.a.h(AbstractC3689v.e(new AbstractC5459a.b("overall", bVar)));
    }

    private final Sd.d y0() {
        return (Sd.d) this.f2963i.getValue();
    }

    private final UiSSOAccountManager z0() {
        return (UiSSOAccountManager) this.f2962h.getValue();
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f2961g;
    }

    @Override // ef.AbstractC5461c
    public N getTitle() {
        return this.f2971q;
    }

    @Override // ef.AbstractC5461c
    public N n0() {
        return this.f2972r;
    }

    @Override // ef.AbstractC5461c
    public void p0(String id2) {
        AbstractC6492s.i(id2, "id");
        C8658d c8658d = C8658d.f66727a;
        z zVarO0 = this.f2970p.o0();
        AbstractC6492s.h(zVarO0, "firstOrError(...)");
        AbstractC5912b abstractC5912bK = AbstractC6561f.f(zVarO0).k(new k());
        AbstractC6492s.h(abstractC5912bK, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bK, this);
    }
}
