package Xi;

import Zi.Q0;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class b {
    public static final th.d a(f fVar) {
        AbstractC6492s.i(fVar, "<this>");
        if (fVar instanceof c) {
            return ((c) fVar).f24435b;
        }
        if (fVar instanceof Q0) {
            return a(((Q0) fVar).k());
        }
        return null;
    }

    public static final f b(cj.e eVar, f descriptor) {
        Vi.b bVarC;
        AbstractC6492s.i(eVar, "<this>");
        AbstractC6492s.i(descriptor, "descriptor");
        th.d dVarA = a(descriptor);
        if (dVarA == null || (bVarC = cj.e.c(eVar, dVarA, null, 2, null)) == null) {
            return null;
        }
        return bVarC.a();
    }

    public static final f c(f fVar, th.d context) {
        AbstractC6492s.i(fVar, "<this>");
        AbstractC6492s.i(context, "context");
        return new c(fVar, context);
    }
}
