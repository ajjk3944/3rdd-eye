package Zi;

import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class O0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f25580a = A0.i();

    public static final Xi.f a(String serialName, Xi.e kind) {
        AbstractC6492s.i(serialName, "serialName");
        AbstractC6492s.i(kind, "kind");
        c(serialName);
        return new N0(serialName, kind);
    }

    public static final Vi.b b(th.d dVar) {
        AbstractC6492s.i(dVar, "<this>");
        return (Vi.b) f25580a.get(dVar);
    }

    public static final void c(String serialName) {
        AbstractC6492s.i(serialName, "serialName");
        for (Vi.b bVar : f25580a.values()) {
            if (AbstractC6492s.d(serialName, bVar.a().a())) {
                throw new IllegalArgumentException(kotlin.text.t.j("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + serialName + " there already exists " + kotlin.jvm.internal.O.b(bVar.getClass()).v() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }
}
