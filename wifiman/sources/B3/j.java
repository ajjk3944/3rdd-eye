package b3;

import b3.t;
import java.util.Arrays;

/* loaded from: classes.dex */
final class j extends t {

    /* renamed from: a, reason: collision with root package name */
    private final long f32890a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f32891b;

    /* renamed from: c, reason: collision with root package name */
    private final p f32892c;

    /* renamed from: d, reason: collision with root package name */
    private final long f32893d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f32894e;

    /* renamed from: f, reason: collision with root package name */
    private final String f32895f;

    /* renamed from: g, reason: collision with root package name */
    private final long f32896g;

    /* renamed from: h, reason: collision with root package name */
    private final w f32897h;

    /* renamed from: i, reason: collision with root package name */
    private final q f32898i;

    static final class b extends t.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f32899a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f32900b;

        /* renamed from: c, reason: collision with root package name */
        private p f32901c;

        /* renamed from: d, reason: collision with root package name */
        private Long f32902d;

        /* renamed from: e, reason: collision with root package name */
        private byte[] f32903e;

        /* renamed from: f, reason: collision with root package name */
        private String f32904f;

        /* renamed from: g, reason: collision with root package name */
        private Long f32905g;

        /* renamed from: h, reason: collision with root package name */
        private w f32906h;

        /* renamed from: i, reason: collision with root package name */
        private q f32907i;

        b() {
        }

        @Override // b3.t.a
        public t a() {
            String str = "";
            if (this.f32899a == null) {
                str = " eventTimeMs";
            }
            if (this.f32902d == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f32905g == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new j(this.f32899a.longValue(), this.f32900b, this.f32901c, this.f32902d.longValue(), this.f32903e, this.f32904f, this.f32905g.longValue(), this.f32906h, this.f32907i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // b3.t.a
        public t.a b(p pVar) {
            this.f32901c = pVar;
            return this;
        }

        @Override // b3.t.a
        public t.a c(Integer num) {
            this.f32900b = num;
            return this;
        }

        @Override // b3.t.a
        public t.a d(long j10) {
            this.f32899a = Long.valueOf(j10);
            return this;
        }

        @Override // b3.t.a
        public t.a e(long j10) {
            this.f32902d = Long.valueOf(j10);
            return this;
        }

        @Override // b3.t.a
        public t.a f(q qVar) {
            this.f32907i = qVar;
            return this;
        }

        @Override // b3.t.a
        public t.a g(w wVar) {
            this.f32906h = wVar;
            return this;
        }

        @Override // b3.t.a
        t.a h(byte[] bArr) {
            this.f32903e = bArr;
            return this;
        }

        @Override // b3.t.a
        t.a i(String str) {
            this.f32904f = str;
            return this;
        }

        @Override // b3.t.a
        public t.a j(long j10) {
            this.f32905g = Long.valueOf(j10);
            return this;
        }
    }

    @Override // b3.t
    public p b() {
        return this.f32892c;
    }

    @Override // b3.t
    public Integer c() {
        return this.f32891b;
    }

    @Override // b3.t
    public long d() {
        return this.f32890a;
    }

    @Override // b3.t
    public long e() {
        return this.f32893d;
    }

    public boolean equals(Object obj) {
        Integer num;
        p pVar;
        String str;
        w wVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f32890a == tVar.d() && ((num = this.f32891b) != null ? num.equals(tVar.c()) : tVar.c() == null) && ((pVar = this.f32892c) != null ? pVar.equals(tVar.b()) : tVar.b() == null) && this.f32893d == tVar.e()) {
            if (Arrays.equals(this.f32894e, tVar instanceof j ? ((j) tVar).f32894e : tVar.h()) && ((str = this.f32895f) != null ? str.equals(tVar.i()) : tVar.i() == null) && this.f32896g == tVar.j() && ((wVar = this.f32897h) != null ? wVar.equals(tVar.g()) : tVar.g() == null)) {
                q qVar = this.f32898i;
                if (qVar == null) {
                    if (tVar.f() == null) {
                        return true;
                    }
                } else if (qVar.equals(tVar.f())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // b3.t
    public q f() {
        return this.f32898i;
    }

    @Override // b3.t
    public w g() {
        return this.f32897h;
    }

    @Override // b3.t
    public byte[] h() {
        return this.f32894e;
    }

    public int hashCode() {
        long j10 = this.f32890a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f32891b;
        int iHashCode = (i10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        p pVar = this.f32892c;
        int iHashCode2 = pVar == null ? 0 : pVar.hashCode();
        long j11 = this.f32893d;
        int iHashCode3 = (((((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f32894e)) * 1000003;
        String str = this.f32895f;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        long j12 = this.f32896g;
        int i11 = (((iHashCode3 ^ iHashCode4) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        w wVar = this.f32897h;
        int iHashCode5 = (i11 ^ (wVar == null ? 0 : wVar.hashCode())) * 1000003;
        q qVar = this.f32898i;
        return iHashCode5 ^ (qVar != null ? qVar.hashCode() : 0);
    }

    @Override // b3.t
    public String i() {
        return this.f32895f;
    }

    @Override // b3.t
    public long j() {
        return this.f32896g;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f32890a + ", eventCode=" + this.f32891b + ", complianceData=" + this.f32892c + ", eventUptimeMs=" + this.f32893d + ", sourceExtension=" + Arrays.toString(this.f32894e) + ", sourceExtensionJsonProto3=" + this.f32895f + ", timezoneOffsetSeconds=" + this.f32896g + ", networkConnectionInfo=" + this.f32897h + ", experimentIds=" + this.f32898i + "}";
    }

    private j(long j10, Integer num, p pVar, long j11, byte[] bArr, String str, long j12, w wVar, q qVar) {
        this.f32890a = j10;
        this.f32891b = num;
        this.f32892c = pVar;
        this.f32893d = j11;
        this.f32894e = bArr;
        this.f32895f = str;
        this.f32896g = j12;
        this.f32897h = wVar;
        this.f32898i = qVar;
    }
}
