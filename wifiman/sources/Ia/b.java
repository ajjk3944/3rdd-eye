package Ia;

import Ia.a;
import Ia.k;
import Ii.AbstractC3059i;
import Ii.C3048c0;
import Ii.N;
import Li.InterfaceC3220g;
import Yg.J;
import Yg.m;
import Yg.n;
import Yg.v;
import android.os.Build;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.text.t;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import speedtest.DirectoryServerApi;
import speedtest.DirectoryServerApiFactory;
import speedtest.DirectoryServerApiParams;
import speedtest.Duration;
import speedtest.LinkSpeed;
import speedtest.LocationCoordinates;
import speedtest.SpeedTestApiTestReportClientInfo;
import speedtest.SpeedTestApiTestReportResult;
import speedtest.Speedtest;
import speedtest.SpeedtestApiAuthenticateResult;
import speedtest.SpeedtestApiTestReportLocalParams;
import speedtest.SpeedtestApplicationInfo;
import speedtest.SpeedtestError;

/* loaded from: classes3.dex */
public final class b implements Ia.a {

    /* renamed from: b, reason: collision with root package name */
    private final SpeedtestApplicationInfo f8973b;

    /* renamed from: c, reason: collision with root package name */
    private final m f8974c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final SpeedTestApiTestReportClientInfo f8975a;

        /* renamed from: b, reason: collision with root package name */
        private final Duration f8976b;

        /* renamed from: c, reason: collision with root package name */
        private final LinkSpeed f8977c;

        /* renamed from: d, reason: collision with root package name */
        private final LinkSpeed f8978d;

        public a(SpeedTestApiTestReportClientInfo speedTestApiTestReportClientInfo, Duration duration, LinkSpeed linkSpeed, LinkSpeed linkSpeed2) {
            this.f8975a = speedTestApiTestReportClientInfo;
            this.f8976b = duration;
            this.f8977c = linkSpeed;
            this.f8978d = linkSpeed2;
        }

        public final SpeedTestApiTestReportClientInfo a() {
            return this.f8975a;
        }

        public final LinkSpeed b() {
            return this.f8977c;
        }

        public final Duration c() {
            return this.f8976b;
        }

