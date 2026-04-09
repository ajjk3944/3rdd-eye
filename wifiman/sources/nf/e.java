package nf;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class e {

    public static final class a extends e {

        /* renamed from: a, reason: collision with root package name */
        private final inet.ipaddr.g f54646a;

        /* renamed from: b, reason: collision with root package name */
        private final int f54647b;

        /* renamed from: c, reason: collision with root package name */
        private final String f54648c;

        /* renamed from: d, reason: collision with root package name */
        private final String f54649d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(inet.ipaddr.g host, int i10, String str, String str2) {
            super(null);
            AbstractC6492s.i(host, "host");
            this.f54646a = host;
            this.f54647b = i10;
            this.f54648c = str;
            this.f54649d = str2;
        }

        public final inet.ipaddr.g a() {
            return this.f54646a;
        }

        public final String b() {
            return this.f54649d;
        }

        public final String c() {
            return this.f54648c;
        }

        public final int d() {
            return this.f54647b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f54646a, aVar.f54646a) && this.f54647b == aVar.f54647b && AbstractC6492s.d(this.f54648c, aVar.f54648c) && AbstractC6492s.d(this.f54649d, aVar.f54649d);
        }

        public int hashCode() {
            int iHashCode = ((this.f54646a.hashCode() * 31) + Integer.hashCode(this.f54647b)) * 31;
            String str = this.f54648c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f54649d;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "App2App(host=" + this.f54646a + ", port=" + this.f54647b + ", name=" + this.f54648c + ", model=" + this.f54649d + ")";
        }
    }

    public static final class b extends e {

        /* renamed from: a, reason: collision with root package name */
        private final inet.ipaddr.g f54650a;

        /* renamed from: b, reason: collision with root package name */
        private final String f54651b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(inet.ipaddr.g gatewayIp, String consoleId) {
            super(null);
            AbstractC6492s.i(gatewayIp, "gatewayIp");
            AbstractC6492s.i(consoleId, "consoleId");
            this.f54650a = gatewayIp;
            this.f54651b = consoleId;
        }

        public final String a() {
            return this.f54651b;
        }

        public final inet.ipaddr.g b() {
            return this.f54650a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f54650a, bVar.f54650a) && AbstractC6492s.d(this.f54651b, bVar.f54651b);
        }

        public int hashCode() {
            return (this.f54650a.hashCode() * 31) + this.f54651b.hashCode();
        }

        public String toString() {
            return "Combined(gatewayIp=" + this.f54650a + ", consoleId=" + this.f54651b + ")";
        }
    }

    public static final class c extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final c f54652a = new c();

        private c() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -815757388;
        }

        public String toString() {
            return "Internet";
        }
    }

    public static final class d extends e {

        /* renamed from: a, reason: collision with root package name */
        private final inet.ipaddr.g f54653a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(inet.ipaddr.g host) {
            super(null);
            AbstractC6492s.i(host, "host");
            this.f54653a = host;
        }

        public final inet.ipaddr.g a() {
            return this.f54653a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && AbstractC6492s.d(this.f54653a, ((d) obj).f54653a);
        }

        public int hashCode() {
            return this.f54653a.hashCode();
        }

        public String toString() {
            return "Local(host=" + this.f54653a + ")";
        }
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private e() {
    }
}
