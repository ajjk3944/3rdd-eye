package aa;

import androidx.activity.o;
import androidx.appcompat.app.z;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.x;
import kotlinx.serialization.internal.k1;
import l9.l;

/* loaded from: classes4.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Map f202a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f203b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f204c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f205d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f206e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Map class2ContextualFactory, Map polyBase2Serializers, Map polyBase2DefaultSerializerProvider, Map polyBase2NamedSerializers, Map polyBase2DefaultDeserializerProvider) {
        super(null);
        p.e(class2ContextualFactory, "class2ContextualFactory");
        p.e(polyBase2Serializers, "polyBase2Serializers");
        p.e(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        p.e(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        p.e(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f202a = class2ContextualFactory;
        this.f203b = polyBase2Serializers;
        this.f204c = polyBase2DefaultSerializerProvider;
        this.f205d = polyBase2NamedSerializers;
        this.f206e = polyBase2DefaultDeserializerProvider;
    }

    @Override // aa.c
    public void a(e collector) {
        p.e(collector, "collector");
        for (Map.Entry entry : this.f202a.entrySet()) {
            z.a(entry.getValue());
        }
        for (Map.Entry entry2 : this.f203b.entrySet()) {
            r9.c cVar = (r9.c) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                r9.c cVar2 = (r9.c) entry3.getKey();
                kotlinx.serialization.b bVar = (kotlinx.serialization.b) entry3.getValue();
                p.c(cVar, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                p.c(cVar2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                p.c(bVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.c(cVar, cVar2, bVar);
            }
        }
        for (Map.Entry entry4 : this.f204c.entrySet()) {
            r9.c cVar3 = (r9.c) entry4.getKey();
            l lVar = (l) entry4.getValue();
            p.c(cVar3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            p.c(lVar, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'value')] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicSerializerProvider<kotlin.Any> }");
            collector.b(cVar3, (l) x.b(lVar, 1));
        }
        for (Map.Entry entry5 : this.f206e.entrySet()) {
            r9.c cVar4 = (r9.c) entry5.getKey();
            l lVar2 = (l) entry5.getValue();
            p.c(cVar4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            p.c(lVar2, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'className')] kotlin.String?, kotlinx.serialization.DeserializationStrategy<out kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicDeserializerProvider<out kotlin.Any> }");
            collector.a(cVar4, (l) x.b(lVar2, 1));
        }
    }

    @Override // aa.c
    public kotlinx.serialization.b b(r9.c kClass, List typeArgumentsSerializers) {
        p.e(kClass, "kClass");
        p.e(typeArgumentsSerializers, "typeArgumentsSerializers");
        z.a(this.f202a.get(kClass));
        o.a(null);
        return null;
    }

    @Override // aa.c
    public kotlinx.serialization.a d(r9.c baseClass, String str) {
        p.e(baseClass, "baseClass");
        Map map = (Map) this.f205d.get(baseClass);
        kotlinx.serialization.b bVar = map != null ? (kotlinx.serialization.b) map.get(str) : null;
        if (!o.a(bVar)) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        Object obj = this.f206e.get(baseClass);
        l lVar = x.e(obj, 1) ? (l) obj : null;
        if (lVar != null) {
            return (kotlinx.serialization.a) lVar.invoke(str);
        }
        return null;
    }

    @Override // aa.c
    public kotlinx.serialization.e e(r9.c baseClass, Object value) {
        p.e(baseClass, "baseClass");
        p.e(value, "value");
        if (!k1.i(value, baseClass)) {
            return null;
        }
        Map map = (Map) this.f203b.get(baseClass);
        kotlinx.serialization.b bVar = map != null ? (kotlinx.serialization.b) map.get(t.b(value.getClass())) : null;
        if (!o.a(bVar)) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        Object obj = this.f204c.get(baseClass);
        l lVar = x.e(obj, 1) ? (l) obj : null;
        if (lVar != null) {
            return (kotlinx.serialization.e) lVar.invoke(value);
        }
        return null;
    }
}
