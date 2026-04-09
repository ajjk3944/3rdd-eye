package b3;

import b3.r;

/* renamed from: b3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4068h extends r {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f32886a;

    /* renamed from: b3.h$b */
    static final class b extends r.a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f32887a;

        b() {
        }

        @Override // b3.r.a
        public r a() {
            return new C4068h(this.f32887a);
        }

        @Override // b3.r.a
        public r.a b(Integer num) {
            this.f32887a = num;
            return this;
        }
    }

    @Override // b3.r
    public Integer b() {
        return this.f32886a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        Integer num = this.f32886a;
        Integer numB = ((r) obj).b();
        return num == null ? numB == null : num.equals(numB);
    }

    public int hashCode() {
        Integer num = this.f32886a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f32886a + "}";
    }

    private C4068h(Integer num) {
        this.f32886a = num;
    }
}
