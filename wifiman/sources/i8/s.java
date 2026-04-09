package i8;

import Qe.c;
import Zg.AbstractC3689v;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.ubnt.usurvey.ui.splash.SplashActivity;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* loaded from: classes3.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final a f49070a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Uri.Builder c() {
            Uri.Builder builderAuthority = new Uri.Builder().scheme("wifiman").authority("deeplink_v1");
            AbstractC6492s.h(builderAuthority, "authority(...)");
            return builderAuthority;
        }

        public final s b(Uri uri) {
            AbstractC6492s.i(uri, "uri");
            if (!AbstractC6492s.d(uri.getScheme(), "wifiman") || !AbstractC6492s.d(uri.getAuthority(), "deeplink_v1")) {
                uri = null;
            }
            if (uri == null) {
                return null;
            }
            s sVarA = c.f49071c.a(uri);
            return (sVarA == null && (sVarA = g.f49078c.a(uri)) == null && (sVarA = f.f49075d.a(uri)) == null) ? e.a.f49074b.b(uri) : sVarA;
        }

        public final Intent d(Context context, s deeplink) {
            AbstractC6492s.i(context, "context");
            AbstractC6492s.i(deeplink, "deeplink");
            Intent data = new Intent(context, (Class<?>) SplashActivity.class).setData(deeplink.a());
            AbstractC6492s.h(data, "setData(...)");
            return data;
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class b {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        private final String path;
        public static final b HOME_SPEED = new b("HOME_SPEED", 0, "/home/speed");
        public static final b HOME_SIGNAL = new b("HOME_SIGNAL", 1, "/home/signal");
        public static final b HOME_SCAN = new b("HOME_SCAN", 2, "/home/scan");
        public static final b HOME_DISCOVERY = new b("HOME_DISCOVERY", 3, "/home/discovery");
        public static final b HOME_TELEPORT = new b("HOME_TELEPORT", 4, "/home/teleport");
        public static final b TELEPORT_INVITATION = new b("TELEPORT_INVITATION", 5, "/teleport/invitation");
        public static final b TELEPORT_CONNECT_SSO_CONSOLE = new b("TELEPORT_CONNECT_SSO_CONSOLE", 6, "/teleport/connect");
        public static final b SPEEDTEST_INTERNET = new b("SPEEDTEST_INTERNET", 7, "/speed/internet");

        private static final /* synthetic */ b[] $values() {
            return new b[]{HOME_SPEED, HOME_SIGNAL, HOME_SCAN, HOME_DISCOVERY, HOME_TELEPORT, TELEPORT_INVITATION, TELEPORT_CONNECT_SSO_CONSOLE, SPEEDTEST_INTERNET};
        }

        static {
            b[] bVarArr$values = $values();
            $VALUES = bVarArr$values;
            $ENTRIES = AbstractC5827b.a(bVarArr$values);
        }

        private b(String str, int i10, String str2) {
            this.path = str2;
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

        public final String getPath() {
            return this.path;
        }
    }

    public static final class c extends s {

        /* renamed from: c, reason: collision with root package name */
        public static final a f49071c = new a(null);

        /* renamed from: b, reason: collision with root package name */
        private final c.a f49072b;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(Uri uri) {
                AbstractC6492s.i(uri, "uri");
                String path = uri.getPath();
                if (AbstractC6492s.d(path, b.HOME_SPEED.getPath())) {
                    return new c(c.a.SPEED);
                }
                if (AbstractC6492s.d(path, b.HOME_SIGNAL.getPath())) {
                    return new c(c.a.SIGNAL);
                }
                if (AbstractC6492s.d(path, b.HOME_SCAN.getPath())) {
                    return new c(c.a.SCAN);
                }
                if (AbstractC6492s.d(path, b.HOME_DISCOVERY.getPath())) {
                    return new c(c.a.DISCOVERY);
                }
                if (AbstractC6492s.d(path, b.HOME_TELEPORT.getPath())) {
                    return new c(c.a.TELEPORT);
                }
                return null;
            }

            private a() {
            }
        }

        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f49073a;

            static {
                int[] iArr = new int[c.a.values().length];
                try {
                    iArr[c.a.SPEED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.a.SIGNAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c.a.SCAN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[c.a.DISCOVERY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[c.a.TELEPORT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f49073a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(c.a tab) {
            super(null);
            AbstractC6492s.i(tab, "tab");
            this.f49072b = tab;
        }

        @Override // i8.s
        public Uri a() {
            b bVar;
            Uri.Builder builderC = s.f49070a.c();
            int i10 = b.f49073a[this.f49072b.ordinal()];
            if (i10 == 1) {
                bVar = b.HOME_SPEED;
            } else if (i10 == 2) {
                bVar = b.HOME_SIGNAL;
            } else if (i10 == 3) {
                bVar = b.HOME_SCAN;
            } else if (i10 == 4) {
                bVar = b.HOME_DISCOVERY;
            } else {
                if (i10 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = b.HOME_TELEPORT;
            }
            Uri uriBuild = builderC.path(bVar.getPath()).build();
            AbstractC6492s.h(uriBuild, "build(...)");
            return uriBuild;
        }

        public final c.a b() {
            return this.f49072b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f49072b == ((c) obj).f49072b;
        }

        public int hashCode() {
            return this.f49072b.hashCode();
        }

        public String toString() {
            return "Home(tab=" + this.f49072b + ")";
        }
    }

    public interface d {
        gg.n a();

        gg.i b();

        void c(Intent intent);
    }

    public static abstract class e extends s {

        public static final class a extends e {

            /* renamed from: b, reason: collision with root package name */
            public static final a f49074b = new a();

            private a() {
                super(null);
            }

            @Override // i8.s
            public Uri a() {
                Uri uriBuild = s.f49070a.c().path(b.SPEEDTEST_INTERNET.getPath()).build();
                AbstractC6492s.h(uriBuild, "build(...)");
                return uriBuild;
            }

            public final a b(Uri uri) {
                AbstractC6492s.i(uri, "uri");
                if (AbstractC6492s.d(uri.getPath(), b.SPEEDTEST_INTERNET.getPath())) {
                    return f49074b;
                }
                return null;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -771702953;
            }

            public String toString() {
                return "Start";
            }
        }

        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private e() {
            super(null);
        }
    }

    public static final class f extends s {

        /* renamed from: d, reason: collision with root package name */
        public static final a f49075d = new a(null);

        /* renamed from: b, reason: collision with root package name */
        private final String f49076b;

        /* renamed from: c, reason: collision with root package name */
        private final String f49077c;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final s a(Uri uri) {
                AbstractC6492s.i(uri, "uri");
                Uri uri2 = AbstractC6492s.d(uri.getPath(), b.TELEPORT_CONNECT_SSO_CONSOLE.getPath()) ? uri : null;
                if (uri2 == null) {
                    return null;
                }
                String queryParameter = uri2.getQueryParameter("account");
                String queryParameter2 = uri2.getQueryParameter("console");
                if (queryParameter != null && !kotlin.text.t.m0(queryParameter) && queryParameter2 != null && !kotlin.text.t.m0(queryParameter2)) {
                    return new f(queryParameter, queryParameter2);
                }
                Z7.b.j("Deep link " + uri + " contains no account or console ID", null, null, 6, null);
                return null;
            }

            private a() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String ssoAccountId, String consoleId) {
            super(null);
            AbstractC6492s.i(ssoAccountId, "ssoAccountId");
            AbstractC6492s.i(consoleId, "consoleId");
            this.f49076b = ssoAccountId;
            this.f49077c = consoleId;
        }

        @Override // i8.s
        public Uri a() {
            Uri uriBuild = s.f49070a.c().path(b.TELEPORT_CONNECT_SSO_CONSOLE.getPath()).appendQueryParameter("account", this.f49076b).appendQueryParameter("console", this.f49077c).build();
            AbstractC6492s.h(uriBuild, "build(...)");
            return uriBuild;
        }

        public final String b() {
            return this.f49077c;
        }

        public final String c() {
            return this.f49076b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return AbstractC6492s.d(this.f49076b, fVar.f49076b) && AbstractC6492s.d(this.f49077c, fVar.f49077c);
        }

        public int hashCode() {
            return (this.f49076b.hashCode() * 31) + this.f49077c.hashCode();
        }

        public String toString() {
            return "TeleportConnectConsole(ssoAccountId=" + this.f49076b + ", consoleId=" + this.f49077c + ")";
        }
    }

    public static final class g extends s {

        /* renamed from: c, reason: collision with root package name */
        public static final a f49078c = new a(null);

        /* renamed from: b, reason: collision with root package name */
        private final String f49079b;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final s a(Uri uri) {
                String lastPathSegment;
                List listI0;
                AbstractC6492s.i(uri, "uri");
                List<String> pathSegments = uri.getPathSegments();
                if (!AbstractC6492s.d((pathSegments == null || (listI0 = AbstractC3689v.i0(pathSegments, 1)) == null) ? null : AbstractC3689v.z0(listI0, MqttTopic.TOPIC_LEVEL_SEPARATOR, null, null, 0, null, null, 62, null), b.TELEPORT_INVITATION.getPath()) || (lastPathSegment = uri.getLastPathSegment()) == null) {
                    return null;
                }
                return new g(lastPathSegment);
            }

            private a() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String token) {
            super(null);
            AbstractC6492s.i(token, "token");
            this.f49079b = token;
        }

        @Override // i8.s
        public Uri a() {
            Uri uriBuild = s.f49070a.c().path(b.TELEPORT_INVITATION.getPath()).appendPath(this.f49079b).build();
            AbstractC6492s.h(uriBuild, "build(...)");
            return uriBuild;
        }

        public final String b() {
            return this.f49079b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && AbstractC6492s.d(this.f49079b, ((g) obj).f49079b);
        }

        public int hashCode() {
            return this.f49079b.hashCode();
        }

        public String toString() {
            return "TeleportInvitation(token=" + this.f49079b + ")";
        }
    }

    public /* synthetic */ s(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Uri a();

    private s() {
    }
}
