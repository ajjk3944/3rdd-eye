package af;

import ff.EnumC5820a;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import hf.C6036h;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f26102a = new e0();

    public static abstract class a {

        /* renamed from: af.e0$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC1010a extends a {

            /* renamed from: af.e0$a$a$a, reason: collision with other inner class name */
            public static final class C1011a extends AbstractC1010a {

                /* renamed from: a, reason: collision with root package name */
                private final Boolean f26103a;

                /* renamed from: b, reason: collision with root package name */
                private final boolean f26104b;

                /* renamed from: c, reason: collision with root package name */
                private final s9.d f26105c;

                /* renamed from: d, reason: collision with root package name */
                private final b f26106d;

                public C1011a(Boolean bool, boolean z10, s9.d dVar) {
                    super(null);
                    this.f26103a = bool;
                    this.f26104b = z10;
                    this.f26105c = dVar;
                    this.f26106d = b.NO_RESULT;
                }

                @Override // af.e0.a
                public b a() {
                    return this.f26106d;
                }

                @Override // af.e0.a.AbstractC1010a
                public Boolean b() {
                    return this.f26103a;
                }

                @Override // af.e0.a.AbstractC1010a
                public s9.d c() {
                    return this.f26105c;
                }

                @Override // af.e0.a.AbstractC1010a
                public boolean d() {
                    return this.f26104b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1011a)) {
                        return false;
                    }
                    C1011a c1011a = (C1011a) obj;
                    return AbstractC6492s.d(this.f26103a, c1011a.f26103a) && this.f26104b == c1011a.f26104b && AbstractC6492s.d(this.f26105c, c1011a.f26105c);
                }

                public int hashCode() {
                    Boolean bool = this.f26103a;
                    int iHashCode = (((bool == null ? 0 : bool.hashCode()) * 31) + Boolean.hashCode(this.f26104b)) * 31;
                    s9.d dVar = this.f26105c;
                    return iHashCode + (dVar != null ? dVar.hashCode() : 0);
                }

                public String toString() {
                    return "NoResult(advancedTestEnabled=" + this.f26103a + ", startTestButtonEnabled=" + this.f26104b + ", selectedTestServerName=" + this.f26105c + ")";
                }
            }

            /* renamed from: af.e0$a$a$b */
            public static final class b extends AbstractC1010a {

                /* renamed from: a, reason: collision with root package name */
                private final Boolean f26107a;

                /* renamed from: b, reason: collision with root package name */
                private final boolean f26108b;

                /* renamed from: c, reason: collision with root package name */
                private final s9.d f26109c;

                /* renamed from: d, reason: collision with root package name */
                private final s9.d f26110d;

                /* renamed from: e, reason: collision with root package name */
                private final s9.d f26111e;

                /* renamed from: f, reason: collision with root package name */
                private final s9.d f26112f;

                /* renamed from: g, reason: collision with root package name */
                private final s9.d f26113g;

                /* renamed from: h, reason: collision with root package name */
                private final C6036h f26114h;

                /* renamed from: i, reason: collision with root package name */
                private final C6036h f26115i;

                /* renamed from: j, reason: collision with root package name */
                private final b f26116j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(Boolean bool, boolean z10, s9.d dVar, s9.d timestamp, s9.d direction, s9.d speed, s9.d latency, C6036h chartDown, C6036h chartUp) {
                    super(null);
                    AbstractC6492s.i(timestamp, "timestamp");
                    AbstractC6492s.i(direction, "direction");
                    AbstractC6492s.i(speed, "speed");
                    AbstractC6492s.i(latency, "latency");
                    AbstractC6492s.i(chartDown, "chartDown");
                    AbstractC6492s.i(chartUp, "chartUp");
                    this.f26107a = bool;
                    this.f26108b = z10;
                    this.f26109c = dVar;
                    this.f26110d = timestamp;
                    this.f26111e = direction;
                    this.f26112f = speed;
                    this.f26113g = latency;
                    this.f26114h = chartDown;
                    this.f26115i = chartUp;
                    this.f26116j = b.RESULT;
                }

                @Override // af.e0.a
                public b a() {
                    return this.f26116j;
                }

                @Override // af.e0.a.AbstractC1010a
                public Boolean b() {
                    return this.f26107a;
                }

                @Override // af.e0.a.AbstractC1010a
                public s9.d c() {
                    return this.f26109c;
                }

                @Override // af.e0.a.AbstractC1010a
                public boolean d() {
                    return this.f26108b;
                }

                public final C6036h e() {
                    return this.f26114h;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return AbstractC6492s.d(this.f26107a, bVar.f26107a) && this.f26108b == bVar.f26108b && AbstractC6492s.d(this.f26109c, bVar.f26109c) && AbstractC6492s.d(this.f26110d, bVar.f26110d) && AbstractC6492s.d(this.f26111e, bVar.f26111e) && AbstractC6492s.d(this.f26112f, bVar.f26112f) && AbstractC6492s.d(this.f26113g, bVar.f26113g) && AbstractC6492s.d(this.f26114h, bVar.f26114h) && AbstractC6492s.d(this.f26115i, bVar.f26115i);
                }

                public final C6036h f() {
                    return this.f26115i;
                }

                public final s9.d g() {
                    return this.f26111e;
                }

                public final s9.d h() {
                    return this.f26113g;
                }

                public int hashCode() {
                    Boolean bool = this.f26107a;
                    int iHashCode = (((bool == null ? 0 : bool.hashCode()) * 31) + Boolean.hashCode(this.f26108b)) * 31;
                    s9.d dVar = this.f26109c;
                    return ((((((((((((iHashCode + (dVar != null ? dVar.hashCode() : 0)) * 31) + this.f26110d.hashCode()) * 31) + this.f26111e.hashCode()) * 31) + this.f26112f.hashCode()) * 31) + this.f26113g.hashCode()) * 31) + this.f26114h.hashCode()) * 31) + this.f26115i.hashCode();
                }

                public final s9.d i() {
                    return this.f26112f;
                }

                public final s9.d j() {
                    return this.f26110d;
                }

                public String toString() {
                    return "Result(advancedTestEnabled=" + this.f26107a + ", startTestButtonEnabled=" + this.f26108b + ", selectedTestServerName=" + this.f26109c + ", timestamp=" + this.f26110d + ", direction=" + this.f26111e + ", speed=" + this.f26112f + ", latency=" + this.f26113g + ", chartDown=" + this.f26114h + ", chartUp=" + this.f26115i + ")";
                }
            }

            public /* synthetic */ AbstractC1010a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public abstract Boolean b();

            public abstract s9.d c();

            public abstract boolean d();

            private AbstractC1010a() {
                super(null);
            }
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f26117a = new b();

            /* renamed from: b, reason: collision with root package name */
            private static final b f26118b = b.LOADING;

            private b() {
                super(null);
            }

            @Override // af.e0.a
            public b a() {
                return f26118b;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -2128678296;
            }

            public String toString() {
                return "Loading";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract b a();

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b LOADING = new b("LOADING", 0);
        public static final b NO_RESULT = new b("NO_RESULT", 1);
        public static final b RESULT = new b("RESULT", 2);

        private static final /* synthetic */ b[] $values() {
            return new b[]{LOADING, NO_RESULT, RESULT};
        }

        static {
            b[] bVarArr$values = $values();
            $VALUES = bVarArr$values;
            $ENTRIES = AbstractC5827b.a(bVarArr$values);
        }

        private b(String str, int i10) {
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
    }

    private e0() {
    }

    public final C6036h a() {
        return new C6036h(EnumC5820a.DOWN, new float[]{0.6f, 0.65f, 0.7f, 0.75f, 0.8f, 0.81f, 0.73f, 0.7f, 0.82f, 0.62f, 0.68f, 0.73f, 0.75f, 0.75f, 0.8f, 0.88f, 0.84f, 0.89f, 0.9f, 0.91f, 0.88f, 0.84f, 0.81f, 0.75f, 0.8f, 0.88f, 0.84f, 0.89f, 0.9f, 0.91f, 0.6f, 0.65f, 0.7f, 0.75f, 0.8f, 0.81f, 0.73f, 0.7f, 0.82f, 0.62f});
    }

    public final C6036h b() {
        return new C6036h(EnumC5820a.UP, new float[]{0.5f, 0.55f, 0.56f, 0.82f, 0.85f, 0.74f, 0.76f, 0.6f, 0.65f, 0.65f, 0.64f, 0.75f, 0.7f, 0.72f, 0.75f, 0.76f, 0.8f, 0.72f, 0.76f, 0.8f, 0.82f, 0.83f, 0.74f, 0.82f, 0.85f, 0.74f, 0.76f, 0.6f, 0.65f, 0.65f, 0.64f, 0.75f, 0.7f, 0.72f, 0.75f, 0.76f, 0.8f, 0.72f, 0.76f, 0.8f});
    }
}
