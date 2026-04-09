package aj;

import Xi.e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import kotlin.text.M;

/* loaded from: classes4.dex */
final class y implements Vi.b {

    /* renamed from: a, reason: collision with root package name */
    public static final y f26380a = new y();

    /* renamed from: b, reason: collision with root package name */
    private static final Xi.f f26381b = Xi.l.b("kotlinx.serialization.json.JsonLiteral", e.i.f24447a);

    private y() {
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return f26381b;
    }

    @Override // Vi.InterfaceC3627a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public x c(Yi.e decoder) {
        AbstractC6492s.i(decoder, "decoder");
        j jVarM = s.d(decoder).m();
        if (jVarM instanceof x) {
            return (x) jVarM;
        }
        throw bj.r.e(-1, "Unexpected JSON element, expected JsonLiteral, had " + O.b(jVarM.getClass()), jVarM.toString());
    }

    @Override // Vi.o
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void e(Yi.f encoder, x value) {
        AbstractC6492s.i(encoder, "encoder");
        AbstractC6492s.i(value, "value");
        s.h(encoder);
        if (value.f()) {
            encoder.G(value.b());
            return;
        }
        if (value.e() != null) {
            encoder.B(value.e()).G(value.b());
            return;
        }
        Long lS = kotlin.text.t.s(value.b());
        if (lS != null) {
            encoder.E(lS.longValue());
            return;
        }
        Yg.E eI = M.i(value.b());
        if (eI != null) {
            encoder.B(Wi.a.z(Yg.E.f24986b).a()).E(eI.j());
            return;
        }
        Double dN = kotlin.text.t.n(value.b());
        if (dN != null) {
            encoder.j(dN.doubleValue());
            return;
        }
        Boolean boolP1 = kotlin.text.t.p1(value.b());
        if (boolP1 != null) {
            encoder.m(boolP1.booleanValue());
        } else {
            encoder.G(value.b());
        }
    }
}
