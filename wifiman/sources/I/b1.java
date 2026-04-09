package I;

import l0.C6533i;
import m0.AbstractC6713l0;

/* loaded from: classes.dex */
public abstract class b1 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f8155a = Y0.h.j(2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6533i d(Y0.d dVar, C6533i c6533i, boolean z10, int i10) {
        return C6533i.d(c6533i, z10 ? i10 - c6533i.l() : c6533i.k(), 0.0f, (z10 ? i10 - c6533i.l() : c6533i.k()) + dVar.x1(f8155a), 0.0f, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(AbstractC6713l0 abstractC6713l0) {
        return ((abstractC6713l0 instanceof m0.j1) && ((m0.j1) abstractC6713l0).b() == 16) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(float f10) {
        if (Float.isNaN(f10) || Float.isInfinite(f10)) {
            return f10;
        }
        return (float) (f10 > 0.0f ? Math.ceil(f10) : Math.floor(f10));
    }
}
