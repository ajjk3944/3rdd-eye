package Ce;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final d f2649a;

    /* renamed from: b, reason: collision with root package name */
    private final e f2650b;

    /* renamed from: c, reason: collision with root package name */
    private final c f2651c;

    /* renamed from: d, reason: collision with root package name */
    private final C0130a f2652d;

    /* renamed from: e, reason: collision with root package name */
    private final b f2653e;

    /* renamed from: Ce.a$a, reason: collision with other inner class name */
    public static final class C0130a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f2654a;

        public C0130a(boolean z10) {
            this.f2654a = z10;
        }

        public final boolean a() {
            return this.f2654a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0130a) && this.f2654a == ((C0130a) obj).f2654a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f2654a);
        }

        public String toString() {
            return "Au(rcm=" + this.f2654a + ")";
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f2655a;

        public b(String anatel) {
            AbstractC6492s.i(anatel, "anatel");
            this.f2655a = anatel;
        }

        public final String a() {
            return this.f2655a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC6492s.d(this.f2655a, ((b) obj).f2655a);
        }

        public int hashCode() {
            return this.f2655a.hashCode();
        }

        public String toString() {
            return "Br(anatel=" + this.f2655a + ")";
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f2656a;

        /* renamed from: b, reason: collision with root package name */
        private final String f2657b;

        /* renamed from: c, reason: collision with root package name */
        private final Ci.c f2658c;

        public c(String ic2, String icEmi, Ci.c warning) {
            AbstractC6492s.i(ic2, "ic");
            AbstractC6492s.i(icEmi, "icEmi");
            AbstractC6492s.i(warning, "warning");
            this.f2656a = ic2;
            this.f2657b = icEmi;
            this.f2658c = warning;
        }

        public final String a() {
            return this.f2656a;
        }

        public final String b() {
            return this.f2657b;
        }

        public final Ci.c c() {
            return this.f2658c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC6492s.d(this.f2656a, cVar.f2656a) && AbstractC6492s.d(this.f2657b, cVar.f2657b) && AbstractC6492s.d(this.f2658c, cVar.f2658c);
        }

        public int hashCode() {
            return (((this.f2656a.hashCode() * 31) + this.f2657b.hashCode()) * 31) + this.f2658c.hashCode();
        }

        public String toString() {
            return "Ca(ic=" + this.f2656a + ", icEmi=" + this.f2657b + ", warning=" + this.f2658c + ")";
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f2659a;

        /* renamed from: b, reason: collision with root package name */
        private final String f2660b;

        public d(String productName, String complianceUrl) {
            AbstractC6492s.i(productName, "productName");
            AbstractC6492s.i(complianceUrl, "complianceUrl");
            this.f2659a = productName;
            this.f2660b = complianceUrl;
        }

        public final String a() {
            return this.f2660b;
        }

        public final String b() {
            return this.f2659a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC6492s.d(this.f2659a, dVar.f2659a) && AbstractC6492s.d(this.f2660b, dVar.f2660b);
        }

        public int hashCode() {
            return (this.f2659a.hashCode() * 31) + this.f2660b.hashCode();
        }

        public String toString() {
            return "Header(productName=" + this.f2659a + ", complianceUrl=" + this.f2660b + ")";
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private final String f2661a;

        /* renamed from: b, reason: collision with root package name */
        private final Ci.c f2662b;

        public e(String fcc, Ci.c warning) {
            AbstractC6492s.i(fcc, "fcc");
            AbstractC6492s.i(warning, "warning");
            this.f2661a = fcc;
            this.f2662b = warning;
        }

        public final String a() {
            return this.f2661a;
        }

        public final Ci.c b() {
            return this.f2662b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return AbstractC6492s.d(this.f2661a, eVar.f2661a) && AbstractC6492s.d(this.f2662b, eVar.f2662b);
        }

        public int hashCode() {
            return (this.f2661a.hashCode() * 31) + this.f2662b.hashCode();
        }

        public String toString() {
            return "US(fcc=" + this.f2661a + ", warning=" + this.f2662b + ")";
        }
    }

    public a(d header, e eVar, c cVar, C0130a c0130a, b bVar) {
        AbstractC6492s.i(header, "header");
        this.f2649a = header;
        this.f2650b = eVar;
        this.f2651c = cVar;
        this.f2652d = c0130a;
        this.f2653e = bVar;
    }

    public final C0130a a() {
        return this.f2652d;
    }

    public final b b() {
        return this.f2653e;
    }

    public final c c() {
        return this.f2651c;
    }

    public final d d() {
        return this.f2649a;
    }

    public final e e() {
        return this.f2650b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC6492s.d(this.f2649a, aVar.f2649a) && AbstractC6492s.d(this.f2650b, aVar.f2650b) && AbstractC6492s.d(this.f2651c, aVar.f2651c) && AbstractC6492s.d(this.f2652d, aVar.f2652d) && AbstractC6492s.d(this.f2653e, aVar.f2653e);
    }

    public int hashCode() {
        int iHashCode = this.f2649a.hashCode() * 31;
        e eVar = this.f2650b;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        c cVar = this.f2651c;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        C0130a c0130a = this.f2652d;
        int iHashCode4 = (iHashCode3 + (c0130a == null ? 0 : c0130a.hashCode())) * 31;
        b bVar = this.f2653e;
        return iHashCode4 + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "ELabel(header=" + this.f2649a + ", us=" + this.f2650b + ", ca=" + this.f2651c + ", au=" + this.f2652d + ", br=" + this.f2653e + ")";
    }

    public /* synthetic */ a(d dVar, e eVar, c cVar, C0130a c0130a, b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, (i10 & 2) != 0 ? null : eVar, (i10 & 4) != 0 ? null : cVar, (i10 & 8) != 0 ? null : c0130a, (i10 & 16) != 0 ? null : bVar);
    }
}
