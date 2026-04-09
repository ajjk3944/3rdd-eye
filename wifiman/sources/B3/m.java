package b3;

import b3.w;

/* loaded from: classes.dex */
final class m extends w {

    /* renamed from: a, reason: collision with root package name */
    private final w.c f32923a;

    /* renamed from: b, reason: collision with root package name */
    private final w.b f32924b;

    static final class b extends w.a {

        /* renamed from: a, reason: collision with root package name */
        private w.c f32925a;

        /* renamed from: b, reason: collision with root package name */
        private w.b f32926b;

        b() {
        }

        @Override // b3.w.a
        public w a() {
            return new m(this.f32925a, this.f32926b);
        }

        @Override // b3.w.a
        public w.a b(w.b bVar) {
            this.f32926b = bVar;
            return this;
        }

        @Override // b3.w.a
        public w.a c(w.c cVar) {
            this.f32925a = cVar;
            return this;
        }
    }

    @Override // b3.w
    public w.b b() {
        return this.f32924b;
    }

    @Override // b3.w
    public w.c c() {
        return this.f32923a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        w.c cVar = this.f32923a;
        if (cVar != null ? cVar.equals(wVar.c()) : wVar.c() == null) {
            w.b bVar = this.f32924b;
            if (bVar == null) {
                if (wVar.b() == null) {
                    return true;
                }
            } else if (bVar.equals(wVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        w.c cVar = this.f32923a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        w.b bVar = this.f32924b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f32923a + ", mobileSubtype=" + this.f32924b + "}";
    }

    private m(w.c cVar, w.b bVar) {
        this.f32923a = cVar;
        this.f32924b = bVar;
    }
}
