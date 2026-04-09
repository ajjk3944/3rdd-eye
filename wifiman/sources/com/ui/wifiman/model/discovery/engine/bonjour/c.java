package com.ui.wifiman.model.discovery.engine.bonjour;

import Cc.AbstractC2558b;
import Zg.AbstractC3689v;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: g, reason: collision with root package name */
    public static final h f42633g = new h(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f42634a;

    /* renamed from: b, reason: collision with root package name */
    private final String f42635b;

    /* renamed from: c, reason: collision with root package name */
    private final String f42636c;

    /* renamed from: d, reason: collision with root package name */
    private final String f42637d;

    /* renamed from: e, reason: collision with root package name */
    private final String f42638e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC2558b f42639f;

    public static final class a extends c {

        /* renamed from: h, reason: collision with root package name */
        private final String f42640h;

        /* renamed from: i, reason: collision with root package name */
        private final String f42641i;

        /* renamed from: j, reason: collision with root package name */
        private final boolean f42642j;

        /* renamed from: k, reason: collision with root package name */
        private final AbstractC2558b f42643k;

        /* renamed from: l, reason: collision with root package name */
        private final String f42644l;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        public a(String str, String str2) {
            com.ui.wifiman.model.vendor.d dVarA;
            String name = 0;
            name = 0;
            super(name);
            this.f42640h = str;
            this.f42641i = str2;
            this.f42642j = true;
            String strD = d();
            this.f42643k = strD != null ? c.f42633g.b(strD) : null;
            AbstractC2558b abstractC2558bA = a();
            if (abstractC2558bA != null && (dVarA = abstractC2558bA.a()) != null) {
                name = dVarA.getName();
            }
            this.f42644l = name;
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c
        public AbstractC2558b a() {
            return this.f42643k;
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c
        public boolean b() {
            return this.f42642j;
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c
        public String c() {
            return this.f42641i;
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c
        public String d() {
            return this.f42640h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f42640h, aVar.f42640h) && AbstractC6492s.d(this.f42641i, aVar.f42641i);
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c
        public String f() {
            return this.f42644l;
        }

        public int hashCode() {
            String str = this.f42640h;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f42641i;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "AppleAirplay(model=" + this.f42640h + ", mac=" + this.f42641i + ")";
        }
    }

    private static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        private final String f42645a = "_airplay._tcp";

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(Map txt) {
            AbstractC6492s.i(txt, "txt");
            return new a((String) txt.get("model"), (String) txt.get("deviceid"));
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c.n
        public String getId() {
            return this.f42645a;
        }
    }

    /* renamed from: com.ui.wifiman.model.discovery.engine.bonjour.c$c, reason: collision with other inner class name */
    public static final class C1398c extends c {

        /* renamed from: h, reason: collision with root package name */
        public static final C1398c f42646h = new C1398c();

        /* renamed from: i, reason: collision with root package name */
        private static final boolean f42647i = true;

        private C1398c() {
            super(null);
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c
        public boolean b() {
            return f42647i;
        }
    }

    private static final class d implements n {

        /* renamed from: a, reason: collision with root package name */
        private final String f42648a = "_companion-link._tcp";

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1398c a(Map txt) {
            AbstractC6492s.i(txt, "txt");
            return C1398c.f42646h;
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c.n
        public String getId() {
            return this.f42648a;
        }
    }

    public static final class e extends c {

        /* renamed from: h, reason: collision with root package name */
        private final String f42649h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f42650i;

        /* renamed from: j, reason: collision with root package name */
        private final AbstractC2558b f42651j;

        /* renamed from: k, reason: collision with root package name */
        private final String f42652k;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        public e(String str) {
            com.ui.wifiman.model.vendor.d dVarA;
            String name = 0;
            name = 0;
            super(name);
            this.f42649h = str;
            String strD = d();
            this.f42651j = strD != null ? c.f42633g.b(strD) : null;
            AbstractC2558b abstractC2558bA = a();
            if (abstractC2558bA != null && (dVarA = abstractC2558bA.a()) != null) {
                name = dVarA.getName();
            }
            this.f42652k = name;
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c
        public AbstractC2558b a() {
            return this.f42651j;
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c
        public boolean b() {
            return this.f42650i;
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c
        public String d() {
            return this.f42649h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && AbstractC6492s.d(this.f42649h, ((e) obj).f42649h);
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c
        public String f() {
            return this.f42652k;
        }

        public int hashCode() {
            String str = this.f42649h;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "AppleRaop(model=" + this.f42649h + ")";
        }
    }

    private static final class f implements n {

        /* renamed from: a, reason: collision with root package name */
        private final String f42653a = "_raop._tcp";

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a(Map txt) {
            AbstractC6492s.i(txt, "txt");
            return new e((String) txt.get("am"));
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c.n
        public String getId() {
            return this.f42653a;
        }
    }

    public interface g {

        /* renamed from: a, reason: collision with root package name */
        public static final a f42654a = a.f42655a;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f42655a = new a();

            private a() {
            }

            public final n a() {
                return new i();
            }

            public final List b() {
                return AbstractC3689v.o(new p.a(), new p.b(), new p.C1399c(), new r(), new m(), new b(), new f(), new d(), new k());
            }
        }

        c a(String str, Map map);
    }

    public static final class h {
        public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AbstractC2558b b(String str) {
            if (AbstractC6492s.d(str, "Mac14,2") || AbstractC6492s.d(str, "Mac14,7")) {
                return AbstractC2558b.AbstractC0120b.C0121b.f2484c;
            }
            if (AbstractC6492s.d(str, "Mac13,1")) {
                return AbstractC2558b.AbstractC0120b.a.f2483c;
            }
            if (t.P(str, "Macmini", false, 2, null) || t.P(str, "iMac", false, 2, null) || t.P(str, "MacPro", false, 2, null)) {
                return AbstractC2558b.AbstractC0120b.a.f2483c;
            }
            if (!t.P(str, "MacBook", false, 2, null) && !t.P(str, "MacBookPro", false, 2, null)) {
                return null;
            }
            return AbstractC2558b.AbstractC0120b.C0121b.f2484c;
        }

        private h() {
        }
    }

    private static final class i implements n {

        /* renamed from: a, reason: collision with root package name */
        private final String f42656a = "";

        /* renamed from: b, reason: collision with root package name */
        private final boolean f42657b = true;

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public s a(Map txt) {
            AbstractC6492s.i(txt, "txt");
            String str = (String) txt.get("Model");
            if (str == null && (str = (String) txt.get("model")) == null && (str = (String) txt.get("Product")) == null && (str = (String) txt.get("product")) == null && (str = (String) txt.get("ty")) == null && (str = (String) txt.get("usb_MDL")) == null && (str = (String) txt.get("MDL")) == null && (str = (String) txt.get("DeviceModel")) == null) {
                str = (String) txt.get("ProdName");
            }
            String str2 = str;
            String str3 = (String) txt.get("fw_version");
            if (str3 == null && (str3 = (String) txt.get("sw_version")) == null && (str3 = (String) txt.get("FW_VERSION")) == null && (str3 = (String) txt.get("version")) == null && (str3 = (String) txt.get("Version")) == null && (str3 = (String) txt.get("DeviceSystemVersion")) == null) {
                str3 = (String) txt.get("fwver");
            }
            String str4 = str3;
            String str5 = (String) txt.get("MAC");
            if (str5 == null && (str5 = (String) txt.get("mac")) == null && (str5 = (String) txt.get("Mac")) == null && (str5 = (String) txt.get("MAC Address")) == null) {
                str5 = (String) txt.get("macaddress");
            }
            String str6 = str5;
            String str7 = (String) txt.get("vendor");
            if (str7 == null) {
                str7 = (String) txt.get("manufacturer");
            }
            String str8 = str7;
            String str9 = (String) txt.get("name");
            return new s((str9 == null && (str9 = (String) txt.get("Name")) == null) ? (String) txt.get("displayName") : str9, str2, str4, str6, str8);
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c.n
        public String getId() {
            return this.f42656a;
        }
    }

    public static final class j extends c {

        /* renamed from: h, reason: collision with root package name */
        private final String f42658h;

        /* renamed from: i, reason: collision with root package name */
        private final String f42659i;

        /* renamed from: j, reason: collision with root package name */
        private final String f42660j;

        /* renamed from: k, reason: collision with root package name */
        private final boolean f42661k;

        /* renamed from: l, reason: collision with root package name */
        private final AbstractC2558b f42662l;

        public j(String str, String str2, String str3) {
            super(null);
            this.f42658h = str;
            this.f42659i = str2;
            this.f42660j = str3;
            this.f42662l = AbstractC2558b.f.f2492b;
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c
        public AbstractC2558b a() {
            return this.f42662l;
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c
        public boolean b() {
            return this.f42661k;
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c
        public String c() {
            return this.f42659i;
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c
        public String d() {
            return this.f42658h;
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c
        public String e() {
            return this.f42660j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return AbstractC6492s.d(this.f42658h, jVar.f42658h) && AbstractC6492s.d(this.f42659i, jVar.f42659i) && AbstractC6492s.d(this.f42660j, jVar.f42660j);
        }

        public int hashCode() {
            String str = this.f42658h;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f42659i;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f42660j;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "GoogleCast(model=" + this.f42658h + ", mac=" + this.f42659i + ", name=" + this.f42660j + ")";
        }
    }

    private static final class k implements n {

        /* renamed from: a, reason: collision with root package name */
        private final String f42663a = "_googlecast._tcp";

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(Map txt) {
            AbstractC6492s.i(txt, "txt");
            return new j((String) txt.get("md"), (String) txt.get("bs"), (String) txt.get("fn"));
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c.n
        public String getId() {
            return this.f42663a;
        }
    }

    public static final class l extends c {

        /* renamed from: h, reason: collision with root package name */
        private final String f42664h;

        /* renamed from: i, reason: collision with root package name */
        private final String f42665i;

        /* renamed from: j, reason: collision with root package name */
        private final String f42666j;

        /* renamed from: k, reason: collision with root package name */
        private final String f42667k;

        /* renamed from: l, reason: collision with root package name */
        private final String f42668l;

        /* renamed from: m, reason: collision with root package name */
        private final String f42669m;

        /* renamed from: n, reason: collision with root package name */
        private final boolean f42670n;

        /* renamed from: o, reason: collision with root package name */
        private final AbstractC2558b.e.C0122b f42671o;

        public l(String str, String str2, String str3, String str4, String str5, String str6) {
            super(null);
            this.f42664h = str;
            this.f42665i = str2;
            this.f42666j = str3;
            this.f42667k = str4;
            this.f42668l = str5;
            this.f42669m = str6;
            this.f42671o = AbstractC2558b.e.C0122b.f2491b;
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c
        public boolean b() {
            return this.f42670n;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return AbstractC6492s.d(this.f42664h, lVar.f42664h) && AbstractC6492s.d(this.f42665i, lVar.f42665i) && AbstractC6492s.d(this.f42666j, lVar.f42666j) && AbstractC6492s.d(this.f42667k, lVar.f42667k) && AbstractC6492s.d(this.f42668l, lVar.f42668l) && AbstractC6492s.d(this.f42669m, lVar.f42669m);
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c
        public String g() {
            return this.f42664h;
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public AbstractC2558b.e.C0122b a() {
            return this.f42671o;
        }

        public int hashCode() {
            String str = this.f42664h;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f42665i;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f42666j;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f42667k;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f42668l;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f42669m;
            return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        public String toString() {
            return "Hassio(version=" + this.f42664h + ", locationName=" + this.f42665i + ", uuid=" + this.f42666j + ", urlExternal=" + this.f42667k + ", urlInternal=" + this.f42668l + ", urlBase=" + this.f42669m + ")";
        }
    }

    private static final class m implements n {

        /* renamed from: a, reason: collision with root package name */
        private final String f42672a = "_home-assistant._tcp";

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l a(Map txt) {
            AbstractC6492s.i(txt, "txt");
            return new l((String) txt.get("version"), (String) txt.get("location_name"), (String) txt.get("uuid"), (String) txt.get("external_url"), (String) txt.get("internal_url"), (String) txt.get("base_url"));
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c.n
        public String getId() {
            return this.f42672a;
        }
    }

    public interface n {
        c a(Map map);

        String getId();
    }

    public static final class o extends c {

        /* renamed from: h, reason: collision with root package name */
        private final String f42673h;

        /* renamed from: i, reason: collision with root package name */
        private final String f42674i;

        /* renamed from: j, reason: collision with root package name */
        private final String f42675j;

        /* renamed from: k, reason: collision with root package name */
        private final String f42676k;

        /* renamed from: l, reason: collision with root package name */
        private final String f42677l;

        /* renamed from: m, reason: collision with root package name */
        private final boolean f42678m;

        /* renamed from: n, reason: collision with root package name */
        private final AbstractC2558b.j f42679n;

        public o(String str, String str2, String str3, String str4) {
            super(null);
            this.f42673h = str;
            this.f42674i = str2;
            this.f42675j = str3;
            this.f42676k = str4;
            this.f42677l = str2 == null ? str3 : str2;
            this.f42679n = AbstractC2558b.j.f2499b;
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c
        public boolean b() {
            return this.f42678m;
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c
        public String d() {
            return this.f42677l;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return AbstractC6492s.d(this.f42673h, oVar.f42673h) && AbstractC6492s.d(this.f42674i, oVar.f42674i) && AbstractC6492s.d(this.f42675j, oVar.f42675j) && AbstractC6492s.d(this.f42676k, oVar.f42676k);
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c
        public String f() {
            return this.f42676k;
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public AbstractC2558b.j a() {
            return this.f42679n;
        }

        public int hashCode() {
            String str = this.f42673h;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f42674i;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f42675j;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f42676k;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "Printer(webInterfaceUrl=" + this.f42673h + ", modelLong=" + this.f42674i + ", modelShort=" + this.f42675j + ", vendor=" + this.f42676k + ")";
        }
    }

    private static abstract class p implements n {

        public static final class a extends p {

            /* renamed from: a, reason: collision with root package name */
            private final String f42680a;

            public a() {
                super(null);
                this.f42680a = "_printer._tcp";
            }

            @Override // com.ui.wifiman.model.discovery.engine.bonjour.c.n
            public String getId() {
                return this.f42680a;
            }
        }

        public static final class b extends p {

            /* renamed from: a, reason: collision with root package name */
            private final String f42681a;

            public b() {
                super(null);
                this.f42681a = "_ipp._tcp";
            }

            @Override // com.ui.wifiman.model.discovery.engine.bonjour.c.n
            public String getId() {
                return this.f42681a;
            }
        }

        /* renamed from: com.ui.wifiman.model.discovery.engine.bonjour.c$p$c, reason: collision with other inner class name */
        public static final class C1399c extends p {

            /* renamed from: a, reason: collision with root package name */
            private final String f42682a;

            public C1399c() {
                super(null);
                this.f42682a = "_pdl-datastream._tcp";
            }

            @Override // com.ui.wifiman.model.discovery.engine.bonjour.c.n
            public String getId() {
                return this.f42682a;
            }
        }

        public /* synthetic */ p(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o a(Map txt) {
            AbstractC6492s.i(txt, "txt");
            return new o((String) txt.get("adminurl"), (String) txt.get("ty"), (String) txt.get("usb_MDL"), (String) txt.get("usb_MFG"));
        }

        private p() {
        }
    }

    public static final class q extends c {

        /* renamed from: h, reason: collision with root package name */
        private final String f42683h;

        /* renamed from: i, reason: collision with root package name */
        private final String f42684i;

        /* renamed from: j, reason: collision with root package name */
        private final String f42685j;

        /* renamed from: k, reason: collision with root package name */
        private final String f42686k;

        /* renamed from: l, reason: collision with root package name */
        private final boolean f42687l;

        /* renamed from: m, reason: collision with root package name */
        private final AbstractC2558b.k f42688m;

        public q(String str, String str2, String str3) {
            super(null);
            this.f42683h = str;
            this.f42684i = str2;
            this.f42685j = str3;
            this.f42686k = str == null ? str2 : str;
            this.f42688m = AbstractC2558b.k.f2500b;
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c
        public boolean b() {
            return this.f42687l;
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c
        public String d() {
            return this.f42686k;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return AbstractC6492s.d(this.f42683h, qVar.f42683h) && AbstractC6492s.d(this.f42684i, qVar.f42684i) && AbstractC6492s.d(this.f42685j, qVar.f42685j);
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c
        public String f() {
            return this.f42685j;
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public AbstractC2558b.k a() {
            return this.f42688m;
        }

        public int hashCode() {
            String str = this.f42683h;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f42684i;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f42685j;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "Scanner(modelLong=" + this.f42683h + ", modelShort=" + this.f42684i + ", vendor=" + this.f42685j + ")";
        }
    }

    private static final class r implements n {

        /* renamed from: a, reason: collision with root package name */
        private final String f42689a = "_scanner._tcp";

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q a(Map txt) {
            AbstractC6492s.i(txt, "txt");
            return new q((String) txt.get("ty"), (String) txt.get("usb_MDL"), (String) txt.get("usb_MFG"));
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c.n
        public String getId() {
            return this.f42689a;
        }
    }

    public static final class s extends c {

        /* renamed from: h, reason: collision with root package name */
        private final String f42690h;

        /* renamed from: i, reason: collision with root package name */
        private final String f42691i;

        /* renamed from: j, reason: collision with root package name */
        private final String f42692j;

        /* renamed from: k, reason: collision with root package name */
        private final String f42693k;

        /* renamed from: l, reason: collision with root package name */
        private final String f42694l;

        /* renamed from: m, reason: collision with root package name */
        private final boolean f42695m;

        public s(String str, String str2, String str3, String str4, String str5) {
            super(null);
            this.f42690h = str;
            this.f42691i = str2;
            this.f42692j = str3;
            this.f42693k = str4;
            this.f42694l = str5;
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c
        public boolean b() {
            return this.f42695m;
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c
        public String c() {
            return this.f42693k;
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c
        public String d() {
            return this.f42691i;
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c
        public String e() {
            return this.f42690h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return AbstractC6492s.d(this.f42690h, sVar.f42690h) && AbstractC6492s.d(this.f42691i, sVar.f42691i) && AbstractC6492s.d(this.f42692j, sVar.f42692j) && AbstractC6492s.d(this.f42693k, sVar.f42693k) && AbstractC6492s.d(this.f42694l, sVar.f42694l);
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c
        public String f() {
            return this.f42694l;
        }

        @Override // com.ui.wifiman.model.discovery.engine.bonjour.c
        public String g() {
            return this.f42692j;
        }

        public int hashCode() {
            String str = this.f42690h;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f42691i;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f42692j;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f42693k;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f42694l;
            return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "Unrecognized(name=" + this.f42690h + ", model=" + this.f42691i + ", version=" + this.f42692j + ", mac=" + this.f42693k + ", vendor=" + this.f42694l + ")";
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC2558b a() {
        return this.f42639f;
    }

    public abstract boolean b();

    public String c() {
        return this.f42637d;
    }

    public String d() {
        return this.f42635b;
    }

    public String e() {
        return this.f42634a;
    }

    public String f() {
        return this.f42638e;
    }

    public String g() {
        return this.f42636c;
    }

    private c() {
    }
}
