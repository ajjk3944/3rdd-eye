package Q9;

/* compiled from: ValueClasses.kt */
/* loaded from: classes3.dex */
public final class M0 implements M9.b<b9.t> {

    /* renamed from: a, reason: collision with root package name */
    public static final M0 f11437a = new M0();

    /* renamed from: b, reason: collision with root package name */
    public static final M f11438b = C1549p0.a(Q.f11448a, "kotlin.UInt");

    @Override // M9.b
    public final Object deserialize(P9.d dVar) {
        return new b9.t(dVar.A(f11438b).k());
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        return f11438b;
    }

    @Override // M9.b
    public final void serialize(P9.e eVar, Object obj) {
        eVar.z(f11438b).C(((b9.t) obj).f18100b);
    }
}
