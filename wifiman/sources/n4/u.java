package N4;

import N4.F;
import org.snmp4j.asn1.BER;

/* loaded from: classes3.dex */
final class u extends F.e.d.c {

    /* renamed from: a, reason: collision with root package name */
    private final Double f15278a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15279b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f15280c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15281d;

    /* renamed from: e, reason: collision with root package name */
    private final long f15282e;

    /* renamed from: f, reason: collision with root package name */
    private final long f15283f;

    static final class b extends F.e.d.c.a {

        /* renamed from: a, reason: collision with root package name */
        private Double f15284a;

        /* renamed from: b, reason: collision with root package name */
        private int f15285b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f15286c;

        /* renamed from: d, reason: collision with root package name */
        private int f15287d;

        /* renamed from: e, reason: collision with root package name */
        private long f15288e;

        /* renamed from: f, reason: collision with root package name */
        private long f15289f;

        /* renamed from: g, reason: collision with root package name */
        private byte f15290g;

        b() {
        }

        @Override // N4.F.e.d.c.a
        public F.e.d.c a() {
            if (this.f15290g == 31) {
                return new u(this.f15284a, this.f15285b, this.f15286c, this.f15287d, this.f15288e, this.f15289f);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f15290g & 1) == 0) {
                sb2.append(" batteryVelocity");
            }
            if ((this.f15290g & 2) == 0) {
                sb2.append(" proximityOn");
            }
            if ((this.f15290g & 4) == 0) {
                sb2.append(" orientation");
            }
            if ((this.f15290g & 8) == 0) {
                sb2.append(" ramUsed");
            }
            if ((this.f15290g & BER.ASN_SEQUENCE) == 0) {
                sb2.append(" diskUsed");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // N4.F.e.d.c.a
        public F.e.d.c.a b(Double d10) {
            this.f15284a = d10;
            return this;
        }

        @Override // N4.F.e.d.c.a
        public F.e.d.c.a c(int i10) {
            this.f15285b = i10;
            this.f15290g = (byte) (this.f15290g | 1);
            return this;
        }

        @Override // N4.F.e.d.c.a
        public F.e.d.c.a d(long j10) {
            this.f15289f = j10;
            this.f15290g = (byte) (this.f15290g | BER.ASN_SEQUENCE);
            return this;
        }

        @Override // N4.F.e.d.c.a
        public F.e.d.c.a e(int i10) {
            this.f15287d = i10;
            this.f15290g = (byte) (this.f15290g | 4);
            return this;
        }

        @Override // N4.F.e.d.c.a
        public F.e.d.c.a f(boolean z10) {
            this.f15286c = z10;
            this.f15290g = (byte) (this.f15290g | 2);
            return this;
        }

        @Override // N4.F.e.d.c.a
        public F.e.d.c.a g(long j10) {
            this.f15288e = j10;
            this.f15290g = (byte) (this.f15290g | 8);
            return this;
        }
    }

    @Override // N4.F.e.d.c
    public Double b() {
        return this.f15278a;
    }

    @Override // N4.F.e.d.c
    public int c() {
        return this.f15279b;
    }

    @Override // N4.F.e.d.c
    public long d() {
        return this.f15283f;
    }

    @Override // N4.F.e.d.c
    public int e() {
        return this.f15281d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.c)) {
            return false;
        }
        F.e.d.c cVar = (F.e.d.c) obj;
        Double d10 = this.f15278a;
        if (d10 != null ? d10.equals(cVar.b()) : cVar.b() == null) {
            if (this.f15279b == cVar.c() && this.f15280c == cVar.g() && this.f15281d == cVar.e() && this.f15282e == cVar.f() && this.f15283f == cVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // N4.F.e.d.c
    public long f() {
        return this.f15282e;
    }

    @Override // N4.F.e.d.c
    public boolean g() {
        return this.f15280c;
    }

    public int hashCode() {
        Double d10 = this.f15278a;
        int iHashCode = ((((((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f15279b) * 1000003) ^ (this.f15280c ? 1231 : 1237)) * 1000003) ^ this.f15281d) * 1000003;
        long j10 = this.f15282e;
        long j11 = this.f15283f;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f15278a + ", batteryVelocity=" + this.f15279b + ", proximityOn=" + this.f15280c + ", orientation=" + this.f15281d + ", ramUsed=" + this.f15282e + ", diskUsed=" + this.f15283f + "}";
    }

    private u(Double d10, int i10, boolean z10, int i11, long j10, long j11) {
        this.f15278a = d10;
        this.f15279b = i10;
        this.f15280c = z10;
        this.f15281d = i11;
        this.f15282e = j10;
        this.f15283f = j11;
    }
}
