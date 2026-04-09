package M8;

import Af.C2428c;
import Ee.C2706g;
import Li.N;
import M8.C3293d;
import M8.K;
import Zg.AbstractC3689v;
import Zg.U;
import a8.C3771a;
import ch.AbstractC4260a;
import com.ubnt.usurvey.R;
import de.C5351B;
import de.InterfaceC5352C;
import fh.InterfaceC5826a;
import gg.AbstractC5912b;
import gg.EnumC5911a;
import h9.C5969a;
import i8.InterfaceC6084a;
import ie.C6146c;
import ie.InterfaceC6147d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ke.AbstractC6456a;
import kg.InterfaceC6465b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import l9.C6556a;
import le.C6585f;
import le.C6588i;
import le.InterfaceC6586g;
import mh.InterfaceC6835l;
import ne.C6937a;
import org.kodein.di.DI;
import rj.InterfaceC7810x2;
import s9.d;
import sh.AbstractC7978m;
import ye.AbstractC8661g;
import ye.C8658d;
import zf.C8742e;
import zf.C8743f;
import zf.C8745h;
import zf.EnumC8738a;
import zf.InterfaceC8744g;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* renamed from: M8.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3293d extends com.ui.wifiman.ui.wifi.channel.c implements K {

    /* renamed from: E, reason: collision with root package name */
    static final /* synthetic */ th.l[] f12914E = {O.h(new kotlin.jvm.internal.F(C3293d.class, "wifiNetworks", "getWifiNetworks()Lcom/ui/wifiman/model/wifi/scan/WifiScannerService;", 0)), O.h(new kotlin.jvm.internal.F(C3293d.class, "deviceManager", "getDeviceManager()Lcom/ui/wifiman/model/device/WifimanDeviceManager;", 0)), O.h(new kotlin.jvm.internal.F(C3293d.class, "wifiSignalStats", "getWifiSignalStats()Lcom/ui/wifiman/model/wifi/scan/timelapse/WifiSignalTimelapse$Service;", 0)), O.h(new kotlin.jvm.internal.F(C3293d.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new kotlin.jvm.internal.F(C3293d.class, "wifiChannelEnvService", "getWifiChannelEnvService()Lcom/ui/wifiman/model/wifi/channel/WifiEnvironmentService;", 0)), O.h(new kotlin.jvm.internal.F(C3293d.class, "wifiNetworkDetailConfig", "getWifiNetworkDetailConfig()Lcom/ui/wifiman/model/ui/WifiNetworkDetailHomeConfigManager;", 0))};

    /* renamed from: F, reason: collision with root package name */
    public static final int f12915F = 8;

    /* renamed from: A, reason: collision with root package name */
    private final gg.i f12916A;

    /* renamed from: B, reason: collision with root package name */
    private final gg.i f12917B;

    /* renamed from: C, reason: collision with root package name */
    private final N f12918C;

    /* renamed from: D, reason: collision with root package name */
    private final N f12919D;

    /* renamed from: g, reason: collision with root package name */
    private final DI f12920g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f12921h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f12922i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f12923j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f12924k;

    /* renamed from: l, reason: collision with root package name */
    private final Yg.m f12925l;

    /* renamed from: m, reason: collision with root package name */
    private final Yg.m f12926m;

    /* renamed from: n, reason: collision with root package name */
    private final gg.i f12927n;

    /* renamed from: o, reason: collision with root package name */
    private final Fg.a f12928o;

    /* renamed from: p, reason: collision with root package name */
    private final gg.i f12929p;

    /* renamed from: q, reason: collision with root package name */
    private final gg.i f12930q;

    /* renamed from: r, reason: collision with root package name */
    private final gg.i f12931r;

    /* renamed from: s, reason: collision with root package name */
    private final N f12932s;

    /* renamed from: t, reason: collision with root package name */
    private final N f12933t;

    /* renamed from: u, reason: collision with root package name */
    private final gg.i f12934u;

    /* renamed from: v, reason: collision with root package name */
    private final N f12935v;

    /* renamed from: w, reason: collision with root package name */
    private final gg.i f12936w;

    /* renamed from: x, reason: collision with root package name */
    private final gg.i f12937x;

    /* renamed from: y, reason: collision with root package name */
    private final gg.i f12938y;

    /* renamed from: z, reason: collision with root package name */
    private final gg.i f12939z;

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: M8.d$A */
    public static final class A extends org.kodein.type.o<InterfaceC5352C> {
    }

    /* renamed from: M8.d$B */
    static final class B implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final B f12940a = new B();

        B() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s9.d apply(S8.e channel) {
            AbstractC6492s.i(channel, "channel");
            return new d.b(R.string.wifi_channel_format, AbstractC3689v.e(Integer.valueOf(channel.d())));
        }
    }

    /* renamed from: M8.d$a, reason: case insensitive filesystem */
    static final class C3294a implements kg.h {

        /* renamed from: a, reason: collision with root package name */
        public static final C3294a f12941a = new C3294a();

        /* renamed from: M8.d$a$a, reason: collision with other inner class name */
        public static final class C0507a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC4260a.e(((C2428c) obj).a(), ((C2428c) obj2).a());
            }
        }

        C3294a() {
        }

        @Override // kg.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2706g.a.C0194a a(S8.e channel, List accessPointsOnChannel, C3771a devices, Map signalStats) {
            AbstractC6492s.i(channel, "channel");
            AbstractC6492s.i(accessPointsOnChannel, "accessPointsOnChannel");
            AbstractC6492s.i(devices, "devices");
            AbstractC6492s.i(signalStats, "signalStats");
            List listX0 = AbstractC3689v.X0(accessPointsOnChannel, new C0507a());
            List arrayList = new ArrayList(AbstractC3689v.w(listX0, 10));
            Iterator it = listX0.iterator();
            while (it.hasNext()) {
                arrayList.add(new InterfaceC8744g.a((C2428c) it.next()));
            }
            if (arrayList.isEmpty()) {
                arrayList = AbstractC3689v.e(new InterfaceC8744g.b(new d.b(R.string.wifi_channel_detail_ap_list_empty_format, AbstractC3689v.e(Integer.valueOf(channel.d())))));
            }
            return new C2706g.a.C0194a("ap", null, null, arrayList, 6, null);
        }
    }

    /* renamed from: M8.d$b, reason: case insensitive filesystem */
    static final class C3295b implements kg.h {

        /* renamed from: a, reason: collision with root package name */
        public static final C3295b f12942a = new C3295b();

        C3295b() {
        }

        @Override // kg.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List a(List signals, C3771a devices, Map statistics, C5351B detailConfig) {
            AbstractC6492s.i(signals, "signals");
            AbstractC6492s.i(devices, "devices");
            AbstractC6492s.i(statistics, "statistics");
            AbstractC6492s.i(detailConfig, "detailConfig");
            return M8.r.s(signals, devices, statistics, detailConfig.b(), null);
        }
    }

    /* renamed from: M8.d$c */
    static final class c implements kg.h {

        /* renamed from: a, reason: collision with root package name */
        public static final c f12943a = new c();

        /* renamed from: M8.d$c$a */
        public static final class a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC4260a.e(((C2428c) obj).a(), ((C2428c) obj2).a());
            }
        }

        c() {
        }

        @Override // kg.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2706g.a.C0194a a(S8.e channel, List accessPointsOnChannel, C3771a devices, Map signalStats) {
            AbstractC6492s.i(channel, "channel");
            AbstractC6492s.i(accessPointsOnChannel, "accessPointsOnChannel");
            AbstractC6492s.i(devices, "devices");
            AbstractC6492s.i(signalStats, "signalStats");
            List listX0 = AbstractC3689v.X0(accessPointsOnChannel, new a());
            List arrayList = new ArrayList(AbstractC3689v.w(listX0, 10));
            Iterator it = listX0.iterator();
            while (it.hasNext()) {
                arrayList.add(new InterfaceC8744g.a((C2428c) it.next()));
            }
            if (arrayList.isEmpty()) {
                arrayList = AbstractC3689v.e(new InterfaceC8744g.b(new d.b(R.string.wifi_channel_detail_ap_interfere_list_empty_format, AbstractC3689v.e(Integer.valueOf(channel.d())))));
            }
            return new C2706g.a.C0194a("apInterfere", null, null, arrayList, 6, null);
        }
    }

    /* renamed from: M8.d$d, reason: collision with other inner class name */
    static final class C0508d implements kg.h {

        /* renamed from: a, reason: collision with root package name */
        public static final C0508d f12944a = new C0508d();

        C0508d() {
        }

        @Override // kg.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List a(List signals, C3771a devices, Map statistics, C5351B detailConfig) {
            AbstractC6492s.i(signals, "signals");
            AbstractC6492s.i(devices, "devices");
            AbstractC6492s.i(statistics, "statistics");
            AbstractC6492s.i(detailConfig, "detailConfig");
            return M8.r.s(signals, devices, statistics, detailConfig.b(), null);
        }
    }

    /* renamed from: M8.d$e */
    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f12945a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S8.e apply(com.ui.wifiman.ui.wifi.channel.b it) {
            AbstractC6492s.i(it, "it");
            return it.a();
        }
    }

    /* renamed from: M8.d$f */
    static final class f implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final f f12946a = new f();

        f() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(S8.e channel, List signals) {
            AbstractC6492s.i(channel, "channel");
            AbstractC6492s.i(signals, "signals");
            ArrayList arrayList = new ArrayList();
            for (Object obj : signals) {
                if (((C6588i) obj).f().a() == channel.a()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: M8.d$g */
    static final class g implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f12947a = new g();

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S8.e apply(com.ui.wifiman.ui.wifi.channel.b it) {
            AbstractC6492s.i(it, "it");
            return it.a();
        }
    }

    /* renamed from: M8.d$h */
    static final class h implements kg.g {

        /* renamed from: a, reason: collision with root package name */
        public static final h f12948a = new h();

        h() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ci.c a(Map channelsByBandwidth, InterfaceC6147d env, C6556a c6556a) {
            C8745h c8745h;
            List listA;
            AbstractC6492s.i(channelsByBandwidth, "channelsByBandwidth");
            AbstractC6492s.i(env, "env");
            AbstractC6492s.i(c6556a, "<destruct>");
            C6585f c6585f = (C6585f) c6556a.a();
            Collection<S8.e> collectionValues = channelsByBandwidth.values();
            ArrayList arrayList = new ArrayList();
            for (S8.e eVar : collectionValues) {
                C6146c c6146cA = env.a(eVar);
                if (c6146cA != null) {
                    S8.d dVarB = eVar.b();
                    boolean z10 = false;
                    if (c6585f != null && (listA = c6585f.a()) != null) {
                        List list = listA;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                C6588i c6588i = (C6588i) it.next();
                                if ((c6588i.m() instanceof AbstractC6456a.AbstractC1905a) && AbstractC6492s.d(c6588i.f(), eVar)) {
                                    z10 = true;
                                    break;
                                }
                            }
                        }
                    }
                    c8745h = new C8745h(dVarB, z10, Ne.j.c(c6146cA.b(), true));
                } else {
                    c8745h = null;
                }
                if (c8745h != null) {
                    arrayList.add(c8745h);
                }
            }
            return Ci.a.h(arrayList);
        }
    }

    /* renamed from: M8.d$i */
    static final class i implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final i f12949a = new i();

        i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map apply(com.ui.wifiman.ui.wifi.channel.b params) {
            AbstractC6492s.i(params, "params");
            Set<S8.e> channels = params.a().a().getChannels();
            ArrayList arrayList = new ArrayList();
            for (Object obj : channels) {
                if (((S8.e) obj).d() == params.a().d()) {
                    arrayList.add(obj);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(arrayList, 10)), 16));
            for (Object obj2 : arrayList) {
                linkedHashMap.put(((S8.e) obj2).b(), obj2);
            }
            return linkedHashMap;
        }
    }

    /* renamed from: M8.d$j */
    static final class j implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final j f12950a = new j();

        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S8.e apply(com.ui.wifiman.ui.wifi.channel.b it) {
            AbstractC6492s.i(it, "it");
            return it.a();
        }
    }

    /* renamed from: M8.d$k */
    static final class k implements InterfaceC6465b {
        k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean c(S8.e eVar, C6588i signal) {
            AbstractC6492s.i(signal, "signal");
            return eVar.d() == signal.f().d();
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bf.b apply(final S8.e channel, List signals) {
            AbstractC6492s.i(channel, "channel");
            AbstractC6492s.i(signals, "signals");
            return C3293d.this.J(channel.a(), AbstractC3689v.d0(signals), new InterfaceC6835l() { // from class: M8.e
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(C3293d.k.c(channel, (C6588i) obj));
                }
            });
        }
    }

    /* renamed from: M8.d$l */
    static final class l implements kg.n {

        /* renamed from: M8.d$l$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f12953a;

            static {
                int[] iArr = new int[EnumC8738a.values().length];
                try {
                    iArr[EnumC8738a.AP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC8738a.INTERFERE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f12953a = iArr;
            }
        }

        l() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(EnumC8738a filter) {
            AbstractC6492s.i(filter, "filter");
            int i10 = a.f12953a[filter.ordinal()];
            if (i10 == 1) {
                return C3293d.this.f12938y;
            }
            if (i10 == 2) {
                return C3293d.this.f12917B;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: M8.d$m */
    static final class m implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final m f12954a = new m();

        m() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2706g apply(C2706g.a.C0194a card) {
            AbstractC6492s.i(card, "card");
            return new C2706g(AbstractC3689v.e(card));
        }
    }

    /* renamed from: M8.d$n */
    static final class n implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final n f12955a = new n();

        n() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer apply(List it) {
            AbstractC6492s.i(it, "it");
            return Integer.valueOf(it.size());
        }
    }

    /* renamed from: M8.d$o */
    static final class o implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final o f12956a = new o();

        o() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer apply(List it) {
            AbstractC6492s.i(it, "it");
            return Integer.valueOf(it.size());
        }
    }

    /* renamed from: M8.d$p */
    static final class p implements kg.g {

        /* renamed from: a, reason: collision with root package name */
        public static final p f12957a = new p();

        p() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C8743f a(EnumC8738a filter, Integer apCount, Integer apInterfereCount) {
            AbstractC6492s.i(filter, "filter");
            AbstractC6492s.i(apCount, "apCount");
            AbstractC6492s.i(apInterfereCount, "apInterfereCount");
            return new C8743f(filter, AbstractC3689v.o(new C8742e(EnumC8738a.AP, apCount.intValue()), new C8742e(EnumC8738a.INTERFERE, apInterfereCount.intValue())));
        }
    }

    /* renamed from: M8.d$q */
    static final class q implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5969a f12958a;

        /* renamed from: M8.d$q$a */
        public static final class a implements gg.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f12959a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C5969a f12960b;

            public a(List list, C5969a c5969a) {
                this.f12959a = list;
                this.f12960b = c5969a;
            }

            @Override // gg.q
            public final void a(gg.o oVar) {
                Object next;
                try {
                    AbstractC6492s.f(this.f12959a);
                    Iterator it = this.f12959a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            if (AbstractC6492s.d(((C6588i) next).e(), this.f12960b)) {
                                break;
                            }
                        }
                    }
                    C6588i c6588i = (C6588i) next;
                    if (c6588i != null) {
                        oVar.onSuccess(c6588i);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        q(C5969a c5969a) {
            this.f12958a = c5969a;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(List signals) {
            AbstractC6492s.i(signals, "signals");
            gg.n nVarC = gg.n.c(new a(signals, this.f12958a));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    /* renamed from: M8.d$r */
    static final class r implements kg.n {
        r() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(C6588i accessPoint) {
            AbstractC6492s.i(accessPoint, "accessPoint");
            return C3293d.this.z0().a(new InterfaceC6084a.b.K(new xf.d(accessPoint.e())));
        }
    }

    /* renamed from: M8.d$s */
    static final class s implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final s f12962a = new s();

        s() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(S8.e channel, List signals) {
            AbstractC6492s.i(channel, "channel");
            AbstractC6492s.i(signals, "signals");
            ArrayList arrayList = new ArrayList();
            for (Object obj : signals) {
                C6588i c6588i = (C6588i) obj;
                if (channel.d() != c6588i.f().d() && channel.f(c6588i.f())) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: M8.d$t */
    static final class t implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final t f12963a = new t();

        t() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(S8.e channel, List signals) {
            AbstractC6492s.i(channel, "channel");
            AbstractC6492s.i(signals, "signals");
            ArrayList arrayList = new ArrayList();
            for (Object obj : signals) {
                if (((C6588i) obj).f().d() == channel.d()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: M8.d$u */
    public static final class u implements gg.k {
        public u() {
        }

        @Override // gg.k
        public final void a(gg.j it) {
            AbstractC6492s.i(it, "it");
            try {
                it.h(C3293d.this.r0());
            } catch (Throwable th2) {
                it.onError(th2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: M8.d$v */
    public static final class v extends org.kodein.type.o<InterfaceC6586g> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: M8.d$w */
    public static final class w extends org.kodein.type.o<Cc.n> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: M8.d$x */
    public static final class x extends org.kodein.type.o<C6937a.InterfaceC1989a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: M8.d$y */
    public static final class y extends org.kodein.type.o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: M8.d$z */
    public static final class z extends org.kodein.type.o<ie.f> {
    }

    public C3293d(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f12920g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new v().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, InterfaceC6586g.class), null);
        th.l[] lVarArr = f12914E;
        this.f12921h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new w().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f12922i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, Cc.n.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new x().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f12923j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, C6937a.InterfaceC1989a.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new y().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f12924k = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE4, InterfaceC6084a.class), null).a(this, lVarArr[3]);
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new z().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f12925l = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE5, ie.f.class), null).a(this, lVarArr[4]);
        org.kodein.type.i iVarE6 = org.kodein.type.s.e(new A().getSuperType());
        AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f12926m = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE6, InterfaceC5352C.class), null).a(this, lVarArr[5]);
        gg.i iVarI2 = gg.i.N(new u(), EnumC5911a.LATEST).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f12927n = iVarI2;
        EnumC8738a enumC8738a = EnumC8738a.AP;
        Fg.a aVarK2 = Fg.a.k2(enumC8738a);
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f12928o = aVarK2;
        gg.i iVarI22 = aVarK2.e1().Y0(Gg.a.a(), false, 1).W().o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f12929p = iVarI22;
        gg.i iVarI23 = iVarI2.N0(g.f12947a).W().o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f12930q = iVarI23;
        gg.i iVarI24 = iVarI2.N0(i.f12949a).W().o1(1).i2();
        AbstractC6492s.h(iVarI24, "refCount(...)");
        this.f12931r = iVarI24;
        gg.i iVarW = iVarI23.N0(B.f12940a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f12932s = AbstractC8661g.d0(this, iVarW, new d.c(""), false, null, 6, null);
        gg.i iVarU = gg.i.u(iVarI24, A0().a(), C0().d(), h.f12948a);
        AbstractC6492s.h(iVarU, "combineLatest(...)");
        this.f12933t = AbstractC8661g.d0(this, iVarU, Ci.a.h(AbstractC3689v.l()), false, null, 6, null);
        gg.i iVarI25 = gg.i.v(iVarI2.N0(e.f12945a), C0().a(), f.f12946a).W().o1(1).i2();
        AbstractC6492s.h(iVarI25, "refCount(...)");
        this.f12934u = iVarI25;
        gg.i iVarW2 = gg.i.v(iVarI2.N0(j.f12950a), C0().a(), new k()).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f12935v = AbstractC8661g.d0(this, iVarW2, K.a.j(this, S8.c.GHZ_2_4, AbstractC8783m.s(new C6585f[0]), null, 4, null), false, null, 6, null);
        gg.i iVarI26 = gg.i.v(iVarI23, iVarI25, t.f12963a).W().o1(1).i2();
        AbstractC6492s.h(iVarI26, "refCount(...)");
        this.f12936w = iVarI26;
        gg.i iVarI27 = gg.i.t(iVarI26, y0().a(), D0().getAll(), B0().b(), C0508d.f12944a).W().o1(1).i2();
        AbstractC6492s.h(iVarI27, "refCount(...)");
        this.f12937x = iVarI27;
        gg.i iVarW3 = gg.i.t(iVarI23, iVarI27, y0().a(), D0().getAll(), C3294a.f12941a).W();
        AbstractC6492s.h(iVarW3, "distinctUntilChanged(...)");
        this.f12938y = iVarW3;
        gg.i iVarI28 = gg.i.v(iVarI23, iVarI25, s.f12962a).W().o1(1).i2();
        AbstractC6492s.h(iVarI28, "refCount(...)");
        this.f12939z = iVarI28;
        gg.i iVarI29 = gg.i.t(iVarI28, y0().a(), D0().getAll(), B0().b(), C3295b.f12942a).W().o1(1).i2();
        AbstractC6492s.h(iVarI29, "refCount(...)");
        this.f12916A = iVarI29;
        gg.i iVarW4 = gg.i.t(iVarI23, iVarI29, y0().a(), D0().getAll(), c.f12943a).W();
        AbstractC6492s.h(iVarW4, "distinctUntilChanged(...)");
        this.f12917B = iVarW4;
        gg.i iVarW5 = gg.i.u(iVarI22, iVarI27.N0(n.f12955a).W(), iVarI29.N0(o.f12956a).W(), p.f12957a).W();
        AbstractC6492s.h(iVarW5, "distinctUntilChanged(...)");
        InterfaceC5826a entries = EnumC8738a.getEntries();
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(entries, 10));
        Iterator<E> it = entries.iterator();
        while (it.hasNext()) {
            arrayList.add(new C8742e((EnumC8738a) it.next(), 0));
        }
        this.f12918C = AbstractC8661g.d0(this, iVarW5, new C8743f(enumC8738a, arrayList), false, null, 6, null);
        gg.i iVarN0 = this.f12929p.I1(new l()).N0(m.f12954a);
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f12919D = AbstractC8661g.d0(this, iVarN0, new C2706g(AbstractC3689v.l()), false, null, 6, null);
    }

    private final ie.f A0() {
        return (ie.f) this.f12925l.getValue();
    }

    private final InterfaceC5352C B0() {
        return (InterfaceC5352C) this.f12926m.getValue();
    }

    private final InterfaceC6586g C0() {
        return (InterfaceC6586g) this.f12921h.getValue();
    }

    private final C6937a.InterfaceC1989a D0() {
        return (C6937a.InterfaceC1989a) this.f12923j.getValue();
    }

    private final Cc.n y0() {
        return (Cc.n) this.f12922i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a z0() {
        return (InterfaceC6084a) this.f12924k.getValue();
    }

    @Override // M8.K
    public Bf.b J(S8.c cVar, InterfaceC8780j interfaceC8780j, InterfaceC6835l interfaceC6835l) {
        return K.a.f(this, cVar, interfaceC8780j, interfaceC6835l);
    }

    @Override // com.ui.wifiman.ui.wifi.channel.c
    public N c() {
        return this.f12932s;
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f12920g;
    }

    @Override // com.ui.wifiman.ui.wifi.channel.c
    public N n0() {
        return this.f12933t;
    }

    @Override // com.ui.wifiman.ui.wifi.channel.c
    public N o0() {
        return this.f12935v;
    }

    @Override // com.ui.wifiman.ui.wifi.channel.c
    public N p0() {
        return this.f12919D;
    }

    @Override // M8.K
    public Bf.b q(S8.c cVar, InterfaceC8780j interfaceC8780j, InterfaceC6835l interfaceC6835l) {
        return K.a.i(this, cVar, interfaceC8780j, interfaceC6835l);
    }

    @Override // com.ui.wifiman.ui.wifi.channel.c
    public N q0() {
        return this.f12918C;
    }

    @Override // com.ui.wifiman.ui.wifi.channel.c
    public void s0(EnumC8738a filter) {
        AbstractC6492s.i(filter, "filter");
        this.f12928o.h(filter);
    }

    @Override // com.ui.wifiman.ui.wifi.channel.c
    public void t0(C5969a bssid) {
        AbstractC6492s.i(bssid, "bssid");
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bK = this.f12934u.o0().u(new q(bssid)).k(new r());
        AbstractC6492s.h(abstractC5912bK, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bK, this);
    }
}
