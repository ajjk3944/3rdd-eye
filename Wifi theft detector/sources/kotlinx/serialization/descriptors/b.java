package kotlinx.serialization.descriptors;

import kotlin.jvm.internal.p;
import kotlinx.serialization.internal.v1;

/* loaded from: classes4.dex */
public abstract class b {
    public static final r9.c a(f fVar) {
        p.e(fVar, "<this>");
        if (fVar instanceof c) {
            return ((c) fVar).f22765b;
        }
        if (fVar instanceof v1) {
            return a(((v1) fVar).j());
        }
        return null;
    }

    public static final f b(aa.c cVar, f descriptor) {
        kotlinx.serialization.b bVarC;
        p.e(cVar, "<this>");
        p.e(descriptor, "descriptor");
        r9.c cVarA = a(descriptor);
        if (cVarA == null || (bVarC = aa.c.c(cVar, cVarA, null, 2, null)) == null) {
            return null;
        }
        return bVarC.getDescriptor();
    }

    public static final f c(f fVar, r9.c context) {
        p.e(fVar, "<this>");
        p.e(context, "context");
        return new c(fVar, context);
    }
}
