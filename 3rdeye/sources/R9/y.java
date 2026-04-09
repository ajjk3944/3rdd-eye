package R9;

import O9.k;
import S9.C1588u;

/* compiled from: JsonElementSerializers.kt */
/* loaded from: classes3.dex */
public final class y implements M9.b<x> {

    /* renamed from: a, reason: collision with root package name */
    public static final y f11824a = new y();

    /* renamed from: b, reason: collision with root package name */
    public static final O9.f f11825b = O9.j.b("kotlinx.serialization.json.JsonNull", k.b.f10522a, new O9.e[0], O9.i.f10520g);

    @Override // M9.b
    public final Object deserialize(P9.d dVar) {
        B7.d.c(dVar);
        if (dVar.p()) {
            throw new C1588u("Expected 'null' literal");
        }
        return x.INSTANCE;
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        return f11825b;
    }

    @Override // M9.b
    public final void serialize(P9.e eVar, Object obj) {
        x value = (x) obj;
        kotlin.jvm.internal.l.f(value, "value");
        B7.d.d(eVar);
        eVar.f();
    }
}
