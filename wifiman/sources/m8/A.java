package M8;

import Af.H;
import Ee.C2706g;
import Ff.d;
import Gf.i;
import M8.A;
import M8.K;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Zg.AbstractC3689v;
import android.content.Context;
import ch.AbstractC4260a;
import com.ubnt.usurvey.R;
import com.ui.wifiman.model.wmw.WifimanWizard;
import de.C5354E;
import de.InterfaceC5355F;
import gg.AbstractC5912b;
import gg.InterfaceC5910A;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import i8.InterfaceC6084a;
import ic.EnumC6141b;
import ie.C6146c;
import ie.InterfaceC6147d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import je.AbstractC6317r;
import kg.InterfaceC6465b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;
import le.C6585f;
import le.C6588i;
import le.InterfaceC6586g;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.kodein.di.DI;
import pc.InterfaceC7283a;
import rj.InterfaceC7810x2;
import s9.d;
import vf.AbstractC8227g;
import ye.AbstractC8661g;
import ye.C8658d;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* loaded from: classes3.dex */
public final class A extends Ff.e implements M8.K {

    /* renamed from: A, reason: collision with root package name */
    private final Li.N f12758A;

    /* renamed from: B, reason: collision with root package name */
    private final Li.N f12759B;

    /* renamed from: C, reason: collision with root package name */
    private final Li.N f12760C;

    /* renamed from: D, reason: collision with root package name */
    private final Li.N f12761D;

    /* renamed from: E, reason: collision with root package name */
    private final List f12762E;

    /* renamed from: F, reason: collision with root package name */
    private final Li.N f12763F;

    /* renamed from: G, reason: collision with root package name */
    private final Li.N f12764G;

    /* renamed from: H, reason: collision with root package name */
    private final Li.N f12765H;

    /* renamed from: g, reason: collision with root package name */
    private final DI f12766g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f12767h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f12768i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f12769j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f12770k;

    /* renamed from: l, reason: collision with root package name */
    private final Yg.m f12771l;

    /* renamed from: m, reason: collision with root package name */
    private final Yg.m f12772m;

    /* renamed from: n, reason: collision with root package name */
    private final Yg.m f12773n;

    /* renamed from: o, reason: collision with root package name */
    private final Fg.a f12774o;

    /* renamed from: p, reason: collision with root package name */
    private final Yg.m f12775p;

    /* renamed from: q, reason: collision with root package name */
    private final Yg.m f12776q;

    /* renamed from: r, reason: collision with root package name */
    private final gg.i f12777r;

    /* renamed from: s, reason: collision with root package name */
    private final gg.i f12778s;

    /* renamed from: t, reason: collision with root package name */
    private final gg.i f12779t;

    /* renamed from: u, reason: collision with root package name */
    private final gg.i f12780u;

    /* renamed from: v, reason: collision with root package name */
    private final gg.i f12781v;

    /* renamed from: w, reason: collision with root package name */
    private final gg.i f12782w;

    /* renamed from: x, reason: collision with root package name */
    private final gg.i f12783x;

    /* renamed from: y, reason: collision with root package name */
    private final Li.N f12784y;

    /* renamed from: z, reason: collision with root package name */
    private final Li.N f12785z;

