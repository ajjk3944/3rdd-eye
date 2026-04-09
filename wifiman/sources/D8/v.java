package D8;

import Cc.InterfaceC2557a;
import Cd.j;
import Je.b;
import Yg.z;
import Zg.AbstractC3689v;
import a8.C3772b;
import b8.AbstractC4074a;
import com.ubnt.usurvey.R;
import com.ui.wifiman.model.ubiquiti.uisp.UispController;
import com.ui.wifiman.ui.component.network.C5219q;
import com.ui.wifiman.ui.component.network.K;
import com.ui.wifiman.ui.component.network.L;
import com.ui.wifiman.ui.component.network.M;
import com.ui.wifiman.ui.component.network.N;
import gg.AbstractC5912b;
import i8.InterfaceC6084a;
import inet.ipaddr.ipv4.C6180b;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import jd.C6292a;
import jd.InterfaceC6293b;
import kd.C6455e;
import kd.InterfaceC6454d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import le.C6588i;
import mc.InterfaceC6794a;
import org.kodein.di.DI;
import rj.InterfaceC7810x2;
import s9.InterfaceC7929a;
import s9.c;
import s9.d;

/* loaded from: classes3.dex */
public final class v implements t {

    /* renamed from: a, reason: collision with root package name */
    private final Yg.m f3059a;

    /* renamed from: b, reason: collision with root package name */
    private final Yg.m f3060b;

    /* renamed from: c, reason: collision with root package name */
    private final Yg.m f3061c;

    /* renamed from: d, reason: collision with root package name */
    private final Yg.m f3062d;

    /* renamed from: e, reason: collision with root package name */
    private final Yg.m f3063e;

    /* renamed from: f, reason: collision with root package name */
    private final Yg.m f3064f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f3065g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f3066h;

