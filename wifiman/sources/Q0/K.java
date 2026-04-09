package Q0;

import Q0.v;
import android.graphics.Typeface;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
final class K implements I {
    private final Typeface c(String str, A a10, int i10) {
        v.a aVar = v.f19100b;
        if (v.f(i10, aVar.b()) && AbstractC6492s.d(a10, A.f18971b.e()) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), a10.p(), v.f(i10, aVar.a()));
    }

    @Override // Q0.I
    public Typeface a(E e10, A a10, int i10) {
        return c(e10.e(), a10, i10);
    }

    @Override // Q0.I
    public Typeface b(A a10, int i10) {
        return c(null, a10, i10);
    }
}
