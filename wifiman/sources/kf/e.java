package Kf;

import com.ui.common.semver.SemVer;
import com.ui.wmw.api.ApiVersion;
import com.ui.wmw.api.v1.ApiV1BluetoothSettings;
import com.ui.wmw.api.v1.ApiV1Device;
import com.ui.wmw.api.v1.ApiV1DeviceStatistics;
import com.ui.wmw.api.v1.ApiV1Firmware;
import com.ui.wmw.api.v1.ApiV1Settings;
import gg.i;
import h9.C5969a;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final C5969a f10757a;

    /* renamed from: b, reason: collision with root package name */
    private final SemVer f10758b;

    /* renamed from: c, reason: collision with root package name */
    private ApiVersion f10759c;

    /* renamed from: d, reason: collision with root package name */
    private ApiV1Device f10760d;

    /* renamed from: e, reason: collision with root package name */
    private ApiV1Firmware f10761e;

    /* renamed from: f, reason: collision with root package name */
    private ApiV1Settings f10762f;

    /* renamed from: g, reason: collision with root package name */
    private ApiV1DeviceStatistics f10763g;

    /* renamed from: h, reason: collision with root package name */
    private ApiV1BluetoothSettings f10764h;

    /* renamed from: i, reason: collision with root package name */
    private final Fg.a f10765i;

    /* renamed from: j, reason: collision with root package name */
    private final i f10766j;

    /* renamed from: k, reason: collision with root package name */
    private final Fg.a f10767k;

    /* renamed from: l, reason: collision with root package name */
    private final i f10768l;

    /* renamed from: m, reason: collision with root package name */
    private final Fg.a f10769m;

    /* renamed from: n, reason: collision with root package name */
    private final i f10770n;

    /* renamed from: o, reason: collision with root package name */
    private final Fg.a f10771o;

    /* renamed from: p, reason: collision with root package name */
    private final i f10772p;

    /* renamed from: q, reason: collision with root package name */
    private final Fg.a f10773q;

    /* renamed from: r, reason: collision with root package name */
    private final i f10774r;

    /* renamed from: s, reason: collision with root package name */
    private final Fg.a f10775s;

    /* renamed from: t, reason: collision with root package name */
    private final i f10776t;

    public e(C5969a mac, SemVer fwVersion, ApiVersion _version, ApiV1Device _device, ApiV1Firmware _fw, ApiV1Settings _settings, ApiV1DeviceStatistics _stats, ApiV1BluetoothSettings _ble) {
        AbstractC6492s.i(mac, "mac");
        AbstractC6492s.i(fwVersion, "fwVersion");
        AbstractC6492s.i(_version, "_version");
        AbstractC6492s.i(_device, "_device");
        AbstractC6492s.i(_fw, "_fw");
        AbstractC6492s.i(_settings, "_settings");
        AbstractC6492s.i(_stats, "_stats");
        AbstractC6492s.i(_ble, "_ble");
        this.f10757a = mac;
        this.f10758b = fwVersion;
        this.f10759c = _version;
        this.f10760d = _device;
        this.f10761e = _fw;
        this.f10762f = _settings;
        this.f10763g = _stats;
        this.f10764h = _ble;
        Fg.a aVarK2 = Fg.a.k2(s());
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f10765i = aVarK2;
        i iVarI2 = aVarK2.W().e1().Y0(Gg.a.a(), false, 1).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f10766j = iVarI2;
        Fg.a aVarK22 = Fg.a.k2(j());
        AbstractC6492s.h(aVarK22, "createDefault(...)");
        this.f10767k = aVarK22;
        i iVarI22 = aVarK22.W().e1().Y0(Gg.a.a(), false, 1).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f10768l = iVarI22;
        Fg.a aVarK23 = Fg.a.k2(l());
        AbstractC6492s.h(aVarK23, "createDefault(...)");
        this.f10769m = aVarK23;
        i iVarI23 = aVarK23.W().e1().Y0(Gg.a.a(), false, 1).o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f10770n = iVarI23;
        Fg.a aVarK24 = Fg.a.k2(o());
        AbstractC6492s.h(aVarK24, "createDefault(...)");
        this.f10771o = aVarK24;
        i iVarI24 = aVarK24.W().e1().Y0(Gg.a.a(), false, 1).o1(1).i2();
        AbstractC6492s.h(iVarI24, "refCount(...)");
        this.f10772p = iVarI24;
        Fg.a aVarK25 = Fg.a.k2(q());
        AbstractC6492s.h(aVarK25, "createDefault(...)");
        this.f10773q = aVarK25;
        i iVarI25 = aVarK25.W().e1().Y0(Gg.a.a(), false, 1).o1(1).i2();
        AbstractC6492s.h(iVarI25, "refCount(...)");
        this.f10774r = iVarI25;
        Fg.a aVarK26 = Fg.a.k2(i());
        AbstractC6492s.h(aVarK26, "createDefault(...)");
        this.f10775s = aVarK26;
        i iVarI26 = aVarK26.W().e1().Y0(Gg.a.a(), false, 1).o1(1).i2();
        AbstractC6492s.h(iVarI26, "refCount(...)");
        this.f10776t = iVarI26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e() {
        return "UPDATING Ble Settings";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f() {
        return "UPDATING Firmware Stats";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g() {
        return "UPDATING Device Settings";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h() {
        return "UPDATING Device Statistics";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return AbstractC6492s.d(this.f10757a, eVar.f10757a) && AbstractC6492s.d(this.f10758b, eVar.f10758b) && AbstractC6492s.d(this.f10759c, eVar.f10759c) && AbstractC6492s.d(this.f10760d, eVar.f10760d) && AbstractC6492s.d(this.f10761e, eVar.f10761e) && AbstractC6492s.d(this.f10762f, eVar.f10762f) && AbstractC6492s.d(this.f10763g, eVar.f10763g) && AbstractC6492s.d(this.f10764h, eVar.f10764h);
    }

    public int hashCode() {
        return (((((((((((((this.f10757a.hashCode() * 31) + this.f10758b.hashCode()) * 31) + this.f10759c.hashCode()) * 31) + this.f10760d.hashCode()) * 31) + this.f10761e.hashCode()) * 31) + this.f10762f.hashCode()) * 31) + this.f10763g.hashCode()) * 31) + this.f10764h.hashCode();
    }

    public final ApiV1BluetoothSettings i() {
        return this.f10764h;
    }

    public final ApiV1Device j() {
        return this.f10760d;
    }

    public final i k() {
        return this.f10768l;
    }

    public final ApiV1Firmware l() {
        return this.f10761e;
    }

    public final SemVer m() {
        return this.f10758b;
    }

    public final C5969a n() {
        return this.f10757a;
    }

    public final ApiV1Settings o() {
        return this.f10762f;
    }

    public final i p() {
        return this.f10772p;
    }

    public final ApiV1DeviceStatistics q() {
        return this.f10763g;
    }

    public final i r() {
        return this.f10774r;
    }

    public final ApiVersion s() {
        return this.f10759c;
    }

    public final void t(ApiV1BluetoothSettings value) {
        AbstractC6492s.i(value, "value");
        Nf.a.d(new InterfaceC6824a() { // from class: Kf.a
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return e.e();
            }
        });
        this.f10764h = value;
        this.f10775s.h(value);
    }

    public String toString() {
        return "WmwSessionState(mac=" + this.f10757a + ", fwVersion=" + this.f10758b + ", _version=" + this.f10759c + ", _device=" + this.f10760d + ", _fw=" + this.f10761e + ", _settings=" + this.f10762f + ", _stats=" + this.f10763g + ", _ble=" + this.f10764h + ")";
    }

    public final void u(ApiV1Firmware value) {
        AbstractC6492s.i(value, "value");
        Nf.a.d(new InterfaceC6824a() { // from class: Kf.d
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return e.f();
            }
        });
        this.f10761e = value;
        this.f10769m.h(value);
    }

    public final void v(ApiV1Settings value) {
        AbstractC6492s.i(value, "value");
        Nf.a.d(new InterfaceC6824a() { // from class: Kf.c
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return e.g();
            }
        });
        this.f10762f = value;
        this.f10771o.h(value);
    }

    public final void w(ApiV1DeviceStatistics value) {
        AbstractC6492s.i(value, "value");
        Nf.a.d(new InterfaceC6824a() { // from class: Kf.b
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return e.h();
            }
        });
        this.f10763g = value;
        this.f10773q.h(value);
    }
}
