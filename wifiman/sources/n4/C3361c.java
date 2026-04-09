package N4;

import N4.F;
import java.util.List;
import org.snmp4j.asn1.BER;

/* renamed from: N4.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3361c extends F.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f15093a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15094b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15095c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15096d;

    /* renamed from: e, reason: collision with root package name */
    private final long f15097e;

    /* renamed from: f, reason: collision with root package name */
    private final long f15098f;

    /* renamed from: g, reason: collision with root package name */
    private final long f15099g;

    /* renamed from: h, reason: collision with root package name */
    private final String f15100h;

    /* renamed from: i, reason: collision with root package name */
    private final List f15101i;

    /* renamed from: N4.c$b */
    static final class b extends F.a.b {

        /* renamed from: a, reason: collision with root package name */
        private int f15102a;

        /* renamed from: b, reason: collision with root package name */
        private String f15103b;

        /* renamed from: c, reason: collision with root package name */
        private int f15104c;

        /* renamed from: d, reason: collision with root package name */
        private int f15105d;

        /* renamed from: e, reason: collision with root package name */
        private long f15106e;

        /* renamed from: f, reason: collision with root package name */
        private long f15107f;

        /* renamed from: g, reason: collision with root package name */
        private long f15108g;

        /* renamed from: h, reason: collision with root package name */
        private String f15109h;

        /* renamed from: i, reason: collision with root package name */
        private List f15110i;

        /* renamed from: j, reason: collision with root package name */
        private byte f15111j;

        b() {
        }

        @Override // N4.F.a.b
        public F.a a() {
            String str;
            if (this.f15111j == 63 && (str = this.f15103b) != null) {
                return new C3361c(this.f15102a, str, this.f15104c, this.f15105d, this.f15106e, this.f15107f, this.f15108g, this.f15109h, this.f15110i);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f15111j & 1) == 0) {
                sb2.append(" pid");
            }
            if (this.f15103b == null) {
                sb2.append(" processName");
            }
            if ((this.f15111j & 2) == 0) {
                sb2.append(" reasonCode");
            }
            if ((this.f15111j & 4) == 0) {
                sb2.append(" importance");
            }
            if ((this.f15111j & 8) == 0) {
                sb2.append(" pss");
            }
            if ((this.f15111j & BER.ASN_SEQUENCE) == 0) {
                sb2.append(" rss");
            }
            if ((this.f15111j & BER.ASN_CONSTRUCTOR) == 0) {
                sb2.append(" timestamp");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // N4.F.a.b
        public F.a.b b(List list) {
            this.f15110i = list;
            return this;
        }

        @Override // N4.F.a.b
        public F.a.b c(int i10) {
            this.f15105d = i10;
            this.f15111j = (byte) (this.f15111j | 4);
            return this;
        }

        @Override // N4.F.a.b
        public F.a.b d(int i10) {
            this.f15102a = i10;
            this.f15111j = (byte) (this.f15111j | 1);
            return this;
        }

        @Override // N4.F.a.b
        public F.a.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f15103b = str;
            return this;
        }

        @Override // N4.F.a.b
        public F.a.b f(long j10) {
            this.f15106e = j10;
            this.f15111j = (byte) (this.f15111j | 8);
            return this;
        }

        @Override // N4.F.a.b
        public F.a.b g(int i10) {
            this.f15104c = i10;
            this.f15111j = (byte) (this.f15111j | 2);
            return this;
        }

        @Override // N4.F.a.b
        public F.a.b h(long j10) {
            this.f15107f = j10;
            this.f15111j = (byte) (this.f15111j | BER.ASN_SEQUENCE);
            return this;
        }

        @Override // N4.F.a.b
        public F.a.b i(long j10) {
            this.f15108g = j10;
            this.f15111j = (byte) (this.f15111j | BER.ASN_CONSTRUCTOR);
            return this;
        }

        @Override // N4.F.a.b
        public F.a.b j(String str) {
            this.f15109h = str;
            return this;
        }
    }

    @Override // N4.F.a
    public List b() {
        return this.f15101i;
    }

    @Override // N4.F.a
    public int c() {
        return this.f15096d;
    }

    @Override // N4.F.a
    public int d() {
        return this.f15093a;
    }

    @Override // N4.F.a
    public String e() {
        return this.f15094b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.a)) {
            return false;
        }
        F.a aVar = (F.a) obj;
        if (this.f15093a == aVar.d() && this.f15094b.equals(aVar.e()) && this.f15095c == aVar.g() && this.f15096d == aVar.c() && this.f15097e == aVar.f() && this.f15098f == aVar.h() && this.f15099g == aVar.i() && ((str = this.f15100h) != null ? str.equals(aVar.j()) : aVar.j() == null)) {
            List list = this.f15101i;
            if (list == null) {
                if (aVar.b() == null) {
                    return true;
                }
            } else if (list.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // N4.F.a
    public long f() {
        return this.f15097e;
    }

    @Override // N4.F.a
    public int g() {
        return this.f15095c;
    }

    @Override // N4.F.a
    public long h() {
        return this.f15098f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f15093a ^ 1000003) * 1000003) ^ this.f15094b.hashCode()) * 1000003) ^ this.f15095c) * 1000003) ^ this.f15096d) * 1000003;
        long j10 = this.f15097e;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f15098f;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f15099g;
        int i12 = (i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.f15100h;
        int iHashCode2 = (i12 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f15101i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // N4.F.a
    public long i() {
        return this.f15099g;
    }

    @Override // N4.F.a
    public String j() {
        return this.f15100h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f15093a + ", processName=" + this.f15094b + ", reasonCode=" + this.f15095c + ", importance=" + this.f15096d + ", pss=" + this.f15097e + ", rss=" + this.f15098f + ", timestamp=" + this.f15099g + ", traceFile=" + this.f15100h + ", buildIdMappingForArch=" + this.f15101i + "}";
    }

    private C3361c(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List list) {
        this.f15093a = i10;
        this.f15094b = str;
        this.f15095c = i11;
        this.f15096d = i12;
        this.f15097e = j10;
        this.f15098f = j11;
        this.f15099g = j12;
        this.f15100h = str2;
        this.f15101i = list;
    }
}
