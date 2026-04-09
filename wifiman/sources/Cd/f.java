package Cd;

import gg.AbstractC5912b;
import inet.ipaddr.ipv4.C6180b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public interface f {

    public static abstract class a {

        /* renamed from: Cd.f$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0125a extends a {

            /* renamed from: Cd.f$a$a$a, reason: collision with other inner class name */
            public static final class C0126a extends AbstractC0125a {

                /* renamed from: a, reason: collision with root package name */
                private final C6180b f2562a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0126a(C6180b serverIP) {
                    super(null);
                    AbstractC6492s.i(serverIP, "serverIP");
                    this.f2562a = serverIP;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0126a) && AbstractC6492s.d(this.f2562a, ((C0126a) obj).f2562a);
                }

                public int hashCode() {
                    return this.f2562a.hashCode();
                }

                public String toString() {
                    return "Idle(serverIP=" + this.f2562a + ")";
                }
            }

            /* renamed from: Cd.f$a$a$b */
            public static final class b extends AbstractC0125a {

                /* renamed from: a, reason: collision with root package name */
                private final C6180b f2563a;

                /* renamed from: b, reason: collision with root package name */
                private final W7.a f2564b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(C6180b serverIP, W7.a aVar) {
                    super(null);
                    AbstractC6492s.i(serverIP, "serverIP");
                    this.f2563a = serverIP;
                    this.f2564b = aVar;
                }

                public final W7.a a() {
                    return this.f2564b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return AbstractC6492s.d(this.f2563a, bVar.f2563a) && AbstractC6492s.d(this.f2564b, bVar.f2564b);
                }

                public int hashCode() {
                    int iHashCode = this.f2563a.hashCode() * 31;
                    W7.a aVar = this.f2564b;
                    return iHashCode + (aVar == null ? 0 : aVar.hashCode());
                }

                public String toString() {
                    return "Running(serverIP=" + this.f2563a + ", speed=" + this.f2564b + ")";
                }
            }

            public /* synthetic */ AbstractC0125a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private AbstractC0125a() {
                super(null);
            }
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f2565a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -307174612;
            }

            public String toString() {
                return "Unavailable";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    AbstractC5912b a();

    gg.i b();

    gg.i getState();
}
