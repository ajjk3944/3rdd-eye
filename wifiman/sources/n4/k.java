package N4;

import N4.F;
import org.snmp4j.asn1.BER;

/* loaded from: classes3.dex */
final class k extends F.e.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f15167a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15168b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15169c;

    /* renamed from: d, reason: collision with root package name */
    private final long f15170d;

    /* renamed from: e, reason: collision with root package name */
    private final long f15171e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f15172f;

    /* renamed from: g, reason: collision with root package name */
    private final int f15173g;

    /* renamed from: h, reason: collision with root package name */
    private final String f15174h;

    /* renamed from: i, reason: collision with root package name */
    private final String f15175i;

    static final class b extends F.e.c.a {

        /* renamed from: a, reason: collision with root package name */
        private int f15176a;

        /* renamed from: b, reason: collision with root package name */
        private String f15177b;

        /* renamed from: c, reason: collision with root package name */
        private int f15178c;

        /* renamed from: d, reason: collision with root package name */
        private long f15179d;

        /* renamed from: e, reason: collision with root package name */
        private long f15180e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f15181f;

        /* renamed from: g, reason: collision with root package name */
        private int f15182g;

        /* renamed from: h, reason: collision with root package name */
        private String f15183h;

        /* renamed from: i, reason: collision with root package name */
        private String f15184i;

        /* renamed from: j, reason: collision with root package name */
        private byte f15185j;

        b() {
        }

        @Override // N4.F.e.c.a
        public F.e.c a() {
            String str;
            String str2;
            String str3;
            if (this.f15185j == 63 && (str = this.f15177b) != null && (str2 = this.f15183h) != null && (str3 = this.f15184i) != null) {
                return new k(this.f15176a, str, this.f15178c, this.f15179d, this.f15180e, this.f15181f, this.f15182g, str2, str3);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f15185j & 1) == 0) {
                sb2.append(" arch");
            }
            if (this.f15177b == null) {
                sb2.append(" model");
            }
            if ((this.f15185j & 2) == 0) {
                sb2.append(" cores");
            }
            if ((this.f15185j & 4) == 0) {
                sb2.append(" ram");
            }
            if ((this.f15185j & 8) == 0) {
                sb2.append(" diskSpace");
            }
            if ((this.f15185j & BER.ASN_SEQUENCE) == 0) {
                sb2.append(" simulator");
            }
            if ((this.f15185j & BER.ASN_CONSTRUCTOR) == 0) {
                sb2.append(" state");
            }
            if (this.f15183h == null) {
                sb2.append(" manufacturer");
            }
            if (this.f15184i == null) {
                sb2.append(" modelClass");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // N4.F.e.c.a
        public F.e.c.a b(int i10) {
            this.f15176a = i10;
            this.f15185j = (byte) (this.f15185j | 1);
            return this;
        }

        @Override // N4.F.e.c.a
        public F.e.c.a c(int i10) {
            this.f15178c = i10;
            this.f15185j = (byte) (this.f15185j | 2);
            return this;
        }

        @Override // N4.F.e.c.a
        public F.e.c.a d(long j10) {
            this.f15180e = j10;
            this.f15185j = (byte) (this.f15185j | 8);
            return this;
        }

        @Override // N4.F.e.c.a
        public F.e.c.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.f15183h = str;
            return this;
        }

        @Override // N4.F.e.c.a
        public F.e.c.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.f15177b = str;
            return this;
        }

        @Override // N4.F.e.c.a
        public F.e.c.a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.f15184i = str;
            return this;
        }

        @Override // N4.F.e.c.a
        public F.e.c.a h(long j10) {
            this.f15179d = j10;
            this.f15185j = (byte) (this.f15185j | 4);
            return this;
        }

        @Override // N4.F.e.c.a
        public F.e.c.a i(boolean z10) {
            this.f15181f = z10;
            this.f15185j = (byte) (this.f15185j | BER.ASN_SEQUENCE);
            return this;
        }

        @Override // N4.F.e.c.a
        public F.e.c.a j(int i10) {
            this.f15182g = i10;
            this.f15185j = (byte) (this.f15185j | BER.ASN_CONSTRUCTOR);
            return this;
        }
    }

    @Override // N4.F.e.c
    public int b() {
        return this.f15167a;
    }

    @Override // N4.F.e.c
    public int c() {
        return this.f15169c;
    }

    @Override // N4.F.e.c
    public long d() {
        return this.f15171e;
    }

    @Override // N4.F.e.c
    public String e() {
        return this.f15174h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.c)) {
            return false;
        }
        F.e.c cVar = (F.e.c) obj;
        return this.f15167a == cVar.b() && this.f15168b.equals(cVar.f()) && this.f15169c == cVar.c() && this.f15170d == cVar.h() && this.f15171e == cVar.d() && this.f15172f == cVar.j() && this.f15173g == cVar.i() && this.f15174h.equals(cVar.e()) && this.f15175i.equals(cVar.g());
    }

    @Override // N4.F.e.c
    public String f() {
        return this.f15168b;
    }

    @Override // N4.F.e.c
    public String g() {
        return this.f15175i;
    }

    @Override // N4.F.e.c
    public long h() {
        return this.f15170d;
    }

    public int hashCode() {
        int iHashCode = (((((this.f15167a ^ 1000003) * 1000003) ^ this.f15168b.hashCode()) * 1000003) ^ this.f15169c) * 1000003;
        long j10 = this.f15170d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f15171e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f15172f ? 1231 : 1237)) * 1000003) ^ this.f15173g) * 1000003) ^ this.f15174h.hashCode()) * 1000003) ^ this.f15175i.hashCode();
    }

    @Override // N4.F.e.c
    public int i() {
        return this.f15173g;
    }

    @Override // N4.F.e.c
    public boolean j() {
        return this.f15172f;
    }

    public String toString() {
        return "Device{arch=" + this.f15167a + ", model=" + this.f15168b + ", cores=" + this.f15169c + ", ram=" + this.f15170d + ", diskSpace=" + this.f15171e + ", simulator=" + this.f15172f + ", state=" + this.f15173g + ", manufacturer=" + this.f15174h + ", modelClass=" + this.f15175i + "}";
    }

    private k(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f15167a = i10;
        this.f15168b = str;
        this.f15169c = i11;
        this.f15170d = j10;
        this.f15171e = j11;
        this.f15172f = z10;
        this.f15173g = i12;
        this.f15174h = str2;
        this.f15175i = str3;
    }
}
