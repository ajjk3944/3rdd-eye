package A8;

import Li.N;
import Li.P;
import P7.c;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Te.B0;
import Te.C3589k;
import Wc.b;
import Ye.c;
import Ye.d;
import Ye.e;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.PointF;
import androidx.lifecycle.AbstractC4013k;
import com.ubnt.mlkit.product.a;
import com.ubnt.usurvey.R;
import com.ubnt.usurvey.ui.signal.floorplan.WifimanFloorplanViewControllerManager;
import e7.EnumC5426b;
import e7.f;
import e7.g;
import ec.AbstractC5452a;
import fe.AbstractC5817h;
import gg.AbstractC5912b;
import gg.EnumC5911a;
import gg.InterfaceC5910A;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import h9.C5969a;
import hc.C5973a;
import hc.InterfaceC5974b;
import i8.InterfaceC6084a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import je.AbstractC6317r;
import k7.C6399b;
import ke.AbstractC6458c;
import kg.InterfaceC6465b;
import kg.InterfaceC6468e;
import kg.InterfaceC6469f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import l9.C6556a;
import mh.InterfaceC6824a;
import od.f;
import org.kodein.di.DI;
import rj.InterfaceC7733m2;
import rj.InterfaceC7810x2;
import s9.c;
import s9.d;
import sa.AbstractC7930a;
import u8.InterfaceC8140a;
import uc.InterfaceC8157a;
import vc.InterfaceC8209b;
import ye.AbstractC8661g;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class o extends Ye.f {

    /* renamed from: A, reason: collision with root package name */
    private final gg.i f418A;

    /* renamed from: B, reason: collision with root package name */
    private final gg.i f419B;

    /* renamed from: C, reason: collision with root package name */
    private final gg.i f420C;

    /* renamed from: D, reason: collision with root package name */
    private final gg.i f421D;

    /* renamed from: E, reason: collision with root package name */
    private final gg.i f422E;

    /* renamed from: F, reason: collision with root package name */
    private final gg.i f423F;

    /* renamed from: G, reason: collision with root package name */
    private final N f424G;

    /* renamed from: H, reason: collision with root package name */
    private final N f425H;

    /* renamed from: I, reason: collision with root package name */
    private final N f426I;

    /* renamed from: J, reason: collision with root package name */
    private final N f427J;

    /* renamed from: N, reason: collision with root package name */
    private final N f428N;

    /* renamed from: X, reason: collision with root package name */
    private final N f429X;

    /* renamed from: Y, reason: collision with root package name */
    private final N f430Y;

    /* renamed from: g, reason: collision with root package name */
    private final DI f431g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f432h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f433i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f434j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f435k;

    /* renamed from: l, reason: collision with root package name */
    private final Yg.m f436l;

    /* renamed from: m, reason: collision with root package name */
    private final Yg.m f437m;

    /* renamed from: n, reason: collision with root package name */
    private final Yg.m f438n;

    /* renamed from: o, reason: collision with root package name */
    private final Yg.m f439o;

    /* renamed from: p, reason: collision with root package name */
    private final Yg.m f440p;

    /* renamed from: q, reason: collision with root package name */
    private final Yg.m f441q;

    /* renamed from: r, reason: collision with root package name */
    private final Yg.m f442r;

    /* renamed from: s, reason: collision with root package name */
    private final Yg.m f443s;

    /* renamed from: t, reason: collision with root package name */
    private final Yg.m f444t;

    /* renamed from: u, reason: collision with root package name */
    private final gg.i f445u;

    /* renamed from: v, reason: collision with root package name */
    private final gg.i f446v;

    /* renamed from: w, reason: collision with root package name */
    private final A8.z f447w;

    /* renamed from: x, reason: collision with root package name */
    private final C2411c f448x;

    /* renamed from: y, reason: collision with root package name */
    private C6399b f449y;

    /* renamed from: z, reason: collision with root package name */
    private final Fg.a f450z;

    /* renamed from: f1, reason: collision with root package name */
    static final /* synthetic */ th.l[] f416f1 = {O.h(new kotlin.jvm.internal.F(o.class, "applicationContext", "getApplicationContext()Landroid/content/Context;", 0)), O.h(new kotlin.jvm.internal.F(o.class, "wifiConnectionService", "getWifiConnectionService()Lcom/ui/wifiman/model/wifi/connection/WifiConnectionService;", 0)), O.h(new kotlin.jvm.internal.F(o.class, "packageManager", "getPackageManager()Landroid/content/pm/PackageManager;", 0)), O.h(new kotlin.jvm.internal.F(o.class, "permissionsService", "getPermissionsService()Lcom/ui/wifiman/model/android/permissions/AndroidPermissionService;", 0)), O.h(new kotlin.jvm.internal.F(o.class, "arIdObjectMatcher", "getArIdObjectMatcher()Lcom/ubnt/mlkit/product/ArObjectProductMatcher;", 0)), O.h(new kotlin.jvm.internal.F(o.class, "vibrator", "getVibrator()Lcom/ui/wifiman/model/android/vibrator/AndroidVibrator;", 0)), O.h(new kotlin.jvm.internal.F(o.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new kotlin.jvm.internal.F(o.class, "toastService", "getToastService()Lcom/ui/wifiman/domain/toast/ToastService;", 0)), O.h(new kotlin.jvm.internal.F(o.class, "analytics", "getAnalytics()Lcom/ubnt/usurvey/analytics/Analytics;", 0)), O.h(new kotlin.jvm.internal.F(o.class, "popupController", "getPopupController()Lcom/ubnt/usurvey/ui/popup/ApplicationPopupController;", 0)), O.h(new kotlin.jvm.internal.F(o.class, "floorplanViewControllerManager", "getFloorplanViewControllerManager()Lcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;", 0)), O.h(new kotlin.jvm.internal.F(o.class, "wifimanDeviceManager", "getWifimanDeviceManager()Lcom/ui/wifiman/model/device/WifimanDeviceManager;", 0)), O.h(new kotlin.jvm.internal.F(o.class, "appScreenManager", "getAppScreenManager()Lcom/ui/wifiman/model/android/window/AppWindowService;", 0)), O.g(new kotlin.jvm.internal.D(o.class, "positionChangeWhileResumed", "<v#0>", 0)), O.g(new kotlin.jvm.internal.D(o.class, "vibrationOnErrorStream", "<v#1>", 0)), O.g(new kotlin.jvm.internal.D(o.class, "stream", "<v#2>", 0)), O.g(new kotlin.jvm.internal.D(o.class, "stream", "<v#3>", 0))};

    /* renamed from: Z, reason: collision with root package name */
    public static final C2413a f415Z = new C2413a(null);

    /* renamed from: g1, reason: collision with root package name */
    public static final int f417g1 = 8;

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class A extends org.kodein.type.o<Context> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class B extends org.kodein.type.o<je.u> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C extends org.kodein.type.o<PackageManager> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class D extends org.kodein.type.o<com.ui.wifiman.model.android.permissions.d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class E extends org.kodein.type.o<com.ubnt.mlkit.product.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class F extends org.kodein.type.o<InterfaceC8157a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class G extends org.kodein.type.o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class H extends org.kodein.type.o<InterfaceC5974b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class I extends org.kodein.type.o<P7.a> {
    }

    public static final class J implements gg.C {
        public J() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(Boolean.valueOf(o.this.m1().hasSystemFeature("android.hardware.camera")));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class K implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final K f452a = new K();

        K() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d.c apply(Ye.e it) {
            AbstractC6492s.i(it, "it");
            if (it instanceof e.b) {
                return new d.c(((e.b) it).a());
            }
            if (it instanceof e.a) {
                return new d.c(((e.a) it).a().d(":"));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class L implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final L f453a = new L();

        L() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(d.c it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(it);
        }
    }

    static final class M implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final M f454a = new M();

        M() {
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final Te.B0 apply(A8.o.C2415c r18, a8.C3771a r19) {
            /*
                Method dump skipped, instructions count: 233
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: A8.o.M.apply(A8.o$c, a8.a):Te.B0");
        }
    }

    /* renamed from: A8.o$a, reason: case insensitive filesystem */
    public static final class C2413a {
        public /* synthetic */ C2413a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2413a() {
        }
    }

    /* renamed from: A8.o$b, reason: case insensitive filesystem */
    private static final class C2414b {

        /* renamed from: a, reason: collision with root package name */
        private final PointF f455a;

        /* renamed from: b, reason: collision with root package name */
        private final float f456b;

        /* renamed from: c, reason: collision with root package name */
        private final float f457c;

        /* renamed from: d, reason: collision with root package name */
        private final PointF f458d;

        /* renamed from: e, reason: collision with root package name */
        private final float f459e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f460f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f461g;

        public C2414b(PointF centeredOn, float f10, float f11, PointF positionMarkerCoordinates, float f12, boolean z10, boolean z11) {
            AbstractC6492s.i(centeredOn, "centeredOn");
            AbstractC6492s.i(positionMarkerCoordinates, "positionMarkerCoordinates");
            this.f455a = centeredOn;
            this.f456b = f10;
            this.f457c = f11;
            this.f458d = positionMarkerCoordinates;
            this.f459e = f12;
            this.f460f = z10;
            this.f461g = z11;
        }

        public final boolean a() {
            return this.f460f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2414b)) {
                return false;
            }
            C2414b c2414b = (C2414b) obj;
            return AbstractC6492s.d(this.f455a, c2414b.f455a) && Float.compare(this.f456b, c2414b.f456b) == 0 && Float.compare(this.f457c, c2414b.f457c) == 0 && AbstractC6492s.d(this.f458d, c2414b.f458d) && Float.compare(this.f459e, c2414b.f459e) == 0 && this.f460f == c2414b.f460f && this.f461g == c2414b.f461g;
        }

        public int hashCode() {
            return (((((((((((this.f455a.hashCode() * 31) + Float.hashCode(this.f456b)) * 31) + Float.hashCode(this.f457c)) * 31) + this.f458d.hashCode()) * 31) + Float.hashCode(this.f459e)) * 31) + Boolean.hashCode(this.f460f)) * 31) + Boolean.hashCode(this.f461g);
        }

        public String toString() {
            return "FloorplanState(centeredOn=" + this.f455a + ", zoom=" + this.f456b + ", rotationAngle=" + this.f457c + ", positionMarkerCoordinates=" + this.f458d + ", positionMarkerRotationAngle=" + this.f459e + ", centeredOnPosition=" + this.f460f + ", rotatedByPosition=" + this.f461g + ")";
        }
    }

    /* renamed from: A8.o$c, reason: case insensitive filesystem */
    private static final class C2415c {

        /* renamed from: c, reason: collision with root package name */
        public static final a f462c = new a(null);

        /* renamed from: d, reason: collision with root package name */
        private static final C2415c f463d = new C2415c(null, null);

        /* renamed from: a, reason: collision with root package name */
        private final S8.l f464a;

        /* renamed from: b, reason: collision with root package name */
        private final C5969a f465b;

        /* renamed from: A8.o$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C2415c a() {
                return C2415c.f463d;
            }

            private a() {
            }
        }

        public C2415c(S8.l lVar, C5969a c5969a) {
            this.f464a = lVar;
            this.f465b = c5969a;
        }

        public final C5969a b() {
            return this.f465b;
        }

        public final S8.l c() {
            return this.f464a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2415c)) {
                return false;
            }
            C2415c c2415c = (C2415c) obj;
            return AbstractC6492s.d(this.f464a, c2415c.f464a) && AbstractC6492s.d(this.f465b, c2415c.f465b);
        }

        public int hashCode() {
            S8.l lVar = this.f464a;
            int iHashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
            C5969a c5969a = this.f465b;
            return iHashCode + (c5969a != null ? c5969a.hashCode() : 0);
        }

        public String toString() {
            return "SignalState(signal=" + this.f464a + ", apBssid=" + this.f465b + ")";
        }
    }

    /* renamed from: A8.o$d, reason: case insensitive filesystem */
    static final class C2416d implements kg.p {

        /* renamed from: a, reason: collision with root package name */
        public static final C2416d f466a = new C2416d();

        C2416d() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(EnumC5426b it) {
            AbstractC6492s.i(it, "it");
            return it == EnumC5426b.AVAILABLE;
        }
    }

    /* renamed from: A8.o$e, reason: case insensitive filesystem */
    static final class C2417e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C2417e f467a = new C2417e();

        /* renamed from: A8.o$e$a */
        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f468a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(Long it) {
                AbstractC6492s.i(it, "it");
                return new C6556a(null);
            }
        }

        C2417e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(e7.g trackingState) {
            Object obj;
            AbstractC6492s.i(trackingState, "trackingState");
            if ((trackingState instanceof g.a) || (trackingState instanceof g.b.C1733b)) {
                gg.i iVarK0 = gg.i.K0(new C6556a(null));
                AbstractC6492s.h(iVarK0, "just(...)");
                return iVarK0;
            }
            if (trackingState instanceof g.b.c) {
                gg.i iVarZ1 = gg.i.d2(3L, TimeUnit.SECONDS).N0(a.f468a).z1(new C6556a(c.a.C0949a.f24908a));
                AbstractC6492s.h(iVarZ1, "startWithItem(...)");
                return iVarZ1;
            }
            if (!(trackingState instanceof g.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            g.b.a aVar = (g.b.a) trackingState;
            if (aVar instanceof g.b.a.c) {
                obj = c.b.C0951c.f24911a;
            } else if (aVar instanceof g.b.a.d) {
                obj = c.b.d.f24912a;
            } else if (aVar instanceof g.b.a.C1732b) {
                obj = c.b.C0950b.f24910a;
            } else if (aVar instanceof g.b.a.C1731a) {
                obj = c.b.a.f24909a;
            } else {
                if (!(aVar instanceof g.b.a.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                obj = c.b.e.f24913a;
            }
            gg.i iVarK02 = gg.i.K0(new C6556a(obj));
            AbstractC6492s.h(iVarK02, "just(...)");
            return iVarK02;
        }
    }

    /* renamed from: A8.o$f, reason: case insensitive filesystem */
    static final class C2418f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C2418f f469a = new C2418f();

        C2418f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Set it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.contains(com.ui.wifiman.model.android.permissions.a.CAMERA));
        }
    }

    /* renamed from: A8.o$g, reason: case insensitive filesystem */
    static final class C2419g implements kg.h {

        /* renamed from: a, reason: collision with root package name */
        public static final C2419g f470a = new C2419g();

        C2419g() {
        }

        @Override // kg.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ye.d a(Wc.b arCoreInitState, Boolean hasCamera, Boolean hasCameraPermission, e7.f arSessionState) {
            AbstractC6492s.i(arCoreInitState, "arCoreInitState");
            AbstractC6492s.i(hasCamera, "hasCamera");
            AbstractC6492s.i(hasCameraPermission, "hasCameraPermission");
            AbstractC6492s.i(arSessionState, "arSessionState");
            if (arCoreInitState instanceof b.C0898b) {
                return d.b.a.f24915a;
            }
            if (!(arCoreInitState instanceof b.a.C0897b)) {
                return d.b.AbstractC0952b.C0954d.f24919a;
            }
            if (!hasCamera.booleanValue()) {
                return d.b.AbstractC0952b.c.f24918a;
            }
            b.a.C0897b c0897b = (b.a.C0897b) arCoreInitState;
            return c0897b.b() == EnumC5426b.NOT_INSTALLED ? d.b.AbstractC0952b.a.f24916a : (c0897b.b() == EnumC5426b.UNSUPPORTED || c0897b.b() == EnumC5426b.ERROR) ? d.b.AbstractC0952b.c.f24918a : !hasCameraPermission.booleanValue() ? d.b.AbstractC0952b.C0953b.f24917a : arSessionState instanceof f.a.c ? d.b.AbstractC0952b.c.f24918a : arSessionState instanceof f.a.b ? d.b.AbstractC0952b.a.f24916a : arSessionState instanceof f.a.C1730a ? d.b.AbstractC0952b.C0954d.f24919a : d.a.f24914a;
        }
    }

    /* renamed from: A8.o$h, reason: case insensitive filesystem */
    static final class C2420h implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a.b f471a;

        C2420h(a.b bVar) {
            this.f471a = bVar;
        }

        public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(context, "context");
            interfaceC3540l.U(-1741985371);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1741985371, i10, -1, "com.ubnt.usurvey.ui.signal.floorplan.FloorplanMapperVM.<set-detectedDevice>.<anonymous> (FloorplanMapperVM.kt:154)");
            }
            String string = context.getString(R.string.floorplan_device_discovered_title_format);
            AbstractC6492s.h(string, "getString(...)");
            String str = String.format(string, Arrays.copyOf(new Object[]{AbstractC7930a.b(AbstractC2409a.a(this.f471a), interfaceC3540l, 0)}, 1));
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

    /* renamed from: A8.o$i, reason: case insensitive filesystem */
    static final class C2421i implements kg.n {
        C2421i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PointF apply(C2414b it) {
            AbstractC6492s.i(it, "it");
            return new PointF(o.this.f447w.B().x, o.this.f447w.B().y);
        }
    }

    /* renamed from: A8.o$j, reason: case insensitive filesystem */
    static final class C2422j implements kg.n {

        /* renamed from: A8.o$j$a */
        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f474a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ PointF f475b;

            /* renamed from: A8.o$j$a$a, reason: collision with other inner class name */
            public static final class C0012a implements InterfaceC5915e {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ o f476a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ PointF f477b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C2415c f478c;

                public C0012a(o oVar, PointF pointF, C2415c c2415c) {
                    this.f476a = oVar;
                    this.f477b = pointF;
                    this.f478c = c2415c;
                }

                @Override // gg.InterfaceC5915e
                public final void a(InterfaceC5913c interfaceC5913c) {
                    try {
                        A8.z zVar = this.f476a.f447w;
                        PointF pointF = this.f477b;
                        zVar.s0(pointF.x, pointF.y, this.f478c.c());
                        interfaceC5913c.a();
                    } catch (Throwable th2) {
                        interfaceC5913c.onError(th2);
                    }
                }
            }

            a(o oVar, PointF pointF) {
                this.f474a = oVar;
                this.f475b = pointF;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(C2415c connection) {
                AbstractC6492s.i(connection, "connection");
                AbstractC5912b abstractC5912bR = AbstractC5912b.r(new C0012a(this.f474a, this.f475b, connection));
                AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
                return abstractC5912bR;
            }
        }

        C2422j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(PointF position) {
            AbstractC6492s.i(position, "position");
            return o.this.f446v.o0().t(new a(o.this, position));
        }
    }

    /* renamed from: A8.o$k, reason: case insensitive filesystem */
    static final class C2423k implements InterfaceC6469f {
        C2423k() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(C6399b it) {
            AbstractC6492s.i(it, "it");
            if (o.this.f449y != null) {
                Z7.b.h("Signal mapper discover ignored object because previous device not confirmed yet", null, 2, null);
                return;
            }
            Z7.b.h("Signal mapper object discovered " + it.c() + " at " + it.b() + " with confidence " + it.a(), null, 2, null);
            if (o.this.j1().a(it.c(), it.a()) == null) {
                Z7.b.h("Signal mapper discover ignored object", null, 2, null);
                return;
            }
            Iterator it2 = o.this.f447w.z(it.b().x, it.b().y, 1.0f).iterator();
            while (it2.hasNext()) {
                if (AbstractC6492s.d(((od.f) it2.next()).h(), it.c())) {
                    Z7.b.h("Signal mapper object discovered " + it.c() + " at " + it.b() + " is already in map", null, 2, null);
                    o.this.q1().a(InterfaceC8157a.EnumC2226a.TICK);
                    return;
                }
            }
            o.this.F1(it);
            o.this.q1().a(InterfaceC8157a.EnumC2226a.TICK);
        }
    }

    /* renamed from: A8.o$l, reason: case insensitive filesystem */
    static final class C2424l implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C2424l f480a = new C2424l();

        C2424l() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(e7.g it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it instanceof g.b.a);
        }
    }

    /* renamed from: A8.o$m, reason: case insensitive filesystem */
    static final class C2425m implements kg.n {

        /* renamed from: A8.o$m$a */
        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f482a;

            public a(o oVar) {
                this.f482a = oVar;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    this.f482a.q1().a(InterfaceC8157a.EnumC2226a.TICK);
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        C2425m() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Boolean isError) {
            AbstractC6492s.i(isError, "isError");
            if (!isError.booleanValue()) {
                return AbstractC5912b.m();
            }
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(o.this));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }
    }

    static final class n implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final n f483a = new n();

        n() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(C2414b it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.a());
        }
    }

    /* renamed from: A8.o$o, reason: collision with other inner class name */
    public static final class C0013o implements InterfaceC5915e {
        public C0013o() {
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                if (o.this.f447w.t() && o.this.f447w.F()) {
                    o.this.f447w.d(false);
                    o.this.f447w.f(false);
                } else {
                    o.this.f447w.p();
                }
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    static final class p implements kg.n {
        p() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Long recordId) {
            AbstractC6492s.i(recordId, "recordId");
            return o.this.r1().a(new InterfaceC6084a.b.AbstractC6093k.c(recordId.longValue()));
        }
    }

    static final class q implements kg.n {

        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f487a;

            public a(o oVar) {
                this.f487a = oVar;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    this.f487a.p1().a(new C5973a(new AbstractC5452a.C1741a(R.string.error_unexpected, new Object[0]), false, 2, null));
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        q() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            if (!(error instanceof WifimanFloorplanViewControllerManager.Error)) {
                return AbstractC5912b.D(error);
            }
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(o.this));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }
    }

    static final class r implements kg.n {
        r() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Ye.d cntType) {
            AbstractC6492s.i(cntType, "cntType");
            if ((cntType instanceof d.a) || (cntType instanceof d.b.a)) {
                return AbstractC5912b.m();
            }
            if (cntType instanceof d.b.AbstractC0952b.C0953b) {
                return o.this.n1().a(com.ui.wifiman.model.android.permissions.a.CAMERA);
            }
            if (cntType instanceof d.b.AbstractC0952b.a) {
                return o.this.r1().a(InterfaceC6084a.b.AbstractC6086d.C1829a.f48922a);
            }
            if (cntType instanceof d.b.AbstractC0952b.c) {
                return o.this.r1().a(InterfaceC6084a.b.AbstractC6086d.C1830b.f48923a);
            }
            if (cntType instanceof d.b.AbstractC0952b.C0954d) {
                return AbstractC5912b.m();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final class s implements InterfaceC5915e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f490b;

        public s(boolean z10) {
            this.f490b = z10;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            f.a aVar;
            try {
                C6399b c6399b = o.this.f449y;
                if (c6399b == null) {
                    o.this.F1(null);
                } else {
                    a.b bVarA = o.this.j1().a(c6399b.c(), c6399b.a());
                    if (bVarA == null) {
                        Z7.b.h("Signal mapper discover ignored object", null, 2, null);
                    } else {
                        A8.z zVar = o.this.f447w;
                        float f10 = c6399b.b().x;
                        float f11 = c6399b.b().y;
                        W7.d dVar = new W7.d(0, 0);
                        String strC = c6399b.c();
                        if (this.f490b) {
                            aVar = null;
                        } else {
                            int iB = AbstractC2409a.b(bVarA);
                            o oVar = o.this;
                            aVar = new f.a(iB, oVar.a1(oVar.i1(), 36));
                        }
                        zVar.t0(f10, f11, new od.f(dVar, strC, aVar));
                        o.this.F1(null);
                    }
                }
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    static final class t implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ye.e f492a;

            a(Ye.e eVar) {
                this.f492a = eVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C2415c apply(AbstractC6317r connectionState) {
                AbstractC6492s.i(connectionState, "connectionState");
                Ye.e eVar = this.f492a;
                if (eVar instanceof e.b) {
                    if (connectionState instanceof AbstractC6317r.b.a) {
                        AbstractC6317r.b.a aVar = (AbstractC6317r.b.a) connectionState;
                        AbstractC6458c abstractC6458cI = aVar.i();
                        if (AbstractC6492s.d(abstractC6458cI != null ? abstractC6458cI.b() : null, ((e.b) this.f492a).a())) {
                            return new C2415c(aVar.h(), aVar.c());
                        }
                    }
                    return C2415c.f462c.a();
                }
                if (!(eVar instanceof e.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (connectionState instanceof AbstractC6317r.b.a) {
                    AbstractC6317r.b.a aVar2 = (AbstractC6317r.b.a) connectionState;
                    if (AbstractC6492s.d(aVar2.c(), ((e.a) this.f492a).a())) {
                        return new C2415c(aVar2.h(), aVar2.c());
                    }
                }
                return C2415c.f462c.a();
            }
        }

        t() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Ye.e p10) {
            AbstractC6492s.i(p10, "p");
            return o.this.s1().a().N0(new a(p10));
        }
    }

    public static final class u implements gg.k {
        public u() {
        }

        @Override // gg.k
        public final void a(gg.j it) {
            AbstractC6492s.i(it, "it");
            try {
                it.h(o.this.r0());
            } catch (Throwable th2) {
                it.onError(th2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class v extends org.kodein.type.o<InterfaceC8140a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class w extends org.kodein.type.o<WifimanFloorplanViewControllerManager> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class x extends org.kodein.type.o<Cc.n> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class y extends org.kodein.type.o<InterfaceC8209b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class z extends org.kodein.type.o<Context> {
    }

    public o(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f431g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new A().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, Context.class), null);
        th.l[] lVarArr = f416f1;
        this.f432h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new B().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f433i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, je.u.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new C().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f434j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, PackageManager.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new D().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f435k = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE4, com.ui.wifiman.model.android.permissions.d.class), null).a(this, lVarArr[3]);
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new E().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f436l = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE5, com.ubnt.mlkit.product.a.class), null).a(this, lVarArr[4]);
        org.kodein.type.i iVarE6 = org.kodein.type.s.e(new F().getSuperType());
        AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f437m = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE6, InterfaceC8157a.class), null).a(this, lVarArr[5]);
        org.kodein.type.i iVarE7 = org.kodein.type.s.e(new G().getSuperType());
        AbstractC6492s.g(iVarE7, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f438n = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE7, InterfaceC6084a.class), null).a(this, lVarArr[6]);
        org.kodein.type.i iVarE8 = org.kodein.type.s.e(new H().getSuperType());
        AbstractC6492s.g(iVarE8, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f439o = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE8, InterfaceC5974b.class), null).a(this, lVarArr[7]);
        org.kodein.type.i iVarE9 = org.kodein.type.s.e(new I().getSuperType());
        AbstractC6492s.g(iVarE9, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f440p = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE9, P7.a.class), null).a(this, lVarArr[8]);
        org.kodein.type.i iVarE10 = org.kodein.type.s.e(new v().getSuperType());
        AbstractC6492s.g(iVarE10, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f441q = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE10, InterfaceC8140a.class), null).a(this, lVarArr[9]);
        org.kodein.type.i iVarE11 = org.kodein.type.s.e(new w().getSuperType());
        AbstractC6492s.g(iVarE11, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f442r = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE11, WifimanFloorplanViewControllerManager.class), null).a(this, lVarArr[10]);
        org.kodein.type.i iVarE12 = org.kodein.type.s.e(new x().getSuperType());
        AbstractC6492s.g(iVarE12, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f443s = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE12, Cc.n.class), null).a(this, lVarArr[11]);
        org.kodein.type.i iVarE13 = org.kodein.type.s.e(new y().getSuperType());
        AbstractC6492s.g(iVarE13, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f444t = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE13, InterfaceC8209b.class), null).a(this, lVarArr[12]);
        EnumC5911a enumC5911a = EnumC5911a.LATEST;
        gg.i iVarI2 = gg.i.N(new u(), enumC5911a).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f445u = iVarI2;
        gg.i iVarI22 = iVarI2.I1(new t()).W().o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f446v = iVarI22;
        A8.z zVarA = l1().a();
        this.f447w = zVarA;
        this.f448x = new C2411c(zVarA);
        Fg.a aVarK2 = Fg.a.k2(new C6556a(null));
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f450z = aVarK2;
        gg.i iVarI23 = gg.i.N(new gg.k() { // from class: A8.i
            @Override // gg.k
            public final void a(gg.j jVar) {
                o.b1(this.f409a, jVar);
            }
        }, enumC5911a).W().X0(Gg.a.a()).o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f418A = iVarI23;
        gg.i iVarI24 = iVarI23.N0(new C2421i()).W().o1(1).i2();
        AbstractC6492s.h(iVarI24, "refCount(...)");
        this.f419B = iVarI24;
        EnumC5426b.a aVar = EnumC5426b.Companion;
        InterfaceC7733m2 interfaceC7733m2G = org.kodein.di.d.f(getDi()).g();
        org.kodein.type.i iVarE14 = org.kodein.type.s.e(new z().getSuperType());
        AbstractC6492s.g(iVarE14, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        gg.i iVarR1 = EnumC5426b.a.c(aVar, (Context) interfaceC7733m2G.e(new org.kodein.type.d(iVarE14, Context.class), null), 0L, 2, null).R1(C2416d.f466a);
        AbstractC6492s.h(iVarR1, "takeUntil(...)");
        gg.i iVarI25 = AbstractC5817h.e(iVarR1, null, 1, null).o1(1).i2();
        AbstractC6492s.h(iVarI25, "refCount(...)");
        this.f420C = iVarI25;
        gg.z zVarI = gg.z.i(new J());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        gg.i iVarI26 = zVarI.W().F1(Gg.a.a()).o1(1).i2();
        AbstractC6492s.h(iVarI26, "refCount(...)");
        this.f421D = iVarI26;
        gg.i iVarI27 = n1().b().N0(C2418f.f469a).W().o1(1).i2();
        AbstractC6492s.h(iVarI27, "refCount(...)");
        this.f422E = iVarI27;
        gg.i iVarI28 = gg.i.t(iVarI25, iVarI26, iVarI27, q0().h(), C2419g.f470a).W().o1(1).i2();
        AbstractC6492s.h(iVarI28, "refCount(...)");
        this.f423F = iVarI28;
        this.f424G = AbstractC8661g.d0(this, iVarI28, d.b.a.f24915a, false, null, 6, null);
        gg.i iVarW = iVarI23.N0(n.f483a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f425H = AbstractC8661g.d0(this, iVarW, Boolean.TRUE, false, null, 6, null);
        gg.i iVarW2 = q0().i().I1(C2417e.f467a).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f426I = AbstractC8661g.h0(this, iVarW2, null, null, 2, null);
        this.f427J = P.a(Ue.r.f22430a.c());
        gg.i iVarW3 = aVarK2.e1().Y0(Gg.a.a(), false, 1).W();
        AbstractC6492s.h(iVarW3, "distinctUntilChanged(...)");
        this.f428N = AbstractC8661g.h0(this, iVarW3, null, null, 2, null);
        gg.i iVarW4 = iVarI2.N0(K.f452a).N0(L.f453a).W();
        AbstractC6492s.h(iVarW4, "distinctUntilChanged(...)");
        this.f429X = AbstractC8661g.h0(this, iVarW4, null, null, 2, null);
        gg.i iVarV = gg.i.v(iVarI22, t1().a(), M.f454a);
        AbstractC6492s.h(iVarV, "combineLatest(...)");
        this.f430Y = AbstractC8661g.d0(this, iVarV, new B0("", null, null, new d.c(""), true, null, null, null, false, null, 288, null), false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.i A1(o oVar) {
        gg.i iVarC0 = oVar.q0().i().N0(C2424l.f480a).W().t0(oVar.new C2425m()).c0();
        AbstractC6492s.h(iVarC0, "toFlowable(...)");
        return iVarC0;
    }

    private final void B1() {
        C8658d c8658d = C8658d.f66727a;
        c8658d.e(D1(c8658d.b(this, AbstractC4013k.b.RESUMED, new InterfaceC6824a() { // from class: A8.h
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return o.C1(this.f408a);
            }
        })), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.i C1(o oVar) {
        gg.i iVarC0 = oVar.h1().a().c0();
        AbstractC6492s.h(iVarC0, "toFlowable(...)");
        return iVarC0;
    }

    private static final gg.i D1(C8658d.a aVar) {
        return aVar.c(null, f416f1[16]);
    }

    private final AbstractC5912b E1(boolean z10) {
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new s(z10));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        return abstractC5912bR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F1(C6399b c6399b) {
        C3589k c3589k = null;
        a.b bVarA = c6399b != null ? j1().a(c6399b.c(), c6399b.a()) : null;
        if (bVarA == null) {
            this.f449y = null;
        } else {
            this.f449y = c6399b;
            c3589k = new C3589k(new c.a(AbstractC2409a.c(bVarA), null, 2, null), new d.a(String.valueOf(AbstractC2409a.a(bVarA).hashCode()), new C2420h(bVarA)), new d.b(R.string.floorplan_device_discovered_message));
        }
        this.f450z.h(new C6556a(c3589k));
    }

    private final void X0() {
        C8658d c8658d = C8658d.f66727a;
        c8658d.e(Z0(c8658d.b(this, AbstractC4013k.b.STARTED, new InterfaceC6824a() { // from class: A8.j
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return o.Y0(this.f410a);
            }
        })), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.i Y0(o oVar) {
        gg.i iVarC0 = AbstractC5912b.p(oVar.o1().b()).c0();
        AbstractC6492s.h(iVarC0, "toFlowable(...)");
        return iVarC0;
    }

    private static final gg.i Z0(C8658d.a aVar) {
        return aVar.c(null, f416f1[15]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int a1(Context context, int i10) {
        return (int) (i10 * context.getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b1(final o oVar, final gg.j emitter) {
        AbstractC6492s.i(emitter, "emitter");
        emitter.d(new InterfaceC6468e() { // from class: A8.l
            @Override // kg.InterfaceC6468e
            public final void cancel() {
                o.c1(this.f412a);
            }
        });
        oVar.f447w.V(new InterfaceC6824a() { // from class: A8.m
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return o.e1(emitter, oVar);
            }
        });
        emitter.h(f1(oVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c1(o oVar) {
        oVar.f447w.V(new InterfaceC6824a() { // from class: A8.n
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return o.d1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J d1() {
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J e1(gg.j jVar, o oVar) {
        jVar.h(f1(oVar));
        return Yg.J.f24997a;
    }

    private static final C2414b f1(o oVar) {
        return new C2414b(oVar.f447w.s(), oVar.f447w.c(), oVar.f447w.b(), oVar.f447w.B(), oVar.f447w.C(), oVar.f447w.t(), oVar.f447w.F());
    }

    private final P7.a g1() {
        return (P7.a) this.f440p.getValue();
    }

    private final InterfaceC8209b h1() {
        return (InterfaceC8209b) this.f444t.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context i1() {
        return (Context) this.f432h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.ubnt.mlkit.product.a j1() {
        return (com.ubnt.mlkit.product.a) this.f436l.getValue();
    }

    private final WifimanFloorplanViewControllerManager l1() {
        return (WifimanFloorplanViewControllerManager) this.f442r.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PackageManager m1() {
        return (PackageManager) this.f434j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.ui.wifiman.model.android.permissions.d n1() {
        return (com.ui.wifiman.model.android.permissions.d) this.f435k.getValue();
    }

    private final InterfaceC8140a o1() {
        return (InterfaceC8140a) this.f441q.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC5974b p1() {
        return (InterfaceC5974b) this.f439o.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC8157a q1() {
        return (InterfaceC8157a) this.f437m.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a r1() {
        return (InterfaceC6084a) this.f438n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final je.u s1() {
        return (je.u) this.f433i.getValue();
    }

    private final Cc.n t1() {
        return (Cc.n) this.f443s.getValue();
    }

    private final void u1() {
        C8658d c8658d = C8658d.f66727a;
        c8658d.e(w1(c8658d.b(this, AbstractC4013k.b.RESUMED, new InterfaceC6824a() { // from class: A8.k
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return o.v1(this.f411a);
            }
        })), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.i v1(o oVar) {
        gg.i iVarC0 = oVar.f419B.t0(oVar.new C2422j()).c0();
        AbstractC6492s.h(iVarC0, "toFlowable(...)");
        return iVarC0;
    }

    private static final gg.i w1(C8658d.a aVar) {
        return aVar.c(null, f416f1[13]);
    }

    private final void x1() {
        C8658d c8658d = C8658d.f66727a;
        gg.i iVarF0 = this.f447w.y().f0(new C2423k());
        AbstractC6492s.h(iVarF0, "doOnNext(...)");
        c8658d.e(iVarF0, this);
    }

    private final void y1() {
        C8658d c8658d = C8658d.f66727a;
        c8658d.e(z1(c8658d.b(this, AbstractC4013k.b.RESUMED, new InterfaceC6824a() { // from class: A8.g
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return o.A1(this.f407a);
            }
        })), this);
    }

    private static final gg.i z1(C8658d.a aVar) {
        return aVar.c(null, f416f1[14]);
    }

    @Override // Ye.f
    public void A0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bT = this.f423F.o0().t(new r());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f431g;
    }

    @Override // Ye.f
    /* renamed from: k1, reason: merged with bridge method [inline-methods] */
    public C2411c q0() {
        return this.f448x;
    }

    @Override // ye.AbstractC8661g
    public void l0() {
        super.l0();
        g1().b(new c.g.d());
        B1();
        u1();
        x1();
        y1();
        X0();
    }

    @Override // Ye.f
    public N n0() {
        return this.f426I;
    }

    @Override // Ye.f
    public N o0() {
        return this.f424G;
    }

    @Override // Ye.f
    public N p0() {
        return this.f428N;
    }

    @Override // Ye.f
    public N s0() {
        return this.f427J;
    }

    @Override // Ye.f
    public N t0() {
        return this.f429X;
    }

    @Override // Ye.f
    public N u0() {
        return this.f430Y;
    }

    @Override // Ye.f
    public N v0() {
        return this.f425H;
    }

    @Override // Ye.f
    public void w0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new C0013o());
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        c8658d.d(abstractC5912bR, this);
    }

    @Override // Ye.f
    public void x0() {
        C8658d.f66727a.d(E1(true), this);
    }

    @Override // Ye.f
    public void y0() {
        C8658d.f66727a.d(E1(false), this);
    }

    @Override // Ye.f
    public void z0() {
        C8658d c8658d = C8658d.f66727a;
        WifimanFloorplanViewControllerManager wifimanFloorplanViewControllerManagerL1 = l1();
        A8.z zVar = this.f447w;
        Ye.e eVarR0 = r0();
        e.b bVar = eVarR0 instanceof e.b ? (e.b) eVarR0 : null;
        AbstractC5912b abstractC5912bO = wifimanFloorplanViewControllerManagerL1.b(zVar, bVar != null ? bVar.a() : null).t(new p()).O(new q());
        AbstractC6492s.h(abstractC5912bO, "onErrorResumeNext(...)");
        c8658d.d(abstractC5912bO, this);
    }
}
