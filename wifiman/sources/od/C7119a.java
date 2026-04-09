package od;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: od.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7119a {

    /* renamed from: a, reason: collision with root package name */
    private final long f55611a;

    /* renamed from: b, reason: collision with root package name */
    private final String f55612b;

    /* renamed from: c, reason: collision with root package name */
    private final String f55613c;

    /* renamed from: d, reason: collision with root package name */
    private final long f55614d;

    public C7119a(long j10, String str, String str2, long j11) {
        this.f55611a = j10;
        this.f55612b = str;
        this.f55613c = str2;
        this.f55614d = j11;
    }

    public final long a() {
        return this.f55611a;
    }

    public final String b() {
        return this.f55612b;
    }

    public final String c() {
        return this.f55613c;
    }

    public final long d() {
        return this.f55614d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7119a)) {
            return false;
        }
        C7119a c7119a = (C7119a) obj;
        return this.f55611a == c7119a.f55611a && AbstractC6492s.d(this.f55612b, c7119a.f55612b) && AbstractC6492s.d(this.f55613c, c7119a.f55613c) && this.f55614d == c7119a.f55614d;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.f55611a) * 31;
        String str = this.f55612b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f55613c;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Long.hashCode(this.f55614d);
    }

    public String toString() {
        return "FloorplanRecord(id=" + this.f55611a + ", name=" + this.f55612b + ", ssid=" + this.f55613c + ", timestamp=" + this.f55614d + ")";
    }
}
