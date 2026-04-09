package Gc;

import Ec.t;
import com.ui.wifiman.model.vendor.d;
import h9.C5969a;
import inet.ipaddr.g;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public interface a extends t {

    /* renamed from: Gc.a$a, reason: collision with other inner class name */
    public static final class C0295a extends t.a {

        /* renamed from: a, reason: collision with root package name */
        private final g f7296a;

        /* renamed from: b, reason: collision with root package name */
        private final C5969a f7297b;

        /* renamed from: c, reason: collision with root package name */
        private final d f7298c;

        /* renamed from: d, reason: collision with root package name */
        private final long f7299d;

        /* renamed from: e, reason: collision with root package name */
        private final long f7300e;

        /* renamed from: f, reason: collision with root package name */
        private final t.c f7301f;

        public C0295a(g ipAddress, C5969a mac, d dVar, long j10, long j11) {
            AbstractC6492s.i(ipAddress, "ipAddress");
            AbstractC6492s.i(mac, "mac");
            this.f7296a = ipAddress;
            this.f7297b = mac;
            this.f7298c = dVar;
            this.f7299d = j10;
            this.f7300e = j11;
            this.f7301f = t.c.ARP;
        }

        @Override // Ec.t.b
        public t.c a() {
            return this.f7301f;
        }

        @Override // Ec.t.b
        public g c() {
            return this.f7296a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0295a)) {
                return false;
            }
            C0295a c0295a = (C0295a) obj;
            return AbstractC6492s.d(this.f7296a, c0295a.f7296a) && AbstractC6492s.d(this.f7297b, c0295a.f7297b) && AbstractC6492s.d(this.f7298c, c0295a.f7298c) && this.f7299d == c0295a.f7299d && this.f7300e == c0295a.f7300e;
        }

        @Override // Ec.t.b
        public long f() {
            return this.f7300e;
        }

        @Override // Ec.t.a
        public C5969a g() {
            return this.f7297b;
        }

        public final d h() {
            return this.f7298c;
        }

        @Override // Ec.t.a, Ec.t.b
        public int hashCode() {
            return super.hashCode();
        }

        public String toString() {
            return "Result(ipAddress=" + this.f7296a + ", mac=" + this.f7297b + ", vendor=" + this.f7298c + ", createdAt=" + this.f7299d + ", validUntil=" + this.f7300e + ")";
        }
    }
}
