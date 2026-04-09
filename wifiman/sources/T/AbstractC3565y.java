package T;

import b0.e;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: T.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3565y {
    public static final boolean a(A0 a02, AbstractC3557u abstractC3557u) {
        AbstractC6492s.g(abstractC3557u, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        return a02.containsKey(abstractC3557u);
    }

    public static final Object b(A0 a02, AbstractC3557u abstractC3557u) {
        AbstractC6492s.g(abstractC3557u, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Object objA = a02.get(abstractC3557u);
        if (objA == null) {
            objA = abstractC3557u.a();
        }
        return ((F1) objA).a(a02);
    }

    public static final A0 c(I0[] i0Arr, A0 a02, A0 a03) {
        e.a aVarX = b0.f.a().c();
        for (I0 i02 : i0Arr) {
            AbstractC3557u abstractC3557uB = i02.b();
            AbstractC6492s.g(abstractC3557uB, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            H0 h02 = (H0) abstractC3557uB;
            if (i02.a() || !a(a02, h02)) {
                F1 f12 = (F1) a03.get(h02);
                AbstractC6492s.g(i02, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
                aVarX.put(h02, h02.b(i02, f12));
            }
        }
        return aVarX.g();
    }

    public static /* synthetic */ A0 d(I0[] i0Arr, A0 a02, A0 a03, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            a03 = b0.f.a();
        }
        return c(i0Arr, a02, a03);
    }
}
