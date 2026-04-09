package bj;

import Vi.InterfaceC3627a;
import aj.AbstractC3866G;
import aj.AbstractC3868b;
import aj.C3861B;
import aj.C3864E;
import aj.C3869c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class L {
    public static final Object a(AbstractC3868b json, aj.j element, InterfaceC3627a deserializer) {
        Yi.e vVar;
        AbstractC6492s.i(json, "json");
        AbstractC6492s.i(element, "element");
        AbstractC6492s.i(deserializer, "deserializer");
        if (element instanceof C3864E) {
            vVar = new z(json, (C3864E) element, null, null, 12, null);
        } else if (element instanceof C3869c) {
            vVar = new C4117A(json, (C3869c) element);
        } else {
            if (!(element instanceof aj.x) && !AbstractC6492s.d(element, C3861B.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            vVar = new v(json, (AbstractC3866G) element, null, 4, null);
        }
        return vVar.t(deserializer);
    }

    public static final Object b(AbstractC3868b abstractC3868b, String discriminator, C3864E element, InterfaceC3627a deserializer) {
        AbstractC6492s.i(abstractC3868b, "<this>");
        AbstractC6492s.i(discriminator, "discriminator");
        AbstractC6492s.i(element, "element");
        AbstractC6492s.i(deserializer, "deserializer");
        return new z(abstractC3868b, element, discriminator, deserializer.a()).t(deserializer);
    }
}
