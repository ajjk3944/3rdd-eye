package xd;

import Cc.InterfaceC2557a;
import Cc.n;
import Ia.a;
import Ia.k;
import Ii.N;
import Sd.d;
import W7.c;
import Yg.J;
import Yg.s;
import Yg.v;
import Zg.AbstractC3689v;
import android.os.Build;
import c8.C4231c;
import c8.EnumC4229a;
import c8.InterfaceC4230b;
import com.ubnt.usurvey.speedtest.model.SpeedTestReport;
import com.ubnt.usurvey.speedtest.model.SpeedTestReportEnv;
import com.ubnt.usurvey.speedtest.model.SpeedTestReportEnvConnection;
import com.ubnt.usurvey.speedtest.model.SpeedTestReportEnvUnifi;
import com.ubnt.usurvey.speedtest.model.SpeedTestReportResult;
import com.ui.common.semver.SemVer;
import com.ui.wifiman.model.speedtest.Speedtest;
import com.ui.wifiman.model.speedtest.internet.InternetSpeedtest;
import com.ui.wifiman.model.ubiquiti.console.e;
import dc.C5341a;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import gg.C;
import gg.D;
import gg.InterfaceC5910A;
import gg.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jd.C6292a;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import l9.C6556a;
import le.C6588i;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import pc.InterfaceC7283a;
import qd.C7454d;
import td.InterfaceC8082d;
import xa.InterfaceC8439a;
import xd.C8453d;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* renamed from: xd.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8453d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8082d f65571a;

    /* renamed from: b, reason: collision with root package name */
    private final n f65572b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC7283a f65573c;

    /* renamed from: d, reason: collision with root package name */
    private final Dc.e f65574d;

    /* renamed from: e, reason: collision with root package name */
    private final C5341a f65575e;

    /* renamed from: f, reason: collision with root package name */
    private final C5341a f65576f;

    /* renamed from: xd.d$a */
    public static final class a extends AbstractC8451b {

        /* renamed from: a, reason: collision with root package name */
        private final String f65577a;

        public a(String str) {
            this.f65577a = str;
        }

        public final String a() {
            return this.f65577a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC6492s.d(this.f65577a, ((a) obj).f65577a);
        }

        public int hashCode() {
            String str = this.f65577a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Result(resultId=" + this.f65577a + ")";
        }
    }

    /* renamed from: xd.d$b */
    public static final class b implements C {
        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                Z7.b.j("Advanced speedtest report not supported by speedtest directory server", null, null, 6, null);
                interfaceC5910A.onSuccess(new a(null));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* renamed from: xd.d$c */
    public static final class c implements C {
        public c() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(C8453d.this.f65571a.b(null));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* renamed from: xd.d$d, reason: collision with other inner class name */
    static final class C2316d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C2316d f65579a = new C2316d();

        /* renamed from: xd.d$d$a */
        static final class a extends l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f65580a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ia.a f65581b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Ia.a aVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f65581b = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new a(this.f65581b, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f65580a;
                if (i10 == 0) {
                    v.b(obj);
                    Ia.a aVar = this.f65581b;
                    this.f65580a = 1;
                    obj = aVar.c(this);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                }
                return obj;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* renamed from: xd.d$d$b */
        static final class b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ia.a f65582a;

            b(Ia.a aVar) {
                this.f65582a = aVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Ia.a apply(a.c it) {
                AbstractC6492s.i(it, "it");
                return this.f65582a;
            }
        }

        C2316d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(Ia.a client) {
            AbstractC6492s.i(client, "client");
            return Qi.l.c(null, new a(client, null), 1, null).O(Gg.a.d()).E(Gg.a.a()).A(new b(client));
        }
    }

    /* renamed from: xd.d$e */
    static final class e implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C7454d f65584b;

        /* renamed from: xd.d$e$a */
        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f65585a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(Map it) {
                Object next;
                AbstractC6492s.i(it, "it");
                Iterator it2 = it.values().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (((Dc.j) next).C() != null) {
                        break;
                    }
                }
                Dc.j jVar = (Dc.j) next;
                return new C6556a(jVar != null ? jVar.f() : null);
            }
        }

        /* renamed from: xd.d$e$b */
        static final class b implements kg.g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C7454d f65586a;

            b(C7454d c7454d) {
                this.f65586a = c7454d;
            }

            @Override // kg.g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final k.a a(Cc.j systemStats, C6556a c6556a, C6556a product) {
                c.a aVarB;
                c.a aVarB2;
                AbstractC6492s.i(systemStats, "systemStats");
                AbstractC6492s.i(c6556a, "<destruct>");
                AbstractC6492s.i(product, "product");
                W7.c cVar = (W7.c) c6556a.a();
                String strB = systemStats.b();
                String strB2 = this.f65586a.o().b();
                InterfaceC8439a.d dVar = (InterfaceC8439a.d) product.b();
                String name = dVar != null ? dVar.getName() : null;
                Double dValueOf = (cVar == null || (aVarB2 = cVar.b()) == null) ? null : Double.valueOf(aVarB2.a());
                Double dValueOf2 = (cVar == null || (aVarB = cVar.b()) == null) ? null : Double.valueOf(aVarB.b());
                Long lValueOf = ((Integer) this.f65586a.e().b()) != null ? Long.valueOf(r12.intValue()) : null;
                Speedtest.a aVar = (Speedtest.a) this.f65586a.a().b();
                Long lValueOf2 = aVar != null ? Long.valueOf(aVar.a() / 8) : null;
                Speedtest.a aVar2 = (Speedtest.a) this.f65586a.i().b();
                return new k.a(strB, strB2, name, dValueOf, dValueOf2, lValueOf, lValueOf2, aVar2 != null ? Long.valueOf(aVar2.a() / 8) : null);
            }
        }

        /* renamed from: xd.d$e$c */
        static final class c implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ia.a f65587a;

            /* renamed from: xd.d$e$c$a */
            static final class a extends l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f65588a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Ia.a f65589b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ k.a f65590c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(Ia.a aVar, k.a aVar2, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f65589b = aVar;
                    this.f65590c = aVar2;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new a(this.f65589b, this.f65590c, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f65588a;
                    if (i10 == 0) {
                        v.b(obj);
                        Ia.a aVar = this.f65589b;
                        k.a aVar2 = this.f65590c;
                        AbstractC6492s.f(aVar2);
                        this.f65588a = 1;
                        obj = aVar.a(aVar2, this);
                        if (obj == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v.b(obj);
                    }
                    return obj;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                    return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            c(Ia.a aVar) {
                this.f65587a = aVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final D apply(k.a reportParams) {
                AbstractC6492s.i(reportParams, "reportParams");
                return Qi.l.c(null, new a(this.f65587a, reportParams, null), 1, null).O(Gg.a.d()).E(Gg.a.a());
            }
        }

        e(C7454d c7454d) {
            this.f65584b = c7454d;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(Ia.a client) {
            AbstractC6492s.i(client, "client");
            return z.d0(C8453d.this.f65572b.b().o0(), C8453d.this.f65573c.b().o0(), C8453d.this.f65574d.b().o0().A(a.f65585a), new b(this.f65584b)).s(new c(client));
        }
    }

    /* renamed from: xd.d$f */
    static final class f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f65591a = new f();

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a apply(Ia.l it) {
            AbstractC6492s.i(it, "it");
            return new a(it.a());
        }
    }

    /* renamed from: xd.d$g */
    static final class g implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f65592a = new g();

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a.b apply(com.ubnt.usurvey.a it) {
            AbstractC6492s.i(it, "it");
            return it.l();
        }
    }

    /* renamed from: xd.d$h */
    static final class h implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final h f65593a = new h();

        h() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s apply(a.b speedTestEnvironment, Cc.j device) {
            AbstractC6492s.i(speedTestEnvironment, "speedTestEnvironment");
            AbstractC6492s.i(device, "device");
            return new s(speedTestEnvironment, device);
        }
    }

    /* renamed from: xd.d$i */
    static final class i implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.internet.f f65595b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C8452c f65596c;

        /* renamed from: xd.d$i$a */
        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C8453d f65597a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.ui.wifiman.model.speedtest.internet.f f65598b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Cc.j f65599c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C8452c f65600d;

            /* renamed from: xd.d$i$a$a, reason: collision with other inner class name */
            static final class C2317a implements kg.n {

                /* renamed from: a, reason: collision with root package name */
                public static final C2317a f65601a = new C2317a();

                C2317a() {
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Ia.l apply(SpeedTestReportResult result) {
                    AbstractC6492s.i(result, "result");
                    return new Ia.l(result.getId());
                }
            }

            /* renamed from: xd.d$i$a$b */
            public /* synthetic */ class b {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f65602a;

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
                    f65602a = iArr;
                }
            }

            a(C8453d c8453d, com.ui.wifiman.model.speedtest.internet.f fVar, Cc.j jVar, C8452c c8452c) {
                this.f65597a = c8453d;
                this.f65598b = fVar;
                this.f65599c = jVar;
                this.f65600d = c8452c;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SpeedTestReportEnvConnection c(C6588i wifi) {
                String str;
                AbstractC6492s.i(wifi, "wifi");
                int i10 = b.f65602a[wifi.f().a().ordinal()];
                if (i10 == 1) {
                    str = "g2";
                } else if (i10 == 2) {
                    str = "g5";
                } else {
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "g6";
                }
                S8.l lVarQ = wifi.q();
                return new SpeedTestReportEnvConnection(str, lVarQ != null ? Integer.valueOf(lVarQ.b()) : null);
            }

            @Override // kg.n
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final D apply(InterfaceC4230b interfaceC4230b) {
                SpeedTestReportEnvUnifi speedTestReportEnvUnifi;
                List listL;
                InterfaceC8780j interfaceC8780jC;
                InterfaceC8780j interfaceC8780jN;
                d.b bVarB;
                SemVer semVerB;
                InterfaceC2557a interfaceC2557aB;
                InterfaceC8439a.d dVarF;
                String strD = this.f65597a.f65576f.d();
                String str = (String) this.f65598b.p().b();
                String str2 = "wifiman/android" + MqttTopic.TOPIC_LEVEL_SEPARATOR + strD + " (Android " + Build.VERSION.RELEASE + ")";
                ArrayList arrayList = new ArrayList();
                Object objB = this.f65598b.o().b();
                InternetSpeedtest.d.a.b bVar = objB instanceof InternetSpeedtest.d.a.b ? (InternetSpeedtest.d.a.b) objB : null;
                if (bVar != null) {
                    arrayList.add(bVar.a().d());
                    Iterator it = bVar.b().iterator();
                    while (it.hasNext()) {
                        arrayList.add(((InternetSpeedtest.b) it.next()).d());
                    }
                }
                J j10 = J.f24997a;
                Long lValueOf = ((Integer) this.f65598b.e().b()) != null ? Long.valueOf(r3.intValue()) : null;
                Speedtest.a aVar = (Speedtest.a) this.f65598b.a().b();
                Long lValueOf2 = aVar != null ? Long.valueOf(aVar.a() / 8) : null;
                Speedtest.a aVar2 = (Speedtest.a) this.f65598b.i().b();
                Long lValueOf3 = aVar2 != null ? Long.valueOf(aVar2.a() / 8) : null;
                String strB = this.f65597a.f65575e.b();
                String strD2 = this.f65597a.f65575e.d();
                String strB2 = this.f65599c.b();
                com.ui.wifiman.model.vendor.d dVarC = this.f65599c.c();
                String name = dVarC != null ? dVarC.getName() : null;
                String str3 = Build.VERSION.RELEASE;
                C8452c c8452c = this.f65600d;
                if (c8452c == null || (bVarB = c8452c.b()) == null) {
                    speedTestReportEnvUnifi = null;
                } else {
                    C8452c c8452c2 = this.f65600d;
                    String strC = bVarB.a().c();
                    InterfaceC8439a.d dVarM = bVarB.a().m();
                    String strI = dVarM != null ? dVarM.I() : null;
                    C6292a.b bVarA = c8452c2.a();
                    String strI2 = (bVarA == null || (interfaceC2557aB = bVarA.b()) == null || (dVarF = interfaceC2557aB.f()) == null) ? null : dVarF.I();
                    e.a.b bVarL = bVarB.a().l();
                    String string = (bVarL == null || (semVerB = bVarL.b()) == null) ? null : semVerB.toString();
                    SemVer semVerE = bVarB.a().e();
                    speedTestReportEnvUnifi = new SpeedTestReportEnvUnifi(strC, strI, strI2, string, semVerE != null ? semVerE.toString() : null);
                }
                C8452c c8452c3 = this.f65600d;
                if (c8452c3 == null || (interfaceC8780jC = c8452c3.c()) == null || (interfaceC8780jN = AbstractC8783m.N(interfaceC8780jC, new InterfaceC6835l() { // from class: xd.e
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return C8453d.i.a.c((C6588i) obj);
                    }
                })) == null || (listL = AbstractC8783m.Z(interfaceC8780jN)) == null) {
                    listL = AbstractC3689v.l();
                }
                return interfaceC4230b.a(str, str2, new SpeedTestReport("mobile", "android", arrayList, lValueOf, lValueOf2, lValueOf3, new SpeedTestReportEnv(strB, strD2, strB2, name, "android", str3, "ui-speed", null, "1.3.1", speedTestReportEnvUnifi, listL))).A(C2317a.f65601a).O(Gg.a.d()).E(Gg.a.a());
            }
        }

        /* renamed from: xd.d$i$b */
        static final class b implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            public static final b f65603a = new b();

            b() {
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(Throwable it) {
                AbstractC6492s.i(it, "it");
                Z7.b.j("Speed test report error", it, null, 4, null);
            }
        }

        /* renamed from: xd.d$i$c */
        static final class c implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final c f65604a = new c();

            c() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a apply(Ia.l it) {
                AbstractC6492s.i(it, "it");
                return new a(it.a());
            }
        }

        /* renamed from: xd.d$i$d, reason: collision with other inner class name */
        public /* synthetic */ class C2318d {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f65605a;

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
                f65605a = iArr;
            }
        }

        i(com.ui.wifiman.model.speedtest.internet.f fVar, C8452c c8452c) {
            this.f65595b = fVar;
            this.f65596c = c8452c;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(s sVar) {
            EnumC4229a enumC4229a;
            AbstractC6492s.i(sVar, "<destruct>");
            Object objA = sVar.a();
            AbstractC6492s.h(objA, "component1(...)");
            Object objC = sVar.c();
            AbstractC6492s.h(objC, "component2(...)");
            Cc.j jVar = (Cc.j) objC;
            int i10 = C2318d.f65605a[((a.b) objA).ordinal()];
            if (i10 == 1) {
                enumC4229a = EnumC4229a.PRODUCTION;
            } else if (i10 == 2) {
                enumC4229a = EnumC4229a.STAGE;
            } else {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                enumC4229a = EnumC4229a.DEV;
            }
            return new C4231c(enumC4229a).b().s(new a(C8453d.this, this.f65595b, jVar, this.f65596c)).m(b.f65603a).A(c.f65604a);
        }
    }

    /* renamed from: xd.d$j */
    public static final class j implements C {
        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                Z7.b.j("Local speedtest report not supported by speedtest directory server", null, null, 6, null);
                interfaceC5910A.onSuccess(new a(null));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    public C8453d(InterfaceC8082d speedtestApiFactory, n deviceManager, InterfaceC7283a locationManager, Dc.e networkDiscovery, C5341a appBuildConfiguration, C5341a buildConfig) {
        AbstractC6492s.i(speedtestApiFactory, "speedtestApiFactory");
        AbstractC6492s.i(deviceManager, "deviceManager");
        AbstractC6492s.i(locationManager, "locationManager");
        AbstractC6492s.i(networkDiscovery, "networkDiscovery");
        AbstractC6492s.i(appBuildConfiguration, "appBuildConfiguration");
        AbstractC6492s.i(buildConfig, "buildConfig");
        this.f65571a = speedtestApiFactory;
        this.f65572b = deviceManager;
        this.f65573c = locationManager;
        this.f65574d = networkDiscovery;
        this.f65575e = appBuildConfiguration;
        this.f65576f = buildConfig;
    }

    private final z h() {
        z zVarI = z.i(new b());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        return zVarI;
    }

    private final z i(C7454d c7454d) {
        z zVarI = z.i(new c());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        z zVarA = zVarI.s(C2316d.f65579a).O(Gg.a.d()).s(new e(c7454d)).A(f.f65591a);
        AbstractC6492s.h(zVarA, "map(...)");
        return zVarA;
    }

    private final z j(com.ui.wifiman.model.speedtest.internet.f fVar, C8452c c8452c) {
        z zVarS = z.e0(com.ubnt.usurvey.a.f39654r.a().b().o0().A(g.f65592a), this.f65572b.b().o0(), h.f65593a).s(new i(fVar, c8452c));
        AbstractC6492s.h(zVarS, "flatMap(...)");
        return zVarS;
    }

    private final z k() {
        z zVarI = z.i(new j());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        return zVarI;
    }

    public z g(Speedtest.d state, C8452c c8452c) {
        AbstractC6492s.i(state, "state");
        if (state instanceof C7454d) {
            return i((C7454d) state);
        }
        if (state instanceof com.ui.wifiman.model.speedtest.internet.f) {
            return j((com.ui.wifiman.model.speedtest.internet.f) state, c8452c);
        }
        if (state instanceof Cd.n) {
            return k();
        }
        if (state instanceof com.ui.wifiman.model.speedtest.advanced.b) {
            return h();
        }
        z zVarP = z.p(new IllegalStateException("unknown speedtest state type"));
        AbstractC6492s.h(zVarP, "error(...)");
        return zVarP;
    }
}
