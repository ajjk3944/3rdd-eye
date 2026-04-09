package j4;

import java.io.IOException;
import o4.C2762a;
import o4.C2764c;

/* renamed from: j4.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2565A extends g4.z {
    @Override // g4.z
    public final Object b(C2762a c2762a) {
        if (c2762a.B() != 9) {
            return Double.valueOf(c2762a.s());
        }
        c2762a.x();
        return null;
    }

    @Override // g4.z
    public final void c(C2764c c2764c, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            c2764c.o();
        } else {
            c2764c.t(number.doubleValue());
        }
    }
}
