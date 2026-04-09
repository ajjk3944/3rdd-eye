package r;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public abstract class r {
    public static final C7538m a(float f10) {
        return new C7538m(f10);
    }

    public static final C7539n b(float f10, float f11) {
        return new C7539n(f10, f11);
    }

    public static final C7540o c(float f10, float f11, float f12) {
        return new C7540o(f10, f11, f12);
    }

    public static final C7541p d(float f10, float f11, float f12, float f13) {
        return new C7541p(f10, f11, f12, f13);
    }

    public static final AbstractC7542q e(AbstractC7542q abstractC7542q) {
        AbstractC7542q abstractC7542qG = g(abstractC7542q);
        int iB = abstractC7542qG.b();
        for (int i10 = 0; i10 < iB; i10++) {
            abstractC7542qG.e(i10, abstractC7542q.a(i10));
        }
        return abstractC7542qG;
    }

    public static final void f(AbstractC7542q abstractC7542q, AbstractC7542q abstractC7542q2) {
        int iB = abstractC7542q.b();
        for (int i10 = 0; i10 < iB; i10++) {
            abstractC7542q.e(i10, abstractC7542q2.a(i10));
        }
    }

    public static final AbstractC7542q g(AbstractC7542q abstractC7542q) {
        AbstractC7542q abstractC7542qC = abstractC7542q.c();
        AbstractC6492s.g(abstractC7542qC, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return abstractC7542qC;
    }
}
