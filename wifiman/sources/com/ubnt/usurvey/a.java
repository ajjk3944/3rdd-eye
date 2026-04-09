package com.ubnt.usurvey;

import Ab.h;
import Ia.a;
import android.content.Context;
import cb.EnumC4235a;
import com.google.ar.core.ImageMetadata;
import gg.i;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: r, reason: collision with root package name */
    public static final C1256a f39654r = new C1256a(null);

    /* renamed from: s, reason: collision with root package name */
    private static b f39655s;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f39656a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f39657b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f39658c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f39659d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f39660e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f39661f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f39662g;

    /* renamed from: h, reason: collision with root package name */
    private final a.b f39663h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f39664i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f39665j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f39666k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f39667l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f39668m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f39669n;

    /* renamed from: o, reason: collision with root package name */
    private final h f39670o;

    /* renamed from: p, reason: collision with root package name */
    private final EnumC4235a f39671p;

    /* renamed from: q, reason: collision with root package name */
    private final Long f39672q;

    /* renamed from: com.ubnt.usurvey.a$a, reason: collision with other inner class name */
    public static final class C1256a {
        public /* synthetic */ C1256a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a() {
            b bVar = a.f39655s;
            if (bVar != null) {
                return bVar;
            }
            AbstractC6492s.v("MANAGER");
            return null;
        }

        public final void b(Context applicationContext) {
            AbstractC6492s.i(applicationContext, "applicationContext");
            a.f39655s = new com.ubnt.usurvey.b();
        }

        private C1256a() {
        }
    }

    public interface b {
        void a(InterfaceC6835l interfaceC6835l);

        i b();

        a getConfig();
    }

    public a(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, a.b speedtestEnvironment, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, h ssoEnviroment, EnumC4235a cloudEnvironment, Long l10) {
        AbstractC6492s.i(speedtestEnvironment, "speedtestEnvironment");
        AbstractC6492s.i(ssoEnviroment, "ssoEnviroment");
        AbstractC6492s.i(cloudEnvironment, "cloudEnvironment");
        this.f39656a = z10;
        this.f39657b = z11;
        this.f39658c = z12;
        this.f39659d = z13;
        this.f39660e = z14;
        this.f39661f = z15;
        this.f39662g = z16;
        this.f39663h = speedtestEnvironment;
        this.f39664i = z17;
        this.f39665j = z18;
        this.f39666k = z19;
        this.f39667l = z20;
        this.f39668m = z21;
        this.f39669n = z22;
        this.f39670o = ssoEnviroment;
        this.f39671p = cloudEnvironment;
        this.f39672q = l10;
    }

    public final a c(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, a.b speedtestEnvironment, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, h ssoEnviroment, EnumC4235a cloudEnvironment, Long l10) {
        AbstractC6492s.i(speedtestEnvironment, "speedtestEnvironment");
        AbstractC6492s.i(ssoEnviroment, "ssoEnviroment");
        AbstractC6492s.i(cloudEnvironment, "cloudEnvironment");
        return new a(z10, z11, z12, z13, z14, z15, z16, speedtestEnvironment, z17, z18, z19, z20, z21, z22, ssoEnviroment, cloudEnvironment, l10);
    }

    public final boolean e() {
        return this.f39665j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f39656a == aVar.f39656a && this.f39657b == aVar.f39657b && this.f39658c == aVar.f39658c && this.f39659d == aVar.f39659d && this.f39660e == aVar.f39660e && this.f39661f == aVar.f39661f && this.f39662g == aVar.f39662g && this.f39663h == aVar.f39663h && this.f39664i == aVar.f39664i && this.f39665j == aVar.f39665j && this.f39666k == aVar.f39666k && this.f39667l == aVar.f39667l && this.f39668m == aVar.f39668m && this.f39669n == aVar.f39669n && this.f39670o == aVar.f39670o && this.f39671p == aVar.f39671p && AbstractC6492s.d(this.f39672q, aVar.f39672q);
    }

    public final boolean f() {
        return this.f39666k;
    }

    public final EnumC4235a g() {
        return this.f39671p;
    }

    public final boolean h() {
        return this.f39664i;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((Boolean.hashCode(this.f39656a) * 31) + Boolean.hashCode(this.f39657b)) * 31) + Boolean.hashCode(this.f39658c)) * 31) + Boolean.hashCode(this.f39659d)) * 31) + Boolean.hashCode(this.f39660e)) * 31) + Boolean.hashCode(this.f39661f)) * 31) + Boolean.hashCode(this.f39662g)) * 31) + this.f39663h.hashCode()) * 31) + Boolean.hashCode(this.f39664i)) * 31) + Boolean.hashCode(this.f39665j)) * 31) + Boolean.hashCode(this.f39666k)) * 31) + Boolean.hashCode(this.f39667l)) * 31) + Boolean.hashCode(this.f39668m)) * 31) + Boolean.hashCode(this.f39669n)) * 31) + this.f39670o.hashCode()) * 31) + this.f39671p.hashCode()) * 31;
        Long l10 = this.f39672q;
        return iHashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public final boolean i() {
        return this.f39658c;
    }

    public final boolean j() {
        return this.f39656a;
    }

    public final boolean k() {
        return this.f39659d;
    }

    public final a.b l() {
        return this.f39663h;
    }

    public final boolean m() {
        return this.f39669n;
    }

    public final h n() {
        return this.f39670o;
    }

    public final Long o() {
        return this.f39672q;
    }

    public final boolean p() {
        return this.f39661f;
    }

    public final boolean q() {
        return this.f39660e;
    }

    public final boolean r() {
        return this.f39662g;
    }

    public final boolean s() {
        return this.f39667l;
    }

    public final boolean t() {
        return this.f39668m;
    }

    public String toString() {
        return "AppConfiguration(signalMapperInfiniteSpeedtestEnabled=" + this.f39656a + ", signalMapperDebugViewEnabled=" + this.f39657b + ", signalMapperCameraBackgroundEnabled=" + this.f39658c + ", signalMapperObjectDetectionEnabled=" + this.f39659d + ", unifiWifimanApiEnabled=" + this.f39660e + ", uispWifimanApiEnabled=" + this.f39661f + ", wifiScanEnabled=" + this.f39662g + ", speedtestEnvironment=" + this.f39663h + ", discoveryEnabled=" + this.f39664i + ", bluetoothScanClassicEnabled=" + this.f39665j + ", bluetoothScanLEEnabled=" + this.f39666k + ", wifimanWizardFwUpgradeAlwaysRecommended=" + this.f39667l + ", wifimanWizardFwUpgradeChannelInternal=" + this.f39668m + ", ssoAuthPKCE=" + this.f39669n + ", ssoEnviroment=" + this.f39670o + ", cloudEnvironment=" + this.f39671p + ", throughputSpeedCoefficient=" + this.f39672q + ")";
    }

    public /* synthetic */ a(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, a.b bVar, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, h hVar, EnumC4235a enumC4235a, Long l10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? true : z12, (i10 & 8) != 0 ? true : z13, (i10 & 16) != 0 ? true : z14, (i10 & 32) != 0 ? true : z15, (i10 & 64) != 0 ? true : z16, (i10 & 128) != 0 ? a.b.PRODUCTION : bVar, (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? true : z17, (i10 & 512) != 0 ? true : z18, (i10 & 1024) != 0 ? true : z19, (i10 & 2048) != 0 ? false : z20, (i10 & 4096) == 0 ? z21 : false, (i10 & 8192) == 0 ? z22 : true, (i10 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? h.PRODUCTION : hVar, (i10 & 32768) != 0 ? EnumC4235a.PRODUCTION : enumC4235a, (i10 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? 1L : l10);
    }
}
