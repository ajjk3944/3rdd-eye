package b1;

import b1.AbstractC4052i;

/* loaded from: classes.dex */
public interface v {
    static /* synthetic */ void a(v vVar, AbstractC4052i.b bVar, float f10, float f11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkTo-VpY3zN4");
        }
        if ((i10 & 2) != 0) {
            f10 = Y0.h.j(0);
        }
        if ((i10 & 4) != 0) {
            f11 = Y0.h.j(0);
        }
        vVar.b(bVar, f10, f11);
    }

    void b(AbstractC4052i.b bVar, float f10, float f11);
}
