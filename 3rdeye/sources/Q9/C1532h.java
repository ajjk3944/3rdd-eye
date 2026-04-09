package Q9;

import O9.d;

/* compiled from: Primitives.kt */
/* renamed from: Q9.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1532h implements M9.b<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1532h f11487a = new C1532h();

    /* renamed from: b, reason: collision with root package name */
    public static final C1556t0 f11488b = new C1556t0("kotlin.Boolean", d.a.f10493a);

    @Override // M9.b
    public final Object deserialize(P9.d dVar) {
        return Boolean.valueOf(dVar.f());
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        return f11488b;
    }

    @Override // M9.b
    public final void serialize(P9.e eVar, Object obj) {
        eVar.l(((Boolean) obj).booleanValue());
    }
}
