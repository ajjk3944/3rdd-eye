package N4;

import N4.F;
import java.util.List;

/* loaded from: classes3.dex */
final class n extends F.e.d.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final List f15214a;

    /* renamed from: b, reason: collision with root package name */
    private final F.e.d.a.b.c f15215b;

    /* renamed from: c, reason: collision with root package name */
    private final F.a f15216c;

    /* renamed from: d, reason: collision with root package name */
    private final F.e.d.a.b.AbstractC0572d f15217d;

    /* renamed from: e, reason: collision with root package name */
    private final List f15218e;

    static final class b extends F.e.d.a.b.AbstractC0570b {

        /* renamed from: a, reason: collision with root package name */
        private List f15219a;

        /* renamed from: b, reason: collision with root package name */
        private F.e.d.a.b.c f15220b;

        /* renamed from: c, reason: collision with root package name */
        private F.a f15221c;

        /* renamed from: d, reason: collision with root package name */
        private F.e.d.a.b.AbstractC0572d f15222d;

        /* renamed from: e, reason: collision with root package name */
        private List f15223e;

        b() {
        }

        @Override // N4.F.e.d.a.b.AbstractC0570b
        public F.e.d.a.b a() {
            List list;
            F.e.d.a.b.AbstractC0572d abstractC0572d = this.f15222d;
            if (abstractC0572d != null && (list = this.f15223e) != null) {
                return new n(this.f15219a, this.f15220b, this.f15221c, abstractC0572d, list);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f15222d == null) {
                sb2.append(" signal");
            }
            if (this.f15223e == null) {
                sb2.append(" binaries");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // N4.F.e.d.a.b.AbstractC0570b
        public F.e.d.a.b.AbstractC0570b b(F.a aVar) {
            this.f15221c = aVar;
            return this;
        }

        @Override // N4.F.e.d.a.b.AbstractC0570b
        public F.e.d.a.b.AbstractC0570b c(List list) {
            if (list == null) {
                throw new NullPointerException("Null binaries");
            }
            this.f15223e = list;
            return this;
        }

        @Override // N4.F.e.d.a.b.AbstractC0570b
        public F.e.d.a.b.AbstractC0570b d(F.e.d.a.b.c cVar) {
            this.f15220b = cVar;
            return this;
        }

        @Override // N4.F.e.d.a.b.AbstractC0570b
        public F.e.d.a.b.AbstractC0570b e(F.e.d.a.b.AbstractC0572d abstractC0572d) {
            if (abstractC0572d == null) {
                throw new NullPointerException("Null signal");
            }
            this.f15222d = abstractC0572d;
            return this;
        }

        @Override // N4.F.e.d.a.b.AbstractC0570b
        public F.e.d.a.b.AbstractC0570b f(List list) {
            this.f15219a = list;
            return this;
        }
    }

    @Override // N4.F.e.d.a.b
    public F.a b() {
        return this.f15216c;
    }

    @Override // N4.F.e.d.a.b
    public List c() {
        return this.f15218e;
    }

    @Override // N4.F.e.d.a.b
    public F.e.d.a.b.c d() {
        return this.f15215b;
    }

    @Override // N4.F.e.d.a.b
    public F.e.d.a.b.AbstractC0572d e() {
        return this.f15217d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b)) {
            return false;
        }
        F.e.d.a.b bVar = (F.e.d.a.b) obj;
        List list = this.f15214a;
        if (list != null ? list.equals(bVar.f()) : bVar.f() == null) {
            F.e.d.a.b.c cVar = this.f15215b;
            if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                F.a aVar = this.f15216c;
                if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                    if (this.f15217d.equals(bVar.e()) && this.f15218e.equals(bVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // N4.F.e.d.a.b
    public List f() {
        return this.f15214a;
    }

    public int hashCode() {
        List list = this.f15214a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        F.e.d.a.b.c cVar = this.f15215b;
        int iHashCode2 = (iHashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        F.a aVar = this.f15216c;
        return ((((iHashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ this.f15217d.hashCode()) * 1000003) ^ this.f15218e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f15214a + ", exception=" + this.f15215b + ", appExitInfo=" + this.f15216c + ", signal=" + this.f15217d + ", binaries=" + this.f15218e + "}";
    }

    private n(List list, F.e.d.a.b.c cVar, F.a aVar, F.e.d.a.b.AbstractC0572d abstractC0572d, List list2) {
        this.f15214a = list;
        this.f15215b = cVar;
        this.f15216c = aVar;
        this.f15217d = abstractC0572d;
        this.f15218e = list2;
    }
}
