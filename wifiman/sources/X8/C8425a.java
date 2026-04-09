package x8;

import A8.C2412d;
import Ii.AbstractC3063k;
import Li.N;
import P7.c;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Te.C3597p;
import Wc.b;
import Yg.J;
import Yg.v;
import Zg.AbstractC3689v;
import android.content.Context;
import android.content.pm.PackageManager;
import android.icu.text.DateFormat;
import com.ubnt.usurvey.ui.signal.floorplan.WifimanFloorplanViewControllerManager;
import com.ui.wifiman.ui.signal.AbstractC5239l;
import com.ui.wifiman.ui.signal.AbstractC5240m;
import dh.InterfaceC5380e;
import e7.EnumC5426b;
import eh.AbstractC5467b;
import fe.AbstractC5817h;
import gg.AbstractC5912b;
import gg.C;
import gg.InterfaceC5910A;
import gg.z;
import h9.C5969a;
import i8.InterfaceC6084a;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import je.AbstractC6317r;
import je.u;
import ke.AbstractC6458c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import mh.InterfaceC6839p;
import od.C7119a;
import od.InterfaceC7120b;
import org.kodein.di.DI;
import pc.InterfaceC7283a;
import rj.InterfaceC7733m2;
import rj.InterfaceC7810x2;
import s9.d;
import ye.AbstractC8661g;
import ye.C8658d;

