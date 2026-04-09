package ab;

import Fa.b;
import Zg.AbstractC3689v;
import Zg.U;
import com.ui.uidb.UiDB;
import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sh.AbstractC7978m;
import ua.InterfaceC8153a;

/* renamed from: ab.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3781d implements InterfaceC8153a {

    /* renamed from: a, reason: collision with root package name */
    private final String f25849a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f25850b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25851c;

    /* renamed from: d, reason: collision with root package name */
    private final String f25852d;

    /* renamed from: e, reason: collision with root package name */
    private final String f25853e;

    /* renamed from: f, reason: collision with root package name */
    private final ua.b f25854f;

    /* renamed from: g, reason: collision with root package name */
    private final Set f25855g;

    /* renamed from: h, reason: collision with root package name */
    private final Set f25856h;

    /* renamed from: i, reason: collision with root package name */
    private final Set f25857i;

    /* renamed from: j, reason: collision with root package name */
    private final c f25858j;

    /* renamed from: k, reason: collision with root package name */
    private final C0992d f25859k;

    /* renamed from: l, reason: collision with root package name */
    private final Map f25860l;

    /* renamed from: m, reason: collision with root package name */
    private final Ca.a f25861m;

    /* renamed from: n, reason: collision with root package name */
    private final b f25862n;

    /* renamed from: o, reason: collision with root package name */
    private final Map f25863o;

    /* renamed from: p, reason: collision with root package name */
    private final a f25864p;

    /* renamed from: ab.d$a */
    public static final class a implements InterfaceC8153a.b {

        /* renamed from: a, reason: collision with root package name */
        private final String f25865a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25866b;

        /* renamed from: c, reason: collision with root package name */
        private final b f25867c;

        /* renamed from: d, reason: collision with root package name */
        private final UiDB.b f25868d;

        /* renamed from: ab.d$a$a, reason: collision with other inner class name */
        public static final class C0988a implements Serializable {
            public static String a(String value) {
                AbstractC6492s.i(value, "value");
                return value;
            }

            public static final boolean c(String str, String str2) {
                return AbstractC6492s.d(str, str2);
            }

            public static int d(String str) {
                return str.hashCode();
            }
        }

        /* renamed from: ab.d$a$b */
        public static abstract class b implements Serializable {

            /* renamed from: a, reason: collision with root package name */
            public static final C0989a f25869a = new C0989a(null);

            /* renamed from: ab.d$a$b$a, reason: collision with other inner class name */
            public static final class C0989a {
                public /* synthetic */ C0989a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private C0989a() {
                }
            }

            /* renamed from: ab.d$a$b$b, reason: collision with other inner class name */
            public static final class C0990b extends b {

                /* renamed from: b, reason: collision with root package name */
                public static final C0990b f25870b = new C0990b();

                /* renamed from: c, reason: collision with root package name */
                private static final String f25871c = "default";

                private C0990b() {
                    super(null);
                }

                @Override // ab.C3781d.a.b
                public String a() {
                    return f25871c;
                }
            }

            /* renamed from: ab.d$a$b$c */
            public static final class c extends b {

                /* renamed from: b, reason: collision with root package name */
                public static final c f25872b = new c();

                /* renamed from: c, reason: collision with root package name */
                private static final String f25873c = "nopadding";

                private c() {
                    super(null);
                }

                @Override // ab.C3781d.a.b
                public String a() {
                    return f25873c;
                }
            }

            /* renamed from: ab.d$a$b$d, reason: collision with other inner class name */
            public static final class C0991d extends b {

                /* renamed from: b, reason: collision with root package name */
                public static final C0991d f25874b = new C0991d();

                /* renamed from: c, reason: collision with root package name */
                private static final String f25875c = "topology";

                private C0991d() {
                    super(null);
                }

                @Override // ab.C3781d.a.b
                public String a() {
                    return f25875c;
                }
            }

            /* renamed from: ab.d$a$b$e */
            public static final class e extends b {

                /* renamed from: b, reason: collision with root package name */
                private final String f25876b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(String id2) {
                    super(null);
                    AbstractC6492s.i(id2, "id");
                    this.f25876b = id2;
                }

                @Override // ab.C3781d.a.b
                public String a() {
                    return this.f25876b;
                }
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public abstract String a();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof b) {
                    return AbstractC6492s.d(a(), ((b) obj).a());
                }
                return false;
            }

            public int hashCode() {
                return a().hashCode();
            }

            public String toString() {
                return "ImageVariant('" + a() + "')";
            }

            private b() {
            }
        }

        public /* synthetic */ a(String str, String str2, b bVar, UiDB.b bVar2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, bVar, bVar2);
        }

        public final String a() {
            return this.f25865a;
        }

        public final URI c(int i10) {
            return Za.a.f25254a.a().a(d(), i10);
        }

        public URI d() {
            try {
                String host = this.f25868d.getHost();
                String str = String.format("/fingerprint/ui/images/%s/%s/%s.png", Arrays.copyOf(new Object[]{URLEncoder.encode(this.f25866b, "utf-8"), this.f25867c.a(), URLEncoder.encode(this.f25865a, "utf-8")}, 3));
                AbstractC6492s.h(str, "format(...)");
                return new URI("https", host, str, null);
            } catch (IllegalArgumentException e10) {
                throw new IllegalStateException("Image URL should never get into invalid format! [" + this.f25865a + "]", e10);
            } catch (URISyntaxException e11) {
                throw new IllegalStateException("Image URL should never get into invalid format! [" + this.f25865a + "]", e11);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (C0988a.c(this.f25865a, aVar.f25865a) && InterfaceC8153a.C2195a.g(this.f25866b, aVar.f25866b) && this.f25868d == aVar.f25868d) {
                return AbstractC6492s.d(this.f25867c, aVar.f25867c);
            }
            return false;
        }

        public final b g() {
            return this.f25867c;
        }

        public int hashCode() {
            return (((((C0988a.d(this.f25865a) * 31) + InterfaceC8153a.C2195a.h(this.f25866b)) * 31) + this.f25868d.hashCode()) * 31) + this.f25867c.hashCode();
        }

        private a(String id2, String productId, b variant, UiDB.b environment) {
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(productId, "productId");
            AbstractC6492s.i(variant, "variant");
            AbstractC6492s.i(environment, "environment");
            this.f25865a = id2;
            this.f25866b = productId;
            this.f25867c = variant;
            this.f25868d = environment;
        }
    }

    /* renamed from: ab.d$b */
    public static final class b implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final List f25877a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f25878b;

        /* renamed from: ab.d$b$a */
        public static final class a implements Serializable {

            /* renamed from: a, reason: collision with root package name */
            private final String f25879a;

            /* renamed from: b, reason: collision with root package name */
            private final String f25880b;

            /* renamed from: c, reason: collision with root package name */
            private final String f25881c;

            public a(String str, String str2, String str3) {
                this.f25879a = str;
                this.f25880b = str2;
                this.f25881c = str3;
            }

            public final String a() {
                return this.f25879a;
            }

            public final String c() {
                return this.f25880b;
            }

            public final String d() {
                return this.f25881c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return AbstractC6492s.d(this.f25879a, aVar.f25879a) && AbstractC6492s.d(this.f25880b, aVar.f25880b) && AbstractC6492s.d(this.f25881c, aVar.f25881c);
            }

            public int hashCode() {
                String str = this.f25879a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f25880b;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f25881c;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "DiscoveryTriplet(modelV1=" + this.f25879a + ", modelV2=" + this.f25880b + ", productName=" + this.f25881c + ")";
            }
        }

        public b(List networkDiscoveryTriplets, Set fallbacks) {
            AbstractC6492s.i(networkDiscoveryTriplets, "networkDiscoveryTriplets");
            AbstractC6492s.i(fallbacks, "fallbacks");
            this.f25877a = networkDiscoveryTriplets;
            this.f25878b = fallbacks;
        }

        public final Set a() {
            return this.f25878b;
        }

        public final List c() {
            return this.f25877a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f25877a, bVar.f25877a) && AbstractC6492s.d(this.f25878b, bVar.f25878b);
        }

        public int hashCode() {
            return (this.f25877a.hashCode() * 31) + this.f25878b.hashCode();
        }

        public String toString() {
            return "Lookup(networkDiscoveryTriplets=" + this.f25877a + ", fallbacks=" + this.f25878b + ")";
        }
    }

    /* renamed from: ab.d$e */
    public static final class e implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final String f25892a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25893b;

        /* renamed from: c, reason: collision with root package name */
        private final b f25894c;

        /* renamed from: d, reason: collision with root package name */
        private final UiDB.b f25895d;

        /* renamed from: ab.d$e$a */
        public static final class a implements Serializable {
            public static String a(String value) {
                AbstractC6492s.i(value, "value");
                return value;
            }

            public static final boolean c(String str, String str2) {
                return AbstractC6492s.d(str, str2);
            }

            public static int d(String str) {
                return str.hashCode();
            }
        }

        /* renamed from: ab.d$e$b */
        public static abstract class b implements Serializable {

            /* renamed from: a, reason: collision with root package name */
            public static final a f25896a = new a(null);

            /* renamed from: ab.d$e$b$a */
            public static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private a() {
                }
            }

            /* renamed from: ab.d$e$b$b, reason: collision with other inner class name */
            public static final class C0993b extends b {

                /* renamed from: b, reason: collision with root package name */
                public static final C0993b f25897b = new C0993b();

                /* renamed from: c, reason: collision with root package name */
                private static final String f25898c = "mobile-intro";

                private C0993b() {
                    super(null);
                }

                @Override // ab.C3781d.e.b
                public String a() {
                    return f25898c;
                }
            }

            /* renamed from: ab.d$e$b$c */
            public static final class c extends b {

                /* renamed from: b, reason: collision with root package name */
                public static final c f25899b = new c();

                /* renamed from: c, reason: collision with root package name */
                private static final String f25900c = "mobile-setup-wizard-plugin";

                private c() {
                    super(null);
                }

                @Override // ab.C3781d.e.b
                public String a() {
                    return f25900c;
                }
            }

            /* renamed from: ab.d$e$b$d, reason: collision with other inner class name */
            public static final class C0994d extends b {

                /* renamed from: b, reason: collision with root package name */
                public static final C0994d f25901b = new C0994d();

                /* renamed from: c, reason: collision with root package name */
                private static final String f25902c = "mobile-setup-wizard-testing-connection";

                private C0994d() {
                    super(null);
                }

                @Override // ab.C3781d.e.b
                public String a() {
                    return f25902c;
                }
            }

            /* renamed from: ab.d$e$b$e, reason: collision with other inner class name */
            public static final class C0995e extends b {

                /* renamed from: b, reason: collision with root package name */
                private final String f25903b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0995e(String id2) {
                    super(null);
                    AbstractC6492s.i(id2, "id");
                    this.f25903b = id2;
                }

                @Override // ab.C3781d.e.b
                public String a() {
                    return this.f25903b;
                }
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public abstract String a();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof b) {
                    return AbstractC6492s.d(a(), ((b) obj).a());
                }
                return false;
            }

            public int hashCode() {
                return a().hashCode();
            }

            public String toString() {
                return "VideoVariant('" + a() + "')";
            }

            private b() {
            }
        }

        public /* synthetic */ e(String str, String str2, b bVar, UiDB.b bVar2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, bVar, bVar2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (a.c(this.f25892a, eVar.f25892a) && InterfaceC8153a.C2195a.g(this.f25893b, eVar.f25893b) && this.f25895d == eVar.f25895d) {
                return AbstractC6492s.d(this.f25894c, eVar.f25894c);
            }
            return false;
        }

        public int hashCode() {
            return (((((a.d(this.f25892a) * 31) + InterfaceC8153a.C2195a.h(this.f25893b)) * 31) + this.f25895d.hashCode()) * 31) + this.f25894c.hashCode();
        }

        private e(String id2, String productId, b variant, UiDB.b environment) {
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(productId, "productId");
            AbstractC6492s.i(variant, "variant");
            AbstractC6492s.i(environment, "environment");
            this.f25892a = id2;
            this.f25893b = productId;
            this.f25894c = variant;
            this.f25895d = environment;
        }
    }

    public /* synthetic */ C3781d(String str, Set set, String str2, String str3, String str4, ua.b bVar, Set set2, Set set3, Set set4, c cVar, C0992d c0992d, Map map, Ca.a aVar, b bVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, set, str2, str3, str4, bVar, set2, set3, set4, cVar, c0992d, map, aVar, bVar2);
    }

    public Map D() {
        return this.f25860l;
    }

    @Override // ua.InterfaceC8153a
    public String I() {
        return this.f25853e;
    }

    @Override // ua.InterfaceC8153a
    public Set Q0() {
        return this.f25856h;
    }

    public Set a() {
        return this.f25850b;
    }

    public final a c(a.b variant) {
        AbstractC6492s.i(variant, "variant");
        return (a) this.f25863o.get(variant);
    }

    public final b d() {
        return this.f25862n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3781d)) {
            return false;
        }
        C3781d c3781d = (C3781d) obj;
        return InterfaceC8153a.C2195a.g(mo3getId2jxHnRY(), c3781d.mo3getId2jxHnRY()) && AbstractC6492s.d(getName(), c3781d.getName()) && AbstractC6492s.d(g(), c3781d.g()) && AbstractC6492s.d(h0(), c3781d.h0()) && AbstractC6492s.d(h(), c3781d.h()) && AbstractC6492s.d(Q0(), c3781d.Q0()) && AbstractC6492s.d(m(), c3781d.m()) && AbstractC6492s.d(j(), c3781d.j()) && AbstractC6492s.d(l(), c3781d.l()) && AbstractC6492s.d(this.f25862n, c3781d.f25862n) && AbstractC6492s.d(a(), c3781d.a());
    }

    public String g() {
        return this.f25852d;
    }

    @Override // ua.InterfaceC8153a
    /* renamed from: getId-2jxHnRY, reason: not valid java name */
    public String mo3getId2jxHnRY() {
        return this.f25849a;
    }

    @Override // ua.InterfaceC8153a
    public String getName() {
        return this.f25851c;
    }

    public Set h() {
        return this.f25855g;
    }

    @Override // ua.InterfaceC8153a
    public ua.b h0() {
        return this.f25854f;
    }

    public int hashCode() {
        return InterfaceC8153a.C2195a.h(mo3getId2jxHnRY());
    }

    public c j() {
        return this.f25858j;
    }

    public C0992d l() {
        return this.f25859k;
    }

    public Set m() {
        return this.f25857i;
    }

    @Override // ua.InterfaceC8153a
    public Ca.a z() {
        return this.f25861m;
    }

    private C3781d(String id2, Set guid, String name, String nameAbbrev, String str, ua.b line, Set systemID, Set images, Set videos, c cVar, C0992d c0992d, Map map, Ca.a aVar, b lookup) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(guid, "guid");
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(nameAbbrev, "nameAbbrev");
        AbstractC6492s.i(line, "line");
        AbstractC6492s.i(systemID, "systemID");
        AbstractC6492s.i(images, "images");
        AbstractC6492s.i(videos, "videos");
        AbstractC6492s.i(lookup, "lookup");
        this.f25849a = id2;
        this.f25850b = guid;
        this.f25851c = name;
        this.f25852d = nameAbbrev;
        this.f25853e = str;
        this.f25854f = line;
        this.f25855g = systemID;
        this.f25856h = images;
        this.f25857i = videos;
        this.f25858j = cVar;
        this.f25859k = c0992d;
        this.f25860l = map;
        this.f25861m = aVar;
        this.f25862n = lookup;
        Set setQ0 = Q0();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(setQ0, 10)), 16));
        for (Object obj : setQ0) {
            linkedHashMap.put(((a) obj).g(), obj);
        }
        this.f25863o = linkedHashMap;
        this.f25864p = c(a.b.C0990b.f25870b);
    }

    /* renamed from: ab.d$c */
    public static final class c implements Ea.c {

        /* renamed from: a, reason: collision with root package name */
        private final Map f25882a;

        /* renamed from: b, reason: collision with root package name */
        private final Ea.b f25883b;

        public c(Map map, Ea.b firmware) {
            AbstractC6492s.i(firmware, "firmware");
            this.f25882a = map;
            this.f25883b = firmware;
        }

        @Override // Ea.c
        public Map D() {
            return this.f25882a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC6492s.d(this.f25882a, cVar.f25882a) && AbstractC6492s.d(this.f25883b, cVar.f25883b);
        }

        public int hashCode() {
            Map map = this.f25882a;
            return ((map == null ? 0 : map.hashCode()) * 31) + this.f25883b.hashCode();
        }

        public String toString() {
            return "Uisp(btleService=" + this.f25882a + ", firmware=" + this.f25883b + ")";
        }

        public /* synthetic */ c(Map map, Ea.b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : map, bVar);
        }
    }

    /* renamed from: ab.d$d, reason: collision with other inner class name */
    public static final class C0992d implements Fa.b {

        /* renamed from: a, reason: collision with root package name */
        private final Map f25884a;

        /* renamed from: b, reason: collision with root package name */
        private final a f25885b;

        /* renamed from: c, reason: collision with root package name */
        private final b f25886c;

        /* renamed from: ab.d$d$b */
        public static final class b implements Serializable {

            /* renamed from: a, reason: collision with root package name */
            private final String f25891a;

            public b(String str) {
                this.f25891a = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC6492s.d(this.f25891a, ((b) obj).f25891a);
            }

            public int hashCode() {
                String str = this.f25891a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "Protect(minAdoptVersion=" + this.f25891a + ")";
            }
        }

        public C0992d(Map map, a aVar, b bVar) {
            this.f25884a = map;
            this.f25885b = aVar;
            this.f25886c = bVar;
        }

        @Override // Fa.b
        public Map D() {
            return this.f25884a;
        }

        @Override // Fa.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a e() {
            return this.f25885b;
        }

        public b c() {
            return this.f25886c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0992d)) {
                return false;
            }
            C0992d c0992d = (C0992d) obj;
            return AbstractC6492s.d(this.f25884a, c0992d.f25884a) && AbstractC6492s.d(this.f25885b, c0992d.f25885b) && AbstractC6492s.d(this.f25886c, c0992d.f25886c);
        }

        public int hashCode() {
            Map map = this.f25884a;
            int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
            a aVar = this.f25885b;
            int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            b bVar = this.f25886c;
            return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
        }

        public String toString() {
            return "Unifi(btleService=" + this.f25884a + ", network=" + this.f25885b + ", protect=" + this.f25886c + ")";
        }

        /* renamed from: ab.d$d$a */
        public static final class a implements b.a {

            /* renamed from: a, reason: collision with root package name */
            private final String f25887a;

            /* renamed from: b, reason: collision with root package name */
            private final String f25888b;

            /* renamed from: c, reason: collision with root package name */
            private final Boolean f25889c;

            /* renamed from: d, reason: collision with root package name */
            private final Ga.a f25890d;

            public a(String str, String str2, Boolean bool, Ga.a aVar) {
                this.f25887a = str;
                this.f25888b = str2;
                this.f25889c = bool;
                this.f25890d = aVar;
            }

            public String a() {
                return this.f25887a;
            }

            @Override // Fa.b.a
            public String b() {
                return this.f25888b;
            }

            public Ga.a c() {
                return this.f25890d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return AbstractC6492s.d(this.f25887a, aVar.f25887a) && AbstractC6492s.d(this.f25888b, aVar.f25888b) && AbstractC6492s.d(this.f25889c, aVar.f25889c) && AbstractC6492s.d(this.f25890d, aVar.f25890d);
            }

            public int hashCode() {
                String str = this.f25887a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f25888b;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Boolean bool = this.f25889c;
                int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                Ga.a aVar = this.f25890d;
                return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
            }

            public String toString() {
                return "Network(minAdoptVersion=" + this.f25887a + ", model=" + this.f25888b + ", isArSupported=" + this.f25889c + ", shadowMode=" + this.f25890d + ")";
            }

            public /* synthetic */ a(String str, String str2, Boolean bool, Ga.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : bool, (i10 & 8) != 0 ? null : aVar);
            }
        }

        public /* synthetic */ C0992d(Map map, a aVar, b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : map, (i10 & 2) != 0 ? null : aVar, (i10 & 4) != 0 ? null : bVar);
        }
    }
}
