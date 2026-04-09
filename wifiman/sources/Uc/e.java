package Uc;

import Cc.AbstractC2558b;
import Ec.t;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public interface e extends t {

    public static final class a extends t.b {

        /* renamed from: a, reason: collision with root package name */
        private final Uc.a f22333a;

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC2558b f22334b;

        /* renamed from: c, reason: collision with root package name */
        private final t.c f22335c;

        public a(Uc.a upnpDevice, AbstractC2558b abstractC2558b) {
            AbstractC6492s.i(upnpDevice, "upnpDevice");
            this.f22333a = upnpDevice;
            this.f22334b = abstractC2558b;
            this.f22335c = t.c.UPNP;
        }

        @Override // Ec.t.b
        public t.c a() {
            return this.f22335c;
        }

        @Override // Ec.t.b
        public inet.ipaddr.g c() {
            return this.f22333a.d();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f22333a, aVar.f22333a) && AbstractC6492s.d(this.f22334b, aVar.f22334b);
        }

        @Override // Ec.t.b
        public long f() {
            return Long.MAX_VALUE;
        }

        public final AbstractC2558b g() {
            return this.f22334b;
        }

        public final Uc.a h() {
            return this.f22333a;
        }

        @Override // Ec.t.b
        public int hashCode() {
            return super.hashCode();
        }

        public String toString() {
            return "Result(upnpDevice=" + this.f22333a + ", deviceType=" + this.f22334b + ")";
        }
    }
}
