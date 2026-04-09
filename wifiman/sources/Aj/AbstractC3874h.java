package aj;

import Vi.InterfaceC3627a;
import Xi.d;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import kotlinx.serialization.SerializationException;

/* renamed from: aj.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3874h implements Vi.b {

    /* renamed from: a, reason: collision with root package name */
    private final th.d f26371a;

    /* renamed from: b, reason: collision with root package name */
    private final Xi.f f26372b;

    public AbstractC3874h(th.d baseClass) {
        AbstractC6492s.i(baseClass, "baseClass");
        this.f26371a = baseClass;
        this.f26372b = Xi.l.e("JsonContentPolymorphicSerializer<" + baseClass.v() + '>', d.b.f24438a, new Xi.f[0], null, 8, null);
    }

    private final Void h(th.d dVar, th.d dVar2) {
        String strV = dVar.v();
        if (strV == null) {
            strV = String.valueOf(dVar);
        }
        throw new SerializationException("Class '" + strV + "' is not registered for polymorphic serialization " + ("in the scope of '" + dVar2.v() + '\'') + ".\nMark the base class as 'sealed' or register the serializer explicitly.");
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return this.f26372b;
    }

    @Override // Vi.InterfaceC3627a
    public final Object c(Yi.e decoder) {
        AbstractC6492s.i(decoder, "decoder");
        InterfaceC3875i interfaceC3875iD = s.d(decoder);
        j jVarM = interfaceC3875iD.m();
        InterfaceC3627a interfaceC3627aG = g(jVarM);
        AbstractC6492s.g(interfaceC3627aG, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>");
        return interfaceC3875iD.d().d((Vi.b) interfaceC3627aG, jVarM);
    }

    @Override // Vi.o
    public final void e(Yi.f encoder, Object value) {
        AbstractC6492s.i(encoder, "encoder");
        AbstractC6492s.i(value, "value");
        Vi.o oVarF = encoder.a().f(this.f26371a, value);
        if (oVarF == null && (oVarF = Vi.w.h(O.b(value.getClass()))) == null) {
            h(O.b(value.getClass()), this.f26371a);
            throw new KotlinNothingValueException();
        }
        ((Vi.b) oVarF).e(encoder, value);
    }

    protected abstract InterfaceC3627a g(j jVar);
}
