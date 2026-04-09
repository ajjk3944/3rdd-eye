package cj;

import Yg.s;
import Yg.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* renamed from: cj.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4270b {

    /* renamed from: a, reason: collision with root package name */
    private final th.d f34034a;

    /* renamed from: b, reason: collision with root package name */
    private final Vi.b f34035b;

    /* renamed from: c, reason: collision with root package name */
    private final List f34036c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC6835l f34037d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC6835l f34038e;

    public C4270b(th.d baseClass, Vi.b bVar) {
        AbstractC6492s.i(baseClass, "baseClass");
        this.f34034a = baseClass;
        this.f34035b = bVar;
        this.f34036c = new ArrayList();
    }

    public final void a(f builder) {
        AbstractC6492s.i(builder, "builder");
        Vi.b bVar = this.f34035b;
        if (bVar != null) {
            th.d dVar = this.f34034a;
            f.m(builder, dVar, dVar, bVar, false, 8, null);
        }
        for (s sVar : this.f34036c) {
            th.d dVar2 = (th.d) sVar.a();
            Vi.b bVar2 = (Vi.b) sVar.c();
            th.d dVar3 = this.f34034a;
            AbstractC6492s.g(dVar2, "null cannot be cast to non-null type kotlin.reflect.KClass<Base of kotlinx.serialization.modules.PolymorphicModuleBuilder>");
            AbstractC6492s.g(bVar2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            f.m(builder, dVar3, dVar2, bVar2, false, 8, null);
        }
        InterfaceC6835l interfaceC6835l = this.f34037d;
        if (interfaceC6835l != null) {
            builder.k(this.f34034a, interfaceC6835l, false);
        }
        InterfaceC6835l interfaceC6835l2 = this.f34038e;
        if (interfaceC6835l2 != null) {
            builder.j(this.f34034a, interfaceC6835l2, false);
        }
    }

    public final void b(InterfaceC6835l defaultDeserializerProvider) {
        AbstractC6492s.i(defaultDeserializerProvider, "defaultDeserializerProvider");
        if (this.f34038e == null) {
            this.f34038e = defaultDeserializerProvider;
            return;
        }
        throw new IllegalArgumentException(("Default deserializer provider is already registered for class " + this.f34034a + ": " + this.f34038e).toString());
    }

    public final void c(th.d subclass, Vi.b serializer) {
        AbstractC6492s.i(subclass, "subclass");
        AbstractC6492s.i(serializer, "serializer");
        this.f34036c.add(z.a(subclass, serializer));
    }
}
