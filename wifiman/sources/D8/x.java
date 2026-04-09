package D8;

import D8.j;
import L0.C3174d;
import Li.N;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Zc.e;
import Zg.AbstractC3689v;
import af.AbstractC3793B;
import af.e0;
import af.q0;
import android.content.Context;
import b8.EnumC4076c;
import com.google.ar.core.ImageMetadata;
import com.ui.wifiman.model.speedtest.internet.InternetSpeedtest;
import com.ui.wifiman.model.speedtest.result.b;
import ff.EnumC5820a;
import gg.AbstractC5912b;
import hf.C6031c;
import hf.C6036h;
import i8.InterfaceC6084a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je.AbstractC6317r;
import ke.AbstractC6458c;
import kg.InterfaceC6465b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import mh.InterfaceC6835l;
import oh.AbstractC7137b;
import org.kodein.di.DI;
import rj.InterfaceC7810x2;
import sd.InterfaceC7939a;
import ye.AbstractC8661g;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class x extends Ze.a {

    /* renamed from: A, reason: collision with root package name */
    private final N f3091A;

    /* renamed from: B, reason: collision with root package name */
    private final N f3092B;

    /* renamed from: g, reason: collision with root package name */
    private final DI f3093g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f3094h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f3095i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f3096j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f3097k;

    /* renamed from: l, reason: collision with root package name */
    private final Yg.m f3098l;

    /* renamed from: m, reason: collision with root package name */
    private final Yg.m f3099m;

    /* renamed from: n, reason: collision with root package name */
    private final Yg.m f3100n;

    /* renamed from: o, reason: collision with root package name */
    private final Yg.m f3101o;

    /* renamed from: p, reason: collision with root package name */
    private final Yg.m f3102p;

    /* renamed from: q, reason: collision with root package name */
    private final Yg.m f3103q;

    /* renamed from: r, reason: collision with root package name */
    private final Yg.m f3104r;

    /* renamed from: s, reason: collision with root package name */
    private final Yg.m f3105s;

    /* renamed from: t, reason: collision with root package name */
    private final Yg.m f3106t;

    /* renamed from: u, reason: collision with root package name */
    private final gg.i f3107u;

    /* renamed from: v, reason: collision with root package name */
    private final gg.i f3108v;

    /* renamed from: w, reason: collision with root package name */
    private final N f3109w;

    /* renamed from: x, reason: collision with root package name */
    private final N f3110x;

    /* renamed from: y, reason: collision with root package name */
    private final N f3111y;

    /* renamed from: z, reason: collision with root package name */
    private final N f3112z;

    /* renamed from: D, reason: collision with root package name */
    static final /* synthetic */ th.l[] f3089D = {O.h(new F(x.class, "networkConnectionManager", "getNetworkConnectionManager()Lcom/ui/wifiman/model/network/connection/NetworkConnectionManager;", 0)), O.h(new F(x.class, "wifiConnectionService", "getWifiConnectionService()Lcom/ui/wifiman/model/wifi/connection/WifiConnectionService;", 0)), O.h(new F(x.class, "speedtestServerManager", "getSpeedtestServerManager()Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$ServerService;", 0)), O.h(new F(x.class, "speedtestResultManager", "getSpeedtestResultManager()Lcom/ui/wifiman/model/speedtest/result/SpeedtestResultManager;", 0)), O.h(new F(x.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new F(x.class, "deviceManager", "getDeviceManager()Lcom/ui/wifiman/model/device/WifimanDeviceManager;", 0)), O.h(new F(x.class, "networkTopologyCardOperator", "getNetworkTopologyCardOperator()Lcom/ubnt/usurvey/ui/speed/SpeedTabTopologyCardOperator;", 0)), O.h(new F(x.class, "latencyCardOperator", "getLatencyCardOperator()Lcom/ubnt/usurvey/ui/speed/SpeedTabLatencyCardOperator;", 0)), O.h(new F(x.class, "permissionCardOperator", "getPermissionCardOperator()Lcom/ubnt/usurvey/ui/speed/SpeedTabPermissionCardOperator;", 0)), O.h(new F(x.class, "advancedSpeedtestAvailabilityService", "getAdvancedSpeedtestAvailabilityService()Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestAvailabilityService;", 0)), O.h(new F(x.class, "speedtestSettingsManager", "getSpeedtestSettingsManager()Lcom/ui/wifiman/model/speedtest/settings/SpeedtestSettingsManager;", 0)), O.h(new F(x.class, "speedFactorsCardOperatorWifi", "getSpeedFactorsCardOperatorWifi()Lcom/ubnt/usurvey/ui/speed/SpeedTabSpeedFactorsCardOperator$Wifi;", 0)), O.h(new F(x.class, "speedFactorsCardOperatorCellular", "getSpeedFactorsCardOperatorCellular()Lcom/ubnt/usurvey/ui/speed/SpeedTabSpeedFactorsCardOperator$Cellular;", 0))};

    /* renamed from: C, reason: collision with root package name */
    public static final C2581a f3088C = new C2581a(null);

    /* renamed from: E, reason: collision with root package name */
    public static final int f3090E = 8;

    static final class A implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final A f3113a = new A();

        A() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q0 apply(com.ui.wifiman.ui.component.network.N it) {
            AbstractC6492s.i(it, "it");
            return new q0.a(it);
        }
    }

    /* renamed from: D8.x$a, reason: case insensitive filesystem */
    public static final class C2581a {
        public /* synthetic */ C2581a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2581a() {
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final com.ui.wifiman.model.speedtest.result.b f3114a;

        /* renamed from: b, reason: collision with root package name */
        private final b.AbstractC1432b f3115b;

        /* renamed from: c, reason: collision with root package name */
        private final Integer f3116c;

        /* renamed from: d, reason: collision with root package name */
        private final Long f3117d;

        /* renamed from: e, reason: collision with root package name */
        private final Long f3118e;

        /* renamed from: f, reason: collision with root package name */
        private final C6036h f3119f;

        /* renamed from: g, reason: collision with root package name */
        private final C6036h f3120g;

        public b(com.ui.wifiman.model.speedtest.result.b result, b.AbstractC1432b endpoint, Integer num, Long l10, Long l11, C6036h chartDown, C6036h chartUp) {
            AbstractC6492s.i(result, "result");
            AbstractC6492s.i(endpoint, "endpoint");
            AbstractC6492s.i(chartDown, "chartDown");
            AbstractC6492s.i(chartUp, "chartUp");
            this.f3114a = result;
            this.f3115b = endpoint;
            this.f3116c = num;
            this.f3117d = l10;
            this.f3118e = l11;
            this.f3119f = chartDown;
            this.f3120g = chartUp;
        }

        public final C6036h a() {
            return this.f3119f;
        }

        public final C6036h b() {
            return this.f3120g;
        }

        public final b.AbstractC1432b c() {
            return this.f3115b;
        }

        public final Integer d() {
            return this.f3116c;
        }

        public final com.ui.wifiman.model.speedtest.result.b e() {
            return this.f3114a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f3114a, bVar.f3114a) && AbstractC6492s.d(this.f3115b, bVar.f3115b) && AbstractC6492s.d(this.f3116c, bVar.f3116c) && AbstractC6492s.d(this.f3117d, bVar.f3117d) && AbstractC6492s.d(this.f3118e, bVar.f3118e) && AbstractC6492s.d(this.f3119f, bVar.f3119f) && AbstractC6492s.d(this.f3120g, bVar.f3120g);
        }

        public final Long f() {
            return this.f3117d;
        }

        public final Long g() {
            return this.f3118e;
        }

        public int hashCode() {
            int iHashCode = ((this.f3114a.hashCode() * 31) + this.f3115b.hashCode()) * 31;
            Integer num = this.f3116c;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Long l10 = this.f3117d;
            int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
            Long l11 = this.f3118e;
            return ((((iHashCode3 + (l11 != null ? l11.hashCode() : 0)) * 31) + this.f3119f.hashCode()) * 31) + this.f3120g.hashCode();
        }

        public String toString() {
            return "SpeedtestResultCardDataHolder(result=" + this.f3114a + ", endpoint=" + this.f3115b + ", latency=" + this.f3116c + ", speedDownBps=" + this.f3117d + ", speedUpBps=" + this.f3118e + ", chartDown=" + this.f3119f + ", chartUp=" + this.f3120g + ")";
        }
    }

    static final class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f3121a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Dd.a it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.c());
        }
    }

    static final class d implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final d f3122a = new d();

        d() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(InterfaceC7939a.AbstractC2146a advancedSpeedtestAvailability, Boolean advancedTestEnabled) {
            AbstractC6492s.i(advancedSpeedtestAvailability, "advancedSpeedtestAvailability");
            AbstractC6492s.i(advancedTestEnabled, "advancedTestEnabled");
            if (advancedSpeedtestAvailability instanceof InterfaceC7939a.AbstractC2146a.C2147a) {
                return new C6556a(advancedTestEnabled);
            }
            if (advancedSpeedtestAvailability instanceof InterfaceC7939a.AbstractC2146a.b) {
                return new C6556a(null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f3123a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EnumC4076c apply(Zc.e it) {
            AbstractC6492s.i(it, "it");
            return it.g();
        }
    }

    static final class f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f3124a = new f();

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(AbstractC6317r it) {
            AbstractC6492s.i(it, "it");
            return it instanceof AbstractC6317r.b.a ? new C6556a(((AbstractC6317r.b.a) it).i()) : new C6556a(null);
        }
    }

    static final class g implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ x f3126a;

            a(x xVar) {
                this.f3126a = xVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(List results) {
                AbstractC6492s.i(results, "results");
                com.ui.wifiman.model.speedtest.result.b bVar = (com.ui.wifiman.model.speedtest.result.b) AbstractC3689v.s0(results);
                return new C6556a(bVar != null ? this.f3126a.Z0(bVar) : null);
            }
        }

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Yg.s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            EnumC4076c enumC4076c = (EnumC4076c) sVar.a();
            C6556a c6556a = (C6556a) sVar.c();
            com.ui.wifiman.model.speedtest.result.e eVarT0 = x.this.T0();
            AbstractC6458c abstractC6458c = (AbstractC6458c) c6556a.b();
            return eVarT0.e(enumC4076c, abstractC6458c != null ? abstractC6458c.b() : null, 1).N0(new a(x.this));
        }
    }

    static final class h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f3127a = new h();

        public static final class a implements gg.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f3128a;

            public a(b bVar) {
                this.f3128a = bVar;
            }

            @Override // gg.q
            public final void a(gg.o oVar) {
                com.ui.wifiman.model.speedtest.result.b bVarE;
                try {
                    b bVar = this.f3128a;
                    Long lValueOf = (bVar == null || (bVarE = bVar.e()) == null) ? null : Long.valueOf(bVarE.f());
                    if (lValueOf != null) {
                        oVar.onSuccess(lValueOf);
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
        public final gg.r apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            gg.n nVarC = gg.n.c(new a((b) c6556a.a()));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    static final class i implements kg.n {
        i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Long resultId) {
            AbstractC6492s.i(resultId, "resultId");
            return x.this.W0().a(new InterfaceC6084a.b.B.AbstractC1814b.C1815a(resultId.longValue(), false, 2, null));
        }
    }

    static final class j implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ x f3131a;

            a(x xVar) {
                this.f3131a = xVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(InterfaceC7939a.AbstractC2146a advancedSpeedtestAvailability) {
                AbstractC6492s.i(advancedSpeedtestAvailability, "advancedSpeedtestAvailability");
                if (advancedSpeedtestAvailability instanceof InterfaceC7939a.AbstractC2146a.C2147a) {
                    InterfaceC7939a.AbstractC2146a.C2147a c2147a = (InterfaceC7939a.AbstractC2146a.C2147a) advancedSpeedtestAvailability;
                    return this.f3131a.W0().a(new InterfaceC6084a.b.B.c.C1818b(c2147a.b(), c2147a.a(), null));
                }
                if (advancedSpeedtestAvailability instanceof InterfaceC7939a.AbstractC2146a.b) {
                    return this.f3131a.W0().a(InterfaceC6084a.b.B.c.C1819c.f48890a);
                }
                throw new NoWhenBranchMatchedException();
            }
        }

        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            return AbstractC6492s.d((Boolean) c6556a.a(), Boolean.TRUE) ? x.this.L0().a().o0().t(new a(x.this)) : x.this.W0().a(InterfaceC6084a.b.B.c.C1819c.f48890a);
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class k extends org.kodein.type.o<InterfaceC7939a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class l extends org.kodein.type.o<Dd.b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class m extends org.kodein.type.o<j.b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class n extends org.kodein.type.o<j.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class o extends org.kodein.type.o<Zc.f> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class p extends org.kodein.type.o<je.u> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class q extends org.kodein.type.o<InternetSpeedtest.d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class r extends org.kodein.type.o<com.ui.wifiman.model.speedtest.result.e> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class s extends org.kodein.type.o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class t extends org.kodein.type.o<Cc.n> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class u extends org.kodein.type.o<D8.t> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class v extends org.kodein.type.o<D8.f> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class w extends org.kodein.type.o<D8.h> {
    }

    /* renamed from: D8.x$x, reason: collision with other inner class name */
    static final class C0149x implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0149x f3132a = new C0149x();

        C0149x() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Zc.e it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.f() == e.b.CONNECTED);
        }
    }

    static final class y implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final y f3133a = new y();

        y() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(Cc.j it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(it.getName());
        }
    }

    static final class z implements kg.i {

        /* renamed from: a, reason: collision with root package name */
        public static final z f3134a = new z();

        static final class a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f3135a;

            a(b bVar) {
                this.f3135a = bVar;
            }

            public final CharSequence a(Context it, InterfaceC3540l interfaceC3540l, int i10) {
                W7.a aVarB;
                W7.a aVarB2;
                AbstractC6492s.i(it, "it");
                interfaceC3540l.U(2093407587);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(2093407587, i10, -1, "com.ubnt.usurvey.ui.speed.SpeedTabVM.speedtestCard.<anonymous>.<anonymous> (SpeedTabVM.kt:198)");
                }
                C6031c c6031c = C6031c.f48649a;
                Long lF = this.f3135a.f();
                if (lF != null) {
                    aVarB = W7.a.f23676b.b(lF.longValue());
                } else {
                    aVarB = null;
                }
                Long lG = this.f3135a.g();
                if (lG != null) {
                    aVarB2 = W7.a.f23676b.b(lG.longValue());
                } else {
                    aVarB2 = null;
                }
                C3174d c3174dA = c6031c.a(aVarB, false, aVarB2, false, null, null, interfaceC3540l, (C6031c.f48651c << 18) | ImageMetadata.EDGE_MODE, 26);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
                interfaceC3540l.J();
                return c3174dA;
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            }
        }

        z() {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
        @Override // kg.i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final af.e0.a a(java.lang.Boolean r11, com.ui.wifiman.model.speedtest.internet.InternetSpeedtest.c r12, l9.C6556a r13, l9.C6556a r14, l9.C6556a r15) {
            /*
                r10 = this;
                java.lang.String r0 = "hasConnection"
                kotlin.jvm.internal.AbstractC6492s.i(r11, r0)
                java.lang.String r0 = "speedtestServerSelection"
                kotlin.jvm.internal.AbstractC6492s.i(r12, r0)
                java.lang.String r0 = "<destruct>"
                kotlin.jvm.internal.AbstractC6492s.i(r13, r0)
                kotlin.jvm.internal.AbstractC6492s.i(r14, r0)
                kotlin.jvm.internal.AbstractC6492s.i(r15, r0)
                java.lang.Object r13 = r13.a()
                D8.x$b r13 = (D8.x.b) r13
                java.lang.Object r14 = r14.a()
                java.lang.String r14 = (java.lang.String) r14
                java.lang.Object r15 = r15.a()
                r1 = r15
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r15 = r12 instanceof com.ui.wifiman.model.speedtest.internet.InternetSpeedtest.c.a
                r0 = 0
                if (r15 == 0) goto L31
                r3 = r0
                goto L60
            L31:
                boolean r15 = r12 instanceof com.ui.wifiman.model.speedtest.internet.InternetSpeedtest.c.b
                if (r15 == 0) goto L4a
                com.ui.wifiman.model.speedtest.internet.InternetSpeedtest$c$b r12 = (com.ui.wifiman.model.speedtest.internet.InternetSpeedtest.c.b) r12
                com.ui.wifiman.model.speedtest.internet.InternetSpeedtest$b$a r12 = r12.a()
                java.lang.String r12 = r12.h()
                if (r12 == 0) goto L47
                s9.d$c r15 = new s9.d$c
                r15.<init>(r12)
                goto L48
            L47:
                r15 = r0
            L48:
                r3 = r15
                goto L60
            L4a:
                boolean r15 = r12 instanceof com.ui.wifiman.model.speedtest.internet.InternetSpeedtest.c.C1421c
                if (r15 == 0) goto Lc5
                com.ui.wifiman.model.speedtest.internet.InternetSpeedtest$c$c r12 = (com.ui.wifiman.model.speedtest.internet.InternetSpeedtest.c.C1421c) r12
                com.ui.wifiman.model.speedtest.internet.InternetSpeedtest$b$b r12 = r12.a()
                java.lang.String r12 = r12.c()
                if (r12 == 0) goto L47
                s9.d$c r15 = new s9.d$c
                r15.<init>(r12)
                goto L48
            L60:
                if (r13 == 0) goto Lba
                boolean r2 = r11.booleanValue()
                E8.C r11 = E8.C.f4095a
                com.ui.wifiman.model.speedtest.result.b r12 = r13.e()
                s9.d r4 = r11.g(r12)
                com.ui.wifiman.model.speedtest.result.b$b r12 = r13.c()
                s9.d r5 = r11.c(r12, r0, r14)
                s9.d$a r6 = new s9.d$a
                java.lang.String r11 = java.lang.String.valueOf(r13)
                D8.x$z$a r12 = new D8.x$z$a
                r12.<init>(r13)
                r6.<init>(r11, r12)
                java.lang.Integer r11 = r13.d()
                if (r11 == 0) goto La2
                int r11 = r11.intValue()
                b8.b$b r12 = b8.AbstractC4075b.f33002a
                b8.b r11 = r12.a(r11)
                if (r11 == 0) goto La2
                r12 = 0
                s9.d r11 = Ne.d.c(r11, r12)
                if (r11 != 0) goto La0
                goto La2
            La0:
                r7 = r11
                goto Lab
            La2:
                s9.d$b r11 = new s9.d$b
                r12 = 2131821511(0x7f1103c7, float:1.9275767E38)
                r11.<init>(r12)
                goto La0
            Lab:
                hf.h r9 = r13.a()
                hf.h r8 = r13.b()
                af.e0$a$a$b r11 = new af.e0$a$a$b
                r0 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                goto Lc4
            Lba:
                af.e0$a$a$a r12 = new af.e0$a$a$a
                boolean r11 = r11.booleanValue()
                r12.<init>(r1, r11, r3)
                r11 = r12
            Lc4:
                return r11
            Lc5:
                kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
                r11.<init>()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: D8.x.z.a(java.lang.Boolean, com.ui.wifiman.model.speedtest.internet.InternetSpeedtest$c, l9.a, l9.a, l9.a):af.e0$a");
        }
    }

    public x(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f3093g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new o().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, Zc.f.class), null);
        th.l[] lVarArr = f3089D;
        this.f3094h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new p().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f3095i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, je.u.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new q().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f3096j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, InternetSpeedtest.d.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new r().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f3097k = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE4, com.ui.wifiman.model.speedtest.result.e.class), null).a(this, lVarArr[3]);
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new s().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f3098l = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE5, InterfaceC6084a.class), null).a(this, lVarArr[4]);
        org.kodein.type.i iVarE6 = org.kodein.type.s.e(new t().getSuperType());
        AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f3099m = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE6, Cc.n.class), null).a(this, lVarArr[5]);
        org.kodein.type.i iVarE7 = org.kodein.type.s.e(new u().getSuperType());
        AbstractC6492s.g(iVarE7, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f3100n = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE7, D8.t.class), null).a(this, lVarArr[6]);
        org.kodein.type.i iVarE8 = org.kodein.type.s.e(new v().getSuperType());
        AbstractC6492s.g(iVarE8, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f3101o = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE8, D8.f.class), null).a(this, lVarArr[7]);
        org.kodein.type.i iVarE9 = org.kodein.type.s.e(new w().getSuperType());
        AbstractC6492s.g(iVarE9, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f3102p = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE9, D8.h.class), null).a(this, lVarArr[8]);
        org.kodein.type.i iVarE10 = org.kodein.type.s.e(new k().getSuperType());
        AbstractC6492s.g(iVarE10, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f3103q = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE10, InterfaceC7939a.class), null).a(this, lVarArr[9]);
        org.kodein.type.i iVarE11 = org.kodein.type.s.e(new l().getSuperType());
        AbstractC6492s.g(iVarE11, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f3104r = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE11, Dd.b.class), null).a(this, lVarArr[10]);
        org.kodein.type.i iVarE12 = org.kodein.type.s.e(new m().getSuperType());
        AbstractC6492s.g(iVarE12, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f3105s = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE12, j.b.class), null).a(this, lVarArr[11]);
        org.kodein.type.i iVarE13 = org.kodein.type.s.e(new n().getSuperType());
        AbstractC6492s.g(iVarE13, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f3106t = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE13, j.a.class), null).a(this, lVarArr[12]);
        Ag.c cVar = Ag.c.f753a;
        gg.i iVarN0 = O0().getState().N0(e.f3123a);
        AbstractC6492s.h(iVarN0, "map(...)");
        gg.i iVarN02 = X0().a().N0(f.f3124a);
        AbstractC6492s.h(iVarN02, "map(...)");
        gg.i iVarI2 = cVar.a(iVarN0, iVarN02).W().I1(new g()).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f3107u = iVarI2;
        gg.i iVarI22 = gg.i.v(L0().a(), V0().b().N0(c.f3121a).W(), d.f3122a).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f3108v = iVarI22;
        gg.i iVarN03 = P0().a().N0(A.f3113a);
        AbstractC6492s.h(iVarN03, "map(...)");
        this.f3109w = AbstractC8661g.d0(this, iVarN03, q0.b.f26176a, false, null, 6, null);
        gg.i iVarW = gg.i.s(O0().getState().N0(C0149x.f3132a).W(), U0().d(), iVarI2, M0().b().N0(y.f3133a).W(), iVarI22, z.f3134a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f3110x = AbstractC8661g.d0(this, iVarW, e0.a.b.f26117a, false, null, 6, null);
        this.f3111y = AbstractC8661g.d0(this, N0().b(), AbstractC3793B.b.f25984a, false, null, 6, null);
        this.f3112z = AbstractC8661g.h0(this, Q0().b(), null, null, 2, null);
        this.f3091A = AbstractC8661g.h0(this, S0().b(), null, null, 2, null);
        this.f3092B = AbstractC8661g.h0(this, R0().b(), null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC7939a L0() {
        return (InterfaceC7939a) this.f3103q.getValue();
    }

    private final Cc.n M0() {
        return (Cc.n) this.f3099m.getValue();
    }

    private final D8.f N0() {
        return (D8.f) this.f3101o.getValue();
    }

    private final Zc.f O0() {
        return (Zc.f) this.f3094h.getValue();
    }

    private final D8.t P0() {
        return (D8.t) this.f3100n.getValue();
    }

    private final D8.h Q0() {
        return (D8.h) this.f3102p.getValue();
    }

    private final j.a R0() {
        return (j.a) this.f3106t.getValue();
    }

    private final j.b S0() {
        return (j.b) this.f3105s.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.ui.wifiman.model.speedtest.result.e T0() {
        return (com.ui.wifiman.model.speedtest.result.e) this.f3097k.getValue();
    }

    private final InternetSpeedtest.d U0() {
        return (InternetSpeedtest.d) this.f3096j.getValue();
    }

    private final Dd.b V0() {
        return (Dd.b) this.f3104r.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a W0() {
        return (InterfaceC6084a) this.f3098l.getValue();
    }

    private final je.u X0() {
        return (je.u) this.f3095i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dd.a Y0(boolean z10, Dd.a it) {
        AbstractC6492s.i(it, "it");
        return Dd.a.b(it, false, z10, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b Z0(com.ui.wifiman.model.speedtest.result.b bVar) {
        Object next;
        Object next2;
        float[] fArrA;
        float[] fArrA2;
        Long l10;
        Long l11;
        Iterator it = bVar.g().iterator();
        Object obj = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                Long lA = ((b.c) next).a();
                long jLongValue = lA != null ? lA.longValue() : Long.MAX_VALUE;
                do {
                    Object next3 = it.next();
                    Long lA2 = ((b.c) next3).a();
                    long jLongValue2 = lA2 != null ? lA2.longValue() : Long.MAX_VALUE;
                    if (jLongValue > jLongValue2) {
                        next = next3;
                        jLongValue = jLongValue2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        b.c cVar = (b.c) next;
        if (cVar == null) {
            throw new IllegalStateException("speedtest result without any measurement");
        }
        Iterator it2 = bVar.g().iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                Long lH = ((b.c) next2).h();
                long jLongValue3 = lH != null ? lH.longValue() : Long.MAX_VALUE;
                do {
                    Object next4 = it2.next();
                    Long lH2 = ((b.c) next4).h();
                    long jLongValue4 = lH2 != null ? lH2.longValue() : Long.MAX_VALUE;
                    if (jLongValue3 > jLongValue4) {
                        next2 = next4;
                        jLongValue3 = jLongValue4;
                    }
                } while (it2.hasNext());
            }
        } else {
            next2 = null;
        }
        b.c cVar2 = (b.c) next2;
        if (cVar2 == null) {
            throw new IllegalStateException("speedtest result without any measurement");
        }
        ArrayList arrayListB = cVar.b();
        long jLongValue5 = 0;
        long jLongValue6 = (arrayListB == null || (l11 = (Long) AbstractC3689v.F0(arrayListB)) == null) ? 0L : l11.longValue();
        ArrayList arrayListI = cVar2.i();
        if (arrayListI != null && (l10 = (Long) AbstractC3689v.F0(arrayListI)) != null) {
            jLongValue5 = l10.longValue();
        }
        float fMax = Math.max(jLongValue6, jLongValue5);
        for (Object obj2 : bVar.g()) {
            b.c cVar3 = (b.c) obj2;
            if (cVar3.g() == pd.s.INTERNET || cVar3.g() == pd.s.CONSOLE) {
                obj = obj2;
                break;
            }
        }
        b.c cVar4 = (b.c) obj;
        if (cVar4 == null && (cVar4 = (b.c) AbstractC3689v.s0(bVar.g())) == null) {
            throw new IllegalStateException("speedtest result without any measurement");
        }
        b.AbstractC1432b abstractC1432bC = cVar4.c();
        Integer numF = cVar4.f();
        Long lA3 = cVar.a();
        Long lH3 = cVar2.h();
        EnumC5820a enumC5820a = EnumC5820a.DOWN;
        ArrayList arrayListB2 = cVar.b();
        if (arrayListB2 == null || (fArrA = a1(arrayListB2, fMax)) == null) {
            fArrA = e0.f26102a.a().a();
        }
        C6036h c6036h = new C6036h(enumC5820a, fArrA);
        EnumC5820a enumC5820a2 = EnumC5820a.UP;
        ArrayList arrayListI2 = cVar2.i();
        if (arrayListI2 == null || (fArrA2 = a1(arrayListI2, fMax)) == null) {
            fArrA2 = e0.f26102a.b().a();
        }
        return new b(bVar, abstractC1432bC, numF, lA3, lH3, c6036h, new C6036h(enumC5820a2, fArrA2));
    }

    private final float[] a1(ArrayList arrayList, float f10) {
        if (arrayList.size() == 0) {
            return null;
        }
        int iE = AbstractC7137b.e(arrayList.size() * 0.15f);
        int size = arrayList.size() - iE;
        float[] fArr = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            fArr[i10] = ((Number) arrayList.get(i10 + iE)).floatValue() / f10;
        }
        return fArr;
    }

    @Override // Ze.a
    public void A0(final boolean z10) {
        C8658d.f66727a.d(V0().a(new InterfaceC6835l() { // from class: D8.w
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return x.Y0(z10, (Dd.a) obj);
            }
        }), this);
    }

    @Override // Ze.a
    public void B0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bK = this.f3107u.o0().u(h.f3127a).k(new i());
        AbstractC6492s.h(abstractC5912bK, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bK, this);
    }

    @Override // Ze.a
    public void C0() {
        C8658d.f66727a.d(W0().a(InterfaceC6084a.b.B.AbstractC1814b.d.f48886a), this);
    }

    @Override // Ze.a
    public void D0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bT = this.f3108v.o0().t(new j());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }

    @Override // Ze.a
    public void E0(String id2) {
        AbstractC6492s.i(id2, "id");
        C8658d.f66727a.d(P0().c(id2), this);
    }

    @Override // Ze.a
    public void F0(String id2) {
        AbstractC6492s.i(id2, "id");
        C8658d.f66727a.d(P0().b(id2), this);
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f3093g;
    }

    @Override // Ze.a
    public N n0() {
        return this.f3111y;
    }

    @Override // Ze.a
    public N o0() {
        return this.f3112z;
    }

    @Override // Ze.a
    public N p0() {
        return this.f3092B;
    }

    @Override // Ze.a
    public N q0() {
        return this.f3091A;
    }

    @Override // Ze.a
    public N r0() {
        return this.f3110x;
    }

    @Override // Ze.a
    public N s0() {
        return this.f3109w;
    }

    @Override // Ze.a
    public void t0() {
        C8658d.f66727a.d(N0().a(), this);
    }

    @Override // Ze.a
    public void u0(String id2) {
        AbstractC6492s.i(id2, "id");
        C8658d.f66727a.d(Q0().a(id2), this);
    }

    @Override // Ze.a
    public void v0() {
        C8658d.f66727a.d(W0().a(InterfaceC6084a.b.B.C1813a.f48881a), this);
    }

    @Override // Ze.a
    public void w0(String id2) {
        AbstractC6492s.i(id2, "id");
        C8658d.f66727a.d(R0().a(id2), this);
    }

    @Override // Ze.a
    public void x0(S8.c band) {
        AbstractC6492s.i(band, "band");
        C8658d.f66727a.d(S0().d(band), this);
    }

    @Override // Ze.a
    public void y0(String id2) {
        AbstractC6492s.i(id2, "id");
        C8658d.f66727a.d(S0().a(id2), this);
    }

    @Override // Ze.a
    public void z0() {
        C8658d.f66727a.d(S0().e(), this);
    }
}
