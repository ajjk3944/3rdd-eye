package ed;

import gg.z;
import h9.C5969a;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: ed.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC5453a {

    /* renamed from: ed.a$a, reason: collision with other inner class name */
    public static final class C1742a {

        /* renamed from: a, reason: collision with root package name */
        private final String f46373a;

        /* renamed from: b, reason: collision with root package name */
        private final C5969a f46374b;

        public C1742a(String ip, C5969a mac) {
            AbstractC6492s.i(ip, "ip");
            AbstractC6492s.i(mac, "mac");
            this.f46373a = ip;
            this.f46374b = mac;
        }

        public final String a() {
            return this.f46373a;
        }

        public final C5969a b() {
            return this.f46374b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1742a)) {
                return false;
            }
            C1742a c1742a = (C1742a) obj;
            return AbstractC6492s.d(this.f46373a, c1742a.f46373a) && AbstractC6492s.d(this.f46374b, c1742a.f46374b);
        }

        public int hashCode() {
            return (this.f46373a.hashCode() * 31) + this.f46374b.hashCode();
        }

        public String toString() {
            return "Neighbour(ip=" + this.f46373a + ", mac=" + this.f46374b + ")";
        }
    }

    z b();
}
