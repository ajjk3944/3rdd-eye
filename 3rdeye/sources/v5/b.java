package v5;

import N7.C1094a9;
import N7.G8;
import v5.d;

/* compiled from: AutoValue_RolloutAssignment.java */
/* loaded from: classes2.dex */
public final class b extends d {

    /* renamed from: b, reason: collision with root package name */
    public final String f47046b;

    /* renamed from: c, reason: collision with root package name */
    public final String f47047c;

    /* renamed from: d, reason: collision with root package name */
    public final String f47048d;

    /* renamed from: e, reason: collision with root package name */
    public final String f47049e;

    /* renamed from: f, reason: collision with root package name */
    public final long f47050f;

    /* compiled from: AutoValue_RolloutAssignment.java */
    public static final class a extends d.a {

        /* renamed from: a, reason: collision with root package name */
        public String f47051a;

        /* renamed from: b, reason: collision with root package name */
        public String f47052b;

        /* renamed from: c, reason: collision with root package name */
        public String f47053c;

        /* renamed from: d, reason: collision with root package name */
        public String f47054d;

        /* renamed from: e, reason: collision with root package name */
        public long f47055e;

        /* renamed from: f, reason: collision with root package name */
        public byte f47056f;

        public final b a() {
            if (this.f47056f == 1 && this.f47051a != null && this.f47052b != null && this.f47053c != null && this.f47054d != null) {
                return new b(this.f47051a, this.f47052b, this.f47053c, this.f47054d, this.f47055e);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f47051a == null) {
                sb.append(" rolloutId");
            }
            if (this.f47052b == null) {
                sb.append(" variantId");
            }
            if (this.f47053c == null) {
                sb.append(" parameterKey");
            }
            if (this.f47054d == null) {
                sb.append(" parameterValue");
            }
            if ((1 & this.f47056f) == 0) {
                sb.append(" templateVersion");
            }
            throw new IllegalStateException(G8.t(sb, "Missing required properties:"));
        }
    }

    public b(String str, String str2, String str3, String str4, long j4) {
        this.f47046b = str;
        this.f47047c = str2;
        this.f47048d = str3;
        this.f47049e = str4;
        this.f47050f = j4;
    }

    @Override // v5.d
    public final String a() {
        return this.f47048d;
    }

    @Override // v5.d
    public final String b() {
        return this.f47049e;
    }

    @Override // v5.d
    public final String c() {
        return this.f47046b;
    }

    @Override // v5.d
    public final long d() {
        return this.f47050f;
    }

    @Override // v5.d
    public final String e() {
        return this.f47047c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f47046b.equals(dVar.c()) && this.f47047c.equals(dVar.e()) && this.f47048d.equals(dVar.a()) && this.f47049e.equals(dVar.b()) && this.f47050f == dVar.d();
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f47046b.hashCode() ^ 1000003) * 1000003) ^ this.f47047c.hashCode()) * 1000003) ^ this.f47048d.hashCode()) * 1000003) ^ this.f47049e.hashCode()) * 1000003;
        long j4 = this.f47050f;
        return iHashCode ^ ((int) (j4 ^ (j4 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.f47046b);
        sb.append(", variantId=");
        sb.append(this.f47047c);
        sb.append(", parameterKey=");
        sb.append(this.f47048d);
        sb.append(", parameterValue=");
        sb.append(this.f47049e);
        sb.append(", templateVersion=");
        return C1094a9.f(sb, this.f47050f, "}");
    }
}
