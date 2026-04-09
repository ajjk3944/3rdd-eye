package Jc;

import Dc.k;
import Dc.t;
import Ec.t;
import inet.ipaddr.g;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class a extends t {

    /* renamed from: Jc.a$a, reason: collision with other inner class name */
    public static final class C0403a {

        /* renamed from: a, reason: collision with root package name */
        private final k f9980a;

        public C0403a(k combiner) {
            AbstractC6492s.i(combiner, "combiner");
            this.f9980a = combiner;
        }

        public final k a() {
            return this.f9980a;
        }
    }

    public static final class b extends t.b {

        /* renamed from: a, reason: collision with root package name */
        private final g f9981a;

        /* renamed from: b, reason: collision with root package name */
        private final String f9982b;

        /* renamed from: c, reason: collision with root package name */
        private final long f9983c;

        /* renamed from: d, reason: collision with root package name */
        private final long f9984d;

        /* renamed from: e, reason: collision with root package name */
        private final t.c f9985e;

        public b(g ipAddress, String hostname, long j10, long j11) {
            AbstractC6492s.i(ipAddress, "ipAddress");
            AbstractC6492s.i(hostname, "hostname");
            this.f9981a = ipAddress;
            this.f9982b = hostname;
            this.f9983c = j10;
            this.f9984d = j11;
            this.f9985e = t.c.HOSTNAME;
        }

        @Override // Ec.t.b
        public t.c a() {
            return this.f9985e;
        }

        @Override // Ec.t.b
        public g c() {
            return this.f9981a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f9981a, bVar.f9981a) && AbstractC6492s.d(this.f9982b, bVar.f9982b) && this.f9983c == bVar.f9983c && this.f9984d == bVar.f9984d;
        }

        @Override // Ec.t.b
        public long f() {
            return this.f9984d;
        }

        public final String g() {
            return this.f9982b;
        }

        @Override // Ec.t.b
        public int hashCode() {
            return super.hashCode();
        }

        public String toString() {
            return "Result(ipAddress=" + this.f9981a + ", hostname=" + this.f9982b + ", createdAt=" + this.f9983c + ", validUntil=" + this.f9984d + ")";
        }
    }
}
