package D8;

import Bc.a;
import Cc.InterfaceC2557a;
import Zg.AbstractC3689v;
import af.C3800I;
import af.EnumC3801J;
import be.InterfaceC4087a;
import gg.AbstractC5912b;
import i8.InterfaceC6084a;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jd.C6292a;
import jd.InterfaceC6293b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import org.kodein.di.DI;
import pc.InterfaceC7283a;
import rj.InterfaceC7810x2;
import xa.InterfaceC8439a;

/* loaded from: classes3.dex */
public final class i implements D8.h {

    /* renamed from: i, reason: collision with root package name */
    static final /* synthetic */ th.l[] f2999i = {O.h(new F(i.class, "permissionsService", "getPermissionsService()Lcom/ui/wifiman/model/android/permissions/AndroidPermissionService;", 0)), O.h(new F(i.class, "locationService", "getLocationService()Lcom/ui/wifiman/model/android/location/LocationService;", 0)), O.h(new F(i.class, "cellularSignalService", "getCellularSignalService()Lcom/ui/wifiman/model/cellular/CellularSignalService;", 0)), O.h(new F(i.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new F(i.class, "topologyService", "getTopologyService()Lcom/ui/wifiman/model/network/topology/NetworkTopologyService;", 0)), O.h(new F(i.class, "networkApiServiceAvailableService", "getNetworkApiServiceAvailableService()Lcom/ui/wifiman/model/ubiquiti/unifi/network/wifiman/NetworkApiServiceAvailableService;", 0))};

    /* renamed from: j, reason: collision with root package name */
    public static final int f3000j = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Yg.m f3001a;

    /* renamed from: b, reason: collision with root package name */
    private final Yg.m f3002b;

    /* renamed from: c, reason: collision with root package name */
    private final Yg.m f3003c;

    /* renamed from: d, reason: collision with root package name */
    private final Yg.m f3004d;

    /* renamed from: e, reason: collision with root package name */
    private final Yg.m f3005e;

    /* renamed from: f, reason: collision with root package name */
    private final Yg.m f3006f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f3007g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f3008h;

    static final class a implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f3009a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(List it) {
            AbstractC6492s.i(it, "it");
            if (it.isEmpty()) {
                it = null;
            }
            return new C6556a(it != null ? new C3800I(it) : null);
        }
    }

    public static final class b implements gg.q {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f3011b;

