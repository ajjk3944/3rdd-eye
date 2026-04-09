package Y6;

import a7.C3768a;
import a7.C3769b;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public abstract class w {
    public static final h a(r rVar, th.p ktype) {
        AbstractC6492s.i(rVar, "<this>");
        AbstractC6492s.i(ktype, "ktype");
        h hVarD = rVar.d(th.w.f(ktype));
        if ((hVarD instanceof C3769b) || (hVarD instanceof C3768a)) {
            return hVarD;
        }
        if (ktype.t()) {
            h hVarG = hVarD.g();
            AbstractC6492s.h(hVarG, "{\n    adapter.nullSafe()\n  }");
            return hVarG;
        }
        h hVarF = hVarD.f();
        AbstractC6492s.h(hVarF, "{\n    adapter.nonNull()\n  }");
        return hVarF;
    }
}
