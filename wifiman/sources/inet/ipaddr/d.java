package inet.ipaddr;

import java.io.Serializable;

/* loaded from: classes4.dex */
public abstract class d implements Cloneable, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f49293a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f49294b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f49295c;

    public static class a implements Cloneable, Serializable {

        /* renamed from: e, reason: collision with root package name */
        public static final c f49296e = c.f49310h;

        /* renamed from: a, reason: collision with root package name */
        public final c f49297a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f49298b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f49299c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f49300d;

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: inet.ipaddr.d$a$a, reason: collision with other inner class name */
        public static class C1857a {

            /* renamed from: a, reason: collision with root package name */
            protected c f49301a = a.f49296e;

            /* renamed from: b, reason: collision with root package name */
            protected boolean f49302b = true;

            /* renamed from: c, reason: collision with root package name */
            protected boolean f49303c = true;

            /* renamed from: d, reason: collision with root package name */
            protected boolean f49304d = true;

            protected C1857a() {
            }

            public C1857a a(boolean z10) {
                this.f49304d = z10;
                if (z10) {
                    this.f49303c = z10;
                }
                return this;
            }

            public C1857a b(boolean z10) {
                this.f49302b = z10;
                return this;
            }

            public C1857a c(c cVar) {
                this.f49301a = cVar;
                return this;
            }
        }

        public a(boolean z10, boolean z11, c cVar, boolean z12) {
            this.f49297a = cVar;
            cVar.getClass();
            this.f49298b = z12;
            this.f49299c = z10;
            this.f49300d = z11;
        }

        protected int c(a aVar) {
            int iCompareTo = this.f49297a.compareTo(aVar.f49297a);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompare = Boolean.compare(this.f49298b, aVar.f49298b);
            return iCompare == 0 ? Boolean.compare(this.f49299c, aVar.f49299c) : iCompare;
        }

        protected C1857a d(C1857a c1857a) {
            c1857a.f49304d = this.f49300d;
            c1857a.f49301a = this.f49297a;
            c1857a.f49302b = this.f49298b;
            c1857a.f49303c = this.f49299c;
            return c1857a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f49297a.equals(aVar.f49297a) && this.f49300d == aVar.f49300d && this.f49298b == aVar.f49298b && this.f49299c == aVar.f49299c;
        }

        public int hashCode() {
            int iHashCode = this.f49297a.hashCode();
            if (this.f49300d) {
                iHashCode |= 8;
            }
            if (this.f49298b) {
                iHashCode |= 16;
            }
            return this.f49299c ? iHashCode | 32 : iHashCode;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        protected boolean f49305a = true;

        /* renamed from: b, reason: collision with root package name */
        protected boolean f49306b = true;

        /* renamed from: c, reason: collision with root package name */
        protected boolean f49307c = true;

        public b a(boolean z10) {
            this.f49306b = z10;
            return this;
        }

        public b b(boolean z10) {
            this.f49305a = z10;
            return this;
        }

        public b c(boolean z10) {
            this.f49307c = z10;
            return this;
        }
    }

    public static class c implements Comparable, Cloneable, Serializable {

        /* renamed from: f, reason: collision with root package name */
        public static final c f49308f = new c(false, false, false, false, false);

        /* renamed from: g, reason: collision with root package name */
        public static final c f49309g = new c(true, false, false, false, true);

        /* renamed from: h, reason: collision with root package name */
        public static final c f49310h = new c(true, true, true, true, true);

        /* renamed from: a, reason: collision with root package name */
        private final boolean f49311a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f49312b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f49313c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f49314d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f49315e;

        public c(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
            this.f49311a = z10;
            this.f49312b = z11;
            this.f49313c = z12;
            this.f49315e = z13;
            this.f49314d = z14;
        }

        public boolean c() {
            return this.f49315e;
        }

        public boolean d() {
            return this.f49312b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f49311a == cVar.f49311a && this.f49312b == cVar.f49312b && this.f49313c == cVar.f49313c && this.f49315e == cVar.f49315e && this.f49314d == cVar.f49314d;
        }

        public boolean h() {
            return this.f49313c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        public int hashCode() {
            boolean z10 = this.f49311a;
            ?? r02 = z10;
            if (this.f49312b) {
                r02 = (z10 ? 1 : 0) | 2;
            }
            return this.f49314d ? r02 | 4 : r02;
        }

        public boolean l() {
            return this.f49314d;
        }

        public boolean n() {
            return this.f49311a;
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public c clone() {
            try {
                return (c) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }

        @Override // java.lang.Comparable
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            int iCompare = Boolean.compare(this.f49311a, cVar.f49311a);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompare2 = Boolean.compare(this.f49312b, cVar.f49312b);
            if (iCompare2 != 0) {
                return iCompare2;
            }
            int iCompare3 = Boolean.compare(this.f49314d, cVar.f49314d);
            if (iCompare3 != 0) {
                return iCompare3;
            }
            int iCompare4 = Boolean.compare(this.f49313c, cVar.f49313c);
            return iCompare4 == 0 ? Boolean.compare(this.f49315e, cVar.f49315e) : iCompare4;
        }

        public boolean t() {
            return (this.f49311a || this.f49312b || this.f49314d) ? false : true;
        }
    }

    public d(boolean z10, boolean z11, boolean z12) {
        this.f49293a = z10;
        this.f49294b = z11;
        this.f49295c = z12;
    }

    public d c() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public int d(d dVar) {
        int iCompare = Boolean.compare(this.f49294b, dVar.f49294b);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Boolean.compare(this.f49293a, dVar.f49293a);
        return iCompare2 == 0 ? Boolean.compare(this.f49295c, dVar.f49295c) : iCompare2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f49293a == dVar.f49293a && this.f49294b == dVar.f49294b && this.f49295c == dVar.f49295c;
    }

    public b h(b bVar) {
        bVar.f49306b = this.f49294b;
        bVar.f49305a = this.f49293a;
        bVar.f49307c = this.f49295c;
        return bVar;
    }
}
