package b3;

import b3.p;

/* renamed from: b3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4066f extends p {

    /* renamed from: a, reason: collision with root package name */
    private final s f32878a;

    /* renamed from: b, reason: collision with root package name */
    private final p.b f32879b;

    /* renamed from: b3.f$b */
    static final class b extends p.a {

        /* renamed from: a, reason: collision with root package name */
        private s f32880a;

        /* renamed from: b, reason: collision with root package name */
        private p.b f32881b;

        b() {
        }

        @Override // b3.p.a
        public p a() {
            return new C4066f(this.f32880a, this.f32881b);
        }

        @Override // b3.p.a
        public p.a b(s sVar) {
            this.f32880a = sVar;
            return this;
        }

        @Override // b3.p.a
        public p.a c(p.b bVar) {
            this.f32881b = bVar;
            return this;
        }
    }

    @Override // b3.p
    public s b() {
        return this.f32878a;
    }

    @Override // b3.p
    public p.b c() {
        return this.f32879b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        s sVar = this.f32878a;
        if (sVar != null ? sVar.equals(pVar.b()) : pVar.b() == null) {
            p.b bVar = this.f32879b;
            if (bVar == null) {
                if (pVar.c() == null) {
                    return true;
                }
            } else if (bVar.equals(pVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        s sVar = this.f32878a;
        int iHashCode = ((sVar == null ? 0 : sVar.hashCode()) ^ 1000003) * 1000003;
        p.b bVar = this.f32879b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "ComplianceData{privacyContext=" + this.f32878a + ", productIdOrigin=" + this.f32879b + "}";
    }

    private C4066f(s sVar, p.b bVar) {
        this.f32878a = sVar;
        this.f32879b = bVar;
    }
}
