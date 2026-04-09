package Q4;

import Q4.f0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
/* loaded from: classes2.dex */
public final class N extends f0.e.d.a.b.AbstractC0138a {

    /* renamed from: a, reason: collision with root package name */
    public final long f11077a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11078b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11079c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11080d;

    public N(long j4, String str, String str2, long j10) {
        this.f11077a = j4;
        this.f11078b = j10;
        this.f11079c = str;
        this.f11080d = str2;
    }

    @Override // Q4.f0.e.d.a.b.AbstractC0138a
    public final long a() {
        return this.f11077a;
    }

    @Override // Q4.f0.e.d.a.b.AbstractC0138a
    public final String b() {
        return this.f11079c;
    }

    @Override // Q4.f0.e.d.a.b.AbstractC0138a
    public final long c() {
        return this.f11078b;
    }

    @Override // Q4.f0.e.d.a.b.AbstractC0138a
    public final String d() {
        return this.f11080d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a.b.AbstractC0138a)) {
            return false;
        }
        f0.e.d.a.b.AbstractC0138a abstractC0138a = (f0.e.d.a.b.AbstractC0138a) obj;
        if (this.f11077a != abstractC0138a.a() || this.f11078b != abstractC0138a.c() || !this.f11079c.equals(abstractC0138a.b())) {
            return false;
        }
        String str = this.f11080d;
        return str == null ? abstractC0138a.d() == null : str.equals(abstractC0138a.d());
    }

    public final int hashCode() {
        long j4 = this.f11077a;
        long j10 = this.f11078b;
        int iHashCode = (((((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f11079c.hashCode()) * 1000003;
        String str = this.f11080d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.f11077a);
        sb.append(", size=");
        sb.append(this.f11078b);
        sb.append(", name=");
        sb.append(this.f11079c);
        sb.append(", uuid=");
        return B4.f.c(sb, this.f11080d, "}");
    }
}
