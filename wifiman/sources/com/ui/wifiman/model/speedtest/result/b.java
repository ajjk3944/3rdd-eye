package com.ui.wifiman.model.speedtest.result;

import S8.g;
import b8.EnumC4076c;
import gg.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;
import pd.s;
import rd.b;
import xa.InterfaceC8439a;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final long f43101a;

    /* renamed from: b, reason: collision with root package name */
    private final String f43102b;

    /* renamed from: c, reason: collision with root package name */
    private final String f43103c;

    /* renamed from: d, reason: collision with root package name */
    private final EnumC4076c f43104d;

    /* renamed from: e, reason: collision with root package name */
    private final long f43105e;

    /* renamed from: f, reason: collision with root package name */
    private final List f43106f;

    /* renamed from: g, reason: collision with root package name */
    private final d f43107g;

    /* renamed from: h, reason: collision with root package name */
    private final List f43108h;

    public interface a {
        z a(String str);
    }

    /* renamed from: com.ui.wifiman.model.speedtest.result.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC1432b {

        /* renamed from: com.ui.wifiman.model.speedtest.result.b$b$a */
        public static final class a extends AbstractC1432b {

            /* renamed from: a, reason: collision with root package name */
            private final String f43109a;

            /* renamed from: b, reason: collision with root package name */
            private final String f43110b;

            /* renamed from: c, reason: collision with root package name */
            private final String f43111c;

            /* renamed from: d, reason: collision with root package name */
            private final InterfaceC8439a.d f43112d;

            /* renamed from: e, reason: collision with root package name */
            private final String f43113e;

            /* renamed from: f, reason: collision with root package name */
            private final g f43114f;

            /* renamed from: g, reason: collision with root package name */
            private final b.a.EnumC2104a f43115g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String serverAddress, String str, String str2, InterfaceC8439a.d dVar, String str3, g gVar, b.a.EnumC2104a enumC2104a) {
                super(null);
                AbstractC6492s.i(serverAddress, "serverAddress");
                this.f43109a = serverAddress;
                this.f43110b = str;
                this.f43111c = str2;
                this.f43112d = dVar;
                this.f43113e = str3;
                this.f43114f = gVar;
                this.f43115g = enumC2104a;
            }

            @Override // com.ui.wifiman.model.speedtest.result.b.AbstractC1432b
            public String a() {
                return this.f43109a;
            }

            public final String b() {
                return this.f43110b;
            }

            public final String c() {
                return this.f43111c;
            }

            public final String d() {
                return this.f43113e;
            }

            public final b.a.EnumC2104a e() {
                return this.f43115g;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return AbstractC6492s.d(this.f43109a, aVar.f43109a) && AbstractC6492s.d(this.f43110b, aVar.f43110b) && AbstractC6492s.d(this.f43111c, aVar.f43111c) && AbstractC6492s.d(this.f43112d, aVar.f43112d) && AbstractC6492s.d(this.f43113e, aVar.f43113e) && AbstractC6492s.d(this.f43114f, aVar.f43114f) && this.f43115g == aVar.f43115g;
            }

            public final InterfaceC8439a.d f() {
                return this.f43112d;
            }

            public final g g() {
                return this.f43114f;
            }

            public int hashCode() {
                int iHashCode = this.f43109a.hashCode() * 31;
                String str = this.f43110b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f43111c;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                InterfaceC8439a.d dVar = this.f43112d;
                int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
                String str3 = this.f43113e;
                int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
                g gVar = this.f43114f;
                int iHashCode6 = (iHashCode5 + (gVar == null ? 0 : gVar.hashCode())) * 31;
                b.a.EnumC2104a enumC2104a = this.f43115g;
                return iHashCode6 + (enumC2104a != null ? enumC2104a.hashCode() : 0);
            }

            public String toString() {
                return "App2App(serverAddress=" + this.f43109a + ", name=" + this.f43110b + ", productImageUrl=" + this.f43111c + ", ubntProduct=" + this.f43112d + ", productModel=" + this.f43113e + ", wifiExperience=" + this.f43114f + ", serverType=" + this.f43115g + ")";
            }
        }

        /* renamed from: com.ui.wifiman.model.speedtest.result.b$b$b, reason: collision with other inner class name */
        public static abstract class AbstractC1433b extends AbstractC1432b {

            /* renamed from: com.ui.wifiman.model.speedtest.result.b$b$b$a */
            public static final class a extends AbstractC1433b {

                /* renamed from: a, reason: collision with root package name */
                private final String f43116a;

                /* renamed from: b, reason: collision with root package name */
                private final String f43117b;

                /* renamed from: c, reason: collision with root package name */
                private final String f43118c;

                /* renamed from: d, reason: collision with root package name */
                private final String f43119d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(String str, String serverAddress, String str2, String str3) {
                    super(null);
                    AbstractC6492s.i(serverAddress, "serverAddress");
                    this.f43116a = str;
                    this.f43117b = serverAddress;
                    this.f43118c = str2;
                    this.f43119d = str3;
                }

                @Override // com.ui.wifiman.model.speedtest.result.b.AbstractC1432b
                public String a() {
                    return this.f43117b;
                }

                @Override // com.ui.wifiman.model.speedtest.result.b.AbstractC1432b.AbstractC1433b
                public String b() {
                    return this.f43118c;
                }

                @Override // com.ui.wifiman.model.speedtest.result.b.AbstractC1432b.AbstractC1433b
                public String c() {
                    return this.f43119d;
                }

                @Override // com.ui.wifiman.model.speedtest.result.b.AbstractC1432b.AbstractC1433b
                public String d() {
                    return this.f43116a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return AbstractC6492s.d(this.f43116a, aVar.f43116a) && AbstractC6492s.d(this.f43117b, aVar.f43117b) && AbstractC6492s.d(this.f43118c, aVar.f43118c) && AbstractC6492s.d(this.f43119d, aVar.f43119d);
                }

                public int hashCode() {
                    String str = this.f43116a;
                    int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f43117b.hashCode()) * 31;
                    String str2 = this.f43118c;
                    int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.f43119d;
                    return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
                }

                public String toString() {
                    return "ISP(name=" + this.f43116a + ", serverAddress=" + this.f43117b + ", internetProvider=" + this.f43118c + ", internetProviderImage=" + this.f43119d + ")";
                }
            }

            /* renamed from: com.ui.wifiman.model.speedtest.result.b$b$b$b, reason: collision with other inner class name */
            public static final class C1434b extends AbstractC1433b {

                /* renamed from: a, reason: collision with root package name */
                private final Provider f43120a;

                /* renamed from: b, reason: collision with root package name */
                private final List f43121b;

                /* renamed from: c, reason: collision with root package name */
                private final String f43122c;

                /* renamed from: d, reason: collision with root package name */
                private final String f43123d;

                @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0015\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;", "", "", "name", "url", "serverCountry", "serverCity", "serverAddress", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, SnmpConfigurator.O_COMMUNITY, "d", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                /* renamed from: com.ui.wifiman.model.speedtest.result.b$b$b$b$a, reason: from toString */
                public static final /* data */ class Provider {

                    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                    @s5.c("name")
                    private final String name;

                    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                    @s5.c("url")
                    private final String url;

                    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                    @s5.c("serverCountry")
                    private final String serverCountry;

                    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                    @s5.c("serverCity")
                    private final String serverCity;

                    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
                    @s5.c("serverAddress")
                    private final String serverAddress;

                    public Provider(String str, String str2, String str3, String str4, String serverAddress) {
                        AbstractC6492s.i(serverAddress, "serverAddress");
                        this.name = str;
                        this.url = str2;
                        this.serverCountry = str3;
                        this.serverCity = str4;
                        this.serverAddress = serverAddress;
                    }

                    /* renamed from: a, reason: from getter */
                    public final String getName() {
                        return this.name;
                    }

                    /* renamed from: b, reason: from getter */
                    public final String getServerAddress() {
                        return this.serverAddress;
                    }

                    /* renamed from: c, reason: from getter */
                    public final String getServerCity() {
                        return this.serverCity;
                    }

                    /* renamed from: d, reason: from getter */
                    public final String getServerCountry() {
                        return this.serverCountry;
                    }

                    /* renamed from: e, reason: from getter */
                    public final String getUrl() {
                        return this.url;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Provider)) {
                            return false;
                        }
                        Provider provider = (Provider) other;
                        return AbstractC6492s.d(this.name, provider.name) && AbstractC6492s.d(this.url, provider.url) && AbstractC6492s.d(this.serverCountry, provider.serverCountry) && AbstractC6492s.d(this.serverCity, provider.serverCity) && AbstractC6492s.d(this.serverAddress, provider.serverAddress);
                    }

                    public int hashCode() {
                        String str = this.name;
                        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                        String str2 = this.url;
                        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                        String str3 = this.serverCountry;
                        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                        String str4 = this.serverCity;
                        return ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.serverAddress.hashCode();
                    }

                    public String toString() {
                        return "Provider(name=" + this.name + ", url=" + this.url + ", serverCountry=" + this.serverCountry + ", serverCity=" + this.serverCity + ", serverAddress=" + this.serverAddress + ")";
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1434b(Provider main, List secondary, String str, String str2) {
                    super(null);
                    AbstractC6492s.i(main, "main");
                    AbstractC6492s.i(secondary, "secondary");
                    this.f43120a = main;
                    this.f43121b = secondary;
                    this.f43122c = str;
                    this.f43123d = str2;
                }

                @Override // com.ui.wifiman.model.speedtest.result.b.AbstractC1432b
                public String a() {
                    return this.f43120a.getServerAddress();
                }

                @Override // com.ui.wifiman.model.speedtest.result.b.AbstractC1432b.AbstractC1433b
                public String b() {
                    return this.f43122c;
                }

                @Override // com.ui.wifiman.model.speedtest.result.b.AbstractC1432b.AbstractC1433b
                public String c() {
                    return this.f43123d;
                }

                @Override // com.ui.wifiman.model.speedtest.result.b.AbstractC1432b.AbstractC1433b
                public String d() {
                    return this.f43120a.getName();
                }

                public final Provider e() {
                    return this.f43120a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1434b)) {
                        return false;
                    }
                    C1434b c1434b = (C1434b) obj;
                    return AbstractC6492s.d(this.f43120a, c1434b.f43120a) && AbstractC6492s.d(this.f43121b, c1434b.f43121b) && AbstractC6492s.d(this.f43122c, c1434b.f43122c) && AbstractC6492s.d(this.f43123d, c1434b.f43123d);
                }

                public final List f() {
                    return this.f43121b;
                }

                public int hashCode() {
                    int iHashCode = ((this.f43120a.hashCode() * 31) + this.f43121b.hashCode()) * 31;
                    String str = this.f43122c;
                    int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.f43123d;
                    return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                public String toString() {
                    return "UbntServer(main=" + this.f43120a + ", secondary=" + this.f43121b + ", internetProvider=" + this.f43122c + ", internetProviderImage=" + this.f43123d + ")";
                }
            }

            public /* synthetic */ AbstractC1433b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public abstract String b();

            public abstract String c();

            public abstract String d();

            private AbstractC1433b() {
                super(null);
            }
        }

        /* renamed from: com.ui.wifiman.model.speedtest.result.b$b$c */
        public static final class c extends AbstractC1432b {

            /* renamed from: a, reason: collision with root package name */
            private final String f43129a;

            /* renamed from: b, reason: collision with root package name */
            private final String f43130b;

            /* renamed from: c, reason: collision with root package name */
            private final String f43131c;

            /* renamed from: d, reason: collision with root package name */
            private final InterfaceC8439a.d f43132d;

            /* renamed from: e, reason: collision with root package name */
            private final String f43133e;

            /* renamed from: f, reason: collision with root package name */
            private final g f43134f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String serverAddress, String str, String str2, InterfaceC8439a.d dVar, String str3, g gVar) {
                super(null);
                AbstractC6492s.i(serverAddress, "serverAddress");
                this.f43129a = serverAddress;
                this.f43130b = str;
                this.f43131c = str2;
                this.f43132d = dVar;
                this.f43133e = str3;
                this.f43134f = gVar;
            }

            @Override // com.ui.wifiman.model.speedtest.result.b.AbstractC1432b
            public String a() {
                return this.f43129a;
            }

            public final String b() {
                return this.f43130b;
            }

            public final String c() {
                return this.f43131c;
            }

            public final String d() {
                return this.f43133e;
            }

            public final InterfaceC8439a.d e() {
                return this.f43132d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return AbstractC6492s.d(this.f43129a, cVar.f43129a) && AbstractC6492s.d(this.f43130b, cVar.f43130b) && AbstractC6492s.d(this.f43131c, cVar.f43131c) && AbstractC6492s.d(this.f43132d, cVar.f43132d) && AbstractC6492s.d(this.f43133e, cVar.f43133e) && AbstractC6492s.d(this.f43134f, cVar.f43134f);
            }

            public final g f() {
                return this.f43134f;
            }

            public int hashCode() {
                int iHashCode = this.f43129a.hashCode() * 31;
                String str = this.f43130b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f43131c;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                InterfaceC8439a.d dVar = this.f43132d;
                int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
                String str3 = this.f43133e;
                int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
                g gVar = this.f43134f;
                return iHashCode5 + (gVar != null ? gVar.hashCode() : 0);
            }

            public String toString() {
                return "Local(serverAddress=" + this.f43129a + ", name=" + this.f43130b + ", productImageUrl=" + this.f43131c + ", ubntProduct=" + this.f43132d + ", productModel=" + this.f43133e + ", wifiExperience=" + this.f43134f + ")";
            }
        }

        public /* synthetic */ AbstractC1432b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract String a();

        private AbstractC1432b() {
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f43144a;

        /* renamed from: b, reason: collision with root package name */
        private final g f43145b;

        /* renamed from: c, reason: collision with root package name */
        private final String f43146c;

        /* renamed from: d, reason: collision with root package name */
        private final S8.a f43147d;

        /* renamed from: e, reason: collision with root package name */
        private final W7.f f43148e;

        /* renamed from: f, reason: collision with root package name */
        private final S8.c f43149f;

        /* renamed from: g, reason: collision with root package name */
        private final W7.f f43150g;

        /* renamed from: h, reason: collision with root package name */
        private final Integer f43151h;

        /* renamed from: i, reason: collision with root package name */
        private final S8.d f43152i;

        /* renamed from: j, reason: collision with root package name */
        private final W7.b f43153j;

        public d(String str, g gVar, String str2, S8.a aVar, W7.f fVar, S8.c cVar, W7.f fVar2, Integer num, S8.d dVar, W7.b bVar) {
            this.f43144a = str;
            this.f43145b = gVar;
            this.f43146c = str2;
            this.f43147d = aVar;
            this.f43148e = fVar;
            this.f43149f = cVar;
            this.f43150g = fVar2;
            this.f43151h = num;
            this.f43152i = dVar;
            this.f43153j = bVar;
        }

        public final String a() {
            return this.f43146c;
        }

        public final S8.c b() {
            return this.f43149f;
        }

        public final Integer c() {
            return this.f43151h;
        }

        public final S8.d d() {
            return this.f43152i;
        }

        public final W7.b e() {
            return this.f43153j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC6492s.d(this.f43144a, dVar.f43144a) && AbstractC6492s.d(this.f43145b, dVar.f43145b) && AbstractC6492s.d(this.f43146c, dVar.f43146c) && this.f43147d == dVar.f43147d && AbstractC6492s.d(this.f43148e, dVar.f43148e) && this.f43149f == dVar.f43149f && AbstractC6492s.d(this.f43150g, dVar.f43150g) && AbstractC6492s.d(this.f43151h, dVar.f43151h) && this.f43152i == dVar.f43152i && AbstractC6492s.d(this.f43153j, dVar.f43153j);
        }

        public final W7.f f() {
            return this.f43148e;
        }

        public final W7.f g() {
            return this.f43150g;
        }

        public final String h() {
            return this.f43144a;
        }

        public int hashCode() {
            String str = this.f43144a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            g gVar = this.f43145b;
            int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
            String str2 = this.f43146c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            S8.a aVar = this.f43147d;
            int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            W7.f fVar = this.f43148e;
            int iHashCode5 = (iHashCode4 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            S8.c cVar = this.f43149f;
            int iHashCode6 = (iHashCode5 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            W7.f fVar2 = this.f43150g;
            int iHashCode7 = (iHashCode6 + (fVar2 == null ? 0 : fVar2.hashCode())) * 31;
            Integer num = this.f43151h;
            int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
            S8.d dVar = this.f43152i;
            int iHashCode9 = (iHashCode8 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            W7.b bVar = this.f43153j;
            return iHashCode9 + (bVar != null ? bVar.hashCode() : 0);
        }

        public final g i() {
            return this.f43145b;
        }

        public final S8.a j() {
            return this.f43147d;
        }

        public String toString() {
            return "WirelessConnectionDetails(ssid=" + this.f43144a + ", wifiExperience=" + this.f43145b + ", apName=" + this.f43146c + ", wifiMode=" + this.f43147d + ", signal=" + this.f43148e + ", band=" + this.f43149f + ", signalAP=" + this.f43150g + ", channel=" + this.f43151h + ", channelWidth=" + this.f43152i + ", rate=" + this.f43153j + ")";
        }
    }

    public b(long j10, String str, String str2, EnumC4076c connection, long j11, List dnsServers, d wireless, List measurements) {
        AbstractC6492s.i(connection, "connection");
        AbstractC6492s.i(dnsServers, "dnsServers");
        AbstractC6492s.i(wireless, "wireless");
        AbstractC6492s.i(measurements, "measurements");
        this.f43101a = j10;
        this.f43102b = str;
        this.f43103c = str2;
        this.f43104d = connection;
        this.f43105e = j11;
        this.f43106f = dnsServers;
        this.f43107g = wireless;
        this.f43108h = measurements;
    }

    public final b a(long j10, String str, String str2, EnumC4076c connection, long j11, List dnsServers, d wireless, List measurements) {
        AbstractC6492s.i(connection, "connection");
        AbstractC6492s.i(dnsServers, "dnsServers");
        AbstractC6492s.i(wireless, "wireless");
        AbstractC6492s.i(measurements, "measurements");
        return new b(j10, str, str2, connection, j11, dnsServers, wireless, measurements);
    }

    public final String c() {
        return this.f43102b;
    }

    public final EnumC4076c d() {
        return this.f43104d;
    }

    public final List e() {
        return this.f43106f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f43101a == bVar.f43101a && AbstractC6492s.d(this.f43102b, bVar.f43102b) && AbstractC6492s.d(this.f43103c, bVar.f43103c) && this.f43104d == bVar.f43104d && this.f43105e == bVar.f43105e && AbstractC6492s.d(this.f43106f, bVar.f43106f) && AbstractC6492s.d(this.f43107g, bVar.f43107g) && AbstractC6492s.d(this.f43108h, bVar.f43108h);
    }

    public final long f() {
        return this.f43101a;
    }

    public final List g() {
        return this.f43108h;
    }

    public final long h() {
        return this.f43105e;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.f43101a) * 31;
        String str = this.f43102b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f43103c;
        return ((((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f43104d.hashCode()) * 31) + Long.hashCode(this.f43105e)) * 31) + this.f43106f.hashCode()) * 31) + this.f43107g.hashCode()) * 31) + this.f43108h.hashCode();
    }

    public final String i() {
        return this.f43103c;
    }

    public final d j() {
        return this.f43107g;
    }

    public String toString() {
        return "SpeedtestResult(id=" + this.f43101a + ", cloudId=" + this.f43102b + ", unifiControllerId=" + this.f43103c + ", connection=" + this.f43104d + ", timestamp=" + this.f43105e + ", dnsServers=" + this.f43106f + ", wireless=" + this.f43107g + ", measurements=" + this.f43108h + ")";
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final Long f43135a;

        /* renamed from: b, reason: collision with root package name */
        private final s f43136b;

        /* renamed from: c, reason: collision with root package name */
        private final AbstractC1432b f43137c;

        /* renamed from: d, reason: collision with root package name */
        private final Integer f43138d;

        /* renamed from: e, reason: collision with root package name */
        private final Integer f43139e;

        /* renamed from: f, reason: collision with root package name */
        private final Long f43140f;

        /* renamed from: g, reason: collision with root package name */
        private final ArrayList f43141g;

        /* renamed from: h, reason: collision with root package name */
        private final Long f43142h;

        /* renamed from: i, reason: collision with root package name */
        private final ArrayList f43143i;

        public c(Long l10, s type, AbstractC1432b endpoint, Integer num, Integer num2, Long l11, ArrayList arrayList, Long l12, ArrayList arrayList2) {
            AbstractC6492s.i(type, "type");
            AbstractC6492s.i(endpoint, "endpoint");
            this.f43135a = l10;
            this.f43136b = type;
            this.f43137c = endpoint;
            this.f43138d = num;
            this.f43139e = num2;
            this.f43140f = l11;
            this.f43141g = arrayList;
            this.f43142h = l12;
            this.f43143i = arrayList2;
        }

        public final Long a() {
            return this.f43140f;
        }

        public final ArrayList b() {
            return this.f43141g;
        }

        public final AbstractC1432b c() {
            return this.f43137c;
        }

        public final Long d() {
            return this.f43135a;
        }

        public final Integer e() {
            return this.f43139e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC6492s.d(this.f43135a, cVar.f43135a) && this.f43136b == cVar.f43136b && AbstractC6492s.d(this.f43137c, cVar.f43137c) && AbstractC6492s.d(this.f43138d, cVar.f43138d) && AbstractC6492s.d(this.f43139e, cVar.f43139e) && AbstractC6492s.d(this.f43140f, cVar.f43140f) && AbstractC6492s.d(this.f43141g, cVar.f43141g) && AbstractC6492s.d(this.f43142h, cVar.f43142h) && AbstractC6492s.d(this.f43143i, cVar.f43143i);
        }

        public final Integer f() {
            return this.f43138d;
        }

        public final s g() {
            return this.f43136b;
        }

        public final Long h() {
            return this.f43142h;
        }

        public int hashCode() {
            Long l10 = this.f43135a;
            int iHashCode = (((((l10 == null ? 0 : l10.hashCode()) * 31) + this.f43136b.hashCode()) * 31) + this.f43137c.hashCode()) * 31;
            Integer num = this.f43138d;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f43139e;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Long l11 = this.f43140f;
            int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
            ArrayList arrayList = this.f43141g;
            int iHashCode5 = (iHashCode4 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
            Long l12 = this.f43142h;
            int iHashCode6 = (iHashCode5 + (l12 == null ? 0 : l12.hashCode())) * 31;
            ArrayList arrayList2 = this.f43143i;
            return iHashCode6 + (arrayList2 != null ? arrayList2.hashCode() : 0);
        }

        public final ArrayList i() {
            return this.f43143i;
        }

        public String toString() {
            return "Measurement(id=" + this.f43135a + ", type=" + this.f43136b + ", endpoint=" + this.f43137c + ", latency=" + this.f43138d + ", jitter=" + this.f43139e + ", downloadSpeedBps=" + this.f43140f + ", downloadSpeedChartData=" + this.f43141g + ", uploadSpeedBps=" + this.f43142h + ", uploadSpeedChartData=" + this.f43143i + ")";
        }

        public /* synthetic */ c(Long l10, s sVar, AbstractC1432b abstractC1432b, Integer num, Integer num2, Long l11, ArrayList arrayList, Long l12, ArrayList arrayList2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : l10, sVar, abstractC1432b, num, num2, l11, arrayList, l12, arrayList2);
        }
    }

    public /* synthetic */ b(long j10, String str, String str2, EnumC4076c enumC4076c, long j11, List list, d dVar, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, str, str2, enumC4076c, j11, list, dVar, list2);
    }
}