        public final LinkSpeed d() {
            return this.f8978d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f8975a, aVar.f8975a) && AbstractC6492s.d(this.f8976b, aVar.f8976b) && AbstractC6492s.d(this.f8977c, aVar.f8977c) && AbstractC6492s.d(this.f8978d, aVar.f8978d);
        }

        public int hashCode() {
            SpeedTestApiTestReportClientInfo speedTestApiTestReportClientInfo = this.f8975a;
            int iHashCode = (speedTestApiTestReportClientInfo == null ? 0 : speedTestApiTestReportClientInfo.hashCode()) * 31;
            Duration duration = this.f8976b;
            int iHashCode2 = (iHashCode + (duration == null ? 0 : duration.hashCode())) * 31;
            LinkSpeed linkSpeed = this.f8977c;
            int iHashCode3 = (iHashCode2 + (linkSpeed == null ? 0 : linkSpeed.hashCode())) * 31;
            LinkSpeed linkSpeed2 = this.f8978d;
            return iHashCode3 + (linkSpeed2 != null ? linkSpeed2.hashCode() : 0);
        }

        public String toString() {
            return "ApiReportParams(clientInfo=" + this.f8975a + ", latency=" + this.f8976b + ", download=" + this.f8977c + ", upload=" + this.f8978d + ")";
        }
    }

    /* renamed from: Ia.b$b, reason: collision with other inner class name */
    static final class C0365b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f8979a;

        C0365b(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return b.this.new C0365b(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f8979a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            SpeedtestApiAuthenticateResult speedtestApiAuthenticateResultAuthenticate = b.this.k().authenticate();
            SpeedtestError err = speedtestApiAuthenticateResultAuthenticate.getErr();
            if (err != null) {
                throw com.ui.speedtest.a.a(err);
            }
            String token = speedtestApiAuthenticateResultAuthenticate.getToken();
            AbstractC6492s.h(token, "result.token");
            return new a.c(token, speedtestApiAuthenticateResultAuthenticate.getTTL());
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((C0365b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f8981a;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f8983a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(0);
                this.f8983a = str;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to parse timezone '" + this.f8983a + "'";
            }
        }

        /* renamed from: Ia.b$c$b, reason: collision with other inner class name */
        static final class C0366b extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f8984a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0366b(String str) {
                super(0);
                this.f8984a = str;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to parse timezone '" + this.f8984a + "'";
            }
        }

        /* renamed from: Ia.b$c$c, reason: collision with other inner class name */
        static final class C0367c extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f8985a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0367c(String str) {
                super(0);
                this.f8985a = str;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to parse IP addr '" + this.f8985a + "'";
            }
        }

        static final class d extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f8986a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(String str) {
                super(0);
                this.f8986a = str;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to parse IP addr '" + this.f8986a + "'";
            }
        }

        static final class e extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f8987a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(String str) {
                super(0);
                this.f8987a = str;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to parse isp icon url '" + this.f8987a + "'";
            }
        }

        c(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return b.this.new c(interfaceC5380e);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x00d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.net.UnknownHostException {
            /*
                Method dump skipped, instructions count: 263
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: Ia.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8988a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f8989b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a.b f8990c;

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f8991a;

            static {
                int[] iArr = new int[a.b.values().length];
                try {
                    iArr[a.b.PRODUCTION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.b.STAGE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.b.DEV.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f8991a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, b bVar, a.b bVar2) {
            super(0);
            this.f8988a = str;
            this.f8989b = bVar;
            this.f8990c = bVar2;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DirectoryServerApi invoke() {
            String str;
            DirectoryServerApiParams directoryServerApiParams = new DirectoryServerApiParams();
            String str2 = this.f8988a;
            b bVar = this.f8989b;
            a.b bVar2 = this.f8990c;
            if (str2 != null) {
                directoryServerApiParams.setToken(str2);
            }
            directoryServerApiParams.setAppInfo(bVar.f8973b);
            int i10 = a.f8991a[bVar2.ordinal()];
            if (i10 == 1) {
                str = Speedtest.SpeedTestEnvProduction;
            } else if (i10 == 2) {
                str = Speedtest.SpeedTestEnvStage;
            } else {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str = Speedtest.SpeedTestEnvDev;
            }
            directoryServerApiParams.setEnvString(str);
            return new DirectoryServerApiFactory().newApi(directoryServerApiParams);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f8992a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f8994c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(k kVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f8994c = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return b.this.new e(this.f8994c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f8992a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            b bVar = b.this;
            a aVarI = bVar.i(this.f8994c, bVar.f8973b);
            if (!(this.f8994c instanceof k.a)) {
                throw new NoWhenBranchMatchedException();
            }
            SpeedTestApiTestReportResult speedTestApiTestReportResultTestReportLocal = b.this.k().testReportLocal(aVarI.a(), b.this.j((k.a) this.f8994c), aVarI.c(), aVarI.b(), aVarI.d());
            SpeedtestError err = speedTestApiTestReportResultTestReportLocal.getErr();
            if (err != null) {
                throw com.ui.speedtest.a.a(err);
            }
            String id2 = speedTestApiTestReportResultTestReportLocal.getId();
            if (id2 == null || t.m0(id2)) {
                id2 = null;
            }
            return new l(id2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((e) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public b(String str, La.c clientApp, a.b environment) {
        AbstractC6492s.i(clientApp, "clientApp");
        AbstractC6492s.i(environment, "environment");
        this.f8973b = La.d.a(clientApp);
        this.f8974c = n.b(new d(str, this, environment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a i(k kVar, SpeedtestApplicationInfo speedtestApplicationInfo) {
        Duration duration;
        LinkSpeed linkSpeed;
        SpeedTestApiTestReportClientInfo speedTestApiTestReportClientInfo = new SpeedTestApiTestReportClientInfo();
        speedTestApiTestReportClientInfo.setSource("mobile");
        speedTestApiTestReportClientInfo.setPlatform("android");
        speedTestApiTestReportClientInfo.setAppName(speedtestApplicationInfo.getAppName());
        speedTestApiTestReportClientInfo.setAppVersion(speedtestApplicationInfo.getAppVersion());
        speedTestApiTestReportClientInfo.setOs(speedtestApplicationInfo.getOs());
        speedTestApiTestReportClientInfo.setOsVersion(speedtestApplicationInfo.getOsVersion());
        speedTestApiTestReportClientInfo.setDeviceModel(Build.MODEL);
        speedTestApiTestReportClientInfo.setDeviceManufacturer(Build.MANUFACTURER);
        Long lB = kVar.b();
        LinkSpeed linkSpeed2 = null;
        if (lB != null) {
            long jLongValue = lB.longValue();
            duration = new Duration();
            duration.setMs(jLongValue);
        } else {
            duration = null;
        }
        Long lA = kVar.a();
        if (lA != null) {
            long jLongValue2 = lA.longValue();
            linkSpeed = new LinkSpeed();
            linkSpeed.setBps(jLongValue2);
        } else {
            linkSpeed = null;
        }
        Long lC = kVar.c();
        if (lC != null) {
            long jLongValue3 = lC.longValue();
            LinkSpeed linkSpeed3 = new LinkSpeed();
            linkSpeed3.setBps(jLongValue3);
            linkSpeed2 = linkSpeed3;
        }
        return new a(speedTestApiTestReportClientInfo, duration, linkSpeed, linkSpeed2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SpeedtestApiTestReportLocalParams j(k.a aVar) {
        SpeedtestApiTestReportLocalParams speedtestApiTestReportLocalParams = new SpeedtestApiTestReportLocalParams();
        speedtestApiTestReportLocalParams.setFrom(aVar.e());
        speedtestApiTestReportLocalParams.setTo(aVar.h());
        speedtestApiTestReportLocalParams.setApModel(aVar.d());
        if (aVar.f() != null && aVar.g() != null) {
            LocationCoordinates locationCoordinates = new LocationCoordinates();
            locationCoordinates.setLatitude(aVar.f().doubleValue());
            locationCoordinates.setLongitude(aVar.g().doubleValue());
            speedtestApiTestReportLocalParams.setCoordinates(locationCoordinates);
        }
        return speedtestApiTestReportLocalParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DirectoryServerApi k() {
        Object value = this.f8974c.getValue();
        AbstractC6492s.h(value, "<get-goApi>(...)");
        return (DirectoryServerApi) value;
    }

    @Override // Ia.a
    public Object a(k kVar, InterfaceC5380e interfaceC5380e) {
        return AbstractC3059i.g(C3048c0.b(), new e(kVar, null), interfaceC5380e);
    }

    @Override // Ia.a
    public Object b(InterfaceC5380e interfaceC5380e) {
        return AbstractC3059i.g(C3048c0.b(), new c(null), interfaceC5380e);
    }

    @Override // Ia.a
    public Object c(InterfaceC5380e interfaceC5380e) {
        return AbstractC3059i.g(C3048c0.b(), new C0365b(null), interfaceC5380e);
    }

    @Override // Ia.a
    public InterfaceC3220g d(Ia.d params) {
        AbstractC6492s.i(params, "params");
        return i.a(k(), params);
    }
}
