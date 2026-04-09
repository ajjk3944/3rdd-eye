package Q9;

import O9.d;

/* compiled from: Primitives.kt */
/* loaded from: classes3.dex */
public final class Y implements M9.b<Long> {

    /* renamed from: a, reason: collision with root package name */
    public static final Y f11465a = new Y();

    /* renamed from: b, reason: collision with root package name */
    public static final C1556t0 f11466b = new C1556t0("kotlin.Long", d.g.f10499a);

    @Override // M9.b
    public final Object deserialize(P9.d dVar) {
        return Long.valueOf(dVar.m());
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        return f11466b;
    }

    @Override // M9.b
    public final void serialize(P9.e eVar, Object obj) {
        eVar.D(((Number) obj).longValue());
    }
}
