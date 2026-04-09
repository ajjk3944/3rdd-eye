package M8;

import Af.C2428c;
import Df.a;
import Ee.C2706g;
import Li.N;
import M8.C3298g;
import M8.K;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Zg.AbstractC3689v;
import Zg.U;
import a8.C3771a;
import android.content.Context;
import com.ubnt.usurvey.R;
import de.C5351B;
import de.C5354E;
import de.InterfaceC5352C;
import de.InterfaceC5355F;
import gg.AbstractC5912b;
import gg.EnumC5911a;
import h9.C5969a;
import i8.InterfaceC6084a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kg.InterfaceC6465b;
import kotlin.Metadata;
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
import ye.AbstractC8661g;
import ye.C8658d;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* renamed from: M8.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3298g extends Cf.d implements K {

    /* renamed from: y, reason: collision with root package name */
    static final /* synthetic */ th.l[] f12968y = {O.h(new kotlin.jvm.internal.F(C3298g.class, "wifiSurvey", "getWifiSurvey()Lcom/ui/wifiman/model/wifi/scan/WifiScannerService;", 0)), O.h(new kotlin.jvm.internal.F(C3298g.class, "screenConfig", "getScreenConfig()Lcom/ui/wifiman/model/ui/WifiScanHomeConfigManager;", 0)), O.h(new kotlin.jvm.internal.F(C3298g.class, "deviceManager", "getDeviceManager()Lcom/ui/wifiman/model/device/WifimanDeviceManager;", 0)), O.h(new kotlin.jvm.internal.F(C3298g.class, "wifiSignalStats", "getWifiSignalStats()Lcom/ui/wifiman/model/wifi/scan/timelapse/WifiSignalTimelapse$Service;", 0)), O.h(new kotlin.jvm.internal.F(C3298g.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new kotlin.jvm.internal.F(C3298g.class, "wifiNetworkDetailConfig", "getWifiNetworkDetailConfig()Lcom/ui/wifiman/model/ui/WifiNetworkDetailHomeConfigManager;", 0))};

    /* renamed from: z, reason: collision with root package name */
    public static final int f12969z = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f12970g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f12971h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f12972i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f12973j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f12974k;

    /* renamed from: l, reason: collision with root package name */
    private final Yg.m f12975l;

    /* renamed from: m, reason: collision with root package name */
    private final Yg.m f12976m;

    /* renamed from: n, reason: collision with root package name */
    private final gg.i f12977n;

    /* renamed from: o, reason: collision with root package name */
    private final gg.i f12978o;

    /* renamed from: p, reason: collision with root package name */
    private final gg.i f12979p;

    /* renamed from: q, reason: collision with root package name */
    private final gg.i f12980q;

    /* renamed from: r, reason: collision with root package name */
    private final gg.i f12981r;

    /* renamed from: s, reason: collision with root package name */
    private final N f12982s;

    /* renamed from: t, reason: collision with root package name */
    private final N f12983t;

    /* renamed from: u, reason: collision with root package name */
    private final N f12984u;

    /* renamed from: v, reason: collision with root package name */
    private final N f12985v;

    /* renamed from: w, reason: collision with root package name */
    private final N f12986w;

    /* renamed from: x, reason: collision with root package name */
    private final N f12987x;

    /* renamed from: M8.g$a */
    static final class a implements kg.i {

        /* renamed from: a, reason: collision with root package name */
        public static final a f12988a = new a();

        /* renamed from: M8.g$a$a, reason: collision with other inner class name */
        static final class C0509a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ S8.c f12989a;

            C0509a(S8.c cVar) {
                this.f12989a = cVar;
            }

            public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(context, "context");
                interfaceC3540l.U(1874064879);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1874064879, i10, -1, "com.ubnt.usurvey.ui.wifi.WifiNetworkDetailVM.accessPoints.<anonymous>.<anonymous>.<anonymous> (WifiNetworkDetailVM.kt:220)");
                }
                String string = context.getString(R.string.wifi_network_detail_spectrum_empty);
                AbstractC6492s.h(string, "getString(...)");
                String str = String.format(string, Arrays.copyOf(new Object[]{context.getString(Ne.h.e(this.f12989a))}, 1));
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

        /* renamed from: M8.g$a$b */
        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f12990a = new int[S8.c.values().length];
        }

        a() {
        }

        @Override // kg.i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2706g a(C6556a c6556a, List signals, C3771a devices, Map signalStats, C5351B wifiNetworkConfig) {
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(signals, "signals");
            AbstractC6492s.i(devices, "devices");
            AbstractC6492s.i(signalStats, "signalStats");
            AbstractC6492s.i(wifiNetworkConfig, "wifiNetworkConfig");
            S8.c cVar = (S8.c) c6556a.a();
            ArrayList arrayList = new ArrayList();
            List listS = M8.r.s(signals, devices, signalStats, wifiNetworkConfig.b(), cVar);
            List arrayList2 = new ArrayList(AbstractC3689v.w(listS, 10));
            Iterator it = listS.iterator();
            while (it.hasNext()) {
                arrayList2.add(new a.C0159a((C2428c) it.next()));
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            if (arrayList2 == null) {
                arrayList2 = AbstractC3689v.e(new a.b((cVar == null ? -1 : b.f12990a[cVar.ordinal()]) == -1 ? new d.b(R.string.wifi_network_detail_empty) : new d.a("empty", new C0509a(cVar))));
            }
            arrayList.add(new C2706g.a.C0194a("accessPoints", null, null, arrayList2, 6, null));
            return new C2706g(arrayList);
        }
    }

    /* renamed from: M8.g$b */
    static final class b implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f12991a = new b();

        b() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(C6556a c6556a, List networks) {
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(networks, "networks");
            S8.c cVar = (S8.c) c6556a.a();
            if (cVar == null) {
                return networks;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : networks) {
                List listA = ((C6585f) obj).a();
                if (!(listA instanceof Collection) || !listA.isEmpty()) {
                    Iterator it = listA.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((C6588i) it.next()).f().a() == cVar) {
                            arrayList.add(obj);
                            break;
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    /* renamed from: M8.g$c */
    static final class c implements kg.g {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean d(Cf.c cVar, C6588i signal) {
            AbstractC6492s.i(signal, "signal");
            return AbstractC6492s.d(signal.r().b(), cVar.a());
        }

        @Override // kg.g
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Bf.b a(final Cf.c params, List networks, C6556a c6556a) {
            Bf.b bVarQ;
            AbstractC6492s.i(params, "params");
            AbstractC6492s.i(networks, "networks");
            AbstractC6492s.i(c6556a, "<destruct>");
            S8.c cVar = (S8.c) c6556a.a();
            return (cVar == null || (bVarQ = C3298g.this.q(cVar, AbstractC3689v.d0(networks), new InterfaceC6835l() { // from class: M8.h
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(C3298g.c.d(params, (C6588i) obj));
                }
            })) == null) ? K.a.j(C3298g.this, S8.c.GHZ_2_4, AbstractC8783m.s(new C6585f[0]), null, 4, null) : bVarQ;
        }
    }

    /* renamed from: M8.g$d */
    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f12993a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(C6556a it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(!(it.b() == null));
        }
    }

    /* renamed from: M8.g$e */
    static final class e implements InterfaceC6465b {
        e() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(Set supportedBands, C5354E config) {
            AbstractC6492s.i(supportedBands, "supportedBands");
            AbstractC6492s.i(config, "config");
            S8.c cVarA0 = C3298g.this.A0(config.c());
            if (!AbstractC3689v.f0(supportedBands, cVarA0)) {
                cVarA0 = null;
            }
            return new C6556a(cVarA0);
        }
    }

    /* renamed from: M8.g$f */
    static final class f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f12995a = new f();

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a) {
            Df.b bVar;
            s9.d bVar2;
            AbstractC6492s.i(c6556a, "<destruct>");
            C6585f c6585f = (C6585f) c6556a.a();
            if (c6585f != null) {
                List listA = c6585f.a();
                ArrayList arrayList = new ArrayList(AbstractC3689v.w(listA, 10));
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((C6588i) it.next()).f().d()));
                }
                List listV0 = AbstractC3689v.V0(AbstractC3689v.g0(arrayList));
                S8.j jVarP = c6585f.c().p();
                if (jVarP == null || (bVar2 = Af.y.c(jVarP)) == null) {
                    bVar2 = new d.b(R.string.value_not_available);
                }
                bVar = new Df.b(listV0, bVar2);
            } else {
                bVar = null;
            }
            return new C6556a(bVar);
        }
    }

    /* renamed from: M8.g$g, reason: collision with other inner class name */
    static final class C0510g implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final C0510g f12996a = new C0510g();

        C0510g() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(Cf.c params, List network) {
            Object next;
            AbstractC6492s.i(params, "params");
            AbstractC6492s.i(network, "network");
            Iterator it = network.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC6492s.d(((C6585f) next).c().r().b(), params.a())) {
                    break;
                }
            }
            return new C6556a(next);
        }
    }

    /* renamed from: M8.g$h */
    static final class h implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final h f12997a = new h();

        h() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(C6556a c6556a, C6556a c6556a2) {
            List listA;
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(c6556a2, "<destruct>");
            S8.c cVar = (S8.c) c6556a.a();
            C6585f c6585f = (C6585f) c6556a2.a();
            List arrayList = null;
            if (cVar == null) {
                if (c6585f != null) {
                    arrayList = c6585f.a();
                }
            } else if (c6585f != null && (listA = c6585f.a()) != null) {
                arrayList = new ArrayList();
                for (Object obj : listA) {
                    if (((C6588i) obj).f().a() == cVar) {
                        arrayList.add(obj);
                    }
                }
            }
            return arrayList == null ? AbstractC3689v.l() : arrayList;
        }
    }

    /* renamed from: M8.g$i */
    static final class i implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5969a f12998a;

        /* renamed from: M8.g$i$a */
        public static final class a implements gg.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C6585f f12999a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C5969a f13000b;

            public a(C6585f c6585f, C5969a c5969a) {
                this.f12999a = c6585f;
                this.f13000b = c5969a;
            }

            @Override // gg.q
            public final void a(gg.o oVar) {
                List listA;
                try {
                    C6585f c6585f = this.f12999a;
                    Object obj = null;
                    if (c6585f != null && (listA = c6585f.a()) != null) {
                        Iterator it = listA.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (AbstractC6492s.d(((C6588i) next).e(), this.f13000b)) {
                                obj = next;
                                break;
                            }
                        }
                        obj = (C6588i) obj;
                    }
                    if (obj != null) {
                        oVar.onSuccess(obj);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        i(C5969a c5969a) {
            this.f12998a = c5969a;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            gg.n nVarC = gg.n.c(new a((C6585f) c6556a.a(), this.f12998a));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    /* renamed from: M8.g$j */
    static final class j implements kg.n {
        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(C6588i accessPoint) {
            AbstractC6492s.i(accessPoint, "accessPoint");
            return C3298g.this.D0().a(new InterfaceC6084a.b.K(new xf.d(accessPoint.e())));
        }
    }

    /* renamed from: M8.g$k */
    public static final class k implements gg.k {
        public k() {
        }

        @Override // gg.k
        public final void a(gg.j it) {
            AbstractC6492s.i(it, "it");
            try {
                it.h(C3298g.this.r0());
            } catch (Throwable th2) {
                it.onError(th2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: M8.g$l */
    public static final class l extends org.kodein.type.o<InterfaceC6586g> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: M8.g$m */
    public static final class m extends org.kodein.type.o<InterfaceC5355F> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: M8.g$n */
    public static final class n extends org.kodein.type.o<Cc.n> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: M8.g$o */
    public static final class o extends org.kodein.type.o<C6937a.InterfaceC1989a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: M8.g$p */
    public static final class p extends org.kodein.type.o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: M8.g$q */
    public static final class q extends org.kodein.type.o<InterfaceC5352C> {
    }

    /* renamed from: M8.g$r */
    static final class r implements kg.g {

        /* renamed from: a, reason: collision with root package name */
        public static final r f13003a = new r();

        r() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Af.B a(C6556a c6556a, Set supportedBands, C6556a c6556a2) {
            int size;
            int size2;
            List listA;
            List listA2;
            List listA3;
            List listA4;
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(supportedBands, "supportedBands");
            AbstractC6492s.i(c6556a2, "<destruct>");
            S8.c cVar = (S8.c) c6556a.a();
            C6585f c6585f = (C6585f) c6556a2.a();
            ArrayList arrayList = new ArrayList();
            arrayList.add(null);
            S8.c cVar2 = S8.c.GHZ_2_4;
            if (supportedBands.contains(cVar2)) {
                arrayList.add(cVar2);
            }
            S8.c cVar3 = S8.c.GHZ_5;
            if (supportedBands.contains(cVar3)) {
                arrayList.add(cVar3);
            }
            S8.c cVar4 = S8.c.GHZ_6;
            if (supportedBands.contains(cVar4)) {
                arrayList.add(cVar4);
            }
            int size3 = 0;
            Yg.s sVarA = Yg.z.a(new C6556a(null), Integer.valueOf((c6585f == null || (listA4 = c6585f.a()) == null) ? 0 : listA4.size()));
            C6556a c6556a3 = new C6556a(cVar2);
            if (c6585f == null || (listA3 = c6585f.a()) == null) {
                size = 0;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listA3) {
                    if (((C6588i) obj).f().a() == S8.c.GHZ_2_4) {
                        arrayList2.add(obj);
                    }
                }
                size = arrayList2.size();
            }
            Yg.s sVarA2 = Yg.z.a(c6556a3, Integer.valueOf(size));
            C6556a c6556a4 = new C6556a(S8.c.GHZ_5);
            if (c6585f == null || (listA2 = c6585f.a()) == null) {
                size2 = 0;
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : listA2) {
                    if (((C6588i) obj2).f().a() == S8.c.GHZ_5) {
                        arrayList3.add(obj2);
                    }
                }
                size2 = arrayList3.size();
            }
            Yg.s sVarA3 = Yg.z.a(c6556a4, Integer.valueOf(size2));
            C6556a c6556a5 = new C6556a(S8.c.GHZ_6);
            if (c6585f != null && (listA = c6585f.a()) != null) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : listA) {
                    if (((C6588i) obj3).f().a() == S8.c.GHZ_6) {
                        arrayList4.add(obj3);
                    }
                }
                size3 = arrayList4.size();
            }
            return new Af.B(cVar, arrayList, U.k(sVarA, sVarA2, sVarA3, Yg.z.a(c6556a5, Integer.valueOf(size3))));
        }
    }

    /* renamed from: M8.g$s */
    static final class s implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final s f13004a = new s();

        s() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d.c apply(Cf.c it) {
            AbstractC6492s.i(it, "it");
            return new d.c(it.a());
        }
    }

    public C3298g(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f12970g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new l().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, InterfaceC6586g.class), null);
        th.l[] lVarArr = f12968y;
        this.f12971h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new m().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f12972i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, InterfaceC5355F.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new n().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f12973j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, Cc.n.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new o().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f12974k = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE4, C6937a.InterfaceC1989a.class), null).a(this, lVarArr[3]);
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new p().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f12975l = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE5, InterfaceC6084a.class), null).a(this, lVarArr[4]);
        org.kodein.type.i iVarE6 = org.kodein.type.s.e(new q().getSuperType());
        AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f12976m = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE6, InterfaceC5352C.class), null).a(this, lVarArr[5]);
        gg.i iVarI2 = gg.i.N(new k(), EnumC5911a.LATEST).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f12977n = iVarI2;
        gg.i iVarI22 = gg.i.v(G0().c(), C0().b(), new e()).W().o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f12978o = iVarI22;
        gg.i iVarI23 = gg.i.v(iVarI2, G0().e(), C0510g.f12996a).z1(new C6556a(null)).W().o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f12979p = iVarI23;
        gg.i iVarI24 = gg.i.v(iVarI22, G0().e(), b.f12991a).W().o1(1).i2();
        AbstractC6492s.h(iVarI24, "refCount(...)");
        this.f12980q = iVarI24;
        gg.i iVarI25 = gg.i.v(iVarI22, iVarI23, h.f12997a).W().o1(1).i2();
        AbstractC6492s.h(iVarI25, "refCount(...)");
        this.f12981r = iVarI25;
        gg.i iVarN0 = iVarI2.N0(s.f13004a);
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f12982s = AbstractC8661g.d0(this, iVarN0, new d.c(""), false, null, 6, null);
        gg.i iVarW = iVarI23.N0(f.f12995a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f12983t = AbstractC8661g.h0(this, iVarW, null, null, 2, null);
        gg.i iVarW2 = iVarI22.N0(d.f12993a).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f12984u = AbstractC8661g.d0(this, iVarW2, Boolean.FALSE, false, null, 6, null);
        gg.i iVarW3 = gg.i.u(iVarI2, iVarI24, iVarI22, new c()).W();
        AbstractC6492s.h(iVarW3, "distinctUntilChanged(...)");
        this.f12985v = AbstractC8661g.d0(this, iVarW3, K.a.j(this, S8.c.GHZ_2_4, AbstractC8783m.s(new C6585f[0]), null, 4, null), false, null, 6, null);
        gg.i iVarW4 = gg.i.u(iVarI22, G0().c(), iVarI23, r.f13003a).W();
        AbstractC6492s.h(iVarW4, "distinctUntilChanged(...)");
        this.f12986w = AbstractC8661g.d0(this, iVarW4, new Af.B(null, AbstractC3689v.l(), null, 4, null), false, null, 6, null);
        gg.i iVarW5 = gg.i.s(iVarI22, iVarI25, B0().a(), F0().getAll(), E0().b(), a.f12988a).W();
        AbstractC6492s.h(iVarW5, "distinctUntilChanged(...)");
        this.f12987x = AbstractC8661g.d0(this, iVarW5, new C2706g(AbstractC3689v.l()), false, null, 6, null);
    }

    private final Cc.n B0() {
        return (Cc.n) this.f12973j.getValue();
    }

    private final InterfaceC5355F C0() {
        return (InterfaceC5355F) this.f12972i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a D0() {
        return (InterfaceC6084a) this.f12975l.getValue();
    }

    private final InterfaceC5352C E0() {
        return (InterfaceC5352C) this.f12976m.getValue();
    }

    private final C6937a.InterfaceC1989a F0() {
        return (C6937a.InterfaceC1989a) this.f12974k.getValue();
    }

    private final InterfaceC6586g G0() {
        return (InterfaceC6586g) this.f12971h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5354E H0(C3298g c3298g, S8.c cVar, C5354E it) {
        AbstractC6492s.i(it, "it");
        return C5354E.b(it, c3298g.z0(cVar), null, null, null, 14, null);
    }

    public S8.c A0(ic.e eVar) {
        return K.a.e(this, eVar);
    }

    @Override // M8.K
    public Bf.b J(S8.c cVar, InterfaceC8780j interfaceC8780j, InterfaceC6835l interfaceC6835l) {
        return K.a.f(this, cVar, interfaceC8780j, interfaceC6835l);
    }

    @Override // Cf.d
    public N c() {
        return this.f12982s;
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f12970g;
    }

    @Override // Cf.d
    public N n0() {
        return this.f12987x;
    }

    @Override // Cf.d
    public N o0() {
        return this.f12985v;
    }

    @Override // Cf.d
    public N p0() {
        return this.f12984u;
    }

    @Override // M8.K
    public Bf.b q(S8.c cVar, InterfaceC8780j interfaceC8780j, InterfaceC6835l interfaceC6835l) {
        return K.a.i(this, cVar, interfaceC8780j, interfaceC6835l);
    }

    @Override // Cf.d
    public N q0() {
        return this.f12983t;
    }

    @Override // Cf.d
    public N s0() {
        return this.f12986w;
    }

    @Override // Cf.d
    public void t0(C5969a bssid) {
        AbstractC6492s.i(bssid, "bssid");
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bK = this.f12979p.o0().u(new i(bssid)).k(new j());
        AbstractC6492s.h(abstractC5912bK, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bK, this);
    }

    @Override // Cf.d
    public void u0() {
        C8658d.f66727a.d(D0().a(InterfaceC6084a.b.J.C1825b.f48915a), this);
    }

    @Override // Cf.d
    public void v0(final S8.c cVar) {
        C8658d.f66727a.d(C0().a(new InterfaceC6835l() { // from class: M8.f
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return C3298g.H0(this.f12966a, cVar, (C5354E) obj);
            }
        }), this);
    }

    public ic.e z0(S8.c cVar) {
        return K.a.d(this, cVar);
    }
}
