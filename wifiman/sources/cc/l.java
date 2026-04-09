package Cc;

import a8.C3772b;
import h9.C5969a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final String f2514a;

    /* renamed from: b, reason: collision with root package name */
    private final C3772b f2515b;

    /* renamed from: c, reason: collision with root package name */
    private final C5969a f2516c;

    /* renamed from: d, reason: collision with root package name */
    private final String f2517d;

    /* renamed from: e, reason: collision with root package name */
    private final long f2518e;

    public l(String id2, C3772b deviceId, C5969a mac, String str, long j10) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(deviceId, "deviceId");
        AbstractC6492s.i(mac, "mac");
        this.f2514a = id2;
        this.f2515b = deviceId;
        this.f2516c = mac;
        this.f2517d = str;
        this.f2518e = j10;
    }

    public static /* synthetic */ l b(l lVar, String str, C3772b c3772b, C5969a c5969a, String str2, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = lVar.f2514a;
        }
        if ((i10 & 2) != 0) {
            c3772b = lVar.f2515b;
        }
        C3772b c3772b2 = c3772b;
        if ((i10 & 4) != 0) {
            c5969a = lVar.f2516c;
        }
        C5969a c5969a2 = c5969a;
        if ((i10 & 8) != 0) {
            str2 = lVar.f2517d;
        }
        String str3 = str2;
        if ((i10 & 16) != 0) {
            j10 = lVar.f2518e;
        }
        return lVar.a(str, c3772b2, c5969a2, str3, j10);
    }

    public final l a(String id2, C3772b deviceId, C5969a mac, String str, long j10) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(deviceId, "deviceId");
        AbstractC6492s.i(mac, "mac");
        return new l(id2, deviceId, mac, str, j10);
    }

    public final String c() {
        return this.f2517d;
    }

    public final C3772b d() {
        return this.f2515b;
    }

    public final String e() {
        return this.f2514a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return AbstractC6492s.d(this.f2514a, lVar.f2514a) && AbstractC6492s.d(this.f2515b, lVar.f2515b) && AbstractC6492s.d(this.f2516c, lVar.f2516c) && AbstractC6492s.d(this.f2517d, lVar.f2517d) && this.f2518e == lVar.f2518e;
    }

    public final C5969a f() {
        return this.f2516c;
    }

    public final long g() {
        return this.f2518e;
    }

    public int hashCode() {
        int iHashCode = ((((this.f2514a.hashCode() * 31) + this.f2515b.hashCode()) * 31) + this.f2516c.hashCode()) * 31;
        String str = this.f2517d;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.f2518e);
    }

    public String toString() {
        return "WifimanDeviceConfig(id=" + this.f2514a + ", deviceId=" + this.f2515b + ", mac=" + this.f2516c + ", customName=" + this.f2517d + ", updated=" + this.f2518e + ")";
    }

    public /* synthetic */ l(String str, C3772b c3772b, C5969a c5969a, String str2, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, c3772b, c5969a, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? System.currentTimeMillis() : j10);
    }
}
