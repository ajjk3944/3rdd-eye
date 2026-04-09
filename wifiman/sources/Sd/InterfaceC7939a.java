package sd;

import com.ui.wifiman.model.ubiquiti.console.e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: sd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC7939a {

    /* renamed from: sd.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC2146a {

        /* renamed from: sd.a$a$a, reason: collision with other inner class name */
        public static final class C2147a extends AbstractC2146a {

            /* renamed from: a, reason: collision with root package name */
            private final inet.ipaddr.g f61440a;

            /* renamed from: b, reason: collision with root package name */
            private final String f61441b;

            public /* synthetic */ C2147a(inet.ipaddr.g gVar, String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(gVar, str);
            }

            public final String a() {
                return this.f61441b;
            }

            public final inet.ipaddr.g b() {
                return this.f61440a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2147a)) {
                    return false;
                }
                C2147a c2147a = (C2147a) obj;
                return AbstractC6492s.d(this.f61440a, c2147a.f61440a) && e.b.h(this.f61441b, c2147a.f61441b);
            }

            public int hashCode() {
                return (this.f61440a.hashCode() * 31) + e.b.j(this.f61441b);
            }

            public String toString() {
                return "Available(gatewayIp=" + this.f61440a + ", consoleId=" + e.b.l(this.f61441b) + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private C2147a(inet.ipaddr.g gatewayIp, String consoleId) {
                super(null);
                AbstractC6492s.i(gatewayIp, "gatewayIp");
                AbstractC6492s.i(consoleId, "consoleId");
                this.f61440a = gatewayIp;
                this.f61441b = consoleId;
            }
        }

        /* renamed from: sd.a$a$b */
        public static final class b extends AbstractC2146a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f61442a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 2009468044;
            }

            public String toString() {
                return "Unavailable";
            }
        }

        public /* synthetic */ AbstractC2146a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC2146a() {
        }
    }

    gg.i a();
}
