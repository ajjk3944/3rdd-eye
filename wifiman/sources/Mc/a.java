package Mc;

import Cc.AbstractC2558b;
import Ec.t;
import com.ui.wifiman.model.vendor.d;
import h9.C5969a;
import inet.ipaddr.g;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public interface a extends t {

    /* renamed from: Mc.a$a, reason: collision with other inner class name */
    public static final class C0514a extends t.b {

        /* renamed from: a, reason: collision with root package name */
        private final g f13086a;

        /* renamed from: b, reason: collision with root package name */
        private final String f13087b;

        /* renamed from: c, reason: collision with root package name */
        private final String f13088c;

        /* renamed from: d, reason: collision with root package name */
        private final d f13089d;

        /* renamed from: e, reason: collision with root package name */
        private final C5969a f13090e;

        /* renamed from: f, reason: collision with root package name */
        private final long f13091f;

        /* renamed from: g, reason: collision with root package name */
        private final String f13092g;

        /* renamed from: h, reason: collision with root package name */
        private final AbstractC2558b f13093h;

        /* renamed from: i, reason: collision with root package name */
        private final long f13094i;

        /* renamed from: j, reason: collision with root package name */
        private final long f13095j;

        /* renamed from: k, reason: collision with root package name */
        private final t.c f13096k;

        public C0514a(g ipAddress, String str, String model, d dVar, C5969a c5969a, long j10, String version, AbstractC2558b deviceType, long j11, long j12) {
            AbstractC6492s.i(ipAddress, "ipAddress");
            AbstractC6492s.i(model, "model");
            AbstractC6492s.i(version, "version");
            AbstractC6492s.i(deviceType, "deviceType");
            this.f13086a = ipAddress;
            this.f13087b = str;
            this.f13088c = model;
            this.f13089d = dVar;
            this.f13090e = c5969a;
            this.f13091f = j10;
            this.f13092g = version;
            this.f13093h = deviceType;
            this.f13094i = j11;
            this.f13095j = j12;
            this.f13096k = t.c.MYSELF;
        }

        @Override // Ec.t.b
        public t.c a() {
            return this.f13096k;
        }

        @Override // Ec.t.b
        public g c() {
            return this.f13086a;
        }

        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override // Ec.t.b
        public long f() {
            return this.f13095j;
        }

        public final AbstractC2558b g() {
            return this.f13093h;
        }

        public final String h() {
            return this.f13088c;
        }

        @Override // Ec.t.b
        public int hashCode() {
            return super.hashCode();
        }

        public final String i() {
            return this.f13087b;
        }

        public final long j() {
            return this.f13091f;
        }

        public final d k() {
            return this.f13089d;
        }

        public final String l() {
            return this.f13092g;
        }

        public String toString() {
            return "Result(ipAddress=" + this.f13086a + ", name=" + this.f13087b + ", model=" + this.f13088c + ", vendor=" + this.f13089d + ", hwAddress=" + this.f13090e + ", uptimeMillis=" + this.f13091f + ", version=" + this.f13092g + ", deviceType=" + this.f13093h + ", createdAt=" + this.f13094i + ", validUntil=" + this.f13095j + ")";
        }
    }
}
