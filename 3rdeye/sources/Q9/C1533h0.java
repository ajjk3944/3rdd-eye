package Q9;

/* compiled from: NullableSerializer.kt */
/* renamed from: Q9.h0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1533h0<T> implements M9.b<T> {

    /* renamed from: a, reason: collision with root package name */
    public final M9.b<T> f11489a;

    /* renamed from: b, reason: collision with root package name */
    public final w0 f11490b;

    public C1533h0(M9.b<T> serializer) {
        kotlin.jvm.internal.l.f(serializer, "serializer");
        this.f11489a = serializer;
        this.f11490b = new w0(serializer.getDescriptor());
    }

    @Override // M9.b
    public final T deserialize(P9.d dVar) {
        if (dVar.p()) {
            return (T) dVar.B(this.f11489a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C1533h0.class == obj.getClass() && kotlin.jvm.internal.l.b(this.f11489a, ((C1533h0) obj).f11489a);
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        return this.f11490b;
    }

    public final int hashCode() {
        return this.f11489a.hashCode();
    }

    @Override // M9.b
    public final void serialize(P9.e eVar, T t10) {
        if (t10 == null) {
            eVar.f();
        } else {
            eVar.r();
            eVar.x(this.f11489a, t10);
        }
    }
}
