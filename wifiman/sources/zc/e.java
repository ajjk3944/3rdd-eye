package Zc;

import b8.EnumC4076c;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import h9.C5969a;
import inet.ipaddr.g;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final b f25272a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC4076c f25273b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25274c;

    /* renamed from: d, reason: collision with root package name */
    private final C5969a f25275d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f25276e;

    /* renamed from: f, reason: collision with root package name */
    private final List f25277f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f25278g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f25279h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final inet.ipaddr.g f25280a;

        /* renamed from: b, reason: collision with root package name */
        private final int f25281b;

        /* renamed from: c, reason: collision with root package name */
        private final inet.ipaddr.g f25282c;

        public a(inet.ipaddr.g ip, int i10, inet.ipaddr.g gVar) {
            AbstractC6492s.i(ip, "ip");
            this.f25280a = ip;
            this.f25281b = i10;
            this.f25282c = gVar;
        }

        public final inet.ipaddr.g a() {
            return this.f25282c;
        }

        public final inet.ipaddr.g b() {
            return this.f25280a;
        }

        public final int c() {
            return this.f25281b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f25280a, aVar.f25280a) && this.f25281b == aVar.f25281b && AbstractC6492s.d(this.f25282c, aVar.f25282c);
        }

        public int hashCode() {
            int iHashCode = ((this.f25280a.hashCode() * 31) + Integer.hashCode(this.f25281b)) * 31;
            inet.ipaddr.g gVar = this.f25282c;
            return iHashCode + (gVar == null ? 0 : gVar.hashCode());
        }

        public String toString() {
            return "InterfaceAddress(ip=" + this.f25280a + ", mask=" + this.f25281b + ", gateway=" + this.f25282c + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b DISCONNECTED = new b("DISCONNECTED", 0);
        public static final b CONNECTING = new b("CONNECTING", 1);
        public static final b AUTHENTICATING = new b("AUTHENTICATING", 2);
        public static final b OBTAINING_IP = new b("OBTAINING_IP", 3);
        public static final b CONNECTED = new b("CONNECTED", 4);

        private static final /* synthetic */ b[] $values() {
            return new b[]{DISCONNECTED, CONNECTING, AUTHENTICATING, OBTAINING_IP, CONNECTED};
        }

        static {
            b[] bVarArr$values = $values();
            $VALUES = bVarArr$values;
            $ENTRIES = AbstractC5827b.a(bVarArr$values);
        }

        private b(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public e(b state, EnumC4076c type, String str, C5969a c5969a, Map addresses, List dns, boolean z10, boolean z11) {
        AbstractC6492s.i(state, "state");
        AbstractC6492s.i(type, "type");
        AbstractC6492s.i(addresses, "addresses");
        AbstractC6492s.i(dns, "dns");
        this.f25272a = state;
        this.f25273b = type;
        this.f25274c = str;
        this.f25275d = c5969a;
        this.f25276e = addresses;
        this.f25277f = dns;
        this.f25278g = z10;
        this.f25279h = z11;
    }

    public final List a() {
        return this.f25277f;
    }

    public final a b() {
        return (a) this.f25276e.get(g.a.IPV4);
    }

    public final a c() {
        return (a) this.f25276e.get(g.a.IPV6);
    }

    public final boolean d() {
        return this.f25279h;
    }

    public final C5969a e() {
        return this.f25275d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f25272a == eVar.f25272a && this.f25273b == eVar.f25273b && AbstractC6492s.d(this.f25274c, eVar.f25274c) && AbstractC6492s.d(this.f25275d, eVar.f25275d) && AbstractC6492s.d(this.f25276e, eVar.f25276e) && AbstractC6492s.d(this.f25277f, eVar.f25277f) && this.f25278g == eVar.f25278g && this.f25279h == eVar.f25279h;
    }

    public final b f() {
        return this.f25272a;
    }

    public final EnumC4076c g() {
        return this.f25273b;
    }

    public final boolean h() {
        return this.f25278g;
    }

    public int hashCode() {
        int iHashCode = ((this.f25272a.hashCode() * 31) + this.f25273b.hashCode()) * 31;
        String str = this.f25274c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C5969a c5969a = this.f25275d;
        return ((((((((iHashCode2 + (c5969a != null ? c5969a.hashCode() : 0)) * 31) + this.f25276e.hashCode()) * 31) + this.f25277f.hashCode()) * 31) + Boolean.hashCode(this.f25278g)) * 31) + Boolean.hashCode(this.f25279h);
    }

    public String toString() {
        return "NetworkConnection(state=" + this.f25272a + ", type=" + this.f25273b + ", networkInterfaceName=" + this.f25274c + ", networkInterfaceMac=" + this.f25275d + ", addresses=" + this.f25276e + ", dns=" + this.f25277f + ", vpnConnected=" + this.f25278g + ", metered=" + this.f25279h + ")";
    }
}
