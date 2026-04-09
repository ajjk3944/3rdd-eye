package b3;

import b3.u;
import java.util.List;

/* loaded from: classes.dex */
final class k extends u {

    /* renamed from: a, reason: collision with root package name */
    private final long f32908a;

    /* renamed from: b, reason: collision with root package name */
    private final long f32909b;

    /* renamed from: c, reason: collision with root package name */
    private final o f32910c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f32911d;

    /* renamed from: e, reason: collision with root package name */
    private final String f32912e;

    /* renamed from: f, reason: collision with root package name */
    private final List f32913f;

    /* renamed from: g, reason: collision with root package name */
    private final x f32914g;

    static final class b extends u.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f32915a;

        /* renamed from: b, reason: collision with root package name */
        private Long f32916b;

        /* renamed from: c, reason: collision with root package name */
        private o f32917c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f32918d;

        /* renamed from: e, reason: collision with root package name */
        private String f32919e;

        /* renamed from: f, reason: collision with root package name */
        private List f32920f;

        /* renamed from: g, reason: collision with root package name */
        private x f32921g;

        b() {
        }

        @Override // b3.u.a
        public u a() {
            String str = "";
            if (this.f32915a == null) {
                str = " requestTimeMs";
            }
            if (this.f32916b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new k(this.f32915a.longValue(), this.f32916b.longValue(), this.f32917c, this.f32918d, this.f32919e, this.f32920f, this.f32921g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // b3.u.a
        public u.a b(o oVar) {
            this.f32917c = oVar;
            return this;
        }

        @Override // b3.u.a
        public u.a c(List list) {
            this.f32920f = list;
            return this;
        }

        @Override // b3.u.a
        u.a d(Integer num) {
            this.f32918d = num;
            return this;
        }

        @Override // b3.u.a
        u.a e(String str) {
            this.f32919e = str;
            return this;
        }

        @Override // b3.u.a
        public u.a f(x xVar) {
            this.f32921g = xVar;
            return this;
        }

        @Override // b3.u.a
        public u.a g(long j10) {
            this.f32915a = Long.valueOf(j10);
            return this;
        }

        @Override // b3.u.a
        public u.a h(long j10) {
            this.f32916b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // b3.u
    public o b() {
        return this.f32910c;
    }

    @Override // b3.u
    public List c() {
        return this.f32913f;
    }

    @Override // b3.u
    public Integer d() {
        return this.f32911d;
    }

    @Override // b3.u
    public String e() {
        return this.f32912e;
    }

    public boolean equals(Object obj) {
        o oVar;
        Integer num;
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f32908a == uVar.g() && this.f32909b == uVar.h() && ((oVar = this.f32910c) != null ? oVar.equals(uVar.b()) : uVar.b() == null) && ((num = this.f32911d) != null ? num.equals(uVar.d()) : uVar.d() == null) && ((str = this.f32912e) != null ? str.equals(uVar.e()) : uVar.e() == null) && ((list = this.f32913f) != null ? list.equals(uVar.c()) : uVar.c() == null)) {
            x xVar = this.f32914g;
            if (xVar == null) {
                if (uVar.f() == null) {
                    return true;
                }
            } else if (xVar.equals(uVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // b3.u
    public x f() {
        return this.f32914g;
    }

    @Override // b3.u
    public long g() {
        return this.f32908a;
    }

    @Override // b3.u
    public long h() {
        return this.f32909b;
    }

    public int hashCode() {
        long j10 = this.f32908a;
        long j11 = this.f32909b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        o oVar = this.f32910c;
        int iHashCode = (i10 ^ (oVar == null ? 0 : oVar.hashCode())) * 1000003;
        Integer num = this.f32911d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f32912e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f32913f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        x xVar = this.f32914g;
        return iHashCode4 ^ (xVar != null ? xVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f32908a + ", requestUptimeMs=" + this.f32909b + ", clientInfo=" + this.f32910c + ", logSource=" + this.f32911d + ", logSourceName=" + this.f32912e + ", logEvents=" + this.f32913f + ", qosTier=" + this.f32914g + "}";
    }

    private k(long j10, long j11, o oVar, Integer num, String str, List list, x xVar) {
        this.f32908a = j10;
        this.f32909b = j11;
        this.f32910c = oVar;
        this.f32911d = num;
        this.f32912e = str;
        this.f32913f = list;
        this.f32914g = xVar;
    }
}
