package aj;

import Xi.e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;

/* loaded from: classes4.dex */
public final class H implements Vi.b {

    /* renamed from: a, reason: collision with root package name */
    public static final H f26326a = new H();

    /* renamed from: b, reason: collision with root package name */
    private static final Xi.f f26327b = Xi.l.e("kotlinx.serialization.json.JsonPrimitive", e.i.f24447a, new Xi.f[0], null, 8, null);

    private H() {
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return f26327b;
    }

    @Override // Vi.InterfaceC3627a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC3866G c(Yi.e decoder) {
        AbstractC6492s.i(decoder, "decoder");
        j jVarM = s.d(decoder).m();
        if (jVarM instanceof AbstractC3866G) {
            return (AbstractC3866G) jVarM;
        }
        throw bj.r.e(-1, "Unexpected JSON element, expected JsonPrimitive, had " + O.b(jVarM.getClass()), jVarM.toString());
    }

    @Override // Vi.o
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void e(Yi.f encoder, AbstractC3866G value) {
        AbstractC6492s.i(encoder, "encoder");
        AbstractC6492s.i(value, "value");
        s.h(encoder);
        if (value instanceof C3861B) {
            encoder.z(C3862C.f26318a, C3861B.INSTANCE);
        } else {
            encoder.z(y.f26380a, (x) value);
        }
    }
}
