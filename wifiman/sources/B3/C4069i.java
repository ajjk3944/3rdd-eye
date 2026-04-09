package b3;

import b3.s;

/* renamed from: b3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4069i extends s {

    /* renamed from: a, reason: collision with root package name */
    private final r f32888a;

    /* renamed from: b3.i$b */
    static final class b extends s.a {

        /* renamed from: a, reason: collision with root package name */
        private r f32889a;

        b() {
        }

        @Override // b3.s.a
        public s a() {
            return new C4069i(this.f32889a);
        }

        @Override // b3.s.a
        public s.a b(r rVar) {
            this.f32889a = rVar;
            return this;
        }
    }

    @Override // b3.s
    public r b() {
        return this.f32888a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        r rVar = this.f32888a;
        r rVarB = ((s) obj).b();
        return rVar == null ? rVarB == null : rVar.equals(rVarB);
    }

    public int hashCode() {
        r rVar = this.f32888a;
        return (rVar == null ? 0 : rVar.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f32888a + "}";
    }

    private C4069i(r rVar) {
        this.f32888a = rVar;
    }
}
