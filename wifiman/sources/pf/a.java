package Pf;

import com.ui.common.semver.SemVer;
import h9.C5969a;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f18642a;

    /* renamed from: b, reason: collision with root package name */
    private final C5969a f18643b;

    /* renamed from: c, reason: collision with root package name */
    private final String f18644c;

    /* renamed from: d, reason: collision with root package name */
    private final String f18645d;

    /* renamed from: e, reason: collision with root package name */
    private final C0659a f18646e;

    /* renamed from: f, reason: collision with root package name */
    private final b f18647f;

    /* renamed from: g, reason: collision with root package name */
    private final SemVer f18648g;

    /* renamed from: h, reason: collision with root package name */
    private final long f18649h;

    /* renamed from: Pf.a$a, reason: collision with other inner class name */
    public static final class C0659a {

        /* renamed from: a, reason: collision with root package name */
        private final Float f18650a;

        /* renamed from: b, reason: collision with root package name */
        private final Float f18651b;

        /* renamed from: c, reason: collision with root package name */
        private final Boolean f18652c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f18653d;

        public C0659a(Float f10, Float f11, Boolean bool, boolean z10) {
            this.f18650a = f10;
            this.f18651b = f11;
            this.f18652c = bool;
            this.f18653d = z10;
        }

        public final Float a() {
            return this.f18650a;
        }

        public final Boolean b() {
            return this.f18652c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0659a)) {
                return false;
            }
            C0659a c0659a = (C0659a) obj;
            return AbstractC6492s.d(this.f18650a, c0659a.f18650a) && AbstractC6492s.d(this.f18651b, c0659a.f18651b) && AbstractC6492s.d(this.f18652c, c0659a.f18652c) && this.f18653d == c0659a.f18653d;
        }

        public int hashCode() {
            Float f10 = this.f18650a;
            int iHashCode = (f10 == null ? 0 : f10.hashCode()) * 31;
            Float f11 = this.f18651b;
            int iHashCode2 = (iHashCode + (f11 == null ? 0 : f11.hashCode())) * 31;
            Boolean bool = this.f18652c;
            return ((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31) + Boolean.hashCode(this.f18653d);
        }

        public String toString() {
            return "Battery(batteryLevel=" + this.f18650a + ", batteryVoltage=" + this.f18651b + ", isCharging=" + this.f18652c + ", isLowBattery=" + this.f18653d + ")";
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final float f18654a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f18655b;

        public b(float f10, Integer num) {
            this.f18654a = f10;
            this.f18655b = num;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Float.compare(this.f18654a, bVar.f18654a) == 0 && AbstractC6492s.d(this.f18655b, bVar.f18655b);
        }

        public int hashCode() {
            int iHashCode = Float.hashCode(this.f18654a) * 31;
            Integer num = this.f18655b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "Signal(signalLevel=" + this.f18654a + ", signalDbm=" + this.f18655b + ")";
        }
    }

    public a(String model, C5969a mac, String bomID, String productID, C0659a battery, b signal, SemVer firmwareVersion, long j10) {
        AbstractC6492s.i(model, "model");
        AbstractC6492s.i(mac, "mac");
        AbstractC6492s.i(bomID, "bomID");
        AbstractC6492s.i(productID, "productID");
        AbstractC6492s.i(battery, "battery");
        AbstractC6492s.i(signal, "signal");
        AbstractC6492s.i(firmwareVersion, "firmwareVersion");
        this.f18642a = model;
        this.f18643b = mac;
        this.f18644c = bomID;
        this.f18645d = productID;
        this.f18646e = battery;
        this.f18647f = signal;
        this.f18648g = firmwareVersion;
        this.f18649h = j10;
    }

    public final C0659a a() {
        return this.f18646e;
    }

    public final SemVer b() {
        return this.f18648g;
    }

    public final C5969a c() {
        return this.f18643b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC6492s.d(this.f18642a, aVar.f18642a) && AbstractC6492s.d(this.f18643b, aVar.f18643b) && AbstractC6492s.d(this.f18644c, aVar.f18644c) && AbstractC6492s.d(this.f18645d, aVar.f18645d) && AbstractC6492s.d(this.f18646e, aVar.f18646e) && AbstractC6492s.d(this.f18647f, aVar.f18647f) && AbstractC6492s.d(this.f18648g, aVar.f18648g) && this.f18649h == aVar.f18649h;
    }

    public int hashCode() {
        return (((((((((((((this.f18642a.hashCode() * 31) + this.f18643b.hashCode()) * 31) + this.f18644c.hashCode()) * 31) + this.f18645d.hashCode()) * 31) + this.f18646e.hashCode()) * 31) + this.f18647f.hashCode()) * 31) + this.f18648g.hashCode()) * 31) + Long.hashCode(this.f18649h);
    }

    public String toString() {
        return "WmwDeviceStatus(model=" + this.f18642a + ", mac=" + this.f18643b + ", bomID=" + this.f18644c + ", productID=" + this.f18645d + ", battery=" + this.f18646e + ", signal=" + this.f18647f + ", firmwareVersion=" + this.f18648g + ", uptimeMillis=" + this.f18649h + ")";
    }
}
