package Q9;

import O9.d;

/* compiled from: Primitives.kt */
/* loaded from: classes3.dex */
public final class C0 implements M9.b<String> {

    /* renamed from: a, reason: collision with root package name */
    public static final C0 f11399a = new C0();

    /* renamed from: b, reason: collision with root package name */
    public static final C1556t0 f11400b = new C1556t0("kotlin.String", d.i.f10501a);

    @Override // M9.b
    public final Object deserialize(P9.d dVar) {
        return dVar.l();
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        return f11400b;
    }

    @Override // M9.b
    public final void serialize(P9.e eVar, Object obj) {
        String value = (String) obj;
        kotlin.jvm.internal.l.f(value, "value");
        eVar.G(value);
    }
}
