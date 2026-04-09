package Sh;

import kotlin.jvm.internal.AbstractC6492s;
import li.C6631i;
import li.InterfaceC6632j;
import xi.AbstractC8536c;

/* loaded from: classes4.dex */
public final class o implements InterfaceC6632j {

    /* renamed from: a, reason: collision with root package name */
    private final v f20784a;

    /* renamed from: b, reason: collision with root package name */
    private final n f20785b;

    public o(v kotlinClassFinder, n deserializedDescriptorResolver) {
        AbstractC6492s.i(kotlinClassFinder, "kotlinClassFinder");
        AbstractC6492s.i(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        this.f20784a = kotlinClassFinder;
        this.f20785b = deserializedDescriptorResolver;
    }

    @Override // li.InterfaceC6632j
    public C6631i a(Zh.b classId) {
        AbstractC6492s.i(classId, "classId");
        x xVarB = w.b(this.f20784a, classId, AbstractC8536c.a(this.f20785b.f().g()));
        if (xVarB == null) {
            return null;
        }
        AbstractC6492s.d(xVarB.b(), classId);
        return this.f20785b.l(xVarB);
    }
}
