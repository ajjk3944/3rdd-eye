package z8;

import Cc.InterfaceC2557a;
import Ee.C2706g;
import Li.N;
import Te.C3578e0;
import Te.InterfaceC3590k0;
import Zg.AbstractC3689v;
import Zg.U;
import Zg.d0;
import a8.C3771a;
import a8.C3772b;
import ch.AbstractC4260a;
import com.ubnt.usurvey.R;
import com.ubnt.usurvey.product.m;
import com.ui.wifiman.model.wmw.WifimanWizard;
import com.ui.wifiman.ui.signal.AbstractC5234g;
import com.ui.wifiman.ui.signal.C5233f;
import gg.AbstractC5912b;
import gg.C;
import gg.InterfaceC5910A;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import i8.InterfaceC6084a;
import java.util.ArrayList;
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
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.V;
import l9.AbstractC6561f;
import l9.C6556a;
import le.C6588i;
import le.InterfaceC6586g;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import n8.AbstractC6912m;
import org.kodein.di.DI;
import re.InterfaceC7588a;
import re.InterfaceC7590c;
import rj.InterfaceC7810x2;
import s9.InterfaceC7929a;
import s9.d;
import sh.AbstractC7978m;
import ye.AbstractC8661g;
import ye.C8658d;
import zi.AbstractC8783m;