        public b(String str) {
            this.f3011b = str;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            Object next;
            try {
                Iterator<E> it = EnumC3801J.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (AbstractC6492s.d(i.this.f((EnumC3801J) next), this.f3011b)) {
                        break;
                    }
                }
                EnumC3801J enumC3801J = (EnumC3801J) next;
                if (enumC3801J != null) {
                    oVar.onSuccess(enumC3801J);
                } else {
                    oVar.a();
                }
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    static final class c implements kg.n {

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f3013a;

            static {
                int[] iArr = new int[EnumC3801J.values().length];
                try {
                    iArr[EnumC3801J.PERMISSION_LOCATION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC3801J.PERMISSION_CELLLAR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC3801J.LOCATION_ACCESS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC3801J.WIFIMAN_SUPPORT_DISABLED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f3013a = iArr;
            }
        }

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(EnumC3801J warning) {
            AbstractC6492s.i(warning, "warning");
            int i10 = a.f3013a[warning.ordinal()];
            if (i10 == 1) {
                return i.this.k().a(i8.l.f48965a);
            }
            if (i10 == 2) {
                return i.this.k().a(i8.k.f48964a);
            }
            if (i10 == 3) {
                return i.this.k().a(i8.m.f48966a);
            }
            if (i10 == 4) {
                return i.this.k().a(i8.n.f48967a);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends org.kodein.type.o<com.ui.wifiman.model.android.permissions.d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends org.kodein.type.o<InterfaceC7283a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends org.kodein.type.o<Bc.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g extends org.kodein.type.o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h extends org.kodein.type.o<InterfaceC6293b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: D8.i$i, reason: collision with other inner class name */
    public static final class C0148i extends org.kodein.type.o<InterfaceC4087a> {
    }

    static final class j implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final j f3014a = new j();

        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Set it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.contains(com.ui.wifiman.model.android.permissions.a.LOCATION_FINE));
        }
    }

    static final class k implements kg.j {

        /* renamed from: a, reason: collision with root package name */
        public static final k f3015a = new k();

        k() {
        }

        @Override // kg.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List a(a.b simState0, a.b simState1, Boolean permissionLocation, Boolean locationEnabled, C6556a gateway, Boolean networkApiServiceAvailable) {
            InterfaceC2557a interfaceC2557aB;
            InterfaceC8439a.d dVarF;
            Fa.b bVarJ0;
            AbstractC6492s.i(simState0, "simState0");
            AbstractC6492s.i(simState1, "simState1");
            AbstractC6492s.i(permissionLocation, "permissionLocation");
            AbstractC6492s.i(locationEnabled, "locationEnabled");
            AbstractC6492s.i(gateway, "gateway");
            AbstractC6492s.i(networkApiServiceAvailable, "networkApiServiceAvailable");
            List listC = AbstractC3689v.c();
            if (!permissionLocation.booleanValue()) {
                listC.add(EnumC3801J.PERMISSION_LOCATION);
            }
            if ((simState0 instanceof a.b.AbstractC0059b.c) || (simState1 instanceof a.b.AbstractC0059b.c)) {
                listC.add(EnumC3801J.PERMISSION_CELLLAR);
            }
            if (!locationEnabled.booleanValue()) {
                listC.add(EnumC3801J.LOCATION_ACCESS);
            }
            C6292a.b bVar = (C6292a.b) gateway.b();
            if (((bVar == null || (interfaceC2557aB = bVar.b()) == null || (dVarF = interfaceC2557aB.f()) == null || (bVarJ0 = dVarF.j0()) == null) ? null : bVarJ0.e()) != null && !networkApiServiceAvailable.booleanValue()) {
                listC.add(EnumC3801J.WIFIMAN_SUPPORT_DISABLED);
            }
            return AbstractC3689v.a(listC);
        }
    }

    public i(DI di2) {
        AbstractC6492s.i(di2, "di");
        org.kodein.type.i iVarE = org.kodein.type.s.e(new d().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE, com.ui.wifiman.model.android.permissions.d.class), null);
        th.l[] lVarArr = f2999i;
        this.f3001a = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new e().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f3002b = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE2, InterfaceC7283a.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new f().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f3003c = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE3, Bc.a.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new g().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f3004d = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE4, InterfaceC6084a.class), null).a(this, lVarArr[3]);
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new h().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f3005e = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE5, InterfaceC6293b.class), null).a(this, lVarArr[4]);
        org.kodein.type.i iVarE6 = org.kodein.type.s.e(new C0148i().getSuperType());
        AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f3006f = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE6, InterfaceC4087a.class), null).a(this, lVarArr[5]);
        gg.i iVarI2 = gg.i.r(e().e(), e().d(), i().b().N0(j.f3014a).W(), g().a(), j().d(), h().a(), k.f3015a).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f3007g = iVarI2;
        gg.i iVarI22 = iVarI2.N0(a.f3009a).W().o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f3008h = iVarI22;
    }

    private final Bc.a e() {
        return (Bc.a) this.f3003c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String f(EnumC3801J enumC3801J) {
        return enumC3801J.name();
    }

    private final InterfaceC7283a g() {
        return (InterfaceC7283a) this.f3002b.getValue();
    }

    private final InterfaceC4087a h() {
        return (InterfaceC4087a) this.f3006f.getValue();
    }

    private final com.ui.wifiman.model.android.permissions.d i() {
        return (com.ui.wifiman.model.android.permissions.d) this.f3001a.getValue();
    }

    private final InterfaceC6293b j() {
        return (InterfaceC6293b) this.f3005e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a k() {
        return (InterfaceC6084a) this.f3004d.getValue();
    }

    @Override // D8.h
    public AbstractC5912b a(String id2) {
        AbstractC6492s.i(id2, "id");
        gg.n nVarC = gg.n.c(new b(id2));
        AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bK = nVarC.k(new c());
        AbstractC6492s.h(abstractC5912bK, "flatMapCompletable(...)");
        return abstractC5912bK;
    }

    @Override // D8.h
    public gg.i b() {
        return this.f3008h;
    }
}
