package Ka;

import dh.InterfaceC5380e;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f10554a = new f();

    public interface a extends Ka.a {
        Object c(String str, InterfaceC5380e interfaceC5380e);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f10555a;

        public b(String str) {
            this.f10555a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC6492s.d(this.f10555a, ((b) obj).f10555a);
        }

        public int hashCode() {
            String str = this.f10555a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "HandshakeResponse(version=" + this.f10555a + ")";
        }
    }

    private f() {
    }

    public final a a(String str, La.c clientApp) {
        AbstractC6492s.i(clientApp, "clientApp");
        return new g(str, clientApp);
    }

    public interface c {

        public static final class a implements c {

            /* renamed from: a, reason: collision with root package name */
            private final List f10556a;

            /* renamed from: Ka.f$c$a$a, reason: collision with other inner class name */
            public static final class C0423a {

                /* renamed from: a, reason: collision with root package name */
                private final String f10557a;

                /* renamed from: b, reason: collision with root package name */
                private final int f10558b;

                /* renamed from: c, reason: collision with root package name */
                private final String f10559c;

                public C0423a(String url, int i10, String str) {
                    AbstractC6492s.i(url, "url");
                    this.f10557a = url;
                    this.f10558b = i10;
                    this.f10559c = str;
                }

                public final int a() {
                    return this.f10558b;
                }

                public final String b() {
                    return this.f10557a;
                }

                public final String c() {
                    return this.f10559c;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0423a)) {
                        return false;
                    }
                    C0423a c0423a = (C0423a) obj;
                    return AbstractC6492s.d(this.f10557a, c0423a.f10557a) && this.f10558b == c0423a.f10558b && AbstractC6492s.d(this.f10559c, c0423a.f10559c);
                }

                public int hashCode() {
                    int iHashCode = ((this.f10557a.hashCode() * 31) + Integer.hashCode(this.f10558b)) * 31;
                    String str = this.f10559c;
                    return iHashCode + (str == null ? 0 : str.hashCode());
                }

                public String toString() {
                    return "Server(url=" + this.f10557a + ", latencyMs=" + this.f10558b + ", version=" + this.f10559c + ")";
                }
            }

            public a(List servers) {
                AbstractC6492s.i(servers, "servers");
                this.f10556a = servers;
            }

            public final List a() {
                return this.f10556a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC6492s.d(this.f10556a, ((a) obj).f10556a);
            }

            public int hashCode() {
                return this.f10556a.hashCode();
            }

            public String toString() {
                return "Internet(servers=" + this.f10556a + ")";
            }
        }

        public static final class b implements c {

            /* renamed from: a, reason: collision with root package name */
            private final String f10560a;

            /* renamed from: b, reason: collision with root package name */
            private final int f10561b;

            /* renamed from: c, reason: collision with root package name */
            private final int f10562c;

            /* renamed from: d, reason: collision with root package name */
            private final boolean f10563d;

            /* renamed from: e, reason: collision with root package name */
            private final String f10564e;

            public b(String host, int i10, int i11, boolean z10, String str) {
                AbstractC6492s.i(host, "host");
                this.f10560a = host;
                this.f10561b = i10;
                this.f10562c = i11;
                this.f10563d = z10;
                this.f10564e = str;
            }

            public final boolean a() {
                return this.f10563d;
            }

            public final String b() {
                return this.f10560a;
            }

            public final int c() {
                return this.f10562c;
            }

            public final int d() {
                return this.f10561b;
            }

            public final String e() {
                return this.f10564e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return AbstractC6492s.d(this.f10560a, bVar.f10560a) && this.f10561b == bVar.f10561b && this.f10562c == bVar.f10562c && this.f10563d == bVar.f10563d && AbstractC6492s.d(this.f10564e, bVar.f10564e);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int iHashCode = ((((this.f10560a.hashCode() * 31) + Integer.hashCode(this.f10561b)) * 31) + Integer.hashCode(this.f10562c)) * 31;
                boolean z10 = this.f10563d;
                int i10 = z10;
                if (z10 != 0) {
                    i10 = 1;
                }
                int i11 = (iHashCode + i10) * 31;
                String str = this.f10564e;
                return i11 + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "Local(host=" + this.f10560a + ", port=" + this.f10561b + ", latencyMs=" + this.f10562c + ", durationInfinite=" + this.f10563d + ", serverVersion=" + this.f10564e + ")";
            }

            public /* synthetic */ b(String str, int i10, int i11, boolean z10, String str2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i10, i11, (i12 & 8) != 0 ? false : z10, str2);
            }
        }
    }
}
