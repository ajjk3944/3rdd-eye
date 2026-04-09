package b3;

import b3.o;

/* renamed from: b3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4065e extends o {

    /* renamed from: a, reason: collision with root package name */
    private final o.b f32874a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC4061a f32875b;

    /* renamed from: b3.e$b */
    static final class b extends o.a {

        /* renamed from: a, reason: collision with root package name */
        private o.b f32876a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC4061a f32877b;

        b() {
        }

        @Override // b3.o.a
        public o a() {
            return new C4065e(this.f32876a, this.f32877b);
        }

        @Override // b3.o.a
        public o.a b(AbstractC4061a abstractC4061a) {
            this.f32877b = abstractC4061a;
            return this;
        }

        @Override // b3.o.a
        public o.a c(o.b bVar) {
            this.f32876a = bVar;
            return this;
        }
    }

    @Override // b3.o
    public AbstractC4061a b() {
        return this.f32875b;
    }

    @Override // b3.o
    public o.b c() {
        return this.f32874a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.b bVar = this.f32874a;
        if (bVar != null ? bVar.equals(oVar.c()) : oVar.c() == null) {
            AbstractC4061a abstractC4061a = this.f32875b;
            if (abstractC4061a == null) {
                if (oVar.b() == null) {
                    return true;
                }
            } else if (abstractC4061a.equals(oVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        o.b bVar = this.f32874a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC4061a abstractC4061a = this.f32875b;
        return iHashCode ^ (abstractC4061a != null ? abstractC4061a.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f32874a + ", androidClientInfo=" + this.f32875b + "}";
    }

    private C4065e(o.b bVar, AbstractC4061a abstractC4061a) {
        this.f32874a = bVar;
        this.f32875b = abstractC4061a;
    }
}
