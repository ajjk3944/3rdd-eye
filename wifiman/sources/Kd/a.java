package Kd;

import com.ubnt.teleport.TeleportTunnel;
import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import com.ui.wifiman.model.ubiquiti.cloud.sso.b;
import com.ui.wifiman.model.ubiquiti.console.e;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import xa.InterfaceC8439a;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f10638a;

    /* renamed from: b, reason: collision with root package name */
    private final TeleportCloud.e.b f10639b;

    /* renamed from: c, reason: collision with root package name */
    private final UUID f10640c;

    /* renamed from: d, reason: collision with root package name */
    private final C0428a f10641d;

    /* renamed from: Kd.a$a, reason: collision with other inner class name */
    public static final class C0428a {

        /* renamed from: a, reason: collision with root package name */
        private final String f10642a;

        /* renamed from: b, reason: collision with root package name */
        private final String f10643b;

        /* renamed from: c, reason: collision with root package name */
        private final String f10644c;

        /* renamed from: d, reason: collision with root package name */
        private final String f10645d;

        /* renamed from: e, reason: collision with root package name */
        private final InterfaceC8439a.d f10646e;

        /* renamed from: f, reason: collision with root package name */
        private final String f10647f;

        /* renamed from: g, reason: collision with root package name */
        private final Integer f10648g;

        /* renamed from: h, reason: collision with root package name */
        private final TeleportCloud.b.a f10649h;

        /* renamed from: i, reason: collision with root package name */
        private final String f10650i;

        public /* synthetic */ C0428a(String str, String str2, String str3, String str4, InterfaceC8439a.d dVar, String str5, Integer num, TeleportCloud.b.a aVar, String str6, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, dVar, str5, num, aVar, str6);
        }

        public final boolean a() {
            try {
                UUID.fromString(this.f10642a);
                return true;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        public final String b() {
            return this.f10642a;
        }

        public final Integer c() {
            return this.f10648g;
        }

        public final String d() {
            return this.f10647f;
        }

        public final TeleportCloud.b.a e() {
            return this.f10649h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0428a)) {
                return false;
            }
            C0428a c0428a = (C0428a) obj;
            return e.b.h(this.f10642a, c0428a.f10642a) && AbstractC6492s.d(this.f10643b, c0428a.f10643b) && AbstractC6492s.d(this.f10644c, c0428a.f10644c) && AbstractC6492s.d(this.f10645d, c0428a.f10645d) && AbstractC6492s.d(this.f10646e, c0428a.f10646e) && AbstractC6492s.d(this.f10647f, c0428a.f10647f) && AbstractC6492s.d(this.f10648g, c0428a.f10648g) && AbstractC6492s.d(this.f10649h, c0428a.f10649h) && AbstractC6492s.d(this.f10650i, c0428a.f10650i);
        }

        public final String f() {
            return this.f10650i;
        }

        public final String g() {
            return this.f10643b;
        }

        public final String h() {
            return this.f10644c;
        }

        public int hashCode() {
            int iJ = ((e.b.j(this.f10642a) * 31) + this.f10643b.hashCode()) * 31;
            String str = this.f10644c;
            int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f10645d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            InterfaceC8439a.d dVar = this.f10646e;
            int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            String str3 = this.f10647f;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.f10648g;
            int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            TeleportCloud.b.a aVar = this.f10649h;
            int iHashCode6 = (iHashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str4 = this.f10650i;
            return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
        }

        public final InterfaceC8439a.d i() {
            return this.f10646e;
        }

        public final String j() {
            return this.f10645d;
        }

        public String toString() {
            return "Console(id=" + e.b.l(this.f10642a) + ", name=" + this.f10643b + ", networkName=" + this.f10644c + ", wanIP=" + this.f10645d + ", product=" + this.f10646e + ", imageResourceId=" + this.f10647f + ", imageResourceEngineId=" + this.f10648g + ", location=" + this.f10649h + ", locationText=" + this.f10650i + ")";
        }

        private C0428a(String id2, String name, String str, String str2, InterfaceC8439a.d dVar, String str3, Integer num, TeleportCloud.b.a aVar, String str4) {
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(name, "name");
            this.f10642a = id2;
            this.f10643b = name;
            this.f10644c = str;
            this.f10645d = str2;
            this.f10646e = dVar;
            this.f10647f = str3;
            this.f10648g = num;
            this.f10649h = aVar;
            this.f10650i = str4;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b API = new b("API", 0);
        public static final b INVITATION_LINK = new b("INVITATION_LINK", 1);

        private static final /* synthetic */ b[] $values() {
            return new b[]{API, INVITATION_LINK};
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

    public /* synthetic */ a(String str, TeleportCloud.e.b bVar, UUID uuid, C0428a c0428a, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bVar, uuid, c0428a);
    }

    public static /* synthetic */ a b(a aVar, String str, TeleportCloud.e.b bVar, UUID uuid, C0428a c0428a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aVar.f10638a;
        }
        if ((i10 & 2) != 0) {
            bVar = aVar.f10639b;
        }
        if ((i10 & 4) != 0) {
            uuid = aVar.f10640c;
        }
        if ((i10 & 8) != 0) {
            c0428a = aVar.f10641d;
        }
        return aVar.a(str, bVar, uuid, c0428a);
    }

    public final a a(String tunnelId, TeleportCloud.e.b bVar, UUID uuid, C0428a console) {
        AbstractC6492s.i(tunnelId, "tunnelId");
        AbstractC6492s.i(console, "console");
        return new a(tunnelId, bVar, uuid, console, null);
    }

    public final C0428a c() {
        return this.f10641d;
    }

    public final b d() {
        return this.f10639b != null ? b.INVITATION_LINK : b.API;
    }

    public final TeleportCloud.e.b e() {
        return this.f10639b;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof Kd.a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Kd.a r5 = (Kd.a) r5
            java.lang.String r1 = r4.f10638a
            java.lang.String r3 = r5.f10638a
            boolean r1 = com.ubnt.teleport.TeleportTunnel.d.d(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            com.ubnt.teleport.unifi.cloud.TeleportCloud$e$b r1 = r4.f10639b
            com.ubnt.teleport.unifi.cloud.TeleportCloud$e$b r3 = r5.f10639b
            boolean r1 = kotlin.jvm.internal.AbstractC6492s.d(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.util.UUID r1 = r4.f10640c
            java.util.UUID r3 = r5.f10640c
            if (r1 != 0) goto L2e
            if (r3 != 0) goto L2c
            r1 = r0
            goto L35
        L2c:
            r1 = r2
            goto L35
        L2e:
            if (r3 != 0) goto L31
            goto L2c
        L31:
            boolean r1 = com.ui.wifiman.model.ubiquiti.cloud.sso.b.a.d(r1, r3)
        L35:
            if (r1 != 0) goto L38
            return r2
        L38:
            Kd.a$a r1 = r4.f10641d
            Kd.a$a r5 = r5.f10641d
            boolean r5 = kotlin.jvm.internal.AbstractC6492s.d(r1, r5)
            if (r5 != 0) goto L43
            return r2
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Kd.a.equals(java.lang.Object):boolean");
    }

    public final UUID f() {
        return this.f10640c;
    }

    public final String g() {
        return this.f10638a;
    }

    public int hashCode() {
        int iE = TeleportTunnel.d.e(this.f10638a) * 31;
        TeleportCloud.e.b bVar = this.f10639b;
        int iHashCode = (iE + (bVar == null ? 0 : bVar.hashCode())) * 31;
        UUID uuid = this.f10640c;
        return ((iHashCode + (uuid != null ? b.a.e(uuid) : 0)) * 31) + this.f10641d.hashCode();
    }

    public String toString() {
        String strF = TeleportTunnel.d.f(this.f10638a);
        TeleportCloud.e.b bVar = this.f10639b;
        UUID uuid = this.f10640c;
        return "TeleportTunnelRecord(tunnelId=" + strF + ", publicSecret=" + bVar + ", ssoAccountId=" + (uuid == null ? "null" : b.a.f(uuid)) + ", console=" + this.f10641d + ")";
    }

    private a(String tunnelId, TeleportCloud.e.b bVar, UUID uuid, C0428a console) {
        AbstractC6492s.i(tunnelId, "tunnelId");
        AbstractC6492s.i(console, "console");
        this.f10638a = tunnelId;
        this.f10639b = bVar;
        this.f10640c = uuid;
        this.f10641d = console;
    }
}
