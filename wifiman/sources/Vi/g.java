package Vi;

import Zi.AbstractC3696b;
import Zi.AbstractC3698c;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;

/* loaded from: classes4.dex */
public abstract class g {
    public static final InterfaceC3627a a(AbstractC3696b abstractC3696b, Yi.c decoder, String str) {
        AbstractC6492s.i(abstractC3696b, "<this>");
        AbstractC6492s.i(decoder, "decoder");
        InterfaceC3627a interfaceC3627aI = abstractC3696b.i(decoder, str);
        if (interfaceC3627aI != null) {
            return interfaceC3627aI;
        }
        AbstractC3698c.a(str, abstractC3696b.k());
        throw new KotlinNothingValueException();
    }

    public static final o b(AbstractC3696b abstractC3696b, Yi.f encoder, Object value) {
        AbstractC6492s.i(abstractC3696b, "<this>");
        AbstractC6492s.i(encoder, "encoder");
        AbstractC6492s.i(value, "value");
        o oVarJ = abstractC3696b.j(encoder, value);
        if (oVarJ != null) {
            return oVarJ;
        }
        AbstractC3698c.b(O.b(value.getClass()), abstractC3696b.k());
        throw new KotlinNothingValueException();
    }
}
