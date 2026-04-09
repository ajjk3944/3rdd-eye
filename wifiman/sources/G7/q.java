package G7;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final int f7099a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7100b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7101c;

    /* renamed from: d, reason: collision with root package name */
    private final String f7102d;

    public q(int i10, String str, String str2, String str3) {
        this.f7099a = i10;
        this.f7100b = str;
        this.f7101c = str2;
        this.f7102d = str3;
    }

    public final String a() {
        return this.f7102d;
    }

    public final int b() {
        return this.f7099a;
    }

    public final String c() {
        return this.f7101c;
    }

    public final String d() {
        return this.f7100b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f7099a == qVar.f7099a && AbstractC6492s.d(this.f7100b, qVar.f7100b) && AbstractC6492s.d(this.f7101c, qVar.f7101c) && AbstractC6492s.d(this.f7102d, qVar.f7102d);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f7099a) * 31;
        String str = this.f7100b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f7101c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f7102d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "ServiceLookupRecord(port=" + this.f7099a + ", serviceName=" + this.f7100b + ", protocol=" + this.f7101c + ", description=" + this.f7102d + ")";
    }
}
