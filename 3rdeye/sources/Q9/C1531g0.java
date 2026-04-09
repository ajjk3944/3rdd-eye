package Q9;

/* compiled from: BuiltInSerializers.kt */
/* renamed from: Q9.g0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1531g0 implements M9.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C1531g0 f11485a = new C1531g0();

    /* renamed from: b, reason: collision with root package name */
    public static final C1529f0 f11486b = C1529f0.f11481a;

    @Override // M9.b
    public final Object deserialize(P9.d dVar) {
        throw new M9.i("'kotlin.Nothing' does not have instances");
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        return f11486b;
    }

    @Override // M9.b
    public final void serialize(P9.e eVar, Object obj) {
        Void value = (Void) obj;
        kotlin.jvm.internal.l.f(value, "value");
        throw new M9.i("'kotlin.Nothing' cannot be serialized");
    }
}
