package N4;

import N4.F;
import java.util.List;

/* loaded from: classes3.dex */
final class p extends F.e.d.a.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f15233a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15234b;

    /* renamed from: c, reason: collision with root package name */
    private final List f15235c;

    /* renamed from: d, reason: collision with root package name */
    private final F.e.d.a.b.c f15236d;

    /* renamed from: e, reason: collision with root package name */
    private final int f15237e;

    static final class b extends F.e.d.a.b.c.AbstractC0571a {

        /* renamed from: a, reason: collision with root package name */
        private String f15238a;

        /* renamed from: b, reason: collision with root package name */
        private String f15239b;

        /* renamed from: c, reason: collision with root package name */
        private List f15240c;

        /* renamed from: d, reason: collision with root package name */
        private F.e.d.a.b.c f15241d;

        /* renamed from: e, reason: collision with root package name */
        private int f15242e;

        /* renamed from: f, reason: collision with root package name */
        private byte f15243f;

        b() {
        }

        @Override // N4.F.e.d.a.b.c.AbstractC0571a
        public F.e.d.a.b.c a() {
            String str;
            List list;
            if (this.f15243f == 1 && (str = this.f15238a) != null && (list = this.f15240c) != null) {
                return new p(str, this.f15239b, list, this.f15241d, this.f15242e);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f15238a == null) {
                sb2.append(" type");
            }
            if (this.f15240c == null) {
                sb2.append(" frames");
            }
            if ((1 & this.f15243f) == 0) {
                sb2.append(" overflowCount");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // N4.F.e.d.a.b.c.AbstractC0571a
        public F.e.d.a.b.c.AbstractC0571a b(F.e.d.a.b.c cVar) {
            this.f15241d = cVar;
            return this;
        }

        @Override // N4.F.e.d.a.b.c.AbstractC0571a
        public F.e.d.a.b.c.AbstractC0571a c(List list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f15240c = list;
            return this;
        }

        @Override // N4.F.e.d.a.b.c.AbstractC0571a
        public F.e.d.a.b.c.AbstractC0571a d(int i10) {
            this.f15242e = i10;
            this.f15243f = (byte) (this.f15243f | 1);
            return this;
        }

        @Override // N4.F.e.d.a.b.c.AbstractC0571a
        public F.e.d.a.b.c.AbstractC0571a e(String str) {
            this.f15239b = str;
            return this;
        }

        @Override // N4.F.e.d.a.b.c.AbstractC0571a
        public F.e.d.a.b.c.AbstractC0571a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f15238a = str;
            return this;
        }
    }

    @Override // N4.F.e.d.a.b.c
    public F.e.d.a.b.c b() {
        return this.f15236d;
    }

    @Override // N4.F.e.d.a.b.c
    public List c() {
        return this.f15235c;
    }

    @Override // N4.F.e.d.a.b.c
    public int d() {
        return this.f15237e;
    }

    @Override // N4.F.e.d.a.b.c
    public String e() {
        return this.f15234b;
    }

    public boolean equals(Object obj) {
        String str;
        F.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b.c)) {
            return false;
        }
        F.e.d.a.b.c cVar2 = (F.e.d.a.b.c) obj;
        return this.f15233a.equals(cVar2.f()) && ((str = this.f15234b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.f15235c.equals(cVar2.c()) && ((cVar = this.f15236d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.f15237e == cVar2.d();
    }

    @Override // N4.F.e.d.a.b.c
    public String f() {
        return this.f15233a;
    }

    public int hashCode() {
        int iHashCode = (this.f15233a.hashCode() ^ 1000003) * 1000003;
        String str = this.f15234b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f15235c.hashCode()) * 1000003;
        F.e.d.a.b.c cVar = this.f15236d;
        return ((iHashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.f15237e;
    }

    public String toString() {
        return "Exception{type=" + this.f15233a + ", reason=" + this.f15234b + ", frames=" + this.f15235c + ", causedBy=" + this.f15236d + ", overflowCount=" + this.f15237e + "}";
    }

    private p(String str, String str2, List list, F.e.d.a.b.c cVar, int i10) {
        this.f15233a = str;
        this.f15234b = str2;
        this.f15235c = list;
        this.f15236d = cVar;
        this.f15237e = i10;
    }
}
