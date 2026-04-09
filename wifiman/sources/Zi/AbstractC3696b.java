package Zi;

import Vi.InterfaceC3627a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlinx.serialization.SerializationException;

/* renamed from: Zi.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3696b implements Vi.b {
    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(Yi.c cVar) {
        return Yi.c.j(cVar, a(), 1, Vi.g.a(this, cVar, cVar.w(a(), 0)), null, 8, null);
    }

    @Override // Vi.InterfaceC3627a
    public final Object c(Yi.e decoder) {
        Object objJ;
        AbstractC6492s.i(decoder, "decoder");
        Xi.f fVarA = a();
        Yi.c cVarC = decoder.c(fVarA);
        kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
        if (cVarC.B()) {
            objJ = h(cVarC);
        } else {
            objJ = null;
            while (true) {
                int iK = cVarC.k(a());
                if (iK != -1) {
                    if (iK == 0) {
                        n10.f51689a = cVarC.w(a(), iK);
                    } else {
                        if (iK != 1) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Invalid index in polymorphic deserialization of ");
                            String str = (String) n10.f51689a;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb2.append(str);
                            sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb2.append(iK);
                            throw new SerializationException(sb2.toString());
                        }
                        Object obj = n10.f51689a;
                        if (obj == null) {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                        }
                        n10.f51689a = obj;
                        objJ = Yi.c.j(cVarC, a(), iK, Vi.g.a(this, cVarC, (String) obj), null, 8, null);
                    }
                } else {
                    if (objJ == null) {
                        throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) n10.f51689a)).toString());
                    }
                    AbstractC6492s.g(objJ, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer");
                }
            }
        }
        cVarC.b(fVarA);
        return objJ;
    }

    @Override // Vi.o
    public final void e(Yi.f encoder, Object value) {
        AbstractC6492s.i(encoder, "encoder");
        AbstractC6492s.i(value, "value");
        Vi.o oVarB = Vi.g.b(this, encoder, value);
        Xi.f fVarA = a();
        Yi.d dVarC = encoder.c(fVarA);
        dVarC.y(a(), 0, oVarB.a().a());
        Xi.f fVarA2 = a();
        AbstractC6492s.g(oVarB, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        dVarC.q(fVarA2, 1, oVarB, value);
        dVarC.b(fVarA);
    }

    public InterfaceC3627a i(Yi.c decoder, String str) {
        AbstractC6492s.i(decoder, "decoder");
        return decoder.a().e(k(), str);
    }

    public Vi.o j(Yi.f encoder, Object value) {
        AbstractC6492s.i(encoder, "encoder");
        AbstractC6492s.i(value, "value");
        return encoder.a().f(k(), value);
    }

    public abstract th.d k();
}
