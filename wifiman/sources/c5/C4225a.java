package c5;

import c5.d;

/* renamed from: c5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4225a {

    /* renamed from: a, reason: collision with root package name */
    private int f33861a;

    /* renamed from: b, reason: collision with root package name */
    private d.a f33862b = d.a.DEFAULT;

    /* renamed from: c5.a$a, reason: collision with other inner class name */
    private static final class C1177a implements d {

        /* renamed from: a, reason: collision with root package name */
        private final int f33863a;

        /* renamed from: b, reason: collision with root package name */
        private final d.a f33864b;

        C1177a(int i10, d.a aVar) {
            this.f33863a = i10;
            this.f33864b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f33863a == dVar.tag() && this.f33864b.equals(dVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f33863a) + (this.f33864b.hashCode() ^ 2041407134);
        }

        @Override // c5.d
        public d.a intEncoding() {
            return this.f33864b;
        }

        @Override // c5.d
        public int tag() {
            return this.f33863a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f33863a + "intEncoding=" + this.f33864b + ')';
        }
    }

    public static C4225a b() {
        return new C4225a();
    }

    public d a() {
        return new C1177a(this.f33861a, this.f33862b);
    }

    public C4225a c(int i10) {
        this.f33861a = i10;
        return this;
    }
}
