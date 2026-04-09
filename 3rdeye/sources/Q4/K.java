package Q4;

import N7.G8;
import Q4.f0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
/* loaded from: classes2.dex */
public final class K extends f0.e.d {

    /* renamed from: a, reason: collision with root package name */
    public final long f11044a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11045b;

    /* renamed from: c, reason: collision with root package name */
    public final f0.e.d.a f11046c;

    /* renamed from: d, reason: collision with root package name */
    public final f0.e.d.c f11047d;

    /* renamed from: e, reason: collision with root package name */
    public final f0.e.d.AbstractC0144d f11048e;

    /* renamed from: f, reason: collision with root package name */
    public final f0.e.d.f f11049f;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
    public static final class a extends f0.e.d.b {

        /* renamed from: a, reason: collision with root package name */
        public long f11050a;

        /* renamed from: b, reason: collision with root package name */
        public String f11051b;

        /* renamed from: c, reason: collision with root package name */
        public f0.e.d.a f11052c;

        /* renamed from: d, reason: collision with root package name */
        public f0.e.d.c f11053d;

        /* renamed from: e, reason: collision with root package name */
        public f0.e.d.AbstractC0144d f11054e;

        /* renamed from: f, reason: collision with root package name */
        public f0.e.d.f f11055f;

        /* renamed from: g, reason: collision with root package name */
        public byte f11056g;

        public final K a() {
            String str;
            f0.e.d.a aVar;
            f0.e.d.c cVar;
            if (this.f11056g == 1 && (str = this.f11051b) != null && (aVar = this.f11052c) != null && (cVar = this.f11053d) != null) {
                return new K(this.f11050a, str, aVar, cVar, this.f11054e, this.f11055f);
            }
            StringBuilder sb = new StringBuilder();
            if ((1 & this.f11056g) == 0) {
                sb.append(" timestamp");
            }
            if (this.f11051b == null) {
                sb.append(" type");
            }
            if (this.f11052c == null) {
                sb.append(" app");
            }
            if (this.f11053d == null) {
                sb.append(" device");
            }
            throw new IllegalStateException(G8.t(sb, "Missing required properties:"));
        }
    }

    public K(long j4, String str, f0.e.d.a aVar, f0.e.d.c cVar, f0.e.d.AbstractC0144d abstractC0144d, f0.e.d.f fVar) {
        this.f11044a = j4;
        this.f11045b = str;
        this.f11046c = aVar;
        this.f11047d = cVar;
        this.f11048e = abstractC0144d;
        this.f11049f = fVar;
    }

    @Override // Q4.f0.e.d
    public final f0.e.d.a a() {
        return this.f11046c;
    }

    @Override // Q4.f0.e.d
    public final f0.e.d.c b() {
        return this.f11047d;
    }

    @Override // Q4.f0.e.d
    public final f0.e.d.AbstractC0144d c() {
        return this.f11048e;
    }

    @Override // Q4.f0.e.d
    public final f0.e.d.f d() {
        return this.f11049f;
    }

    @Override // Q4.f0.e.d
    public final long e() {
        return this.f11044a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d)) {
            return false;
        }
        f0.e.d dVar = (f0.e.d) obj;
        if (this.f11044a != dVar.e() || !this.f11045b.equals(dVar.f()) || !this.f11046c.equals(dVar.a()) || !this.f11047d.equals(dVar.b())) {
            return false;
        }
        f0.e.d.AbstractC0144d abstractC0144d = this.f11048e;
        if (abstractC0144d == null) {
            if (dVar.c() != null) {
                return false;
            }
        } else if (!abstractC0144d.equals(dVar.c())) {
            return false;
        }
        f0.e.d.f fVar = this.f11049f;
        return fVar == null ? dVar.d() == null : fVar.equals(dVar.d());
    }

    @Override // Q4.f0.e.d
    public final String f() {
        return this.f11045b;
    }

    public final a g() {
        a aVar = new a();
        aVar.f11050a = this.f11044a;
        aVar.f11051b = this.f11045b;
        aVar.f11052c = this.f11046c;
        aVar.f11053d = this.f11047d;
        aVar.f11054e = this.f11048e;
        aVar.f11055f = this.f11049f;
        aVar.f11056g = (byte) 1;
        return aVar;
    }

    public final int hashCode() {
        long j4 = this.f11044a;
        int iHashCode = (((((((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ this.f11045b.hashCode()) * 1000003) ^ this.f11046c.hashCode()) * 1000003) ^ this.f11047d.hashCode()) * 1000003;
        f0.e.d.AbstractC0144d abstractC0144d = this.f11048e;
        int iHashCode2 = (iHashCode ^ (abstractC0144d == null ? 0 : abstractC0144d.hashCode())) * 1000003;
        f0.e.d.f fVar = this.f11049f;
        return iHashCode2 ^ (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.f11044a + ", type=" + this.f11045b + ", app=" + this.f11046c + ", device=" + this.f11047d + ", log=" + this.f11048e + ", rollouts=" + this.f11049f + "}";
    }
}
