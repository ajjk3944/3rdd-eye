package Sd;

import com.ui.wifiman.model.ubiquiti.console.e;
import gg.i;
import h9.C5969a;
import inet.ipaddr.g;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public interface d {

    public static abstract class a {

        /* renamed from: Sd.d$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0739a extends a {

            /* renamed from: Sd.d$a$a$a, reason: collision with other inner class name */
            public static final class C0740a extends AbstractC0739a {

                /* renamed from: a, reason: collision with root package name */
                private final String f20472a;

                /* renamed from: b, reason: collision with root package name */
                private final Set f20473b;

                public /* synthetic */ C0740a(String str, Set set, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, set);
                }

                public final String a() {
                    return this.f20472a;
                }

                public final Set b() {
                    return this.f20473b;
                }

                public String c() {
                    return this.f20472a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0740a)) {
                        return false;
                    }
                    C0740a c0740a = (C0740a) obj;
                    return e.b.h(this.f20472a, c0740a.f20472a) && AbstractC6492s.d(this.f20473b, c0740a.f20473b);
                }

                public int hashCode() {
                    return (e.b.j(this.f20472a) * 31) + this.f20473b.hashCode();
                }

                public String toString() {
                    return "DirectConnectionStatus[NotTrusted](id=" + c() + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                private C0740a(String id2, Set certs) {
                    super(null);
                    AbstractC6492s.i(id2, "id");
                    AbstractC6492s.i(certs, "certs");
                    this.f20472a = id2;
                    this.f20473b = certs;
                }
            }

            /* renamed from: Sd.d$a$a$b */
            public static final class b extends AbstractC0739a {

                /* renamed from: a, reason: collision with root package name */
                private final String f20474a;

                public /* synthetic */ b(String str, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str);
                }

                public String a() {
                    return this.f20474a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && e.b.h(this.f20474a, ((b) obj).f20474a);
                }

                public int hashCode() {
                    return e.b.j(this.f20474a);
                }

                public String toString() {
                    return "DirectConnectionStatus[Trusted](id=" + a() + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                private b(String id2) {
                    super(null);
                    AbstractC6492s.i(id2, "id");
                    this.f20474a = id2;
                }
            }

            public /* synthetic */ AbstractC0739a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private AbstractC0739a() {
                super(null);
            }
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f20475a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 1168751140;
            }

            public String toString() {
                return "DirectConnectionStatus[Disconnected]";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final com.ui.wifiman.model.ubiquiti.console.e f20476a;

        /* renamed from: b, reason: collision with root package name */
        private final g f20477b;

        /* renamed from: c, reason: collision with root package name */
        private final C5969a f20478c;

        public b(com.ui.wifiman.model.ubiquiti.console.e console, g ip, C5969a mac) {
            AbstractC6492s.i(console, "console");
            AbstractC6492s.i(ip, "ip");
            AbstractC6492s.i(mac, "mac");
            this.f20476a = console;
            this.f20477b = ip;
            this.f20478c = mac;
        }

        public final com.ui.wifiman.model.ubiquiti.console.e a() {
            return this.f20476a;
        }

        public final g b() {
            return this.f20477b;
        }

        public final C5969a c() {
            return this.f20478c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f20476a, bVar.f20476a) && AbstractC6492s.d(this.f20477b, bVar.f20477b) && AbstractC6492s.d(this.f20478c, bVar.f20478c);
        }

        public int hashCode() {
            return (((this.f20476a.hashCode() * 31) + this.f20477b.hashCode()) * 31) + this.f20478c.hashCode();
        }

        public String toString() {
            return "LocalConsole(console=" + this.f20476a + ", ip=" + this.f20477b + ", mac=" + this.f20478c + ")";
        }
    }

    i a();

    i b();

    i c();
}
