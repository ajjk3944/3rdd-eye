package R9;

import O9.c;
import b9.C1992A;

/* compiled from: JsonElementSerializers.kt */
/* loaded from: classes3.dex */
public final class p implements M9.b<i> {

    /* renamed from: a, reason: collision with root package name */
    public static final p f11812a = new p();

    /* renamed from: b, reason: collision with root package name */
    public static final O9.f f11813b = O9.j.b("kotlinx.serialization.json.JsonElement", c.b.f10492a, new O9.e[0], a.f11814g);

    /* compiled from: JsonElementSerializers.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<O9.a, C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f11814g = new a(1);

        @Override // p9.l
        public final C1992A invoke(O9.a aVar) {
            O9.a buildSerialDescriptor = aVar;
            kotlin.jvm.internal.l.f(buildSerialDescriptor, "$this$buildSerialDescriptor");
            O9.a.a(buildSerialDescriptor, "JsonPrimitive", new q(k.f11807g));
            O9.a.a(buildSerialDescriptor, "JsonNull", new q(l.f11808g));
            O9.a.a(buildSerialDescriptor, "JsonLiteral", new q(m.f11809g));
            O9.a.a(buildSerialDescriptor, "JsonObject", new q(n.f11810g));
            O9.a.a(buildSerialDescriptor, "JsonArray", new q(o.f11811g));
            return C1992A.f18074a;
        }
    }

    @Override // M9.b
    public final Object deserialize(P9.d dVar) {
        return B7.d.c(dVar).j();
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        return f11813b;
    }

    @Override // M9.b
    public final void serialize(P9.e eVar, Object obj) {
        i value = (i) obj;
        kotlin.jvm.internal.l.f(value, "value");
        B7.d.d(eVar);
        if (value instanceof C) {
            eVar.x(D.f11778a, value);
        } else if (value instanceof z) {
            eVar.x(B.f11773a, value);
        } else if (value instanceof C1565b) {
            eVar.x(C1567d.f11786a, value);
        }
    }
}
