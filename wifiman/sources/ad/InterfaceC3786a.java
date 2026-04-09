package ad;

import android.net.Network;
import gg.z;
import java.net.InetAddress;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ad.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3786a {

    /* renamed from: ad.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0997a {

        /* renamed from: ad.a$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0998a extends AbstractC0997a {

            /* renamed from: ad.a$a$a$a, reason: collision with other inner class name */
            public static final class C0999a extends AbstractC0998a {

                /* renamed from: a, reason: collision with root package name */
                public static final C0999a f25943a = new C0999a();

                private C0999a() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0999a);
                }

                public int hashCode() {
                    return 359631561;
                }

                public String toString() {
                    return "NotResolved";
                }
            }

            /* renamed from: ad.a$a$a$b */
            public static final class b extends AbstractC0998a {

                /* renamed from: a, reason: collision with root package name */
                public static final b f25944a = new b();

                private b() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public int hashCode() {
                    return 1717415743;
                }

                public String toString() {
                    return "Timeout";
                }
            }

            public /* synthetic */ AbstractC0998a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private AbstractC0998a() {
                super(null);
            }
        }

        /* renamed from: ad.a$a$b */
        public static final class b extends AbstractC0997a {

            /* renamed from: a, reason: collision with root package name */
            private final InetAddress f25945a;

            /* renamed from: b, reason: collision with root package name */
            private final int f25946b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InetAddress inetAddress, int i10) {
                super(null);
                AbstractC6492s.i(inetAddress, "inetAddress");
                this.f25945a = inetAddress;
                this.f25946b = i10;
            }

            public final int a() {
                return this.f25946b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return AbstractC6492s.d(this.f25945a, bVar.f25945a) && this.f25946b == bVar.f25946b;
            }

            public int hashCode() {
                return (this.f25945a.hashCode() * 31) + Integer.hashCode(this.f25946b);
            }

            public String toString() {
                return "Success(inetAddress=" + this.f25945a + ", millis=" + this.f25946b + ")";
            }
        }

        public /* synthetic */ AbstractC0997a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC0997a() {
        }
    }

    z a(String str, int i10, Network network);
}
