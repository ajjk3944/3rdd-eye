package Q9;

import O9.d;

/* compiled from: Primitives.kt */
/* renamed from: Q9.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1538k implements M9.b<Byte> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1538k f11497a = new C1538k();

    /* renamed from: b, reason: collision with root package name */
    public static final C1556t0 f11498b = new C1556t0("kotlin.Byte", d.b.f10494a);

    @Override // M9.b
    public final Object deserialize(P9.d dVar) {
        return Byte.valueOf(dVar.z());
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        return f11498b;
    }

    @Override // M9.b
    public final void serialize(P9.e eVar, Object obj) {
        eVar.j(((Number) obj).byteValue());
    }
}
