package Q9;

/* compiled from: ValueClasses.kt */
/* loaded from: classes3.dex */
public final class J0 implements M9.b<b9.r> {

    /* renamed from: a, reason: collision with root package name */
    public static final J0 f11428a = new J0();

    /* renamed from: b, reason: collision with root package name */
    public static final M f11429b = C1549p0.a(C1538k.f11497a, "kotlin.UByte");

    @Override // M9.b
    public final Object deserialize(P9.d dVar) {
        return new b9.r(dVar.A(f11429b).z());
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        return f11429b;
    }

    @Override // M9.b
    public final void serialize(P9.e eVar, Object obj) {
        eVar.z(f11429b).j(((b9.r) obj).f18096b);
    }
}
