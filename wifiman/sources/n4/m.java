package N4;

import N4.F;
import java.util.List;

/* loaded from: classes3.dex */
final class m extends F.e.d.a {

    /* renamed from: a, reason: collision with root package name */
    private final F.e.d.a.b f15199a;

    /* renamed from: b, reason: collision with root package name */
    private final List f15200b;

    /* renamed from: c, reason: collision with root package name */
    private final List f15201c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f15202d;

    /* renamed from: e, reason: collision with root package name */
    private final F.e.d.a.c f15203e;

    /* renamed from: f, reason: collision with root package name */
    private final List f15204f;

    /* renamed from: g, reason: collision with root package name */
    private final int f15205g;

    static final class b extends F.e.d.a.AbstractC0567a {

        /* renamed from: a, reason: collision with root package name */
        private F.e.d.a.b f15206a;

        /* renamed from: b, reason: collision with root package name */
        private List f15207b;

        /* renamed from: c, reason: collision with root package name */
        private List f15208c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f15209d;

        /* renamed from: e, reason: collision with root package name */
        private F.e.d.a.c f15210e;

        /* renamed from: f, reason: collision with root package name */
        private List f15211f;

        /* renamed from: g, reason: collision with root package name */
        private int f15212g;

        /* renamed from: h, reason: collision with root package name */
        private byte f15213h;

        @Override // N4.F.e.d.a.AbstractC0567a
        public F.e.d.a a() {
            F.e.d.a.b bVar;
            if (this.f15213h == 1 && (bVar = this.f15206a) != null) {
                return new m(bVar, this.f15207b, this.f15208c, this.f15209d, this.f15210e, this.f15211f, this.f15212g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f15206a == null) {
                sb2.append(" execution");
            }
            if ((1 & this.f15213h) == 0) {
                sb2.append(" uiOrientation");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // N4.F.e.d.a.AbstractC0567a
        public F.e.d.a.AbstractC0567a b(List list) {
            this.f15211f = list;
            return this;
        }

        @Override // N4.F.e.d.a.AbstractC0567a
        public F.e.d.a.AbstractC0567a c(Boolean bool) {
            this.f15209d = bool;
            return this;
        }

        @Override // N4.F.e.d.a.AbstractC0567a
        public F.e.d.a.AbstractC0567a d(F.e.d.a.c cVar) {
            this.f15210e = cVar;
            return this;
        }

        @Override // N4.F.e.d.a.AbstractC0567a
        public F.e.d.a.AbstractC0567a e(List list) {
            this.f15207b = list;
            return this;
        }

        @Override // N4.F.e.d.a.AbstractC0567a
        public F.e.d.a.AbstractC0567a f(F.e.d.a.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null execution");
            }
            this.f15206a = bVar;
            return this;
        }

        @Override // N4.F.e.d.a.AbstractC0567a
        public F.e.d.a.AbstractC0567a g(List list) {
            this.f15208c = list;
            return this;
        }

        @Override // N4.F.e.d.a.AbstractC0567a
        public F.e.d.a.AbstractC0567a h(int i10) {
            this.f15212g = i10;
            this.f15213h = (byte) (this.f15213h | 1);
            return this;
        }

        b() {
        }

        private b(F.e.d.a aVar) {
            this.f15206a = aVar.f();
            this.f15207b = aVar.e();
            this.f15208c = aVar.g();
            this.f15209d = aVar.c();
            this.f15210e = aVar.d();
            this.f15211f = aVar.b();
            this.f15212g = aVar.h();
            this.f15213h = (byte) 1;
        }
    }

    @Override // N4.F.e.d.a
    public List b() {
        return this.f15204f;
    }

    @Override // N4.F.e.d.a
    public Boolean c() {
        return this.f15202d;
    }

    @Override // N4.F.e.d.a
    public F.e.d.a.c d() {
        return this.f15203e;
    }

    @Override // N4.F.e.d.a
    public List e() {
        return this.f15200b;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        F.e.d.a.c cVar;
        List list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a)) {
            return false;
        }
        F.e.d.a aVar = (F.e.d.a) obj;
        return this.f15199a.equals(aVar.f()) && ((list = this.f15200b) != null ? list.equals(aVar.e()) : aVar.e() == null) && ((list2 = this.f15201c) != null ? list2.equals(aVar.g()) : aVar.g() == null) && ((bool = this.f15202d) != null ? bool.equals(aVar.c()) : aVar.c() == null) && ((cVar = this.f15203e) != null ? cVar.equals(aVar.d()) : aVar.d() == null) && ((list3 = this.f15204f) != null ? list3.equals(aVar.b()) : aVar.b() == null) && this.f15205g == aVar.h();
    }

    @Override // N4.F.e.d.a
    public F.e.d.a.b f() {
        return this.f15199a;
    }

    @Override // N4.F.e.d.a
    public List g() {
        return this.f15201c;
    }

    @Override // N4.F.e.d.a
    public int h() {
        return this.f15205g;
    }

    public int hashCode() {
        int iHashCode = (this.f15199a.hashCode() ^ 1000003) * 1000003;
        List list = this.f15200b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f15201c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f15202d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        F.e.d.a.c cVar = this.f15203e;
        int iHashCode5 = (iHashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List list3 = this.f15204f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f15205g;
    }

    @Override // N4.F.e.d.a
    public F.e.d.a.AbstractC0567a i() {
        return new b(this);
    }

    public String toString() {
        return "Application{execution=" + this.f15199a + ", customAttributes=" + this.f15200b + ", internalKeys=" + this.f15201c + ", background=" + this.f15202d + ", currentProcessDetails=" + this.f15203e + ", appProcessDetails=" + this.f15204f + ", uiOrientation=" + this.f15205g + "}";
    }

    private m(F.e.d.a.b bVar, List list, List list2, Boolean bool, F.e.d.a.c cVar, List list3, int i10) {
        this.f15199a = bVar;
        this.f15200b = list;
        this.f15201c = list2;
        this.f15202d = bool;
        this.f15203e = cVar;
        this.f15204f = list3;
        this.f15205g = i10;
    }
}
