package Bc;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public interface a {

    /* renamed from: Bc.a$a, reason: collision with other inner class name */
    public static final class C0052a {

        /* renamed from: a, reason: collision with root package name */
        private final String f1268a;

        /* renamed from: b, reason: collision with root package name */
        private final V7.a f1269b;

        /* renamed from: c, reason: collision with root package name */
        private final V7.b f1270c;

        /* renamed from: d, reason: collision with root package name */
        private final List f1271d;

        /* renamed from: Bc.a$a$a, reason: collision with other inner class name */
        public static final class C0053a {

            /* renamed from: a, reason: collision with root package name */
            private final V7.a f1272a;

            /* renamed from: b, reason: collision with root package name */
            private final long f1273b;

            public C0053a(V7.a aVar, long j10) {
                this.f1272a = aVar;
                this.f1273b = j10;
            }

            public final V7.a a() {
                return this.f1272a;
            }

            public final long b() {
                return this.f1273b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0053a)) {
                    return false;
                }
                C0053a c0053a = (C0053a) obj;
                return AbstractC6492s.d(this.f1272a, c0053a.f1272a) && this.f1273b == c0053a.f1273b;
            }

            public int hashCode() {
                V7.a aVar = this.f1272a;
                return ((aVar == null ? 0 : aVar.hashCode()) * 31) + Long.hashCode(this.f1273b);
            }

            public String toString() {
                return "Record(signal=" + this.f1272a + ", timestamp=" + this.f1273b + ")";
            }
        }

        public C0052a(String str, V7.a aVar, V7.b bVar, List history) {
            AbstractC6492s.i(history, "history");
            this.f1268a = str;
            this.f1269b = aVar;
            this.f1270c = bVar;
            this.f1271d = history;
        }

        public final V7.a a() {
            return this.f1269b;
        }

        public final List b() {
            return this.f1271d;
        }

        public final String c() {
            return this.f1268a;
        }

        public final V7.b d() {
            return this.f1270c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0052a)) {
                return false;
            }
            C0052a c0052a = (C0052a) obj;
            return AbstractC6492s.d(this.f1268a, c0052a.f1268a) && AbstractC6492s.d(this.f1269b, c0052a.f1269b) && AbstractC6492s.d(this.f1270c, c0052a.f1270c) && AbstractC6492s.d(this.f1271d, c0052a.f1271d);
        }

        public int hashCode() {
            String str = this.f1268a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            V7.a aVar = this.f1269b;
            int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            V7.b bVar = this.f1270c;
            return ((iHashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.f1271d.hashCode();
        }

        public String toString() {
            return "SignalState(provider=" + this.f1268a + ", current=" + this.f1269b + ", type=" + this.f1270c + ", history=" + this.f1271d + ")";
        }
    }

    public static abstract class b {

        /* renamed from: Bc.a$b$a, reason: collision with other inner class name */
        public static abstract class AbstractC0054a extends b {

            /* renamed from: Bc.a$b$a$a, reason: collision with other inner class name */
            public static final class C0055a extends AbstractC0054a {

                /* renamed from: a, reason: collision with root package name */
                public static final C0055a f1274a = new C0055a();

                private C0055a() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0055a);
                }

                public int hashCode() {
                    return 1707140830;
                }

                public String toString() {
                    return "Absent";
                }
            }

            /* renamed from: Bc.a$b$a$b, reason: collision with other inner class name */
            public static abstract class AbstractC0056b extends AbstractC0054a {

                /* renamed from: Bc.a$b$a$b$a, reason: collision with other inner class name */
                public static final class C0057a extends AbstractC0056b {

                    /* renamed from: a, reason: collision with root package name */
                    private final String f1275a;

                    /* renamed from: b, reason: collision with root package name */
                    private final V7.b f1276b;

                    /* renamed from: c, reason: collision with root package name */
                    private final V7.a f1277c;

                    public C0057a(String str, V7.b bVar, V7.a aVar) {
                        super(null);
                        this.f1275a = str;
                        this.f1276b = bVar;
                        this.f1277c = aVar;
                    }

                    @Override // Bc.a.b.AbstractC0054a.AbstractC0056b
                    public String a() {
                        return this.f1275a;
                    }

                    @Override // Bc.a.b.AbstractC0054a.AbstractC0056b
                    public V7.a b() {
                        return this.f1277c;
                    }

                    @Override // Bc.a.b.AbstractC0054a.AbstractC0056b
                    public V7.b c() {
                        return this.f1276b;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C0057a)) {
                            return false;
                        }
                        C0057a c0057a = (C0057a) obj;
                        return AbstractC6492s.d(this.f1275a, c0057a.f1275a) && AbstractC6492s.d(this.f1276b, c0057a.f1276b) && AbstractC6492s.d(this.f1277c, c0057a.f1277c);
                    }

                    public int hashCode() {
                        String str = this.f1275a;
                        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                        V7.b bVar = this.f1276b;
                        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
                        V7.a aVar = this.f1277c;
                        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
                    }

                    public String toString() {
                        return "Primary(provider=" + this.f1275a + ", type=" + this.f1276b + ", signal=" + this.f1277c + ")";
                    }
                }

                /* renamed from: Bc.a$b$a$b$b, reason: collision with other inner class name */
                public static final class C0058b extends AbstractC0056b {

                    /* renamed from: a, reason: collision with root package name */
                    private final String f1278a;

                    /* renamed from: b, reason: collision with root package name */
                    private final V7.b f1279b;

                    /* renamed from: c, reason: collision with root package name */
                    private final V7.a f1280c;

                    public C0058b(String str, V7.b bVar, V7.a aVar) {
                        super(null);
                        this.f1278a = str;
                        this.f1279b = bVar;
                        this.f1280c = aVar;
                    }

                    @Override // Bc.a.b.AbstractC0054a.AbstractC0056b
                    public String a() {
                        return this.f1278a;
                    }

                    @Override // Bc.a.b.AbstractC0054a.AbstractC0056b
                    public V7.a b() {
                        return this.f1280c;
                    }

                    @Override // Bc.a.b.AbstractC0054a.AbstractC0056b
                    public V7.b c() {
                        return this.f1279b;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C0058b)) {
                            return false;
                        }
                        C0058b c0058b = (C0058b) obj;
                        return AbstractC6492s.d(this.f1278a, c0058b.f1278a) && AbstractC6492s.d(this.f1279b, c0058b.f1279b) && AbstractC6492s.d(this.f1280c, c0058b.f1280c);
                    }

                    public int hashCode() {
                        String str = this.f1278a;
                        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                        V7.b bVar = this.f1279b;
                        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
                        V7.a aVar = this.f1280c;
                        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
                    }

                    public String toString() {
                        return "Secondary(provider=" + this.f1278a + ", type=" + this.f1279b + ", signal=" + this.f1280c + ")";
                    }
                }

                public /* synthetic */ AbstractC0056b(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public abstract String a();

                public abstract V7.a b();

                public abstract V7.b c();

                private AbstractC0056b() {
                    super(null);
                }
            }

            /* renamed from: Bc.a$b$a$c */
            public static final class c extends AbstractC0054a {

                /* renamed from: a, reason: collision with root package name */
                public static final c f1281a = new c();

                private c() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public int hashCode() {
                    return 2033596079;
                }

                public String toString() {
                    return "Locked";
                }
            }

            public /* synthetic */ AbstractC0054a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private AbstractC0054a() {
                super(null);
            }
        }

        /* renamed from: Bc.a$b$b, reason: collision with other inner class name */
        public static abstract class AbstractC0059b extends b {

            /* renamed from: Bc.a$b$b$a, reason: collision with other inner class name */
            public static final class C0060a extends AbstractC0059b {

                /* renamed from: a, reason: collision with root package name */
                public static final C0060a f1282a = new C0060a();

                private C0060a() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0060a);
                }

                public int hashCode() {
                    return -1633709041;
                }

                public String toString() {
                    return "LocationDisabled";
                }
            }

            /* renamed from: Bc.a$b$b$b, reason: collision with other inner class name */
            public static final class C0061b extends AbstractC0059b {

                /* renamed from: a, reason: collision with root package name */
                public static final C0061b f1283a = new C0061b();

                private C0061b() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0061b);
                }

                public int hashCode() {
                    return -895406484;
                }

                public String toString() {
                    return "MissingLocationPermission";
                }
            }

            /* renamed from: Bc.a$b$b$c */
            public static final class c extends AbstractC0059b {

                /* renamed from: a, reason: collision with root package name */
                public static final c f1284a = new c();

                private c() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public int hashCode() {
                    return -1413120262;
                }

                public String toString() {
                    return "MissingPhoneStatePermission";
                }
            }

            /* renamed from: Bc.a$b$b$d */
            public static final class d extends AbstractC0059b {

                /* renamed from: a, reason: collision with root package name */
                public static final d f1285a = new d();

                private d() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof d);
                }

                public int hashCode() {
                    return -1960005415;
                }

                public String toString() {
                    return "NotSupported";
                }
            }

            /* renamed from: Bc.a$b$b$e */
            public static final class e extends AbstractC0059b {

                /* renamed from: a, reason: collision with root package name */
                private final int f1286a;

                public e(int i10) {
                    super(null);
                    this.f1286a = i10;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof e) && this.f1286a == ((e) obj).f1286a;
                }

                public int hashCode() {
                    return Integer.hashCode(this.f1286a);
                }

                public String toString() {
                    return "SimSlotUnsupported(index=" + this.f1286a + ")";
                }
            }

            public /* synthetic */ AbstractC0059b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private AbstractC0059b() {
                super(null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    gg.i a();

    gg.i b();

    gg.i c();

    gg.i d();

    gg.i e();
}
