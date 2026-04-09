package Q9;

import O9.d;

/* compiled from: Primitives.kt */
/* renamed from: Q9.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1562z implements M9.b<Double> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1562z f11544a = new C1562z();

    /* renamed from: b, reason: collision with root package name */
    public static final C1556t0 f11545b = new C1556t0("kotlin.Double", d.C0117d.f10496a);

    @Override // M9.b
    public final Object deserialize(P9.d dVar) {
        return Double.valueOf(dVar.J());
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        return f11545b;
    }

    @Override // M9.b
    public final void serialize(P9.e eVar, Object obj) {
        eVar.g(((Number) obj).doubleValue());
    }
}
