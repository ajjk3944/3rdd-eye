package Vd;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import h9.C5969a;
import inet.ipaddr.g;
import kotlin.jvm.internal.AbstractC6492s;
import xa.InterfaceC8439a;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f23359a;

    /* renamed from: b, reason: collision with root package name */
    private final C5969a f23360b;

    /* renamed from: c, reason: collision with root package name */
    private final g f23361c;

    /* renamed from: d, reason: collision with root package name */
    private final String f23362d;

    /* renamed from: e, reason: collision with root package name */
    private final String f23363e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC8439a.d f23364f;

    /* renamed from: g, reason: collision with root package name */
    private final EnumC0868a f23365g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: Vd.a$a, reason: collision with other inner class name */
    public static final class EnumC0868a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ EnumC0868a[] $VALUES;
        public static final EnumC0868a DISCONNECTED = new EnumC0868a("DISCONNECTED", 0);
        public static final EnumC0868a CONNECTED = new EnumC0868a("CONNECTED", 1);
        public static final EnumC0868a PENDING = new EnumC0868a("PENDING", 2);
        public static final EnumC0868a FIRMWARE_MISMATCH = new EnumC0868a("FIRMWARE_MISMATCH", 3);
        public static final EnumC0868a UPGRADING = new EnumC0868a("UPGRADING", 4);
        public static final EnumC0868a PROVISIONING = new EnumC0868a("PROVISIONING", 5);
        public static final EnumC0868a HEARTBEAT_MISSED = new EnumC0868a("HEARTBEAT_MISSED", 6);
        public static final EnumC0868a ADOPTING = new EnumC0868a("ADOPTING", 7);
        public static final EnumC0868a DELETING = new EnumC0868a("DELETING", 8);
        public static final EnumC0868a INFORM_ERROR = new EnumC0868a("INFORM_ERROR", 9);
        public static final EnumC0868a ADOPTION_FAILED = new EnumC0868a("ADOPTION_FAILED", 10);
        public static final EnumC0868a ISOLATED = new EnumC0868a("ISOLATED", 11);
        public static final EnumC0868a REMOVED = new EnumC0868a("REMOVED", 12);
        public static final EnumC0868a UNKNOWN = new EnumC0868a("UNKNOWN", 13);

        private static final /* synthetic */ EnumC0868a[] $values() {
            return new EnumC0868a[]{DISCONNECTED, CONNECTED, PENDING, FIRMWARE_MISMATCH, UPGRADING, PROVISIONING, HEARTBEAT_MISSED, ADOPTING, DELETING, INFORM_ERROR, ADOPTION_FAILED, ISOLATED, REMOVED, UNKNOWN};
        }

        static {
            EnumC0868a[] enumC0868aArr$values = $values();
            $VALUES = enumC0868aArr$values;
            $ENTRIES = AbstractC5827b.a(enumC0868aArr$values);
        }

        private EnumC0868a(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static EnumC0868a valueOf(String str) {
            return (EnumC0868a) Enum.valueOf(EnumC0868a.class, str);
        }

        public static EnumC0868a[] values() {
            return (EnumC0868a[]) $VALUES.clone();
        }
    }

    public a(String id2, C5969a c5969a, g gVar, String str, String str2, InterfaceC8439a.d dVar, EnumC0868a state) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(state, "state");
        this.f23359a = id2;
        this.f23360b = c5969a;
        this.f23361c = gVar;
        this.f23362d = str;
        this.f23363e = str2;
        this.f23364f = dVar;
        this.f23365g = state;
    }

    public final C5969a a() {
        return this.f23360b;
    }

    public final InterfaceC8439a.d b() {
        return this.f23364f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC6492s.d(this.f23359a, aVar.f23359a) && AbstractC6492s.d(this.f23360b, aVar.f23360b) && AbstractC6492s.d(this.f23361c, aVar.f23361c) && AbstractC6492s.d(this.f23362d, aVar.f23362d) && AbstractC6492s.d(this.f23363e, aVar.f23363e) && AbstractC6492s.d(this.f23364f, aVar.f23364f) && this.f23365g == aVar.f23365g;
    }

    public int hashCode() {
        int iHashCode = this.f23359a.hashCode() * 31;
        C5969a c5969a = this.f23360b;
        int iHashCode2 = (iHashCode + (c5969a == null ? 0 : c5969a.hashCode())) * 31;
        g gVar = this.f23361c;
        int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        String str = this.f23362d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f23363e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        InterfaceC8439a.d dVar = this.f23364f;
        return ((iHashCode5 + (dVar != null ? dVar.hashCode() : 0)) * 31) + this.f23365g.hashCode();
    }

    public String toString() {
        return "UnifiConsoleDevice(id=" + this.f23359a + ", mac=" + this.f23360b + ", ip=" + this.f23361c + ", name=" + this.f23362d + ", model=" + this.f23363e + ", product=" + this.f23364f + ", state=" + this.f23365g + ")";
    }
}
