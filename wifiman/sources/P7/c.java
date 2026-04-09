package P7;

import P7.c;
import android.os.Bundle;
import b8.EnumC4076c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;

/* loaded from: classes3.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        private final T7.b f18125a;

        /* renamed from: b, reason: collision with root package name */
        private final String f18126b;

        public a(T7.b daynight) {
            AbstractC6492s.i(daynight, "daynight");
            this.f18125a = daynight;
            this.f18126b = "app_start_cold";
        }

        @Override // P7.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putString("daynight", R7.a.a(this.f18125a));
            return bundle;
        }

        @Override // P7.c
        public String b() {
            return this.f18126b;
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        private final String f18127a = "ble_char_read_finished";

        @Override // P7.c
        public String b() {
            return this.f18127a;
        }
    }

    /* renamed from: P7.c$c, reason: collision with other inner class name */
    public static final class C0634c extends c {

        /* renamed from: a, reason: collision with root package name */
        private final String f18128a = "ble_char_read_started";

        @Override // P7.c
        public String b() {
            return this.f18128a;
        }
    }

    public static final class d extends c {

        /* renamed from: a, reason: collision with root package name */
        private final String f18129a;

        /* renamed from: b, reason: collision with root package name */
        private final String f18130b;

        public d(String uuid) {
            AbstractC6492s.i(uuid, "uuid");
            this.f18129a = uuid;
            this.f18130b = "ble_discovered_char";
        }

        @Override // P7.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putString("uuid", this.f18129a);
            return bundle;
        }

        @Override // P7.c
        public String b() {
            return this.f18130b;
        }
    }

    public static abstract class e extends c {

        /* renamed from: a, reason: collision with root package name */
        private final Yg.m f18131a = Yg.n.b(new InterfaceC6824a() { // from class: P7.d
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return c.e.f(this.f18191a);
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public static final String f(e eVar) {
            return eVar.d() + "_" + eVar.e();
        }

        @Override // P7.c
        public final String b() {
            return (String) this.f18131a.getValue();
        }

        public abstract String d();

        public abstract String e();
    }

    public static abstract class f extends e {

        /* renamed from: b, reason: collision with root package name */
        private final String f18132b;

        public static final class a extends f {

            /* renamed from: c, reason: collision with root package name */
            private final String f18133c;

            public a() {
                super(null);
                this.f18133c = "place_added";
            }

            @Override // P7.c.e
            public String e() {
                return this.f18133c;
            }
        }

        public static final class b extends f {

            /* renamed from: c, reason: collision with root package name */
            private final String f18134c;

            public b() {
                super(null);
                this.f18134c = "places_deleted";
            }

            @Override // P7.c.e
            public String e() {
                return this.f18134c;
            }
        }

        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // P7.c.e
        public String d() {
            return this.f18132b;
        }

        private f() {
            this.f18132b = "signal_mapper";
        }
    }

    public static abstract class g extends e {

        /* renamed from: b, reason: collision with root package name */
        private final String f18135b;

        public static final class a extends g {

            /* renamed from: c, reason: collision with root package name */
            private final String f18136c;

            public a() {
                super(null);
                this.f18136c = "delete";
            }

            @Override // P7.c.e
            public String e() {
                return this.f18136c;
            }
        }

        public static final class b extends g {

            /* renamed from: c, reason: collision with root package name */
            private final String f18137c;

            public b() {
                super(null);
                this.f18137c = "save";
            }

            @Override // P7.c.e
            public String e() {
                return this.f18137c;
            }
        }

        /* renamed from: P7.c$g$c, reason: collision with other inner class name */
        public static final class C0635c extends g {

            /* renamed from: c, reason: collision with root package name */
            private final String f18138c;

            public C0635c() {
                super(null);
                this.f18138c = "share";
            }

            @Override // P7.c.e
            public String e() {
                return this.f18138c;
            }
        }

        public static final class d extends g {

            /* renamed from: c, reason: collision with root package name */
            private final String f18139c;

            public d() {
                super(null);
                this.f18139c = "started";
            }

            @Override // P7.c.e
            public String e() {
                return this.f18139c;
            }
        }

        public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // P7.c.e
        public String d() {
            return this.f18135b;
        }

        private g() {
            this.f18135b = "signal_mapper_floorplan";
        }
    }

    public static abstract class h extends e {

        /* renamed from: b, reason: collision with root package name */
        private final String f18140b;

        public static final class a extends h {

            /* renamed from: c, reason: collision with root package name */
            private final String f18141c;

            public a() {
                super(null);
                this.f18141c = "isp_report_enabled";
            }

            @Override // P7.c.e
            public String e() {
                return this.f18141c;
            }
        }

        public static final class b extends h {

            /* renamed from: c, reason: collision with root package name */
            private final String f18142c;

            public b() {
                super(null);
                this.f18142c = "provider";
            }

            @Override // P7.c.e
            public String e() {
                return this.f18142c;
            }
        }

        /* renamed from: P7.c$h$c, reason: collision with other inner class name */
        public static final class C0636c extends h {

            /* renamed from: c, reason: collision with root package name */
            private final String f18143c;

            public C0636c() {
                super(null);
                this.f18143c = "result_share";
            }

            @Override // P7.c.e
            public String e() {
                return this.f18143c;
            }
        }

        public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // P7.c.e
        public String d() {
            return this.f18140b;
        }

        private h() {
            this.f18140b = "speedtest_detail";
        }
    }

    public static final class i extends c {

        /* renamed from: a, reason: collision with root package name */
        private final String f18144a;

        /* renamed from: b, reason: collision with root package name */
        private final String f18145b;

        /* renamed from: c, reason: collision with root package name */
        private final String f18146c;

        /* renamed from: d, reason: collision with root package name */
        private final String f18147d;

        public i(String step, String errorMessage, String str) {
            AbstractC6492s.i(step, "step");
            AbstractC6492s.i(errorMessage, "errorMessage");
            this.f18144a = step;
            this.f18145b = errorMessage;
            this.f18146c = str;
            this.f18147d = "speedtest_failed";
        }

        @Override // P7.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putString("in_step", this.f18144a);
            bundle.putString("error", this.f18145b);
            bundle.putString("server", this.f18146c);
            bundle.putString(this.f18144a + " - Errors", this.f18145b);
            bundle.putString(this.f18144a + " - Servers", this.f18146c);
            return bundle;
        }

        @Override // P7.c
        public String b() {
            return this.f18147d;
        }
    }

    public static final class j extends c {

        /* renamed from: a, reason: collision with root package name */
        private final String f18148a;

        /* renamed from: b, reason: collision with root package name */
        private final String f18149b;

        /* renamed from: c, reason: collision with root package name */
        private final inet.ipaddr.g f18150c;

        /* renamed from: d, reason: collision with root package name */
        private final String f18151d;

        public j(String step, String errorMessage, inet.ipaddr.g gVar) {
            AbstractC6492s.i(step, "step");
            AbstractC6492s.i(errorMessage, "errorMessage");
            this.f18148a = step;
            this.f18149b = errorMessage;
            this.f18150c = gVar;
            this.f18151d = "speedtest_failed_local";
        }

        @Override // P7.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putString("in_step", this.f18148a);
            bundle.putString("error", this.f18149b);
            bundle.putString("server", String.valueOf(this.f18150c));
            bundle.putString(this.f18148a + " - Errors", this.f18149b);
            bundle.putString(this.f18148a + " - Servers", String.valueOf(this.f18150c));
            return bundle;
        }

        @Override // P7.c
        public String b() {
            return this.f18151d;
        }
    }

    public static final class k extends c {

        /* renamed from: a, reason: collision with root package name */
        private final Long f18152a;

        /* renamed from: b, reason: collision with root package name */
        private final Long f18153b;

        /* renamed from: c, reason: collision with root package name */
        private final Long f18154c;

        /* renamed from: d, reason: collision with root package name */
        private final Long f18155d;

        /* renamed from: e, reason: collision with root package name */
        private final Integer f18156e;

        /* renamed from: f, reason: collision with root package name */
        private final EnumC4076c f18157f;

        /* renamed from: g, reason: collision with root package name */
        private final String f18158g = "speedtest_result_combined";

        public k(Long l10, Long l11, Long l12, Long l13, Integer num, EnumC4076c enumC4076c) {
            this.f18152a = l10;
            this.f18153b = l11;
            this.f18154c = l12;
            this.f18155d = l13;
            this.f18156e = num;
            this.f18157f = enumC4076c;
        }

        @Override // P7.c
        public Bundle a() {
            String strA;
            Bundle bundle = new Bundle();
            if (this.f18156e != null) {
                bundle.putInt("latency", this.f18156e.intValue());
            }
            if (this.f18154c != null) {
                bundle.putLong("speed_download", this.f18154c.longValue());
            }
            if (this.f18155d != null) {
                bundle.putLong("speed_upload", this.f18155d.longValue());
            }
            if (this.f18152a != null) {
                bundle.putLong("speed_download_console", this.f18152a.longValue());
            }
            if (this.f18153b != null) {
                bundle.putLong("speed_upload_console", this.f18153b.longValue());
            }
            EnumC4076c enumC4076c = this.f18157f;
            if (enumC4076c != null && (strA = R7.b.a(enumC4076c)) != null) {
                bundle.putString("network_type", strA);
            }
            return bundle;
        }

        @Override // P7.c
        public String b() {
            return this.f18158g;
        }
    }

    public static final class l extends c {

        /* renamed from: a, reason: collision with root package name */
        private final String f18159a;

        /* renamed from: b, reason: collision with root package name */
        private final String f18160b;

        /* renamed from: c, reason: collision with root package name */
        private final Long f18161c;

        /* renamed from: d, reason: collision with root package name */
        private final Long f18162d;

        /* renamed from: e, reason: collision with root package name */
        private final Integer f18163e;

        /* renamed from: f, reason: collision with root package name */
        private final EnumC4076c f18164f;

        /* renamed from: g, reason: collision with root package name */
        private final String f18165g = "speedtest_result";

        public l(String str, String str2, Long l10, Long l11, Integer num, EnumC4076c enumC4076c) {
            this.f18159a = str;
            this.f18160b = str2;
            this.f18161c = l10;
            this.f18162d = l11;
            this.f18163e = num;
            this.f18164f = enumC4076c;
        }

        @Override // P7.c
        public Bundle a() {
            String strA;
            Bundle bundle = new Bundle();
            String str = this.f18159a;
            if (str != null) {
                bundle.putString("server", str);
            }
            String str2 = this.f18160b;
            if (str2 != null) {
                bundle.putString("provider", str2);
            }
            if (this.f18163e != null) {
                bundle.putInt("latency", this.f18163e.intValue());
            }
            if (this.f18161c != null) {
                bundle.putLong("speed_download", this.f18161c.longValue());
            }
            if (this.f18162d != null) {
                bundle.putLong("speed_upload", this.f18162d.longValue());
            }
            EnumC4076c enumC4076c = this.f18164f;
            if (enumC4076c != null && (strA = R7.b.a(enumC4076c)) != null) {
                bundle.putString("network_type", strA);
            }
            return bundle;
        }

        @Override // P7.c
        public String b() {
            return this.f18165g;
        }
    }

    public static final class m extends c {

        /* renamed from: a, reason: collision with root package name */
        private final String f18166a;

        /* renamed from: b, reason: collision with root package name */
        private final Long f18167b;

        /* renamed from: c, reason: collision with root package name */
        private final Long f18168c;

        /* renamed from: d, reason: collision with root package name */
        private final Integer f18169d;

        /* renamed from: e, reason: collision with root package name */
        private final EnumC4076c f18170e;

        /* renamed from: f, reason: collision with root package name */
        private final String f18171f = "speedtest_result_lan";

        public m(String str, Long l10, Long l11, Integer num, EnumC4076c enumC4076c) {
            this.f18166a = str;
            this.f18167b = l10;
            this.f18168c = l11;
            this.f18169d = num;
            this.f18170e = enumC4076c;
        }

        @Override // P7.c
        public Bundle a() {
            String strA;
            Bundle bundle = new Bundle();
            String str = this.f18166a;
            if (str != null) {
                bundle.putString("server", str);
            }
            if (this.f18169d != null) {
                bundle.putInt("latency", this.f18169d.intValue());
            }
            if (this.f18167b != null) {
                bundle.putLong("speed_download", this.f18167b.longValue());
            }
            if (this.f18168c != null) {
                bundle.putLong("speed_upload", this.f18168c.longValue());
            }
            EnumC4076c enumC4076c = this.f18170e;
            if (enumC4076c != null && (strA = R7.b.a(enumC4076c)) != null) {
                bundle.putString("network_type", strA);
            }
            return bundle;
        }

        @Override // P7.c
        public String b() {
            return this.f18171f;
        }
    }

    public static final class n extends c {

        /* renamed from: a, reason: collision with root package name */
        private final String f18172a;

        /* renamed from: b, reason: collision with root package name */
        private final Long f18173b;

        /* renamed from: c, reason: collision with root package name */
        private final Long f18174c;

        /* renamed from: d, reason: collision with root package name */
        private final Integer f18175d;

        /* renamed from: e, reason: collision with root package name */
        private final EnumC4076c f18176e;

        /* renamed from: f, reason: collision with root package name */
        private final String f18177f = "speedtest_result_local";

        public n(String str, Long l10, Long l11, Integer num, EnumC4076c enumC4076c) {
            this.f18172a = str;
            this.f18173b = l10;
            this.f18174c = l11;
            this.f18175d = num;
            this.f18176e = enumC4076c;
        }

        @Override // P7.c
        public Bundle a() {
            String strA;
            Bundle bundle = new Bundle();
            String str = this.f18172a;
            if (str != null) {
                bundle.putString("server", str);
            }
            if (this.f18175d != null) {
                bundle.putInt("latency", this.f18175d.intValue());
            }
            if (this.f18173b != null) {
                bundle.putLong("speed_download", this.f18173b.longValue());
            }
            if (this.f18174c != null) {
                bundle.putLong("speed_upload", this.f18174c.longValue());
            }
            EnumC4076c enumC4076c = this.f18176e;
            if (enumC4076c != null && (strA = R7.b.a(enumC4076c)) != null) {
                bundle.putString("network_type", strA);
            }
            return bundle;
        }

        @Override // P7.c
        public String b() {
            return this.f18177f;
        }
    }

    public static final class o extends c {

        /* renamed from: a, reason: collision with root package name */
        private final String f18178a;

        /* renamed from: b, reason: collision with root package name */
        private final String f18179b;

        /* renamed from: c, reason: collision with root package name */
        private final String f18180c;

        public o(String serverAddress, String serverProvider) {
            AbstractC6492s.i(serverAddress, "serverAddress");
            AbstractC6492s.i(serverProvider, "serverProvider");
            this.f18178a = serverAddress;
            this.f18179b = serverProvider;
            this.f18180c = "speedtest_started";
        }

        @Override // P7.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putString("server", this.f18178a);
            bundle.putString("provider", this.f18179b);
            return bundle;
        }

        @Override // P7.c
        public String b() {
            return this.f18180c;
        }
    }

    public static abstract class p extends e {

        /* renamed from: b, reason: collision with root package name */
        private final String f18181b;

        public static final class a extends p {

            /* renamed from: c, reason: collision with root package name */
            private final Throwable f18182c;

            /* renamed from: d, reason: collision with root package name */
            private final String f18183d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Throwable error) {
                super(null);
                AbstractC6492s.i(error, "error");
                this.f18182c = error;
                this.f18183d = "connect_failure";
            }

            @Override // P7.c
            public Bundle a() {
                Bundle bundle = new Bundle();
                bundle.putString("errorDescription", this.f18182c.toString());
                return bundle;
            }

            @Override // P7.c.e
            public String e() {
                return this.f18183d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC6492s.d(this.f18182c, ((a) obj).f18182c);
            }

            public int hashCode() {
                return this.f18182c.hashCode();
            }

            public String toString() {
                return "ConnectFailure(error=" + this.f18182c + ")";
            }
        }

        public static final class b extends p {

            /* renamed from: c, reason: collision with root package name */
            public static final b f18184c = new b();

            /* renamed from: d, reason: collision with root package name */
            private static final String f18185d = "connect_start";

            private b() {
                super(null);
            }

            @Override // P7.c.e
            public String e() {
                return f18185d;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 1307596118;
            }

            public String toString() {
                return "ConnectStart";
            }
        }

        /* renamed from: P7.c$p$c, reason: collision with other inner class name */
        public static final class C0637c extends p {

            /* renamed from: c, reason: collision with root package name */
            public static final C0637c f18186c = new C0637c();

            /* renamed from: d, reason: collision with root package name */
            private static final String f18187d = "connect_success";

            private C0637c() {
                super(null);
            }

            @Override // P7.c.e
            public String e() {
                return f18187d;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0637c);
            }

            public int hashCode() {
                return -1795529737;
            }

            public String toString() {
                return "ConnectSuccess";
            }
        }

        public /* synthetic */ p(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // P7.c.e
        public String d() {
            return this.f18181b;
        }

        private p() {
            this.f18181b = "teleport";
        }
    }

    public static abstract class q extends e {

        /* renamed from: b, reason: collision with root package name */
        private final String f18188b;

        public static final class a extends q {

            /* renamed from: c, reason: collision with root package name */
            private final String f18189c;

            public a() {
                super(null);
                this.f18189c = "conn_success";
            }

            @Override // P7.c.e
            public String e() {
                return this.f18189c;
            }
        }

        public static final class b extends q {

            /* renamed from: c, reason: collision with root package name */
            private final String f18190c;

            public b() {
                super(null);
                this.f18190c = "fw_update_success";
            }

            @Override // P7.c.e
            public String e() {
                return this.f18190c;
            }
        }

        public /* synthetic */ q(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // P7.c.e
        public String d() {
            return this.f18188b;
        }

        private q() {
            this.f18188b = "wmw";
        }
    }

    public Bundle a() {
        return null;
    }

    public abstract String b();
}
