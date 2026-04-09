package Q9;

import O9.d;

/* compiled from: Primitives.kt */
/* loaded from: classes3.dex */
public final class Q implements M9.b<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public static final Q f11448a = new Q();

    /* renamed from: b, reason: collision with root package name */
    public static final C1556t0 f11449b = new C1556t0("kotlin.Int", d.f.f10498a);

    @Override // M9.b
    public final Object deserialize(P9.d dVar) {
        return Integer.valueOf(dVar.k());
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        return f11449b;
    }

    @Override // M9.b
    public final void serialize(P9.e eVar, Object obj) {
        eVar.C(((Number) obj).intValue());
    }
}
