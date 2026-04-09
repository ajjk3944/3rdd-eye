package cj;

import Vi.InterfaceC3627a;
import Vi.o;
import cj.AbstractC4269a;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.V;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public final class c extends e {

    /* renamed from: a, reason: collision with root package name */
    private final Map f34039a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f34040b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f34041c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f34042d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f34043e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f34044f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Map class2ContextualFactory, Map polyBase2Serializers, Map polyBase2DefaultSerializerProvider, Map polyBase2NamedSerializers, Map polyBase2DefaultDeserializerProvider, boolean z10) {
        super(null);
        AbstractC6492s.i(class2ContextualFactory, "class2ContextualFactory");
        AbstractC6492s.i(polyBase2Serializers, "polyBase2Serializers");
        AbstractC6492s.i(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        AbstractC6492s.i(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        AbstractC6492s.i(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f34039a = class2ContextualFactory;
        this.f34040b = polyBase2Serializers;
        this.f34041c = polyBase2DefaultSerializerProvider;
        this.f34042d = polyBase2NamedSerializers;
        this.f34043e = polyBase2DefaultDeserializerProvider;
        this.f34044f = z10;
    }

    @Override // cj.e
    public void a(i collector) {
        AbstractC6492s.i(collector, "collector");
        for (Map.Entry entry : this.f34039a.entrySet()) {
            th.d dVar = (th.d) entry.getKey();
            AbstractC4269a abstractC4269a = (AbstractC4269a) entry.getValue();
            if (abstractC4269a instanceof AbstractC4269a.C1191a) {
                AbstractC6492s.g(dVar, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Vi.b bVarB = ((AbstractC4269a.C1191a) abstractC4269a).b();
                AbstractC6492s.g(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                collector.b(dVar, bVarB);
            } else {
                if (!(abstractC4269a instanceof AbstractC4269a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                collector.c(dVar, ((AbstractC4269a.b) abstractC4269a).b());
            }
        }
        for (Map.Entry entry2 : this.f34040b.entrySet()) {
            th.d dVar2 = (th.d) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                th.d dVar3 = (th.d) entry3.getKey();
                Vi.b bVar = (Vi.b) entry3.getValue();
                AbstractC6492s.g(dVar2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                AbstractC6492s.g(dVar3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                AbstractC6492s.g(bVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.e(dVar2, dVar3, bVar);
            }
        }
        for (Map.Entry entry4 : this.f34041c.entrySet()) {
            th.d dVar4 = (th.d) entry4.getKey();
            InterfaceC6835l interfaceC6835l = (InterfaceC6835l) entry4.getValue();
            AbstractC6492s.g(dVar4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            AbstractC6492s.g(interfaceC6835l, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            collector.g(dVar4, (InterfaceC6835l) V.f(interfaceC6835l, 1));
        }
        for (Map.Entry entry5 : this.f34043e.entrySet()) {
            th.d dVar5 = (th.d) entry5.getKey();
            InterfaceC6835l interfaceC6835l2 = (InterfaceC6835l) entry5.getValue();
            AbstractC6492s.g(dVar5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            AbstractC6492s.g(interfaceC6835l2, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            collector.d(dVar5, (InterfaceC6835l) V.f(interfaceC6835l2, 1));
        }
    }

    @Override // cj.e
    public Vi.b b(th.d kClass, List typeArgumentsSerializers) {
        AbstractC6492s.i(kClass, "kClass");
        AbstractC6492s.i(typeArgumentsSerializers, "typeArgumentsSerializers");
        AbstractC4269a abstractC4269a = (AbstractC4269a) this.f34039a.get(kClass);
        Vi.b bVarA = abstractC4269a != null ? abstractC4269a.a(typeArgumentsSerializers) : null;
        if (bVarA != null) {
            return bVarA;
        }
        return null;
    }

    @Override // cj.e
    public boolean d() {
        return this.f34044f;
    }

    @Override // cj.e
    public InterfaceC3627a e(th.d baseClass, String str) {
        AbstractC6492s.i(baseClass, "baseClass");
        Map map = (Map) this.f34042d.get(baseClass);
        Vi.b bVar = map != null ? (Vi.b) map.get(str) : null;
        if (bVar == null) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        Object obj = this.f34043e.get(baseClass);
        InterfaceC6835l interfaceC6835l = V.m(obj, 1) ? (InterfaceC6835l) obj : null;
        if (interfaceC6835l != null) {
            return (InterfaceC3627a) interfaceC6835l.invoke(str);
        }
        return null;
    }

    @Override // cj.e
    public o f(th.d baseClass, Object value) {
        AbstractC6492s.i(baseClass, "baseClass");
        AbstractC6492s.i(value, "value");
        if (!baseClass.J(value)) {
            return null;
        }
        Map map = (Map) this.f34040b.get(baseClass);
        Vi.b bVar = map != null ? (Vi.b) map.get(O.b(value.getClass())) : null;
        if (bVar == null) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        Object obj = this.f34041c.get(baseClass);
        InterfaceC6835l interfaceC6835l = V.m(obj, 1) ? (InterfaceC6835l) obj : null;
        if (interfaceC6835l != null) {
            return (o) interfaceC6835l.invoke(value);
        }
        return null;
    }
}
