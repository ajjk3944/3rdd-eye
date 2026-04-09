package Q0;

import android.graphics.Typeface;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
final class L implements I {
    private final Typeface c(String str, A a10, int i10) {
        if (v.f(i10, v.f19100b.b()) && AbstractC6492s.d(a10, A.f18971b.e()) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iC = AbstractC3428e.c(a10, i10);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iC) : Typeface.create(str, iC);
    }

    private final Typeface d(String str, A a10, int i10) {
        if (str.length() == 0) {
            return null;
        }
        Typeface typefaceC = c(str, a10, i10);
        if (AbstractC6492s.d(typefaceC, Typeface.create(Typeface.DEFAULT, AbstractC3428e.c(a10, i10))) || AbstractC6492s.d(typefaceC, c(null, a10, i10))) {
            return null;
        }
        return typefaceC;
    }

    @Override // Q0.I
    public Typeface a(E e10, A a10, int i10) {
        Typeface typefaceD = d(M.b(e10.e(), a10), a10, i10);
        return typefaceD == null ? c(e10.e(), a10, i10) : typefaceD;
    }

    @Override // Q0.I
    public Typeface b(A a10, int i10) {
        return c(null, a10, i10);
    }
}
