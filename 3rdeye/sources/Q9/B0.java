package Q9;

import O9.d;

/* compiled from: Primitives.kt */
/* loaded from: classes3.dex */
public final class B0 implements M9.b<Short> {

    /* renamed from: a, reason: collision with root package name */
    public static final B0 f11393a = new B0();

    /* renamed from: b, reason: collision with root package name */
    public static final C1556t0 f11394b = new C1556t0("kotlin.Short", d.h.f10500a);

    @Override // M9.b
    public final Object deserialize(P9.d dVar) {
        return Short.valueOf(dVar.E());
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        return f11394b;
    }

    @Override // M9.b
    public final void serialize(P9.e eVar, Object obj) {
        eVar.h(((Number) obj).shortValue());
    }
}
