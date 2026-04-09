package Pf;

import Mf.s;
import Pf.a;
import Pf.d;
import com.ui.common.semver.SemVer;
import com.ui.wmw.WMWizard;
import com.ui.wmw.api.v1.ApiV1Device;
import com.ui.wmw.api.v1.ApiV1DeviceStatistics;
import gg.AbstractC5912b;
import gg.D;
import gg.i;
import gg.z;
import h9.C5969a;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6464a;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final com.ui.wmw.api.v1.a f18656a;

    /* renamed from: b, reason: collision with root package name */
    private final Kf.e f18657b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC5912b f18658c;

    /* renamed from: d, reason: collision with root package name */
    private final i f18659d;

    static final class a implements InterfaceC6465b {
        a() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pf.a apply(ApiV1Device device, ApiV1DeviceStatistics stats) {
            AbstractC6492s.i(device, "device");
            AbstractC6492s.i(stats, "stats");
            String model = device.getModel();
            if (model == null) {
                throw new WMWizard.Error.Session.CommunicationProtocol("Device->Model==null");
            }
            C5969a c5969aN = d.this.f18657b.n();
            String bomId = device.getBomId();
            if (bomId == null) {
                throw new WMWizard.Error.Session.CommunicationProtocol("Device->bomId==null");
            }
            String proId = device.getProId();
            if (proId == null) {
                throw new WMWizard.Error.Session.CommunicationProtocol("Device->proId==null");
            }
            Float fValueOf = stats.getBatteryPercent() != null ? Float.valueOf(r0.intValue() / 100.0f) : null;
            Float batteryVoltage = stats.getBatteryVoltage();
            Boolean isLowBattery = stats.getIsLowBattery();
            a.C0659a c0659a = new a.C0659a(fValueOf, batteryVoltage, Boolean.valueOf(stats.d() == ApiV1DeviceStatistics.a.PLUGGED), isLowBattery != null ? isLowBattery.booleanValue() : false);
            a.b bVar = new a.b(stats.getBatteryPercent() != null ? r0.intValue() / 100.0f : 0.0f, stats.getSignalDbm());
            try {
                SemVer.a aVar = SemVer.f41336i;
                String firmwareVersion = device.getFirmwareVersion();
                if (firmwareVersion == null) {
                    throw new WMWizard.Error.Session.CommunicationProtocol("Fw->firmwareVersion==null");
                }
                SemVer semVerA = aVar.a(firmwareVersion);
                Long uptime = stats.getUptime();
                if (uptime != null) {
                    return new Pf.a(model, c5969aN, bomId, proId, c0659a, bVar, semVerA, uptime.longValue());
                }
                throw new WMWizard.Error.Session.CommunicationProtocol("stats->uptime==null");
            } catch (SemVer.FormatException unused) {
                throw new WMWizard.Error.Session.CommunicationProtocol("firmwareVersion in invalid format " + device.getFirmwareVersion());
            }
        }
    }

    static final class b implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final b f18661a = new b();

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String c() {
            return "WMW Status stream error";
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            Nf.a.b(new InterfaceC6824a() { // from class: Pf.e
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return d.b.c();
                }
            }, it);
        }
    }

    static final class c implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final c f18662a = new c();

        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String c(Pf.a aVar) {
            return "WMW Status emission " + aVar;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void accept(final Pf.a it) {
            AbstractC6492s.i(it, "it");
            Nf.a.d(new InterfaceC6824a() { // from class: Pf.f
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return d.c.c(it);
                }
            });
        }
    }

    /* renamed from: Pf.d$d, reason: collision with other inner class name */
    static final class C0660d implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final C0660d f18663a = new C0660d();

        C0660d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String c() {
            return "WMW Status subscribed";
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void accept(Dj.c it) {
            AbstractC6492s.i(it, "it");
            Nf.a.d(new InterfaceC6824a() { // from class: Pf.g
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return d.C0660d.c();
                }
            });
        }
    }

    static final class e implements n {

        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f18665a;

            /* renamed from: Pf.d$e$a$a, reason: collision with other inner class name */
            static final class C0661a implements n {

                /* renamed from: a, reason: collision with root package name */
                public static final C0661a f18666a = new C0661a();

                /* renamed from: Pf.d$e$a$a$a, reason: collision with other inner class name */
                static final class C0662a implements n {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C0662a f18667a = new C0662a();

                    C0662a() {
                    }

                    @Override // kg.n
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Dj.a apply(Throwable error) {
                        AbstractC6492s.i(error, "error");
                        return error instanceof WMWizard.Error.Session.RequestTimeout ? i.d2(10L, TimeUnit.SECONDS) : i.k0(error);
                    }
                }

                C0661a() {
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Dj.a apply(i it) {
                    AbstractC6492s.i(it, "it");
                    return it.p0(C0662a.f18667a);
                }
            }

            a(d dVar) {
                this.f18665a = dVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final D apply(Long it) {
                AbstractC6492s.i(it, "it");
                return this.f18665a.f18656a.m().L(C0661a.f18666a);
            }
        }

        static final class b implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f18668a;

            b(d dVar) {
                this.f18668a = dVar;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(ApiV1DeviceStatistics stats) {
                AbstractC6492s.i(stats, "stats");
                this.f18668a.j(stats);
            }
        }

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Boolean fwUploadRunning) {
            AbstractC6492s.i(fwUploadRunning, "fwUploadRunning");
            return fwUploadRunning.booleanValue() ? AbstractC5912b.m() : z.U(10L, TimeUnit.SECONDS).s(new a(d.this)).o(new b(d.this)).I().E0();
        }
    }

    public d(com.ui.wmw.api.v1.a api, Kf.e sessionState, s fwUploadState) {
        AbstractC6492s.i(api, "api");
        AbstractC6492s.i(sessionState, "sessionState");
        AbstractC6492s.i(fwUploadState, "fwUploadState");
        this.f18656a = api;
        this.f18657b = sessionState;
        AbstractC5912b abstractC5912bL1 = fwUploadState.a().L1(new e());
        AbstractC6492s.h(abstractC5912bL1, "switchMapCompletable(...)");
        this.f18658c = abstractC5912bL1;
        i iVarW = i.v(sessionState.k(), sessionState.r(), new a()).U0(g()).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        i iVarI2 = com.ui.wmw.f.c(iVarW, true).d0(b.f18661a).f0(c.f18662a).g0(C0660d.f18663a).Z(new InterfaceC6464a() { // from class: Pf.b
            @Override // kg.InterfaceC6464a
            public final void run() {
                d.h();
            }
        }).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f18659d = iVarI2;
    }

    private final AbstractC5912b g() {
        return this.f18658c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h() {
        Nf.a.d(new InterfaceC6824a() { // from class: Pf.c
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return d.i();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i() {
        return "WMW Status finished";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(ApiV1DeviceStatistics apiV1DeviceStatistics) {
        this.f18657b.w(apiV1DeviceStatistics);
    }

    public i f() {
        return this.f18659d;
    }
}
