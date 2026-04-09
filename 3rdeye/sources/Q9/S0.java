package Q9;

/* compiled from: ValueClasses.kt */
/* loaded from: classes3.dex */
public final class S0 implements M9.b<b9.y> {

    /* renamed from: a, reason: collision with root package name */
    public static final S0 f11454a = new S0();

    /* renamed from: b, reason: collision with root package name */
    public static final M f11455b = C1549p0.a(B0.f11393a, "kotlin.UShort");

    @Override // M9.b
    public final Object deserialize(P9.d dVar) {
        return new b9.y(dVar.A(f11455b).E());
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        return f11455b;
    }

    @Override // M9.b
    public final void serialize(P9.e eVar, Object obj) {
        eVar.z(f11455b).h(((b9.y) obj).f18109b);
    }
}
