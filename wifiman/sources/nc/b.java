package Nc;

import Dc.k;
import Dc.t;
import Ec.t;
import inet.ipaddr.g;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class b extends t {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final k f16373a;

        public a(k combiner) {
            AbstractC6492s.i(combiner, "combiner");
            this.f16373a = combiner;
        }

        public final k a() {
            return this.f16373a;
        }
    }

    /* renamed from: Nc.b$b, reason: collision with other inner class name */
    public static final class C0593b extends t.b {

        /* renamed from: a, reason: collision with root package name */
        private final g f16374a;

        /* renamed from: b, reason: collision with root package name */
        private final String f16375b;

        /* renamed from: c, reason: collision with root package name */
        private final long f16376c;

        /* renamed from: d, reason: collision with root package name */
        private final long f16377d;

        /* renamed from: e, reason: collision with root package name */
        private final t.c f16378e;

        public C0593b(g ipAddress, String name, long j10, long j11) {
            AbstractC6492s.i(ipAddress, "ipAddress");
            AbstractC6492s.i(name, "name");
            this.f16374a = ipAddress;
            this.f16375b = name;
            this.f16376c = j10;
            this.f16377d = j11;
            this.f16378e = t.c.NETBIOS;
        }

        @Override // Ec.t.b
        public t.c a() {
            return this.f16378e;
        }

        @Override // Ec.t.b
        public g c() {
            return this.f16374a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0593b)) {
                return false;
            }
            C0593b c0593b = (C0593b) obj;
            return AbstractC6492s.d(this.f16374a, c0593b.f16374a) && AbstractC6492s.d(this.f16375b, c0593b.f16375b) && this.f16376c == c0593b.f16376c && this.f16377d == c0593b.f16377d;
        }

        @Override // Ec.t.b
        public long f() {
            return this.f16377d;
        }

        public final String g() {
            return this.f16375b;
        }

        @Override // Ec.t.b
        public int hashCode() {
            return super.hashCode();
        }

        public String toString() {
            return "Result(ipAddress=" + this.f16374a + ", name=" + this.f16375b + ", createdAt=" + this.f16376c + ", validUntil=" + this.f16377d + ")";
        }
    }
}
