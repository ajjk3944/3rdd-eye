package com.marsounjan.icmp4a;

import Yg.H;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.net.Inet4Address;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public abstract class d {

    public static abstract class a extends d {

        /* renamed from: com.marsounjan.icmp4a.d$a$a, reason: collision with other inner class name */
        public static final class C1237a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final short f39218a;

            /* renamed from: b, reason: collision with root package name */
            private final short f39219b;

            /* renamed from: c, reason: collision with root package name */
            private final c f39220c;

            public /* synthetic */ C1237a(short s10, short s11, DefaultConstructorMarker defaultConstructorMarker) {
                this(s10, s11);
            }

            @Override // com.marsounjan.icmp4a.d
            public c a() {
                return this.f39220c;
            }

            public final short b() {
                return this.f39219b;
            }

            public final short c() {
                return this.f39218a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1237a)) {
                    return false;
                }
                C1237a c1237a = (C1237a) obj;
                return this.f39218a == c1237a.f39218a && this.f39219b == c1237a.f39219b;
            }

            public int hashCode() {
                return (H.d(this.f39218a) * 31) + Short.hashCode(this.f39219b);
            }

            public String toString() {
                return "Echo(sequenceNumber=" + ((Object) H.g(this.f39218a)) + ", identifier=" + ((int) this.f39219b) + ')';
            }

            private C1237a(short s10, short s11) {
                super(null);
                this.f39218a = s10;
                this.f39219b = s11;
                this.f39220c = c.ECHO;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super(null);
        }
    }

    public static abstract class b extends d {

        public static final class a extends b implements K5.a {

            /* renamed from: a, reason: collision with root package name */
            private final EnumC1238a f39221a;

            /* renamed from: b, reason: collision with root package name */
            private final c f39222b;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* renamed from: com.marsounjan.icmp4a.d$b$a$a, reason: collision with other inner class name */
            public static final class EnumC1238a {
                private static final /* synthetic */ InterfaceC5826a $ENTRIES;
                private static final /* synthetic */ EnumC1238a[] $VALUES;

                /* renamed from: id, reason: collision with root package name */
                private final byte f39223id;
                private final String message;
                public static final EnumC1238a NETWORK_UNREACHABLE = new EnumC1238a("NETWORK_UNREACHABLE", 0, (byte) 0, "Destination Net Unreachable");
                public static final EnumC1238a HOST_UNREACHABLE = new EnumC1238a("HOST_UNREACHABLE", 1, (byte) 1, "Destination Host Unreachable");
                public static final EnumC1238a PROTOCOL_UNREACHABLE = new EnumC1238a("PROTOCOL_UNREACHABLE", 2, (byte) 2, "Destination Protocol Unreachable");
                public static final EnumC1238a PORT_UNREACHABLE = new EnumC1238a("PORT_UNREACHABLE", 3, (byte) 3, "Destination Port Unreachable");
                public static final EnumC1238a FRAGMENTATION_NEEDED = new EnumC1238a("FRAGMENTATION_NEEDED", 4, (byte) 4, "Frag needed and DF set");
                public static final EnumC1238a DEST_NET_UNKNOWN = new EnumC1238a("DEST_NET_UNKNOWN", 5, (byte) 6, "Destination network unknown");
                public static final EnumC1238a DEST_HOST_UNKNOWN = new EnumC1238a("DEST_HOST_UNKNOWN", 6, (byte) 7, "Destination host unknown");
                public static final EnumC1238a SOURCE_HOST_ISOLATED = new EnumC1238a("SOURCE_HOST_ISOLATED", 7, (byte) 8, "Source host isolated");
                public static final EnumC1238a DEST_NETWORK_ADMIN_PROHIBITED = new EnumC1238a("DEST_NETWORK_ADMIN_PROHIBITED", 8, (byte) 9, "Destination network is administratively prohibited");
                public static final EnumC1238a DEST_HOST_ADMIN_PROHIBITED = new EnumC1238a("DEST_HOST_ADMIN_PROHIBITED", 9, (byte) 10, "Destination host is administratively prohibited");
                public static final EnumC1238a NETWORK_UNREACHABLE_FOR_TOS = new EnumC1238a("NETWORK_UNREACHABLE_FOR_TOS", 10, (byte) 11, "Network is unreachable for Type Of Service");
                public static final EnumC1238a HOST_UNREACHABLE_FOR_TOS = new EnumC1238a("HOST_UNREACHABLE_FOR_TOS", 11, (byte) 12, "Host is unreachable for Type Of Service");
                public static final EnumC1238a COMM_ADMIN_PROHIBITED = new EnumC1238a("COMM_ADMIN_PROHIBITED", 12, (byte) 13, "Communication administratively prohibited (administrative filtering prevents packet from being forwarded)");
                public static final EnumC1238a HOST_PRECEDENCE_VIOLATION = new EnumC1238a("HOST_PRECEDENCE_VIOLATION", 13, (byte) 14, "Host precedence violation (indicates the requested precedence is not permitted for the combination of host or network and port)");
                public static final EnumC1238a PRECEDENCE_CUTOFF = new EnumC1238a("PRECEDENCE_CUTOFF", 14, (byte) 15, "Precedence cutoff in effect (precedence of datagram is below the level set by the network administrators)");

                private static final /* synthetic */ EnumC1238a[] $values() {
                    return new EnumC1238a[]{NETWORK_UNREACHABLE, HOST_UNREACHABLE, PROTOCOL_UNREACHABLE, PORT_UNREACHABLE, FRAGMENTATION_NEEDED, DEST_NET_UNKNOWN, DEST_HOST_UNKNOWN, SOURCE_HOST_ISOLATED, DEST_NETWORK_ADMIN_PROHIBITED, DEST_HOST_ADMIN_PROHIBITED, NETWORK_UNREACHABLE_FOR_TOS, HOST_UNREACHABLE_FOR_TOS, COMM_ADMIN_PROHIBITED, HOST_PRECEDENCE_VIOLATION, PRECEDENCE_CUTOFF};
                }

                static {
                    EnumC1238a[] enumC1238aArr$values = $values();
                    $VALUES = enumC1238aArr$values;
                    $ENTRIES = AbstractC5827b.a(enumC1238aArr$values);
                }

                private EnumC1238a(String str, int i10, byte b10, String str2) {
                    this.f39223id = b10;
                    this.message = str2;
                }

                public static InterfaceC5826a getEntries() {
                    return $ENTRIES;
                }

                public static EnumC1238a valueOf(String str) {
                    return (EnumC1238a) Enum.valueOf(EnumC1238a.class, str);
                }

                public static EnumC1238a[] values() {
                    return (EnumC1238a[]) $VALUES.clone();
                }

                /* renamed from: getId-w2LRezQ, reason: not valid java name */
                public final byte m10getIdw2LRezQ() {
                    return this.f39223id;
                }

                public final String getMessage() {
                    return this.message;
                }
            }

            public a(EnumC1238a enumC1238a) {
                super(null);
                this.f39221a = enumC1238a;
                this.f39222b = c.DESTINATION_UNREACHABLE;
            }

            public final EnumC1238a b() {
                return this.f39221a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f39221a == ((a) obj).f39221a;
            }

            public int hashCode() {
                EnumC1238a enumC1238a = this.f39221a;
                if (enumC1238a == null) {
                    return 0;
                }
                return enumC1238a.hashCode();
            }

            public String toString() {
                return "DestinationUnreachable(reason=" + this.f39221a + ')';
            }
        }

        /* renamed from: com.marsounjan.icmp4a.d$b$b, reason: collision with other inner class name */
        public static final class C1239b extends b {

            /* renamed from: a, reason: collision with root package name */
            private final short f39224a;

            /* renamed from: b, reason: collision with root package name */
            private final short f39225b;

            /* renamed from: c, reason: collision with root package name */
            private final c f39226c;

            public /* synthetic */ C1239b(short s10, short s11, DefaultConstructorMarker defaultConstructorMarker) {
                this(s10, s11);
            }

            public final short b() {
                return this.f39224a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1239b)) {
                    return false;
                }
                C1239b c1239b = (C1239b) obj;
                return this.f39224a == c1239b.f39224a && this.f39225b == c1239b.f39225b;
            }

            public int hashCode() {
                return (H.d(this.f39224a) * 31) + Short.hashCode(this.f39225b);
            }

            public String toString() {
                return "Echo(sequenceNumber=" + ((Object) H.g(this.f39224a)) + ", identifier=" + ((int) this.f39225b) + ')';
            }

            private C1239b(short s10, short s11) {
                super(null);
                this.f39224a = s10;
                this.f39225b = s11;
                this.f39226c = c.ECHO_REPLY;
            }
        }

        public static final class c extends b implements K5.a {

            /* renamed from: a, reason: collision with root package name */
            private final byte f39227a;

            /* renamed from: b, reason: collision with root package name */
            private final c f39228b;

            public c(byte b10) {
                super(null);
                this.f39227a = b10;
                this.f39228b = c.PARAMETER_PROBLEM;
            }

            public final byte b() {
                return this.f39227a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f39227a == ((c) obj).f39227a;
            }

            public int hashCode() {
                return Byte.hashCode(this.f39227a);
            }

            public String toString() {
                return "ParameterProblem(pointer=" + ((int) this.f39227a) + ')';
            }
        }

        /* renamed from: com.marsounjan.icmp4a.d$b$d, reason: collision with other inner class name */
        public static final class C1240d extends b implements K5.a {

            /* renamed from: a, reason: collision with root package name */
            private final Inet4Address f39229a;

            /* renamed from: b, reason: collision with root package name */
            private final c f39230b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1240d(Inet4Address inetAddress) {
                super(null);
                AbstractC6492s.i(inetAddress, "inetAddress");
                this.f39229a = inetAddress;
                this.f39230b = c.REDIRECT;
            }

            public final Inet4Address b() {
                return this.f39229a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1240d) && AbstractC6492s.d(this.f39229a, ((C1240d) obj).f39229a);
            }

            public int hashCode() {
                return this.f39229a.hashCode();
            }

            public String toString() {
                return "Redirect(inetAddress=" + this.f39229a + ')';
            }
        }

        public static final class e extends b implements K5.a {

            /* renamed from: a, reason: collision with root package name */
            public static final e f39231a = new e();

            /* renamed from: b, reason: collision with root package name */
            private static final c f39232b = c.SOURCE_QUENCH;

            private e() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return 1996160647;
            }

            public String toString() {
                return "SourceQuench";
            }
        }

        public static final class f extends b implements K5.a {

            /* renamed from: a, reason: collision with root package name */
            public static final f f39233a = new f();

            /* renamed from: b, reason: collision with root package name */
            private static final c f39234b = c.TIME_EXCEEDED;

            private f() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public int hashCode() {
                return -1240200998;
            }

            public String toString() {
                return "TimeExceeded";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
            super(null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;

        /* renamed from: id, reason: collision with root package name */
        private final byte f39235id;
        public static final c ECHO_REPLY = new c("ECHO_REPLY", 0, (byte) 0);
        public static final c DESTINATION_UNREACHABLE = new c("DESTINATION_UNREACHABLE", 1, (byte) 3);
        public static final c SOURCE_QUENCH = new c("SOURCE_QUENCH", 2, (byte) 4);
        public static final c REDIRECT = new c("REDIRECT", 3, (byte) 5);
        public static final c ECHO = new c("ECHO", 4, (byte) 8);
        public static final c TIME_EXCEEDED = new c("TIME_EXCEEDED", 5, (byte) 11);
        public static final c PARAMETER_PROBLEM = new c("PARAMETER_PROBLEM", 6, (byte) 12);

        private static final /* synthetic */ c[] $values() {
            return new c[]{ECHO_REPLY, DESTINATION_UNREACHABLE, SOURCE_QUENCH, REDIRECT, ECHO, TIME_EXCEEDED, PARAMETER_PROBLEM};
        }

        static {
            c[] cVarArr$values = $values();
            $VALUES = cVarArr$values;
            $ENTRIES = AbstractC5827b.a(cVarArr$values);
        }

        private c(String str, int i10, byte b10) {
            this.f39235id = b10;
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        /* renamed from: getId-w2LRezQ, reason: not valid java name */
        public final byte m11getIdw2LRezQ() {
            return this.f39235id;
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract c a();

    private d() {
    }
}
