package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.types.checker.f;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import pi.u0;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6506a {
    public static final u0 a(boolean z10, boolean z11, b typeSystemContext, f kotlinTypePreparator, g kotlinTypeRefiner) {
        AbstractC6492s.i(typeSystemContext, "typeSystemContext");
        AbstractC6492s.i(kotlinTypePreparator, "kotlinTypePreparator");
        AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new u0(z10, z11, true, typeSystemContext, kotlinTypePreparator, kotlinTypeRefiner);
    }

    public static /* synthetic */ u0 b(boolean z10, boolean z11, b bVar, f fVar, g gVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            bVar = s.f52171a;
        }
        if ((i10 & 8) != 0) {
            fVar = f.a.f52145a;
        }
        if ((i10 & 16) != 0) {
            gVar = g.a.f52146a;
        }
        return a(z10, z11, bVar, fVar, gVar);
    }
}
