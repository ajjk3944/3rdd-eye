package Q4;

import N7.C1094a9;
import N7.G8;
import Q4.f0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
/* loaded from: classes2.dex */
public final class U extends f0.e.d.c {

    /* renamed from: a, reason: collision with root package name */
    public final Double f11112a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11113b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11114c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11115d;

    /* renamed from: e, reason: collision with root package name */
    public final long f11116e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11117f;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
    public static final class a extends f0.e.d.c.a {

        /* renamed from: a, reason: collision with root package name */
        public Double f11118a;

        /* renamed from: b, reason: collision with root package name */
        public int f11119b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f11120c;

        /* renamed from: d, reason: collision with root package name */
        public int f11121d;

        /* renamed from: e, reason: collision with root package name */
        public long f11122e;

        /* renamed from: f, reason: collision with root package name */
        public long f11123f;

        /* renamed from: g, reason: collision with root package name */
        public byte f11124g;

        public final U a() {
            if (this.f11124g == 31) {
                return new U(this.f11118a, this.f11119b, this.f11120c, this.f11121d, this.f11122e, this.f11123f);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f11124g & 1) == 0) {
                sb.append(" batteryVelocity");
            }
            if ((this.f11124g & 2) == 0) {
                sb.append(" proximityOn");
            }
            if ((this.f11124g & 4) == 0) {
                sb.append(" orientation");
            }
            if ((this.f11124g & 8) == 0) {
                sb.append(" ramUsed");
            }
            if ((this.f11124g & 16) == 0) {
                sb.append(" diskUsed");
            }
            throw new IllegalStateException(G8.t(sb, "Missing required properties:"));
        }
    }

    public U(Double d10, int i, boolean z10, int i10, long j4, long j10) {
        this.f11112a = d10;
        this.f11113b = i;
        this.f11114c = z10;
        this.f11115d = i10;
        this.f11116e = j4;
        this.f11117f = j10;
    }

    @Override // Q4.f0.e.d.c
    public final Double a() {
        return this.f11112a;
    }

    @Override // Q4.f0.e.d.c
    public final int b() {
        return this.f11113b;
    }

    @Override // Q4.f0.e.d.c
    public final long c() {
        return this.f11117f;
    }

    @Override // Q4.f0.e.d.c
    public final int d() {
        return this.f11115d;
    }

    @Override // Q4.f0.e.d.c
    public final long e() {
        return this.f11116e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.c)) {
            return false;
        }
        f0.e.d.c cVar = (f0.e.d.c) obj;
        Double d10 = this.f11112a;
        if (d10 == null) {
            if (cVar.a() != null) {
                return false;
            }
        } else if (!d10.equals(cVar.a())) {
            return false;
        }
        return this.f11113b == cVar.b() && this.f11114c == cVar.f() && this.f11115d == cVar.d() && this.f11116e == cVar.e() && this.f11117f == cVar.c();
    }

    @Override // Q4.f0.e.d.c
    public final boolean f() {
        return this.f11114c;
    }

    public final int hashCode() {
        Double d10 = this.f11112a;
        int iHashCode = ((((((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f11113b) * 1000003) ^ (this.f11114c ? 1231 : 1237)) * 1000003) ^ this.f11115d) * 1000003;
        long j4 = this.f11116e;
        long j10 = this.f11117f;
        return ((iHashCode ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append(this.f11112a);
        sb.append(", batteryVelocity=");
        sb.append(this.f11113b);
        sb.append(", proximityOn=");
        sb.append(this.f11114c);
        sb.append(", orientation=");
        sb.append(this.f11115d);
        sb.append(", ramUsed=");
        sb.append(this.f11116e);
        sb.append(", diskUsed=");
        return C1094a9.f(sb, this.f11117f, "}");
    }
}
