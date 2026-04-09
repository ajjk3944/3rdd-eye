package com.ui.wifiman.model.speedtest.internet;

import com.ui.wifiman.model.speedtest.Speedtest;
import gg.AbstractC5912b;
import gg.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes4.dex */
public interface InternetSpeedtest extends Speedtest {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0001\u0006B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$Error;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "LWc/d;", "<init>", "()V", "NoServerAvailable", "Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$Error$NoServerAvailable;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Error extends RuntimeException implements Wc.d {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$Error$NoServerAvailable;", "Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$Error;", "", "message", "<init>", "(Ljava/lang/String;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class NoServerAvailable extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            public NoServerAvailable() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NoServerAvailable(String message) {
                super(null);
                AbstractC6492s.i(message, "message");
                this.message = message;
            }

            public /* synthetic */ NoServerAvailable(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? "No Internet servers available" : str);
            }
        }

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Error() {
        }
    }

    public static final class a implements Speedtest.b {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f42941a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f42942b;

        public a(boolean z10, boolean z11) {
            this.f42941a = z10;
            this.f42942b = z11;
        }

        public final boolean a() {
            return this.f42941a;
        }

        public final boolean b() {
            return this.f42942b;
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final String f42943a;

            /* renamed from: b, reason: collision with root package name */
            private final String f42944b;

            /* renamed from: c, reason: collision with root package name */
            private final String f42945c;

            /* renamed from: d, reason: collision with root package name */
            private final Integer f42946d;

            /* renamed from: e, reason: collision with root package name */
            private final String f42947e;

            /* renamed from: f, reason: collision with root package name */
            private final Integer f42948f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, String str2, String url, Integer num, String str3, Integer num2) {
                super(null);
                AbstractC6492s.i(url, "url");
                this.f42943a = str;
                this.f42944b = str2;
                this.f42945c = url;
                this.f42946d = num;
                this.f42947e = str3;
                this.f42948f = num2;
            }

            public static /* synthetic */ a g(a aVar, String str, String str2, String str3, Integer num, String str4, Integer num2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = aVar.f42943a;
                }
                if ((i10 & 2) != 0) {
                    str2 = aVar.f42944b;
                }
                String str5 = str2;
                if ((i10 & 4) != 0) {
                    str3 = aVar.f42945c;
                }
                String str6 = str3;
                if ((i10 & 8) != 0) {
                    num = aVar.f42946d;
                }
                Integer num3 = num;
                if ((i10 & 16) != 0) {
                    str4 = aVar.f42947e;
                }
                String str7 = str4;
                if ((i10 & 32) != 0) {
                    num2 = aVar.f42948f;
                }
                return aVar.f(str, str5, str6, num3, str7, num2);
            }

            @Override // com.ui.wifiman.model.speedtest.internet.InternetSpeedtest.b
            public String a() {
                return d();
            }

            @Override // com.ui.wifiman.model.speedtest.internet.InternetSpeedtest.b
            public Integer b() {
                return this.f42946d;
            }

            @Override // com.ui.wifiman.model.speedtest.internet.InternetSpeedtest.b
            public String c() {
                return this.f42944b;
            }

            @Override // com.ui.wifiman.model.speedtest.internet.InternetSpeedtest.b
            public String d() {
                return this.f42945c;
            }

            @Override // com.ui.wifiman.model.speedtest.internet.InternetSpeedtest.b
            public String e() {
                return this.f42947e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return AbstractC6492s.d(this.f42943a, aVar.f42943a) && AbstractC6492s.d(this.f42944b, aVar.f42944b) && AbstractC6492s.d(this.f42945c, aVar.f42945c) && AbstractC6492s.d(this.f42946d, aVar.f42946d) && AbstractC6492s.d(this.f42947e, aVar.f42947e) && AbstractC6492s.d(this.f42948f, aVar.f42948f);
            }

            public final a f(String str, String str2, String url, Integer num, String str3, Integer num2) {
                AbstractC6492s.i(url, "url");
                return new a(str, str2, url, num, str3, num2);
            }

            public final String h() {
                return this.f42944b;
            }

            public int hashCode() {
                String str = this.f42943a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f42944b;
                int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f42945c.hashCode()) * 31;
                Integer num = this.f42946d;
                int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
                String str3 = this.f42947e;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Integer num2 = this.f42948f;
                return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
            }

            public final String i() {
                return this.f42943a;
            }

            public String toString() {
                return "ISP(logoUrl=" + this.f42943a + ", ispName=" + this.f42944b + ", url=" + this.f42945c + ", latencyMillis=" + this.f42946d + ", version=" + this.f42947e + ", jitterMillis=" + this.f42948f + ")";
            }
        }

        /* renamed from: com.ui.wifiman.model.speedtest.internet.InternetSpeedtest$b$b, reason: collision with other inner class name */
        public static final class C1420b extends b {

            /* renamed from: a, reason: collision with root package name */
            private final String f42949a;

            /* renamed from: b, reason: collision with root package name */
            private final String f42950b;

            /* renamed from: c, reason: collision with root package name */
            private final String f42951c;

            /* renamed from: d, reason: collision with root package name */
            private final String f42952d;

            /* renamed from: e, reason: collision with root package name */
            private final W7.c f42953e;

            /* renamed from: f, reason: collision with root package name */
            private final String f42954f;

            /* renamed from: g, reason: collision with root package name */
            private final String f42955g;

            /* renamed from: h, reason: collision with root package name */
            private final Long f42956h;

            /* renamed from: i, reason: collision with root package name */
            private final Float f42957i;

            /* renamed from: j, reason: collision with root package name */
            private final Integer f42958j;

            /* renamed from: k, reason: collision with root package name */
            private final Integer f42959k;

            /* renamed from: l, reason: collision with root package name */
            private final String f42960l;

            public /* synthetic */ C1420b(String str, String str2, String str3, String str4, W7.c cVar, String str5, String str6, Long l10, Float f10, Integer num, Integer num2, String str7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : cVar, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? null : str6, (i10 & 128) != 0 ? null : l10, (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : f10, (i10 & 512) != 0 ? null : num, (i10 & 1024) != 0 ? null : num2, (i10 & 2048) == 0 ? str7 : null);
            }

            @Override // com.ui.wifiman.model.speedtest.internet.InternetSpeedtest.b
            public String a() {
                return d();
            }

            @Override // com.ui.wifiman.model.speedtest.internet.InternetSpeedtest.b
            public Integer b() {
                return this.f42958j;
            }

            @Override // com.ui.wifiman.model.speedtest.internet.InternetSpeedtest.b
            public String c() {
                return this.f42954f;
            }

            @Override // com.ui.wifiman.model.speedtest.internet.InternetSpeedtest.b
            public String d() {
                return this.f42949a;
            }

            @Override // com.ui.wifiman.model.speedtest.internet.InternetSpeedtest.b
            public String e() {
                return this.f42960l;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1420b)) {
                    return false;
                }
                C1420b c1420b = (C1420b) obj;
                return AbstractC6492s.d(this.f42949a, c1420b.f42949a) && AbstractC6492s.d(this.f42950b, c1420b.f42950b) && AbstractC6492s.d(this.f42951c, c1420b.f42951c) && AbstractC6492s.d(this.f42952d, c1420b.f42952d) && AbstractC6492s.d(this.f42953e, c1420b.f42953e) && AbstractC6492s.d(this.f42954f, c1420b.f42954f) && AbstractC6492s.d(this.f42955g, c1420b.f42955g) && AbstractC6492s.d(this.f42956h, c1420b.f42956h) && AbstractC6492s.d(this.f42957i, c1420b.f42957i) && AbstractC6492s.d(this.f42958j, c1420b.f42958j) && AbstractC6492s.d(this.f42959k, c1420b.f42959k) && AbstractC6492s.d(this.f42960l, c1420b.f42960l);
            }

            public final C1420b f(String url, String str, String str2, String str3, W7.c cVar, String str4, String str5, Long l10, Float f10, Integer num, Integer num2, String str6) {
                AbstractC6492s.i(url, "url");
                return new C1420b(url, str, str2, str3, cVar, str4, str5, l10, f10, num, num2, str6);
            }

            public final String h() {
                return this.f42950b;
            }

            public int hashCode() {
                int iHashCode = this.f42949a.hashCode() * 31;
                String str = this.f42950b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f42951c;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f42952d;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                W7.c cVar = this.f42953e;
                int iHashCode5 = (iHashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
                String str4 = this.f42954f;
                int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.f42955g;
                int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
                Long l10 = this.f42956h;
                int iHashCode8 = (iHashCode7 + (l10 == null ? 0 : l10.hashCode())) * 31;
                Float f10 = this.f42957i;
                int iHashCode9 = (iHashCode8 + (f10 == null ? 0 : f10.hashCode())) * 31;
                Integer num = this.f42958j;
                int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.f42959k;
                int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
                String str6 = this.f42960l;
                return iHashCode11 + (str6 != null ? str6.hashCode() : 0);
            }

            public final String i() {
                return this.f42951c;
            }

            public final String j() {
                return this.f42952d;
            }

            public final Float k() {
                return this.f42957i;
            }

            public Integer l() {
                return this.f42959k;
            }

            public final W7.c m() {
                return this.f42953e;
            }

            public final String n() {
                return this.f42955g;
            }

            public final Long o() {
                return this.f42956h;
            }

            public String toString() {
                return "Internet(url=" + this.f42949a + ", city=" + this.f42950b + ", country=" + this.f42951c + ", countryCode=" + this.f42952d + ", location=" + this.f42953e + ", provider=" + this.f42954f + ", providerUrl=" + this.f42955g + ", speedMpbs=" + this.f42956h + ", distanceMeters=" + this.f42957i + ", latencyMillis=" + this.f42958j + ", jitterMillis=" + this.f42959k + ", version=" + this.f42960l + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1420b(String url, String str, String str2, String str3, W7.c cVar, String str4, String str5, Long l10, Float f10, Integer num, Integer num2, String str6) {
                super(null);
                AbstractC6492s.i(url, "url");
                this.f42949a = url;
                this.f42950b = str;
                this.f42951c = str2;
                this.f42952d = str3;
                this.f42953e = cVar;
                this.f42954f = str4;
                this.f42955g = str5;
                this.f42956h = l10;
                this.f42957i = f10;
                this.f42958j = num;
                this.f42959k = num2;
                this.f42960l = str6;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract String a();

        public abstract Integer b();

        public abstract String c();

        public abstract String d();

        public abstract String e();

        private b() {
        }
    }

    public static abstract class c {

        public static final class a extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final a f42961a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -2099620857;
            }

            public String toString() {
                return "Auto";
            }
        }

        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            private final b.a f42962a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(b.a server) {
                super(null);
                AbstractC6492s.i(server, "server");
                this.f42962a = server;
            }

            public final b.a a() {
                return this.f42962a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC6492s.d(this.f42962a, ((b) obj).f42962a);
            }

            public int hashCode() {
                return this.f42962a.hashCode();
            }

            public String toString() {
                return "ISP(server=" + this.f42962a + ")";
            }
        }

        /* renamed from: com.ui.wifiman.model.speedtest.internet.InternetSpeedtest$c$c, reason: collision with other inner class name */
        public static final class C1421c extends c {

            /* renamed from: a, reason: collision with root package name */
            private final b.C1420b f42963a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1421c(b.C1420b server) {
                super(null);
                AbstractC6492s.i(server, "server");
                this.f42963a = server;
            }

            public final b.C1420b a() {
                return this.f42963a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1421c) && AbstractC6492s.d(this.f42963a, ((C1421c) obj).f42963a);
            }

            public int hashCode() {
                return this.f42963a.hashCode();
            }

            public String toString() {
                return "Manual(server=" + this.f42963a + ")";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public interface d {

        public static abstract class a {

            /* renamed from: com.ui.wifiman.model.speedtest.internet.InternetSpeedtest$d$a$a, reason: collision with other inner class name */
            public static final class C1422a extends a {

                /* renamed from: a, reason: collision with root package name */
                public static final C1422a f42964a = new C1422a();

                private C1422a() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1422a);
                }

                public int hashCode() {
                    return 1004854034;
                }

                public String toString() {
                    return "InProgress";
                }
            }

            public static final class b extends a {

                /* renamed from: a, reason: collision with root package name */
                private final b f42965a;

                /* renamed from: b, reason: collision with root package name */
                private final List f42966b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(b mainServer, List secondaryServers) {
                    super(null);
                    AbstractC6492s.i(mainServer, "mainServer");
                    AbstractC6492s.i(secondaryServers, "secondaryServers");
                    this.f42965a = mainServer;
                    this.f42966b = secondaryServers;
                }

                public final b a() {
                    return this.f42965a;
                }

                public final List b() {
                    return this.f42966b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return AbstractC6492s.d(this.f42965a, bVar.f42965a) && AbstractC6492s.d(this.f42966b, bVar.f42966b);
                }

                public int hashCode() {
                    return (this.f42965a.hashCode() * 31) + this.f42966b.hashCode();
                }

                public String toString() {
                    return "Ready(mainServer=" + this.f42965a + ", secondaryServers=" + this.f42966b + ")";
                }
            }

            public static final class c extends a {

                /* renamed from: a, reason: collision with root package name */
                public static final c f42967a = new c();

                private c() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public int hashCode() {
                    return -772091984;
                }

                public String toString() {
                    return "Unavailable";
                }
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        AbstractC5912b a(c cVar);

        i b();

        i c();

        i d();
    }
}
