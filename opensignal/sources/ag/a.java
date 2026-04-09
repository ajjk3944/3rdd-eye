package ag;

/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final int f342a;

    /* renamed from: b, reason: collision with root package name */
    public final e f343b;

    public a(int i10, e eVar) {
        this.f342a = i10;
        this.f343b = eVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return f.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        a aVar = (a) ((f) obj);
        return this.f342a == aVar.f342a && this.f343b.equals(aVar.f343b);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f342a) + (this.f343b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f342a + "intEncoding=" + this.f343b + ')';
    }
}
