package B;

/* renamed from: B.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2446j {

    /* renamed from: b, reason: collision with root package name */
    public static final int f976b = V.b.f22937d;

    /* renamed from: a, reason: collision with root package name */
    private final V.b f977a = new V.b(new a[16], 0);

    /* renamed from: B.j$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f978a;

        /* renamed from: b, reason: collision with root package name */
        private final int f979b;

        public a(int i10, int i11) {
            this.f978a = i10;
            this.f979b = i11;
            if (i10 < 0) {
                throw new IllegalArgumentException("negative start index");
            }
            if (i11 < i10) {
                throw new IllegalArgumentException("end index greater than start");
            }
        }

        public final int a() {
            return this.f979b;
        }

        public final int b() {
            return this.f978a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f978a == aVar.f978a && this.f979b == aVar.f979b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f978a) * 31) + Integer.hashCode(this.f979b);
        }

        public String toString() {
            return "Interval(start=" + this.f978a + ", end=" + this.f979b + ')';
        }
    }

    public final a a(int i10, int i11) {
        a aVar = new a(i10, i11);
        this.f977a.b(aVar);
        return aVar;
    }

    public final int b() {
        int iA = ((a) this.f977a.l()).a();
        V.b bVar = this.f977a;
        int iO = bVar.o();
        if (iO > 0) {
            Object[] objArrM = bVar.m();
            int i10 = 0;
            do {
                a aVar = (a) objArrM[i10];
                if (aVar.a() > iA) {
                    iA = aVar.a();
                }
                i10++;
            } while (i10 < iO);
        }
        return iA;
    }

    public final int c() {
        int iB = ((a) this.f977a.l()).b();
        V.b bVar = this.f977a;
        int iO = bVar.o();
        if (iO > 0) {
            Object[] objArrM = bVar.m();
            int i10 = 0;
            do {
                a aVar = (a) objArrM[i10];
                if (aVar.b() < iB) {
                    iB = aVar.b();
                }
                i10++;
            } while (i10 < iO);
        }
        if (iB >= 0) {
            return iB;
        }
        throw new IllegalArgumentException("negative minIndex");
    }

    public final boolean d() {
        return this.f977a.u();
    }

    public final void e(a aVar) {
        this.f977a.x(aVar);
    }
}
