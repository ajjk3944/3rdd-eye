package Qc;

import Dc.k;
import Dc.t;
import Ec.t;
import inet.ipaddr.g;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class a extends t {

    /* renamed from: Qc.a$a, reason: collision with other inner class name */
    public static final class C0679a {

        /* renamed from: a, reason: collision with root package name */
        private final k f19280a;

        public C0679a(k combiner) {
            AbstractC6492s.i(combiner, "combiner");
            this.f19280a = combiner;
        }

        public final k a() {
            return this.f19280a;
        }
    }

    public static final class b extends t.b {

        /* renamed from: a, reason: collision with root package name */
        private final g f19281a;

        /* renamed from: b, reason: collision with root package name */
        private final long f19282b;

        /* renamed from: c, reason: collision with root package name */
        private final long f19283c;

        /* renamed from: d, reason: collision with root package name */
        private final t.c f19284d;

        public b(g ipAddress, long j10, long j11) {
            AbstractC6492s.i(ipAddress, "ipAddress");
            this.f19281a = ipAddress;
            this.f19282b = j10;
            this.f19283c = j11;
            this.f19284d = t.c.UBNT_HTTP_SPEEDTEST;
        }

        @Override // Ec.t.b
        public t.c a() {
            return this.f19284d;
        }

        @Override // Ec.t.b
        public g c() {
            return this.f19281a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f19281a, bVar.f19281a) && this.f19282b == bVar.f19282b && this.f19283c == bVar.f19283c;
        }

        @Override // Ec.t.b
        public long f() {
            return this.f19283c;
        }

        @Override // Ec.t.b
        public int hashCode() {
            return super.hashCode();
        }

        public String toString() {
            return "Result(ipAddress=" + this.f19281a + ", createdAt=" + this.f19282b + ", validUntil=" + this.f19283c + ")";
        }
    }
}
