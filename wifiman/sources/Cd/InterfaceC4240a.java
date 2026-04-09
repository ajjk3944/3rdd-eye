package cd;

import android.net.Network;
import gg.i;
import inet.ipaddr.e;
import inet.ipaddr.g;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: cd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4240a {

    /* renamed from: cd.a$a, reason: collision with other inner class name */
    public static final class C1181a {
        public static /* synthetic */ i a(InterfaceC4240a interfaceC4240a, b bVar, Integer num, int i10, long j10, long j11, Network network, int i11, Object obj) {
            if (obj == null) {
                return interfaceC4240a.a(bVar, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? 56 : i10, (i11 & 8) != 0 ? 1000L : j10, (i11 & 16) == 0 ? j11 : 1000L, (i11 & 32) == 0 ? network : null);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ping");
        }
    }

    /* renamed from: cd.a$b */
    public static abstract class b {

        /* renamed from: cd.a$b$a, reason: collision with other inner class name */
        public static final class C1182a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final e f33931a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1182a(e host) {
                super(null);
                AbstractC6492s.i(host, "host");
                this.f33931a = host;
            }

            public final e a() {
                return this.f33931a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1182a) && AbstractC6492s.d(this.f33931a, ((C1182a) obj).f33931a);
            }

            public int hashCode() {
                return this.f33931a.hashCode();
            }

            public String toString() {
                return "Hostname(host=" + this.f33931a + ")";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: cd.a$c */
    public static abstract class c {

        /* renamed from: cd.a$c$a, reason: collision with other inner class name */
        public static abstract class AbstractC1183a extends c {

            /* renamed from: cd.a$c$a$a, reason: collision with other inner class name */
            public static final class C1184a extends AbstractC1183a {

                /* renamed from: a, reason: collision with root package name */
                private final String f33932a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1184a(String message) {
                    super(null);
                    AbstractC6492s.i(message, "message");
                    this.f33932a = message;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1184a) && AbstractC6492s.d(this.f33932a, ((C1184a) obj).f33932a);
                }

                public int hashCode() {
                    return this.f33932a.hashCode();
                }

                public String toString() {
                    return "IO(message=" + this.f33932a + ")";
                }
            }

            /* renamed from: cd.a$c$a$b */
            public static final class b extends AbstractC1183a {

                /* renamed from: a, reason: collision with root package name */
                private final String f33933a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(String message) {
                    super(null);
                    AbstractC6492s.i(message, "message");
                    this.f33933a = message;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && AbstractC6492s.d(this.f33933a, ((b) obj).f33933a);
                }

                public int hashCode() {
                    return this.f33933a.hashCode();
                }

                public String toString() {
                    return "Internal(message=" + this.f33933a + ")";
                }
            }

            /* renamed from: cd.a$c$a$c, reason: collision with other inner class name */
            public static final class C1185c extends AbstractC1183a {

                /* renamed from: a, reason: collision with root package name */
                private final String f33934a;

                /* renamed from: b, reason: collision with root package name */
                private final long f33935b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1185c(String message, long j10) {
                    super(null);
                    AbstractC6492s.i(message, "message");
                    this.f33934a = message;
                    this.f33935b = j10;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1185c)) {
                        return false;
                    }
                    C1185c c1185c = (C1185c) obj;
                    return AbstractC6492s.d(this.f33934a, c1185c.f33934a) && this.f33935b == c1185c.f33935b;
                }

                public int hashCode() {
                    return (this.f33934a.hashCode() * 31) + Long.hashCode(this.f33935b);
                }

                public String toString() {
                    return "RequestTimeout(message=" + this.f33934a + ", millis=" + this.f33935b + ")";
                }
            }

            /* renamed from: cd.a$c$a$d */
            public static final class d extends AbstractC1183a {

                /* renamed from: a, reason: collision with root package name */
                private final String f33936a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(String message) {
                    super(null);
                    AbstractC6492s.i(message, "message");
                    this.f33936a = message;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof d) && AbstractC6492s.d(this.f33936a, ((d) obj).f33936a);
                }

                public int hashCode() {
                    return this.f33936a.hashCode();
                }

                public String toString() {
                    return "UnknownHost(message=" + this.f33936a + ")";
                }
            }

            /* renamed from: cd.a$c$a$e */
            public static final class e extends AbstractC1183a {

                /* renamed from: a, reason: collision with root package name */
                private final String f33937a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(String message) {
                    super(null);
                    AbstractC6492s.i(message, "message");
                    this.f33937a = message;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof e) && AbstractC6492s.d(this.f33937a, ((e) obj).f33937a);
                }

                public int hashCode() {
                    return this.f33937a.hashCode();
                }

                public String toString() {
                    return "Unreachable(message=" + this.f33937a + ")";
                }
            }

            public /* synthetic */ AbstractC1183a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private AbstractC1183a() {
                super(null);
            }
        }

        /* renamed from: cd.a$c$b */
        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            private final int f33938a;

            public b(int i10) {
                super(null);
                this.f33938a = i10;
            }

            public final int a() {
                return this.f33938a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f33938a == ((b) obj).f33938a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f33938a);
            }

            public String toString() {
                return "Success(millis=" + this.f33938a + ")";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    /* renamed from: cd.a$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final g f33939a;

        /* renamed from: b, reason: collision with root package name */
        private final int f33940b;

        /* renamed from: c, reason: collision with root package name */
        private final int f33941c;

        /* renamed from: d, reason: collision with root package name */
        private final c f33942d;

        /* renamed from: e, reason: collision with root package name */
        private final float f33943e;

        public d(g gVar, int i10, int i11, c cVar) {
            this.f33939a = gVar;
            this.f33940b = i10;
            this.f33941c = i11;
            this.f33942d = cVar;
            this.f33943e = i10 != 0 ? i11 / i10 : 0.0f;
        }

        public static /* synthetic */ d b(d dVar, g gVar, int i10, int i11, c cVar, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                gVar = dVar.f33939a;
            }
            if ((i12 & 2) != 0) {
                i10 = dVar.f33940b;
            }
            if ((i12 & 4) != 0) {
                i11 = dVar.f33941c;
            }
            if ((i12 & 8) != 0) {
                cVar = dVar.f33942d;
            }
            return dVar.a(gVar, i10, i11, cVar);
        }

        public final d a(g gVar, int i10, int i11, c cVar) {
            return new d(gVar, i10, i11, cVar);
        }

        public final g c() {
            return this.f33939a;
        }

        public final c d() {
            return this.f33942d;
        }

        public final int e() {
            return this.f33941c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC6492s.d(this.f33939a, dVar.f33939a) && this.f33940b == dVar.f33940b && this.f33941c == dVar.f33941c && AbstractC6492s.d(this.f33942d, dVar.f33942d);
        }

        public final int f() {
            return this.f33940b;
        }

        public int hashCode() {
            g gVar = this.f33939a;
            int iHashCode = (((((gVar == null ? 0 : gVar.hashCode()) * 31) + Integer.hashCode(this.f33940b)) * 31) + Integer.hashCode(this.f33941c)) * 31;
            c cVar = this.f33942d;
            return iHashCode + (cVar != null ? cVar.hashCode() : 0);
        }

        public String toString() {
            return "Stats(ip=" + this.f33939a + ", packetsTransmitted=" + this.f33940b + ", packetsReceived=" + this.f33941c + ", latest=" + this.f33942d + ")";
        }
    }

    i a(b bVar, Integer num, int i10, long j10, long j11, Network network);
}
