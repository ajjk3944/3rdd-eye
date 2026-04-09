package com.ui.wifiman.model.ubiquiti.uisp;

import Wc.d;
import gg.AbstractC5912b;
import gg.i;
import inet.ipaddr.g;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pd.s;

/* loaded from: classes4.dex */
public interface UispController {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0002\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$Error;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "LWc/d;", "<init>", "()V", "ControllerApiUnavailable", "TokenUnavailable", "Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$Error$ControllerApiUnavailable;", "Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$Error$TokenUnavailable;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Error extends RuntimeException implements d {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$Error$ControllerApiUnavailable;", "Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ControllerApiUnavailable extends Error {

            /* renamed from: a, reason: collision with root package name */
            public static final ControllerApiUnavailable f43913a = new ControllerApiUnavailable();

            private ControllerApiUnavailable() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof ControllerApiUnavailable);
            }

            public int hashCode() {
                return -1305557551;
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "ControllerApiUnavailable";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$Error$TokenUnavailable;", "Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TokenUnavailable extends Error {

            /* renamed from: a, reason: collision with root package name */
            public static final TokenUnavailable f43914a = new TokenUnavailable();

            private TokenUnavailable() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof TokenUnavailable);
            }

            public int hashCode() {
                return 1693922518;
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "TokenUnavailable";
            }
        }

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Error() {
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f43915a;

        /* renamed from: b, reason: collision with root package name */
        private final String f43916b;

        /* renamed from: c, reason: collision with root package name */
        private final String f43917c;

        /* renamed from: d, reason: collision with root package name */
        private final String f43918d;

        /* renamed from: e, reason: collision with root package name */
        private final String f43919e;

        public a(String str, String str2, String str3, String str4, String str5) {
            this.f43915a = str;
            this.f43916b = str2;
            this.f43917c = str3;
            this.f43918d = str4;
            this.f43919e = str5;
        }

        public final String a() {
            return this.f43918d;
        }

        public final String b() {
            return this.f43917c;
        }

        public final String c() {
            return this.f43916b;
        }

        public final String d() {
            return this.f43915a;
        }

        public final String e() {
            return this.f43919e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f43915a, aVar.f43915a) && AbstractC6492s.d(this.f43916b, aVar.f43916b) && AbstractC6492s.d(this.f43917c, aVar.f43917c) && AbstractC6492s.d(this.f43918d, aVar.f43918d) && AbstractC6492s.d(this.f43919e, aVar.f43919e);
        }

        public int hashCode() {
            String str = this.f43915a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f43916b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f43917c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f43918d;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f43919e;
            return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "IspInfo(name=" + this.f43915a + ", logoUrl=" + this.f43916b + ", contactPhone=" + this.f43917c + ", contactEmail=" + this.f43918d + ", websiteUrl=" + this.f43919e + ")";
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f43920a;

        /* renamed from: b, reason: collision with root package name */
        private final g f43921b;

        /* renamed from: c, reason: collision with root package name */
        private final Long f43922c;

        /* renamed from: d, reason: collision with root package name */
        private final Long f43923d;

        /* renamed from: e, reason: collision with root package name */
        private final s f43924e;

        /* renamed from: f, reason: collision with root package name */
        private final String f43925f;

        /* renamed from: g, reason: collision with root package name */
        private final Long f43926g;

        /* renamed from: h, reason: collision with root package name */
        private final Long f43927h;

        public b(String str, g gVar, Long l10, Long l11, s type, String str2, Long l12, Long l13) {
            AbstractC6492s.i(type, "type");
            this.f43920a = str;
            this.f43921b = gVar;
            this.f43922c = l10;
            this.f43923d = l11;
            this.f43924e = type;
            this.f43925f = str2;
            this.f43926g = l12;
            this.f43927h = l13;
        }

        public final Long a() {
            return this.f43922c;
        }

        public final Long b() {
            return this.f43926g;
        }

        public final String c() {
            return this.f43920a;
        }

        public final g d() {
            return this.f43921b;
        }

        public final String e() {
            return this.f43925f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f43920a, bVar.f43920a) && AbstractC6492s.d(this.f43921b, bVar.f43921b) && AbstractC6492s.d(this.f43922c, bVar.f43922c) && AbstractC6492s.d(this.f43923d, bVar.f43923d) && this.f43924e == bVar.f43924e && AbstractC6492s.d(this.f43925f, bVar.f43925f) && AbstractC6492s.d(this.f43926g, bVar.f43926g) && AbstractC6492s.d(this.f43927h, bVar.f43927h);
        }

        public final s f() {
            return this.f43924e;
        }

        public final Long g() {
            return this.f43923d;
        }

        public final Long h() {
            return this.f43927h;
        }

        public int hashCode() {
            String str = this.f43920a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            g gVar = this.f43921b;
            int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
            Long l10 = this.f43922c;
            int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
            Long l11 = this.f43923d;
            int iHashCode4 = (((iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31) + this.f43924e.hashCode()) * 31;
            String str2 = this.f43925f;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l12 = this.f43926g;
            int iHashCode6 = (iHashCode5 + (l12 == null ? 0 : l12.hashCode())) * 31;
            Long l13 = this.f43927h;
            return iHashCode6 + (l13 != null ? l13.hashCode() : 0);
        }

        public String toString() {
            return "SpeedReport(ispName=" + this.f43920a + ", publicIp=" + this.f43921b + ", downloadRateBytes=" + this.f43922c + ", uploadRateBytes=" + this.f43923d + ", type=" + this.f43924e + ", serverName=" + this.f43925f + ", downloadSpeedBytes=" + this.f43926g + ", uploadSpeedBytes=" + this.f43927h + ")";
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f43928a;

        /* renamed from: b, reason: collision with root package name */
        private final String f43929b;

        /* renamed from: c, reason: collision with root package name */
        private final String f43930c;

        public c(String str, String str2, String url) {
            AbstractC6492s.i(url, "url");
            this.f43928a = str;
            this.f43929b = str2;
            this.f43930c = url;
        }

        public final String a() {
            return this.f43928a;
        }

        public final String b() {
            return this.f43929b;
        }

        public final String c() {
            return this.f43930c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC6492s.d(this.f43928a, cVar.f43928a) && AbstractC6492s.d(this.f43929b, cVar.f43929b) && AbstractC6492s.d(this.f43930c, cVar.f43930c);
        }

        public int hashCode() {
            String str = this.f43928a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f43929b;
            return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f43930c.hashCode();
        }

        public String toString() {
            return "SpeedtestServer(logoUrl=" + this.f43928a + ", provider=" + this.f43929b + ", url=" + this.f43930c + ")";
        }
    }

    i a();

    i b();

    AbstractC5912b c(b bVar);

    i d();
}
