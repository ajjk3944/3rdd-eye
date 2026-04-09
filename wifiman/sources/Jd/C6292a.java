package jd;

import Cc.InterfaceC2557a;
import b8.AbstractC4074a;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import inet.ipaddr.g;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: jd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6292a {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4074a f50683a;

    /* renamed from: b, reason: collision with root package name */
    private final List f50684b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: jd.a$a, reason: collision with other inner class name */
    public static final class EnumC1869a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ EnumC1869a[] $VALUES;
        public static final EnumC1869a WIRED = new EnumC1869a("WIRED", 0);
        public static final EnumC1869a WIRELESS = new EnumC1869a("WIRELESS", 1);

        private static final /* synthetic */ EnumC1869a[] $values() {
            return new EnumC1869a[]{WIRED, WIRELESS};
        }

        static {
            EnumC1869a[] enumC1869aArr$values = $values();
            $VALUES = enumC1869aArr$values;
            $ENTRIES = AbstractC5827b.a(enumC1869aArr$values);
        }

        private EnumC1869a(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static EnumC1869a valueOf(String str) {
            return (EnumC1869a) Enum.valueOf(EnumC1869a.class, str);
        }

        public static EnumC1869a[] values() {
            return (EnumC1869a[]) $VALUES.clone();
        }
    }

    /* renamed from: jd.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final c f50685a;

        /* renamed from: b, reason: collision with root package name */
        private final g f50686b;

        /* renamed from: c, reason: collision with root package name */
        private final EnumC1869a f50687c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC2557a f50688d;

        /* renamed from: e, reason: collision with root package name */
        private final d f50689e;

        public b(c role, g gVar, EnumC1869a connection, InterfaceC2557a interfaceC2557a, d dVar) {
            AbstractC6492s.i(role, "role");
            AbstractC6492s.i(connection, "connection");
            this.f50685a = role;
            this.f50686b = gVar;
            this.f50687c = connection;
            this.f50688d = interfaceC2557a;
            this.f50689e = dVar;
        }

        public final EnumC1869a a() {
            return this.f50687c;
        }

        public final InterfaceC2557a b() {
            return this.f50688d;
        }

        public final g c() {
            return this.f50686b;
        }

        public final c d() {
            return this.f50685a;
        }

        public final d e() {
            return this.f50689e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f50685a == bVar.f50685a && AbstractC6492s.d(this.f50686b, bVar.f50686b) && this.f50687c == bVar.f50687c && AbstractC6492s.d(this.f50688d, bVar.f50688d) && AbstractC6492s.d(this.f50689e, bVar.f50689e);
        }

        public int hashCode() {
            int iHashCode = this.f50685a.hashCode() * 31;
            g gVar = this.f50686b;
            int iHashCode2 = (((iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31) + this.f50687c.hashCode()) * 31;
            InterfaceC2557a interfaceC2557a = this.f50688d;
            int iHashCode3 = (iHashCode2 + (interfaceC2557a == null ? 0 : interfaceC2557a.hashCode())) * 31;
            d dVar = this.f50689e;
            return iHashCode3 + (dVar != null ? dVar.hashCode() : 0);
        }

        public String toString() {
            return "Node(role=" + this.f50685a + ", ip=" + this.f50686b + ", connection=" + this.f50687c + ", device=" + this.f50688d + ", wifimanApi=" + this.f50689e + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: jd.a$c */
    public static final class c {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c GENERIC = new c("GENERIC", 0);
        public static final c GATEWAY = new c("GATEWAY", 1);
        public static final c AP = new c("AP", 2);
        public static final c MYSELF = new c("MYSELF", 3);

        private static final /* synthetic */ c[] $values() {
            return new c[]{GENERIC, GATEWAY, AP, MYSELF};
        }

        static {
            c[] cVarArr$values = $values();
            $VALUES = cVarArr$values;
            $ENTRIES = AbstractC5827b.a(cVarArr$values);
        }

        private c(String str, int i10) {
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
    }

    /* renamed from: jd.a$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f50690a;

        /* renamed from: b, reason: collision with root package name */
        private final String f50691b;

        /* renamed from: c, reason: collision with root package name */
        private final S8.g f50692c;

        /* renamed from: d, reason: collision with root package name */
        private final Integer f50693d;

        public d(String str, String str2, S8.g gVar, Integer num) {
            this.f50690a = str;
            this.f50691b = str2;
            this.f50692c = gVar;
            this.f50693d = num;
        }

        public final String a() {
            return this.f50690a;
        }

        public final String b() {
            return this.f50691b;
        }

        public final S8.g c() {
            return this.f50692c;
        }

        public final Integer d() {
            return this.f50693d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC6492s.d(this.f50690a, dVar.f50690a) && AbstractC6492s.d(this.f50691b, dVar.f50691b) && AbstractC6492s.d(this.f50692c, dVar.f50692c) && AbstractC6492s.d(this.f50693d, dVar.f50693d);
        }

        public int hashCode() {
            String str = this.f50690a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f50691b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            S8.g gVar = this.f50692c;
            int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
            Integer num = this.f50693d;
            return iHashCode3 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "WifimanApiInfo(name=" + this.f50690a + ", productImageUrl=" + this.f50691b + ", wifiExperience=" + this.f50692c + ", wirelessClientCount=" + this.f50693d + ")";
        }
    }

    public C6292a(AbstractC4074a connectionState, List chain) {
        AbstractC6492s.i(connectionState, "connectionState");
        AbstractC6492s.i(chain, "chain");
        this.f50683a = connectionState;
        this.f50684b = chain;
    }

    public final List a() {
        return this.f50684b;
    }

    public final AbstractC4074a b() {
        return this.f50683a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6292a)) {
            return false;
        }
        C6292a c6292a = (C6292a) obj;
        return AbstractC6492s.d(this.f50683a, c6292a.f50683a) && AbstractC6492s.d(this.f50684b, c6292a.f50684b);
    }

    public int hashCode() {
        return (this.f50683a.hashCode() * 31) + this.f50684b.hashCode();
    }

    public String toString() {
        return "NetworkTopology(connectionState=" + this.f50683a + ", chain=" + this.f50684b + ")";
    }
}
