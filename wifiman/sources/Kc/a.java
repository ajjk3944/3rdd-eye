package Kc;

import Ec.t;
import gg.i;
import inet.ipaddr.g;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public interface a extends t {

    /* renamed from: Kc.a$a, reason: collision with other inner class name */
    public static final class C0426a {

        /* renamed from: a, reason: collision with root package name */
        private final Wc.a f10600a;

        /* renamed from: b, reason: collision with root package name */
        private final int f10601b;

        /* renamed from: c, reason: collision with root package name */
        private final long f10602c;

        public C0426a(Wc.a ip, int i10, long j10) {
            AbstractC6492s.i(ip, "ip");
            this.f10600a = ip;
            this.f10601b = i10;
            this.f10602c = j10;
        }

        public final Wc.a a() {
            return this.f10600a;
        }

        public final long b() {
            return this.f10602c;
        }

        public final int c() {
            return this.f10601b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0426a)) {
                return false;
            }
            C0426a c0426a = (C0426a) obj;
            return AbstractC6492s.d(this.f10600a, c0426a.f10600a) && this.f10601b == c0426a.f10601b && this.f10602c == c0426a.f10602c;
        }

        public int hashCode() {
            return (((this.f10600a.hashCode() * 31) + Integer.hashCode(this.f10601b)) * 31) + Long.hashCode(this.f10602c);
        }

        public String toString() {
            return "Params(ip=" + this.f10600a + ", threadCount=" + this.f10601b + ", singleIpTimeoutMillis=" + this.f10602c + ")";
        }
    }

    public static final class b extends t.b {

        /* renamed from: a, reason: collision with root package name */
        private final g f10603a;

        /* renamed from: b, reason: collision with root package name */
        private final long f10604b;

        /* renamed from: c, reason: collision with root package name */
        private final t.c f10605c;

        /* renamed from: d, reason: collision with root package name */
        private final long f10606d;

        public b(g ipAddress, long j10) {
            AbstractC6492s.i(ipAddress, "ipAddress");
            this.f10603a = ipAddress;
            this.f10604b = j10;
            this.f10605c = t.c.ICMP;
            this.f10606d = Long.MAX_VALUE;
        }

        @Override // Ec.t.b
        public t.c a() {
            return this.f10605c;
        }

        @Override // Ec.t.b
        public g c() {
            return this.f10603a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f10603a, bVar.f10603a) && this.f10604b == bVar.f10604b;
        }

        @Override // Ec.t.b
        public long f() {
            return this.f10606d;
        }

        @Override // Ec.t.b
        public int hashCode() {
            return super.hashCode();
        }

        public String toString() {
            return "Result(ipAddress=" + this.f10603a + ", createdAt=" + this.f10604b + ")";
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f10607a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f10608b;

        /* renamed from: c, reason: collision with root package name */
        private final int f10609c;

        /* renamed from: d, reason: collision with root package name */
        private final long f10610d;

        public c(boolean z10, boolean z11, int i10, long j10) {
            this.f10607a = z10;
            this.f10608b = z11;
            this.f10609c = i10;
            this.f10610d = j10;
        }

        public final boolean a() {
            return this.f10608b;
        }

        public final float b() {
            if (this.f10608b) {
                return 1.0f;
            }
            long j10 = this.f10610d;
            if (j10 != 0) {
                return this.f10609c / j10;
            }
            return 0.0f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f10607a == cVar.f10607a && this.f10608b == cVar.f10608b && this.f10609c == cVar.f10609c && this.f10610d == cVar.f10610d;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.f10607a) * 31) + Boolean.hashCode(this.f10608b)) * 31) + Integer.hashCode(this.f10609c)) * 31) + Long.hashCode(this.f10610d);
        }

        public String toString() {
            return "Status(started=" + this.f10607a + ", finished=" + this.f10608b + ", testedAddressCount=" + this.f10609c + ", addressPoolSize=" + this.f10610d + ")";
        }
    }

    i a();
}