/* renamed from: z8.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8718c extends AbstractC5234g {

    /* renamed from: y, reason: collision with root package name */
    static final /* synthetic */ th.l[] f67166y = {O.h(new F(C8718c.class, "wizardApComparison", "getWizardApComparison()Lcom/ui/wifiman/model/wmw/compare/WifimanWizardApComparison;", 0)), O.h(new F(C8718c.class, "wifimanWizard", "getWifimanWizard()Lcom/ui/wifiman/model/wmw/WifimanWizard;", 0)), O.h(new F(C8718c.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new F(C8718c.class, "deviceManager", "getDeviceManager()Lcom/ui/wifiman/model/device/WifimanDeviceManager;", 0)), O.h(new F(C8718c.class, "wifiScan", "getWifiScan()Lcom/ui/wifiman/model/wifi/scan/WifiScannerService;", 0)), O.g(new D(C8718c.class, "inForegroundStream", "<v#0>", 0))};

    /* renamed from: z, reason: collision with root package name */
    public static final int f67167z = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f67168g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f67169h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f67170i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f67171j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f67172k;

    /* renamed from: l, reason: collision with root package name */
    private final Yg.m f67173l;

    /* renamed from: m, reason: collision with root package name */
    private final Fg.a f67174m;

    /* renamed from: n, reason: collision with root package name */
    private final gg.i f67175n;

    /* renamed from: o, reason: collision with root package name */
    private final gg.i f67176o;

    /* renamed from: p, reason: collision with root package name */
    private final Set f67177p;

    /* renamed from: q, reason: collision with root package name */
    private final gg.i f67178q;

    /* renamed from: r, reason: collision with root package name */
    private final gg.i f67179r;

    /* renamed from: s, reason: collision with root package name */
    private final gg.i f67180s;

    /* renamed from: t, reason: collision with root package name */
    private final gg.i f67181t;

    /* renamed from: u, reason: collision with root package name */
    private final N f67182u;

    /* renamed from: v, reason: collision with root package name */
    private final N f67183v;

    /* renamed from: w, reason: collision with root package name */
    private final N f67184w;

    /* renamed from: x, reason: collision with root package name */
    private final N f67185x;

    /* renamed from: z8.c$A */
    static final class A implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final A f67186a = new A();

        A() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d.c apply(InterfaceC7590c it) {
            AbstractC6492s.i(it, "it");
            return new d.c(it.f());
        }
    }

    /* renamed from: z8.c$B */
    static final class B implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final B f67187a = new B();

        B() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map apply(List it) {
            AbstractC6492s.i(it, "it");
            List list = it;
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(list, 10)), 16));
            for (Object obj : list) {
                linkedHashMap.put(((C6588i) obj).e(), obj);
            }
            return linkedHashMap;
        }
    }

    /* renamed from: z8.c$a, reason: case insensitive filesystem */
    private static final class C8719a {

        /* renamed from: a, reason: collision with root package name */
        private final S8.c f67188a;

        /* renamed from: b, reason: collision with root package name */
        private final C3578e0 f67189b;

        /* renamed from: c, reason: collision with root package name */
        private final List f67190c;

        /* renamed from: d, reason: collision with root package name */
        private final List f67191d;

        public C8719a(S8.c cVar, C3578e0 c3578e0, List apOnBand, List apSelectedOnOtherBands) {
            AbstractC6492s.i(apOnBand, "apOnBand");
            AbstractC6492s.i(apSelectedOnOtherBands, "apSelectedOnOtherBands");
            this.f67188a = cVar;
            this.f67189b = c3578e0;
            this.f67190c = apOnBand;
            this.f67191d = apSelectedOnOtherBands;
        }

        public final S8.c a() {
            return this.f67188a;
        }

        public final C3578e0 b() {
            return this.f67189b;
        }

        public final List c() {
            return this.f67190c;
        }

        public final List d() {
            return this.f67191d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8719a)) {
                return false;
            }
            C8719a c8719a = (C8719a) obj;
            return this.f67188a == c8719a.f67188a && AbstractC6492s.d(this.f67189b, c8719a.f67189b) && AbstractC6492s.d(this.f67190c, c8719a.f67190c) && AbstractC6492s.d(this.f67191d, c8719a.f67191d);
        }

        public int hashCode() {
            S8.c cVar = this.f67188a;
            int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
            C3578e0 c3578e0 = this.f67189b;
            return ((((iHashCode + (c3578e0 != null ? c3578e0.hashCode() : 0)) * 31) + this.f67190c.hashCode()) * 31) + this.f67191d.hashCode();
        }

        public String toString() {
            return "ApListData(band=" + this.f67188a + ", apOnBandCurrentlyConnected=" + this.f67189b + ", apOnBand=" + this.f67190c + ", apSelectedOnOtherBands=" + this.f67191d + ")";
        }
    }

    /* renamed from: z8.c$b, reason: case insensitive filesystem */
    static final class C8720b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C8720b f67192a = new C8720b();

        C8720b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(InterfaceC7590c it) {
            AbstractC6492s.i(it, "it");
            return it.c();
        }
    }

    /* renamed from: z8.c$c, reason: collision with other inner class name */
    static final class C2387c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C2387c f67193a = new C2387c();

        C2387c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map apply(Set it) {
            AbstractC6492s.i(it, "it");
            Map mapC = U.c();
            Iterator it2 = it.iterator();
            while (it2.hasNext()) {
                InterfaceC7588a.C2110a c2110a = (InterfaceC7588a.C2110a) it2.next();
                S8.c cVarA = c2110a.a();
                Object arrayList = mapC.get(cVarA);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    mapC.put(cVarA, arrayList);
                }
                V.c(arrayList).add(c2110a);
            }
            return U.b(mapC);
        }
    }

    /* renamed from: z8.c$d */
    static final class d implements kg.n {
        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(WifimanWizard.a state) {
            AbstractC6492s.i(state, "state");
            if ((state instanceof WifimanWizard.a.c) || (state instanceof WifimanWizard.a.b) || (state instanceof WifimanWizard.a.AbstractC1520a.d) || (state instanceof WifimanWizard.a.AbstractC1520a.b) || (state instanceof WifimanWizard.a.AbstractC1520a.c)) {
                gg.i iVarK0 = gg.i.K0(C8718c.this.f67177p);
                AbstractC6492s.h(iVarK0, "just(...)");
                return iVarK0;
            }
            if (state instanceof WifimanWizard.a.AbstractC1520a.C1521a) {
                return ((WifimanWizard.a.AbstractC1520a.C1521a) state).b().d().a();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: z8.c$e */
    static final class e implements kg.g {
        e() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final J9.j a(Set bandsSupported, C6556a c6556a, Map apPerBand) {
            AbstractC6492s.i(bandsSupported, "bandsSupported");
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(apPerBand, "apPerBand");
            return C8718c.this.F0(bandsSupported, (S8.c) c6556a.a(), apPerBand);
        }
    }

    /* renamed from: z8.c$f */
    static final class f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f67196a = new f();

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(InterfaceC7590c it) {
            AbstractC6492s.i(it, "it");
            return it.c();
        }
    }

    /* renamed from: z8.c$g */
    static final class g implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f67197a = new g();

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(InterfaceC7590c it) {
            AbstractC6492s.i(it, "it");
            return it.b();
        }
    }

    /* renamed from: z8.c$h */
    static final class h implements kg.j {

        /* renamed from: z8.c$h$a */
        public static final class a implements Comparator {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ S8.c f67199a;

            public a(S8.c cVar) {
                this.f67199a = cVar;
            }

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC4260a.e(Boolean.valueOf(((C3578e0) obj).a() == this.f67199a), Boolean.valueOf(((C3578e0) obj2).a() == this.f67199a));
            }
        }

        /* renamed from: z8.c$h$b */
        public static final class b implements Comparator {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Comparator f67200a;

            public b(Comparator comparator) {
                this.f67200a = comparator;
            }

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int iCompare = this.f67200a.compare(obj, obj2);
                return iCompare != 0 ? iCompare : AbstractC4260a.e(((C3578e0) obj).f(), ((C3578e0) obj2).f());
            }
        }

        h() {
        }

        @Override // kg.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C8719a a(Set apComparable, Set apComparing, Map signals, C3771a devices, C6556a c6556a, Boolean selectionEnabled) {
            AbstractC6492s.i(apComparable, "apComparable");
            AbstractC6492s.i(apComparing, "apComparing");
            AbstractC6492s.i(signals, "signals");
            AbstractC6492s.i(devices, "devices");
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(selectionEnabled, "selectionEnabled");
            S8.c cVar = (S8.c) c6556a.a();
            b bVar = new b(new a(cVar));
            Set setB = d0.b();
            Iterator it = apComparable.iterator();
            while (it.hasNext()) {
                InterfaceC7588a.C2110a c2110a = (InterfaceC7588a.C2110a) it.next();
                if (cVar == null || cVar == c2110a.a()) {
                    setB.add(c2110a);
                }
            }
            Set setA = d0.a(setB);
            C8718c c8718c = C8718c.this;
            ArrayList arrayList = new ArrayList();
            Iterator it2 = setA.iterator();
            C3578e0 c3578e0 = null;
            while (it2.hasNext()) {
                C3578e0 c3578e02 = c3578e0;
                C3578e0 c3578e0D0 = c8718c.D0((InterfaceC7588a.C2110a) it2.next(), signals, devices, apComparing, selectionEnabled.booleanValue());
                if (c3578e0D0.b()) {
                    c3578e02 = c3578e0D0;
                    c3578e0D0 = null;
                }
                if (c3578e0D0 != null) {
                    arrayList.add(c3578e0D0);
                }
                c3578e0 = c3578e02;
            }
            C3578e0 c3578e03 = c3578e0;
            List listX0 = AbstractC3689v.X0(arrayList, bVar);
            Set setB2 = d0.b();
            Iterator it3 = apComparing.iterator();
            while (it3.hasNext()) {
                InterfaceC7588a.C2110a c2110a2 = (InterfaceC7588a.C2110a) it3.next();
                if (cVar != null && cVar != c2110a2.a()) {
                    setB2.add(c2110a2);
                }
            }
            Set setA2 = d0.a(setB2);
            C8718c c8718c2 = C8718c.this;
            ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(setA2, 10));
            Iterator it4 = setA2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(c8718c2.D0((InterfaceC7588a.C2110a) it4.next(), signals, devices, apComparing, selectionEnabled.booleanValue()));
            }
            return new C8719a(cVar, c3578e03, listX0, AbstractC3689v.X0(arrayList2, bVar));
        }
    }

    /* renamed from: z8.c$i */
    static final class i implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final i f67201a = new i();

        /* renamed from: z8.c$i$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f67202a;

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
                f67202a = iArr;
            }
        }

        i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2706g apply(C8719a c8719a) {
            d.b bVar;
            AbstractC6492s.i(c8719a, "<destruct>");
            S8.c cVarA = c8719a.a();
            C3578e0 c3578e0B = c8719a.b();
            List listC = c8719a.c();
            List listD = c8719a.d();
            List listC2 = AbstractC3689v.c();
            if (c3578e0B != null) {
                listC2.add(new C2706g.a.C0194a("connected", null, null, AbstractC3689v.e(new InterfaceC3590k0.a(c3578e0B)), 6, null));
            }
            if (!listC.isEmpty()) {
                List list = listC;
                ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new InterfaceC3590k0.a((C3578e0) it.next()));
                }
                listC2.add(new C2706g.a.C0194a("ap", null, null, arrayList, 6, null));
            } else if (c3578e0B == null) {
                int i10 = cVarA == null ? -1 : a.f67202a[cVarA.ordinal()];
                if (i10 == -1) {
                    bVar = new d.b(R.string.signal_mapper_ap_comparison_no_access_points);
                } else if (i10 == 1) {
                    bVar = new d.b(R.string.signal_mapper_ap_comparison_no_access_points_on_band_2ghz);
                } else if (i10 == 2) {
                    bVar = new d.b(R.string.signal_mapper_ap_comparison_no_access_points_on_band_5ghz);
                } else {
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = new d.b(R.string.signal_mapper_ap_comparison_no_access_points);
                }
                listC2.add(new C2706g.a.b(new InterfaceC3590k0.b(bVar)));
            }
            if (!listD.isEmpty()) {
                d.b bVar2 = new d.b(R.string.signal_mapper_ap_comparison_card_title_comparion_on_other_bands);
                List list2 = listD;
                ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new InterfaceC3590k0.a((C3578e0) it2.next()));
                }
                listC2.add(new C2706g.a.C0194a("apOtherBand", bVar2, null, arrayList2, 4, null));
            }
            return new C2706g(AbstractC3689v.a(listC2));
        }
    }

    /* renamed from: z8.c$j */
    static final class j implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final j f67203a = new j();

        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(InterfaceC7588a.b state) {
            AbstractC6492s.i(state, "state");
            if (state instanceof InterfaceC7588a.b.C2111a) {
                return new C6556a(((InterfaceC7588a.b.C2111a) state).a());
            }
            if (state instanceof InterfaceC7588a.b.C2112b) {
                return new C6556a(null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: z8.c$k */
    public static final class k implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC4260a.e(Integer.valueOf(((S8.c) obj).ordinal()), Integer.valueOf(((S8.c) obj2).ordinal()));
        }
    }

    /* renamed from: z8.c$l */
    static final class l implements kg.p {

        /* renamed from: a, reason: collision with root package name */
        public static final l f67204a = new l();

        l() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(C6556a it) {
            AbstractC6492s.i(it, "it");
            return it.b() == null;
        }
    }

    /* renamed from: z8.c$m */
    static final class m implements kg.n {
        m() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(C6556a it) {
            AbstractC6492s.i(it, "it");
            return C8718c.this.J0().a(InterfaceC6084a.b.n.f48939a);
        }
    }

    /* renamed from: z8.c$n */
    static final class n implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f67207b;

        /* renamed from: z8.c$n$a */
        static final class a implements InterfaceC6465b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C8718c f67208a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f67209b;

            a(C8718c c8718c, String str) {
                this.f67208a = c8718c;
                this.f67209b = str;
            }

            @Override // kg.InterfaceC6465b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Set apply(Set comparing, Set comparable) {
                Object next;
                AbstractC6492s.i(comparing, "comparing");
                AbstractC6492s.i(comparable, "comparable");
                C8718c c8718c = this.f67208a;
                String str = this.f67209b;
                Set setB = d0.b();
                Iterator it = comparing.iterator();
                boolean z10 = false;
                while (it.hasNext()) {
                    InterfaceC7588a.C2110a c2110a = (InterfaceC7588a.C2110a) it.next();
                    if (AbstractC6492s.d(c8718c.I0(c2110a), str)) {
                        z10 = true;
                    } else {
                        setB.add(c2110a);
                    }
                }
                if (!z10) {
                    Iterator it2 = comparable.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (AbstractC6492s.d(c8718c.I0((InterfaceC7588a.C2110a) next), str)) {
                            break;
                        }
                    }
                    InterfaceC7588a.C2110a c2110a2 = (InterfaceC7588a.C2110a) next;
                    if (c2110a2 != null) {
                        setB.add(c2110a2);
                    }
                }
                return d0.a(setB);
            }
        }

        /* renamed from: z8.c$n$b */
        static final class b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC7590c f67210a;

            b(InterfaceC7590c interfaceC7590c) {
                this.f67210a = interfaceC7590c;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(Set apsToCompare) {
                AbstractC6492s.i(apsToCompare, "apsToCompare");
                return this.f67210a.g(apsToCompare);
            }
        }

        n(String str) {
            this.f67207b = str;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(InterfaceC7590c config) {
            AbstractC6492s.i(config, "config");
            return gg.i.v(config.b(), config.c(), new a(C8718c.this, this.f67207b)).o0().t(new b(config));
        }
    }

    /* renamed from: z8.c$o */
    public static final class o implements C {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f67212b;

        public o(int i10) {
            this.f67212b = i10;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            Object next;
            try {
                Iterator<E> it = S8.c.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (C8718c.this.Q0((S8.c) next) == this.f67212b) {
                        break;
                    }
                }
                interfaceC5910A.onSuccess(new C6556a(next));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* renamed from: z8.c$p */
    static final class p implements kg.n {

        /* renamed from: z8.c$p$a */
        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C8718c f67214a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C6556a f67215b;

            public a(C8718c c8718c, C6556a c6556a) {
                this.f67214a = c8718c;
                this.f67215b = c6556a;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    this.f67214a.f67174m.h(this.f67215b);
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        p() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(C6556a it) {
            AbstractC6492s.i(it, "it");
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(C8718c.this, it));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }
    }

    /* renamed from: z8.c$q */
    public static final class q implements InterfaceC5915e {
        public q() {
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                C8718c.this.f67174m.h(new C6556a(null));
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    /* renamed from: z8.c$r */
    static final class r implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final r f67217a = new r();

        r() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(InterfaceC7590c it) {
            AbstractC6492s.i(it, "it");
            return it.a();
        }
    }

    /* renamed from: z8.c$s */
    static final class s implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final s f67218a = new s();

        s() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(C5233f it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.b() < it.a());
        }
    }

    /* renamed from: z8.c$t */
    static final class t implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final t f67219a = new t();

        t() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(InterfaceC7590c it) {
            AbstractC6492s.i(it, "it");
            return it.b();
        }
    }

    /* renamed from: z8.c$u */
    static final class u implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final u f67220a = new u();

        u() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5233f apply(Set it) {
            AbstractC6492s.i(it, "it");
            return new C5233f(it.size(), 5);
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: z8.c$v */
    public static final class v extends org.kodein.type.o<InterfaceC7588a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: z8.c$w */
    public static final class w extends org.kodein.type.o<WifimanWizard> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: z8.c$x */
    public static final class x extends org.kodein.type.o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: z8.c$y */
    public static final class y extends org.kodein.type.o<Cc.n> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: z8.c$z */
    public static final class z extends org.kodein.type.o<InterfaceC6586g> {
    }

    public C8718c(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f67168g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new v().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, InterfaceC7588a.class), null);
        th.l[] lVarArr = f67166y;
        this.f67169h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new w().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f67170i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, WifimanWizard.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new x().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f67171j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, InterfaceC6084a.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new y().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f67172k = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE4, Cc.n.class), null).a(this, lVarArr[3]);
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new z().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f67173l = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE5, InterfaceC6586g.class), null).a(this, lVarArr[4]);
        Fg.a aVarK2 = Fg.a.k2(new C6556a(null));
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f67174m = aVarK2;
        gg.i iVarI2 = aVarK2.e1().Y0(Gg.a.a(), false, 1).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f67175n = iVarI2;
        gg.i iVarI22 = M0().getState().N0(j.f67203a).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f67176o = iVarI22;
        Set setI = d0.i(S8.c.GHZ_2_4, S8.c.GHZ_5);
        this.f67177p = setI;
        gg.i iVarI23 = AbstractC6561f.e(iVarI22).I1(t.f67219a).N0(u.f67220a).W().o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f67178q = iVarI23;
        gg.i iVarI24 = iVarI23.N0(s.f67218a).W().o1(1).i2();
        AbstractC6492s.h(iVarI24, "refCount(...)");
        this.f67179r = iVarI24;
        gg.i iVarI25 = K0().a().N0(B.f67187a).o1(1).i2();
        AbstractC6492s.h(iVarI25, "refCount(...)");
        this.f67180s = iVarI25;
        gg.i iVarI26 = AbstractC6561f.e(iVarI22).I1(C8720b.f67192a).N0(C2387c.f67193a).W().o1(1).i2();
        AbstractC6492s.h(iVarI26, "refCount(...)");
        this.f67181t = iVarI26;
        gg.i iVarW = AbstractC6561f.e(iVarI22).N0(A.f67186a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f67182u = AbstractC8661g.d0(this, iVarW, new d.c(""), false, null, 6, null);
        gg.i iVarW2 = gg.i.u(L0().getState().I1(new d()), iVarI2, iVarI26, new e()).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f67183v = AbstractC8661g.d0(this, iVarW2, F0(setI, null, U.h()), false, null, 6, null);
        this.f67184w = AbstractC8661g.d0(this, iVarI23, new C5233f(0, 5), false, null, 6, null);
        gg.i iVarN0 = gg.i.r(AbstractC6561f.e(iVarI22).I1(f.f67196a), AbstractC6561f.e(iVarI22).I1(g.f67197a), iVarI25, H0().a(), iVarI2, iVarI24, new h()).W().N0(i.f67201a);
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f67185x = AbstractC8661g.d0(this, iVarN0, new C2706g(AbstractC3689v.l()), false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3578e0 D0(InterfaceC7588a.C2110a c2110a, Map map, C3771a c3771a, Set set, boolean z10) {
        InterfaceC7929a interfaceC7929aC;
        String name;
        InterfaceC2557a.b bVar = (InterfaceC2557a.b) c3771a.a(C3772b.f25747c.b(c2110a.b()));
        boolean zContains = set.contains(c2110a);
        C6588i c6588i = (C6588i) map.get(c2110a.b());
        String strI0 = I0(c2110a);
        if (bVar == null || (interfaceC7929aC = AbstractC6912m.e(bVar, m.c.SMALL, Pe.a.f18599a.c())) == null) {
            interfaceC7929aC = Pe.a.f18599a.c();
        }
        return new C3578e0(strI0, zContains, interfaceC7929aC, (bVar == null || (name = bVar.getName()) == null) ? C3578e0.a.b.f21829a : new C3578e0.a.C0803a(new d.c(name)), c2110a.b(), c6588i != null ? c6588i.q() : null, c2110a.a(), zContains || z10, (c6588i != null ? c6588i.m() : null) instanceof AbstractC6456a.AbstractC1905a);
    }

    private final J9.a E0(S8.c cVar, boolean z10, int i10) {
        return new J9.a(Q0(cVar), Ne.h.g(cVar, i10), null, z10, null, null, 52, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final J9.j F0(Set set, S8.c cVar, Map map) {
        List listC = AbstractC3689v.c();
        listC.add(E0(null, cVar == null, AbstractC8783m.U(AbstractC8783m.N(U.y(map), new InterfaceC6835l() { // from class: z8.b
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return Integer.valueOf(C8718c.G0((Map.Entry) obj));
            }
        }))));
        for (S8.c cVar2 : AbstractC3689v.X0(set, new k())) {
            boolean z10 = cVar == cVar2;
            List list = (List) map.get(cVar2);
            listC.add(E0(cVar2, z10, list != null ? list.size() : 0));
        }
        return new J9.j(AbstractC3689v.a(listC));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int G0(Map.Entry entry) {
        AbstractC6492s.i(entry, "<destruct>");
        return ((List) entry.getValue()).size();
    }

    private final Cc.n H0() {
        return (Cc.n) this.f67172k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String I0(InterfaceC7588a.C2110a c2110a) {
        return c2110a.b().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a J0() {
        return (InterfaceC6084a) this.f67171j.getValue();
    }

    private final InterfaceC6586g K0() {
        return (InterfaceC6586g) this.f67173l.getValue();
    }

    private final WifimanWizard L0() {
        return (WifimanWizard) this.f67170i.getValue();
    }

    private final InterfaceC7588a M0() {
        return (InterfaceC7588a) this.f67169h.getValue();
    }

    private final void N0() {
        C8658d c8658d = C8658d.f66727a;
        c8658d.e(P0(C8658d.c(c8658d, this, null, new InterfaceC6824a() { // from class: z8.a
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return C8718c.O0(this.f67165a);
            }
        }, 1, null)), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.i O0(C8718c c8718c) {
        gg.i iVarC0 = c8718c.f67176o.m0(l.f67204a).o0().t(c8718c.new m()).c0();
        AbstractC6492s.h(iVarC0, "toFlowable(...)");
        return iVarC0;
    }

    private static final gg.i P0(C8658d.a aVar) {
        return aVar.c(null, f67166y[5]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Q0(S8.c cVar) {
        if (cVar != null) {
            return cVar.ordinal();
        }
        return -1;
    }

    @Override // com.ui.wifiman.ui.signal.AbstractC5234g
    public N c() {
        return this.f67182u;
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f67168g;
    }

    @Override // ye.AbstractC8661g
    public void l0() {
        super.l0();
        N0();
    }

    @Override // com.ui.wifiman.ui.signal.AbstractC5234g
    public N n0() {
        return this.f67183v;
    }

    @Override // com.ui.wifiman.ui.signal.AbstractC5234g
    public N o0() {
        return this.f67185x;
    }

    @Override // com.ui.wifiman.ui.signal.AbstractC5234g
    public N p0() {
        return this.f67184w;
    }

    @Override // com.ui.wifiman.ui.signal.AbstractC5234g
    public void q0(String id2) {
        AbstractC6492s.i(id2, "id");
        C8658d c8658d = C8658d.f66727a;
        gg.z zVarO0 = this.f67176o.o0();
        AbstractC6492s.h(zVarO0, "firstOrError(...)");
        AbstractC5912b abstractC5912bK = AbstractC6561f.f(zVarO0).k(new n(id2));
        AbstractC6492s.h(abstractC5912bK, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bK, this);
    }

    @Override // com.ui.wifiman.ui.signal.AbstractC5234g
    public void r0(int i10) {
        C8658d c8658d = C8658d.f66727a;
        gg.z zVarI = gg.z.i(new o(i10));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bT = zVarI.t(new p());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }

    @Override // com.ui.wifiman.ui.signal.AbstractC5234g
    public void s0() {
        C8658d c8658d = C8658d.f66727a;
        gg.z zVarO0 = this.f67176o.o0();
        AbstractC6492s.h(zVarO0, "firstOrError(...)");
        AbstractC5912b abstractC5912bK = AbstractC6561f.f(zVarO0).k(r.f67217a);
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new q());
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bP = AbstractC5912b.p(abstractC5912bK, abstractC5912bR);
        AbstractC6492s.h(abstractC5912bP, "concatArray(...)");
        c8658d.d(abstractC5912bP, this);
    }

    @Override // com.ui.wifiman.ui.signal.AbstractC5234g
    public void t0() {
        C8658d.f66727a.d(J0().a(InterfaceC6084a.b.n.f48939a), this);
    }
}
