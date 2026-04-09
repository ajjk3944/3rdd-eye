package x3;

import java.util.Map;
import x3.i;

/* loaded from: classes2.dex */
public final class b extends i {

    /* renamed from: a, reason: collision with root package name */
    public final String f24904a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f24905b;

    /* renamed from: c, reason: collision with root package name */
    public final h f24906c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24907d;

    /* renamed from: e, reason: collision with root package name */
    public final long f24908e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f24909f;

    /* renamed from: x3.b$b, reason: collision with other inner class name */
    public static final class C0499b extends i.a {

        /* renamed from: a, reason: collision with root package name */
        public String f24910a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f24911b;

        /* renamed from: c, reason: collision with root package name */
        public h f24912c;

        /* renamed from: d, reason: collision with root package name */
        public Long f24913d;

        /* renamed from: e, reason: collision with root package name */
        public Long f24914e;

        /* renamed from: f, reason: collision with root package name */
        public Map f24915f;

        @Override // x3.i.a
        public i d() {
            String str = "";
            if (this.f24910a == null) {
                str = " transportName";
            }
            if (this.f24912c == null) {
                str = str + " encodedPayload";
            }
            if (this.f24913d == null) {
                str = str + " eventMillis";
            }
            if (this.f24914e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f24915f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f24910a, this.f24911b, this.f24912c, this.f24913d.longValue(), this.f24914e.longValue(), this.f24915f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // x3.i.a
        public Map e() {
            Map map = this.f24915f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // x3.i.a
        public i.a f(Map map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f24915f = map;
            return this;
        }

        @Override // x3.i.a
        public i.a g(Integer num) {
            this.f24911b = num;
            return this;
        }

        @Override // x3.i.a
        public i.a h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f24912c = hVar;
            return this;
        }

        @Override // x3.i.a
        public i.a i(long j10) {
            this.f24913d = Long.valueOf(j10);
            return this;
        }

        @Override // x3.i.a
        public i.a j(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f24910a = str;
            return this;
        }

        @Override // x3.i.a
        public i.a k(long j10) {
            this.f24914e = Long.valueOf(j10);
            return this;
        }
    }

    @Override // x3.i
    public Map c() {
        return this.f24909f;
    }

    @Override // x3.i
    public Integer d() {
        return this.f24905b;
    }

    @Override // x3.i
    public h e() {
        return this.f24906c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f24904a.equals(iVar.j()) && ((num = this.f24905b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f24906c.equals(iVar.e()) && this.f24907d == iVar.f() && this.f24908e == iVar.k() && this.f24909f.equals(iVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // x3.i
    public long f() {
        return this.f24907d;
    }

    public int hashCode() {
        int iHashCode = (this.f24904a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f24905b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f24906c.hashCode()) * 1000003;
        long j10 = this.f24907d;
        int i10 = (iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f24908e;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f24909f.hashCode();
    }

    @Override // x3.i
    public String j() {
        return this.f24904a;
    }

    @Override // x3.i
    public long k() {
        return this.f24908e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f24904a + ", code=" + this.f24905b + ", encodedPayload=" + this.f24906c + ", eventMillis=" + this.f24907d + ", uptimeMillis=" + this.f24908e + ", autoMetadata=" + this.f24909f + "}";
    }

    public b(String str, Integer num, h hVar, long j10, long j11, Map map) {
        this.f24904a = str;
        this.f24905b = num;
        this.f24906c = hVar;
        this.f24907d = j10;
        this.f24908e = j11;
        this.f24909f = map;
    }
}
