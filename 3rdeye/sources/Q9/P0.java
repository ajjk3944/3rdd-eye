package Q9;

/* compiled from: ValueClasses.kt */
/* loaded from: classes3.dex */
public final class P0 implements M9.b<b9.v> {

    /* renamed from: a, reason: collision with root package name */
    public static final P0 f11446a = new P0();

    /* renamed from: b, reason: collision with root package name */
    public static final M f11447b = C1549p0.a(Y.f11465a, "kotlin.ULong");

    @Override // M9.b
    public final Object deserialize(P9.d dVar) {
        return new b9.v(dVar.A(f11447b).m());
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        return f11447b;
    }

    @Override // M9.b
    public final void serialize(P9.e eVar, Object obj) {
        eVar.z(f11447b).D(((b9.v) obj).f18104b);
    }
}
