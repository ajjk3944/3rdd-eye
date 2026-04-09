package Q9;

import O9.d;

/* compiled from: Primitives.kt */
/* renamed from: Q9.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1550q implements M9.b<Character> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1550q f11524a = new C1550q();

    /* renamed from: b, reason: collision with root package name */
    public static final C1556t0 f11525b = new C1556t0("kotlin.Char", d.c.f10495a);

    @Override // M9.b
    public final Object deserialize(P9.d dVar) {
        return Character.valueOf(dVar.g());
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        return f11525b;
    }

    @Override // M9.b
    public final void serialize(P9.e eVar, Object obj) {
        eVar.q(((Character) obj).charValue());
    }
}
