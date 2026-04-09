package x8;

import Cd.f;
import Ee.C2706g;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Te.C3569a;
import Te.K0;
import Te.x0;
import Zg.AbstractC3689v;
import a8.C3771a;
import android.content.Context;
import androidx.lifecycle.AbstractC4013k;
import com.ubnt.usurvey.R;
import com.ubnt.usurvey.ui.signal.strength.a;
import com.ubnt.usurvey.wifi.WifiChannelUtils;
import com.ui.wifiman.ui.signal.N;
import de.y;
import gc.EnumC5895b;
import gg.AbstractC5912b;
import gg.InterfaceC5910A;
import hd.AbstractC5975a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jd.InterfaceC6293b;
import je.AbstractC6317r;
import kg.InterfaceC6465b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import me.InterfaceC6814f;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import org.kodein.di.DI;
import re.InterfaceC7588a;
import rj.InterfaceC7810x2;
import s9.d;
import vc.InterfaceC8209b;
import ye.AbstractC8661g;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class j extends N {

    /* renamed from: G, reason: collision with root package name */
    static final /* synthetic */ th.l[] f65379G = {O.h(new F(j.class, "screenConfig", "getScreenConfig()Lcom/ui/wifiman/model/ui/SignalTabConfigManager;", 0)), O.h(new F(j.class, "wifiConnectionService", "getWifiConnectionService()Lcom/ui/wifiman/model/wifi/connection/WifiConnectionService;", 0)), O.h(new F(j.class, "accessPointRoamingService", "getAccessPointRoamingService()Lcom/ui/wifiman/model/network/roaming/AccessPointRoaming$Service;", 0)), O.h(new F(j.class, "topologyService", "getTopologyService()Lcom/ui/wifiman/model/network/topology/NetworkTopologyService;", 0)), O.h(new F(j.class, "deviceManager", "getDeviceManager()Lcom/ui/wifiman/model/device/WifimanDeviceManager;", 0)), O.h(new F(j.class, "placesOperator", "getPlacesOperator()Lcom/ubnt/usurvey/ui/signal/places/SignalTabPlacesCardOperator;", 0)), O.h(new F(j.class, "statsOperatorWifi", "getStatsOperatorWifi()Lcom/ubnt/usurvey/ui/signal/strength/SignalTabStatsOperator;", 0)), O.h(new F(j.class, "statsOperatorCellular", "getStatsOperatorCellular()Lcom/ubnt/usurvey/ui/signal/strength/SignalTabStatsOperator;", 0)), O.h(new F(j.class, "gatewaySpeedtest", "getGatewaySpeedtest()Lcom/ui/wifiman/model/speedtest/lan/InfiniteLocalSpeedtest;", 0)), O.h(new F(j.class, "appScreenManager", "getAppScreenManager()Lcom/ui/wifiman/model/android/window/AppWindowService;", 0)), O.h(new F(j.class, "latencyOperatorWifi", "getLatencyOperatorWifi()Lcom/ubnt/usurvey/ui/signal/chart/SignalTabNetworkLatencyServiceWifi;", 0)), O.h(new F(j.class, "latencyOperatorCellular", "getLatencyOperatorCellular()Lcom/ubnt/usurvey/ui/signal/chart/SignalTabNetworkLatencyServiceCellular;", 0)), O.h(new F(j.class, "wizardApComparison", "getWizardApComparison()Lcom/ui/wifiman/model/wmw/compare/WifimanWizardApComparison;", 0)), O.h(new F(j.class, "wifiScanner", "getWifiScanner()Lcom/ui/wifiman/model/wifi/scan/android/AndroidWifiScanner;", 0)), O.g(new kotlin.jvm.internal.D(j.class, "stream", "<v#0>", 0)), O.g(new kotlin.jvm.internal.D(j.class, "stream", "<v#1>", 0)), O.g(new kotlin.jvm.internal.D(j.class, "stream", "<v#2>", 0)), O.g(new kotlin.jvm.internal.D(j.class, "stream", "<v#3>", 0)), O.g(new kotlin.jvm.internal.D(j.class, "stream", "<v#4>", 0)), O.g(new kotlin.jvm.internal.D(j.class, "stream", "<v#5>", 0))};

    /* renamed from: H, reason: collision with root package name */
    public static final int f65380H = 8;

    /* renamed from: A, reason: collision with root package name */
    private final gg.i f65381A;

    /* renamed from: B, reason: collision with root package name */
    private final gg.i f65382B;

    /* renamed from: C, reason: collision with root package name */
    private final Li.N f65383C;

    /* renamed from: D, reason: collision with root package name */
    private final Li.N f65384D;

    /* renamed from: E, reason: collision with root package name */
    private final gg.i f65385E;

    /* renamed from: F, reason: collision with root package name */
    private final Li.N f65386F;

    /* renamed from: g, reason: collision with root package name */
    private final DI f65387g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f65388h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f65389i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f65390j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f65391k;

    /* renamed from: l, reason: collision with root package name */
    private final Yg.m f65392l;

    /* renamed from: m, reason: collision with root package name */
    private final Yg.m f65393m;

    /* renamed from: n, reason: collision with root package name */
    private final Yg.m f65394n;

    /* renamed from: o, reason: collision with root package name */
    private final Yg.m f65395o;

    /* renamed from: p, reason: collision with root package name */
    private final Yg.m f65396p;

    /* renamed from: q, reason: collision with root package name */
    private final Yg.m f65397q;

    /* renamed from: r, reason: collision with root package name */
    private final Yg.m f65398r;

    /* renamed from: s, reason: collision with root package name */
    private final Yg.m f65399s;

    /* renamed from: t, reason: collision with root package name */
    private final Yg.m f65400t;

    /* renamed from: u, reason: collision with root package name */
    private final Yg.m f65401u;

    /* renamed from: v, reason: collision with root package name */
    private final gg.i f65402v;

    /* renamed from: w, reason: collision with root package name */
    private final gg.i f65403w;

    /* renamed from: x, reason: collision with root package name */
    private final gg.i f65404x;

    /* renamed from: y, reason: collision with root package name */
    private final gg.i f65405y;

    /* renamed from: z, reason: collision with root package name */
    private final gg.i f65406z;

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class A extends org.kodein.type.o<com.ubnt.usurvey.ui.signal.strength.b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class B extends org.kodein.type.o<Cd.f> {
    }

    static final class C implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C f65407a = new C();

        C() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(InterfaceC7588a.b it) {
            AbstractC6492s.i(it, "it");
            if (it instanceof InterfaceC7588a.b.C2111a) {
                return ((InterfaceC7588a.b.C2111a) it).a().d();
            }
            if (it instanceof InterfaceC7588a.b.C2112b) {
                return AbstractC5912b.m();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class D implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final D f65408a = new D();

        D() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(f.a it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it instanceof f.a.AbstractC0125a);
        }
    }

    static final class E implements kg.n {
        E() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Boolean infiniteSpeedtestAvailable) {
            AbstractC6492s.i(infiniteSpeedtestAvailable, "infiniteSpeedtestAvailable");
            return !infiniteSpeedtestAvailable.booleanValue() ? gg.i.R0(j.this.R0().c(), j.this.R0().a(), j.this.R0().e()) : gg.i.j0();
        }
    }

    /* renamed from: x8.j$a, reason: case insensitive filesystem */
    static final class C8426a implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C8426a f65410a = new C8426a();

        C8426a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(com.ubnt.usurvey.ui.signal.strength.a it) {
            AbstractC6492s.i(it, "it");
            return it.getState();
        }
    }

    /* renamed from: x8.j$b, reason: case insensitive filesystem */
    static final class C8427b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C8427b f65411a = new C8427b();

        C8427b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(a.AbstractC1261a state) {
            boolean z10;
            AbstractC6492s.i(state, "state");
            if (state instanceof a.AbstractC1261a.AbstractC1262a.C1263a) {
                z10 = true;
            } else {
                if (!(state instanceof a.AbstractC1261a.AbstractC1262a.b) && !(state instanceof a.AbstractC1261a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* renamed from: x8.j$c, reason: case insensitive filesystem */
    static final class C8428c implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5975a.d f65412a;

        C8428c(AbstractC5975a.d dVar) {
            this.f65412a = dVar;
        }

        public final CharSequence a(Context it, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(it, "it");
            interfaceC3540l.U(141221252);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(141221252, i10, -1, "com.ubnt.usurvey.ui.signal.SignalTabStrengthVM.asCardItem.<anonymous>.<anonymous> (SignalTabStrengthVM.kt:231)");
            }
            String string = it.getString(R.string.signal_mapper_access_point_roaming_channel_info);
            AbstractC6492s.h(string, "getString(...)");
            Integer numD = ((AbstractC5975a.d.AbstractC1799a.b) this.f65412a).a().d();
            WifiChannelUtils wifiChannelUtils = WifiChannelUtils.f41035a;
            Integer numD2 = ((AbstractC5975a.d.AbstractC1799a.b) this.f65412a).a().d();
            AbstractC6492s.f(numD2);
            int iIntValue = numD2.intValue();
            S8.c cVarB = ((AbstractC5975a.d.AbstractC1799a.b) this.f65412a).a().b();
            AbstractC6492s.f(cVarB);
            String str = String.format(string, Arrays.copyOf(new Object[]{numD, wifiChannelUtils.b(iIntValue, cVarB)}, 2));
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

    /* renamed from: x8.j$d, reason: case insensitive filesystem */
    static final class C8429d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C8429d f65413a = new C8429d();

        C8429d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(com.ubnt.usurvey.ui.signal.strength.a it) {
            AbstractC6492s.i(it, "it");
            return it.b();
        }
    }

    /* renamed from: x8.j$e, reason: case insensitive filesystem */
    static final class C8430e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C8430e f65414a = new C8430e();

        C8430e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(com.ubnt.usurvey.ui.signal.strength.a it) {
            AbstractC6492s.i(it, "it");
            return it.c();
        }
    }

    static final class f implements kg.h {

        /* renamed from: a, reason: collision with root package name */
        public static final f f65415a = new f();

        f() {
        }

        @Override // kg.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2706g a(C6556a c6556a, List signalCards, C6556a c6556a2, C6556a c6556a3) {
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(signalCards, "signalCards");
            AbstractC6492s.i(c6556a2, "<destruct>");
            AbstractC6492s.i(c6556a3, "<destruct>");
            C2706g.a aVar = (C2706g.a) c6556a.a();
            C2706g.a.C0194a c0194a = (C2706g.a.C0194a) c6556a2.a();
            C2706g.a.C0194a c0194a2 = (C2706g.a.C0194a) c6556a3.a();
            ArrayList arrayList = new ArrayList();
            if (aVar != null) {
                arrayList.add(aVar);
            }
            arrayList.addAll(signalCards);
            if (c0194a2 != null) {
                arrayList.add(c0194a2);
            }
            if (c0194a != null) {
                arrayList.add(c0194a);
            }
            return new C2706g(arrayList);
        }
    }

    static final class g implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final g f65416a = new g();

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f65417a;

            static {
                int[] iArr = new int[gc.c.values().length];
                try {
                    iArr[gc.c.WIFI.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[gc.c.CELLULAR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f65417a = iArr;
            }
        }

        g() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gc.c apply(de.y config, a.AbstractC1261a cellularDeviceState) {
            AbstractC6492s.i(config, "config");
            AbstractC6492s.i(cellularDeviceState, "cellularDeviceState");
            int i10 = a.f65417a[config.e().ordinal()];
            if (i10 == 1) {
                return gc.c.WIFI;
            }
            if (i10 == 2) {
                return cellularDeviceState instanceof a.AbstractC1261a.AbstractC1262a ? gc.c.CELLULAR : gc.c.WIFI;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f65418a = new h();

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(com.ubnt.usurvey.ui.signal.strength.a it) {
            AbstractC6492s.i(it, "it");
            return it.d();
        }
    }

    static final class i implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f65419a;

        i(String str) {
            this.f65419a = str;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(com.ubnt.usurvey.ui.signal.strength.a it) {
            AbstractC6492s.i(it, "it");
            return it.a(this.f65419a);
        }
    }

    /* renamed from: x8.j$j, reason: collision with other inner class name */
    static final class C2312j implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final C2312j f65420a = new C2312j();

        /* renamed from: x8.j$j$a */
        static final class a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f65421a;

            a(List list) {
                this.f65421a = list;
            }

            public final CharSequence a(Context it, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(it, "it");
                interfaceC3540l.U(-395913272);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-395913272, i10, -1, "com.ubnt.usurvey.ui.signal.SignalTabStrengthVM.placesCard.<anonymous>.<anonymous> (SignalTabStrengthVM.kt:171)");
                }
                String string = it.getString(R.string.signal_mapper_places_title_format);
                AbstractC6492s.h(string, "getString(...)");
                String str = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(this.f65421a.size())}, 1));
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

        C2312j() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v3, types: [Ee.g$a$a] */
        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(Boolean placeAddEnabled, List places) {
            AbstractC6492s.i(placeAddEnabled, "placeAddEnabled");
            AbstractC6492s.i(places, "places");
            if (!places.isEmpty()) {
                c0194a = new C2706g.a.C0194a("places", places.isEmpty() ? new d.b(R.string.signal_mapper_places_title) : new d.a(String.valueOf(places.size()), new a(places)), placeAddEnabled.booleanValue() ? new C2706g.a.C0194a.AbstractC0195a.b(new d.b(R.string.signal_mapper_places_header_add)) : null, places);
            }
            return new C6556a(c0194a);
        }
    }

    static final class k implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f65423a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(gg.i it) {
                AbstractC6492s.i(it, "it");
                return it.R(1000L, TimeUnit.MILLISECONDS);
            }
        }

        static final class b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final b f65424a = new b();

            b() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(C2706g.a.C0194a it) {
                AbstractC6492s.i(it, "it");
                return new C6556a(it);
            }
        }

        public static final class c implements gg.C {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f65425a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3569a f65426b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ j f65427c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C3771a f65428d;

            public c(List list, C3569a c3569a, j jVar, C3771a c3771a) {
                this.f65425a = list;
                this.f65426b = c3569a;
                this.f65427c = jVar;
                this.f65428d = c3771a;
            }

            @Override // gg.C
            public final void a(InterfaceC5910A interfaceC5910A) {
                List listE;
                try {
                    if (this.f65425a.isEmpty()) {
                        listE = AbstractC3689v.e(new K0.g(new d.b(R.string.signal_mapper_access_point_roaming_empty)));
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f65426b);
                        int i10 = 0;
                        for (Object obj : AbstractC3689v.S(this.f65425a)) {
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                AbstractC3689v.v();
                            }
                            AbstractC5975a abstractC5975a = (AbstractC5975a) obj;
                            arrayList.add(this.f65427c.I0(abstractC5975a, abstractC5975a.b(), this.f65428d, true, i10 != this.f65425a.size() - 1));
                            i10 = i11;
                        }
                        listE = new ArrayList(AbstractC3689v.w(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            listE.add(new K0.i((C3569a) it.next()));
                        }
                    }
                    interfaceC5910A.onSuccess(new C2706g.a.C0194a("roaming", new d.b(R.string.signal_mapper_access_point_roaming_title), null, listE, 4, null));
                } catch (Throwable th2) {
                    interfaceC5910A.onError(th2);
                }
            }
        }

        k() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Yg.y yVar) {
            AbstractC6492s.i(yVar, "<destruct>");
            C3569a c3569a = (C3569a) yVar.a();
            gg.z zVarI = gg.z.i(new c((List) yVar.c(), c3569a, j.this, (C3771a) yVar.d()));
            AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
            return zVarI.K(a.f65423a).N0(b.f65424a);
        }
    }

    static final class l implements kg.g {

        /* renamed from: a, reason: collision with root package name */
        public static final l f65429a = new l();

        static final class a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC6317r f65430a;

            a(AbstractC6317r abstractC6317r) {
                this.f65430a = abstractC6317r;
            }

            public final CharSequence a(Context it, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(it, "it");
                interfaceC3540l.U(1399680017);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1399680017, i10, -1, "com.ubnt.usurvey.ui.signal.SignalTabStrengthVM.roamingCardCurrentItem.<anonymous>.<anonymous> (SignalTabStrengthVM.kt:270)");
                }
                String string = it.getString(R.string.signal_mapper_access_point_roaming_channel_info);
                AbstractC6492s.h(string, "getString(...)");
                Integer numD = ((AbstractC6317r.b.a) this.f65430a).d();
                WifiChannelUtils wifiChannelUtils = WifiChannelUtils.f41035a;
                Integer numD2 = ((AbstractC6317r.b.a) this.f65430a).d();
                AbstractC6492s.f(numD2);
                int iIntValue = numD2.intValue();
                S8.c cVarB = ((AbstractC6317r.b.a) this.f65430a).b();
                AbstractC6492s.f(cVarB);
                String str = String.format(string, Arrays.copyOf(new Object[]{numD, wifiChannelUtils.b(iIntValue, cVarB)}, 2));
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

        l() {
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final Te.C3569a a(l9.C6556a r18, je.AbstractC6317r r19, java.util.List r20) {
            /*
                Method dump skipped, instructions count: 252
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: x8.j.l.a(l9.a, je.r, java.util.List):Te.a");
        }
    }

    static final class m implements kg.n {

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f65432a;

            static {
                int[] iArr = new int[gc.c.values().length];
                try {
                    iArr[gc.c.WIFI.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[gc.c.CELLULAR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f65432a = iArr;
            }
        }

        m() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ubnt.usurvey.ui.signal.strength.a apply(gc.c it) {
            AbstractC6492s.i(it, "it");
            int i10 = a.f65432a[it.ordinal()];
            if (i10 == 1) {
                return j.this.V0();
            }
            if (i10 == 2) {
                return j.this.U0();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class n implements kg.g {

        /* renamed from: a, reason: collision with root package name */
        public static final n f65433a = new n();

        n() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6556a a(gc.c signalType, a.AbstractC1261a wifiDeviceState, a.AbstractC1261a cellularDeviceState) {
            AbstractC6492s.i(signalType, "signalType");
            AbstractC6492s.i(wifiDeviceState, "wifiDeviceState");
            AbstractC6492s.i(cellularDeviceState, "cellularDeviceState");
            List listC = AbstractC3689v.c();
            if (wifiDeviceState instanceof a.AbstractC1261a.AbstractC1262a) {
                listC.add(gc.c.WIFI);
            }
            if (cellularDeviceState instanceof a.AbstractC1261a.AbstractC1262a) {
                listC.add(gc.c.CELLULAR);
            }
            List listA = AbstractC3689v.a(listC);
            x0 x0Var = listA.size() > 1 ? new x0(signalType, listA) : null;
            return new C6556a(x0Var != null ? new C2706g.a.b(new K0.j(x0Var)) : null);
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class o extends org.kodein.type.o<InterfaceC8209b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class p extends org.kodein.type.o<y8.v> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class q extends org.kodein.type.o<y8.u> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class r extends org.kodein.type.o<InterfaceC7588a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class s extends org.kodein.type.o<InterfaceC6814f> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class t extends org.kodein.type.o<de.z> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class u extends org.kodein.type.o<je.u> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class v extends org.kodein.type.o<AbstractC5975a.c> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class w extends org.kodein.type.o<InterfaceC6293b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class x extends org.kodein.type.o<Cc.n> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class y extends org.kodein.type.o<C8.c> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class z extends org.kodein.type.o<com.ubnt.usurvey.ui.signal.strength.c> {
    }

    public j(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f65387g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new t().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, de.z.class), null);
        th.l[] lVarArr = f65379G;
        this.f65388h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new u().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f65389i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, je.u.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new v().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f65390j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, AbstractC5975a.c.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new w().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f65391k = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE4, InterfaceC6293b.class), null).a(this, lVarArr[3]);
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new x().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f65392l = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE5, Cc.n.class), null).a(this, lVarArr[4]);
        org.kodein.type.i iVarE6 = org.kodein.type.s.e(new y().getSuperType());
        AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f65393m = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE6, C8.c.class), null).a(this, lVarArr[5]);
        org.kodein.type.i iVarE7 = org.kodein.type.s.e(new z().getSuperType());
        AbstractC6492s.g(iVarE7, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f65394n = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE7, com.ubnt.usurvey.ui.signal.strength.c.class), null).a(this, lVarArr[6]);
        org.kodein.type.i iVarE8 = org.kodein.type.s.e(new A().getSuperType());
        AbstractC6492s.g(iVarE8, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f65395o = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE8, com.ubnt.usurvey.ui.signal.strength.b.class), null).a(this, lVarArr[7]);
        org.kodein.type.i iVarE9 = org.kodein.type.s.e(new B().getSuperType());
        AbstractC6492s.g(iVarE9, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f65396p = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE9, Cd.f.class), null).a(this, lVarArr[8]);
        org.kodein.type.i iVarE10 = org.kodein.type.s.e(new o().getSuperType());
        AbstractC6492s.g(iVarE10, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f65397q = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE10, InterfaceC8209b.class), null).a(this, lVarArr[9]);
        org.kodein.type.i iVarE11 = org.kodein.type.s.e(new p().getSuperType());
        AbstractC6492s.g(iVarE11, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f65398r = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE11, y8.v.class), null).a(this, lVarArr[10]);
        org.kodein.type.i iVarE12 = org.kodein.type.s.e(new q().getSuperType());
        AbstractC6492s.g(iVarE12, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f65399s = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE12, y8.u.class), null).a(this, lVarArr[11]);
        org.kodein.type.i iVarE13 = org.kodein.type.s.e(new r().getSuperType());
        AbstractC6492s.g(iVarE13, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f65400t = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE13, InterfaceC7588a.class), null).a(this, lVarArr[12]);
        org.kodein.type.i iVarE14 = org.kodein.type.s.e(new s().getSuperType());
        AbstractC6492s.g(iVarE14, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f65401u = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE14, InterfaceC6814f.class), null).a(this, lVarArr[13]);
        gg.i iVarI2 = gg.i.v(T0().b(), U0().getState(), g.f65416a).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f65402v = iVarI2;
        gg.i iVarI22 = gg.i.u(iVarI2, V0().getState(), U0().getState(), n.f65433a).W().o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f65403w = iVarI22;
        gg.i iVarI23 = iVarI2.N0(new m()).o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f65404x = iVarI23;
        gg.i iVarI24 = iVarI23.I1(C8426a.f65410a).N0(C8427b.f65411a).W().o1(1).i2();
        AbstractC6492s.h(iVarI24, "refCount(...)");
        this.f65405y = iVarI24;
        gg.i iVarW = gg.i.v(iVarI24, S0().b(), C2312j.f65420a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f65406z = iVarW;
        gg.i iVarW2 = gg.i.u(W0().c(), X0().a(), M0().a(), l.f65429a).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f65381A = iVarW2;
        gg.i iVarW3 = Ag.c.f753a.b(iVarW2, M0().a(), O0().a()).I1(new k()).e1().Y0(Gg.a.a(), false, 1).W();
        AbstractC6492s.h(iVarW3, "distinctUntilChanged(...)");
        this.f65382B = iVarW3;
        gg.i iVarW4 = gg.i.t(iVarI22, iVarI23.I1(C8430e.f65414a), iVarW3, iVarW, f.f65415a).W();
        AbstractC6492s.h(iVarW4, "distinctUntilChanged(...)");
        this.f65383C = AbstractC8661g.d0(this, iVarW4, new C2706g(AbstractC3689v.l()), false, null, 6, null);
        this.f65384D = AbstractC8661g.d0(this, iVarI24, Boolean.FALSE, false, null, 6, null);
        gg.i iVarI25 = iVarI23.I1(C8429d.f65413a).o1(1).i2();
        AbstractC6492s.h(iVarI25, "refCount(...)");
        this.f65385E = iVarI25;
        this.f65386F = AbstractC8661g.h0(this, iVarI25, null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final Te.C3569a I0(hd.AbstractC5975a r13, long r14, a8.C3771a r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.j.I0(hd.a, long, a8.a, boolean, boolean):Te.a");
    }

    private final void J0() {
        C8658d c8658d = C8658d.f66727a;
        c8658d.e(L0(c8658d.b(this, AbstractC4013k.b.STARTED, new InterfaceC6824a() { // from class: x8.f
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return j.K0(this.f65375a);
            }
        })), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.i K0(j jVar) {
        gg.i iVarC0 = jVar.Y0().b().c0();
        AbstractC6492s.h(iVarC0, "toFlowable(...)");
        return iVarC0;
    }

    private static final gg.i L0(C8658d.a aVar) {
        return aVar.c(null, f65379G[19]);
    }

    private final AbstractC5975a.c M0() {
        return (AbstractC5975a.c) this.f65390j.getValue();
    }

    private final InterfaceC8209b N0() {
        return (InterfaceC8209b) this.f65397q.getValue();
    }

    private final Cc.n O0() {
        return (Cc.n) this.f65392l.getValue();
    }

    private final Cd.f P0() {
        return (Cd.f) this.f65396p.getValue();
    }

    private final y8.u Q0() {
        return (y8.u) this.f65399s.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y8.v R0() {
        return (y8.v) this.f65398r.getValue();
    }

    private final C8.c S0() {
        return (C8.c) this.f65393m.getValue();
    }

    private final de.z T0() {
        return (de.z) this.f65388h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.ubnt.usurvey.ui.signal.strength.a U0() {
        return (com.ubnt.usurvey.ui.signal.strength.a) this.f65395o.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.ubnt.usurvey.ui.signal.strength.a V0() {
        return (com.ubnt.usurvey.ui.signal.strength.a) this.f65394n.getValue();
    }

    private final InterfaceC6293b W0() {
        return (InterfaceC6293b) this.f65391k.getValue();
    }

    private final je.u X0() {
        return (je.u) this.f65389i.getValue();
    }

    private final InterfaceC6814f Y0() {
        return (InterfaceC6814f) this.f65401u.getValue();
    }

    private final InterfaceC7588a Z0() {
        return (InterfaceC7588a) this.f65400t.getValue();
    }

    private final void a1() {
        C8658d c8658d = C8658d.f66727a;
        c8658d.e(c1(c8658d.b(this, AbstractC4013k.b.RESUMED, new InterfaceC6824a() { // from class: x8.d
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return j.b1(this.f65373a);
            }
        })), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.i b1(j jVar) {
        gg.i iVarC0 = jVar.N0().a().c0();
        AbstractC6492s.h(iVarC0, "toFlowable(...)");
        return iVarC0;
    }

    private static final gg.i c1(C8658d.a aVar) {
        return aVar.c(null, f65379G[18]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final de.y d1(EnumC5895b enumC5895b, de.y it) {
        AbstractC6492s.i(it, "it");
        return de.y.b(it, null, enumC5895b, null, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final de.y e1(gc.c cVar, de.y it) {
        AbstractC6492s.i(it, "it");
        return de.y.b(it, null, null, cVar, 3, null);
    }

    private final void f1() {
        C8658d c8658d = C8658d.f66727a;
        c8658d.e(h1(c8658d.b(this, AbstractC4013k.b.STARTED, new InterfaceC6824a() { // from class: x8.b
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return j.g1(this.f65371a);
            }
        })), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.i g1(j jVar) {
        gg.i iVarC0 = jVar.Z0().getState().L1(C.f65407a).c0();
        AbstractC6492s.h(iVarC0, "toFlowable(...)");
        return iVarC0;
    }

    private static final gg.i h1(C8658d.a aVar) {
        return aVar.c(null, f65379G[17]);
    }

    private final void i1() {
        C8658d c8658d = C8658d.f66727a;
        c8658d.e(k1(c8658d.b(this, AbstractC4013k.b.STARTED, new InterfaceC6824a() { // from class: x8.e
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return j.j1(this.f65374a);
            }
        })), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.i j1(j jVar) {
        return jVar.f65385E;
    }

    private static final gg.i k1(C8658d.a aVar) {
        return aVar.c(null, f65379G[14]);
    }

    private final void l1() {
        C8658d c8658d = C8658d.f66727a;
        c8658d.e(n1(c8658d.b(this, AbstractC4013k.b.STARTED, new InterfaceC6824a() { // from class: x8.g
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return j.m1(this.f65376a);
            }
        })), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.i m1(j jVar) {
        gg.i iVarR0 = gg.i.R0(jVar.Q0().c(), jVar.Q0().a(), jVar.Q0().e());
        AbstractC6492s.h(iVarR0, "merge(...)");
        return iVarR0;
    }

    private static final gg.i n1(C8658d.a aVar) {
        return aVar.c(null, f65379G[16]);
    }

    private final void o1() {
        C8658d c8658d = C8658d.f66727a;
        c8658d.e(p1(c8658d.b(this, AbstractC4013k.b.STARTED, new InterfaceC6824a() { // from class: x8.c
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return j.q1(this.f65372a);
            }
        })), this);
    }

    private static final gg.i p1(C8658d.a aVar) {
        return aVar.c(null, f65379G[15]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.i q1(j jVar) {
        gg.i iVarI1 = jVar.P0().getState().N0(D.f65408a).W().I1(jVar.new E());
        AbstractC6492s.h(iVarI1, "switchMap(...)");
        return iVarI1;
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f65387g;
    }

    @Override // ye.AbstractC8661g
    public void l0() {
        super.l0();
        a1();
        i1();
        o1();
        l1();
        f1();
        J0();
    }

    @Override // com.ui.wifiman.ui.signal.N
    public Li.N n0() {
        return this.f65386F;
    }

    @Override // com.ui.wifiman.ui.signal.N
    public Li.N o0() {
        return this.f65383C;
    }

    @Override // com.ui.wifiman.ui.signal.N
    public Li.N p0() {
        return this.f65384D;
    }

    @Override // com.ui.wifiman.ui.signal.N
    public void q0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bT = this.f65404x.o0().t(h.f65418a);
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }

    @Override // com.ui.wifiman.ui.signal.N
    public void r0(final EnumC5895b tab) {
        AbstractC6492s.i(tab, "tab");
        C8658d.f66727a.d(T0().a(new InterfaceC6835l() { // from class: x8.h
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return j.d1(tab, (y) obj);
            }
        }), this);
    }

    @Override // com.ui.wifiman.ui.signal.N
    public void s0(String id2) {
        AbstractC6492s.i(id2, "id");
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bT = this.f65404x.o0().t(new i(id2));
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }

    @Override // com.ui.wifiman.ui.signal.N
    public void t0(String id2) {
        AbstractC6492s.i(id2, "id");
        C8658d.f66727a.d(S0().a(id2), this);
    }

    @Override // com.ui.wifiman.ui.signal.N
    public void u0() {
        C8658d.f66727a.d(S0().c(), this);
    }

    @Override // com.ui.wifiman.ui.signal.N
    public void v0(final gc.c tab) {
        AbstractC6492s.i(tab, "tab");
        C8658d.f66727a.d(T0().a(new InterfaceC6835l() { // from class: x8.i
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return j.e1(tab, (y) obj);
            }
        }), this);
    }
}
