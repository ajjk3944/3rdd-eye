package t8;

import Li.N;
import Li.P;
import Yg.m;
import androidx.lifecycle.AbstractC4013k;
import com.ubnt.usurvey.R;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.z;
import i8.InterfaceC6084a;
import java.util.Set;
import kg.n;
import kg.p;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import mh.InterfaceC6824a;
import org.kodein.di.DI;
import org.kodein.type.o;
import org.kodein.type.s;
import pc.InterfaceC7283a;
import rj.InterfaceC7810x2;
import s9.d;
import th.l;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class e extends Oe.b {

    /* renamed from: n, reason: collision with root package name */
    static final /* synthetic */ l[] f61846n = {O.h(new F(e.class, "permissionManager", "getPermissionManager()Lcom/ui/wifiman/model/android/permissions/AndroidPermissionService;", 0)), O.h(new F(e.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new F(e.class, "locationService", "getLocationService()Lcom/ui/wifiman/model/android/location/LocationService;", 0)), O.g(new D(e.class, "stream", "<v#0>", 0))};

    /* renamed from: o, reason: collision with root package name */
    public static final int f61847o = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f61848g;

    /* renamed from: h, reason: collision with root package name */
    private final m f61849h;

    /* renamed from: i, reason: collision with root package name */
    private final m f61850i;

    /* renamed from: j, reason: collision with root package name */
    private final m f61851j;

    /* renamed from: k, reason: collision with root package name */
    private final m f61852k;

    /* renamed from: l, reason: collision with root package name */
    private final m f61853l;

    /* renamed from: m, reason: collision with root package name */
    private final m f61854m;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61855a;

        static {
            int[] iArr = new int[Oe.a.values().length];
            try {
                iArr[Oe.a.PERMISSION_CELLULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Oe.a.PERMISSION_LOCATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Oe.a.LOCATION_ACCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Oe.a.NO_WIFIMAN_API.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f61855a = iArr;
        }
    }

    static final class b implements p {

        /* renamed from: a, reason: collision with root package name */
        public static final b f61856a = new b();

        b() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(Boolean it) {
            AbstractC6492s.i(it, "it");
            return it.booleanValue();
        }
    }

    static final class c implements n {
        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Boolean it) {
            AbstractC6492s.i(it, "it");
            return e.this.E0().a(InterfaceC6084a.b.n.f48939a);
        }
    }

    static final class d implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f61858a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Throwable it) {
            AbstractC6492s.i(it, "it");
            Z7.b.j("Error when check if permission granted", it, null, 4, null);
            return AbstractC5912b.m();
        }
    }

    /* renamed from: t8.e$e, reason: collision with other inner class name */
    static final class C2174e implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C2174e f61859a = new C2174e();

        C2174e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Set it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.contains(com.ui.wifiman.model.android.permissions.a.PHONE_STATE));
        }
    }

    static final class f implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f61860a = new f();

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Set it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.contains(com.ui.wifiman.model.android.permissions.a.LOCATION_FINE));
        }
    }

    public static final class g implements InterfaceC5915e {
        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                Z7.b.j("No action should be visible for no wifiman api", null, null, 6, null);
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h extends o<com.ui.wifiman.model.android.permissions.d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class i extends o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class j extends o<InterfaceC7283a> {
    }

    public e(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f61848g = di2;
        DI di3 = getDi();
        org.kodein.type.i iVarE = s.e(new h().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(di3, new org.kodein.type.d(iVarE, com.ui.wifiman.model.android.permissions.d.class), null);
        l[] lVarArr = f61846n;
        this.f61849h = interfaceC7810x2A.a(this, lVarArr[0]);
        DI di4 = getDi();
        org.kodein.type.i iVarE2 = s.e(new i().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f61850i = org.kodein.di.d.a(di4, new org.kodein.type.d(iVarE2, InterfaceC6084a.class), null).a(this, lVarArr[1]);
        DI di5 = getDi();
        org.kodein.type.i iVarE3 = s.e(new j().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f61851j = org.kodein.di.d.a(di5, new org.kodein.type.d(iVarE3, InterfaceC7283a.class), null).a(this, lVarArr[2]);
        this.f61852k = Yg.n.b(new InterfaceC6824a() { // from class: t8.a
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return e.L0(this.f61842a);
            }
        });
        this.f61853l = Yg.n.b(new InterfaceC6824a() { // from class: t8.b
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return e.K0(this.f61843a);
            }
        });
        this.f61854m = Yg.n.b(new InterfaceC6824a() { // from class: t8.c
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return e.w0(this.f61844a);
            }
        });
    }

    private final s9.d A0(Oe.a aVar) {
        int i10 = a.f61855a[aVar.ordinal()];
        if (i10 == 1) {
            return new d.b(R.string.permission_cellular_permission_dialog_message);
        }
        if (i10 == 2) {
            return new d.b(R.string.permission_location_permission_dialog_message);
        }
        if (i10 == 3) {
            return new d.b(R.string.permission_location_access_dialog_message);
        }
        if (i10 == 4) {
            return new d.b(R.string.disabled_wifiman_api_support_message);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final com.ui.wifiman.model.android.permissions.d B0() {
        return (com.ui.wifiman.model.android.permissions.d) this.f61849h.getValue();
    }

    private final s9.d D0(Oe.a aVar) {
        int i10 = a.f61855a[aVar.ordinal()];
        if (i10 == 1) {
            return new d.b(R.string.permission_cellular_permission_warning);
        }
        if (i10 == 2) {
            return new d.b(R.string.permission_location_permission_warning);
        }
        if (i10 == 3) {
            return new d.b(R.string.permission_location_access_warning);
        }
        if (i10 == 4) {
            return new d.b(R.string.disabled_wifiman_api_support_warning);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a E0() {
        return (InterfaceC6084a) this.f61850i.getValue();
    }

    private final void F0() {
        C8658d c8658d = C8658d.f66727a;
        c8658d.e(H0(c8658d.b(this, AbstractC4013k.b.STARTED, new InterfaceC6824a() { // from class: t8.d
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return e.G0(this.f61845a);
            }
        })), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.i G0(e eVar) {
        gg.i iVarC0 = eVar.J0(eVar.p0()).m0(b.f61856a).o0().t(eVar.new c()).O(d.f61858a).c0();
        AbstractC6492s.h(iVarC0, "toFlowable(...)");
        return iVarC0;
    }

    private static final gg.i H0(C8658d.a aVar) {
        return aVar.c(null, f61846n[3]);
    }

    private final boolean I0(Oe.a aVar) {
        int i10 = a.f61855a[aVar.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        if (i10 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final gg.i J0(Oe.a aVar) {
        gg.i iVarN0;
        int i10 = a.f61855a[aVar.ordinal()];
        if (i10 == 1) {
            iVarN0 = B0().b().N0(C2174e.f61859a);
        } else if (i10 == 2) {
            iVarN0 = B0().b().N0(f.f61860a);
        } else if (i10 == 3) {
            iVarN0 = y0().a();
        } else {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            iVarN0 = z.z(Boolean.FALSE).W();
        }
        gg.i iVarW = iVarN0.W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        return iVarW;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Li.z K0(e eVar) {
        return P.a(eVar.A0(eVar.p0()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Li.z L0(e eVar) {
        return P.a(eVar.D0(eVar.p0()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Li.z w0(e eVar) {
        return P.a(Boolean.valueOf(eVar.I0(eVar.p0())));
    }

    private final AbstractC5912b x0(Oe.a aVar) {
        int i10 = a.f61855a[aVar.ordinal()];
        if (i10 == 1) {
            return B0().a(com.ui.wifiman.model.android.permissions.a.PHONE_STATE);
        }
        if (i10 == 2) {
            return B0().a(com.ui.wifiman.model.android.permissions.a.LOCATION_FINE);
        }
        if (i10 == 3) {
            return E0().a(InterfaceC6084a.b.D.e.f48900a);
        }
        if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new g());
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        return abstractC5912bR;
    }

    private final InterfaceC7283a y0() {
        return (InterfaceC7283a) this.f61851j.getValue();
    }

    @Override // Oe.b
    /* renamed from: C0, reason: merged with bridge method [inline-methods] */
    public Li.z getTitle() {
        return (Li.z) this.f61852k.getValue();
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f61848g;
    }

    @Override // ye.AbstractC8661g
    public void l0() {
        super.l0();
        F0();
    }

    @Override // Oe.b
    public N n0() {
        return (N) this.f61854m.getValue();
    }

    @Override // Oe.b
    public void q0() {
        C8658d.f66727a.d(x0(p0()), this);
    }

    @Override // Oe.b
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public Li.z o0() {
        return (Li.z) this.f61853l.getValue();
    }
}
