package pi;

import kotlin.jvm.internal.AbstractC6492s;
import pi.q0;

/* loaded from: classes4.dex */
public abstract class s0 {
    public static final r0 a(r0 r0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h newAnnotations) {
        r0 r0VarU;
        AbstractC6492s.i(r0Var, "<this>");
        AbstractC6492s.i(newAnnotations, "newAnnotations");
        if (AbstractC7372t.a(r0Var) == newAnnotations) {
            return r0Var;
        }
        C7371s c7371sB = AbstractC7372t.b(r0Var);
        if (c7371sB != null && (r0VarU = r0Var.u(c7371sB)) != null) {
            r0Var = r0VarU;
        }
        return (newAnnotations.iterator().hasNext() || !newAnnotations.isEmpty()) ? r0Var.s(new C7371s(newAnnotations)) : r0Var;
    }

    public static final r0 b(kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar) {
        AbstractC6492s.i(hVar, "<this>");
        return q0.a.a(C7376x.f58188a, hVar, null, null, 6, null);
    }
}
