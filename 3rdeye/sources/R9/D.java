package R9;

import O9.d;

/* compiled from: JsonElementSerializers.kt */
/* loaded from: classes3.dex */
public final class D implements M9.b<C> {

    /* renamed from: a, reason: collision with root package name */
    public static final D f11778a = new D();

    /* renamed from: b, reason: collision with root package name */
    public static final O9.f f11779b = O9.j.b("kotlinx.serialization.json.JsonPrimitive", d.i.f10501a, new O9.e[0], O9.i.f10520g);

    @Override // M9.b
    public final Object deserialize(P9.d dVar) {
        i iVarJ = B7.d.c(dVar).j();
        if (iVarJ instanceof C) {
            return (C) iVarJ;
        }
        throw E.u.i(-1, "Unexpected JSON element, expected JsonPrimitive, had " + kotlin.jvm.internal.x.a(iVarJ.getClass()), iVarJ.toString());
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        return f11779b;
    }

    @Override // M9.b
    public final void serialize(P9.e eVar, Object obj) {
        C value = (C) obj;
        kotlin.jvm.internal.l.f(value, "value");
        B7.d.d(eVar);
        if (value instanceof x) {
            eVar.x(y.f11824a, x.INSTANCE);
        } else {
            eVar.x(v.f11819a, (u) value);
        }
    }
}
