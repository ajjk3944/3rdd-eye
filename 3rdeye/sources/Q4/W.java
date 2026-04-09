package Q4;

import N7.C1094a9;
import N7.G8;
import Q4.f0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.java */
/* loaded from: classes2.dex */
public final class W extends f0.e.d.AbstractC0145e {

    /* renamed from: a, reason: collision with root package name */
    public final X f11126a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11127b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11128c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11129d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.java */
    public static final class a extends f0.e.d.AbstractC0145e.a {

        /* renamed from: a, reason: collision with root package name */
        public X f11130a;

        /* renamed from: b, reason: collision with root package name */
        public String f11131b;

        /* renamed from: c, reason: collision with root package name */
        public String f11132c;

        /* renamed from: d, reason: collision with root package name */
        public long f11133d;

        /* renamed from: e, reason: collision with root package name */
        public byte f11134e;

        public final W a() {
            X x10;
            String str;
            String str2;
            if (this.f11134e == 1 && (x10 = this.f11130a) != null && (str = this.f11131b) != null && (str2 = this.f11132c) != null) {
                return new W(x10, str, str2, this.f11133d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f11130a == null) {
                sb.append(" rolloutVariant");
            }
            if (this.f11131b == null) {
                sb.append(" parameterKey");
            }
            if (this.f11132c == null) {
                sb.append(" parameterValue");
            }
            if ((1 & this.f11134e) == 0) {
                sb.append(" templateVersion");
            }
            throw new IllegalStateException(G8.t(sb, "Missing required properties:"));
        }
    }

    public W(X x10, String str, String str2, long j4) {
        this.f11126a = x10;
        this.f11127b = str;
        this.f11128c = str2;
        this.f11129d = j4;
    }

    @Override // Q4.f0.e.d.AbstractC0145e
    public final String a() {
        return this.f11127b;
    }

    @Override // Q4.f0.e.d.AbstractC0145e
    public final String b() {
        return this.f11128c;
    }

    @Override // Q4.f0.e.d.AbstractC0145e
    public final f0.e.d.AbstractC0145e.b c() {
        return this.f11126a;
    }

    @Override // Q4.f0.e.d.AbstractC0145e
    public final long d() {
        return this.f11129d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.AbstractC0145e)) {
            return false;
        }
        f0.e.d.AbstractC0145e abstractC0145e = (f0.e.d.AbstractC0145e) obj;
        return this.f11126a.equals(abstractC0145e.c()) && this.f11127b.equals(abstractC0145e.a()) && this.f11128c.equals(abstractC0145e.b()) && this.f11129d == abstractC0145e.d();
    }

    public final int hashCode() {
        int iHashCode = (((((this.f11126a.hashCode() ^ 1000003) * 1000003) ^ this.f11127b.hashCode()) * 1000003) ^ this.f11128c.hashCode()) * 1000003;
        long j4 = this.f11129d;
        return iHashCode ^ ((int) (j4 ^ (j4 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.f11126a);
        sb.append(", parameterKey=");
        sb.append(this.f11127b);
        sb.append(", parameterValue=");
        sb.append(this.f11128c);
        sb.append(", templateVersion=");
        return C1094a9.f(sb, this.f11129d, "}");
    }
}
