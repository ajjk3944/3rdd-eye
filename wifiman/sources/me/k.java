package me;

import com.ubnt.usurvey.wifi.WifiMcs;
import h9.C5969a;
import java.util.Set;
import ke.AbstractC6458c;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC6458c f53984a;

    /* renamed from: b, reason: collision with root package name */
    private final C5969a f53985b;

    /* renamed from: c, reason: collision with root package name */
    private final S8.e f53986c;

    /* renamed from: d, reason: collision with root package name */
    private final S8.a f53987d;

    /* renamed from: e, reason: collision with root package name */
    private final S8.j f53988e;

    /* renamed from: f, reason: collision with root package name */
    private final S8.l f53989f;

    /* renamed from: g, reason: collision with root package name */
    private final Boolean f53990g;

    /* renamed from: h, reason: collision with root package name */
    private final Integer f53991h;

    /* renamed from: i, reason: collision with root package name */
    private final Float f53992i;

    /* renamed from: j, reason: collision with root package name */
    private final WifiMcs f53993j;

    /* renamed from: k, reason: collision with root package name */
    private final Integer f53994k;

    /* renamed from: l, reason: collision with root package name */
    private final Set f53995l;

    /* renamed from: m, reason: collision with root package name */
    private final Set f53996m;

    /* renamed from: n, reason: collision with root package name */
    private final Set f53997n;

    /* renamed from: o, reason: collision with root package name */
    private final long f53998o;

    public k(AbstractC6458c ssid, C5969a bssid, S8.e channel, S8.a aVar, S8.j jVar, S8.l signal, Boolean bool, Integer num, Float f10, WifiMcs wifiMcs, Integer num2, Set set, Set set2, Set affiliatedMloLinks, long j10) {
        AbstractC6492s.i(ssid, "ssid");
        AbstractC6492s.i(bssid, "bssid");
        AbstractC6492s.i(channel, "channel");
        AbstractC6492s.i(signal, "signal");
        AbstractC6492s.i(affiliatedMloLinks, "affiliatedMloLinks");
        this.f53984a = ssid;
        this.f53985b = bssid;
        this.f53986c = channel;
        this.f53987d = aVar;
        this.f53988e = jVar;
        this.f53989f = signal;
        this.f53990g = bool;
        this.f53991h = num;
        this.f53992i = f10;
        this.f53993j = wifiMcs;
        this.f53994k = num2;
        this.f53995l = set;
        this.f53996m = set2;
        this.f53997n = affiliatedMloLinks;
        this.f53998o = j10;
    }

    public final Set a() {
        return this.f53997n;
    }

    public final C5969a b() {
        return this.f53985b;
    }

    public final S8.e c() {
        return this.f53986c;
    }

    public final S8.a d() {
        return this.f53987d;
    }

    public final long e() {
        return this.f53998o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return AbstractC6492s.d(this.f53984a, kVar.f53984a) && AbstractC6492s.d(this.f53985b, kVar.f53985b) && AbstractC6492s.d(this.f53986c, kVar.f53986c) && this.f53987d == kVar.f53987d && AbstractC6492s.d(this.f53988e, kVar.f53988e) && AbstractC6492s.d(this.f53989f, kVar.f53989f) && AbstractC6492s.d(this.f53990g, kVar.f53990g) && AbstractC6492s.d(this.f53991h, kVar.f53991h) && AbstractC6492s.d(this.f53992i, kVar.f53992i) && AbstractC6492s.d(this.f53993j, kVar.f53993j) && AbstractC6492s.d(this.f53994k, kVar.f53994k) && AbstractC6492s.d(this.f53995l, kVar.f53995l) && AbstractC6492s.d(this.f53996m, kVar.f53996m) && AbstractC6492s.d(this.f53997n, kVar.f53997n) && this.f53998o == kVar.f53998o;
    }

    public final WifiMcs f() {
        return this.f53993j;
    }

    public final S8.j g() {
        return this.f53988e;
    }

    public final S8.l h() {
        return this.f53989f;
    }

    public int hashCode() {
        return this.f53985b.hashCode();
    }

    public final AbstractC6458c i() {
        return this.f53984a;
    }

    public final Integer j() {
        return this.f53991h;
    }

    public final Set k() {
        return this.f53996m;
    }

    public final Set l() {
        return this.f53995l;
    }

    public final Integer m() {
        return this.f53994k;
    }

    public final Float n() {
        return this.f53992i;
    }

    public final Boolean o() {
        return this.f53990g;
    }

    public String toString() {
        return "AndroidWifiSignal(ssid=" + this.f53984a + ", bssid=" + this.f53985b + ", channel=" + this.f53986c + ", ieeeMode=" + this.f53987d + ", securityType=" + this.f53988e + ", signal=" + this.f53989f + ", wifiRTTSupport=" + this.f53990g + ", stationCount=" + this.f53991h + ", utilization=" + this.f53992i + ", mcs=" + this.f53993j + ", transmitPowerDbm=" + this.f53994k + ", supportedHtDataRates=" + this.f53995l + ", supportedChannelWidths=" + this.f53996m + ", affiliatedMloLinks=" + this.f53997n + ", lastSeenAt=" + this.f53998o + ")";
    }
}
