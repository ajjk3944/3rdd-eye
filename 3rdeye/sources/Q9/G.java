package Q9;

import O9.d;

/* compiled from: Primitives.kt */
/* loaded from: classes3.dex */
public final class G implements M9.b<Float> {

    /* renamed from: a, reason: collision with root package name */
    public static final G f11421a = new G();

    /* renamed from: b, reason: collision with root package name */
    public static final C1556t0 f11422b = new C1556t0("kotlin.Float", d.e.f10497a);

    @Override // M9.b
    public final Object deserialize(P9.d dVar) {
        return Float.valueOf(dVar.F());
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        return f11422b;
    }

    @Override // M9.b
    public final void serialize(P9.e eVar, Object obj) {
        eVar.o(((Number) obj).floatValue());
    }
}
