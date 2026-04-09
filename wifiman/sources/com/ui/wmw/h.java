package com.ui.wmw;

import com.ui.common.semver.SemVer;
import com.ui.wmw.WMWizard;
import com.ui.wmw.api.ApiVersion;
import com.ui.wmw.api.v1.ApiV1BluetoothSettings;
import com.ui.wmw.api.v1.ApiV1Device;
import com.ui.wmw.api.v1.ApiV1DeviceStatistics;
import com.ui.wmw.api.v1.ApiV1Firmware;
import com.ui.wmw.api.v1.ApiV1Settings;
import com.ui.wmw.g;
import com.ui.wmw.h;
import e9.C5432d;
import gg.D;
import gg.z;
import h9.C5969a;
import java.util.Locale;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final C5969a f45488a;

    /* renamed from: b, reason: collision with root package name */
    private final C5969a f45489b;

    /* renamed from: c, reason: collision with root package name */
    private final com.ui.wmw.api.v1.a f45490c;

    static final class a implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final a f45491a = new a();

        a() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(ApiVersion response) {
            AbstractC6492s.i(response, "response");
            if (!AbstractC6492s.d(response.getApiVersion(), "1.0")) {
                String apiVersion = response.getApiVersion();
                if (apiVersion == null) {
                    apiVersion = "null";
                }
                throw new WMWizard.Error.Session.UnsupportedApiLevel(apiVersion);
            }
            if (response.getFirmwareVersion() == null) {
                throw new WMWizard.Error.Session.InvalidResponse.Content("Firmare version not available", null, 2, null);
            }
            SemVer.a aVar = SemVer.f41336i;
            SemVer semVerA = aVar.a("0.2.0");
            SemVer semVerB = aVar.b(response.getFirmwareVersion());
            if (semVerB != null) {
                if (semVerA.compareTo(semVerB) > 0) {
                    throw new WMWizard.Error.Session.UnsupportedFirmwareVersion(response.getFirmwareVersion());
                }
            } else {
                throw new WMWizard.Error.Session.InvalidResponse.Content("Firware version in incompatible format: " + response.getFirmwareVersion(), null, 2, null);
            }
        }
    }

    static final class b implements n {

        static final class a implements kg.i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f45493a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ApiVersion f45494b;

            a(h hVar, ApiVersion apiVersion) {
                this.f45493a = hVar;
                this.f45494b = apiVersion;
            }

            @Override // kg.i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final k a(ApiV1Device device, ApiV1Firmware fw, ApiV1DeviceStatistics stats, ApiV1Settings settings, ApiV1BluetoothSettings bleSettings) {
                AbstractC6492s.i(device, "device");
                AbstractC6492s.i(fw, "fw");
                AbstractC6492s.i(stats, "stats");
                AbstractC6492s.i(settings, "settings");
                AbstractC6492s.i(bleSettings, "bleSettings");
                String strD = this.f45493a.d();
                com.ui.wmw.api.v1.a aVar = this.f45493a.f45490c;
                C5969a c5969a = this.f45493a.f45488a;
                SemVer.a aVar2 = SemVer.f41336i;
                String firmwareVersion = this.f45494b.getFirmwareVersion();
                if (firmwareVersion == null) {
                    throw new IllegalStateException("Firmware version availability should be already checked");
                }
                SemVer semVerA = aVar2.a(firmwareVersion);
                ApiVersion apiVersion = this.f45494b;
                AbstractC6492s.f(apiVersion);
                return new k(strD, aVar, new Kf.e(c5969a, semVerA, apiVersion, device, fw, settings, stats, bleSettings), null);
            }
        }

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(ApiVersion version) {
            AbstractC6492s.i(version, "version");
            return z.c0(h.this.f45490c.a(), h.this.f45490c.i(), h.this.f45490c.m(), h.this.f45490c.c(), h.this.f45490c.f(), new a(h.this, version));
        }
    }

    static final class c implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final c f45495a = new c();

        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String d(k kVar) {
            return "WMW Session initialized - MAC: " + kVar.h().j().getMac() + ", FW: " + kVar.h().l().getFirmwareVersion() + ", battery: " + kVar.h().q().getBatteryPercent() + "%";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String e(k kVar) {
            return "WMW Session FW state: " + kVar.h().l();
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void accept(final k it) {
            AbstractC6492s.i(it, "it");
            Nf.a.d(new InterfaceC6824a() { // from class: com.ui.wmw.i
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return h.c.d(it);
                }
            });
            Nf.a.d(new InterfaceC6824a() { // from class: com.ui.wmw.j
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return h.c.e(it);
                }
            });
        }
    }

    public h(C5969a mac, C5969a btleMac, T8.d btleSession) {
        AbstractC6492s.i(mac, "mac");
        AbstractC6492s.i(btleMac, "btleMac");
        AbstractC6492s.i(btleSession, "btleSession");
        this.f45488a = mac;
        this.f45489b = btleMac;
        this.f45490c = new com.ui.wmw.api.v1.f(d(), new C5432d(btleSession, new com.ui.comm.v4.d(false)), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String d() {
        String lowerCase = this.f45489b.d("").toLowerCase(Locale.ROOT);
        AbstractC6492s.h(lowerCase, "toLowerCase(...)");
        return g.a.a(lowerCase);
    }

    public z e() {
        z zVarO = this.f45490c.getVersion().o(a.f45491a).s(new b()).o(c.f45495a);
        AbstractC6492s.h(zVarO, "doOnSuccess(...)");
        return zVarO;
    }
}
