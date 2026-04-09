package F;

import L0.C3174d;
import Q0.AbstractC3434k;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public abstract class T {
    public static final int a(float f10) {
        return Math.round((float) Math.ceil(f10));
    }

    public static final S b(S s10, C3174d c3174d, L0.U u10, Y0.d dVar, AbstractC3434k.b bVar, boolean z10, int i10, int i11, int i12, List list) {
        if (!AbstractC6492s.d(s10.k(), c3174d) || !AbstractC6492s.d(s10.j(), u10) || s10.i() != z10) {
            return new S(c3174d, u10, i11, i12, z10, i10, dVar, bVar, list, null);
        }
        if (!W0.t.e(s10.g(), i10)) {
            return new S(c3174d, u10, i11, i12, z10, i10, dVar, bVar, list, null);
        }
        if (s10.d() != i11) {
            return new S(c3174d, u10, i11, i12, z10, i10, dVar, bVar, list, null);
        }
        if (s10.e() == i12 && AbstractC6492s.d(s10.a(), dVar)) {
            if (AbstractC6492s.d(s10.h(), list) && s10.b() == bVar) {
                return s10;
            }
            return new S(c3174d, u10, i11, i12, z10, i10, dVar, bVar, list, null);
        }
        return new S(c3174d, u10, i11, i12, z10, i10, dVar, bVar, list, null);
    }
}
