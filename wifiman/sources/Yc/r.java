package yc;

import h9.C5969a;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class r implements com.ui.wifiman.model.bluetooth.le.j {

    /* renamed from: a, reason: collision with root package name */
    private final C5969a f66671a;

    /* renamed from: b, reason: collision with root package name */
    private final inet.ipaddr.g f66672b;

    /* renamed from: c, reason: collision with root package name */
    private final Long f66673c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f66674d;

    public r(C5969a c5969a, inet.ipaddr.g gVar, Long l10, Boolean bool) {
        this.f66671a = c5969a;
        this.f66672b = gVar;
        this.f66673c = l10;
        this.f66674d = bool;
    }

    public final inet.ipaddr.g a() {
        return this.f66672b;
    }

    public final C5969a b() {
        return this.f66671a;
    }

    public final Long c() {
        return this.f66673c;
    }

    public final Boolean d() {
        return this.f66674d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return AbstractC6492s.d(this.f66671a, rVar.f66671a) && AbstractC6492s.d(this.f66672b, rVar.f66672b) && AbstractC6492s.d(this.f66673c, rVar.f66673c) && AbstractC6492s.d(this.f66674d, rVar.f66674d);
    }

    public int hashCode() {
        C5969a c5969a = this.f66671a;
        int iHashCode = (c5969a == null ? 0 : c5969a.hashCode()) * 31;
        inet.ipaddr.g gVar = this.f66672b;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Long l10 = this.f66673c;
        int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Boolean bool = this.f66674d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "Beacon(primaryMac=" + this.f66671a + ", ipAddress=" + this.f66672b + ", uptimeMillis=" + this.f66673c + ", isBooting=" + this.f66674d + ")";
    }
}