    /* renamed from: J, reason: collision with root package name */
    static final /* synthetic */ th.l[] f12756J = {kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(A.class, "screenConfig", "getScreenConfig()Lcom/ui/wifiman/model/ui/WifiScanHomeConfigManager;", 0)), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(A.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(A.class, "wifiNetworks", "getWifiNetworks()Lcom/ui/wifiman/model/wifi/scan/WifiScannerService;", 0)), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(A.class, "locationService", "getLocationService()Lcom/ui/wifiman/model/android/location/LocationService;", 0)), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(A.class, "permissionsService", "getPermissionsService()Lcom/ui/wifiman/model/android/permissions/AndroidPermissionService;", 0)), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(A.class, "wifiConnectionService", "getWifiConnectionService()Lcom/ui/wifiman/model/wifi/connection/WifiConnectionService;", 0)), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(A.class, "searchQueryFilter", "getSearchQueryFilter()Lcom/ubnt/usurvey/ui/wifi/WifiNetworkSearchFilter;", 0)), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(A.class, "wifimanWizard", "getWifimanWizard()Lcom/ui/wifiman/model/wmw/WifimanWizard;", 0)), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(A.class, "wifiChannelEnvService", "getWifiChannelEnvService()Lcom/ui/wifiman/model/wifi/channel/WifiEnvironmentService;", 0))};

    /* renamed from: I, reason: collision with root package name */
    public static final a f12755I = new a(null);

    /* renamed from: N, reason: collision with root package name */
    public static final int f12757N = 8;

    /* renamed from: M8.A$A, reason: collision with other inner class name */
    static final class C0501A implements kg.g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ S8.c f12786a;

        C0501A(S8.c cVar) {
            this.f12786a = cVar;
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC3270b a(InterfaceC6147d quality, Set supportedBands, HashSet currentNetworkChannels) {
            Collection<S8.e> arrayList;
            Collection channels;
            AbstractC6492s.i(quality, "quality");
            AbstractC6492s.i(supportedBands, "supportedBands");
            AbstractC6492s.i(currentNetworkChannels, "currentNetworkChannels");
            S8.c cVar = this.f12786a;
            if (cVar == null || (channels = cVar.getChannels()) == null) {
                arrayList = new ArrayList();
                Iterator it = supportedBands.iterator();
                while (it.hasNext()) {
                    AbstractC3689v.C(arrayList, ((S8.c) it.next()).getChannels());
                }
            } else {
                arrayList = channels;
            }
            S8.c cVar2 = this.f12786a;
            ArrayList arrayList2 = new ArrayList();
            for (S8.e eVar : arrayList) {
                if (eVar.b() != S8.d.MHZ_20) {
                    eVar = null;
                }
                C6146c c6146cA = eVar != null ? quality.a(eVar) : null;
                if (c6146cA != null) {
                    arrayList2.add(c6146cA);
                }
            }
            return new AbstractC3270b.c.C0503b(cVar2, currentNetworkChannels, arrayList2);
        }
    }

    static final class B implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ S8.c f12787a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A f12788b;

        B(S8.c cVar, A a10) {
            this.f12787a = cVar;
            this.f12788b = a10;
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC3270b apply(List networksOnSpectrum, String searchQuery) {
            AbstractC6492s.i(networksOnSpectrum, "networksOnSpectrum");
            AbstractC6492s.i(searchQuery, "searchQuery");
            if (kotlin.text.t.m0(searchQuery)) {
                return new AbstractC3270b.c.a(this.f12787a, AbstractC3689v.i1(networksOnSpectrum));
            }
            A a10 = this.f12788b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : networksOnSpectrum) {
                if (((Boolean) a10.Z0().e().invoke((C6585f) obj)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            return arrayList.isEmpty() ? new AbstractC3270b.c.C0504c(this.f12787a) : new AbstractC3270b.c.a(this.f12787a, arrayList);
        }
    }

    static final class C implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C f12789a = new C();

        C() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(AbstractC3270b cnt) {
            boolean z10;
            AbstractC6492s.i(cnt, "cnt");
            if ((cnt instanceof AbstractC3270b.a) || (cnt instanceof AbstractC3270b.C0502b)) {
                z10 = false;
            } else {
                if (!(cnt instanceof AbstractC3270b.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class D implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final D f12790a = new D();

        D() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(List it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(!it.isEmpty());
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class E extends org.kodein.type.o<InterfaceC5355F> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class F extends org.kodein.type.o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class G extends org.kodein.type.o<InterfaceC6586g> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class H extends org.kodein.type.o<InterfaceC7283a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class I extends org.kodein.type.o<com.ui.wifiman.model.android.permissions.d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class J extends org.kodein.type.o<je.u> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class K extends org.kodein.type.o<M8.t> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class L extends org.kodein.type.o<WifimanWizard> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class M extends org.kodein.type.o<ie.f> {
    }

    static final class N implements kg.i {
        N() {
        }

        @Override // kg.i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Af.B a(C6556a c6556a, Set supportedBands, List networks, Boolean searchMode, String str) {
            int size;
            int i10;
            int i11;
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(supportedBands, "supportedBands");
            AbstractC6492s.i(networks, "networks");
            AbstractC6492s.i(searchMode, "searchMode");
            AbstractC6492s.i(str, "<unused var>");
            S8.c cVar = (S8.c) c6556a.a();
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
            HashMap map = new HashMap();
            A a10 = A.this;
            C6556a c6556a2 = new C6556a(null);
            int i12 = 0;
            if (searchMode.booleanValue()) {
                List list = networks;
                if ((list instanceof Collection) && list.isEmpty()) {
                    size = 0;
                } else {
                    Iterator it = list.iterator();
                    size = 0;
                    while (it.hasNext()) {
                        if (((Boolean) a10.Z0().e().invoke((C6585f) it.next())).booleanValue() && (size = size + 1) < 0) {
                            AbstractC3689v.u();
                        }
                    }
                }
            } else {
                size = networks.size();
            }
            map.put(c6556a2, Integer.valueOf(size));
            C6556a c6556a3 = new C6556a(S8.c.GHZ_2_4);
            List<C6585f> list2 = networks;
            boolean z10 = list2 instanceof Collection;
            if (z10 && list2.isEmpty()) {
                i10 = 0;
            } else {
                i10 = 0;
                for (C6585f c6585f : list2) {
                    List listA = c6585f.a();
                    if (!(listA instanceof Collection) || !listA.isEmpty()) {
                        Iterator it2 = listA.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if (((C6588i) it2.next()).f().a() == S8.c.GHZ_2_4) {
                                if (!searchMode.booleanValue() || ((Boolean) a10.Z0().e().invoke(c6585f)).booleanValue()) {
                                    i10++;
                                    if (i10 < 0) {
                                        AbstractC3689v.u();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            map.put(c6556a3, Integer.valueOf(i10));
            C6556a c6556a4 = new C6556a(S8.c.GHZ_5);
            if (z10 && list2.isEmpty()) {
                i11 = 0;
            } else {
                i11 = 0;
                for (C6585f c6585f2 : list2) {
                    List listA2 = c6585f2.a();
                    if (!(listA2 instanceof Collection) || !listA2.isEmpty()) {
                        Iterator it3 = listA2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            if (((C6588i) it3.next()).f().a() == S8.c.GHZ_5) {
                                if (!searchMode.booleanValue() || ((Boolean) a10.Z0().e().invoke(c6585f2)).booleanValue()) {
                                    i11++;
                                    if (i11 < 0) {
                                        AbstractC3689v.u();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            map.put(c6556a4, Integer.valueOf(i11));
            C6556a c6556a5 = new C6556a(S8.c.GHZ_6);
            if (!z10 || !list2.isEmpty()) {
                for (C6585f c6585f3 : list2) {
                    List listA3 = c6585f3.a();
                    if (!(listA3 instanceof Collection) || !listA3.isEmpty()) {
                        Iterator it4 = listA3.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            if (((C6588i) it4.next()).f().a() == S8.c.GHZ_6) {
                                if (!searchMode.booleanValue() || ((Boolean) a10.Z0().e().invoke(c6585f3)).booleanValue()) {
                                    i12++;
                                    if (i12 < 0) {
                                        AbstractC3689v.u();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            map.put(c6556a5, Integer.valueOf(i12));
            Yg.J j10 = Yg.J.f24997a;
            return new Af.B(cVar, arrayList, map);
        }
    }

    static final class O implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final O f12792a = new O();

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f12793a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final H.a apply(Pf.a status) {
                AbstractC6492s.i(status, "status");
                Float fA = status.a().a();
                Boolean boolB = status.a().b();
                return new H.a(fA, boolB != null ? boolB.booleanValue() : false);
            }
        }

        O() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(WifimanWizard.a state) {
            AbstractC6492s.i(state, "state");
            if ((state instanceof WifimanWizard.a.c) || (state instanceof WifimanWizard.a.b) || (state instanceof WifimanWizard.a.AbstractC1520a.c) || (state instanceof WifimanWizard.a.AbstractC1520a.d)) {
                gg.i iVarK0 = gg.i.K0(H.c.f660a);
                AbstractC6492s.h(iVarK0, "just(...)");
                return iVarK0;
            }
            if (state instanceof WifimanWizard.a.AbstractC1520a.b) {
                gg.i iVarK02 = gg.i.K0(H.b.f659a);
                AbstractC6492s.h(iVarK02, "just(...)");
                return iVarK02;
            }
            if (!(state instanceof WifimanWizard.a.AbstractC1520a.C1521a)) {
                throw new NoWhenBranchMatchedException();
            }
            gg.i iVarZ1 = ((WifimanWizard.a.AbstractC1520a.C1521a) state).b().a().N0(a.f12793a).z1(new H.a(null, false));
            AbstractC6492s.h(iVarZ1, "startWithItem(...)");
            return iVarZ1;
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: M8.A$b, reason: case insensitive filesystem */
    private static abstract class AbstractC3270b {

        /* renamed from: M8.A$b$a */
        public static final class a extends AbstractC3270b {

            /* renamed from: a, reason: collision with root package name */
            private final d.a f12794a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d.a reason) {
                super(null);
                AbstractC6492s.i(reason, "reason");
                this.f12794a = reason;
            }

            public final d.a a() {
                return this.f12794a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC6492s.d(this.f12794a, ((a) obj).f12794a);
            }

            public int hashCode() {
                return this.f12794a.hashCode();
            }

            public String toString() {
                return "Empty(reason=" + this.f12794a + ")";
            }
        }

        /* renamed from: M8.A$b$b, reason: collision with other inner class name */
        public static final class C0502b extends AbstractC3270b {

            /* renamed from: a, reason: collision with root package name */
            public static final C0502b f12795a = new C0502b();

            private C0502b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0502b);
            }

            public int hashCode() {
                return 1715053833;
            }

            public String toString() {
                return "InProgress";
            }
        }

        /* renamed from: M8.A$b$c */
        public static abstract class c extends AbstractC3270b {

            /* renamed from: M8.A$b$c$a */
            public static final class a extends c {

                /* renamed from: a, reason: collision with root package name */
                private final S8.c f12796a;

                /* renamed from: b, reason: collision with root package name */
                private final List f12797b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(S8.c cVar, List results) {
                    super(null);
                    AbstractC6492s.i(results, "results");
                    this.f12796a = cVar;
                    this.f12797b = results;
                }

                public S8.c a() {
                    return this.f12796a;
                }

                public final List b() {
                    return this.f12797b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return this.f12796a == aVar.f12796a && AbstractC6492s.d(this.f12797b, aVar.f12797b);
                }

                public int hashCode() {
                    S8.c cVar = this.f12796a;
                    return ((cVar == null ? 0 : cVar.hashCode()) * 31) + this.f12797b.hashCode();
                }

                public String toString() {
                    return "Networks(band=" + this.f12796a + ", results=" + this.f12797b + ")";
                }
            }

            /* renamed from: M8.A$b$c$b, reason: collision with other inner class name */
            public static final class C0503b extends c {

                /* renamed from: a, reason: collision with root package name */
                private final S8.c f12798a;

                /* renamed from: b, reason: collision with root package name */
                private final HashSet f12799b;

                /* renamed from: c, reason: collision with root package name */
                private final List f12800c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0503b(S8.c cVar, HashSet channelsHighlighted, List results) {
                    super(null);
                    AbstractC6492s.i(channelsHighlighted, "channelsHighlighted");
                    AbstractC6492s.i(results, "results");
                    this.f12798a = cVar;
                    this.f12799b = channelsHighlighted;
                    this.f12800c = results;
                }

                public final HashSet a() {
                    return this.f12799b;
                }

                public final List b() {
                    return this.f12800c;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0503b)) {
                        return false;
                    }
                    C0503b c0503b = (C0503b) obj;
                    return this.f12798a == c0503b.f12798a && AbstractC6492s.d(this.f12799b, c0503b.f12799b) && AbstractC6492s.d(this.f12800c, c0503b.f12800c);
                }

                public int hashCode() {
                    S8.c cVar = this.f12798a;
                    return ((((cVar == null ? 0 : cVar.hashCode()) * 31) + this.f12799b.hashCode()) * 31) + this.f12800c.hashCode();
                }

                public String toString() {
                    return "Quality(band=" + this.f12798a + ", channelsHighlighted=" + this.f12799b + ", results=" + this.f12800c + ")";
                }
            }

            /* renamed from: M8.A$b$c$c, reason: collision with other inner class name */
            public static final class C0504c extends c {

                /* renamed from: a, reason: collision with root package name */
                private final S8.c f12801a;

                public C0504c(S8.c cVar) {
                    super(null);
                    this.f12801a = cVar;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0504c) && this.f12801a == ((C0504c) obj).f12801a;
                }

                public int hashCode() {
                    S8.c cVar = this.f12801a;
                    if (cVar == null) {
                        return 0;
                    }
                    return cVar.hashCode();
                }

                public String toString() {
                    return "SearchEmpty(band=" + this.f12801a + ")";
                }
            }

            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private c() {
                super(null);
            }
        }

        public /* synthetic */ AbstractC3270b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC3270b() {
        }
    }

    /* renamed from: M8.A$c, reason: case insensitive filesystem */
    public /* synthetic */ class C3271c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12802a;

        static {
            int[] iArr = new int[EnumC6141b.values().length];
            try {
                iArr[EnumC6141b.NETWORKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6141b.CHANNEL_HEALTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f12802a = iArr;
        }
    }

    /* renamed from: M8.A$d, reason: case insensitive filesystem */
    static final class C3272d implements InterfaceC6465b {
        C3272d() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bf.b apply(List networks, C6556a c6556a) {
            Bf.b bVarJ;
            AbstractC6492s.i(networks, "networks");
            AbstractC6492s.i(c6556a, "<destruct>");
            S8.c cVar = (S8.c) c6556a.a();
            return (cVar == null || (bVarJ = K.a.j(A.this, cVar, AbstractC3689v.d0(networks), null, 4, null)) == null) ? K.a.j(A.this, S8.c.GHZ_2_4, AbstractC8783m.s(new C6585f[0]), null, 4, null) : bVarJ;
        }
    }

    /* renamed from: M8.A$e, reason: case insensitive filesystem */
    static final class C3273e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C3273e f12804a = new C3273e();

        C3273e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(C6556a it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(!(it.b() == null));
        }
    }

    /* renamed from: M8.A$f, reason: case insensitive filesystem */
    static final class C3274f implements kg.g {
        C3274f() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6556a a(C6556a c6556a, AbstractC6317r wifiConnection, C6556a c6556a2) {
            Gf.k kVarW0;
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(wifiConnection, "wifiConnection");
            AbstractC6492s.i(c6556a2, "<destruct>");
            S8.c cVar = (S8.c) c6556a.a();
            C6585f c6585f = (C6585f) c6556a2.a();
            if (wifiConnection instanceof AbstractC6317r.b.a) {
                kVarW0 = A.this.W0((AbstractC6317r.b.a) wifiConnection, cVar, c6585f);
            } else {
                if (!(wifiConnection instanceof AbstractC6317r.b.C1875b) && !(wifiConnection instanceof AbstractC6317r.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                kVarW0 = null;
            }
            return new C6556a(kVarW0);
        }
    }

    /* renamed from: M8.A$g, reason: case insensitive filesystem */
    static final class C3275g implements kg.g {

        /* renamed from: M8.A$g$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f12807a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f12808b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ int[] f12809c;

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
                f12807a = iArr;
                int[] iArr2 = new int[ic.d.values().length];
                try {
                    iArr2[ic.d.SSID.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[ic.d.SIGNAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                f12808b = iArr2;
                int[] iArr3 = new int[ic.c.values().length];
                try {
                    iArr3[ic.c.NUMBER.ordinal()] = 1;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr3[ic.c.HEALTH.ordinal()] = 2;
                } catch (NoSuchFieldError unused7) {
                }
                f12809c = iArr3;
            }
        }

        /* renamed from: M8.A$g$b */
        public static final class b implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC4260a.e(((C6146c) AbstractC3689v.q0((List) obj)).a().a(), ((C6146c) AbstractC3689v.q0((List) obj2)).a().a());
            }
        }

        /* renamed from: M8.A$g$c */
        static final class c implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ S8.c f12810a;

            c(S8.c cVar) {
                this.f12810a = cVar;
            }

            public final CharSequence a(Context it, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(it, "it");
                interfaceC3540l.U(-1734377109);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1734377109, i10, -1, "com.ubnt.usurvey.ui.wifi.WifiScanVM.content.<anonymous>.<anonymous>.<anonymous> (WifiScanVM.kt:475)");
                }
                String string = it.getString(R.string.wifi_scan_list_empty_on_band, it.getString(Ne.h.e(this.f12810a)));
                AbstractC6492s.h(string, "getString(...)");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
                interfaceC3540l.J();
                return string;
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            }
        }

        C3275g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final S8.l i(C6585f it) {
            AbstractC6492s.i(it, "it");
            return it.c().q();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final S8.l j(C6585f it) {
            AbstractC6492s.i(it, "it");
            C6588i c6588iD = it.d(S8.c.GHZ_2_4);
            if (c6588iD != null) {
                return c6588iD.q();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final S8.l k(C6585f it) {
            AbstractC6492s.i(it, "it");
            C6588i c6588iD = it.d(S8.c.GHZ_5);
            if (c6588iD != null) {
                return c6588iD.q();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final S8.l l(C6585f it) {
            AbstractC6492s.i(it, "it");
            C6588i c6588iD = it.d(S8.c.GHZ_6);
            if (c6588iD != null) {
                return c6588iD.q();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J m(C5354E c5354e, S8.c cVar, List results) {
            Comparator comparatorE;
            AbstractC6492s.i(cVar, "<unused var>");
            AbstractC6492s.i(results, "results");
            int i10 = a.f12809c[c5354e.e().ordinal()];
            if (i10 == 1) {
                comparatorE = C6146c.f49145e.e();
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                comparatorE = C6146c.f49145e.f();
            }
            AbstractC3689v.B(results, comparatorE);
            return Yg.J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(InterfaceC6839p interfaceC6839p, Object obj, Object obj2) {
            interfaceC6839p.invoke(obj, obj2);
        }

        @Override // kg.g
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final C2706g a(AbstractC3270b.c resultsContent, final C5354E config, Boolean searchMode) {
            List listE;
            Comparator comparatorJ;
            AbstractC6492s.i(resultsContent, "resultsContent");
            AbstractC6492s.i(config, "config");
            AbstractC6492s.i(searchMode, "searchMode");
            int i10 = 1;
            if (resultsContent instanceof AbstractC3270b.c.a) {
                AbstractC3270b.c.a aVar = (AbstractC3270b.c.a) resultsContent;
                List listB = aVar.b();
                int i11 = a.f12808b[config.f().ordinal()];
                if (i11 == 1) {
                    comparatorJ = C6585f.f52559g.j();
                } else {
                    if (i11 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    S8.c cVarA = aVar.a();
                    int i12 = cVarA == null ? -1 : a.f12807a[cVarA.ordinal()];
                    if (i12 == -1) {
                        comparatorJ = C6585f.f52559g.k(new InterfaceC6835l() { // from class: M8.B
                            @Override // mh.InterfaceC6835l
                            public final Object invoke(Object obj) {
                                return A.C3275g.i((C6585f) obj);
                            }
                        });
                    } else if (i12 == 1) {
                        comparatorJ = C6585f.f52559g.k(new InterfaceC6835l() { // from class: M8.C
                            @Override // mh.InterfaceC6835l
                            public final Object invoke(Object obj) {
                                return A.C3275g.j((C6585f) obj);
                            }
                        });
                    } else if (i12 == 2) {
                        comparatorJ = C6585f.f52559g.k(new InterfaceC6835l() { // from class: M8.D
                            @Override // mh.InterfaceC6835l
                            public final Object invoke(Object obj) {
                                return A.C3275g.k((C6585f) obj);
                            }
                        });
                    } else {
                        if (i12 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        comparatorJ = C6585f.f52559g.k(new InterfaceC6835l() { // from class: M8.E
                            @Override // mh.InterfaceC6835l
                            public final Object invoke(Object obj) {
                                return A.C3275g.l((C6585f) obj);
                            }
                        });
                    }
                }
                List<C6585f> listX0 = AbstractC3689v.X0(listB, comparatorJ);
                ArrayList arrayList = new ArrayList();
                if (listX0.isEmpty() || (listX0.size() == 1 && ((C6585f) AbstractC3689v.q0(listX0)).e() != null)) {
                    S8.c cVarA2 = aVar.a();
                    arrayList.add(new i.b(cVarA2 != null ? new d.a(cVarA2.toString(), new c(cVarA2)) : new d.b(R.string.wifi_scan_list_empty)));
                } else {
                    for (C6585f c6585f : listX0) {
                        if (searchMode.booleanValue() || c6585f.e() == null) {
                            arrayList.add(M8.r.i(c6585f, aVar.a()));
                        }
                    }
                }
                listE = AbstractC3689v.e(new C2706g.a.C0194a("networks", null, null, arrayList, 4, null));
            } else if (resultsContent instanceof AbstractC3270b.c.C0503b) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                AbstractC3270b.c.C0503b c0503b = (AbstractC3270b.c.C0503b) resultsContent;
                for (C6146c c6146c : c0503b.b()) {
                    S8.c cVarA3 = c6146c.a().a();
                    Object arrayList2 = linkedHashMap.get(cVarA3);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(cVarA3, arrayList2);
                    }
                    ((List) arrayList2).add(c6146c);
                }
                final InterfaceC6839p interfaceC6839p = new InterfaceC6839p() { // from class: M8.F
                    @Override // mh.InterfaceC6839p
                    public final Object invoke(Object obj, Object obj2) {
                        return A.C3275g.m(config, (S8.c) obj, (List) obj2);
                    }
                };
                linkedHashMap.forEach(new BiConsumer() { // from class: M8.G
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        A.C3275g.n(interfaceC6839p, obj, obj2);
                    }
                });
                ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList3.add((List) ((Map.Entry) it.next()).getValue());
                }
                List listX02 = AbstractC3689v.X0(arrayList3, new b());
                A a10 = A.this;
                int i13 = 10;
                ArrayList arrayList4 = new ArrayList(AbstractC3689v.w(listX02, 10));
                Iterator it2 = listX02.iterator();
                while (it2.hasNext()) {
                    List list = (List) it2.next();
                    S8.c cVarA4 = ((C6146c) AbstractC3689v.q0(list)).a().a();
                    String str = "quality-" + cVarA4;
                    s9.d dVarC = linkedHashMap.size() > i10 ? Ne.h.c(cVarA4) : null;
                    List<C6146c> list2 = list;
                    ArrayList arrayList5 = new ArrayList(AbstractC3689v.w(list2, i13));
                    for (C6146c c6146c2 : list2) {
                        arrayList5.add(new i.a(a10.g1(c6146c2.a()), new Gf.b(new d.c(AbstractC8227g.a(c6146c2.a().d())), Ne.j.c(c6146c2.b(), true), c0503b.a().contains(Integer.valueOf(c6146c2.a().d())))));
                        it2 = it2;
                    }
                    arrayList4.add(new C2706g.a.C0194a(str, dVarC, null, arrayList5, 4, null));
                    it2 = it2;
                    i10 = 1;
                    i13 = 10;
                }
                listE = arrayList4;
            } else {
                if (!(resultsContent instanceof AbstractC3270b.c.C0504c)) {
                    throw new NoWhenBranchMatchedException();
                }
                listE = AbstractC3689v.e(new C2706g.a.b(new i.b(new d.b(R.string.wifi_scan_list_empty_search_query_match_nothing_message))));
            }
            return new C2706g(listE);
        }
    }

    /* renamed from: M8.A$h, reason: case insensitive filesystem */
    static final class C3276h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C3276h f12811a = new C3276h();

        C3276h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(AbstractC6317r it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it instanceof AbstractC6317r.b);
        }
    }

    /* renamed from: M8.A$i, reason: case insensitive filesystem */
    static final class C3277i implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C3277i f12812a = new C3277i();

        C3277i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Set it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.contains(com.ui.wifiman.model.android.permissions.a.LOCATION_FINE));
        }
    }

    /* renamed from: M8.A$j, reason: case insensitive filesystem */
    static final class C3278j implements kg.j {

        /* renamed from: M8.A$j$a */
        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Boolean f12814a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ A f12815b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ EnumC6141b f12816c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ S8.c f12817d;

            a(Boolean bool, A a10, EnumC6141b enumC6141b, S8.c cVar) {
                this.f12814a = bool;
                this.f12815b = a10;
                this.f12816c = enumC6141b;
                this.f12817d = cVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(Long it) {
                AbstractC6492s.i(it, "it");
                if (!this.f12814a.booleanValue()) {
                    gg.i iVarK0 = gg.i.K0(new AbstractC3270b.a(d.a.c.f6530a));
                    AbstractC6492s.f(iVarK0);
                    return iVarK0;
                }
                A a10 = this.f12815b;
                EnumC6141b enumC6141b = this.f12816c;
                AbstractC6492s.f(enumC6141b);
                return a10.U0(enumC6141b, this.f12817d);
            }
        }

        C3278j() {
        }

        @Override // kg.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final gg.i a(Boolean networksInRange, C6556a c6556a, EnumC6141b feature, Boolean wifiEnabled, Boolean hasLocationPermission, Boolean locationEnabled) {
            AbstractC6492s.i(networksInRange, "networksInRange");
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(feature, "feature");
            AbstractC6492s.i(wifiEnabled, "wifiEnabled");
            AbstractC6492s.i(hasLocationPermission, "hasLocationPermission");
            AbstractC6492s.i(locationEnabled, "locationEnabled");
            S8.c cVar = (S8.c) c6556a.a();
            if (!hasLocationPermission.booleanValue()) {
                gg.i iVarK0 = gg.i.K0(new AbstractC3270b.a(d.a.C0258a.f6528a));
                AbstractC6492s.h(iVarK0, "just(...)");
                return iVarK0;
            }
            if (!locationEnabled.booleanValue()) {
                gg.i iVarK02 = gg.i.K0(new AbstractC3270b.a(d.a.b.f6529a));
                AbstractC6492s.h(iVarK02, "just(...)");
                return iVarK02;
            }
            if (networksInRange.booleanValue()) {
                return A.this.U0(feature, cVar);
            }
            gg.i iVarZ1 = gg.i.d2(5000L, TimeUnit.MILLISECONDS).I1(new a(wifiEnabled, A.this, feature, cVar)).z1(AbstractC3270b.C0502b.f12795a);
            AbstractC6492s.h(iVarZ1, "startWithItem(...)");
            return iVarZ1;
        }
    }

    /* renamed from: M8.A$k, reason: case insensitive filesystem */
    static final class C3279k implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C3279k f12818a = new C3279k();

        C3279k() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(gg.i it) {
            AbstractC6492s.i(it, "it");
            return it;
        }
    }

    /* renamed from: M8.A$l, reason: case insensitive filesystem */
    static final class C3280l implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C3280l f12819a = new C3280l();

        C3280l() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Ff.d apply(AbstractC3270b cnt) {
            AbstractC6492s.i(cnt, "cnt");
            if (cnt instanceof AbstractC3270b.a) {
                return ((AbstractC3270b.a) cnt).a();
            }
            if (cnt instanceof AbstractC3270b.C0502b) {
                return d.b.f6531a;
            }
            if (cnt instanceof AbstractC3270b.c) {
                return d.c.f6532a;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: M8.A$m, reason: case insensitive filesystem */
    static final class C3281m implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final C3281m f12820a = new C3281m();

        C3281m() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashSet apply(C6556a c6556a, C6556a c6556a2) {
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(c6556a2, "<destruct>");
            S8.c cVar = (S8.c) c6556a.a();
            C6585f c6585f = (C6585f) c6556a2.a();
            if (c6585f != null) {
                List<C6588i> listA = c6585f.a();
                ArrayList arrayList = new ArrayList();
                for (C6588i c6588i : listA) {
                    Integer numValueOf = (cVar == null || cVar == c6588i.f().a()) ? Integer.valueOf(c6588i.f().d()) : null;
                    if (numValueOf != null) {
                        arrayList.add(numValueOf);
                    }
                }
                HashSet hashSetG1 = AbstractC3689v.g1(arrayList);
                if (hashSetG1 != null) {
                    return hashSetG1;
                }
            }
            return new HashSet();
        }
    }

    /* renamed from: M8.A$n, reason: case insensitive filesystem */
    static final class C3282n implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final C3282n f12821a = new C3282n();

        C3282n() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EnumC6141b apply(C5354E config, Boolean searchMode) {
            AbstractC6492s.i(config, "config");
            AbstractC6492s.i(searchMode, "searchMode");
            return searchMode.booleanValue() ? EnumC6141b.NETWORKS : config.d();
        }
    }

    /* renamed from: M8.A$o, reason: case insensitive filesystem */
    static final class C3283o implements InterfaceC6465b {
        C3283o() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(Set supportedBands, C5354E config) {
            AbstractC6492s.i(supportedBands, "supportedBands");
            AbstractC6492s.i(config, "config");
            ic.e eVarC = config.c();
            S8.c cVarT0 = eVarC != null ? A.this.T0(eVarC) : null;
            return new C6556a(AbstractC3689v.f0(supportedBands, cVarT0) ? cVarT0 : null);
        }
    }

    static final class p implements kg.n {
        p() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Gf.h apply(EnumC6141b it) {
            AbstractC6492s.i(it, "it");
            return new Gf.h(it, A.this.f12762E);
        }
    }

    static final class q implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final q f12824a = new q();

        q() {
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

    public static final class r implements gg.C {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f12826b;

        public r(String str) {
            this.f12826b = str;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                Yg.s sVarC1 = A.this.c1(this.f12826b);
                if (sVarC1 != null) {
                    interfaceC5910A.onSuccess(sVarC1);
                    return;
                }
                throw new IllegalStateException("Can't parse item id from " + this.f12826b);
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class s implements kg.n {

        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f12828a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ S8.c f12829b;

            public a(int i10, S8.c cVar) {
                this.f12828a = i10;
                this.f12829b = cVar;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    Z7.b.e("Channel " + this.f12828a + " not found for band " + this.f12829b, null, null, 6, null);
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        s() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Yg.s sVar) {
            Object next;
            AbstractC5912b abstractC5912bA;
            AbstractC6492s.i(sVar, "<destruct>");
            S8.c cVar = (S8.c) sVar.a();
            int iIntValue = ((Number) sVar.c()).intValue();
            Iterator<T> it = cVar.getChannels().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((S8.e) next).d() == iIntValue) {
                    break;
                }
            }
            S8.e eVar = (S8.e) next;
            if (eVar != null && (abstractC5912bA = A.this.a1().a(new InterfaceC6084a.b.I(eVar))) != null) {
                return abstractC5912bA;
            }
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(iIntValue, cVar));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }
    }

    static final class t implements kg.n {
        t() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(AbstractC3270b content) {
            AbstractC6492s.i(content, "content");
            if ((content instanceof AbstractC3270b.c) || (content instanceof AbstractC3270b.C0502b)) {
                return AbstractC5912b.m();
            }
            if (!(content instanceof AbstractC3270b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            d.a aVarA = ((AbstractC3270b.a) content).a();
            if (aVarA instanceof d.a.C0258a) {
                return A.this.X0().a(com.ui.wifiman.model.android.permissions.a.LOCATION_FINE);
            }
            if (aVarA instanceof d.a.b) {
                return A.this.a1().a(InterfaceC6084a.b.D.e.f48900a);
            }
            if (aVarA instanceof d.a.c) {
                return A.this.a1().a(InterfaceC6084a.b.D.g.f48903a);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class u implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final u f12831a = new u();

        u() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(AbstractC3270b content) {
            AbstractC6492s.i(content, "content");
            if ((content instanceof AbstractC3270b.c) || (content instanceof AbstractC3270b.C0502b)) {
                return AbstractC5912b.m();
            }
            if (!(content instanceof AbstractC3270b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            d.a aVarA = ((AbstractC3270b.a) content).a();
            if ((aVarA instanceof d.a.C0258a) || (aVarA instanceof d.a.b) || (aVarA instanceof d.a.c)) {
                return AbstractC5912b.m();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class v implements kg.n {

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f12833a;

            static {
                int[] iArr = new int[EnumC6141b.values().length];
                try {
                    iArr[EnumC6141b.NETWORKS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC6141b.CHANNEL_HEALTH.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f12833a = iArr;
            }
        }

        v() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(EnumC6141b feature) {
            AbstractC6492s.i(feature, "feature");
            int i10 = a.f12833a[feature.ordinal()];
            if (i10 == 1) {
                return A.this.a1().a(InterfaceC6084a.b.v.C1840b.f48949a);
            }
            if (i10 == 2) {
                return A.this.a1().a(InterfaceC6084a.b.v.C1839a.f48948a);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class w implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final w f12834a = new w();

        public static final class a implements gg.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C6585f f12835a;

            public a(C6585f c6585f) {
                this.f12835a = c6585f;
            }

            @Override // gg.q
            public final void a(gg.o oVar) {
                try {
                    C6585f c6585f = this.f12835a;
                    if (c6585f != null) {
                        oVar.onSuccess(c6585f);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        w() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            gg.n nVarC = gg.n.c(new a((C6585f) c6556a.a()));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    static final class x implements kg.n {
        x() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(C6585f it) {
            AbstractC6492s.i(it, "it");
            return A.this.j1(it);
        }
    }

    static final class y implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f12837a;

        public static final class a implements gg.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f12838a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f12839b;

            public a(List list, String str) {
                this.f12838a = list;
                this.f12839b = str;
            }

            @Override // gg.q
            public final void a(gg.o oVar) {
                Object next;
                try {
                    AbstractC6492s.f(this.f12838a);
                    Iterator it = this.f12838a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            if (AbstractC6492s.d(((C6585f) next).b(), this.f12839b)) {
                                break;
                            }
                        }
                    }
                    C6585f c6585f = (C6585f) next;
                    if (c6585f != null) {
                        oVar.onSuccess(c6585f);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        y(String str) {
            this.f12837a = str;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(List it) {
            AbstractC6492s.i(it, "it");
            gg.n nVarC = gg.n.c(new a(it, this.f12837a));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    static final class z implements kg.n {
        z() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(C6585f it) {
            AbstractC6492s.i(it, "it");
            return A.this.j1(it);
        }
    }

    public A(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f12766g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new E().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, InterfaceC5355F.class), null);
        th.l[] lVarArr = f12756J;
        this.f12767h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new F().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f12768i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, InterfaceC6084a.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new G().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f12769j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, InterfaceC6586g.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new H().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f12770k = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE4, InterfaceC7283a.class), null).a(this, lVarArr[3]);
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new I().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f12771l = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE5, com.ui.wifiman.model.android.permissions.d.class), null).a(this, lVarArr[4]);
        org.kodein.type.i iVarE6 = org.kodein.type.s.e(new J().getSuperType());
        AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f12772m = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE6, je.u.class), null).a(this, lVarArr[5]);
        org.kodein.type.i iVarE7 = org.kodein.type.s.e(new K().getSuperType());
        AbstractC6492s.g(iVarE7, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f12773n = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE7, M8.t.class), null).a(this, lVarArr[6]);
        Boolean bool = Boolean.FALSE;
        Fg.a aVarK2 = Fg.a.k2(bool);
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f12774o = aVarK2;
        org.kodein.type.i iVarE8 = org.kodein.type.s.e(new L().getSuperType());
        AbstractC6492s.g(iVarE8, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f12775p = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE8, WifimanWizard.class), null).a(this, lVarArr[7]);
        org.kodein.type.i iVarE9 = org.kodein.type.s.e(new M().getSuperType());
        AbstractC6492s.g(iVarE9, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f12776q = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE9, ie.f.class), null).a(this, lVarArr[8]);
        gg.i iVarI2 = gg.i.v(e1().c(), Y0().b(), new C3283o()).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f12777r = iVarI2;
        gg.i iVarI22 = aVarK2.e1().Y0(Gg.a.a(), false, 1).W().o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f12778s = iVarI22;
        gg.i iVarI23 = e1().e().N0(D.f12790a).W().o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f12779t = iVarI23;
        gg.i iVarI24 = gg.i.v(Y0().b(), iVarI22, C3282n.f12821a).W().o1(1).i2();
        AbstractC6492s.h(iVarI24, "refCount(...)");
        this.f12780u = iVarI24;
        gg.i iVarI25 = gg.i.v(iVarI2, e1().e(), q.f12824a).W().o1(1).i2();
        AbstractC6492s.h(iVarI25, "refCount(...)");
        this.f12781v = iVarI25;
        gg.i iVarI26 = gg.i.v(iVarI2, e1().d(), C3281m.f12820a).W().o1(1).i2();
        AbstractC6492s.h(iVarI26, "refCount(...)");
        this.f12782w = iVarI26;
        gg.i iVarI27 = gg.i.r(iVarI23, iVarI2, iVarI24, d1().a().N0(C3276h.f12811a).W(), X0().b().N0(C3277i.f12812a).W(), V0().a(), new C3278j()).I1(C3279k.f12818a).o1(1).i2();
        AbstractC6492s.h(iVarI27, "refCount(...)");
        this.f12783x = iVarI27;
        gg.i iVarW = iVarI27.N0(C3280l.f12819a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f12784y = AbstractC8661g.d0(this, iVarW, d.b.f6531a, false, null, 6, null);
        gg.i iVarW2 = iVarI27.N0(C.f12789a).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f12785z = AbstractC8661g.d0(this, iVarW2, bool, false, null, 6, null);
        gg.i iVarW3 = gg.i.s(iVarI2, e1().c(), e1().e(), iVarI22, Z0().f(), new N()).W();
        AbstractC6492s.h(iVarW3, "distinctUntilChanged(...)");
        this.f12758A = AbstractC8661g.d0(this, iVarW3, new Af.B(null, AbstractC3689v.l(), null, 4, null), false, null, 6, null);
        gg.i iVarW4 = gg.i.v(iVarI25, iVarI2, new C3272d()).W();
        AbstractC6492s.h(iVarW4, "distinctUntilChanged(...)");
        this.f12759B = AbstractC8661g.d0(this, iVarW4, K.a.j(this, S8.c.GHZ_2_4, AbstractC8783m.s(new C6585f[0]), null, 4, null), false, null, 6, null);
        gg.i iVarW5 = iVarI2.N0(C3273e.f12804a).W();
        AbstractC6492s.h(iVarW5, "distinctUntilChanged(...)");
        this.f12760C = AbstractC8661g.d0(this, iVarW5, bool, false, null, 6, null);
        gg.i iVarW6 = gg.i.u(iVarI2, d1().a(), e1().d(), new C3274f()).W();
        AbstractC6492s.h(iVarW6, "distinctUntilChanged(...)");
        this.f12761D = AbstractC8661g.h0(this, iVarW6, null, null, 2, null);
        EnumC6141b enumC6141b = EnumC6141b.NETWORKS;
        List listO = AbstractC3689v.o(enumC6141b, EnumC6141b.CHANNEL_HEALTH);
        this.f12762E = listO;
        gg.i iVarN0 = iVarI24.N0(new p());
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f12763F = AbstractC8661g.d0(this, iVarN0, new Gf.h(enumC6141b, listO), false, null, 6, null);
        gg.i iVarZ0 = iVarI27.Z0(AbstractC3270b.c.class);
        AbstractC6492s.h(iVarZ0, "ofType(R::class.java)");
        gg.i iVarU = gg.i.u(iVarZ0, Y0().b(), iVarI22, new C3275g());
        AbstractC6492s.h(iVarU, "combineLatest(...)");
        this.f12764G = AbstractC8661g.d0(this, iVarU, new C2706g(AbstractC3689v.l()), false, null, 6, null);
        gg.i iVarW7 = f1().getState().I1(O.f12792a).W();
        AbstractC6492s.h(iVarW7, "distinctUntilChanged(...)");
        this.f12765H = AbstractC8661g.d0(this, iVarW7, H.c.f660a, false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.i U0(EnumC6141b enumC6141b, S8.c cVar) {
        int i10 = C3271c.f12802a[enumC6141b.ordinal()];
        if (i10 == 1) {
            return l1(cVar);
        }
        if (i10 == 2) {
            return k1(cVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final InterfaceC7283a V0() {
        return (InterfaceC7283a) this.f12770k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final Gf.k W0(je.AbstractC6317r.b.a r17, S8.c r18, le.C6585f r19) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M8.A.W0(je.r$b$a, S8.c, le.f):Gf.k");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.ui.wifiman.model.android.permissions.d X0() {
        return (com.ui.wifiman.model.android.permissions.d) this.f12771l.getValue();
    }

    private final InterfaceC5355F Y0() {
        return (InterfaceC5355F) this.f12767h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final M8.t Z0() {
        return (M8.t) this.f12773n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a a1() {
        return (InterfaceC6084a) this.f12768i.getValue();
    }

    private final ie.f b1() {
        return (ie.f) this.f12776q.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Yg.s c1(String str) {
        List listQ0 = kotlin.text.t.Q0(str, new String[]{"-"}, false, 0, 6, null);
        if (listQ0.size() != 2) {
            listQ0 = null;
        }
        if (listQ0 == null) {
            return null;
        }
        try {
            S8.c cVarValueOf = S8.c.valueOf((String) listQ0.get(0));
            Integer numQ = kotlin.text.t.q((String) listQ0.get(1));
            if (numQ != null) {
                return new Yg.s(cVarValueOf, numQ);
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private final je.u d1() {
        return (je.u) this.f12772m.getValue();
    }

    private final InterfaceC6586g e1() {
        return (InterfaceC6586g) this.f12769j.getValue();
    }

    private final WifimanWizard f1() {
        return (WifimanWizard) this.f12775p.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String g1(S8.e eVar) {
        return eVar.a() + "-" + eVar.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5354E h1(EnumC6141b enumC6141b, C5354E it) {
        AbstractC6492s.i(it, "it");
        return C5354E.b(it, null, null, null, enumC6141b, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5354E i1(A a10, S8.c cVar, C5354E it) {
        AbstractC6492s.i(it, "it");
        return C5354E.b(it, a10.S0(cVar), null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b j1(C6585f c6585f) {
        AbstractC5912b abstractC5912bA;
        String strB = c6585f.c().r().b();
        return (strB == null || (abstractC5912bA = a1().a(new InterfaceC6084a.b.J.C1824a(new Cf.c(strB)))) == null) ? a1().a(new InterfaceC6084a.b.K(new xf.d(c6585f.c().e()))) : abstractC5912bA;
    }

    private final gg.i k1(S8.c cVar) {
        gg.i iVarU = gg.i.u(b1().a(), e1().c(), this.f12782w, new C0501A(cVar));
        AbstractC6492s.h(iVarU, "combineLatest(...)");
        return iVarU;
    }

    private final gg.i l1(S8.c cVar) {
        gg.i iVarV = gg.i.v(this.f12781v, Z0().f(), new B(cVar, this));
        AbstractC6492s.h(iVarV, "combineLatest(...)");
        return iVarV;
    }

    @Override // Ff.e
    public void A0(boolean z10) {
        this.f12774o.h(Boolean.valueOf(z10));
    }

    @Override // Ff.e
    public void B0(String query) {
        AbstractC6492s.i(query, "query");
        Z0().g(query);
    }

    @Override // Ff.e
    public void C0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bT = this.f12780u.o0().t(new v());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }

    @Override // Ff.e
    public void D0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bK = e1().d().o0().u(w.f12834a).k(new x());
        AbstractC6492s.h(abstractC5912bK, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bK, this);
    }

    @Override // Ff.e
    public void E0(String id2) {
        AbstractC6492s.i(id2, "id");
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bK = e1().e().o0().u(new y(id2)).k(new z());
        AbstractC6492s.h(abstractC5912bK, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bK, this);
    }

    @Override // Ff.e
    public void F0(final S8.c cVar) {
        C8658d.f66727a.d(Y0().a(new InterfaceC6835l() { // from class: M8.z
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return A.i1(this.f13050a, cVar, (C5354E) obj);
            }
        }), this);
    }

    @Override // Ff.e
    public void G0() {
        C8658d.f66727a.d(a1().a(InterfaceC6084a.b.L.C1826a.f48918a), this);
    }

    @Override // M8.K
    public Bf.b J(S8.c cVar, InterfaceC8780j interfaceC8780j, InterfaceC6835l interfaceC6835l) {
        return K.a.f(this, cVar, interfaceC8780j, interfaceC6835l);
    }

    public ic.e S0(S8.c cVar) {
        return K.a.d(this, cVar);
    }

    public S8.c T0(ic.e eVar) {
        return K.a.e(this, eVar);
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f12766g;
    }

    @Override // Ff.e
    public Li.N n0() {
        return this.f12759B;
    }

    @Override // Ff.e
    public Li.N o0() {
        return this.f12760C;
    }

    @Override // Ff.e
    public Li.N p0() {
        return this.f12761D;
    }

    @Override // M8.K
    public Bf.b q(S8.c cVar, InterfaceC8780j interfaceC8780j, InterfaceC6835l interfaceC6835l) {
        return K.a.i(this, cVar, interfaceC8780j, interfaceC6835l);
    }

    @Override // Ff.e
    public Li.N q0() {
        return this.f12764G;
    }

    @Override // Ff.e
    public Li.N r0() {
        return this.f12784y;
    }

    @Override // Ff.e
    public Li.N s0() {
        return this.f12763F;
    }

    @Override // Ff.e
    public Li.N t0() {
        return this.f12785z;
    }

    @Override // Ff.e
    public Li.N u0() {
        return this.f12758A;
    }

    @Override // Ff.e
    public Li.N v0() {
        return this.f12765H;
    }

    @Override // Ff.e
    public void w0(String id2) {
        AbstractC6492s.i(id2, "id");
        C8658d c8658d = C8658d.f66727a;
        gg.z zVarI = gg.z.i(new r(id2));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bT = zVarI.t(new s());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }

    @Override // Ff.e
    public void x0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bT = this.f12783x.o0().t(new t());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }

    @Override // Ff.e
    public void y0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bT = this.f12783x.o0().t(u.f12831a);
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }

    @Override // Ff.e
    public void z0(final EnumC6141b feature) {
        AbstractC6492s.i(feature, "feature");
        C8658d.f66727a.d(Y0().a(new InterfaceC6835l() { // from class: M8.y
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return A.h1(feature, (C5354E) obj);
            }
        }), this);
    }
}
