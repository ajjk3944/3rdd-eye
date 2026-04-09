package x3;

import x3.n;

/* loaded from: classes2.dex */
public final class c extends n {

    /* renamed from: a, reason: collision with root package name */
    public final o f24916a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24917b;

    /* renamed from: c, reason: collision with root package name */
    public final u3.c f24918c;

    /* renamed from: d, reason: collision with root package name */
    public final u3.d f24919d;

    /* renamed from: e, reason: collision with root package name */
    public final u3.b f24920e;

    public static final class b extends n.a {

        /* renamed from: a, reason: collision with root package name */
        public o f24921a;

        /* renamed from: b, reason: collision with root package name */
        public String f24922b;

        /* renamed from: c, reason: collision with root package name */
        public u3.c f24923c;

        /* renamed from: d, reason: collision with root package name */
        public u3.d f24924d;

        /* renamed from: e, reason: collision with root package name */
        public u3.b f24925e;

        @Override // x3.n.a
        public n a() {
            String str = "";
            if (this.f24921a == null) {
                str = " transportContext";
            }
            if (this.f24922b == null) {
                str = str + " transportName";
            }
            if (this.f24923c == null) {
                str = str + " event";
            }
            if (this.f24924d == null) {
                str = str + " transformer";
            }
            if (this.f24925e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f24921a, this.f24922b, this.f24923c, this.f24924d, this.f24925e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // x3.n.a
        public n.a b(u3.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f24925e = bVar;
            return this;
        }

        @Override // x3.n.a
        public n.a c(u3.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null event");
            }
            this.f24923c = cVar;
            return this;
        }

        @Override // x3.n.a
        public n.a d(u3.d dVar) {
            if (dVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f24924d = dVar;
            return this;
        }

        @Override // x3.n.a
        public n.a e(o oVar) {
            if (oVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f24921a = oVar;
            return this;
        }

        @Override // x3.n.a
        public n.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f24922b = str;
            return this;
        }
    }

    @Override // x3.n
    public u3.b b() {
        return this.f24920e;
    }

    @Override // x3.n
    public u3.c c() {
        return this.f24918c;
    }

    @Override // x3.n
    public u3.d e() {
        return this.f24919d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f24916a.equals(nVar.f()) && this.f24917b.equals(nVar.g()) && this.f24918c.equals(nVar.c()) && this.f24919d.equals(nVar.e()) && this.f24920e.equals(nVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // x3.n
    public o f() {
        return this.f24916a;
    }

    @Override // x3.n
    public String g() {
        return this.f24917b;
    }

    public int hashCode() {
        return ((((((((this.f24916a.hashCode() ^ 1000003) * 1000003) ^ this.f24917b.hashCode()) * 1000003) ^ this.f24918c.hashCode()) * 1000003) ^ this.f24919d.hashCode()) * 1000003) ^ this.f24920e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f24916a + ", transportName=" + this.f24917b + ", event=" + this.f24918c + ", transformer=" + this.f24919d + ", encoding=" + this.f24920e + "}";
    }

    public c(o oVar, String str, u3.c cVar, u3.d dVar, u3.b bVar) {
        this.f24916a = oVar;
        this.f24917b = str;
        this.f24918c = cVar;
        this.f24919d = dVar;
        this.f24920e = bVar;
    }
}
