package w;

import java.util.List;
import l0.C6531g;
import y0.C8593n;
import y0.C8604y;

/* renamed from: w.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8239F {
    public static final long a(C8593n c8593n, boolean z10) {
        long jC = C6531g.f52335b.c();
        List listC = c8593n.c();
        int size = listC.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            C8604y c8604y = (C8604y) listC.get(i11);
            if (c8604y.i() && c8604y.l()) {
                jC = C6531g.r(jC, z10 ? c8604y.h() : c8604y.k());
                i10++;
            }
        }
        return i10 == 0 ? C6531g.f52335b.b() : C6531g.h(jC, i10);
    }

    public static final float b(C8593n c8593n, boolean z10) {
        long jA = a(c8593n, z10);
        float fK = 0.0f;
        if (C6531g.j(jA, C6531g.f52335b.b())) {
            return 0.0f;
        }
        List listC = c8593n.c();
        int size = listC.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            C8604y c8604y = (C8604y) listC.get(i11);
            if (c8604y.i() && c8604y.l()) {
                fK += C6531g.k(C6531g.q(z10 ? c8604y.h() : c8604y.k(), jA));
                i10++;
            }
        }
        return fK / i10;
    }

    public static final float c(C8593n c8593n) {
        float fB = b(c8593n, true);
        float fB2 = b(c8593n, false);
        if (fB == 0.0f || fB2 == 0.0f) {
            return 1.0f;
        }
        return fB / fB2;
    }
}
