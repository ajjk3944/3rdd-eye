package za;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f38148a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38149b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f38150c;

    public g(int i4, int i10, boolean z3) {
        this.f38148a = i4;
        this.f38149b = i10;
        this.f38150c = z3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f38148a == gVar.f38148a && this.f38149b == gVar.f38149b && this.f38150c == gVar.f38150c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.f38150c ? 1237 : 1231) ^ ((((this.f38148a ^ 1000003) * 1000003) ^ this.f38149b) * 1000003);
    }

    public final String toString() {
        int i4 = this.f38148a;
        int length = String.valueOf(i4).length();
        int i10 = this.f38149b;
        int length2 = String.valueOf(i10).length();
        boolean z3 = this.f38150c;
        StringBuilder sb2 = new StringBuilder(length + 59 + length2 + 26 + String.valueOf(z3).length() + 1);
        r5.c.q(i4, i10, "OfflineAdConfig{impressionPrerequisite=", ", clickPrerequisite=", sb2);
        sb2.append(", notificationFlowEnabled=");
        sb2.append(z3);
        sb2.append("}");
        return sb2.toString();
    }
}