/* renamed from: x8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8425a extends AbstractC5240m {

    /* renamed from: y, reason: collision with root package name */
    static final /* synthetic */ th.l[] f65336y = {O.h(new F(C8425a.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new F(C8425a.class, "analytics", "getAnalytics()Lcom/ubnt/usurvey/analytics/Analytics;", 0)), O.h(new F(C8425a.class, "wifiConnectionService", "getWifiConnectionService()Lcom/ui/wifiman/model/wifi/connection/WifiConnectionService;", 0)), O.h(new F(C8425a.class, "permissionsService", "getPermissionsService()Lcom/ui/wifiman/model/android/permissions/AndroidPermissionService;", 0)), O.h(new F(C8425a.class, "locationService", "getLocationService()Lcom/ui/wifiman/model/android/location/LocationService;", 0)), O.h(new F(C8425a.class, "packageManager", "getPackageManager()Landroid/content/pm/PackageManager;", 0)), O.h(new F(C8425a.class, "floorplanRecordManager", "getFloorplanRecordManager()Lcom/ui/wifiman/model/signalmapper/floorplan/FloorplanRecordManager;", 0)), O.h(new F(C8425a.class, "floorplanViewControllerManager", "getFloorplanViewControllerManager()Lcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;", 0))};

    /* renamed from: z, reason: collision with root package name */
    public static final int f65337z = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f65338g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f65339h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f65340i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f65341j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f65342k;

    /* renamed from: l, reason: collision with root package name */
    private final Yg.m f65343l;

    /* renamed from: m, reason: collision with root package name */
    private final Yg.m f65344m;

    /* renamed from: n, reason: collision with root package name */
    private final Yg.m f65345n;

    /* renamed from: o, reason: collision with root package name */
    private final Yg.m f65346o;

    /* renamed from: p, reason: collision with root package name */
    private final DateFormat f65347p;

    /* renamed from: q, reason: collision with root package name */
    private final DateFormat f65348q;

    /* renamed from: r, reason: collision with root package name */
    private final gg.i f65349r;

    /* renamed from: s, reason: collision with root package name */
    private final gg.i f65350s;

    /* renamed from: t, reason: collision with root package name */
    private final gg.i f65351t;

    /* renamed from: u, reason: collision with root package name */
    private final gg.i f65352u;

    /* renamed from: v, reason: collision with root package name */
    private final gg.i f65353v;

    /* renamed from: w, reason: collision with root package name */
    private final gg.i f65354w;

    /* renamed from: x, reason: collision with root package name */
    private final N f65355x;

    /* renamed from: x8.a$a, reason: collision with other inner class name */
    static final class C2310a implements kg.p {

        /* renamed from: a, reason: collision with root package name */
        public static final C2310a f65356a = new C2310a();

        C2310a() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(EnumC5426b it) {
            AbstractC6492s.i(it, "it");
            return it == EnumC5426b.AVAILABLE;
        }
    }

    /* renamed from: x8.a$b */
    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f65357a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Set it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.contains(com.ui.wifiman.model.android.permissions.a.CAMERA));
        }
    }

    /* renamed from: x8.a$c */
    static final class c implements kg.k {
        c() {
        }

        @Override // kg.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC5239l a(Wc.b arCoreInitState, Boolean hasCamera, Boolean hasCameraPermission, Boolean hasLocationPermission, Boolean locationEnabled, Boolean wifiConnected, List records) {
            Object next;
            AbstractC6492s.i(arCoreInitState, "arCoreInitState");
            AbstractC6492s.i(hasCamera, "hasCamera");
            AbstractC6492s.i(hasCameraPermission, "hasCameraPermission");
            AbstractC6492s.i(hasLocationPermission, "hasLocationPermission");
            AbstractC6492s.i(locationEnabled, "locationEnabled");
            AbstractC6492s.i(wifiConnected, "wifiConnected");
            AbstractC6492s.i(records, "records");
            ArrayList<AbstractC5239l.b.AbstractC1612b> arrayList = new ArrayList();
            if (!hasCamera.booleanValue()) {
                arrayList.add(AbstractC5239l.b.AbstractC1612b.c.f44836a);
            }
            boolean z10 = arCoreInitState instanceof b.a.C0897b;
            if (z10 && ((b.a.C0897b) arCoreInitState).b() == EnumC5426b.NOT_INSTALLED) {
                arrayList.add(AbstractC5239l.b.AbstractC1612b.a.f44834a);
            }
            if (z10) {
                b.a.C0897b c0897b = (b.a.C0897b) arCoreInitState;
                if (c0897b.b() == EnumC5426b.UNSUPPORTED || c0897b.b() == EnumC5426b.ERROR) {
                    arrayList.add(AbstractC5239l.b.AbstractC1612b.c.f44836a);
                }
            }
            if (!hasCameraPermission.booleanValue()) {
                arrayList.add(AbstractC5239l.b.AbstractC1612b.C1613b.f44835a);
            }
            if (!hasLocationPermission.booleanValue()) {
                arrayList.add(AbstractC5239l.b.AbstractC1612b.d.c.f44839a);
            }
            if (!locationEnabled.booleanValue()) {
                arrayList.add(AbstractC5239l.b.AbstractC1612b.d.C1614b.f44838a);
            }
            if (!wifiConnected.booleanValue()) {
                arrayList.add(AbstractC5239l.b.AbstractC1612b.d.a.f44837a);
            }
            if (records.isEmpty()) {
                return arCoreInitState instanceof b.C0898b ? new AbstractC5239l.a(AbstractC3689v.l(), AbstractC3689v.l(), true, false, false) : !z10 ? AbstractC5239l.b.AbstractC1612b.e.f44840a : !arrayList.isEmpty() ? (AbstractC5239l) AbstractC3689v.q0(arrayList) : AbstractC5239l.b.a.f44833a;
            }
            boolean z11 = !arrayList.contains(AbstractC5239l.b.AbstractC1612b.c.f44836a);
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((AbstractC5239l.b.AbstractC1612b) next) instanceof AbstractC5239l.b.AbstractC1612b.d) {
                    break;
                }
            }
            boolean z12 = next == null;
            List listM0 = C8425a.this.M0(records);
            ArrayList arrayList2 = new ArrayList();
            for (AbstractC5239l.b.AbstractC1612b abstractC1612b : arrayList) {
                AbstractC5239l.b.AbstractC1612b.d dVar = abstractC1612b instanceof AbstractC5239l.b.AbstractC1612b.d ? (AbstractC5239l.b.AbstractC1612b.d) abstractC1612b : null;
                if (dVar != null) {
                    arrayList2.add(dVar);
                }
            }
            return new AbstractC5239l.a(listM0, arrayList2, false, z11, z12);
        }
    }

    /* renamed from: x8.a$d */
    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f65359a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Set it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.contains(com.ui.wifiman.model.android.permissions.a.LOCATION_FINE));
        }
    }

    /* renamed from: x8.a$e */
    static final class e implements mh.q {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C7119a f65361b;

        e(C7119a c7119a) {
            this.f65361b = c7119a;
        }

        public final CharSequence a(Context it, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(it, "it");
            interfaceC3540l.U(-1293749787);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1293749787, i10, -1, "com.ubnt.usurvey.ui.signal.SignalTabFloorplanVM.newRecordItemModelList.<anonymous>.<anonymous> (SignalTabFloorplanVM.kt:101)");
            }
            String str = C8425a.this.f65347p.format(new Date(this.f65361b.d()));
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

    /* renamed from: x8.a$f */
    static final class f implements mh.q {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C7119a f65363b;

        f(C7119a c7119a) {
            this.f65363b = c7119a;
        }

        public final CharSequence a(Context it, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(it, "it");
            interfaceC3540l.U(-1530367612);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1530367612, i10, -1, "com.ubnt.usurvey.ui.signal.SignalTabFloorplanVM.newRecordItemModelList.<anonymous>.<anonymous> (SignalTabFloorplanVM.kt:108)");
            }
            String str = C8425a.this.f65348q.format(new Date(this.f65363b.d()));
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

    /* renamed from: x8.a$g */
    static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f65364a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f65365b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C8425a f65366c;

        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: x8.a$g$a, reason: collision with other inner class name */
        public static final class C2311a extends org.kodein.type.o<Context> {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(long j10, C8425a c8425a, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f65365b = j10;
            this.f65366c = c8425a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new g(this.f65365b, this.f65366c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objG = AbstractC5467b.g();
            int i10 = this.f65364a;
            if (i10 == 0) {
                v.b(obj);
                C2412d c2412d = C2412d.f374a;
                long j10 = this.f65365b;
                InterfaceC7733m2 interfaceC7733m2G = org.kodein.di.d.f(this.f65366c.getDi()).g();
                org.kodein.type.i iVarE = org.kodein.type.s.e(new C2311a().getSuperType());
                AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
                Context context = (Context) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, Context.class), null);
                WifimanFloorplanViewControllerManager wifimanFloorplanViewControllerManagerG0 = this.f65366c.G0();
                this.f65364a = 1;
                obj = c2412d.b(j10, context, wifimanFloorplanViewControllerManagerG0, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                    return J.f24997a;
                }
                v.b(obj);
            }
            File file = (File) obj;
            if (file != null) {
                this.f65366c.E0().b(new c.g.C0635c());
                AbstractC5912b abstractC5912bA = this.f65366c.K0().a(new InterfaceC6084a.b.x(file));
                this.f65364a = 2;
                if (Qi.b.b(abstractC5912bA, this) == objG) {
                    return objG;
                }
            } else {
                Z7.b.e("Failed to share floorplan image. Failed to instantiate floorplan controller " + this.f65365b, null, null, 6, null);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((g) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    /* renamed from: x8.a$h */
    static final class h implements kg.n {
        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(AbstractC5239l cntType) {
            AbstractC6492s.i(cntType, "cntType");
            if ((cntType instanceof AbstractC5239l.a) || (cntType instanceof AbstractC5239l.b.a)) {
                return C8425a.this.N0();
            }
            if (cntType instanceof AbstractC5239l.b.AbstractC1612b) {
                return C8425a.this.O0((AbstractC5239l.b.AbstractC1612b) cntType);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: x8.a$i */
    static final class i implements kg.n {
        i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(AbstractC6317r wifiConnectionState) {
            String strB;
            AbstractC5912b abstractC5912bA;
            AbstractC6492s.i(wifiConnectionState, "wifiConnectionState");
            AbstractC5912b abstractC5912bA2 = null;
            if ((wifiConnectionState instanceof AbstractC6317r.b.a ? (AbstractC6317r.b.a) wifiConnectionState : null) != null) {
                C8425a c8425a = C8425a.this;
                AbstractC6317r.b.a aVar = (AbstractC6317r.b.a) wifiConnectionState;
                AbstractC6458c abstractC6458cI = aVar.i();
                if (abstractC6458cI == null || (strB = abstractC6458cI.b()) == null || (abstractC5912bA = c8425a.K0().a(new i8.h(strB))) == null) {
                    C5969a c5969aC = aVar.c();
                    if (c5969aC != null) {
                        abstractC5912bA2 = c8425a.K0().a(new i8.g(c5969aC));
                    }
                } else {
                    abstractC5912bA2 = abstractC5912bA;
                }
                if (abstractC5912bA2 != null) {
                    return abstractC5912bA2;
                }
            }
            return AbstractC5912b.m();
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: x8.a$j */
    public static final class j extends org.kodein.type.o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: x8.a$k */
    public static final class k extends org.kodein.type.o<P7.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: x8.a$l */
    public static final class l extends org.kodein.type.o<u> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: x8.a$m */
    public static final class m extends org.kodein.type.o<com.ui.wifiman.model.android.permissions.d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: x8.a$n */
    public static final class n extends org.kodein.type.o<InterfaceC7283a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: x8.a$o */
    public static final class o extends org.kodein.type.o<PackageManager> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: x8.a$p */
    public static final class p extends org.kodein.type.o<InterfaceC7120b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: x8.a$q */
    public static final class q extends org.kodein.type.o<WifimanFloorplanViewControllerManager> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: x8.a$r */
    public static final class r extends org.kodein.type.o<Context> {
    }

    /* renamed from: x8.a$s */
    public static final class s implements C {
        public s() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(Boolean.valueOf(C8425a.this.I0().hasSystemFeature("android.hardware.camera")));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* renamed from: x8.a$t */
    static final class t implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final t f65370a = new t();

        t() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(AbstractC6317r it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it instanceof AbstractC6317r.b.a);
        }
    }

    public C8425a(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f65338g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new j().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, InterfaceC6084a.class), null);
        th.l[] lVarArr = f65336y;
        this.f65339h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new k().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f65340i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, P7.a.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new l().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f65341j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, u.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new m().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f65342k = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE4, com.ui.wifiman.model.android.permissions.d.class), null).a(this, lVarArr[3]);
        DI di3 = getDi();
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new n().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f65343l = org.kodein.di.d.a(di3, new org.kodein.type.d(iVarE5, InterfaceC7283a.class), null).a(this, lVarArr[4]);
        org.kodein.type.i iVarE6 = org.kodein.type.s.e(new o().getSuperType());
        AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f65344m = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE6, PackageManager.class), null).a(this, lVarArr[5]);
        org.kodein.type.i iVarE7 = org.kodein.type.s.e(new p().getSuperType());
        AbstractC6492s.g(iVarE7, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f65345n = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE7, InterfaceC7120b.class), null).a(this, lVarArr[6]);
        org.kodein.type.i iVarE8 = org.kodein.type.s.e(new q().getSuperType());
        AbstractC6492s.g(iVarE8, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f65346o = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE8, WifimanFloorplanViewControllerManager.class), null).a(this, lVarArr[7]);
        this.f65347p = DateFormat.getDateInstance(2);
        this.f65348q = DateFormat.getPatternInstance("jm");
        EnumC5426b.a aVar = EnumC5426b.Companion;
        InterfaceC7733m2 interfaceC7733m2G = org.kodein.di.d.f(getDi()).g();
        org.kodein.type.i iVarE9 = org.kodein.type.s.e(new r().getSuperType());
        AbstractC6492s.g(iVarE9, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        gg.i iVarR1 = EnumC5426b.a.c(aVar, (Context) interfaceC7733m2G.e(new org.kodein.type.d(iVarE9, Context.class), null), 0L, 2, null).R1(C2310a.f65356a);
        AbstractC6492s.h(iVarR1, "takeUntil(...)");
        gg.i iVarI2 = AbstractC5817h.e(iVarR1, null, 1, null).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f65349r = iVarI2;
        z zVarI = z.i(new s());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        gg.i iVarI22 = zVarI.W().F1(Gg.a.a()).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f65350s = iVarI22;
        gg.i iVarI23 = J0().b().N0(b.f65357a).W().o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f65351t = iVarI23;
        gg.i iVarI24 = J0().b().N0(d.f65359a).W().o1(1).i2();
        AbstractC6492s.h(iVarI24, "refCount(...)");
        this.f65352u = iVarI24;
        gg.i iVarI25 = L0().a().N0(t.f65370a).W().o1(1).i2();
        AbstractC6492s.h(iVarI25, "refCount(...)");
        this.f65353v = iVarI25;
        gg.i iVarI26 = gg.i.q(iVarI2, iVarI22, iVarI23, iVarI24, H0().a(), iVarI25, F0().c(), new c()).W().o1(1).i2();
        AbstractC6492s.h(iVarI26, "refCount(...)");
        this.f65354w = iVarI26;
        this.f65355x = AbstractC8661g.d0(this, iVarI26, new AbstractC5239l.a(AbstractC3689v.l(), AbstractC3689v.l(), true, false, false), false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final P7.a E0() {
        return (P7.a) this.f65340i.getValue();
    }

    private final InterfaceC7120b F0() {
        return (InterfaceC7120b) this.f65345n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WifimanFloorplanViewControllerManager G0() {
        return (WifimanFloorplanViewControllerManager) this.f65346o.getValue();
    }

    private final InterfaceC7283a H0() {
        return (InterfaceC7283a) this.f65343l.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PackageManager I0() {
        return (PackageManager) this.f65344m.getValue();
    }

    private final com.ui.wifiman.model.android.permissions.d J0() {
        return (com.ui.wifiman.model.android.permissions.d) this.f65342k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a K0() {
        return (InterfaceC6084a) this.f65339h.getValue();
    }

    private final u L0() {
        return (u) this.f65341j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List M0(List list) {
        List<C7119a> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list2, 10));
        for (C7119a c7119a : list2) {
            long jA = c7119a.a();
            String strB = c7119a.b();
            if (strB == null) {
                strB = "";
            }
            d.c cVar = new d.c(strB);
            String strC = c7119a.c();
            arrayList.add(new C3597p(jA, cVar, strC != null ? new d.c(strC) : null, new d.a(String.valueOf(c7119a.d()), new e(c7119a)), new d.a(String.valueOf(c7119a.d()), new f(c7119a))));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b N0() {
        AbstractC5912b abstractC5912bT = L0().a().o0().t(new i());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        return abstractC5912bT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b O0(AbstractC5239l.b.AbstractC1612b abstractC1612b) {
        if (abstractC1612b instanceof AbstractC5239l.b.AbstractC1612b.d.a) {
            return K0().a(InterfaceC6084a.b.D.g.f48903a);
        }
        if (abstractC1612b instanceof AbstractC5239l.b.AbstractC1612b.C1613b) {
            return J0().a(com.ui.wifiman.model.android.permissions.a.CAMERA);
        }
        if (abstractC1612b instanceof AbstractC5239l.b.AbstractC1612b.d.c) {
            return K0().a(i8.l.f48965a);
        }
        if (abstractC1612b instanceof AbstractC5239l.b.AbstractC1612b.d.C1614b) {
            return K0().a(i8.m.f48966a);
        }
        if (abstractC1612b instanceof AbstractC5239l.b.AbstractC1612b.a) {
            return K0().a(InterfaceC6084a.b.AbstractC6086d.C1829a.f48922a);
        }
        if (abstractC1612b instanceof AbstractC5239l.b.AbstractC1612b.c) {
            return K0().a(InterfaceC6084a.b.AbstractC6086d.C1830b.f48923a);
        }
        if (!(abstractC1612b instanceof AbstractC5239l.b.AbstractC1612b.e)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC5912b abstractC5912bM = AbstractC5912b.m();
        AbstractC6492s.h(abstractC5912bM, "complete(...)");
        return abstractC5912bM;
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f65338g;
    }

    @Override // com.ui.wifiman.ui.signal.AbstractC5240m
    public N n0() {
        return this.f65355x;
    }

    @Override // com.ui.wifiman.ui.signal.AbstractC5240m
    public Object o0(long j10, InterfaceC5380e interfaceC5380e) {
        return C2412d.f374a.a(j10, G0(), interfaceC5380e);
    }

    @Override // com.ui.wifiman.ui.signal.AbstractC5240m
    public void p0() {
        C8658d.f66727a.d(N0(), this);
    }

    @Override // com.ui.wifiman.ui.signal.AbstractC5240m
    public void q0(long j10) {
        C8658d.f66727a.d(K0().a(new InterfaceC6084a.b.AbstractC6093k.C1835a(j10)), this);
    }

    @Override // com.ui.wifiman.ui.signal.AbstractC5240m
    public void r0(long j10) {
        C8658d.f66727a.d(K0().a(new InterfaceC6084a.b.AbstractC6093k.C1836b(j10)), this);
    }

    @Override // com.ui.wifiman.ui.signal.AbstractC5240m
    public void s0(AbstractC5239l.b.AbstractC1612b requirement) {
        AbstractC6492s.i(requirement, "requirement");
        C8658d.f66727a.d(O0(requirement), this);
    }

    @Override // com.ui.wifiman.ui.signal.AbstractC5240m
    public void t0(long j10) {
        AbstractC3063k.d(androidx.lifecycle.O.a(this), null, null, new g(j10, this, null), 3, null);
    }

    @Override // com.ui.wifiman.ui.signal.AbstractC5240m
    public void u0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bT = this.f65354w.o0().t(new h());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }
}
