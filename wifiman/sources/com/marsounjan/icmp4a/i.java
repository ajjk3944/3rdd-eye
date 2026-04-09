package com.marsounjan.icmp4a;

import Yg.C;
import Yg.H;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public abstract class i {

    public static abstract class a extends i {

        /* renamed from: com.marsounjan.icmp4a.i$a$a, reason: collision with other inner class name */
        public static final class C1241a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final short f39240a;

            /* renamed from: b, reason: collision with root package name */
            private final short f39241b;

            /* renamed from: c, reason: collision with root package name */
            private final c f39242c;

            public /* synthetic */ C1241a(short s10, short s11, DefaultConstructorMarker defaultConstructorMarker) {
                this(s10, s11);
            }

            @Override // com.marsounjan.icmp4a.i
            public c a() {
                return this.f39242c;
            }

            public final short b() {
                return this.f39241b;
            }

            public final short c() {
                return this.f39240a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1241a)) {
                    return false;
                }
                C1241a c1241a = (C1241a) obj;
                return this.f39240a == c1241a.f39240a && this.f39241b == c1241a.f39241b;
            }

            public int hashCode() {
                return (H.d(this.f39240a) * 31) + Short.hashCode(this.f39241b);
            }

            public String toString() {
                return "Echo(sequenceNumber=" + ((Object) H.g(this.f39240a)) + ", identifier=" + ((int) this.f39241b) + ')';
            }

            private C1241a(short s10, short s11) {
                super(null);
                this.f39240a = s10;
                this.f39241b = s11;
                this.f39242c = c.ECHO;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super(null);
        }
    }

    public static abstract class b extends i {

        public static final class a extends b implements K5.a {

            /* renamed from: a, reason: collision with root package name */
            private final EnumC1242a f39243a;

            /* renamed from: b, reason: collision with root package name */
            private final c f39244b;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* renamed from: com.marsounjan.icmp4a.i$b$a$a, reason: collision with other inner class name */
            public static final class EnumC1242a {
                private static final /* synthetic */ InterfaceC5826a $ENTRIES;
                private static final /* synthetic */ EnumC1242a[] $VALUES;

                /* renamed from: id, reason: collision with root package name */
                private final byte f39245id;
                private final String message;
                public static final EnumC1242a NO_ROUTE_TO_DESTINATION = new EnumC1242a("NO_ROUTE_TO_DESTINATION", 0, (byte) 0, "No route to destination");
                public static final EnumC1242a COMMUNICATION_PROHIBITED = new EnumC1242a("COMMUNICATION_PROHIBITED", 1, (byte) 1, "Administratively prohibited");
                public static final EnumC1242a BEYOND_ADDRESS_SCOPE = new EnumC1242a("BEYOND_ADDRESS_SCOPE", 2, (byte) 2, "Beyond scope of source address");
                public static final EnumC1242a ADDRESS_UNREACHABLE = new EnumC1242a("ADDRESS_UNREACHABLE", 3, (byte) 3, "Address unreachable");
                public static final EnumC1242a PORT_UNREACHABLE = new EnumC1242a("PORT_UNREACHABLE", 4, (byte) 4, "Port unreachable");
                public static final EnumC1242a SOURCE_ADDRESS_FAILED_INGRESS_POLICY = new EnumC1242a("SOURCE_ADDRESS_FAILED_INGRESS_POLICY", 5, (byte) 5, "Source address failed ingress policy");
                public static final EnumC1242a ROUTE_TO_DESTINATION_REJECTED = new EnumC1242a("ROUTE_TO_DESTINATION_REJECTED", 6, (byte) 6, "Route to destination rejected");
                public static final EnumC1242a SOURCE_ROUTING_HEADER_ERROR = new EnumC1242a("SOURCE_ROUTING_HEADER_ERROR", 7, (byte) 7, "Routing header error");

                private static final /* synthetic */ EnumC1242a[] $values() {
                    return new EnumC1242a[]{NO_ROUTE_TO_DESTINATION, COMMUNICATION_PROHIBITED, BEYOND_ADDRESS_SCOPE, ADDRESS_UNREACHABLE, PORT_UNREACHABLE, SOURCE_ADDRESS_FAILED_INGRESS_POLICY, ROUTE_TO_DESTINATION_REJECTED, SOURCE_ROUTING_HEADER_ERROR};
                }

                static {
                    EnumC1242a[] enumC1242aArr$values = $values();
                    $VALUES = enumC1242aArr$values;
                    $ENTRIES = AbstractC5827b.a(enumC1242aArr$values);
                }

                private EnumC1242a(String str, int i10, byte b10, String str2) {
                    this.f39245id = b10;
                    this.message = str2;
                }

                public static InterfaceC5826a getEntries() {
                    return $ENTRIES;
                }

                public static EnumC1242a valueOf(String str) {
                    return (EnumC1242a) Enum.valueOf(EnumC1242a.class, str);
                }

                public static EnumC1242a[] values() {
                    return (EnumC1242a[]) $VALUES.clone();
                }

                /* renamed from: getId-w2LRezQ, reason: not valid java name */
                public final byte m12getIdw2LRezQ() {
                    return this.f39245id;
                }

                public final String getMessage() {
                    return this.message;
                }
            }

            public a(EnumC1242a enumC1242a) {
                super(null);
                this.f39243a = enumC1242a;
                this.f39244b = c.DESTINATION_UNREACHABLE;
            }

            public final EnumC1242a b() {
                return this.f39243a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f39243a == ((a) obj).f39243a;
            }

            public int hashCode() {
                EnumC1242a enumC1242a = this.f39243a;
                if (enumC1242a == null) {
                    return 0;
                }
                return enumC1242a.hashCode();
            }

            public String toString() {
                return "DestinationUnreachable(reason=" + this.f39243a + ')';
            }
        }

        /* renamed from: com.marsounjan.icmp4a.i$b$b, reason: collision with other inner class name */
        public static final class C1243b extends b {

            /* renamed from: a, reason: collision with root package name */
            private final short f39246a;

            /* renamed from: b, reason: collision with root package name */
            private final short f39247b;

            /* renamed from: c, reason: collision with root package name */
            private final c f39248c;

            public /* synthetic */ C1243b(short s10, short s11, DefaultConstructorMarker defaultConstructorMarker) {
                this(s10, s11);
            }

            public final short b() {
                return this.f39246a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1243b)) {
                    return false;
                }
                C1243b c1243b = (C1243b) obj;
                return this.f39246a == c1243b.f39246a && this.f39247b == c1243b.f39247b;
            }

            public int hashCode() {
                return (H.d(this.f39246a) * 31) + Short.hashCode(this.f39247b);
            }

            public String toString() {
                return "Echo(sequenceNumber=" + ((Object) H.g(this.f39246a)) + ", identifier=" + ((int) this.f39247b) + ')';
            }

            private C1243b(short s10, short s11) {
                super(null);
                this.f39246a = s10;
                this.f39247b = s11;
                this.f39248c = c.ECHO_REPLY;
            }
        }

        public static final class c extends b implements K5.a {

            /* renamed from: a, reason: collision with root package name */
            private final int f39249a;

            /* renamed from: b, reason: collision with root package name */
            private final c f39250b;

            public /* synthetic */ c(int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10);
            }

            public final int b() {
                return this.f39249a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f39249a == ((c) obj).f39249a;
            }

            public int hashCode() {
                return C.d(this.f39249a);
            }

            public String toString() {
                return "PacketTooBig(mtu=" + ((Object) C.g(this.f39249a)) + ')';
            }

            private c(int i10) {
                super(null);
                this.f39249a = i10;
                this.f39250b = c.PACKET_TOO_BIG;
            }
        }

        public static final class d extends b implements K5.a {

            /* renamed from: a, reason: collision with root package name */
            private final a f39251a;

            /* renamed from: b, reason: collision with root package name */
            private final int f39252b;

            /* renamed from: c, reason: collision with root package name */
            private final c f39253c;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class a {
                private static final /* synthetic */ InterfaceC5826a $ENTRIES;
                private static final /* synthetic */ a[] $VALUES;

                /* renamed from: id, reason: collision with root package name */
                private final byte f39254id;
                private final String message;
                public static final a ERRONEOUS_HEADER_FIELD = new a("ERRONEOUS_HEADER_FIELD", 0, (byte) 0, "Wrong header field");
                public static final a UNRECOGNIZED_NEXT_HEADER = new a("UNRECOGNIZED_NEXT_HEADER", 1, (byte) 1, "Unknown header");
                public static final a UNRECOGNIZED_IPV6_OPTION = new a("UNRECOGNIZED_IPV6_OPTION", 2, (byte) 2, "Unknown option");

                private static final /* synthetic */ a[] $values() {
                    return new a[]{ERRONEOUS_HEADER_FIELD, UNRECOGNIZED_NEXT_HEADER, UNRECOGNIZED_IPV6_OPTION};
                }

                static {
                    a[] aVarArr$values = $values();
                    $VALUES = aVarArr$values;
                    $ENTRIES = AbstractC5827b.a(aVarArr$values);
                }

                private a(String str, int i10, byte b10, String str2) {
                    this.f39254id = b10;
                    this.message = str2;
                }

                public static InterfaceC5826a getEntries() {
                    return $ENTRIES;
                }

                public static a valueOf(String str) {
                    return (a) Enum.valueOf(a.class, str);
                }

                public static a[] values() {
                    return (a[]) $VALUES.clone();
                }

                /* renamed from: getId-w2LRezQ, reason: not valid java name */
                public final byte m13getIdw2LRezQ() {
                    return this.f39254id;
                }

                public final String getMessage() {
                    return this.message;
                }
            }

            public /* synthetic */ d(a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(aVar, i10);
            }

            public final int b() {
                return this.f39252b;
            }

            public final a c() {
                return this.f39251a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.f39251a == dVar.f39251a && this.f39252b == dVar.f39252b;
            }

            public int hashCode() {
                a aVar = this.f39251a;
                return ((aVar == null ? 0 : aVar.hashCode()) * 31) + C.d(this.f39252b);
            }

            public String toString() {
                return "ParameterProblem(reason=" + this.f39251a + ", pointer=" + ((Object) C.g(this.f39252b)) + ')';
            }

            private d(a aVar, int i10) {
                super(null);
                this.f39251a = aVar;
                this.f39252b = i10;
                this.f39253c = c.PARAMETER_PROBLEM;
            }
        }

        public static final class e extends b implements K5.a {

            /* renamed from: a, reason: collision with root package name */
            private final a f39255a;

            /* renamed from: b, reason: collision with root package name */
            private final c f39256b;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class a {
                private static final /* synthetic */ InterfaceC5826a $ENTRIES;
                private static final /* synthetic */ a[] $VALUES;

                /* renamed from: id, reason: collision with root package name */
                private final byte f39257id;
                private final String message;
                public static final a HOP_LIMIT_EXCEEDED_IN_TRANSIT = new a("HOP_LIMIT_EXCEEDED_IN_TRANSIT", 0, (byte) 0, "Time exceeded: Hop limit");
                public static final a FRAGMENT_REASSEMBLY_TIME_EXCEEDED = new a("FRAGMENT_REASSEMBLY_TIME_EXCEEDED", 1, (byte) 1, "Time exceeded: Defragmentation failure");

                private static final /* synthetic */ a[] $values() {
                    return new a[]{HOP_LIMIT_EXCEEDED_IN_TRANSIT, FRAGMENT_REASSEMBLY_TIME_EXCEEDED};
                }

                static {
                    a[] aVarArr$values = $values();
                    $VALUES = aVarArr$values;
                    $ENTRIES = AbstractC5827b.a(aVarArr$values);
                }

                private a(String str, int i10, byte b10, String str2) {
                    this.f39257id = b10;
                    this.message = str2;
                }

                public static InterfaceC5826a getEntries() {
                    return $ENTRIES;
                }

                public static a valueOf(String str) {
                    return (a) Enum.valueOf(a.class, str);
                }

                public static a[] values() {
                    return (a[]) $VALUES.clone();
                }

                /* renamed from: getId-w2LRezQ, reason: not valid java name */
                public final byte m14getIdw2LRezQ() {
                    return this.f39257id;
                }

                public final String getMessage() {
                    return this.message;
                }
            }

            public e(a aVar) {
                super(null);
                this.f39255a = aVar;
                this.f39256b = c.TIME_EXCEEDED;
            }

            public final a b() {
                return this.f39255a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.f39255a == ((e) obj).f39255a;
            }

            public int hashCode() {
                a aVar = this.f39255a;
                if (aVar == null) {
                    return 0;
                }
                return aVar.hashCode();
            }

            public String toString() {
                return "TimeExceeded(reason=" + this.f39255a + ')';
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
        private final byte f39258id;
        public static final c DESTINATION_UNREACHABLE = new c("DESTINATION_UNREACHABLE", 0, (byte) 1);
        public static final c PACKET_TOO_BIG = new c("PACKET_TOO_BIG", 1, (byte) 2);
        public static final c TIME_EXCEEDED = new c("TIME_EXCEEDED", 2, (byte) 3);
        public static final c PARAMETER_PROBLEM = new c("PARAMETER_PROBLEM", 3, (byte) 4);
        public static final c ECHO = new c("ECHO", 4, (byte) -128);
        public static final c ECHO_REPLY = new c("ECHO_REPLY", 5, (byte) -127);

        private static final /* synthetic */ c[] $values() {
            return new c[]{DESTINATION_UNREACHABLE, PACKET_TOO_BIG, TIME_EXCEEDED, PARAMETER_PROBLEM, ECHO, ECHO_REPLY};
        }

        static {
            c[] cVarArr$values = $values();
            $VALUES = cVarArr$values;
            $ENTRIES = AbstractC5827b.a(cVarArr$values);
        }

        private c(String str, int i10, byte b10) {
            this.f39258id = b10;
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
        public final byte m15getIdw2LRezQ() {
            return this.f39258id;
        }
    }

    public /* synthetic */ i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract c a();

    private i() {
    }
}
