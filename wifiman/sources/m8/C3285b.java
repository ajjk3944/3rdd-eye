package M8;

import Be.A0;
import Cc.InterfaceC2557a;
import Ee.C2706g;
import Je.b;
import Li.N;
import M8.C3285b;
import M8.K;
import S8.e;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Tc.a;
import Zg.AbstractC3689v;
import a8.C3771a;
import a8.C3772b;
import android.content.Context;
import com.ubnt.usurvey.R;
import com.ubnt.usurvey.wifi.WifiMcs;
import gg.AbstractC5912b;
import gg.EnumC5911a;
import h9.C5969a;
import i8.InterfaceC6084a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import je.AbstractC6317r;
import je.C6316q;
import k8.AbstractC6404d;
import ke.AbstractC6456a;
import ke.AbstractC6458c;
import kg.InterfaceC6465b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import l9.C6556a;
import le.C6585f;
import le.C6588i;
import le.InterfaceC6586g;
import md.C6796a;
import md.InterfaceC6797b;
import mh.InterfaceC6835l;
import ne.C6937a;
import oh.AbstractC7137b;
import org.kodein.di.DI;
import p8.AbstractC7271l;
import rj.InterfaceC7810x2;
import s9.d;
import sh.C7974i;
import vf.AbstractC8227g;
import xf.b;
import xf.c;
import ye.AbstractC8661g;
import ye.C8658d;
import yf.InterfaceC8665a;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* renamed from: M8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3285b extends xf.e implements K {

    /* renamed from: A, reason: collision with root package name */
    private final N f12854A;

    /* renamed from: B, reason: collision with root package name */
    private final N f12855B;

    /* renamed from: C, reason: collision with root package name */
    private final gg.i f12856C;

    /* renamed from: D, reason: collision with root package name */
    private final N f12857D;

    /* renamed from: g, reason: collision with root package name */
    private final DI f12858g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f12859h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f12860i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f12861j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f12862k;

    /* renamed from: l, reason: collision with root package name */
    private final Yg.m f12863l;

    /* renamed from: m, reason: collision with root package name */
    private final Yg.m f12864m;

    /* renamed from: n, reason: collision with root package name */
    private final Yg.m f12865n;

    /* renamed from: o, reason: collision with root package name */
    private final gg.i f12866o;

    /* renamed from: p, reason: collision with root package name */
    private final gg.i f12867p;

    /* renamed from: q, reason: collision with root package name */
    private final gg.i f12868q;

    /* renamed from: r, reason: collision with root package name */
    private final gg.i f12869r;

    /* renamed from: s, reason: collision with root package name */
    private final N f12870s;

    /* renamed from: t, reason: collision with root package name */
    private final N f12871t;

    /* renamed from: u, reason: collision with root package name */
    private final N f12872u;

    /* renamed from: v, reason: collision with root package name */
    private final N f12873v;

    /* renamed from: w, reason: collision with root package name */
    private final gg.i f12874w;

    /* renamed from: x, reason: collision with root package name */
    private final N f12875x;

    /* renamed from: y, reason: collision with root package name */
    private final gg.i f12876y;

    /* renamed from: z, reason: collision with root package name */
    private final N f12877z;

    /* renamed from: F, reason: collision with root package name */
    static final /* synthetic */ th.l[] f12852F = {O.h(new kotlin.jvm.internal.F(C3285b.class, "wifiSurvey", "getWifiSurvey()Lcom/ui/wifiman/model/wifi/scan/WifiScannerService;", 0)), O.h(new kotlin.jvm.internal.F(C3285b.class, "wifiNetworks", "getWifiNetworks()Lcom/ui/wifiman/model/wifi/scan/WifiScannerService;", 0)), O.h(new kotlin.jvm.internal.F(C3285b.class, "deviceManager", "getDeviceManager()Lcom/ui/wifiman/model/device/WifimanDeviceManager;", 0)), O.h(new kotlin.jvm.internal.F(C3285b.class, "wifiSignalStats", "getWifiSignalStats()Lcom/ui/wifiman/model/wifi/scan/timelapse/WifiSignalTimelapse$Service;", 0)), O.h(new kotlin.jvm.internal.F(C3285b.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new kotlin.jvm.internal.F(C3285b.class, "settings", "getSettings()Lcom/ui/wifiman/model/settings/AppSettingsManager;", 0)), O.h(new kotlin.jvm.internal.F(C3285b.class, "wifiConnectionService", "getWifiConnectionService()Lcom/ui/wifiman/model/wifi/connection/WifiConnectionService;", 0))};

    /* renamed from: E, reason: collision with root package name */
    public static final C3286a f12851E = new C3286a(null);

    /* renamed from: G, reason: collision with root package name */
    public static final int f12853G = 8;

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: M8.b$A */
    public static final class A extends org.kodein.type.o<Cc.n> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: M8.b$B */
    public static final class B extends org.kodein.type.o<C6937a.InterfaceC1989a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: M8.b$C */
    public static final class C extends org.kodein.type.o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: M8.b$D */
    public static final class D extends org.kodein.type.o<InterfaceC6797b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: M8.b$E */
    public static final class E extends org.kodein.type.o<je.u> {
    }

    /* renamed from: M8.b$F */
    static final class F implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final F f12878a = new F();

        F() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            C6588i c6588i = (C6588i) c6556a.a();
            return Boolean.valueOf((c6588i != null ? c6588i.e() : null) != null);
        }
    }

    /* renamed from: M8.b$G */
    static final class G implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final G f12879a = new G();

        G() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(xf.d params, List accessPoints) {
            Object next;
            AbstractC6492s.i(params, "params");
            AbstractC6492s.i(accessPoints, "accessPoints");
            Iterator it = accessPoints.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC6492s.d(((C6588i) next).e(), params.a())) {
                    break;
                }
            }
            return new C6556a(next);
        }
    }

    /* renamed from: M8.b$a, reason: case insensitive filesystem */
    public static final class C3286a {
        public /* synthetic */ C3286a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3286a() {
        }
    }

    /* renamed from: M8.b$b, reason: collision with other inner class name */
    static final class C0505b implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final C0505b f12880a = new C0505b();

        C0505b() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(C6556a c6556a, List networks) {
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(networks, "networks");
            S8.c cVar = (S8.c) c6556a.a();
            if (cVar == null) {
                return AbstractC3689v.l();
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

    /* renamed from: M8.b$c, reason: case insensitive filesystem */
    static final class C3287c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C3287c f12881a = new C3287c();

        C3287c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a) {
            Df.b bVar;
            s9.d bVar2;
            AbstractC6492s.i(c6556a, "<destruct>");
            C6588i c6588i = (C6588i) c6556a.a();
            if (c6588i != null) {
                List listE = AbstractC3689v.e(Integer.valueOf(c6588i.f().d()));
                S8.j jVarP = c6588i.p();
                if (jVarP == null || (bVar2 = Af.y.c(jVarP)) == null) {
                    bVar2 = new d.b(R.string.value_not_available);
                }
                bVar = new Df.b(listE, bVar2);
            } else {
                bVar = null;
            }
            return new C6556a(bVar);
        }
    }

    /* renamed from: M8.b$d, reason: case insensitive filesystem */
    static final class C3288d implements kg.g {
        C3288d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean d(xf.d dVar, C6588i signal) {
            AbstractC6492s.i(signal, "signal");
            return AbstractC6492s.d(signal.e(), dVar.a());
        }

        @Override // kg.g
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Bf.b a(final xf.d params, List networks, C6556a c6556a) {
            Bf.b bVarQ;
            AbstractC6492s.i(params, "params");
            AbstractC6492s.i(networks, "networks");
            AbstractC6492s.i(c6556a, "<destruct>");
            S8.c cVar = (S8.c) c6556a.a();
            return (cVar == null || (bVarQ = C3285b.this.q(cVar, AbstractC3689v.d0(networks), new InterfaceC6835l() { // from class: M8.c
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(C3285b.C3288d.d(params, (C6588i) obj));
                }
            })) == null) ? K.a.j(C3285b.this, S8.c.GHZ_2_4, AbstractC8783m.s(new C6585f[0]), null, 4, null) : bVarQ;
        }
    }

    /* renamed from: M8.b$e, reason: case insensitive filesystem */
    static final class C3289e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C3289e f12883a = new C3289e();

        C3289e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a) {
            S8.e eVarF;
            AbstractC6492s.i(c6556a, "<destruct>");
            C6588i c6588i = (C6588i) c6556a.a();
            return new C6556a((c6588i == null || (eVarF = c6588i.f()) == null) ? null : eVarF.a());
        }
    }

    /* renamed from: M8.b$f, reason: case insensitive filesystem */
    static final class C3290f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C3290f f12884a = new C3290f();

        C3290f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(C6556a it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(!(it.b() == null));
        }
    }

    /* renamed from: M8.b$g, reason: case insensitive filesystem */
    static final class C3291g implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C3291g f12885a = new C3291g();

        C3291g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            C6588i c6588i = (C6588i) c6556a.a();
            return new C6556a(c6588i != null ? c6588i.e() : null);
        }
    }

    /* renamed from: M8.b$h */
    static final class h implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final h f12886a = new h();

        h() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a, AbstractC6317r connectionState) {
            C6316q c6316qP;
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(connectionState, "connectionState");
            C5969a c5969a = (C5969a) c6556a.a();
            W7.b bVarG = null;
            if (connectionState instanceof AbstractC6317r.b.a.C1874b) {
                AbstractC6317r.b.a.C1874b c1874b = (AbstractC6317r.b.a.C1874b) connectionState;
                W7.b bVarF = c1874b.f();
                if (bVarF != null && AbstractC6492s.d(c1874b.c(), c5969a)) {
                    bVarG = bVarF;
                }
            } else if (connectionState instanceof AbstractC6317r.b.a.C1873a) {
                if (c5969a != null && (c6316qP = ((AbstractC6317r.b.a.C1873a) connectionState).p(c5969a)) != null) {
                    bVarG = c6316qP.g();
                }
            } else if (!(connectionState instanceof AbstractC6317r.b.C1875b) && !(connectionState instanceof AbstractC6317r.a)) {
                throw new NoWhenBranchMatchedException();
            }
            return new C6556a(bVarG);
        }
    }

    /* renamed from: M8.b$i */
    static final class i implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final i f12887a = new i();

        i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            return Boolean.valueOf(((C6588i) c6556a.a()) != null);
        }
    }

    /* renamed from: M8.b$j */
    static final class j implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final j f12888a = new j();

        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final xf.b apply(Boolean hasSignal) {
            AbstractC6492s.i(hasSignal, "hasSignal");
            return hasSignal.booleanValue() ? b.a.f66036a : b.C2339b.f66037a;
        }
    }

    /* renamed from: M8.b$k */
    static final class k implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final k f12889a = new k();

        /* renamed from: M8.b$k$a */
        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f12890a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final xf.b apply(Long it) {
                AbstractC6492s.i(it, "it");
                return b.a.f66036a;
            }
        }

        k() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(xf.b cntType) {
            AbstractC6492s.i(cntType, "cntType");
            if (cntType instanceof b.C2339b) {
                gg.i iVarN0 = gg.i.d2(5000L, TimeUnit.MILLISECONDS).N0(a.f12890a);
                AbstractC6492s.h(iVarN0, "map(...)");
                return iVarN0;
            }
            if (!(cntType instanceof b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            gg.i iVarK0 = gg.i.K0(cntType);
            AbstractC6492s.h(iVarK0, "just(...)");
            return iVarK0;
        }
    }

    /* renamed from: M8.b$l */
    static final class l implements kg.p {

        /* renamed from: a, reason: collision with root package name */
        public static final l f12891a = new l();

        l() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(xf.b it) {
            AbstractC6492s.i(it, "it");
            return it instanceof b.a;
        }
    }

    /* renamed from: M8.b$m */
    static final class m implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final m f12892a = new m();

        m() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3772b apply(xf.d it) {
            AbstractC6492s.i(it, "it");
            return C3772b.f25747c.b(it.a());
        }
    }

    /* renamed from: M8.b$n */
    static final class n implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final n f12893a = new n();

        n() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C3772b id2, C3771a devices) {
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(devices, "devices");
            return new C6556a(devices.a(id2));
        }
    }

    /* renamed from: M8.b$o */
    static final class o implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final o f12894a = new o();

        o() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final xf.c apply(C6556a c6556a) {
            String name;
            AbstractC6492s.i(c6556a, "<destruct>");
            InterfaceC2557a.b bVar = (InterfaceC2557a.b) c6556a.a();
            return (bVar == null || (name = bVar.getName()) == null) ? c.b.f66039a : new c.a(new d.c(name));
        }
    }

    /* renamed from: M8.b$p */
    static final class p implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final p f12895a = new p();

        p() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a) {
            Object objA;
            AbstractC6492s.i(c6556a, "<destruct>");
            InterfaceC2557a.b bVar = (InterfaceC2557a.b) c6556a.a();
            if (bVar == null || (objA = AbstractC7271l.b(bVar)) == null) {
                objA = bVar != null ? AbstractC7271l.a(bVar) : null;
            }
            return new C6556a(objA);
        }
    }

    /* renamed from: M8.b$q */
    static final class q implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final q f12896a = new q();

        q() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2706g apply(List general) {
            AbstractC6492s.i(general, "general");
            ArrayList arrayList = new ArrayList();
            if (!general.isEmpty()) {
                arrayList.add(new C2706g.a.C0194a("general", null, null, general, 6, null));
            }
            return new C2706g(arrayList);
        }
    }

    /* renamed from: M8.b$r */
    static final class r implements kg.h {

        /* renamed from: M8.b$r$a */
        static final class a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f12898a;

            a(int i10) {
                this.f12898a = i10;
            }

            public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(context, "context");
                interfaceC3540l.U(-1797082792);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1797082792, i10, -1, "com.ubnt.usurvey.ui.wifi.WifiAccessPointDetailVM.infoKeyVal.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WifiAccessPointDetailVM.kt:469)");
                }
                String string = context.getString(R.string.unit_percent_format);
                AbstractC6492s.h(string, "getString(...)");
                String str = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(this.f12898a)}, 1));
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

        /* renamed from: M8.b$r$b, reason: collision with other inner class name */
        static final class C0506b implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C6588i f12899a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C6796a f12900b;

            C0506b(C6588i c6588i, C6796a c6796a) {
                this.f12899a = c6588i;
                this.f12900b = c6796a;
            }

            public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(context, "context");
                interfaceC3540l.U(-1692534206);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1692534206, i10, -1, "com.ubnt.usurvey.ui.wifi.WifiAccessPointDetailVM.infoKeyVal.<anonymous>.<anonymous>.<anonymous> (WifiAccessPointDetailVM.kt:491)");
                }
                String string = context.getString(R.string.value_approximate_format);
                AbstractC6492s.h(string, "getString(...)");
                String str = String.format(string, Arrays.copyOf(new Object[]{AbstractC6404d.c(AbstractC6404d.f51302a.a(this.f12899a.j(), this.f12900b.g()), context, false, false, null, null, 30, null)}, 1));
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

        /* renamed from: M8.b$r$c */
        static final class c implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C6588i f12901a;

            c(C6588i c6588i) {
                this.f12901a = c6588i;
            }

            public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
                String str;
                AbstractC6492s.i(context, "context");
                interfaceC3540l.U(-1677773564);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1677773564, i10, -1, "com.ubnt.usurvey.ui.wifi.WifiAccessPointDetailVM.infoKeyVal.<anonymous>.<anonymous>.<anonymous> (WifiAccessPointDetailVM.kt:354)");
                }
                if (this.f12901a.f().a() == S8.c.GHZ_2_4 && (this.f12901a.f().e() instanceof e.b.a)) {
                    String string = context.getString(R.string.wifi_channel_with_frequency_range_format);
                    AbstractC6492s.h(string, "getString(...)");
                    str = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(this.f12901a.f().d()), Integer.valueOf(((C7974i) AbstractC3689v.q0(this.f12901a.f().e().b())).i()), Integer.valueOf(((C7974i) AbstractC3689v.B0(this.f12901a.f().e().b())).j())}, 3));
                    AbstractC6492s.h(str, "format(...)");
                } else {
                    e.b bVarE = this.f12901a.f().e();
                    if (bVarE instanceof e.b.C0729b) {
                        String string2 = context.getString(R.string.wifi_channel_with_frequency_range_format);
                        AbstractC6492s.h(string2, "getString(...)");
                        str = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(this.f12901a.f().d()), Integer.valueOf(((C7974i) AbstractC3689v.q0(this.f12901a.f().e().b())).i()), Integer.valueOf(((C7974i) AbstractC3689v.q0(this.f12901a.f().e().b())).j())}, 3));
                        AbstractC6492s.h(str, "format(...)");
                    } else {
                        if (!(bVarE instanceof e.b.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String string3 = context.getString(R.string.wifi_channel_with_frequency_range_format_extended);
                        AbstractC6492s.h(string3, "getString(...)");
                        str = String.format(string3, Arrays.copyOf(new Object[]{Integer.valueOf(this.f12901a.f().d()), Integer.valueOf(((C7974i) AbstractC3689v.q0(this.f12901a.f().e().b())).i()), Integer.valueOf(((C7974i) AbstractC3689v.q0(this.f12901a.f().e().b())).j()), Integer.valueOf(((C7974i) AbstractC3689v.B0(this.f12901a.f().e().b())).i()), Integer.valueOf(((C7974i) AbstractC3689v.B0(this.f12901a.f().e().b())).j())}, 5));
                        AbstractC6492s.h(str, "format(...)");
                    }
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

        /* renamed from: M8.b$r$d */
        static final class d implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ S8.a f12902a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C6588i f12903b;

            d(S8.a aVar, C6588i c6588i) {
                this.f12902a = aVar;
                this.f12903b = c6588i;
            }

            public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(context, "context");
                interfaceC3540l.U(1177877752);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1177877752, i10, -1, "com.ubnt.usurvey.ui.wifi.WifiAccessPointDetailVM.infoKeyVal.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WifiAccessPointDetailVM.kt:405)");
                }
                StringBuilder sb2 = new StringBuilder(Ne.b.c(this.f12902a, context) + " - " + S8.b.a(this.f12902a));
                WifiMcs wifiMcsN = this.f12903b.n();
                Integer num = null;
                if (wifiMcsN != null) {
                    Integer numValueOf = Integer.valueOf(wifiMcsN.c());
                    if (numValueOf.intValue() > 1) {
                        num = numValueOf;
                    }
                }
                if (num != null) {
                    sb2.append(", MIMO " + num + "x" + num);
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
                interfaceC3540l.J();
                return sb2;
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            }
        }

        /* renamed from: M8.b$r$e */
        static final class e implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ W7.a f12904a;

            e(W7.a aVar) {
                this.f12904a = aVar;
            }

            public final CharSequence a(Context unused$var$, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(unused$var$, "$unused$var$");
                interfaceC3540l.U(918905802);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(918905802, i10, -1, "com.ubnt.usurvey.ui.wifi.WifiAccessPointDetailVM.infoKeyVal.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WifiAccessPointDetailVM.kt:443)");
                }
                String str = String.format("%d Mbps", Arrays.copyOf(new Object[]{Integer.valueOf(this.f12904a.d())}, 1));
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

        /* renamed from: M8.b$r$f */
        static final class f implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C6588i f12905a;

            f(C6588i c6588i) {
                this.f12905a = c6588i;
            }

            public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(context, "context");
                interfaceC3540l.U(-486497204);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-486497204, i10, -1, "com.ubnt.usurvey.ui.wifi.WifiAccessPointDetailVM.infoKeyVal.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WifiAccessPointDetailVM.kt:455)");
                }
                String string = context.getString(R.string.unit_dbm_format);
                AbstractC6492s.h(string, "getString(...)");
                String str = String.format(string, Arrays.copyOf(new Object[]{this.f12905a.s()}, 1));
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

        r() {
        }

        @Override // kg.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List a(C6556a c6556a, C6796a settings, C6556a c6556a2, C6556a c6556a3) {
            s9.d bVar;
            W7.a aVarC;
            W7.a aVarB;
            Dc.j jVarJ;
            a.C0794a c0794aL;
            S8.g gVarP;
            s9.d dVarA;
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(settings, "settings");
            AbstractC6492s.i(c6556a2, "<destruct>");
            AbstractC6492s.i(c6556a3, "<destruct>");
            C6588i c6588i = (C6588i) c6556a.a();
            W7.b bVar2 = (W7.b) c6556a2.a();
            InterfaceC2557a.b bVar3 = (InterfaceC2557a.b) c6556a3.a();
            C3285b c3285b = C3285b.this;
            List listC = AbstractC3689v.c();
            if (c6588i != null) {
                d.b bVar4 = new d.b(R.string.wifi_ssid);
                AbstractC6458c abstractC6458cR = c6588i.r();
                if (abstractC6458cR instanceof AbstractC6458c.a) {
                    String strB = c6588i.r().b();
                    AbstractC6492s.f(strB);
                    bVar = new d.c(strB);
                } else {
                    if (!(abstractC6458cR instanceof AbstractC6458c.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = new d.b(R.string.wifi_ssid_hidden);
                }
                listC.add(c3285b.L0("ssid", bVar4, bVar));
                S8.j jVarP = c6588i.p();
                if (jVarP != null) {
                    listC.add(c3285b.L0("security", new d.b(R.string.wifi_ap_detail_security), Af.y.c(jVarP)));
                }
                com.ui.wifiman.model.vendor.d dVarU = c6588i.u();
                if (dVarU != null && (dVarA = L8.k.a(dVarU)) != null) {
                    listC.add(c3285b.L0("vendor", new d.b(R.string.device_manufacturer), dVarA));
                }
                if (bVar3 != null && (jVarJ = bVar3.j()) != null && (c0794aL = jVarJ.L()) != null && (gVarP = c0794aL.p()) != null) {
                    listC.add(c3285b.L0("wifi experience", new d.b(R.string.wifi_experience), Ne.k.b(gVarP, true)));
                }
                listC.add(c3285b.L0("channel", new d.b(R.string.wifi_ap_detail_channel), new d.a(String.valueOf(c6588i.f()), new c(c6588i))));
                listC.add(c3285b.L0("channelWidth", new d.b(R.string.wifi_ap_detail_channel_width), Ne.i.a(c6588i.f().b())));
                S8.a aVarL = c6588i.l();
                if (aVarL != null) {
                    d.b bVar5 = new d.b(R.string.wifi_ap_detail_phy_mode);
                    String strName = aVarL.name();
                    WifiMcs wifiMcsN = c6588i.n();
                    listC.add(c3285b.L0("phyMode", bVar5, new d.a(strName + (wifiMcsN != null ? Integer.valueOf(wifiMcsN.c()) : null), new d(aVarL, c6588i))));
                }
                if (bVar2 != null && (aVarB = bVar2.b()) != null) {
                    d.b bVar6 = new d.b(R.string.wifi_ap_detail_phy_speed_down);
                    String str = String.format("%d Mbps", Arrays.copyOf(new Object[]{Integer.valueOf(aVarB.d())}, 1));
                    AbstractC6492s.h(str, "format(...)");
                    listC.add(c3285b.L0("phyRateDown", bVar6, new d.c(str)));
                }
                if (bVar2 != null && (aVarC = bVar2.c()) != null) {
                    d.b bVar7 = new d.b(R.string.wifi_ap_detail_phy_speed_up);
                    String str2 = String.format("%d Mbps", Arrays.copyOf(new Object[]{Integer.valueOf(aVarC.d())}, 1));
                    AbstractC6492s.h(str2, "format(...)");
                    listC.add(c3285b.L0("phyRateUP", bVar7, new d.c(str2)));
                }
                W7.a aVarH = c6588i.h();
                if (aVarH != null) {
                    listC.add(c3285b.L0("phyRateCapability", new d.b(R.string.wifi_ap_detail_phy_speed_capability), new d.a(String.valueOf(aVarH.d()), new e(aVarH))));
                }
                if (c6588i.s() != null) {
                    listC.add(c3285b.L0("txPower", new d.b(R.string.wifi_ap_detail_tx_power), new d.a(String.valueOf(c6588i.s()), new f(c6588i))));
                }
                Float fT = c6588i.t();
                if (fT != null) {
                    int iE = AbstractC7137b.e(fT.floatValue() * 100.0f);
                    listC.add(c3285b.L0("utilization", new d.b(R.string.wifi_ap_detail_channel_utilization), new d.a(String.valueOf(iE), new a(iE))));
                }
                Integer numG = c6588i.g();
                if (numG != null) {
                    listC.add(c3285b.L0("station count", new d.b(R.string.wifi_ap_detail_client_count), new d.c(AbstractC8227g.a(numG.intValue()))));
                }
                listC.add(c3285b.L0("distance", new d.b(R.string.wifi_ap_detail_distance), new d.a(String.valueOf(AbstractC7137b.d(c6588i.j())), new C0506b(c6588i, settings))));
                if (AbstractC6492s.d(c6588i.v(), Boolean.TRUE)) {
                    listC.add(c3285b.L0("rtt support", new d.b(R.string.wifi_ap_detail_wifi_rtt), new d.b(R.string.action_yes)));
                }
            }
            return AbstractC3689v.a(listC);
        }
    }

    /* renamed from: M8.b$s */
    static final class s implements kg.n {
        s() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            InterfaceC2557a.b bVar = (InterfaceC2557a.b) c6556a.a();
            return bVar != null ? C3285b.this.G0().a(new InterfaceC6084a.b.C6089g(new b.C0408b(bVar.getId()))) : AbstractC5912b.m();
        }
    }

    /* renamed from: M8.b$t */
    static final class t implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final t f12907a = new t();

        /* renamed from: M8.b$t$a */
        public static final class a implements gg.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C6556a f12908a;

            public a(C6556a c6556a) {
                this.f12908a = c6556a;
            }

            @Override // gg.q
            public final void a(gg.o oVar) {
                try {
                    C6588i c6588i = (C6588i) this.f12908a.b();
                    C5969a c5969aE = c6588i != null ? c6588i.e() : null;
                    if (c5969aE != null) {
                        oVar.onSuccess(c5969aE);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        t() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(C6556a it) {
            AbstractC6492s.i(it, "it");
            gg.n nVarC = gg.n.c(new a(it));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    /* renamed from: M8.b$u */
    static final class u implements kg.n {
        u() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(C5969a mac) {
            AbstractC6492s.i(mac, "mac");
            return C3285b.this.G0().a(new InterfaceC6084a.b.C6090h(new Je.m(mac)));
        }
    }

    /* renamed from: M8.b$v */
    static final class v implements kg.g {
        v() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final A0 a(xf.d params, C6556a c6556a, Map wifiSignalStats) {
            A0 a0M0;
            AbstractC6492s.i(params, "params");
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(wifiSignalStats, "wifiSignalStats");
            C6588i c6588i = (C6588i) c6556a.a();
            return (c6588i == null || (a0M0 = C3285b.this.M0(c6588i, (C6937a) wifiSignalStats.get(S8.k.a(c6588i.k())))) == null) ? C3285b.this.N0(params.a()) : a0M0;
        }
    }

    /* renamed from: M8.b$w */
    static final class w implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final w f12911a = new w();

        w() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(A0 it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(it);
        }
    }

    /* renamed from: M8.b$x */
    public static final class x implements gg.k {
        public x() {
        }

        @Override // gg.k
        public final void a(gg.j it) {
            AbstractC6492s.i(it, "it");
            try {
                it.h(C3285b.this.u0());
            } catch (Throwable th2) {
                it.onError(th2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: M8.b$y */
    public static final class y extends org.kodein.type.o<InterfaceC6586g> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: M8.b$z */
    public static final class z extends org.kodein.type.o<InterfaceC6586g> {
    }

    public C3285b(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f12858g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new y().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, InterfaceC6586g.class), null);
        th.l[] lVarArr = f12852F;
        this.f12859h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new z().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f12860i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, InterfaceC6586g.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new A().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f12861j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, Cc.n.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new B().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f12862k = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE4, C6937a.InterfaceC1989a.class), null).a(this, lVarArr[3]);
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new C().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f12863l = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE5, InterfaceC6084a.class), null).a(this, lVarArr[4]);
        org.kodein.type.i iVarE6 = org.kodein.type.s.e(new D().getSuperType());
        AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f12864m = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE6, InterfaceC6797b.class), null).a(this, lVarArr[5]);
        org.kodein.type.i iVarE7 = org.kodein.type.s.e(new E().getSuperType());
        AbstractC6492s.g(iVarE7, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f12865n = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE7, je.u.class), null).a(this, lVarArr[6]);
        gg.i iVarI2 = gg.i.N(new x(), EnumC5911a.LATEST).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f12866o = iVarI2;
        gg.i iVarI22 = gg.i.v(iVarI2, K0().a(), G.f12879a).z1(new C6556a(null)).W().o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f12867p = iVarI22;
        gg.i iVarI23 = gg.i.v(iVarI2.N0(m.f12892a).W(), E0().a(), n.f12893a).z1(new C6556a(null)).W().o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f12868q = iVarI23;
        gg.i iVarW = gg.i.v(iVarI22.N0(C3291g.f12885a).W(), H0().a(), h.f12886a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f12869r = iVarW;
        gg.i iVarN0 = iVarI22.N0(F.f12878a);
        AbstractC6492s.h(iVarN0, "map(...)");
        Boolean bool = Boolean.FALSE;
        this.f12870s = AbstractC8661g.d0(this, iVarN0, bool, false, null, 6, null);
        gg.i iVarN02 = iVarI23.N0(o.f12894a);
        AbstractC6492s.h(iVarN02, "map(...)");
        this.f12871t = AbstractC8661g.d0(this, iVarN02, c.b.f66039a, false, null, 6, null);
        gg.i iVarN03 = iVarI22.N0(i.f12887a).W().N0(j.f12888a);
        b.C2339b c2339b = b.C2339b.f66037a;
        gg.i iVarI24 = iVarN03.z1(c2339b).W().I1(k.f12889a).R1(l.f12891a).o1(1).i2();
        AbstractC6492s.h(iVarI24, "refCount(...)");
        this.f12872u = AbstractC8661g.d0(this, iVarI24, c2339b, false, null, 6, null);
        gg.i iVarW2 = iVarI22.N0(C3287c.f12881a).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f12873v = AbstractC8661g.h0(this, iVarW2, null, null, 2, null);
        gg.i iVarI25 = iVarI22.N0(C3289e.f12883a).W().o1(1).i2();
        AbstractC6492s.h(iVarI25, "refCount(...)");
        this.f12874w = iVarI25;
        gg.i iVarW3 = iVarI25.N0(C3290f.f12884a).W();
        AbstractC6492s.h(iVarW3, "distinctUntilChanged(...)");
        this.f12875x = AbstractC8661g.d0(this, iVarW3, bool, false, null, 6, null);
        gg.i iVarI26 = gg.i.v(iVarI25, I0().e(), C0505b.f12880a).W().o1(1).i2();
        AbstractC6492s.h(iVarI26, "refCount(...)");
        this.f12876y = iVarI26;
        gg.i iVarW4 = gg.i.u(iVarI2, iVarI26, iVarI25, new C3288d()).W();
        AbstractC6492s.h(iVarW4, "distinctUntilChanged(...)");
        this.f12877z = AbstractC8661g.d0(this, iVarW4, K.a.j(this, S8.c.GHZ_2_4, AbstractC8783m.s(new C6585f[0]), null, 4, null), false, null, 6, null);
        gg.i iVarW5 = gg.i.u(iVarI2, iVarI22, J0().getAll(), new v()).N0(w.f12911a).W();
        AbstractC6492s.h(iVarW5, "distinctUntilChanged(...)");
        this.f12854A = AbstractC8661g.h0(this, iVarW5, null, null, 2, null);
        gg.i iVarW6 = iVarI23.N0(p.f12895a).W();
        AbstractC6492s.h(iVarW6, "distinctUntilChanged(...)");
        this.f12855B = AbstractC8661g.h0(this, iVarW6, null, null, 2, null);
        gg.i iVarI27 = gg.i.t(iVarI22, F0().b(), iVarW, iVarI23, new r()).W().o1(1).i2();
        AbstractC6492s.h(iVarI27, "refCount(...)");
        this.f12856C = iVarI27;
        gg.i iVarW7 = iVarI27.N0(q.f12896a).W();
        AbstractC6492s.h(iVarW7, "distinctUntilChanged(...)");
        this.f12857D = AbstractC8661g.d0(this, iVarW7, new C2706g(AbstractC3689v.l()), false, null, 6, null);
    }

    private final Cc.n E0() {
        return (Cc.n) this.f12861j.getValue();
    }

    private final InterfaceC6797b F0() {
        return (InterfaceC6797b) this.f12864m.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a G0() {
        return (InterfaceC6084a) this.f12863l.getValue();
    }

    private final je.u H0() {
        return (je.u) this.f12865n.getValue();
    }

    private final InterfaceC6586g I0() {
        return (InterfaceC6586g) this.f12860i.getValue();
    }

    private final C6937a.InterfaceC1989a J0() {
        return (C6937a.InterfaceC1989a) this.f12862k.getValue();
    }

    private final InterfaceC6586g K0() {
        return (InterfaceC6586g) this.f12859h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC8665a.C2371a L0(String str, s9.d dVar, s9.d dVar2) {
        return new InterfaceC8665a.C2371a(str, dVar, dVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final A0 M0(C6588i c6588i, C6937a c6937a) {
        S8.l lVarA;
        String string = c6588i.e().toString();
        d.b bVar = new d.b(R.string.wifi_mode_access_point);
        List listM = M8.r.m(c6588i, false, false, 2, null);
        boolean z10 = c6588i.m() instanceof AbstractC6456a.AbstractC1905a;
        String lowerCase = c6588i.e().d(":").toLowerCase(Locale.ROOT);
        AbstractC6492s.h(lowerCase, "toLowerCase(...)");
        return new A0(string, null, bVar, false, listM, z10, new d.c(lowerCase), null, Ne.f.h(c6588i.q(), true, null, 2, null), c6588i.q(), (c6937a == null || (lVarA = c6937a.a()) == null) ? c6588i.q() : lVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final A0 N0(C5969a c5969a) {
        return new A0(c5969a.d(""), null, new d.c(c5969a.d(":")), false, AbstractC3689v.l(), false, null, null, Ne.f.h(null, true, null, 2, null), null, null);
    }

    @Override // M8.K
    public Bf.b J(S8.c cVar, InterfaceC8780j interfaceC8780j, InterfaceC6835l interfaceC6835l) {
        return K.a.f(this, cVar, interfaceC8780j, interfaceC6835l);
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f12858g;
    }

    @Override // xf.e
    public N n0() {
        return this.f12873v;
    }

    @Override // xf.e
    public N o0() {
        return this.f12877z;
    }

    @Override // xf.e
    public N p0() {
        return this.f12875x;
    }

    @Override // M8.K
    public Bf.b q(S8.c cVar, InterfaceC8780j interfaceC8780j, InterfaceC6835l interfaceC6835l) {
        return K.a.i(this, cVar, interfaceC8780j, interfaceC6835l);
    }

    @Override // xf.e
    public N q0() {
        return this.f12872u;
    }

    @Override // xf.e
    public N r0() {
        return this.f12871t;
    }

    @Override // xf.e
    public N s0() {
        return this.f12855B;
    }

    @Override // xf.e
    public N t0() {
        return this.f12857D;
    }

    @Override // xf.e
    public N v0() {
        return this.f12854A;
    }

    @Override // xf.e
    public N w0() {
        return this.f12870s;
    }

    @Override // xf.e
    public void x0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bT = this.f12868q.o0().t(new s());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }

    @Override // xf.e
    public void y0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bK = this.f12867p.o0().u(t.f12907a).k(new u());
        AbstractC6492s.h(abstractC5912bK, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bK, this);
    }
}
