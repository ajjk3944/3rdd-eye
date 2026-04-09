package C8;

import Li.N;
import P7.c;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Te.E;
import Yg.m;
import Zg.AbstractC3689v;
import android.content.Context;
import android.text.format.DateUtils;
import com.ubnt.usurvey.R;
import com.ui.wifiman.ui.signal.D;
import com.ui.wifiman.ui.signal.E;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import gg.AbstractC5912b;
import gg.EnumC5911a;
import gg.o;
import gg.r;
import i8.InterfaceC6084a;
import java.util.ArrayList;
import java.util.List;
import kg.n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import mh.q;
import nd.C6934f;
import nd.InterfaceC6935g;
import org.kodein.di.DI;
import org.kodein.type.s;
import rj.InterfaceC7810x2;
import s9.d;
import th.l;
import ye.AbstractC8661g;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class b extends E {

    /* renamed from: o, reason: collision with root package name */
    static final /* synthetic */ l[] f2332o = {O.h(new F(b.class, "placesManager", "getPlacesManager()Lcom/ui/wifiman/model/signalmapper/SignalMapperPlacesManager;", 0)), O.h(new F(b.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new F(b.class, "analytics", "getAnalytics()Lcom/ubnt/usurvey/analytics/Analytics;", 0))};

    /* renamed from: p, reason: collision with root package name */
    public static final int f2333p = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f2334g;

    /* renamed from: h, reason: collision with root package name */
    private final m f2335h;

    /* renamed from: i, reason: collision with root package name */
    private final m f2336i;

    /* renamed from: j, reason: collision with root package name */
    private final m f2337j;

    /* renamed from: k, reason: collision with root package name */
    private final gg.i f2338k;

    /* renamed from: l, reason: collision with root package name */
    private final gg.i f2339l;

    /* renamed from: m, reason: collision with root package name */
    private final N f2340m;

    /* renamed from: n, reason: collision with root package name */
    private final N f2341n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        private final int titleRes;
        public static final a SSID = new a("SSID", 0, R.string.wifi_ssid);
        public static final a AP_NAME = new a("AP_NAME", 1, R.string.device_ap_name);
        public static final a AP_MODEL = new a("AP_MODEL", 2, R.string.device_ap_model);
        public static final a SIGNAL_WIFI = new a("SIGNAL_WIFI", 3, R.string.wifi_signal_strength);
        public static final a CELLULAR_SIGNAL = new a("CELLULAR_SIGNAL", 4, R.string.cellular_signal_strength);
        public static final a CELLULAR_CONNECTION = new a("CELLULAR_CONNECTION", 5, R.string.device_cellular_connection_type);
        public static final a CELLULAR_SIGNAL_SIM_0 = new a("CELLULAR_SIGNAL_SIM_0", 6, R.string.device_cellular_signal_sim_1);
        public static final a CELLULAR_CONNECTION_SIM_0 = new a("CELLULAR_CONNECTION_SIM_0", 7, R.string.device_cellular_connection_type_sim_1);
        public static final a CELLULAR_SIGNAL_SIM_1 = new a("CELLULAR_SIGNAL_SIM_1", 8, R.string.device_cellular_signal_sim_2);
        public static final a CELLULAR_CONNECTION_SIM_1 = new a("CELLULAR_CONNECTION_SIM_1", 9, R.string.device_cellular_connection_type_sim_2);
        public static final a THROUGHPUT = new a("THROUGHPUT", 10, R.string.signal_mapper_place_throughput);
        public static final a WIFI_MODE = new a("WIFI_MODE", 11, R.string.wifi_ap_detail_phy_mode);
        public static final a WIFI_BAND = new a("WIFI_BAND", 12, R.string.wifi_band);
        public static final a CREATED = new a("CREATED", 13, R.string.signal_mapper_place_created_timestamp);

        private static final /* synthetic */ a[] $values() {
            return new a[]{SSID, AP_NAME, AP_MODEL, SIGNAL_WIFI, CELLULAR_SIGNAL, CELLULAR_CONNECTION, CELLULAR_SIGNAL_SIM_0, CELLULAR_CONNECTION_SIM_0, CELLULAR_SIGNAL_SIM_1, CELLULAR_CONNECTION_SIM_1, THROUGHPUT, WIFI_MODE, WIFI_BAND, CREATED};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
        }

        private a(String str, int i10, int i11) {
            this.titleRes = i11;
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final int getTitleRes() {
            return this.titleRes;
        }
    }

    /* renamed from: C8.b$b, reason: collision with other inner class name */
    static final class C0104b implements n {

        /* renamed from: C8.b$b$a */
        static final class a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C6934f f2343a;

            a(C6934f c6934f) {
                this.f2343a = c6934f;
            }

            public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(context, "context");
                interfaceC3540l.U(-1116049391);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1116049391, i10, -1, "com.ubnt.usurvey.ui.signal.places.SignalTabPlaceDetailVM.items.<anonymous>.<anonymous> (SignalTabPlaceDetailVM.kt:159)");
                }
                CharSequence relativeDateTimeString = DateUtils.getRelativeDateTimeString(context, this.f2343a.e(), 60000L, 86400000L, 128);
                AbstractC6492s.h(relativeDateTimeString, "getRelativeDateTimeString(...)");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
                interfaceC3540l.J();
                return relativeDateTimeString;
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            }
        }

        /* renamed from: C8.b$b$b, reason: collision with other inner class name */
        static final class C0105b implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ S8.a f2344a;

            C0105b(S8.a aVar) {
                this.f2344a = aVar;
            }

            public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(context, "context");
                interfaceC3540l.U(-50095521);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-50095521, i10, -1, "com.ubnt.usurvey.ui.signal.places.SignalTabPlaceDetailVM.items.<anonymous>.<anonymous>.<anonymous> (SignalTabPlaceDetailVM.kt:114)");
                }
                String strC = Ne.b.c(this.f2344a, context);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
                interfaceC3540l.J();
                return strC;
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            }
        }

        C0104b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(C6934f it) {
            AbstractC6492s.i(it, "it");
            ArrayList arrayList = new ArrayList();
            String strR = it.r();
            if (strR != null) {
                b.this.t0(arrayList, a.SSID, new d.c(strR));
            }
            String strA = it.a();
            if (strA != null) {
                b.this.t0(arrayList, a.AP_MODEL, new d.c(strA));
            }
            String strB = it.b();
            if (strB != null) {
                b.this.t0(arrayList, a.AP_NAME, new d.c(strB));
            }
            S8.l lVarL = it.l();
            if (lVarL != null) {
                b.this.t0(arrayList, a.SIGNAL_WIFI, Ne.f.h(lVarL, true, null, 2, null));
            }
            W7.a aVarS = it.s();
            if (aVarS != null) {
                b.this.t0(arrayList, a.THROUGHPUT, L8.b.a(aVarS, 1));
            }
            S8.c cVarC = it.c();
            if (cVarC != null) {
                b.this.t0(arrayList, a.WIFI_BAND, Ne.h.c(cVarC));
            }
            S8.a aVarH = it.h();
            if (aVarH != null) {
                b.this.t0(arrayList, a.WIFI_MODE, new d.a(String.valueOf(aVarH), new C0105b(aVarH)));
            }
            if (it.n() == null || it.p() == null) {
                V7.a aVarN = it.n();
                if (aVarN == null) {
                    aVarN = it.p();
                }
                if (aVarN != null) {
                    b.this.t0(arrayList, a.CELLULAR_SIGNAL, Ne.f.h(aVarN, true, null, 2, null));
                }
                V7.b bVarM = it.m();
                if (bVarM == null) {
                    bVarM = it.o();
                }
                if (bVarM != null) {
                    b.this.t0(arrayList, a.CELLULAR_CONNECTION, new d.b(Ne.a.a(bVarM)));
                }
            } else {
                b.this.t0(arrayList, a.CELLULAR_SIGNAL_SIM_0, Ne.f.h(it.n(), true, null, 2, null));
                V7.b bVarM2 = it.m();
                if (bVarM2 != null) {
                    b.this.t0(arrayList, a.CELLULAR_CONNECTION_SIM_0, new d.b(Ne.a.a(bVarM2)));
                }
                b.this.t0(arrayList, a.CELLULAR_SIGNAL_SIM_1, Ne.f.h(it.p(), true, null, 2, null));
                V7.b bVarO = it.o();
                if (bVarO != null) {
                    b.this.t0(arrayList, a.CELLULAR_CONNECTION_SIM_1, new d.b(Ne.a.a(bVarO)));
                }
            }
            b.this.t0(arrayList, a.CREATED, new d.a(String.valueOf(it.e()), new a(it)));
            return arrayList;
        }
    }

    static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f2345a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String apply(C6934f it) {
            AbstractC6492s.i(it, "it");
            return it.g();
        }
    }

    static final class d implements n {
        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(String placeId) {
            AbstractC6492s.i(placeId, "placeId");
            return b.this.v0().a(placeId);
        }
    }

    static final class e implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f2347a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String apply(D it) {
            AbstractC6492s.i(it, "it");
            return it.a();
        }
    }

    static final class f implements n {

        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f2349a = new a();

            /* renamed from: C8.b$f$a$a, reason: collision with other inner class name */
            public static final class C0106a implements gg.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C6934f f2350a;

                public C0106a(C6934f c6934f) {
                    this.f2350a = c6934f;
                }

                @Override // gg.q
                public final void a(o oVar) {
                    try {
                        C6934f c6934f = this.f2350a;
                        if (c6934f != null) {
                            oVar.onSuccess(c6934f);
                        } else {
                            oVar.a();
                        }
                    } catch (Throwable th2) {
                        oVar.onError(th2);
                    }
                }
            }

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r apply(C6556a c6556a) {
                AbstractC6492s.i(c6556a, "<destruct>");
                gg.n nVarC = gg.n.c(new C0106a((C6934f) c6556a.a()));
                AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
                return nVarC;
            }
        }

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(String id2) {
            AbstractC6492s.i(id2, "id");
            return b.this.v0().e(id2).v0(a.f2349a);
        }
    }

    public static final class g implements gg.k {
        public g() {
        }

        @Override // gg.k
        public final void a(gg.j it) {
            AbstractC6492s.i(it, "it");
            try {
                it.h(b.this.o0());
            } catch (Throwable th2) {
                it.onError(th2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h extends org.kodein.type.o<InterfaceC6935g> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class i extends org.kodein.type.o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class j extends org.kodein.type.o<P7.a> {
    }

    static final class k implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final k f2352a = new k();

        k() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6934f it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(new d.c(it.j()));
        }
    }

    public b(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f2334g = di2;
        org.kodein.type.i iVarE = s.e(new h().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, InterfaceC6935g.class), null);
        l[] lVarArr = f2332o;
        this.f2335h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = s.e(new i().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f2336i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, InterfaceC6084a.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = s.e(new j().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f2337j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, P7.a.class), null).a(this, lVarArr[2]);
        gg.i iVarI2 = gg.i.N(new g(), EnumC5911a.LATEST).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f2338k = iVarI2;
        gg.i iVarI22 = iVarI2.N0(e.f2347a).W().I1(new f()).W().o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f2339l = iVarI22;
        gg.i iVarN0 = iVarI22.N0(k.f2352a);
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f2340m = AbstractC8661g.h0(this, iVarN0, null, null, 2, null);
        gg.i iVarN02 = iVarI22.N0(new C0104b());
        AbstractC6492s.h(iVarN02, "map(...)");
        this.f2341n = AbstractC8661g.d0(this, iVarN02, AbstractC3689v.l(), false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0(List list, a aVar, s9.d dVar) {
        list.add(new E.a(aVar.name(), new d.b(aVar.getTitleRes()), dVar));
    }

    private final P7.a u0() {
        return (P7.a) this.f2337j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6935g v0() {
        return (InterfaceC6935g) this.f2335h.getValue();
    }

    private final InterfaceC6084a w0() {
        return (InterfaceC6084a) this.f2336i.getValue();
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f2334g;
    }

    @Override // com.ui.wifiman.ui.signal.E
    public N getTitle() {
        return this.f2340m;
    }

    @Override // com.ui.wifiman.ui.signal.E
    public N n0() {
        return this.f2341n;
    }

    @Override // com.ui.wifiman.ui.signal.E
    public void p0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bP = AbstractC5912b.p(this.f2339l.N0(c.f2345a).o0().t(new d()), u0().d(new c.f.b()), w0().a(InterfaceC6084a.b.n.f48939a));
        AbstractC6492s.h(abstractC5912bP, "concatArray(...)");
        c8658d.d(abstractC5912bP, this);
    }
}
