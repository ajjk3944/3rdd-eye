package com.ui.wifiman.model.teleport;

import Fd.B;
import com.ubnt.teleport.unifi.UnifiTeleportTunnel;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final Kd.a f43472a;

    /* renamed from: b, reason: collision with root package name */
    private final UnifiTeleportTunnel f43473b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Kd.a f43474a;

        /* renamed from: b, reason: collision with root package name */
        private final B f43475b;

        /* renamed from: c, reason: collision with root package name */
        private final b f43476c;

        public a(Kd.a record, B b10, b tokenState) {
            AbstractC6492s.i(record, "record");
            AbstractC6492s.i(tokenState, "tokenState");
            this.f43474a = record;
            this.f43475b = b10;
            this.f43476c = tokenState;
        }

        public final B a() {
            return this.f43475b;
        }

        public final Kd.a b() {
            return this.f43474a;
        }

        public final b c() {
            return this.f43476c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f43474a, aVar.f43474a) && this.f43475b == aVar.f43475b && AbstractC6492s.d(this.f43476c, aVar.f43476c);
        }

        public int hashCode() {
            int iHashCode = this.f43474a.hashCode() * 31;
            B b10 = this.f43475b;
            return ((iHashCode + (b10 == null ? 0 : b10.hashCode())) * 31) + this.f43476c.hashCode();
        }

        public String toString() {
            return "Status(record=" + this.f43474a + ", reachable=" + this.f43475b + ", tokenState=" + this.f43476c + ")";
        }
    }

    public static abstract class b {

        public static abstract class a extends b {

            /* renamed from: com.ui.wifiman.model.teleport.n$b$a$a, reason: collision with other inner class name */
            public static final class C1472a extends a {

                /* renamed from: a, reason: collision with root package name */
                public static final C1472a f43477a = new C1472a();

                private C1472a() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1472a);
                }

                public int hashCode() {
                    return 661803091;
                }

                public String toString() {
                    return "Error";
                }
            }

            /* renamed from: com.ui.wifiman.model.teleport.n$b$a$b, reason: collision with other inner class name */
            public static final class C1473b extends a {

                /* renamed from: a, reason: collision with root package name */
                public static final C1473b f43478a = new C1473b();

                private C1473b() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1473b);
                }

                public int hashCode() {
                    return -518583934;
                }

                public String toString() {
                    return "Invalid";
                }
            }

            public static final class c extends a {

                /* renamed from: a, reason: collision with root package name */
                public static final c f43479a = new c();

                private c() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public int hashCode() {
                    return 676990535;
                }

                public String toString() {
                    return "Valid";
                }
            }

            public static final class d extends a {

                /* renamed from: a, reason: collision with root package name */
                public static final d f43480a = new d();

                private d() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof d);
                }

                public int hashCode() {
                    return 288399904;
                }

                public String toString() {
                    return "ValidationInProgress";
                }
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
                super(null);
            }
        }

        /* renamed from: com.ui.wifiman.model.teleport.n$b$b, reason: collision with other inner class name */
        public static final class C1474b extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C1474b f43481a = new C1474b();

            private C1474b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1474b);
            }

            public int hashCode() {
                return 628240928;
            }

            public String toString() {
                return "Unavailable";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public n(Kd.a record, UnifiTeleportTunnel tunnel) {
        AbstractC6492s.i(record, "record");
        AbstractC6492s.i(tunnel, "tunnel");
        this.f43472a = record;
        this.f43473b = tunnel;
    }

    public final Kd.a a() {
        return this.f43472a;
    }

    public final UnifiTeleportTunnel b() {
        return this.f43473b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return AbstractC6492s.d(this.f43472a, nVar.f43472a) && AbstractC6492s.d(this.f43473b, nVar.f43473b);
    }

    public int hashCode() {
        return (this.f43472a.hashCode() * 31) + this.f43473b.hashCode();
    }

    public String toString() {
        return "WifimanTeleport(record=" + this.f43472a + ", tunnel=" + this.f43473b + ")";
    }
}
