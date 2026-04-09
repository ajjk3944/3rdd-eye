package P4;

import N7.C1094a9;

/* compiled from: AutoValue_RolloutAssignment.java */
/* loaded from: classes2.dex */
public final class b extends k {

    /* renamed from: b, reason: collision with root package name */
    public final String f10601b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10602c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10603d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10604e;

    /* renamed from: f, reason: collision with root package name */
    public final long f10605f;

    public b(String str, String str2, String str3, String str4, long j4) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f10601b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f10602c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f10603d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f10604e = str4;
        this.f10605f = j4;
    }

    @Override // P4.k
    public final String a() {
        return this.f10602c;
    }

    @Override // P4.k
    public final String b() {
        return this.f10603d;
    }

    @Override // P4.k
    public final String c() {
        return this.f10601b;
    }

    @Override // P4.k
    public final long d() {
        return this.f10605f;
    }

    @Override // P4.k
    public final String e() {
        return this.f10604e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f10601b.equals(kVar.c()) && this.f10602c.equals(kVar.a()) && this.f10603d.equals(kVar.b()) && this.f10604e.equals(kVar.e()) && this.f10605f == kVar.d();
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f10601b.hashCode() ^ 1000003) * 1000003) ^ this.f10602c.hashCode()) * 1000003) ^ this.f10603d.hashCode()) * 1000003) ^ this.f10604e.hashCode()) * 1000003;
        long j4 = this.f10605f;
        return iHashCode ^ ((int) (j4 ^ (j4 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.f10601b);
        sb.append(", parameterKey=");
        sb.append(this.f10602c);
        sb.append(", parameterValue=");
        sb.append(this.f10603d);
        sb.append(", variantId=");
        sb.append(this.f10604e);
        sb.append(", templateVersion=");
        return C1094a9.f(sb, this.f10605f, "}");
    }
}
