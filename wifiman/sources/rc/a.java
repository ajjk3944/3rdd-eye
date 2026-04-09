package Rc;

import Cc.AbstractC2558b;
import Ec.t;
import inet.ipaddr.g;
import kotlin.jvm.internal.AbstractC6492s;
import rd.b;

/* loaded from: classes4.dex */
public interface a extends t {

    /* renamed from: Rc.a$a, reason: collision with other inner class name */
    public static final class C0703a extends t.b {

        /* renamed from: a, reason: collision with root package name */
        private final g f19699a;

        /* renamed from: b, reason: collision with root package name */
        private final int f19700b;

        /* renamed from: c, reason: collision with root package name */
        private final String f19701c;

        /* renamed from: d, reason: collision with root package name */
        private final String f19702d;

        /* renamed from: e, reason: collision with root package name */
        private final S8.g f19703e;

        /* renamed from: f, reason: collision with root package name */
        private final b.a.EnumC2104a f19704f;

        /* renamed from: g, reason: collision with root package name */
        private final AbstractC2558b f19705g;

        /* renamed from: h, reason: collision with root package name */
        private final long f19706h;

        /* renamed from: i, reason: collision with root package name */
        private final long f19707i;

        /* renamed from: j, reason: collision with root package name */
        private final t.c f19708j;

        public C0703a(g ipAddress, int i10, String str, String str2, S8.g gVar, b.a.EnumC2104a enumC2104a, AbstractC2558b abstractC2558b, long j10, long j11) {
            AbstractC6492s.i(ipAddress, "ipAddress");
            this.f19699a = ipAddress;
            this.f19700b = i10;
            this.f19701c = str;
            this.f19702d = str2;
            this.f19703e = gVar;
            this.f19704f = enumC2104a;
            this.f19705g = abstractC2558b;
            this.f19706h = j10;
            this.f19707i = j11;
            this.f19708j = t.c.UBNT_TCP_SPEEDTEST;
        }

        @Override // Ec.t.b
        public t.c a() {
            return this.f19708j;
        }

        @Override // Ec.t.b
        public g c() {
            return this.f19699a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0703a)) {
                return false;
            }
            C0703a c0703a = (C0703a) obj;
            return AbstractC6492s.d(this.f19699a, c0703a.f19699a) && this.f19700b == c0703a.f19700b && AbstractC6492s.d(this.f19701c, c0703a.f19701c) && AbstractC6492s.d(this.f19702d, c0703a.f19702d) && AbstractC6492s.d(this.f19703e, c0703a.f19703e) && this.f19704f == c0703a.f19704f && AbstractC6492s.d(this.f19705g, c0703a.f19705g) && this.f19706h == c0703a.f19706h && this.f19707i == c0703a.f19707i;
        }

        @Override // Ec.t.b
        public long f() {
            return this.f19707i;
        }

        public final AbstractC2558b g() {
            return this.f19705g;
        }

        public final String h() {
            return this.f19702d;
        }

        @Override // Ec.t.b
        public int hashCode() {
            return super.hashCode();
        }

        public final String i() {
            return this.f19701c;
        }

        public final int j() {
            return this.f19700b;
        }

        public final b.a.EnumC2104a k() {
            return this.f19704f;
        }

        public final S8.g l() {
            return this.f19703e;
        }

        public String toString() {
            return "Result(ipAddress=" + this.f19699a + ", speedtestPort=" + this.f19700b + ", name=" + this.f19701c + ", model=" + this.f19702d + ", wifiExperience=" + this.f19703e + ", type=" + this.f19704f + ", deviceType=" + this.f19705g + ", createdAt=" + this.f19706h + ", validUntil=" + this.f19707i + ")";
        }
    }
}
