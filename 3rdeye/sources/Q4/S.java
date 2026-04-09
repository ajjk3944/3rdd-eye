package Q4;

import N7.G8;
import Q4.f0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
/* loaded from: classes2.dex */
public final class S extends f0.e.d.a.b.AbstractC0140d.AbstractC0141a {

    /* renamed from: a, reason: collision with root package name */
    public final long f11092a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11093b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11094c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11095d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11096e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
    public static final class a extends f0.e.d.a.b.AbstractC0140d.AbstractC0141a.AbstractC0142a {

        /* renamed from: a, reason: collision with root package name */
        public long f11097a;

        /* renamed from: b, reason: collision with root package name */
        public String f11098b;

        /* renamed from: c, reason: collision with root package name */
        public String f11099c;

        /* renamed from: d, reason: collision with root package name */
        public long f11100d;

        /* renamed from: e, reason: collision with root package name */
        public int f11101e;

        /* renamed from: f, reason: collision with root package name */
        public byte f11102f;

        public final S a() {
            String str;
            if (this.f11102f == 7 && (str = this.f11098b) != null) {
                return new S(this.f11097a, str, this.f11099c, this.f11100d, this.f11101e);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f11102f & 1) == 0) {
                sb.append(" pc");
            }
            if (this.f11098b == null) {
                sb.append(" symbol");
            }
            if ((this.f11102f & 2) == 0) {
                sb.append(" offset");
            }
            if ((this.f11102f & 4) == 0) {
                sb.append(" importance");
            }
            throw new IllegalStateException(G8.t(sb, "Missing required properties:"));
        }
    }

    public S(long j4, String str, String str2, long j10, int i) {
        this.f11092a = j4;
        this.f11093b = str;
        this.f11094c = str2;
        this.f11095d = j10;
        this.f11096e = i;
    }

    @Override // Q4.f0.e.d.a.b.AbstractC0140d.AbstractC0141a
    public final String a() {
        return this.f11094c;
    }

    @Override // Q4.f0.e.d.a.b.AbstractC0140d.AbstractC0141a
    public final int b() {
        return this.f11096e;
    }

    @Override // Q4.f0.e.d.a.b.AbstractC0140d.AbstractC0141a
    public final long c() {
        return this.f11095d;
    }

    @Override // Q4.f0.e.d.a.b.AbstractC0140d.AbstractC0141a
    public final long d() {
        return this.f11092a;
    }

    @Override // Q4.f0.e.d.a.b.AbstractC0140d.AbstractC0141a
    public final String e() {
        return this.f11093b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a.b.AbstractC0140d.AbstractC0141a)) {
            return false;
        }
        f0.e.d.a.b.AbstractC0140d.AbstractC0141a abstractC0141a = (f0.e.d.a.b.AbstractC0140d.AbstractC0141a) obj;
        if (this.f11092a != abstractC0141a.d() || !this.f11093b.equals(abstractC0141a.e())) {
            return false;
        }
        String str = this.f11094c;
        if (str == null) {
            if (abstractC0141a.a() != null) {
                return false;
            }
        } else if (!str.equals(abstractC0141a.a())) {
            return false;
        }
        return this.f11095d == abstractC0141a.c() && this.f11096e == abstractC0141a.b();
    }

    public final int hashCode() {
        long j4 = this.f11092a;
        int iHashCode = (((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ this.f11093b.hashCode()) * 1000003;
        String str = this.f11094c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j10 = this.f11095d;
        return ((iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f11096e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.f11092a);
        sb.append(", symbol=");
        sb.append(this.f11093b);
        sb.append(", file=");
        sb.append(this.f11094c);
        sb.append(", offset=");
        sb.append(this.f11095d);
        sb.append(", importance=");
        return B4.i.j(sb, this.f11096e, "}");
    }
}
