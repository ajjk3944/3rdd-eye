package fa;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f47208a;

    /* renamed from: b, reason: collision with root package name */
    private final String f47209b;

    public e(String deviceName, String deviceId) {
        AbstractC6492s.i(deviceName, "deviceName");
        AbstractC6492s.i(deviceId, "deviceId");
        this.f47208a = deviceName;
        this.f47209b = deviceId;
    }

    public final String a() {
        return this.f47209b;
    }

    public final String b() {
        return this.f47208a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return AbstractC6492s.d(this.f47208a, eVar.f47208a) && AbstractC6492s.d(this.f47209b, eVar.f47209b);
    }

    public int hashCode() {
        return (this.f47208a.hashCode() * 31) + this.f47209b.hashCode();
    }

    public String toString() {
        return "DeviceData(deviceName=" + this.f47208a + ", deviceId=" + this.f47209b + ")";
    }
}
