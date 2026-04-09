package Ic;

import Cc.AbstractC2558b;
import Ec.t;
import inet.ipaddr.g;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public interface a extends t {

    /* renamed from: Ic.a$a, reason: collision with other inner class name */
    public static final class C0369a extends t.b {

        /* renamed from: a, reason: collision with root package name */
        private final g f9036a;

        /* renamed from: b, reason: collision with root package name */
        private final long f9037b;

        /* renamed from: c, reason: collision with root package name */
        private final long f9038c;

        /* renamed from: d, reason: collision with root package name */
        private final Integer f9039d;

        /* renamed from: e, reason: collision with root package name */
        private final t.c f9040e;

        /* renamed from: f, reason: collision with root package name */
        private final AbstractC2558b.g.C0123b f9041f;

        public C0369a(g ipAddress, long j10, long j11, Integer num) {
            AbstractC6492s.i(ipAddress, "ipAddress");
            this.f9036a = ipAddress;
            this.f9037b = j10;
            this.f9038c = j11;
            this.f9039d = num;
            this.f9040e = t.c.GATEWAY;
            this.f9041f = AbstractC2558b.g.C0123b.f2494b;
        }

        @Override // Ec.t.b
        public t.c a() {
            return this.f9040e;
        }

        @Override // Ec.t.b
        public g c() {
            return this.f9036a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0369a)) {
                return false;
            }
            C0369a c0369a = (C0369a) obj;
            return AbstractC6492s.d(this.f9036a, c0369a.f9036a) && this.f9037b == c0369a.f9037b && this.f9038c == c0369a.f9038c && AbstractC6492s.d(this.f9039d, c0369a.f9039d);
        }

        @Override // Ec.t.b
        public long f() {
            return this.f9038c;
        }

        public final AbstractC2558b.g.C0123b g() {
            return this.f9041f;
        }

        @Override // Ec.t.b
        public int hashCode() {
            return super.hashCode();
        }

        public String toString() {
            return "Result(ipAddress=" + this.f9036a + ", createdAt=" + this.f9037b + ", validUntil=" + this.f9038c + ", netmask=" + this.f9039d + ")";
        }
    }
}
