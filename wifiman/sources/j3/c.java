package j3;

import j3.f;
import java.util.Set;

/* loaded from: classes.dex */
final class c extends f.b {

    /* renamed from: a, reason: collision with root package name */
    private final long f50050a;

    /* renamed from: b, reason: collision with root package name */
    private final long f50051b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f50052c;

    static final class b extends f.b.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f50053a;

        /* renamed from: b, reason: collision with root package name */
        private Long f50054b;

        /* renamed from: c, reason: collision with root package name */
        private Set f50055c;

        b() {
        }

        @Override // j3.f.b.a
        public f.b a() {
            String str = "";
            if (this.f50053a == null) {
                str = " delta";
            }
            if (this.f50054b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f50055c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new c(this.f50053a.longValue(), this.f50054b.longValue(), this.f50055c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // j3.f.b.a
        public f.b.a b(long j10) {
            this.f50053a = Long.valueOf(j10);
            return this;
        }

        @Override // j3.f.b.a
        public f.b.a c(Set set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f50055c = set;
            return this;
        }

        @Override // j3.f.b.a
        public f.b.a d(long j10) {
            this.f50054b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // j3.f.b
    long b() {
        return this.f50050a;
    }

    @Override // j3.f.b
    Set c() {
        return this.f50052c;
    }

    @Override // j3.f.b
    long d() {
        return this.f50051b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.b)) {
            return false;
        }
        f.b bVar = (f.b) obj;
        return this.f50050a == bVar.b() && this.f50051b == bVar.d() && this.f50052c.equals(bVar.c());
    }

    public int hashCode() {
        long j10 = this.f50050a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f50051b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f50052c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f50050a + ", maxAllowedDelay=" + this.f50051b + ", flags=" + this.f50052c + "}";
    }

    private c(long j10, long j11, Set set) {
        this.f50050a = j10;
        this.f50051b = j11;
        this.f50052c = set;
    }
}