    /* renamed from: j, reason: collision with root package name */
    static final /* synthetic */ th.l[] f3057j = {O.h(new F(v.class, "topologyOperator", "getTopologyOperator()Lcom/ui/wifiman/model/network/topology/NetworkTopologyService;", 0)), O.h(new F(v.class, "uispController", "getUispController()Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;", 0)), O.h(new F(v.class, "publicIpService", "getPublicIpService()Lcom/ui/wifiman/model/publicip/PublicIP$Service;", 0)), O.h(new F(v.class, "networkConnectionManager", "getNetworkConnectionManager()Lcom/ui/wifiman/model/network/connection/NetworkConnectionManager;", 0)), O.h(new F(v.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new F(v.class, "androidDeviceInfo", "getAndroidDeviceInfo()Lcom/ui/wifiman/model/android/device/AndroidDevice;", 0))};

    /* renamed from: i, reason: collision with root package name */
    public static final a f3056i = new a(null);

    /* renamed from: k, reason: collision with root package name */
    public static final int f3058k = 8;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3067a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f3068b;

        static {
            int[] iArr = new int[C6292a.c.values().length];
            try {
                iArr[C6292a.c.GATEWAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C6292a.c.AP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C6292a.c.MYSELF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C6292a.c.GENERIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f3067a = iArr;
            int[] iArr2 = new int[C6292a.EnumC1869a.values().length];
            try {
                iArr2[C6292a.EnumC1869a.WIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[C6292a.EnumC1869a.WIRELESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f3068b = iArr2;
        }
    }

    static final class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f3069a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Zc.e it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.h());
        }
    }

    static final class d implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f3071b;

        public static final class a implements gg.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C6292a f3072a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ v f3073b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f3074c;

            public a(C6292a c6292a, v vVar, String str) {
                this.f3072a = c6292a;
                this.f3073b = vVar;
                this.f3074c = str;
            }

            @Override // gg.q
            public final void a(gg.o oVar) {
                try {
                    int i10 = 0;
                    C6292a.b bVar = null;
                    for (Object obj : this.f3072a.a()) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            AbstractC3689v.v();
                        }
                        C6292a.b bVar2 = (C6292a.b) obj;
                        if (AbstractC6492s.d(this.f3073b.v(bVar2, i10), this.f3074c)) {
                            bVar = bVar2;
                        }
                        i10 = i11;
                    }
                    InterfaceC2557a interfaceC2557aB = bVar != null ? bVar.b() : null;
                    if (interfaceC2557aB != null) {
                        oVar.onSuccess(interfaceC2557aB);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        d(String str) {
            this.f3071b = str;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(C6292a it) {
            AbstractC6492s.i(it, "it");
            gg.n nVarC = gg.n.c(new a(it, v.this, this.f3071b));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f3075a = new e();

        public static final class a implements gg.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2557a f3076a;

            public a(InterfaceC2557a interfaceC2557a) {
                this.f3076a = interfaceC2557a;
            }

            @Override // gg.q
            public final void a(gg.o oVar) {
                Object cVar;
                try {
                    InterfaceC2557a interfaceC2557a = this.f3076a;
                    if (interfaceC2557a instanceof Cc.j) {
                        cVar = b.d.f10011b;
                    } else {
                        Dc.j jVarJ = interfaceC2557a.j();
                        if ((jVarJ != null ? jVarJ.F() : null) != null) {
                            cVar = b.d.f10011b;
                        } else {
                            Dc.j jVarJ2 = this.f3076a.j();
                            if ((jVarJ2 != null ? jVarJ2.C() : null) != null) {
                                cVar = b.a.f10008b;
                            } else if (this.f3076a.getId() != null) {
                                C3772b id2 = this.f3076a.getId();
                                AbstractC6492s.f(id2);
                                cVar = new b.C0408b(id2);
                            } else if (this.f3076a.n() != null) {
                                C6180b c6180bN = this.f3076a.n();
                                AbstractC6492s.f(c6180bN);
                                cVar = new b.c(c6180bN);
                            } else {
                                cVar = null;
                            }
                        }
                    }
                    if (cVar != null) {
                        oVar.onSuccess(cVar);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(InterfaceC2557a device) {
            AbstractC6492s.i(device, "device");
            gg.n nVarC = gg.n.c(new a(device));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    static final class f implements kg.n {
        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Je.b detailParams) {
            AbstractC6492s.i(detailParams, "detailParams");
            return v.this.u().a(new InterfaceC6084a.b.C6089g(detailParams));
        }
    }

    static final class g implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f3079b;

        public static final class a implements gg.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C6292a f3080a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ v f3081b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f3082c;

            public a(C6292a c6292a, v vVar, String str) {
                this.f3080a = c6292a;
                this.f3081b = vVar;
                this.f3082c = str;
            }

            @Override // gg.q
            public final void a(gg.o oVar) {
                try {
                    int i10 = 0;
                    C6292a.b bVar = null;
                    for (Object obj : this.f3080a.a()) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            AbstractC3689v.v();
                        }
                        C6292a.b bVar2 = (C6292a.b) obj;
                        if (AbstractC6492s.d(this.f3081b.v(bVar2, i10), this.f3082c)) {
                            bVar = bVar2;
                        }
                        i10 = i11;
                    }
                    InterfaceC2557a interfaceC2557aB = bVar != null ? bVar.b() : null;
                    if (interfaceC2557aB != null) {
                        oVar.onSuccess(interfaceC2557aB);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        g(String str) {
            this.f3079b = str;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(C6292a it) {
            AbstractC6492s.i(it, "it");
            gg.n nVarC = gg.n.c(new a(it, v.this, this.f3079b));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    static final class h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f3083a = new h();

        public static final class a implements gg.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2557a f3084a;

            public a(InterfaceC2557a interfaceC2557a) {
                this.f3084a = interfaceC2557a;
            }

            @Override // gg.q
            public final void a(gg.o oVar) {
                try {
                    Object objN = this.f3084a.n();
                    if (objN == null) {
                        objN = this.f3084a.i();
                    }
                    if (objN != null) {
                        oVar.onSuccess(objN);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(InterfaceC2557a device) {
            AbstractC6492s.i(device, "device");
            gg.n nVarC = gg.n.c(new a(device));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    static final class i implements kg.n {
        i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(inet.ipaddr.g ip) {
            AbstractC6492s.i(ip, "ip");
            return v.this.u().a(new InterfaceC6084a.b.B.c.d(new j.c(ip)));
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class j extends org.kodein.type.o<InterfaceC6293b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class k extends org.kodein.type.o<UispController> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class l extends org.kodein.type.o<InterfaceC6454d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class m extends org.kodein.type.o<Zc.f> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class n extends org.kodein.type.o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class o extends org.kodein.type.o<InterfaceC6794a> {
    }

    static final class p implements kg.h {
        p() {
        }

        @Override // kg.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final N a(C6292a topology, Wc.b ispInfoFetch, Wc.b publicIpStatus, Boolean vpnActive) {
            AbstractC6492s.i(topology, "topology");
            AbstractC6492s.i(ispInfoFetch, "ispInfoFetch");
            AbstractC6492s.i(publicIpStatus, "publicIpStatus");
            AbstractC6492s.i(vpnActive, "vpnActive");
            M mP = v.this.p((UispController.a) ispInfoFetch.b(), (C6455e) publicIpStatus.b(), topology.b());
            L l10 = v.this.l(topology.b());
            boolean zBooleanValue = vpnActive.booleanValue();
            List listA = topology.a();
            v vVar = v.this;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(listA, 10));
            int i10 = 0;
            for (Object obj : listA) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC3689v.v();
                }
                C6292a.b bVar = (C6292a.b) obj;
                arrayList.add(z.a(vVar.m(bVar, i10), vVar.k(bVar.a())));
                i10 = i11;
            }
            return new N(mP, l10, zBooleanValue, arrayList);
        }
    }

    public v(DI di2) {
        AbstractC6492s.i(di2, "di");
        org.kodein.type.i iVarE = org.kodein.type.s.e(new j().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE, InterfaceC6293b.class), null);
        th.l[] lVarArr = f3057j;
        this.f3059a = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new k().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f3060b = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE2, UispController.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new l().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f3061c = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE3, InterfaceC6454d.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new m().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f3062d = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE4, Zc.f.class), null).a(this, lVarArr[3]);
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new n().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f3063e = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE5, InterfaceC6084a.class), null).a(this, lVarArr[4]);
        org.kodein.type.i iVarE6 = org.kodein.type.s.e(new o().getSuperType());
        AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f3064f = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE6, InterfaceC6794a.class), null).a(this, lVarArr[5]);
        gg.i iVarW = q().getState().N0(c.f3069a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f3065g = iVarW;
        gg.i iVarI2 = gg.i.t(s().a(), t().a(), r().a(), iVarW, new p()).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f3066h = iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C5219q.a k(C6292a.EnumC1869a enumC1869a) {
        int i10 = b.f3068b[enumC1869a.ordinal()];
        if (i10 == 1) {
            return C5219q.a.WIRED;
        }
        if (i10 == 2) {
            return C5219q.a.WIRELESS;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final L l(AbstractC4074a abstractC4074a) {
        if (abstractC4074a instanceof AbstractC4074a.b) {
            return L.CHECKING;
        }
        if (abstractC4074a instanceof AbstractC4074a.c) {
            return L.UNREACHABLE;
        }
        if (abstractC4074a instanceof AbstractC4074a.C1143a) {
            return L.REACHABLE;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.ui.wifiman.ui.component.network.M m(jd.C6292a.b r19, int r20) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D8.v.m(jd.a$b, int):com.ui.wifiman.ui.component.network.M");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer n(C6588i it) {
        AbstractC6492s.i(it, "it");
        return it.g();
    }

    private final InterfaceC6794a o() {
        return (InterfaceC6794a) this.f3064f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final M p(UispController.a aVar, C6455e c6455e, AbstractC4074a abstractC4074a) {
        String string;
        URL urlA;
        String strB;
        inet.ipaddr.g gVarC;
        String strA0;
        URI uriA;
        d.c cVar = null;
        if (aVar == null || (string = aVar.c()) == null) {
            string = (c6455e == null || (urlA = c6455e.a()) == null) ? null : urlA.toString();
        }
        InterfaceC7929a interfaceC7929aB = (string == null || (uriA = L8.j.f11266a.a(string)) == null) ? N9.b.f16117a.B() : new c.b(uriA, null, null, null, 14, null);
        if (aVar == null || (strB = aVar.d()) == null) {
            strB = c6455e != null ? c6455e.b() : null;
        }
        s9.d cVar2 = strB != null ? new d.c(strB) : new d.b(R.string.internet);
        if (c6455e != null && (gVarC = c6455e.c()) != null && (strA0 = gVarC.a0()) != null) {
            cVar = new d.c(strA0);
        }
        return new M("internet", interfaceC7929aB, cVar2, null, cVar, new K.b(abstractC4074a), true);
    }

    private final Zc.f q() {
        return (Zc.f) this.f3062d.getValue();
    }

    private final InterfaceC6454d r() {
        return (InterfaceC6454d) this.f3061c.getValue();
    }

    private final InterfaceC6293b s() {
        return (InterfaceC6293b) this.f3059a.getValue();
    }

    private final UispController t() {
        return (UispController) this.f3060b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a u() {
        return (InterfaceC6084a) this.f3063e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String v(C6292a.b bVar, int i10) {
        return "tplItem:" + i10;
    }

    @Override // D8.t
    public gg.i a() {
        return this.f3066h;
    }

    @Override // D8.t
    public AbstractC5912b b(String id2) {
        AbstractC6492s.i(id2, "id");
        AbstractC5912b abstractC5912bK = s().a().o0().u(new g(id2)).j(h.f3083a).k(new i());
        AbstractC6492s.h(abstractC5912bK, "flatMapCompletable(...)");
        return abstractC5912bK;
    }

    @Override // D8.t
    public AbstractC5912b c(String id2) {
        AbstractC6492s.i(id2, "id");
        if (AbstractC6492s.d(id2, "internet")) {
            return u().a(InterfaceC6084a.b.C6094l.f48937a);
        }
        AbstractC5912b abstractC5912bK = s().a().o0().u(new d(id2)).j(e.f3075a).k(new f());
        AbstractC6492s.f(abstractC5912bK);
        return abstractC5912bK;
    }
}
